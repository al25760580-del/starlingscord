package n;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class o implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f16194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f16195b;

    public o(q qVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f16195b = qVar;
        this.f16194a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f16194a.onMenuItemActionCollapse(this.f16195b.h(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f16194a.onMenuItemActionExpand(this.f16195b.h(menuItem));
    }
}
