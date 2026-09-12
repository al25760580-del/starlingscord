package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import app.rive.runtime.kotlin.core.ViewModelColorProperty;
import com.facebook.react.devsupport.StackTraceHelper;
import com.margelo.nitro.core.Promise;
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
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0016J&\u0010\u001b\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\u001a\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u001dJ*\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u0010H\u0096\u0001¢\u0006\u0004\b\u001f\u0010\u0014J\u0018\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R$\u0010\f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u000fR\u0016\u0010+\u001a\u0004\u0018\u00010(8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0016\u0010/\u001a\u0004\u0018\u00010,8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010.R,\u00103\u001a\u001a\u0012\u0004\u0012\u00020 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u0010008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/margelo/nitro/rive/HybridViewModelColorProperty;", "Lcom/margelo/nitro/rive/HybridViewModelColorPropertySpec;", "Lcom/margelo/nitro/rive/BaseHybridViewModelProperty;", "", "Lapp/rive/runtime/kotlin/core/ViewModelColorProperty;", "viewModelColor", "<init>", "(Lapp/rive/runtime/kotlin/core/ViewModelColorProperty;)V", "Lcom/margelo/nitro/core/Promise;", "", "getValueAsync", "()Lcom/margelo/nitro/core/Promise;", "value", "", "set", "(D)V", "Lkotlin/Function1;", "onChanged", "Lkotlin/Function0;", "addListener", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;", "removeListeners", "()V", "dispose", "Lkotlinx/coroutines/flow/Flow;", "valueFlow", "drop", "ensureValueListenerJob", "(Lkotlinx/coroutines/flow/Flow;I)V", "(I)V", "callback", "addListenerInternal", "", StackTraceHelper.ID_KEY, "removeListener", "(Ljava/lang/String;)V", "Lapp/rive/runtime/kotlin/core/ViewModelColorProperty;", "getValue", "()D", "setValue", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "job", "", "getListeners", "()Ljava/util/Map;", "listeners", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HybridViewModelColorProperty extends HybridViewModelColorPropertySpec implements BaseHybridViewModelProperty<Integer> {
    private final /* synthetic */ BaseHybridViewModelPropertyImpl<Integer> $$delegate_0;

    @NotNull
    private final ViewModelColorProperty viewModelColor;

    public HybridViewModelColorProperty(@NotNull ViewModelColorProperty viewModelColor) {
        Intrinsics.checkNotNullParameter(viewModelColor, "viewModelColor");
        this.$$delegate_0 = new BaseHybridViewModelPropertyImpl<>();
        this.viewModelColor = viewModelColor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addListener$lambda$0(Function1 function1, int i7) {
        function1.invoke(Double.valueOf(i7));
        return Unit.f14616a;
    }

    @Override // com.margelo.nitro.rive.HybridViewModelColorPropertySpec
    @NotNull
    public Function0<Unit> addListener(@NotNull Function1<? super Double, Unit> onChanged) {
        Intrinsics.checkNotNullParameter(onChanged, "onChanged");
        Function0<Unit> function0AddListenerInternal = addListenerInternal(new com.discord.chat.presentation.message.view.z(onChanged, 5));
        ensureValueListenerJob(this.viewModelColor.getValueFlow(), 0);
        return function0AddListenerInternal;
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    @NotNull
    public Function0<Unit> addListenerInternal(@NotNull Function1<? super Integer, Unit> callback) {
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
    public Map<String, Function1<Integer, Unit>> getListeners() {
        return this.$$delegate_0.getListeners();
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    public CoroutineScope getScope() {
        return this.$$delegate_0.getScope();
    }

    @Override // com.margelo.nitro.rive.HybridViewModelColorPropertySpec
    public double getValue() {
        return this.viewModelColor.getValue().intValue();
    }

    @Override // com.margelo.nitro.rive.HybridViewModelColorPropertySpec
    @NotNull
    public Promise<Double> getValueAsync() {
        return com.margelo.nitro.core.f.a(Promise.Companion, new a1(this, null, 1));
    }

    public void onChanged(int value) {
        this.$$delegate_0.onChanged(Integer.valueOf(value));
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    public void removeListener(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.$$delegate_0.removeListener(id2);
    }

    @Override // com.margelo.nitro.rive.HybridViewModelColorPropertySpec, com.margelo.nitro.rive.BaseHybridViewModelProperty
    @xa.a
    @Keep
    public void removeListeners() {
        this.$$delegate_0.removeListeners();
    }

    @Override // com.margelo.nitro.rive.HybridViewModelColorPropertySpec
    public void set(double value) {
        this.viewModelColor.setValue(Integer.valueOf((int) value));
    }

    @Override // com.margelo.nitro.rive.HybridViewModelColorPropertySpec
    public void setValue(double d6) {
        this.viewModelColor.setValue(Integer.valueOf((int) d6));
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    public /* bridge */ /* synthetic */ void onChanged(Integer num) {
        onChanged(num.intValue());
    }
}
