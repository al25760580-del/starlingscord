package ip;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f13372e;

    public /* synthetic */ o(p pVar, int i7) {
        this.f13371d = i7;
        this.f13372e = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        up.e it = (up.e) obj;
        switch (this.f13371d) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f13372e.N(it);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f13372e.O(it);
        }
    }
}
