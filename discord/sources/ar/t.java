package ar;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z5) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) coroutineContext.Y(bool, new s(0))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) coroutineContext2.Y(bool, new s(0))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return coroutineContext.n(coroutineContext2);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = coroutineContext2;
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f14681d;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.Y(gVar, new s(1));
        if (zBooleanValue2) {
            objectRef.element = ((CoroutineContext) objectRef.element).Y(gVar, new s(2));
        }
        return coroutineContext3.n((CoroutineContext) objectRef.element);
    }

    public static final CoroutineContext b(CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextA = a(coroutineScope.getCoroutineContext(), coroutineContext, true);
        hr.e eVar = k0.f2938a;
        return (coroutineContextA == eVar || coroutineContextA.l(kotlin.coroutines.d.k) != null) ? coroutineContextA : coroutineContextA.n(eVar);
    }

    public static final y1 c(Continuation continuation, CoroutineContext coroutineContext, Object obj) {
        y1 y1Var = null;
        if ((continuation instanceof CoroutineStackFrame) && coroutineContext.l(z1.f2992d) != null) {
            CoroutineStackFrame callerFrame = (CoroutineStackFrame) continuation;
            while (!(callerFrame instanceof h0) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof y1) {
                    y1Var = (y1) callerFrame;
                    break;
                }
            }
            if (y1Var != null) {
                y1Var.r0(coroutineContext, obj);
            }
        }
        return y1Var;
    }
}
