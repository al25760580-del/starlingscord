package app.rive.core;

import ar.k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import wn.f;
import xn.d;
import xn.h;

/* JADX INFO: renamed from: app.rive.core.CommandQueue$decodeAudio-WLIIakE$$inlined$suspendNativeRequest$1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\u008a@¨\u0006\u0003"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;", "app/rive/core/CommandQueue$suspendNativeRequest$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
@d(c = "app.rive.core.CommandQueue$decodeAudio-WLIIakE$$inlined$suspendNativeRequest$1", f = "CommandQueue.kt", l = {2668}, m = "invokeSuspend")
@SourceDebugExtension({"SMAP\nCommandQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandQueue.kt\napp/rive/core/CommandQueue$suspendNativeRequest$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 CommandQueue.kt\napp/rive/core/CommandQueue\n*L\n1#1,2667:1\n318#2,9:2668\n327#2,2:2679\n1977#3,2:2677\n*S KotlinDebug\n*F\n+ 1 CommandQueue.kt\napp/rive/core/CommandQueue$suspendNativeRequest$2\n*L\n2509#1:2668,9\n2509#1:2679,2\n*E\n"})
public final class CommandQueue$decodeAudioWLIIakE$$inlined$suspendNativeRequest$1 extends h implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ byte[] $bytes$inlined;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CommandQueue this$0;
    final /* synthetic */ CommandQueue this$0$inline_fun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommandQueue$decodeAudioWLIIakE$$inlined$suspendNativeRequest$1(CommandQueue commandQueue, Continuation continuation, CommandQueue commandQueue2, byte[] bArr) {
        super(2, continuation);
        this.this$0$inline_fun = commandQueue;
        this.this$0 = commandQueue2;
        this.$bytes$inlined = bArr;
    }

    @Override // xn.a
    @NotNull
    public final Continuation create(Object obj, @NotNull Continuation continuation) {
        return new CommandQueue$decodeAudioWLIIakE$$inlined$suspendNativeRequest$1(this.this$0$inline_fun, continuation, this.this$0, this.$bytes$inlined);
    }

    @Override // xn.a
    public final Object invokeSuspend(@NotNull Object obj) {
        wn.a aVar = wn.a.f22354d;
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            return obj;
        }
        ib.a.L(obj);
        final CommandQueue commandQueue = this.this$0$inline_fun;
        this.L$0 = commandQueue;
        this.label = 1;
        k kVar = new k(1, f.b(this));
        kVar.t();
        final long andIncrement = commandQueue.nextRequestID.getAndIncrement();
        commandQueue.pendingContinuations.put(new Long(andIncrement), kVar);
        kVar.v(new Function1<Throwable, Unit>() { // from class: app.rive.core.CommandQueue$decodeAudio-WLIIakE$$inlined$suspendNativeRequest$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                invoke((Throwable) obj2);
                return Unit.f14616a;
            }

            public final void invoke(Throwable th2) {
                commandQueue.pendingContinuations.remove(Long.valueOf(andIncrement));
            }
        });
        try {
            this.this$0.bridge.cppDecodeAudio(this.this$0.cppPointer.getPointer(), andIncrement, this.$bytes$inlined);
            Object objR = kVar.r();
            if (objR == aVar) {
                Intrinsics.checkNotNullParameter(this, "frame");
            }
            return objR == aVar ? aVar : objR;
        } catch (Throwable th2) {
            commandQueue.pendingContinuations.remove(new Long(andIncrement));
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation continuation) {
        return ((CommandQueue$decodeAudioWLIIakE$$inlined$suspendNativeRequest$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }
}
