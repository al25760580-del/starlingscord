package qd;

import com.google.android.exoplayer2.Format;
import ei.e0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends m implements pd.h {
    public final n E;

    public k(Format format, e0 e0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(format, e0Var, nVar, arrayList, list, list2);
        this.E = nVar;
    }

    @Override // pd.h
    public final long A(long j, long j5) {
        return this.E.b(j, j5);
    }

    @Override // qd.m
    public final String a() {
        return null;
    }

    @Override // pd.h
    public final long b(long j) {
        return this.E.g(j);
    }

    @Override // qd.m
    public final j d() {
        return null;
    }

    @Override // pd.h
    public final long e(long j, long j5) {
        return this.E.e(j, j5);
    }

    @Override // pd.h
    public final long i(long j, long j5) {
        return this.E.c(j, j5);
    }

    @Override // pd.h
    public final long j(long j, long j5) {
        n nVar = this.E;
        if (nVar.f18768f != null) {
            return -9223372036854775807L;
        }
        long jB = nVar.b(j, j5) + nVar.c(j, j5);
        return (nVar.e(jB, j) + nVar.g(jB)) - nVar.f18771i;
    }

    @Override // pd.h
    public final j k(long j) {
        return this.E.h(this, j);
    }

    @Override // pd.h
    public final long p(long j, long j5) {
        return this.E.f(j, j5);
    }

    @Override // pd.h
    public final boolean v() {
        return this.E.i();
    }

    @Override // pd.h
    public final long w() {
        return this.E.f18766d;
    }

    @Override // pd.h
    public final long z(long j) {
        return this.E.d(j);
    }

    @Override // qd.m
    public final pd.h c() {
        return this;
    }
}
