package i;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends ActionMode implements n.h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f11218i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final n.j f11219v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public q f11220w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public WeakReference f11221x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j0 f11222y;

    public i0(j0 j0Var, Context context, q qVar) {
        this.f11222y = j0Var;
        this.f11218i = context;
        this.f11220w = qVar;
        n.j jVar = new n.j(context);
        jVar.f16151l = 1;
        this.f11219v = jVar;
        jVar.f16146e = this;
    }

    @Override // n.h
    public final void R(n.j jVar) {
        if (this.f11220w == null) {
            return;
        }
        g();
        androidx.appcompat.widget.n nVar = this.f11222y.f11232f.f806v;
        if (nVar != null) {
            nVar.n();
        }
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void a() {
        j0 j0Var = this.f11222y;
        if (j0Var.f11235i != this) {
            return;
        }
        if (j0Var.f11240p) {
            j0Var.j = this;
            j0Var.k = this.f11220w;
        } else {
            this.f11220w.a(this);
        }
        this.f11220w = null;
        j0Var.t(false);
        ActionBarContextView actionBarContextView = j0Var.f11232f;
        if (actionBarContextView.H == null) {
            actionBarContextView.e();
        }
        j0Var.f11229c.setHideOnContentScrollEnabled(j0Var.f11245u);
        j0Var.f11235i = null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final View b() {
        WeakReference weakReference = this.f11221x;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final n.j c() {
        return this.f11219v;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final MenuInflater d() {
        return new m.e(this.f11218i);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final CharSequence e() {
        return this.f11222y.f11232f.getSubtitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public final CharSequence f() {
        return this.f11222y.f11232f.getTitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void g() {
        if (this.f11222y.f11235i != this) {
            return;
        }
        n.j jVar = this.f11219v;
        jVar.w();
        try {
            this.f11220w.c(this, jVar);
        } finally {
            jVar.v();
        }
    }

    @Override // androidx.appcompat.view.ActionMode
    public final boolean h() {
        return this.f11222y.f11232f.P;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void i(View view) {
        this.f11222y.f11232f.setCustomView(view);
        this.f11221x = new WeakReference(view);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void j(int i7) {
        k(this.f11222y.f11227a.getResources().getString(i7));
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void k(CharSequence charSequence) {
        this.f11222y.f11232f.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void l(int i7) {
        m(this.f11222y.f11227a.getResources().getString(i7));
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void m(CharSequence charSequence) {
        this.f11222y.f11232f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void n(boolean z5) {
        this.f764e = z5;
        this.f11222y.f11232f.setTitleOptional(z5);
    }

    @Override // n.h
    public final boolean o(n.j jVar, MenuItem menuItem) {
        q qVar = this.f11220w;
        if (qVar != null) {
            return qVar.f11255a.d(this, menuItem);
        }
        return false;
    }
}
