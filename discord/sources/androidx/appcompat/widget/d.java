package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f927e;

    public /* synthetic */ d(ActionBarOverlayLayout actionBarOverlayLayout, int i7) {
        this.f926d = i7;
        this.f927e = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f926d) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f927e;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.T = actionBarOverlayLayout.f817v.animate().translationY(0.0f).setListener(actionBarOverlayLayout.U);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f927e;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.T = actionBarOverlayLayout2.f817v.animate().translationY(-actionBarOverlayLayout2.f817v.getHeight()).setListener(actionBarOverlayLayout2.U);
                break;
        }
    }
}
