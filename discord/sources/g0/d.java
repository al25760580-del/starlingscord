package g0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d implements m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f9438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f9439e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i f9440i;

    public d(m measurable, h minMax, i widthHeight) {
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Intrinsics.checkNotNullParameter(minMax, "minMax");
        Intrinsics.checkNotNullParameter(widthHeight, "widthHeight");
        this.f9438d = measurable;
        this.f9439e = minMax;
        this.f9440i = widthHeight;
    }

    @Override // g0.m
    public final int a(int i7) {
        return this.f9438d.a(i7);
    }

    @Override // g0.m
    public final int e(int i7) {
        return this.f9438d.e(i7);
    }

    @Override // g0.m
    public final int f(int i7) {
        return this.f9438d.f(i7);
    }

    @Override // g0.m
    public final t h(long j) {
        i iVar = this.f9440i;
        i iVar2 = i.f9444d;
        h hVar = h.f9442e;
        h hVar2 = this.f9439e;
        m mVar = this.f9438d;
        if (iVar == iVar2) {
            return new e(hVar2 == hVar ? mVar.f(m0.a.a(j)) : mVar.e(m0.a.a(j)), m0.a.a(j));
        }
        return new e(m0.a.b(j), hVar2 == hVar ? mVar.a(m0.a.b(j)) : mVar.n(m0.a.b(j)));
    }

    @Override // g0.m
    public final int n(int i7) {
        return this.f9438d.n(i7);
    }
}
