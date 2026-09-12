package app.rive;

import android.graphics.Bitmap;
import android.os.Trace;
import dr.v;
import dr.z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@d(c = "app.rive.RiveCanvasSession$beginPlaying$4$frameAvailableCollector$1", f = "RiveCanvasSession.kt", l = {373}, m = "invokeSuspend")
public final class RiveCanvasSession$beginPlaying$4$frameAvailableCollector$1 extends h implements Function2<CoroutineScope, Continuation, Object> {
    int label;
    final /* synthetic */ RiveCanvasSession this$0;

    /* JADX INFO: renamed from: app.rive.RiveCanvasSession$beginPlaying$4$frameAvailableCollector$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", "activeBuffer", "Lapp/rive/HardwareRenderBuffer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @d(c = "app.rive.RiveCanvasSession$beginPlaying$4$frameAvailableCollector$1$1", f = "RiveCanvasSession.kt", l = {375}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<HardwareRenderBuffer, Continuation, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RiveCanvasSession this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RiveCanvasSession riveCanvasSession, Continuation continuation) {
            super(2, continuation);
            this.this$0 = riveCanvasSession;
        }

        @Override // xn.a
        @NotNull
        public final Continuation create(Object obj, @NotNull Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(HardwareRenderBuffer hardwareRenderBuffer, Continuation continuation) {
            return ((AnonymousClass1) create(hardwareRenderBuffer, continuation)).invokeSuspend(Unit.f14616a);
        }

        @Override // xn.a
        public final Object invokeSuspend(@NotNull Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                final HardwareRenderBuffer hardwareRenderBuffer = (HardwareRenderBuffer) this.L$0;
                if (hardwareRenderBuffer == null) {
                    return Unit.f14616a;
                }
                v frameAvailable = hardwareRenderBuffer.getFrameAvailable();
                final RiveCanvasSession riveCanvasSession = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.rive.RiveCanvasSession.beginPlaying.4.frameAvailableCollector.1.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(@NotNull Unit unit, @NotNull Continuation continuation) {
                        RiveCanvasSession riveCanvasSession2 = riveCanvasSession;
                        HardwareRenderBuffer hardwareRenderBuffer2 = hardwareRenderBuffer;
                        Trace.beginSection("Rive/CanvasSession/PublishLatestBitmap");
                        try {
                            Trace.beginSection("Rive/CanvasSession/ToBitmap");
                            try {
                                Bitmap bitmapConsumeLatestBitmap = hardwareRenderBuffer2.consumeLatestBitmap();
                                Trace.endSection();
                                if (bitmapConsumeLatestBitmap != null && riveCanvasSession2.latestBitmap != bitmapConsumeLatestBitmap) {
                                    riveCanvasSession2.latestBitmap = bitmapConsumeLatestBitmap;
                                    riveCanvasSession2._frameAvailable.d(Unit.f14616a);
                                }
                                Unit unit2 = Unit.f14616a;
                                return Unit.f14616a;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                };
                this.label = 1;
                if (frameAvailable.collect(flowCollector, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            throw new rn.h();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveCanvasSession$beginPlaying$4$frameAvailableCollector$1(RiveCanvasSession riveCanvasSession, Continuation continuation) {
        super(2, continuation);
        this.this$0 = riveCanvasSession;
    }

    @Override // xn.a
    @NotNull
    public final Continuation create(Object obj, @NotNull Continuation continuation) {
        return new RiveCanvasSession$beginPlaying$4$frameAvailableCollector$1(this.this$0, continuation);
    }

    @Override // xn.a
    public final Object invokeSuspend(@NotNull Object obj) {
        wn.a aVar = wn.a.f22354d;
        int i7 = this.label;
        if (i7 == 0) {
            ib.a.L(obj);
            MutableStateFlow mutableStateFlow = this.this$0.renderBufferState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (z.f(mutableStateFlow, anonymousClass1, this) == aVar) {
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
        return ((RiveCanvasSession$beginPlaying$4$frameAvailableCollector$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }
}
