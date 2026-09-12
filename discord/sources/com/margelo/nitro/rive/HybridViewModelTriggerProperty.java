package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import app.rive.runtime.kotlin.core.ViewModelTriggerProperty;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0016J#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u000fH\u0096\u0001J\t\u0010\u0010\u001a\u00020\tH\u0096\u0001J\u001f\u0010\u0011\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0096\u0001J\u0011\u0010\f\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0003H\u0096\u0001J\u0011\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0019H\u0096\u0001J\t\u0010\u001a\u001a\u00020\tH\u0096\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR*\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u000f0 X\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u0004\u0018\u00010$X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/margelo/nitro/rive/HybridViewModelTriggerProperty;", "Lcom/margelo/nitro/rive/HybridViewModelTriggerPropertySpec;", "Lcom/margelo/nitro/rive/BaseHybridViewModelProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelTriggerProperty$TriggerUnit;", "viewModelTrigger", "Lapp/rive/runtime/kotlin/core/ViewModelTriggerProperty;", "<init>", "(Lapp/rive/runtime/kotlin/core/ViewModelTriggerProperty;)V", "trigger", "", "addListener", "Lkotlin/Function0;", "onChanged", "addListenerInternal", "callback", "Lkotlin/Function1;", "dispose", "ensureValueListenerJob", "valueFlow", "Lkotlinx/coroutines/flow/Flow;", "drop", "", "value", "removeListener", StackTraceHelper.ID_KEY, "", "removeListeners", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "listeners", "", "getListeners", "()Ljava/util/Map;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HybridViewModelTriggerProperty extends HybridViewModelTriggerPropertySpec implements BaseHybridViewModelProperty<ViewModelTriggerProperty.TriggerUnit> {
    private final /* synthetic */ BaseHybridViewModelPropertyImpl<ViewModelTriggerProperty.TriggerUnit> $$delegate_0;

    @NotNull
    private final ViewModelTriggerProperty viewModelTrigger;

    public HybridViewModelTriggerProperty(@NotNull ViewModelTriggerProperty viewModelTrigger) {
        Intrinsics.checkNotNullParameter(viewModelTrigger, "viewModelTrigger");
        this.$$delegate_0 = new BaseHybridViewModelPropertyImpl<>();
        this.viewModelTrigger = viewModelTrigger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addListener$lambda$0(Function0 function0, ViewModelTriggerProperty.TriggerUnit triggerUnit) {
        Intrinsics.checkNotNullParameter(triggerUnit, "<unused var>");
        function0.invoke();
        return Unit.f14616a;
    }

    @Override // com.margelo.nitro.rive.HybridViewModelTriggerPropertySpec
    @NotNull
    public Function0<Unit> addListener(@NotNull Function0<Unit> onChanged) {
        Intrinsics.checkNotNullParameter(onChanged, "onChanged");
        Function0<Unit> function0AddListenerInternal = addListenerInternal(new com.facebook.react.defaults.a(3, onChanged));
        ensureValueListenerJob(this.viewModelTrigger.getValueFlow(), 1);
        return function0AddListenerInternal;
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    @NotNull
    public Function0<Unit> addListenerInternal(@NotNull Function1<? super ViewModelTriggerProperty.TriggerUnit, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return this.$$delegate_0.addListenerInternal(callback);
    }

    @Override // com.margelo.nitro.core.HybridObject
    @xa.a
    @Keep
    public void dispose() {
        this.$$delegate_0.dispose();
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    public void ensureValueListenerJob(@NotNull Flow valueFlow, int drop) {
        Intrinsics.checkNotNullParameter(valueFlow, "valueFlow");
        this.$$delegate_0.ensureValueListenerJob(valueFlow, drop);
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    public Job getJob() {
        return this.$$delegate_0.getJob();
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    @NotNull
    public Map<String, Function1<ViewModelTriggerProperty.TriggerUnit, Unit>> getListeners() {
        return this.$$delegate_0.getListeners();
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    public CoroutineScope getScope() {
        return this.$$delegate_0.getScope();
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    public void onChanged(@NotNull ViewModelTriggerProperty.TriggerUnit value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.$$delegate_0.onChanged(value);
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    public void removeListener(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.$$delegate_0.removeListener(id2);
    }

    @Override // com.margelo.nitro.rive.HybridViewModelTriggerPropertySpec, com.margelo.nitro.rive.BaseHybridViewModelProperty
    @xa.a
    @Keep
    public void removeListeners() {
        this.$$delegate_0.removeListeners();
    }

    @Override // com.margelo.nitro.rive.HybridViewModelTriggerPropertySpec
    public void trigger() {
        this.viewModelTrigger.trigger();
    }
}
