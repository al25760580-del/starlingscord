package app.rive;

import a3.e;
import android.os.Trace;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.j0;
import app.rive.core.ArtboardHandle;
import app.rive.core.FrameTicker;
import app.rive.core.StateMachineHandle;
import ar.b0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import xn.d;
import xn.h;
import yq.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@d(c = "app.rive.RiveCanvasSession$beginPlaying$4$renderLoop$1", f = "RiveCanvasSession.kt", l = {394}, m = "invokeSuspend")
public final class RiveCanvasSession$beginPlaying$4$renderLoop$1 extends h implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ FrameTicker $ticker;
    int label;
    final /* synthetic */ RiveCanvasSession this$0;

    /* JADX INFO: renamed from: app.rive.RiveCanvasSession$beginPlaying$4$renderLoop$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @d(c = "app.rive.RiveCanvasSession$beginPlaying$4$renderLoop$1$1", f = "RiveCanvasSession.kt", l = {403}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nRiveCanvasSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiveCanvasSession.kt\napp/rive/RiveCanvasSession$beginPlaying$4$renderLoop$1$1\n+ 2 RiveLog.kt\napp/rive/RiveLog\n*L\n1#1,607:1\n57#2:608\n57#2:609\n*S KotlinDebug\n*F\n+ 1 RiveCanvasSession.kt\napp/rive/RiveCanvasSession$beginPlaying$4$renderLoop$1$1\n*L\n395#1:608\n448#1:609\n*E\n"})
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ FrameTicker $ticker;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ RiveCanvasSession this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RiveCanvasSession riveCanvasSession, FrameTicker frameTicker, Continuation continuation) {
            super(2, continuation);
            this.this$0 = riveCanvasSession;
            this.$ticker = frameTicker;
        }

        @Override // xn.a
        @NotNull
        public final Continuation create(Object obj, @NotNull Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$ticker, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // xn.a
        public final Object invokeSuspend(@NotNull Object obj) {
            final Ref.LongRef longRef;
            final Ref.BooleanRef booleanRef;
            CoroutineScope coroutineScope;
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                final RiveCanvasSession riveCanvasSession = this.this$0;
                RiveLog.INSTANCE.getLogger().d("Rive/CanvasSession", new Function0<String>() { // from class: app.rive.RiveCanvasSession.beginPlaying.4.renderLoop.1.1.1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return e.m("Starting drawing with ", ArtboardHandle.m108toStringimpl(riveCanvasSession.artboard.getArtboardHandle()), " and ", StateMachineHandle.m224toStringimpl(riveCanvasSession.stateMachine.getStateMachineHandle()));
                    }
                });
                longRef = new Ref.LongRef();
                booleanRef = new Ref.BooleanRef();
                coroutineScope = coroutineScope2;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef = (Ref.BooleanRef) this.L$2;
                longRef = (Ref.LongRef) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ib.a.L(obj);
            }
            while (b0.s(coroutineScope) && !this.this$0.closer.getClosed()) {
                FrameTicker frameTicker = this.$ticker;
                final RiveCanvasSession riveCanvasSession2 = this.this$0;
                Function1<Long, Unit> function1 = new Function1<Long, Unit>() { // from class: app.rive.RiveCanvasSession.beginPlaying.4.renderLoop.1.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke(((Number) obj2).longValue());
                        return Unit.f14616a;
                    }

                    public final void invoke(long j) {
                        if (riveCanvasSession2.closer.getClosed()) {
                            return;
                        }
                        Ref.LongRef longRef2 = longRef;
                        long j5 = longRef2.element;
                        long j7 = j5 != 0 ? j - j5 : 0L;
                        longRef2.element = j;
                        RiveCanvasSession riveCanvasSession3 = riveCanvasSession2;
                        Ref.BooleanRef booleanRef2 = booleanRef;
                        Trace.beginSection("Rive/Frame");
                        try {
                            HardwareRenderBuffer hardwareRenderBuffer = riveCanvasSession3.renderBuffer;
                            if (hardwareRenderBuffer == null) {
                                if (!booleanRef2.element) {
                                    RiveLog.INSTANCE.getLogger().w("Rive/CanvasSession", new Function0<String>() { // from class: app.rive.RiveCanvasSession$beginPlaying$4$renderLoop$1$1$2$1$1
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final String invoke() {
                                            return "No render buffer available; call setRegion(...) with a valid size before beginPlaying.";
                                        }
                                    });
                                    booleanRef2.element = true;
                                }
                                Trace.beginSection("Rive/Frame/NoBuffer");
                                try {
                                    Unit unit = Unit.f14616a;
                                    Trace.endSection();
                                } finally {
                                    Trace.endSection();
                                }
                            } else {
                                booleanRef2.element = false;
                                if (!riveCanvasSession3.settled) {
                                    Trace.beginSection("Rive/Frame/Advance");
                                    try {
                                        StateMachine stateMachine = riveCanvasSession3.stateMachine;
                                        yq.a aVar2 = Duration.f14747e;
                                        stateMachine.m51advanceLRDsOJo(c.h(j7, yq.d.NANOSECONDS));
                                        Unit unit2 = Unit.f14616a;
                                        Trace.endSection();
                                        Trace.beginSection("Rive/Frame/Draw");
                                        try {
                                            hardwareRenderBuffer.render(riveCanvasSession3.artboard, riveCanvasSession3.stateMachine, riveCanvasSession3.fit, riveCanvasSession3.clearColor);
                                            Trace.endSection();
                                        } finally {
                                            Trace.endSection();
                                        }
                                    } catch (Throwable th2) {
                                        Trace.endSection();
                                        throw th2;
                                    }
                                }
                            }
                            Unit unit3 = Unit.f14616a;
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                };
                this.L$0 = coroutineScope;
                this.L$1 = longRef;
                this.L$2 = booleanRef;
                this.label = 1;
                if (frameTicker.withFrame(function1, this) == aVar) {
                    return aVar;
                }
            }
            final RiveCanvasSession riveCanvasSession3 = this.this$0;
            RiveLog.INSTANCE.getLogger().d("Rive/CanvasSession", new Function0<String>() { // from class: app.rive.RiveCanvasSession.beginPlaying.4.renderLoop.1.1.3
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return e.m("Ending drawing with ", ArtboardHandle.m108toStringimpl(riveCanvasSession3.artboard.getArtboardHandle()), " and ", StateMachineHandle.m224toStringimpl(riveCanvasSession3.stateMachine.getStateMachineHandle()));
                }
            });
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveCanvasSession$beginPlaying$4$renderLoop$1(Lifecycle lifecycle, RiveCanvasSession riveCanvasSession, FrameTicker frameTicker, Continuation continuation) {
        super(2, continuation);
        this.$lifecycle = lifecycle;
        this.this$0 = riveCanvasSession;
        this.$ticker = frameTicker;
    }

    @Override // xn.a
    @NotNull
    public final Continuation create(Object obj, @NotNull Continuation continuation) {
        return new RiveCanvasSession$beginPlaying$4$renderLoop$1(this.$lifecycle, this.this$0, this.$ticker, continuation);
    }

    @Override // xn.a
    public final Object invokeSuspend(@NotNull Object obj) {
        wn.a aVar = wn.a.f22354d;
        int i7 = this.label;
        if (i7 == 0) {
            ib.a.L(obj);
            Lifecycle lifecycle = this.$lifecycle;
            Lifecycle.State state = Lifecycle.State.f2299w;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$ticker, null);
            this.label = 1;
            if (j0.a(lifecycle, state, anonymousClass1, this) == aVar) {
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
        return ((RiveCanvasSession$beginPlaying$4$renderLoop$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }
}
