package po;

import kotlin.Result;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    static {
        Object objO;
        try {
            rn.q qVar = Result.f14614e;
            objO = Class.forName("java.lang.ClassValue");
        } catch (Throwable th2) {
            rn.q qVar2 = Result.f14614e;
            objO = ib.a.o(th2);
        }
        if (!(objO instanceof rn.r)) {
            objO = Boolean.TRUE;
        }
        Object obj = Boolean.FALSE;
        if (objO instanceof rn.r) {
            objO = obj;
        }
    }

    public static final io.sentry.internal.debugmeta.c a(Function1 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        return new io.sentry.internal.debugmeta.c(compute);
    }
}
