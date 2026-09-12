package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import app.rive.runtime.kotlin.core.ViewModelNumberProperty;
import com.facebook.react.devsupport.StackTraceHelper;
import com.margelo.nitro.core.Promise;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0015J&\u0010\u001b\u001a\u00020\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u000eJ*\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000fH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u0018\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R$\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\u000eR\u0016\u0010*\u001a\u0004\u0018\u00010'8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0016\u0010.\u001a\u0004\u0018\u00010+8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-R,\u00102\u001a\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000f0/8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/margelo/nitro/rive/HybridViewModelNumberProperty;", "Lcom/margelo/nitro/rive/HybridViewModelNumberPropertySpec;", "Lcom/margelo/nitro/rive/BaseHybridViewModelProperty;", "", "Lapp/rive/runtime/kotlin/core/ViewModelNumberProperty;", "viewModelNumber", "<init>", "(Lapp/rive/runtime/kotlin/core/ViewModelNumberProperty;)V", "Lcom/margelo/nitro/core/Promise;", "getValueAsync", "()Lcom/margelo/nitro/core/Promise;", "value", "", "set", "(D)V", "Lkotlin/Function1;", "onChanged", "Lkotlin/Function0;", "addListener", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;", "removeListeners", "()V", "dispose", "Lkotlinx/coroutines/flow/Flow;", "valueFlow", "", "drop", "ensureValueListenerJob", "(Lkotlinx/coroutines/flow/Flow;I)V", "callback", "addListenerInternal", "", StackTraceHelper.ID_KEY, "removeListener", "(Ljava/lang/String;)V", "Lapp/rive/runtime/kotlin/core/ViewModelNumberProperty;", "getValue", "()D", "setValue", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "job", "", "getListeners", "()Ljava/util/Map;", "listeners", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@xa.a
@SourceDebugExtension({"SMAP\nHybridViewModelNumberProperty.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HybridViewModelNumberProperty.kt\ncom/margelo/nitro/rive/HybridViewModelNumberProperty\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,34:1\n49#2:35\n51#2:39\n46#3:36\n51#3:38\n105#4:37\n*S KotlinDebug\n*F\n+ 1 HybridViewModelNumberProperty.kt\ncom/margelo/nitro/rive/HybridViewModelNumberProperty\n*L\n30#1:35\n30#1:39\n30#1:36\n30#1:38\n30#1:37\n*E\n"})
public final class HybridViewModelNumberProperty extends HybridViewModelNumberPropertySpec implements BaseHybridViewModelProperty<Double> {
    private final /* synthetic */ BaseHybridViewModelPropertyImpl<Double> $$delegate_0;

    @NotNull
    private final ViewModelNumberProperty viewModelNumber;

    public HybridViewModelNumberProperty(@NotNull ViewModelNumberProperty viewModelNumber) {
        Intrinsics.checkNotNullParameter(viewModelNumber, "viewModelNumber");
        this.$$delegate_0 = new BaseHybridViewModelPropertyImpl<>();
        this.viewModelNumber = viewModelNumber;
    }

    @Override // com.margelo.nitro.rive.HybridViewModelNumberPropertySpec
    @NotNull
    public Function0<Unit> addListener(@NotNull Function1<? super Double, Unit> onChanged) {
        Intrinsics.checkNotNullParameter(onChanged, "onChanged");
        Function0<Unit> function0AddListenerInternal = addListenerInternal(onChanged);
        ensureValueListenerJob(new g1(this.viewModelNumber.getValueFlow(), 2), 0);
        return function0AddListenerInternal;
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    @NotNull
    public Function0<Unit> addListenerInternal(@NotNull Function1<? super Double, Unit> callback) {
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
    public Map<String, Function1<Double, Unit>> getListeners() {
        return this.$$delegate_0.getListeners();
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    public CoroutineScope getScope() {
        return this.$$delegate_0.getScope();
    }

    @Override // com.margelo.nitro.rive.HybridViewModelNumberPropertySpec
    public double getValue() {
        return this.viewModelNumber.getValue().floatValue();
    }

    @Override // com.margelo.nitro.rive.HybridViewModelNumberPropertySpec
    @NotNull
    public Promise<Double> getValueAsync() {
        return com.margelo.nitro.core.f.a(Promise.Companion, new a1(this, null, 4));
    }

    public void onChanged(double value) {
        this.$$delegate_0.onChanged(Double.valueOf(value));
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    public void removeListener(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.$$delegate_0.removeListener(id2);
    }

    @Override // com.margelo.nitro.rive.HybridViewModelNumberPropertySpec, com.margelo.nitro.rive.BaseHybridViewModelProperty
    @xa.a
    @Keep
    public void removeListeners() {
        this.$$delegate_0.removeListeners();
    }

    @Override // com.margelo.nitro.rive.HybridViewModelNumberPropertySpec
    public void set(double value) {
        this.viewModelNumber.setValue(Float.valueOf((float) value));
    }

    @Override // com.margelo.nitro.rive.HybridViewModelNumberPropertySpec
    public void setValue(double d6) {
        this.viewModelNumber.setValue(Float.valueOf((float) d6));
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    public /* bridge */ /* synthetic */ void onChanged(Double d6) {
        onChanged(d6.doubleValue());
    }
}
