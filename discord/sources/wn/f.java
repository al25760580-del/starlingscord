package wn;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class f {
    /* JADX WARN: Multi-variable type inference failed */
    public static Continuation a(Continuation continuation, Continuation completion, Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(completion, "completion");
        if (function2 instanceof xn.a) {
            return ((xn.a) function2).create(continuation, completion);
        }
        CoroutineContext context = completion.getContext();
        return context == g.f14681d ? new b(completion, continuation, function2) : new c(completion, context, function2, continuation);
    }

    public static Continuation b(Continuation continuation) {
        Continuation continuationIntercepted;
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        xn.c cVar = continuation instanceof xn.c ? (xn.c) continuation : null;
        return (cVar == null || (continuationIntercepted = cVar.intercepted()) == null) ? continuation : continuationIntercepted;
    }

    public static Object c(Function2 function2, Object obj, Continuation completion) {
        Object eVar;
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(completion, "completion");
        CoroutineContext context = completion.getContext();
        if (context == g.f14681d) {
            Intrinsics.checkNotNull(completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            eVar = new d(completion);
        } else {
            Intrinsics.checkNotNull(completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            eVar = new e(completion, context);
        }
        return ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(obj, eVar);
    }
}
