package sm;

import android.util.Log;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.y0;
import com.facebook.react.uimanager.ThemedReactContext;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends CoordinatorLayout implements y0 {
    public final WeakReference U;
    public FragmentManager V;
    public final ArrayList W;
    public final ArrayList a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ArrayList f20289b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final q8.c f20290c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ArrayList f20291d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ThemedReactContext context, WeakReference delegate) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.U = delegate;
        this.W = new ArrayList();
        this.a0 = new ArrayList();
        this.f20289b0 = new ArrayList();
        this.f20290c0 = new q8.c();
        this.f20291d0 = new ArrayList();
        o9.d dVar = rm.b.f19459a;
        o9.d dVar2 = rm.b.f19459a;
        int i7 = dVar2.f17185e;
        int i10 = i7 + 2;
        dVar2.f17185e = i10;
        if (i10 % 10 == 1) {
            dVar2.f17185e = i7 + 4;
        }
        setId(i7);
    }

    private final boolean getHasPendingOperations() {
        return (this.f20289b0.isEmpty() && this.a0.isEmpty()) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        i iVar;
        String message = "StackContainer [" + getId() + "] attached to window";
        Intrinsics.checkNotNullParameter("StackContainer", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        super.onAttachedToWindow();
        FragmentManager fragmentManagerA = rm.a.a(this);
        if (fragmentManagerA == null) {
            throw new IllegalStateException("[RNScreens] Nullish fragment manager - can't run container operations");
        }
        fragmentManagerA.f2052n.add(this);
        this.V = fragmentManagerA;
        if (isAttachedToWindow()) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            if ((getMeasuredWidth() != 0 || getMeasuredHeight() != 0 || isLaidOut()) && !isLaidOut() && !isInLayout() && (iVar = (i) getParent()) != null) {
                j jVar = (j) iVar;
                int measuredWidth = jVar.getMeasuredWidth();
                g gVar = jVar.f20293e;
                if (measuredWidth != gVar.getMeasuredWidth() || jVar.getMeasuredHeight() != gVar.getMeasuredHeight()) {
                    gVar.measure(View.MeasureSpec.makeMeasureSpec(jVar.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(jVar.getMeasuredHeight(), 1073741824));
                }
                gVar.layout(jVar.getLeft(), jVar.getTop(), jVar.getRight(), jVar.getBottom());
            }
        }
        u();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        FragmentManager fragmentManager = this.V;
        if (fragmentManager == null) {
            throw new IllegalStateException("[RNScreens] Attempt to use nullish FragmentManager");
        }
        fragmentManager.f2052n.remove(this);
        this.V = null;
    }

    public final void t(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (!(fragment instanceof tm.i)) {
            Log.w("StackContainer", "[RNScreens] Unexpected type of fragment: ".concat(fragment.getClass().getSimpleName()));
            return;
        }
        tm.i iVar = (tm.i) fragment;
        if (iVar.isRemoving()) {
            if (((h) this.U.get()) != null) {
                tm.f stackScreen = iVar.f20847d;
                Intrinsics.checkNotNullParameter(stackScreen, "stackScreen");
                if (stackScreen.getActivityMode() == tm.d.f20835e) {
                    stackScreen.setNativelyDismissed$react_native_screens_release(true);
                }
            }
            ArrayList arrayList = this.W;
            if (arrayList.contains(fragment)) {
                if (!arrayList.remove(iVar)) {
                    throw new IllegalArgumentException("[RNScreens] onNativeFragmentPop must be called with the fragment present in stack model");
                }
                if (arrayList.isEmpty()) {
                    throw new IllegalStateException("[RNScreens] Stack model should not be empty after a native pop");
                }
                FragmentManager fragmentManager = this.V;
                if (fragmentManager == null) {
                    throw new IllegalStateException("[RNScreens] Attempt to use nullish FragmentManager");
                }
                if (fragmentManager.f2064z == iVar) {
                    throw new IllegalStateException("[RNScreens] Primary navigation fragment not updated by native pop");
                }
                v();
            }
        }
    }

    public final void u() {
        ArrayList arrayList;
        Object next;
        tm.i iVar;
        if (getHasPendingOperations() && isAttachedToWindow()) {
            FragmentManager fragmentManager = this.V;
            if (fragmentManager == null) {
                throw new IllegalStateException("[RNScreens] Attempt to use nullish FragmentManager");
            }
            ArrayList ops = this.f20291d0;
            ops.clear();
            if (getHasPendingOperations()) {
                ops.add(new c(new f(0, this)));
            }
            ArrayList arrayList2 = this.a0;
            Iterator it = arrayList2.iterator();
            do {
                boolean zHasNext = it.hasNext();
                arrayList = this.W;
                if (!zHasNext) {
                    ArrayList arrayList3 = this.f20289b0;
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        tm.f fVar = ((e) it2.next()).f20286h;
                        tm.i iVar2 = new tm.i(fVar);
                        Log.d("StackContainer", "Created Fragment " + iVar2 + " for screen " + fVar.getScreenKey());
                        ops.add(new a(iVar2, getId(), arrayList.isEmpty() ^ true));
                        arrayList.add(iVar2);
                    }
                    if (arrayList.isEmpty()) {
                        throw new IllegalStateException("[RNScreens] Stack should never be empty after updates");
                    }
                    arrayList2.clear();
                    arrayList3.clear();
                    q8.c cVar = this.f20290c0;
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
                    Intrinsics.checkNotNullParameter(ops, "ops");
                    Iterator it3 = ops.iterator();
                    while (it3.hasNext()) {
                        ((b) it3.next()).a(fragmentManager, cVar);
                    }
                    Log.d("StackContainer", "StackContainer [" + getId() + "] MODEL BEGIN");
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        Log.d("StackContainer", String.valueOf(((tm.i) it4.next()).f20847d.getScreenKey()));
                    }
                    return;
                }
                d dVar = (d) it.next();
                Iterator it5 = arrayList.iterator();
                do {
                    if (!it5.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it5.next();
                } while (((tm.i) next).f20847d != dVar.f20285h);
                if (next == null) {
                    throw new IllegalStateException("[RNScreens] Unable to find a fragment to pop");
                }
                iVar = (tm.i) next;
                if (arrayList.size() <= 1) {
                    throw new IllegalStateException("[RNScreens] Attempt to pop last screen from the stack");
                }
                ops.add(new c(iVar));
            } while (arrayList.remove(d0.f(arrayList)) == iVar);
            throw new IllegalStateException("[RNScreens] Attempt to pop non-top screen");
        }
    }

    public final void v() {
        FragmentManager fragmentManager = this.V;
        if (fragmentManager == null) {
            throw new IllegalStateException("[RNScreens] Attempt to use nullish FragmentManager");
        }
        List listF = fragmentManager.f2043c.f();
        Intrinsics.checkNotNullExpressionValue(listF, "getFragments(...)");
        ArrayList<tm.i> arrayList = new ArrayList();
        for (Object obj : listF) {
            if (obj instanceof tm.i) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("[RNScreens] Empty fragment manager while attempting to update top fragment");
        }
        for (tm.i iVar : arrayList) {
            if (iVar.f20849i) {
                iVar.f20849i = false;
                tm.b bVar = iVar.f20848e;
                if (bVar == null) {
                    throw new IllegalStateException("[RNScreens] Attempt to require nullish OnBackPressedCallback");
                }
                bVar.f20833e = false;
                bVar.a();
            }
        }
        tm.i iVar2 = (tm.i) CollectionsKt.Q(arrayList);
        if (!iVar2.f20849i) {
            iVar2.f20849i = true;
            tm.b bVar2 = iVar2.f20848e;
            if (bVar2 == null) {
                throw new IllegalStateException("[RNScreens] Attempt to require nullish OnBackPressedCallback");
            }
            bVar2.f20833e = true;
            bVar2.a();
        }
        if (fragmentManager.f2064z != CollectionsKt.Q(arrayList)) {
            throw new IllegalStateException("[RNScreens] Top fragment different from primary navigation fragment");
        }
    }
}
