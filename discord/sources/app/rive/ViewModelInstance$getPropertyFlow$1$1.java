package app.rive;

import app.rive.core.ViewModelInstanceHandle;
import app.rive.runtime.kotlin.core.ViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002H\u00020\u0004j\b\u0012\u0004\u0012\u0002H\u0002`\u00050\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lapp/rive/core/CommandQueue$PropertyUpdate;", "Lapp/rive/core/RivePropertyUpdate;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@d(c = "app.rive.ViewModelInstance$getPropertyFlow$1$1", f = "ViewModelInstance.kt", l = {102}, m = "invokeSuspend")
public final class ViewModelInstance$getPropertyFlow$1$1 extends h implements Function2<FlowCollector, Continuation, Object> {
    final /* synthetic */ Function3 $getter;
    final /* synthetic */ String $propertyPath;
    final /* synthetic */ ViewModel.PropertyDataType $propertyType;
    int label;
    final /* synthetic */ ViewModelInstance this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelInstance$getPropertyFlow$1$1(ViewModelInstance viewModelInstance, String str, ViewModel.PropertyDataType propertyDataType, Function3 function3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = viewModelInstance;
        this.$propertyPath = str;
        this.$propertyType = propertyDataType;
        this.$getter = function3;
    }

    @Override // xn.a
    @NotNull
    public final Continuation create(Object obj, @NotNull Continuation continuation) {
        return new ViewModelInstance$getPropertyFlow$1$1(this.this$0, this.$propertyPath, this.$propertyType, this.$getter, continuation);
    }

    @Override // xn.a
    public final Object invokeSuspend(@NotNull Object obj) {
        wn.a aVar = wn.a.f22354d;
        int i7 = this.label;
        if (i7 == 0) {
            ib.a.L(obj);
            this.this$0.riveWorker.m178subscribeToPropertyiFQtAB8(this.this$0.getInstanceHandle(), this.$propertyPath, this.$propertyType);
            Function3 function3 = this.$getter;
            ViewModelInstanceHandle viewModelInstanceHandleM228boximpl = ViewModelInstanceHandle.m228boximpl(this.this$0.getInstanceHandle());
            String str = this.$propertyPath;
            this.label = 1;
            if (function3.invoke(viewModelInstanceHandleM228boximpl, str, this) == aVar) {
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
    public final Object invoke(@NotNull FlowCollector flowCollector, Continuation continuation) {
        return ((ViewModelInstance$getPropertyFlow$1$1) create(flowCollector, continuation)).invokeSuspend(Unit.f14616a);
    }
}
