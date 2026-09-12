package l4;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f14909e;

    public /* synthetic */ s(v vVar, int i7) {
        this.f14908d = i7;
        this.f14909e = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14908d) {
            case 0:
                Drawable drawable = this.f14909e;
                Drawable.Callback callback = drawable.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                    return;
                }
                return;
            default:
                v vVar = this.f14909e;
                Semaphore semaphore = vVar.f14925j0;
                t4.c cVar = vVar.N;
                if (cVar == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    cVar.s(vVar.f14919e.d());
                    if (v.f14912p0 && vVar.h0) {
                        if (vVar.f14926k0 == null) {
                            vVar.f14926k0 = new Handler(Looper.getMainLooper());
                            vVar.f14927l0 = new s(vVar, 0);
                        }
                        vVar.f14926k0.post(vVar.f14927l0);
                    }
                    break;
                } catch (InterruptedException unused) {
                } finally {
                    semaphore.release();
                }
                return;
        }
    }
}
