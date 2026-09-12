package m3;

import androidx.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public final class y extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Transition f15460b;

    public /* synthetic */ y() {
        this.f15459a = 1;
    }

    @Override // m3.u, m3.s
    public void onTransitionCancel(Transition transition) {
        switch (this.f15459a) {
            case 0:
                z zVar = (z) this.f15460b;
                zVar.f15461d0.remove(transition);
                if (!zVar.u()) {
                    zVar.A(zVar, t.f15449o, false);
                    zVar.P = true;
                    zVar.A(zVar, t.f15448n, false);
                }
                break;
            default:
                super.onTransitionCancel(transition);
                break;
        }
    }

    @Override // m3.u, m3.s
    public void onTransitionEnd(Transition transition) {
        switch (this.f15459a) {
            case 1:
                z zVar = (z) this.f15460b;
                int i7 = zVar.f15463f0 - 1;
                zVar.f15463f0 = i7;
                if (i7 == 0) {
                    zVar.f15464g0 = false;
                    zVar.n();
                }
                transition.D(this);
                break;
            case 2:
                this.f15460b.G();
                transition.D(this);
                break;
        }
    }

    @Override // m3.u, m3.s
    public void onTransitionStart(Transition transition) {
        switch (this.f15459a) {
            case 1:
                z zVar = (z) this.f15460b;
                if (!zVar.f15464g0) {
                    zVar.O();
                    zVar.f15464g0 = true;
                }
                break;
            default:
                super.onTransitionStart(transition);
                break;
        }
    }

    public /* synthetic */ y(Transition transition, int i7) {
        this.f15459a = i7;
        this.f15460b = transition;
    }
}
