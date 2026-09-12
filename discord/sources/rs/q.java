package rs;

import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f19596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q f19601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q f19602g;

    public q() {
        this.f19596a = new byte[8192];
        this.f19600e = true;
        this.f19599d = false;
    }

    public final q a() {
        q qVar = this.f19601f;
        if (qVar == this) {
            qVar = null;
        }
        q qVar2 = this.f19602g;
        Intrinsics.checkNotNull(qVar2);
        qVar2.f19601f = this.f19601f;
        q qVar3 = this.f19601f;
        Intrinsics.checkNotNull(qVar3);
        qVar3.f19602g = this.f19602g;
        this.f19601f = null;
        this.f19602g = null;
        return qVar;
    }

    public final void b(q segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f19602g = this;
        segment.f19601f = this.f19601f;
        q qVar = this.f19601f;
        Intrinsics.checkNotNull(qVar);
        qVar.f19602g = segment;
        this.f19601f = segment;
    }

    public final q c() {
        this.f19599d = true;
        return new q(this.f19596a, this.f19597b, this.f19598c, true, false);
    }

    public final void d(q sink, int i7) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        boolean z5 = sink.f19600e;
        byte[] bArr = sink.f19596a;
        if (!z5) {
            throw new IllegalStateException("only owner can write");
        }
        int i10 = sink.f19598c;
        int i11 = i10 + i7;
        if (i11 > 8192) {
            if (sink.f19599d) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.f19597b;
            if (i11 - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            w.c(0, i12, i10, bArr, bArr);
            sink.f19598c -= sink.f19597b;
            sink.f19597b = 0;
        }
        int i13 = sink.f19598c;
        int i14 = this.f19597b;
        w.c(i13, i14, i14 + i7, this.f19596a, bArr);
        sink.f19598c += i7;
        this.f19597b += i7;
    }

    public q(byte[] data, int i7, int i10, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f19596a = data;
        this.f19597b = i7;
        this.f19598c = i10;
        this.f19599d = z5;
        this.f19600e = z6;
    }
}
