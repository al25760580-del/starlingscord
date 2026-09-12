package app.rive;

import app.rive.core.CommandQueue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@d(c = "app.rive.Artboard$stateMachineNamesCache$1", f = "Artboard.kt", l = {74}, m = "invokeSuspend")
public final class Artboard$stateMachineNamesCache$1 extends h implements Function1<Continuation, Object> {
    int label;
    final /* synthetic */ Artboard this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Artboard$stateMachineNamesCache$1(Artboard artboard, Continuation continuation) {
        super(1, continuation);
        this.this$0 = artboard;
    }

    @Override // xn.a
    @NotNull
    public final Continuation create(@NotNull Continuation continuation) {
        return new Artboard$stateMachineNamesCache$1(this.this$0, continuation);
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
        CommandQueue riveWorker$kotlin_release = this.this$0.getRiveWorker();
        long jM5getArtboardHandlenSTdbJo = this.this$0.getArtboardHandle();
        this.label = 1;
        Object objM152getStateMachineNamesb88yb0A = riveWorker$kotlin_release.m152getStateMachineNamesb88yb0A(jM5getArtboardHandlenSTdbJo, this);
        return objM152getStateMachineNamesb88yb0A == aVar ? aVar : objM152getStateMachineNamesb88yb0A;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation continuation) {
        return ((Artboard$stateMachineNamesCache$1) create(continuation)).invokeSuspend(Unit.f14616a);
    }
}
