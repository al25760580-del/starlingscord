package app.rive.core;

import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import jr.b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import rn.n;
import xn.c;
import xn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u001c\u0010\u0003\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004¢\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00028\u0000H\u0086@¢\u0006\u0002\u0010\rR&\u0010\u0003\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lapp/rive/core/SuspendLazy;", "T", "", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "result", "Lapp/rive/core/DeferredResult;", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSuspendLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendLazy.kt\napp/rive/core/SuspendLazy\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,55:1\n116#2,10:56\n*S KotlinDebug\n*F\n+ 1 SuspendLazy.kt\napp/rive/core/SuspendLazy\n*L\n35#1:56,10\n*E\n"})
public final class SuspendLazy<T> {
    public static final int $stable = 8;

    @NotNull
    private final Function1<Continuation, Object> block;

    @NotNull
    private final Mutex mutex;

    @NotNull
    private volatile DeferredResult<? extends T> result;

    /* JADX INFO: renamed from: app.rive.core.SuspendLazy$await$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @d(c = "app.rive.core.SuspendLazy", f = "SuspendLazy.kt", l = {ChatViewRecyclerTypes.GIFT_INTENT, ChatViewRecyclerTypes.FORWARD_HEADER}, m = "await")
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SuspendLazy<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SuspendLazy<T> suspendLazy, Continuation continuation) {
            super(continuation);
            this.this$0 = suspendLazy;
        }

        @Override // xn.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.await(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuspendLazy(@NotNull Function1<? super Continuation, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.block = block;
        this.result = DeferredResult.Uninitialized.INSTANCE;
        this.mutex = new b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object await(@NotNull Continuation continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Mutex mutex;
        SuspendLazy<T> suspendLazy;
        Mutex mutex2;
        Throwable th2;
        SuspendLazy<T> suspendLazy2;
        Object value;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i7 = anonymousClass1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i7 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, continuation);
        }
        Object obj = anonymousClass1.result;
        wn.a aVar = wn.a.f22354d;
        int i10 = anonymousClass1.label;
        try {
            if (i10 == 0) {
                ib.a.L(obj);
                DeferredResult<? extends T> deferredResult = this.result;
                if (deferredResult instanceof DeferredResult.Success) {
                    return ((DeferredResult.Success) deferredResult).getValue();
                }
                if (deferredResult instanceof DeferredResult.Failure) {
                    throw ((DeferredResult.Failure) deferredResult).getError();
                }
                if (!Intrinsics.areEqual(deferredResult, DeferredResult.Uninitialized.INSTANCE)) {
                    throw new n();
                }
                mutex = this.mutex;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = mutex;
                anonymousClass1.label = 1;
                if (mutex.a(anonymousClass1) != aVar) {
                    suspendLazy = this;
                }
                return aVar;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) anonymousClass1.L$1;
                suspendLazy2 = (SuspendLazy) anonymousClass1.L$0;
                try {
                    ib.a.L(obj);
                    suspendLazy2.result = new DeferredResult.Success(obj);
                    value = obj;
                    mutex = mutex2;
                    mutex.b(null);
                    return value;
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        suspendLazy2.result = new DeferredResult.Failure(th2);
                        throw th2;
                    } catch (Throwable th4) {
                        th = th4;
                        mutex = mutex2;
                        mutex.b(null);
                        throw th;
                    }
                }
            }
            Mutex mutex3 = (Mutex) anonymousClass1.L$1;
            suspendLazy = (SuspendLazy) anonymousClass1.L$0;
            ib.a.L(obj);
            mutex = mutex3;
            DeferredResult<? extends T> deferredResult2 = suspendLazy.result;
            if (!(deferredResult2 instanceof DeferredResult.Success)) {
                if (deferredResult2 instanceof DeferredResult.Failure) {
                    throw ((DeferredResult.Failure) deferredResult2).getError();
                }
                if (!Intrinsics.areEqual(deferredResult2, DeferredResult.Uninitialized.INSTANCE)) {
                    throw new n();
                }
                try {
                    Function1<Continuation, Object> function1 = suspendLazy.block;
                    anonymousClass1.L$0 = suspendLazy;
                    anonymousClass1.L$1 = mutex;
                    anonymousClass1.label = 2;
                    Object objInvoke = function1.invoke(anonymousClass1);
                    if (objInvoke != aVar) {
                        mutex2 = mutex;
                        obj = objInvoke;
                        suspendLazy2 = suspendLazy;
                        suspendLazy2.result = new DeferredResult.Success(obj);
                        value = obj;
                        mutex = mutex2;
                    }
                    return aVar;
                } catch (Throwable th5) {
                    mutex2 = mutex;
                    th2 = th5;
                    suspendLazy2 = suspendLazy;
                    suspendLazy2.result = new DeferredResult.Failure(th2);
                    throw th2;
                }
            }
            value = ((DeferredResult.Success) deferredResult2).getValue();
            mutex.b(null);
            return value;
        } catch (Throwable th6) {
            th = th6;
            mutex.b(null);
            throw th;
        }
    }
}
