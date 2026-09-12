package eq;

import kotlin.collections.d0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f8651e;

    public /* synthetic */ r(s sVar, int i7) {
        this.f8650d = i7;
        this.f8651e = sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f8650d) {
            case 0:
                jq.j jVar = this.f8651e.f8653b;
                return d0.g(mf.f.l(jVar), mf.f.m(jVar));
            default:
                s sVar = this.f8651e;
                return sVar.f8654c ? d0.h(mf.f.k(sVar.f8653b)) : n0.f14659d;
        }
    }
}
