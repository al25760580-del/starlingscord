package vo;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final up.c f21807e;

    public /* synthetic */ f0(up.c cVar, int i7) {
        this.f21806d = i7;
        this.f21807e = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f21806d) {
            case 0:
                up.c it = (up.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.f21262a.c() && Intrinsics.areEqual(it.b(), this.f21807e));
            default:
                wo.h it2 = (wo.h) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2.z(this.f21807e);
        }
    }
}
