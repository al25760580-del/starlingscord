package er;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends xn.c implements FlowCollector {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FlowCollector f8714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CoroutineContext f8715e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f8716i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CoroutineContext f8717v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Continuation f8718w;

    public v(FlowCollector flowCollector, CoroutineContext coroutineContext) {
        super(t.f8711d, kotlin.coroutines.g.f14681d);
        this.f8714d = flowCollector;
        this.f8715e = coroutineContext;
        this.f8716i = ((Number) coroutineContext.Y(0, new ar.s(18))).intValue();
    }

    public final Object a(Continuation continuation, Object obj) {
        CoroutineContext context = continuation.getContext();
        ar.b0.l(context);
        CoroutineContext coroutineContext = this.f8717v;
        if (coroutineContext != context) {
            if (coroutineContext instanceof q) {
                throw new IllegalStateException(kotlin.text.r.b("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((q) coroutineContext).f8710e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.Y(0, new com.discord.chat.input.views.a(8, this))).intValue() != this.f8716i) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f8715e + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f8717v = context;
        }
        this.f8718w = continuation;
        Function3 function3 = x.f8720a;
        FlowCollector flowCollector = this.f8714d;
        Intrinsics.checkNotNull(flowCollector, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = function3.invoke(flowCollector, obj, this);
        if (!Intrinsics.areEqual(objInvoke, wn.a.f22354d)) {
            this.f8718w = null;
        }
        return objInvoke;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation frame) {
        try {
            Object objA = a(frame, obj);
            wn.a aVar = wn.a.f22354d;
            if (objA == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return objA == aVar ? objA : Unit.f14616a;
        } catch (Throwable th2) {
            this.f8717v = new q(th2, frame.getContext());
            throw th2;
        }
    }

    @Override // xn.a, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f8718w;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // xn.c, kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.f8717v;
        return coroutineContext == null ? kotlin.coroutines.g.f14681d : coroutineContext;
    }

    @Override // xn.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        Throwable thA = Result.a(obj);
        if (thA != null) {
            this.f8717v = new q(thA, getContext());
        }
        Continuation continuation = this.f8718w;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        return wn.a.f22354d;
    }
}
