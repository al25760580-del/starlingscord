package ShiggyXposed.xposed.modules;

import androidx.constraintlayout.widget.ConstraintLayout;
import dev.rushii.libunbound.LibUnbound;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: UpdaterModule.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "ShiggyXposed.xposed.modules.UpdaterModule$tryResolveUrl$hermesVersion$1", f = "UpdaterModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class UpdaterModule$tryResolveUrl$hermesVersion$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    UpdaterModule$tryResolveUrl$hermesVersion$1(Continuation<? super UpdaterModule$tryResolveUrl$hermesVersion$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UpdaterModule$tryResolveUrl$hermesVersion$1 updaterModule$tryResolveUrl$hermesVersion$1 = new UpdaterModule$tryResolveUrl$hermesVersion$1(continuation);
        updaterModule$tryResolveUrl$hermesVersion$1.L$0 = obj;
        return updaterModule$tryResolveUrl$hermesVersion$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return ((UpdaterModule$tryResolveUrl$hermesVersion$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM453constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            Result.Companion companion = Result.INSTANCE;
            objM453constructorimpl = Result.m453constructorimpl(Boxing.boxInt(LibUnbound.getHermesRuntimeBytecodeVersion()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM453constructorimpl = Result.m453constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m459isFailureimpl(objM453constructorimpl)) {
            return null;
        }
        return objM453constructorimpl;
    }
}
