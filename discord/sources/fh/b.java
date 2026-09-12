package fh;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f9166e;

    public /* synthetic */ b(d dVar, int i7) {
        this.f9165d = i7;
        this.f9166e = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9165d) {
            case 0:
                d dVar = this.f9166e;
                if (dVar.f9174w > 0) {
                    SystemClock.uptimeMillis();
                }
                dVar.setVisibility(0);
                break;
            default:
                d dVar2 = this.f9166e;
                ((o) dVar2.getCurrentDrawable()).d(false, false, true);
                if ((dVar2.getProgressDrawable() == null || !dVar2.getProgressDrawable().isVisible()) && (dVar2.getIndeterminateDrawable() == null || !dVar2.getIndeterminateDrawable().isVisible())) {
                    dVar2.setVisibility(4);
                }
                dVar2.getClass();
                break;
        }
    }
}
