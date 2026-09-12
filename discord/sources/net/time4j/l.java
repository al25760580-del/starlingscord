package net.time4j;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements xr.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f16658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16659b;

    public l(m mVar, int i7) {
        this.f16658a = mVar;
        this.f16659b = i7;
    }

    @Override // xr.s
    public final Object a(xr.e eVar, long j) {
        u uVar = x0.J;
        return eVar.h(uVar, x0.r(this.f16658a, (x0) eVar.d(uVar), j, this.f16659b));
    }
}
