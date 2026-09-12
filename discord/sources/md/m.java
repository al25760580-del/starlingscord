package md;

import com.google.android.exoplayer2.Timeline;
import gc.u1;
import gc.v1;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends j {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Object f15661w = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f15662i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f15663v;

    public m(Timeline timeline, Object obj, Object obj2) {
        super(timeline);
        this.f15662i = obj;
        this.f15663v = obj2;
    }

    @Override // md.j, com.google.android.exoplayer2.Timeline
    public final int b(Object obj) {
        Object obj2;
        if (f15661w.equals(obj) && (obj2 = this.f15663v) != null) {
            obj = obj2;
        }
        return this.f15635e.b(obj);
    }

    @Override // md.j, com.google.android.exoplayer2.Timeline
    public final u1 f(int i7, u1 u1Var, boolean z5) {
        this.f15635e.f(i7, u1Var, z5);
        if (je.e0.a(u1Var.f9887e, this.f15663v) && z5) {
            u1Var.f9887e = f15661w;
        }
        return u1Var;
    }

    @Override // md.j, com.google.android.exoplayer2.Timeline
    public final Object l(int i7) {
        Object objL = this.f15635e.l(i7);
        return je.e0.a(objL, this.f15663v) ? f15661w : objL;
    }

    @Override // md.j, com.google.android.exoplayer2.Timeline
    public final v1 m(int i7, v1 v1Var, long j) {
        this.f15635e.m(i7, v1Var, j);
        if (je.e0.a(v1Var.f9909d, this.f15662i)) {
            v1Var.f9909d = v1.O;
        }
        return v1Var;
    }
}
