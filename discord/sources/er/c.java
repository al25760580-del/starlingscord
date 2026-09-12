package er;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Continuation[] f8669a = new Continuation[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a5.h f8670b = new a5.h("NULL", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a5.h f8671c = new a5.h("UNINITIALIZED", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a5.h f8672d = new a5.h("DONE", 2);

    public static /* synthetic */ Flow a(s sVar, CoroutineContext coroutineContext, int i7, cr.a aVar, int i10) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f14681d;
        }
        if ((i10 & 2) != 0) {
            i7 = -3;
        }
        if ((i10 & 4) != 0) {
            aVar = cr.a.f7342d;
        }
        return sVar.a(coroutineContext, i7, aVar);
    }

    public static final Object b(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, Continuation frame) {
        Object objC = fr.x.c(coroutineContext, obj2);
        try {
            z zVar = new z(frame, coroutineContext);
            Object objC2 = function2 == null ? wn.f.c(function2, obj, zVar) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(obj, zVar);
            fr.x.a(coroutineContext, objC);
            if (objC2 == wn.a.f22354d) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return objC2;
        } catch (Throwable th2) {
            fr.x.a(coroutineContext, objC);
            throw th2;
        }
    }
}
