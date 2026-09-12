package so;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f20348e;

    public /* synthetic */ j(k kVar, int i7) {
        this.f20347d = i7;
        this.f20348e = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20347d) {
            case 0:
                return p.f20402l.a(this.f20348e.f20352d);
            default:
                return p.f20402l.a(this.f20348e.f20353e);
        }
    }
}
