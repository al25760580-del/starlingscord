package k2;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14245a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f14246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f14247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f14248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14250f;

    public o(r rVar) {
        this.f14246b = rVar;
        this.f14247c = rVar;
    }

    public final void a() {
        this.f14245a = 1;
        this.f14247c = this.f14246b;
        this.f14250f = 0;
    }

    public final boolean b() {
        l2.a aVarB = this.f14247c.f14260b.b();
        int iA = aVarB.a(6);
        return !(iA == 0 || ((ByteBuffer) aVarB.f1674v).get(iA + aVarB.f1671d) == 0) || this.f14249e == 65039;
    }
}
