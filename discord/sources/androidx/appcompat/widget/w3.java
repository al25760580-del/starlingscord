package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class w3 extends ls.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1157b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1160e;

    public w3(x3 x3Var, int i7) {
        super(1);
        this.f1160e = x3Var;
        this.f1159d = i7;
        this.f1158c = false;
    }

    @Override // ls.d, androidx.core.view.d1
    public void a() {
        switch (this.f1157b) {
            case 0:
                this.f1158c = true;
                break;
        }
    }

    @Override // ls.d, androidx.core.view.d1
    public final void d() {
        switch (this.f1157b) {
            case 0:
                ((x3) this.f1160e).f1164a.setVisibility(0);
                break;
            default:
                if (!this.f1158c) {
                    this.f1158c = true;
                    androidx.core.view.d1 d1Var = ((m.f) this.f1160e).f15337d;
                    if (d1Var != null) {
                        d1Var.d();
                    }
                    break;
                }
                break;
        }
    }

    @Override // androidx.core.view.d1
    public final void onAnimationEnd() {
        switch (this.f1157b) {
            case 0:
                if (!this.f1158c) {
                    ((x3) this.f1160e).f1164a.setVisibility(this.f1159d);
                }
                break;
            default:
                int i7 = this.f1159d + 1;
                this.f1159d = i7;
                m.f fVar = (m.f) this.f1160e;
                if (i7 == fVar.f15334a.size()) {
                    androidx.core.view.d1 d1Var = fVar.f15337d;
                    if (d1Var != null) {
                        d1Var.onAnimationEnd();
                    }
                    this.f1159d = 0;
                    this.f1158c = false;
                    fVar.f15338e = false;
                }
                break;
        }
    }

    public w3(m.f fVar) {
        super(1);
        this.f1160e = fVar;
        this.f1158c = false;
        this.f1159d = 0;
    }
}
