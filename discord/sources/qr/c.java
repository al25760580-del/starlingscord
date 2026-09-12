package qr;

import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f18999a;

    static {
        Object objO;
        try {
            rn.q qVar = Result.f14614e;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
            objO = StringsKt.toIntOrNull(property);
        } catch (Throwable th2) {
            rn.q qVar2 = Result.f14614e;
            objO = ib.a.o(th2);
        }
        if (objO instanceof rn.r) {
            objO = null;
        }
        Integer num = (Integer) objO;
        f18999a = num != null ? num.intValue() : 2097152;
    }
}
