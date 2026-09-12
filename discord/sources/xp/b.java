package xp;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vo.b f22996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vo.b f22997e;

    public b(vo.b bVar, vo.b bVar2) {
        this.f22996d = bVar;
        this.f22997e = bVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.areEqual((vo.l) obj, this.f22996d) && Intrinsics.areEqual((vo.l) obj2, this.f22997e));
    }
}
