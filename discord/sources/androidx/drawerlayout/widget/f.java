package androidx.drawerlayout.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout.ViewDragCallback f1990d;

    public f(DrawerLayout.ViewDragCallback viewDragCallback) {
        this.f1990d = viewDragCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View viewFindDrawerWithGravity;
        int width;
        DrawerLayout.ViewDragCallback viewDragCallback = this.f1990d;
        DrawerLayout drawerLayout = DrawerLayout.this;
        int i7 = viewDragCallback.f1975b.f1804o;
        int i10 = viewDragCallback.f1974a;
        boolean z5 = i10 == 3;
        if (z5) {
            viewFindDrawerWithGravity = drawerLayout.findDrawerWithGravity(3);
            width = (viewFindDrawerWithGravity != null ? -viewFindDrawerWithGravity.getWidth() : 0) + i7;
        } else {
            viewFindDrawerWithGravity = drawerLayout.findDrawerWithGravity(5);
            width = drawerLayout.getWidth() - i7;
        }
        if (viewFindDrawerWithGravity != null) {
            if (((!z5 || viewFindDrawerWithGravity.getLeft() >= width) && (z5 || viewFindDrawerWithGravity.getLeft() <= width)) || drawerLayout.getDrawerLockMode(viewFindDrawerWithGravity) != 0) {
                return;
            }
            d dVar = (d) viewFindDrawerWithGravity.getLayoutParams();
            viewDragCallback.f1975b.s(viewFindDrawerWithGravity, width, viewFindDrawerWithGravity.getTop());
            dVar.f1983c = true;
            drawerLayout.invalidate();
            View viewFindDrawerWithGravity2 = drawerLayout.findDrawerWithGravity(i10 == 3 ? 5 : 3);
            if (viewFindDrawerWithGravity2 != null) {
                drawerLayout.closeDrawer(viewFindDrawerWithGravity2);
            }
            drawerLayout.cancelChildViewTouch();
        }
    }
}
