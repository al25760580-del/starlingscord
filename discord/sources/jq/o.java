package jq;

import kotlin.collections.f1;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f14039e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r f14040i;

    public /* synthetic */ o(q qVar, r rVar, int i7) {
        this.f14038d = i7;
        this.f14039e = qVar;
        this.f14040i = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f14038d) {
            case 0:
                return f1.d(this.f14039e.f14045a.keySet(), this.f14040i.o());
            default:
                return f1.d(this.f14039e.f14046b.keySet(), this.f14040i.p());
        }
    }
}
