package app.rive;

import app.rive.core.StateMachineHandle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import s0.g;
import u.l;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@d(c = "app.rive.RiveKt$Rive$5$1", f = "Rive.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension({"SMAP\nRive.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rive.kt\napp/rive/RiveKt$Rive$5$1\n+ 2 RiveLog.kt\napp/rive/RiveLog\n*L\n1#1,521:1\n57#2:522\n*S KotlinDebug\n*F\n+ 1 Rive.kt\napp/rive/RiveKt$Rive$5$1\n*L\n264#1:522\n*E\n"})
public final class RiveKt$Rive$5$1 extends h implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ l $isSettled$delegate;
    final /* synthetic */ long $stateMachineHandle;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveKt$Rive$5$1(long j, l lVar, Continuation continuation) {
        super(2, continuation);
        this.$stateMachineHandle = j;
        this.$isSettled$delegate = lVar;
    }

    @Override // xn.a
    @NotNull
    public final Continuation create(Object obj, @NotNull Continuation continuation) {
        return new RiveKt$Rive$5$1(this.$stateMachineHandle, this.$isSettled$delegate, continuation);
    }

    @Override // xn.a
    public final Object invokeSuspend(@NotNull Object obj) {
        wn.a aVar = wn.a.f22354d;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ib.a.L(obj);
        final long j = this.$stateMachineHandle;
        RiveLog.INSTANCE.getLogger().d("Rive/UI/SM", new Function0<String>() { // from class: app.rive.RiveKt$Rive$5$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return g.e("State machine ", StateMachineHandle.m224toStringimpl(j), " unsettled due to parameter change");
            }
        });
        RiveKt.Rive$lambda$2(this.$isSettled$delegate, false);
        return Unit.f14616a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation continuation) {
        return ((RiveKt$Rive$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }
}
