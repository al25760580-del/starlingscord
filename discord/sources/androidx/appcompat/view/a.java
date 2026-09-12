package androidx.appcompat.view;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.n;
import i.q;
import java.lang.ref.WeakReference;
import m.e;
import n.h;
import n.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ActionMode implements h {
    public j E;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f771i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ActionBarContextView f772v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public q f773w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public WeakReference f774x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f775y;

    @Override // n.h
    public final void R(j jVar) {
        g();
        n nVar = this.f772v.f806v;
        if (nVar != null) {
            nVar.n();
        }
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void a() {
        if (this.f775y) {
            return;
        }
        this.f775y = true;
        this.f773w.a(this);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final View b() {
        WeakReference weakReference = this.f774x;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final j c() {
        return this.E;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final MenuInflater d() {
        return new e(this.f772v.getContext());
    }

    @Override // androidx.appcompat.view.ActionMode
    public final CharSequence e() {
        return this.f772v.getSubtitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public final CharSequence f() {
        return this.f772v.getTitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void g() {
        this.f773w.c(this, this.E);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final boolean h() {
        return this.f772v.P;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void i(View view) {
        this.f772v.setCustomView(view);
        this.f774x = view != null ? new WeakReference(view) : null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void j(int i7) {
        k(this.f771i.getString(i7));
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void k(CharSequence charSequence) {
        this.f772v.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void l(int i7) {
        m(this.f771i.getString(i7));
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void m(CharSequence charSequence) {
        this.f772v.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void n(boolean z5) {
        this.f764e = z5;
        this.f772v.setTitleOptional(z5);
    }

    @Override // n.h
    public final boolean o(j jVar, MenuItem menuItem) {
        return this.f773w.f11255a.d(this, menuItem);
    }
}
