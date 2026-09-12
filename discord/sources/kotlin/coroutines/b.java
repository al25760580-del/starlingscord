package kotlin.coroutines;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f14677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f14678e;

    public b(f baseKey, Function1 safeCast) {
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        this.f14677d = safeCast;
        this.f14678e = baseKey instanceof b ? ((b) baseKey).f14678e : baseKey;
    }
}
