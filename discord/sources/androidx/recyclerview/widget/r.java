package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class r extends l1 {
    private static final boolean DEBUG = false;
    private static TimeInterpolator sDefaultInterpolator;
    ArrayList<RecyclerView.ViewHolder> mAddAnimations;
    ArrayList<ArrayList<RecyclerView.ViewHolder>> mAdditionsList;
    ArrayList<RecyclerView.ViewHolder> mChangeAnimations;
    ArrayList<ArrayList<DefaultItemAnimator$ChangeInfo>> mChangesList;
    ArrayList<RecyclerView.ViewHolder> mMoveAnimations;
    ArrayList<ArrayList<q>> mMovesList;
    private ArrayList<RecyclerView.ViewHolder> mPendingAdditions;
    private ArrayList<DefaultItemAnimator$ChangeInfo> mPendingChanges;
    private ArrayList<q> mPendingMoves;
    private ArrayList<RecyclerView.ViewHolder> mPendingRemovals;
    ArrayList<RecyclerView.ViewHolder> mRemoveAnimations;

    public r() {
        this.mSupportsChangeAnimations = true;
        this.mPendingRemovals = new ArrayList<>();
        this.mPendingAdditions = new ArrayList<>();
        this.mPendingMoves = new ArrayList<>();
        this.mPendingChanges = new ArrayList<>();
        this.mAdditionsList = new ArrayList<>();
        this.mMovesList = new ArrayList<>();
        this.mChangesList = new ArrayList<>();
        this.mAddAnimations = new ArrayList<>();
        this.mMoveAnimations = new ArrayList<>();
        this.mRemoveAnimations = new ArrayList<>();
        this.mChangeAnimations = new ArrayList<>();
    }

    public final void a(RecyclerView.ViewHolder viewHolder, List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            DefaultItemAnimator$ChangeInfo defaultItemAnimator$ChangeInfo = (DefaultItemAnimator$ChangeInfo) list.get(size);
            if (b(defaultItemAnimator$ChangeInfo, viewHolder) && defaultItemAnimator$ChangeInfo.f2450a == null && defaultItemAnimator$ChangeInfo.f2451b == null) {
                list.remove(defaultItemAnimator$ChangeInfo);
            }
        }
    }

    @Override // androidx.recyclerview.widget.l1
    public boolean animateAdd(RecyclerView.ViewHolder viewHolder) {
        c(viewHolder);
        viewHolder.itemView.setAlpha(0.0f);
        this.mPendingAdditions.add(viewHolder);
        return true;
    }

    public void animateAddImpl(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.mAddAnimations.add(viewHolder);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(getAddDuration()).setListener(new m(view, viewPropertyAnimatorAnimate, this, viewHolder)).start();
    }

    @Override // androidx.recyclerview.widget.l1
    public boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i7, int i10, int i11, int i12) {
        if (viewHolder == viewHolder2) {
            return animateMove(viewHolder, i7, i10, i11, i12);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        c(viewHolder);
        int i13 = (int) ((i11 - i7) - translationX);
        int i14 = (int) ((i12 - i10) - translationY);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        if (viewHolder2 != null) {
            c(viewHolder2);
            viewHolder2.itemView.setTranslationX(-i13);
            viewHolder2.itemView.setTranslationY(-i14);
            viewHolder2.itemView.setAlpha(0.0f);
        }
        ArrayList<DefaultItemAnimator$ChangeInfo> arrayList = this.mPendingChanges;
        DefaultItemAnimator$ChangeInfo defaultItemAnimator$ChangeInfo = new DefaultItemAnimator$ChangeInfo();
        defaultItemAnimator$ChangeInfo.f2450a = viewHolder;
        defaultItemAnimator$ChangeInfo.f2451b = viewHolder2;
        defaultItemAnimator$ChangeInfo.f2452c = i7;
        defaultItemAnimator$ChangeInfo.f2453d = i10;
        defaultItemAnimator$ChangeInfo.f2454e = i11;
        defaultItemAnimator$ChangeInfo.f2455f = i12;
        arrayList.add(defaultItemAnimator$ChangeInfo);
        return true;
    }

    public void animateChangeImpl(DefaultItemAnimator$ChangeInfo defaultItemAnimator$ChangeInfo) {
        RecyclerView.ViewHolder viewHolder = defaultItemAnimator$ChangeInfo.f2450a;
        View view = viewHolder == null ? null : viewHolder.itemView;
        RecyclerView.ViewHolder viewHolder2 = defaultItemAnimator$ChangeInfo.f2451b;
        View view2 = viewHolder2 != null ? viewHolder2.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(defaultItemAnimator$ChangeInfo.f2450a);
            duration.translationX(defaultItemAnimator$ChangeInfo.f2454e - defaultItemAnimator$ChangeInfo.f2452c);
            duration.translationY(defaultItemAnimator$ChangeInfo.f2455f - defaultItemAnimator$ChangeInfo.f2453d);
            duration.alpha(0.0f).setListener(new o(this, defaultItemAnimator$ChangeInfo, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.mChangeAnimations.add(defaultItemAnimator$ChangeInfo.f2451b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new p(this, defaultItemAnimator$ChangeInfo, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    @Override // androidx.recyclerview.widget.l1
    public boolean animateMove(RecyclerView.ViewHolder viewHolder, int i7, int i10, int i11, int i12) {
        View view = viewHolder.itemView;
        int translationX = i7 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) viewHolder.itemView.getTranslationY());
        c(viewHolder);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            dispatchMoveFinished(viewHolder);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        ArrayList<q> arrayList = this.mPendingMoves;
        q qVar = new q();
        qVar.f2670a = viewHolder;
        qVar.f2671b = translationX;
        qVar.f2672c = translationY;
        qVar.f2673d = i11;
        qVar.f2674e = i12;
        arrayList.add(qVar);
        return true;
    }

    public void animateMoveImpl(RecyclerView.ViewHolder viewHolder, int i7, int i10, int i11, int i12) {
        View view = viewHolder.itemView;
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        if (i13 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i14 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.mMoveAnimations.add(viewHolder);
        viewPropertyAnimatorAnimate.setDuration(getMoveDuration()).setListener(new n(this, viewHolder, i13, view, i14, viewPropertyAnimatorAnimate)).start();
    }

    @Override // androidx.recyclerview.widget.l1
    public boolean animateRemove(RecyclerView.ViewHolder viewHolder) {
        c(viewHolder);
        this.mPendingRemovals.add(viewHolder);
        return true;
    }

    public final boolean b(DefaultItemAnimator$ChangeInfo defaultItemAnimator$ChangeInfo, RecyclerView.ViewHolder viewHolder) {
        boolean z5 = false;
        if (defaultItemAnimator$ChangeInfo.f2451b == viewHolder) {
            defaultItemAnimator$ChangeInfo.f2451b = null;
        } else {
            if (defaultItemAnimator$ChangeInfo.f2450a != viewHolder) {
                return false;
            }
            defaultItemAnimator$ChangeInfo.f2450a = null;
            z5 = true;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(viewHolder, z5);
        return true;
    }

    public final void c(RecyclerView.ViewHolder viewHolder) {
        if (sDefaultInterpolator == null) {
            sDefaultInterpolator = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull List<Object> list) {
        return !list.isEmpty() || canReuseUpdatedViewHolder(viewHolder);
    }

    public void cancelAll(List<RecyclerView.ViewHolder> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    public void dispatchFinishedWhenDone() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    @SuppressLint({"UnknownNullness"})
    public void endAnimation(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        view.animate().cancel();
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.mPendingMoves.get(size).f2670a == viewHolder) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(viewHolder);
                this.mPendingMoves.remove(size);
            }
        }
        a(viewHolder, this.mPendingChanges);
        if (this.mPendingRemovals.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(viewHolder);
        }
        if (this.mPendingAdditions.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
        }
        for (int size2 = this.mChangesList.size() - 1; size2 >= 0; size2--) {
            ArrayList<DefaultItemAnimator$ChangeInfo> arrayList = this.mChangesList.get(size2);
            a(viewHolder, arrayList);
            if (arrayList.isEmpty()) {
                this.mChangesList.remove(size2);
            }
        }
        for (int size3 = this.mMovesList.size() - 1; size3 >= 0; size3--) {
            ArrayList<q> arrayList2 = this.mMovesList.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (arrayList2.get(size4).f2670a == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(viewHolder);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.mMovesList.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.mAdditionsList.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.ViewHolder> arrayList3 = this.mAdditionsList.get(size5);
            if (arrayList3.remove(viewHolder)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(viewHolder);
                if (arrayList3.isEmpty()) {
                    this.mAdditionsList.remove(size5);
                }
            }
        }
        this.mRemoveAnimations.remove(viewHolder);
        this.mAddAnimations.remove(viewHolder);
        this.mChangeAnimations.remove(viewHolder);
        this.mMoveAnimations.remove(viewHolder);
        dispatchFinishedWhenDone();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimations() {
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            q qVar = this.mPendingMoves.get(size);
            View view = qVar.f2670a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(qVar.f2670a);
            this.mPendingMoves.remove(size);
        }
        for (int size2 = this.mPendingRemovals.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.mPendingRemovals.get(size2));
            this.mPendingRemovals.remove(size2);
        }
        int size3 = this.mPendingAdditions.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.ViewHolder viewHolder = this.mPendingAdditions.get(size3);
            viewHolder.itemView.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
            this.mPendingAdditions.remove(size3);
        }
        for (int size4 = this.mPendingChanges.size() - 1; size4 >= 0; size4--) {
            DefaultItemAnimator$ChangeInfo defaultItemAnimator$ChangeInfo = this.mPendingChanges.get(size4);
            RecyclerView.ViewHolder viewHolder2 = defaultItemAnimator$ChangeInfo.f2450a;
            if (viewHolder2 != null) {
                b(defaultItemAnimator$ChangeInfo, viewHolder2);
            }
            RecyclerView.ViewHolder viewHolder3 = defaultItemAnimator$ChangeInfo.f2451b;
            if (viewHolder3 != null) {
                b(defaultItemAnimator$ChangeInfo, viewHolder3);
            }
        }
        this.mPendingChanges.clear();
        if (isRunning()) {
            for (int size5 = this.mMovesList.size() - 1; size5 >= 0; size5--) {
                ArrayList<q> arrayList = this.mMovesList.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    q qVar2 = arrayList.get(size6);
                    View view2 = qVar2.f2670a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(qVar2.f2670a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.mMovesList.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.mAdditionsList.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.ViewHolder> arrayList2 = this.mAdditionsList.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.ViewHolder viewHolder4 = arrayList2.get(size8);
                    viewHolder4.itemView.setAlpha(1.0f);
                    dispatchAddFinished(viewHolder4);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.mAdditionsList.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.mChangesList.size() - 1; size9 >= 0; size9--) {
                ArrayList<DefaultItemAnimator$ChangeInfo> arrayList3 = this.mChangesList.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    DefaultItemAnimator$ChangeInfo defaultItemAnimator$ChangeInfo2 = arrayList3.get(size10);
                    RecyclerView.ViewHolder viewHolder5 = defaultItemAnimator$ChangeInfo2.f2450a;
                    if (viewHolder5 != null) {
                        b(defaultItemAnimator$ChangeInfo2, viewHolder5);
                    }
                    RecyclerView.ViewHolder viewHolder6 = defaultItemAnimator$ChangeInfo2.f2451b;
                    if (viewHolder6 != null) {
                        b(defaultItemAnimator$ChangeInfo2, viewHolder6);
                    }
                    if (arrayList3.isEmpty()) {
                        this.mChangesList.remove(arrayList3);
                    }
                }
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean isRunning() {
        return (this.mPendingAdditions.isEmpty() && this.mPendingChanges.isEmpty() && this.mPendingMoves.isEmpty() && this.mPendingRemovals.isEmpty() && this.mMoveAnimations.isEmpty() && this.mRemoveAnimations.isEmpty() && this.mAddAnimations.isEmpty() && this.mChangeAnimations.isEmpty() && this.mMovesList.isEmpty() && this.mAdditionsList.isEmpty() && this.mChangesList.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void runPendingAnimations() {
        boolean zIsEmpty = this.mPendingRemovals.isEmpty();
        boolean zIsEmpty2 = this.mPendingMoves.isEmpty();
        boolean zIsEmpty3 = this.mPendingChanges.isEmpty();
        boolean zIsEmpty4 = this.mPendingAdditions.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        for (RecyclerView.ViewHolder viewHolder : this.mPendingRemovals) {
            View view = viewHolder.itemView;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.mRemoveAnimations.add(viewHolder);
            viewPropertyAnimatorAnimate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new l(view, viewPropertyAnimatorAnimate, this, viewHolder)).start();
        }
        this.mPendingRemovals.clear();
        if (!zIsEmpty2) {
            ArrayList<q> arrayList = new ArrayList<>();
            arrayList.addAll(this.mPendingMoves);
            this.mMovesList.add(arrayList);
            this.mPendingMoves.clear();
            i iVar = new i(this, arrayList);
            if (zIsEmpty) {
                iVar.run();
            } else {
                View view2 = arrayList.get(0).f2670a.itemView;
                long removeDuration = getRemoveDuration();
                WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
                view2.postOnAnimationDelayed(iVar, removeDuration);
            }
        }
        if (!zIsEmpty3) {
            ArrayList<DefaultItemAnimator$ChangeInfo> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.mPendingChanges);
            this.mChangesList.add(arrayList2);
            this.mPendingChanges.clear();
            j jVar = new j(0, this, arrayList2);
            if (zIsEmpty) {
                jVar.run();
            } else {
                View view3 = arrayList2.get(0).f2450a.itemView;
                long removeDuration2 = getRemoveDuration();
                WeakHashMap weakHashMap2 = androidx.core.view.u0.f1729a;
                view3.postOnAnimationDelayed(jVar, removeDuration2);
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList<RecyclerView.ViewHolder> arrayList3 = new ArrayList<>();
        arrayList3.addAll(this.mPendingAdditions);
        this.mAdditionsList.add(arrayList3);
        this.mPendingAdditions.clear();
        k kVar = new k(this, arrayList3);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            kVar.run();
            return;
        }
        long jMax = Math.max(!zIsEmpty2 ? getMoveDuration() : 0L, zIsEmpty3 ? 0L : getChangeDuration()) + (!zIsEmpty ? getRemoveDuration() : 0L);
        View view4 = arrayList3.get(0).itemView;
        WeakHashMap weakHashMap3 = androidx.core.view.u0.f1729a;
        view4.postOnAnimationDelayed(kVar, jMax);
    }
}
