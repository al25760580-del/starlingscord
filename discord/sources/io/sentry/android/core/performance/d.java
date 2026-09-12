package io.sentry.android.core.performance;

import android.os.Handler;
import android.os.Looper;
import io.sentry.android.core.v;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f12375e;

    public /* synthetic */ d(f fVar, int i7) {
        this.f12374d = i7;
        this.f12375e = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12374d) {
            case 0:
                new Handler(Looper.getMainLooper()).post(new d(this.f12375e, 3));
                break;
            case 1:
                this.f12375e.c();
                break;
            case 2:
                this.f12375e.c();
                break;
            default:
                f fVar = this.f12375e;
                if (fVar.J.get() == 0) {
                    fVar.f12377e = false;
                    v vVar = fVar.E;
                    if (vVar != null && vVar.F.get()) {
                        fVar.E.close();
                        fVar.E = null;
                    }
                    io.sentry.android.core.g gVar = fVar.F;
                    if (gVar != null && gVar.F) {
                        gVar.a(true);
                        fVar.F = null;
                        break;
                    }
                }
                break;
        }
    }
}
