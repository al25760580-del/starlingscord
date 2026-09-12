package md;

import com.google.android.exoplayer2.Format;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements fe.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fe.p f15723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f15724b;

    public x(fe.p pVar, x0 x0Var) {
        this.f15723a = pVar;
        this.f15724b = x0Var;
    }

    @Override // fe.p
    public final boolean a(int i7, long j) {
        return this.f15723a.a(i7, j);
    }

    @Override // fe.p
    public final void b(long j, long j5, long j7, List list, od.m[] mVarArr) {
        this.f15723a.b(j, j5, j7, list, mVarArr);
    }

    @Override // fe.p
    public final x0 c() {
        return this.f15724b;
    }

    @Override // fe.p
    public final int d() {
        return this.f15723a.d();
    }

    @Override // fe.p
    public final void disable() {
        this.f15723a.disable();
    }

    @Override // fe.p
    public final void e(boolean z5) {
        this.f15723a.e(z5);
    }

    @Override // fe.p
    public final void enable() {
        this.f15723a.enable();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f15723a.equals(xVar.f15723a) && this.f15724b.equals(xVar.f15724b);
    }

    @Override // fe.p
    public final Format f(int i7) {
        return this.f15723a.f(i7);
    }

    @Override // fe.p
    public final int g(int i7) {
        return this.f15723a.g(i7);
    }

    @Override // fe.p
    public final int h(long j, List list) {
        return this.f15723a.h(j, list);
    }

    public final int hashCode() {
        return this.f15723a.hashCode() + ((this.f15724b.hashCode() + 527) * 31);
    }

    @Override // fe.p
    public final int i(Format format) {
        return this.f15723a.i(format);
    }

    @Override // fe.p
    public final boolean j(long j, od.e eVar, List list) {
        return this.f15723a.j(j, eVar, list);
    }

    @Override // fe.p
    public final int k() {
        return this.f15723a.k();
    }

    @Override // fe.p
    public final Format l() {
        return this.f15723a.l();
    }

    @Override // fe.p
    public final int length() {
        return this.f15723a.length();
    }

    @Override // fe.p
    public final int m() {
        return this.f15723a.m();
    }

    @Override // fe.p
    public final boolean n(int i7, long j) {
        return this.f15723a.n(i7, j);
    }

    @Override // fe.p
    public final void o(float f2) {
        this.f15723a.o(f2);
    }

    @Override // fe.p
    public final Object p() {
        return this.f15723a.p();
    }

    @Override // fe.p
    public final void q() {
        this.f15723a.q();
    }

    @Override // fe.p
    public final void r() {
        this.f15723a.r();
    }

    @Override // fe.p
    public final int s(int i7) {
        return this.f15723a.s(i7);
    }
}
