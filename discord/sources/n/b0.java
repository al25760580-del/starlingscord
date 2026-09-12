package n;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class b0 extends j implements SubMenu {
    public final l A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final j f16117z;

    public b0(Context context, j jVar, l lVar) {
        super(context);
        this.f16117z = jVar;
        this.A = lVar;
    }

    @Override // n.j
    public final boolean d(l lVar) {
        return this.f16117z.d(lVar);
    }

    @Override // n.j
    public final boolean e(j jVar, MenuItem menuItem) {
        return super.e(jVar, menuItem) || this.f16117z.e(jVar, menuItem);
    }

    @Override // n.j
    public final boolean f(l lVar) {
        return this.f16117z.f(lVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // n.j
    public final String j() {
        l lVar = this.A;
        int i7 = lVar != null ? lVar.f16167a : 0;
        if (i7 == 0) {
            return null;
        }
        return kk.b.h(i7, "android:menu:actionviewstates:");
    }

    @Override // n.j
    public final j k() {
        return this.f16117z.k();
    }

    @Override // n.j
    public final boolean m() {
        return this.f16117z.m();
    }

    @Override // n.j
    public final boolean n() {
        return this.f16117z.n();
    }

    @Override // n.j
    public final boolean o() {
        return this.f16117z.o();
    }

    @Override // n.j, android.view.Menu
    public final void setGroupDividerEnabled(boolean z5) {
        this.f16117z.setGroupDividerEnabled(z5);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // n.j, android.view.Menu
    public final void setQwertyMode(boolean z5) {
        this.f16117z.setQwertyMode(z5);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i7) {
        u(0, null, i7, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i7) {
        u(i7, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i7) {
        this.A.setIcon(i7);
        return this;
    }
}
