package md;

import com.google.android.exoplayer2.Timeline;
import gc.u1;
import gc.v1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j extends Timeline {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Timeline f15635e;

    public j(Timeline timeline) {
        this.f15635e = timeline;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int a(boolean z5) {
        return this.f15635e.a(z5);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int b(Object obj) {
        return this.f15635e.b(obj);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int c(boolean z5) {
        return this.f15635e.c(z5);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int e(int i7, int i10, boolean z5) {
        return this.f15635e.e(i7, i10, z5);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public u1 f(int i7, u1 u1Var, boolean z5) {
        return this.f15635e.f(i7, u1Var, z5);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int h() {
        return this.f15635e.h();
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int k(int i7, int i10, boolean z5) {
        return this.f15635e.k(i7, i10, z5);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Object l(int i7) {
        return this.f15635e.l(i7);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public v1 m(int i7, v1 v1Var, long j) {
        return this.f15635e.m(i7, v1Var, j);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int o() {
        return this.f15635e.o();
    }
}
