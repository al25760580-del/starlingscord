package k4;

import androidx.core.view.u0;
import java.util.WeakHashMap;
import l4.v;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l4.h f14281e;

    public /* synthetic */ d(l4.h hVar, int i7) {
        this.f14280d = i7;
        this.f14281e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f14280d;
        l4.f fVar = l4.f.f14845x;
        l4.h hVar = this.f14281e;
        switch (i7) {
            case 0:
                WeakHashMap weakHashMap = u0.f1729a;
                if (hVar.isAttachedToWindow()) {
                    hVar.F = false;
                    hVar.H.add(fVar);
                    v vVar = hVar.f14857w;
                    vVar.f14933x.clear();
                    vVar.f14919e.cancel();
                    if (!vVar.isVisible()) {
                        vVar.f14930o0 = 1;
                    }
                    hVar.setProgress(0.0f);
                }
                break;
            case 1:
                WeakHashMap weakHashMap2 = u0.f1729a;
                if (hVar.isAttachedToWindow()) {
                    hVar.H.add(fVar);
                    hVar.f14857w.n();
                }
                break;
            default:
                WeakHashMap weakHashMap3 = u0.f1729a;
                if (hVar.isAttachedToWindow()) {
                    hVar.F = false;
                    hVar.f14857w.k();
                }
                break;
        }
    }
}
