package po;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g1 f18087e;

    public /* synthetic */ e1(g1 g1Var, int i7) {
        this.f18086d = i7;
        this.f18087e = g1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18086d) {
            case 0:
                return new f1(this.f18087e);
            default:
                return this.f18087e.i();
        }
    }
}
