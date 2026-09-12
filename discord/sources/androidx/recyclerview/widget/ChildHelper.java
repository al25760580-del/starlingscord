package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ChildHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f2445a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f2449e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2448d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f2446b = new h(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2447c = new ArrayList();

    public ChildHelper(z0 z0Var) {
        this.f2445a = z0Var;
    }

    public final void a(View view, int i7, boolean z5) {
        RecyclerView recyclerView = this.f2445a.f2730a;
        int childCount = i7 < 0 ? recyclerView.getChildCount() : f(i7);
        this.f2446b.J(childCount, z5);
        if (z5) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        recyclerView.dispatchChildAttached(view);
    }

    public final void b(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z5) {
        RecyclerView recyclerView = this.f2445a.f2730a;
        int childCount = i7 < 0 ? recyclerView.getChildCount() : f(i7);
        this.f2446b.J(childCount, z5);
        if (z5) {
            i(view);
        }
        RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called attach on a child which is not detached: ");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(a3.e.i(recyclerView, sb2));
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "reAttach " + childViewHolderInt);
            }
            childViewHolderInt.clearTmpDetachFlag();
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            sb3.append(", index: ");
            sb3.append(childCount);
            throw new IllegalArgumentException(a3.e.i(recyclerView, sb3));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i7) {
        int iF = f(i7);
        this.f2446b.K(iF);
        RecyclerView recyclerView = this.f2445a.f2730a;
        View childAt = recyclerView.getChildAt(iF);
        if (childAt != null) {
            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                    sb2.append(childViewHolderInt);
                    throw new IllegalArgumentException(a3.e.i(recyclerView, sb2));
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "tmpDetach " + childViewHolderInt);
                }
                childViewHolderInt.addFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            }
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb3 = new StringBuilder("No view at offset ");
            sb3.append(iF);
            throw new IllegalArgumentException(a3.e.i(recyclerView, sb3));
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i7) {
        return this.f2445a.f2730a.getChildAt(f(i7));
    }

    public final int e() {
        return this.f2445a.f2730a.getChildCount() - this.f2447c.size();
    }

    public final int f(int i7) {
        if (i7 < 0) {
            return -1;
        }
        int childCount = this.f2445a.f2730a.getChildCount();
        int i10 = i7;
        while (i10 < childCount) {
            h hVar = this.f2446b;
            int iF = i7 - (i10 - hVar.F(i10));
            if (iF == 0) {
                while (hVar.H(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += iF;
        }
        return -1;
    }

    public final View g(int i7) {
        return this.f2445a.f2730a.getChildAt(i7);
    }

    public final int h() {
        return this.f2445a.f2730a.getChildCount();
    }

    public final void i(View view) {
        this.f2447c.add(view);
        RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(this.f2445a.f2730a);
        }
    }

    public final int j(View view) {
        int iIndexOfChild = this.f2445a.f2730a.indexOfChild(view);
        if (iIndexOfChild != -1) {
            h hVar = this.f2446b;
            if (!hVar.H(iIndexOfChild)) {
                return iIndexOfChild - hVar.F(iIndexOfChild);
            }
        }
        return -1;
    }

    public final void k(int i7) {
        z0 z0Var = this.f2445a;
        int i10 = this.f2448d;
        if (i10 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iF = f(i7);
            View childAt = z0Var.f2730a.getChildAt(iF);
            if (childAt != null) {
                this.f2448d = 1;
                this.f2449e = childAt;
                if (this.f2446b.K(iF)) {
                    l(childAt);
                }
                z0Var.a(iF);
            }
        } finally {
            this.f2448d = 0;
            this.f2449e = null;
        }
    }

    public final void l(View view) {
        RecyclerView.ViewHolder childViewHolderInt;
        if (!this.f2447c.remove(view) || (childViewHolderInt = RecyclerView.getChildViewHolderInt(view)) == null) {
            return;
        }
        childViewHolderInt.onLeftHiddenState(this.f2445a.f2730a);
    }

    public final String toString() {
        return this.f2446b.toString() + ", hidden list:" + this.f2447c.size();
    }
}
