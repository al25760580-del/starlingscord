package wn;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends xn.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f22359e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Continuation f22360i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Continuation continuation, Continuation continuation2, Function2 function2) {
        super(continuation);
        this.f22359e = function2;
        this.f22360i = continuation2;
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f22358d;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f22358d = 2;
            ib.a.L(obj);
            return obj;
        }
        this.f22358d = 1;
        ib.a.L(obj);
        Function2 function2 = this.f22359e;
        Intrinsics.checkNotNull(function2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        return ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(this.f22360i, this);
    }
}
