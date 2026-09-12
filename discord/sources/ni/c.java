package ni;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f16934e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Runnable f16935i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f16936v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f16937w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f16938x;

    public /* synthetic */ c(e eVar, Runnable runnable, long j, long j5, TimeUnit timeUnit, int i7) {
        this.f16933d = i7;
        this.f16934e = eVar;
        this.f16935i = runnable;
        this.f16936v = j;
        this.f16937w = j5;
        this.f16938x = timeUnit;
    }

    @Override // ni.f
    public final ScheduledFuture a(u4.b bVar) {
        switch (this.f16933d) {
            case 0:
                e eVar = this.f16934e;
                return eVar.f16944e.scheduleAtFixedRate(new d(eVar, this.f16935i, bVar, 0), this.f16936v, this.f16937w, this.f16938x);
            default:
                e eVar2 = this.f16934e;
                return eVar2.f16944e.scheduleWithFixedDelay(new d(eVar2, this.f16935i, bVar, 2), this.f16936v, this.f16937w, this.f16938x);
        }
    }
}
