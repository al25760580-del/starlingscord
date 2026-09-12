package fp;

import kotlin.Pair;
import kotlin.collections.v0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zp.x;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f9344d = new g();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KProperty[] kPropertyArr = h.f9345g;
        up.e eVar = d.f9337a;
        Intrinsics.checkNotNullParameter("Deprecated in Java", "value");
        return v0.b(new Pair(eVar, new x((Object) "Deprecated in Java")));
    }
}
