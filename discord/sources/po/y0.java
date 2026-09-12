package po;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a1 f18195e;

    public /* synthetic */ y0(a1 a1Var, int i7) {
        this.f18194d = i7;
        this.f18195e = a1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18194d) {
            case 0:
                return new z0(this.f18195e);
            default:
                a1 a1Var = this.f18195e;
                return a1Var.j(a1Var.i(), null, null);
        }
    }
}
