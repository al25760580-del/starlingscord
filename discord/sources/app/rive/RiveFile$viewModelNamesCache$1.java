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
@d(c = "app.rive.RiveFile$viewModelNamesCache$1", f = "RiveFile.kt", l = {107}, m = "invokeSuspend")
public final class RiveFile$viewModelNamesCache$1 extends h implements Function1<Continuation, Object> {
    int label;
    final /* synthetic */ RiveFile this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveFile$viewModelNamesCache$1(RiveFile riveFile, Continuation continuation) {
        super(1, continuation);
        this.this$0 = riveFile;
    }

    @Override // xn.a
    @NotNull
    public final Continuation create(@NotNull Continuation continuation) {
        return new RiveFile$viewModelNamesCache$1(this.this$0, continuation);
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
        CommandQueue riveWorker = this.this$0.getRiveWorker();
        long fileHandle = this.this$0.getFileHandle();
        this.label = 1;
        Object objM155getViewModelNamesevklBmw = riveWorker.m155getViewModelNamesevklBmw(fileHandle, this);
        return objM155getViewModelNamesevklBmw == aVar ? aVar : objM155getViewModelNamesevklBmw;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation continuation) {
        return ((RiveFile$viewModelNamesCache$1) create(continuation)).invokeSuspend(Unit.f14616a);
    }
}
