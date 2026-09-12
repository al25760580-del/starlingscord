package androidx.appcompat.widget;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r3 implements n.v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n.j f1096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n.l f1097e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Toolbar f1098i;

    public r3(Toolbar toolbar) {
        this.f1098i = toolbar;
    }

    @Override // n.v
    public final void a(boolean z5) {
        if (this.f1097e != null) {
            n.j jVar = this.f1096d;
            if (jVar != null) {
                int size = jVar.f16147f.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (this.f1096d.getItem(i7) == this.f1097e) {
                        return;
                    }
                }
            }
            k(this.f1097e);
        }
    }

    @Override // n.v
    public final void c(Context context, n.j jVar) {
        n.l lVar;
        n.j jVar2 = this.f1096d;
        if (jVar2 != null && (lVar = this.f1097e) != null) {
            jVar2.d(lVar);
        }
        this.f1096d = jVar;
    }

    @Override // n.v
    public final boolean d(n.b0 b0Var) {
        return false;
    }

    @Override // n.v
    public final boolean e() {
        return false;
    }

    @Override // n.v
    public final void f(Parcelable parcelable) {
    }

    @Override // n.v
    public final int getId() {
        return 0;
    }

    @Override // n.v
    public final boolean h(n.l lVar) {
        Toolbar toolbar = this.f1098i;
        toolbar.c();
        ViewParent parent = toolbar.E.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.E);
            }
            toolbar.addView(toolbar.E);
        }
        View actionView = lVar.getActionView();
        toolbar.F = actionView;
        this.f1097e = lVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.F);
            }
            s3 s3VarH = Toolbar.h();
            s3VarH.f1105a = (toolbar.K & 112) | 8388611;
            s3VarH.f1106b = 2;
            toolbar.F.setLayoutParams(s3VarH);
            toolbar.addView(toolbar.F);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((s3) childAt.getLayoutParams()).f1106b != 2 && childAt != toolbar.f865d) {
                toolbar.removeViewAt(childCount);
                toolbar.f868e0.add(childAt);
            }
        }
        toolbar.requestLayout();
        lVar.C = true;
        lVar.f16178n.p(false);
        KeyEvent.Callback callback = toolbar.F;
        if (callback instanceof m.a) {
            ((m.a) callback).onActionViewExpanded();
        }
        toolbar.v();
        return true;
    }

    @Override // n.v
    public final Parcelable i() {
        return null;
    }

    @Override // n.v
    public final boolean k(n.l lVar) {
        Toolbar toolbar = this.f1098i;
        KeyEvent.Callback callback = toolbar.F;
        if (callback instanceof m.a) {
            ((m.a) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.F);
        toolbar.removeView(toolbar.E);
        toolbar.F = null;
        ArrayList arrayList = toolbar.f868e0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f1097e = null;
        toolbar.requestLayout();
        lVar.C = false;
        lVar.f16178n.p(false);
        toolbar.v();
        return true;
    }

    @Override // n.v
    public final void b(n.j jVar, boolean z5) {
    }
}
