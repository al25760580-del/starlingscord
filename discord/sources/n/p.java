package n;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class p implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f16196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f16197b;

    public p(q qVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f16197b = qVar;
        this.f16196a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f16196a.onMenuItemClick(this.f16197b.h(menuItem));
    }
}
