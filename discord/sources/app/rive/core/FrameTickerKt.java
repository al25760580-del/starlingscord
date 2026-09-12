package app.rive.core;

import android.view.Choreographer;
import ar.b0;
import ar.k;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import ls.l;
import org.jetbrains.annotations.NotNull;
import rn.q;
import wn.f;
import xn.c;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a(\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\u00070\tH\u0086@¢\u0006\u0002\u0010\u000b\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003¨\u0006\f"}, d2 = {"ChoreographerFrameTicker", "Lapp/rive/core/FrameTicker;", "getChoreographerFrameTicker", "()Lapp/rive/core/FrameTicker;", "ComposeFrameTicker", "getComposeFrameTicker", "withFrameNanosChoreographer", "R", "onFrame", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFrameTicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameTicker.kt\napp/rive/core/FrameTickerKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,49:1\n318#2,11:50\n*S KotlinDebug\n*F\n+ 1 FrameTicker.kt\napp/rive/core/FrameTickerKt\n*L\n37#1:50,11\n*E\n"})
public final class FrameTickerKt {

    @NotNull
    private static final FrameTicker ChoreographerFrameTicker = new FrameTicker() { // from class: app.rive.core.FrameTickerKt$ChoreographerFrameTicker$1
        @Override // app.rive.core.FrameTicker
        public final Object withFrame(@NotNull final Function1<? super Long, Unit> function1, @NotNull Continuation continuation) {
            Object objWithFrameNanosChoreographer = FrameTickerKt.withFrameNanosChoreographer(new Function1<Long, Unit>() { // from class: app.rive.core.FrameTickerKt$ChoreographerFrameTicker$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Number) obj).longValue());
                    return Unit.f14616a;
                }

                public final void invoke(long j) {
                    function1.invoke(Long.valueOf(j));
                }
            }, continuation);
            return objWithFrameNanosChoreographer == wn.a.f22354d ? objWithFrameNanosChoreographer : Unit.f14616a;
        }
    };

    @NotNull
    private static final FrameTicker ComposeFrameTicker = new FrameTicker() { // from class: app.rive.core.FrameTickerKt$ComposeFrameTicker$1

        /* JADX INFO: renamed from: app.rive.core.FrameTickerKt$ComposeFrameTicker$1$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @d(c = "app.rive.core.FrameTickerKt$ComposeFrameTicker$1$1", f = "FrameTicker.kt", l = {24}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ Function1<Long, Unit> $onFrame;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Function1<? super Long, Unit> function1, Continuation continuation) {
                super(2, continuation);
                this.$onFrame = function1;
            }

            @Override // xn.a
            @NotNull
            public final Continuation create(Object obj, @NotNull Continuation continuation) {
                return new AnonymousClass1(this.$onFrame, continuation);
            }

            @Override // xn.a
            public final Object invokeSuspend(@NotNull Object obj) {
                wn.a aVar = wn.a.f22354d;
                int i7 = this.label;
                if (i7 == 0) {
                    ib.a.L(obj);
                    final Function1<Long, Unit> function1 = this.$onFrame;
                    Function1<Long, Unit> function2 = new Function1<Long, Unit>() { // from class: app.rive.core.FrameTickerKt.ComposeFrameTicker.1.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            invoke(((Number) obj2).longValue());
                            return Unit.f14616a;
                        }

                        public final void invoke(long j) {
                            function1.invoke(Long.valueOf(j));
                        }
                    };
                    this.label = 1;
                    if (l.C(function2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                }
                return Unit.f14616a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
            }
        }

        @Override // app.rive.core.FrameTicker
        public final Object withFrame(@NotNull Function1<? super Long, Unit> function1, @NotNull Continuation continuation) throws Throwable {
            Object objA = b0.A((CoroutineContext) j0.d.J.getValue(), new AnonymousClass1(function1, null), continuation);
            return objA == wn.a.f22354d ? objA : Unit.f14616a;
        }
    };

    /* JADX INFO: renamed from: app.rive.core.FrameTickerKt$withFrameNanosChoreographer$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @d(c = "app.rive.core.FrameTickerKt", f = "FrameTicker.kt", l = {50}, m = "withFrameNanosChoreographer")
    public static final class AnonymousClass1<R> extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FrameTickerKt.withFrameNanosChoreographer(null, this);
        }
    }

    @NotNull
    public static final FrameTicker getChoreographerFrameTicker() {
        return ChoreographerFrameTicker;
    }

    @NotNull
    public static final FrameTicker getComposeFrameTicker() {
        return ComposeFrameTicker;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <R> Object withFrameNanosChoreographer(@NotNull Function1<? super Long, ? extends R> function1, @NotNull Continuation continuation) {
        AnonymousClass1 frame;
        if (continuation instanceof AnonymousClass1) {
            frame = (AnonymousClass1) continuation;
            int i7 = frame.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                frame.label = i7 - Integer.MIN_VALUE;
            } else {
                frame = new AnonymousClass1(continuation);
            }
        } else {
            frame = new AnonymousClass1(continuation);
        }
        Object objR = frame.result;
        wn.a aVar = wn.a.f22354d;
        int i10 = frame.label;
        if (i10 == 0) {
            ib.a.L(objR);
            frame.L$0 = function1;
            frame.label = 1;
            final k kVar = new k(1, f.b(frame));
            kVar.t();
            final Choreographer choreographer = Choreographer.getInstance();
            final Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: app.rive.core.FrameTickerKt$withFrameNanosChoreographer$frameTimeNs$1$onFrameCallback$1
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    Long lValueOf = Long.valueOf(j);
                    CancellableContinuation cancellableContinuation = kVar;
                    q qVar = Result.f14614e;
                    cancellableContinuation.resumeWith(lValueOf);
                }
            };
            choreographer.postFrameCallback(frameCallback);
            kVar.v(new Function1<Throwable, Unit>() { // from class: app.rive.core.FrameTickerKt$withFrameNanosChoreographer$frameTimeNs$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.f14616a;
                }

                public final void invoke(Throwable th2) {
                    choreographer.removeFrameCallback(frameCallback);
                }
            });
            objR = kVar.r();
            if (objR == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (objR == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (Function1) frame.L$0;
            ib.a.L(objR);
        }
        return function1.invoke(new Long(((Number) objR).longValue()));
    }
}
