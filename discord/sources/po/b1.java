package po;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d1 f18070e;

    public /* synthetic */ b1(d1 d1Var, int i7) {
        this.f18069d = i7;
        this.f18070e = d1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18069d) {
            case 0:
                return new c1(this.f18070e);
            default:
                return this.f18070e.i();
        }
    }
}
