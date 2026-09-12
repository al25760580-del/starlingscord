package gc;

import com.google.android.exoplayer2.Timeline;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 extends md.j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v1 f9781i;

    public m1(Timeline timeline) {
        super(timeline);
        this.f9781i = new v1();
    }

    @Override // md.j, com.google.android.exoplayer2.Timeline
    public final u1 f(int i7, u1 u1Var, boolean z5) {
        Timeline timeline = this.f15635e;
        u1 u1VarF = timeline.f(i7, u1Var, z5);
        if (timeline.m(u1VarF.f9888i, this.f9781i, 0L).a()) {
            u1VarF.i(u1Var.f9886d, u1Var.f9887e, u1Var.f9888i, u1Var.f9889v, u1Var.f9890w, nd.b.f16555x, true);
            return u1VarF;
        }
        u1VarF.f9891x = true;
        return u1VarF;
    }
}
