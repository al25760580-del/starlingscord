package fr;

import ar.r1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a5.h f9401a = new a5.h("NO_THREAD_ELEMENTS", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ar.s f9402b = new ar.s(22);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ar.s f9403c = new ar.s(23);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ar.s f9404d = new ar.s(24);

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == f9401a) {
            return;
        }
        if (!(obj instanceof z)) {
            Object objY = coroutineContext.Y(null, f9403c);
            Intrinsics.checkNotNull(objY, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            a3.e.x(objY);
            throw null;
        }
        z zVar = (z) obj;
        r1[] r1VarArr = zVar.f9409c;
        int length = r1VarArr.length - 1;
        if (length < 0) {
            return;
        }
        r1 r1Var = r1VarArr[length];
        Intrinsics.checkNotNull(null);
        Object obj2 = zVar.f9408b[length];
        throw null;
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object objY = coroutineContext.Y(0, f9402b);
        Intrinsics.checkNotNull(objY);
        return objY;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        if (obj == 0) {
            return f9401a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.Y(new z(((Number) obj).intValue(), coroutineContext), f9404d);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        a3.e.x(obj);
        throw null;
    }
}
