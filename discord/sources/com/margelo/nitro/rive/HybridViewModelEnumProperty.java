package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import app.rive.runtime.kotlin.core.ViewModelEnumProperty;
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
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0015J&\u0010\u001b\u001a\u00020\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u000eJ*\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000fH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u0018\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b \u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R$\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010\u000eR\u0016\u0010(\u001a\u0004\u0018\u00010%8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0016\u0010,\u001a\u0004\u0018\u00010)8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+R,\u00100\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000f0-8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/margelo/nitro/rive/HybridViewModelEnumProperty;", "Lcom/margelo/nitro/rive/HybridViewModelEnumPropertySpec;", "Lcom/margelo/nitro/rive/BaseHybridViewModelProperty;", "", "Lapp/rive/runtime/kotlin/core/ViewModelEnumProperty;", "viewModelEnum", "<init>", "(Lapp/rive/runtime/kotlin/core/ViewModelEnumProperty;)V", "Lcom/margelo/nitro/core/Promise;", "getValueAsync", "()Lcom/margelo/nitro/core/Promise;", "value", "", "set", "(Ljava/lang/String;)V", "Lkotlin/Function1;", "onChanged", "Lkotlin/Function0;", "addListener", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;", "removeListeners", "()V", "dispose", "Lkotlinx/coroutines/flow/Flow;", "valueFlow", "", "drop", "ensureValueListenerJob", "(Lkotlinx/coroutines/flow/Flow;I)V", "callback", "addListenerInternal", StackTraceHelper.ID_KEY, "removeListener", "Lapp/rive/runtime/kotlin/core/ViewModelEnumProperty;", "getValue", "()Ljava/lang/String;", "setValue", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "job", "", "getListeners", "()Ljava/util/Map;", "listeners", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HybridViewModelEnumProperty extends HybridViewModelEnumPropertySpec implements BaseHybridViewModelProperty<String> {
    private final /* synthetic */ BaseHybridViewModelPropertyImpl<String> $$delegate_0;

    @NotNull
    private final ViewModelEnumProperty viewModelEnum;

    public HybridViewModelEnumProperty(@NotNull ViewModelEnumProperty viewModelEnum) {
        Intrinsics.checkNotNullParameter(viewModelEnum, "viewModelEnum");
        this.$$delegate_0 = new BaseHybridViewModelPropertyImpl<>();
        this.viewModelEnum = viewModelEnum;
    }

    @Override // com.margelo.nitro.rive.HybridViewModelEnumPropertySpec
    @NotNull
    public Function0<Unit> addListener(@NotNull Function1<? super String, Unit> onChanged) {
        Intrinsics.checkNotNullParameter(onChanged, "onChanged");
        Function0<Unit> function0AddListenerInternal = addListenerInternal(onChanged);
        ensureValueListenerJob(this.viewModelEnum.getValueFlow(), 0);
        return function0AddListenerInternal;
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    @NotNull
    public Function0<Unit> addListenerInternal(@NotNull Function1<? super String, Unit> callback) {
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
    public Map<String, Function1<String, Unit>> getListeners() {
        return this.$$delegate_0.getListeners();
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    public CoroutineScope getScope() {
        return this.$$delegate_0.getScope();
    }

    @Override // com.margelo.nitro.rive.HybridViewModelEnumPropertySpec
    @NotNull
    public String getValue() {
        return this.viewModelEnum.getValue();
    }

    @Override // com.margelo.nitro.rive.HybridViewModelEnumPropertySpec
    @NotNull
    public Promise<String> getValueAsync() {
        return com.margelo.nitro.core.f.a(Promise.Companion, new a1(this, null, 2));
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    public void onChanged(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.$$delegate_0.onChanged(value);
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    public void removeListener(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.$$delegate_0.removeListener(id2);
    }

    @Override // com.margelo.nitro.rive.HybridViewModelEnumPropertySpec, com.margelo.nitro.rive.BaseHybridViewModelProperty
    @xa.a
    @Keep
    public void removeListeners() {
        this.$$delegate_0.removeListeners();
    }

    @Override // com.margelo.nitro.rive.HybridViewModelEnumPropertySpec
    public void set(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.viewModelEnum.setValue(value);
    }

    @Override // com.margelo.nitro.rive.HybridViewModelEnumPropertySpec
    public void setValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.viewModelEnum.setValue(value);
    }
}
