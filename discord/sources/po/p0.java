package po;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u0 f18123e;

    public /* synthetic */ p0(u0 u0Var, int i7) {
        this.f18122d = i7;
        this.f18123e = u0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18122d) {
            case 0:
                return new s0(this.f18123e);
            default:
                return a5.l0.n(this.f18123e.f18163e);
        }
    }
}
