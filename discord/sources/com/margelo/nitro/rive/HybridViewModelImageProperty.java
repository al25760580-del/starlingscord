package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import app.rive.runtime.kotlin.core.ViewModelImageProperty;
import com.facebook.react.devsupport.StackTraceHelper;
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
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0016J#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0010H\u0096\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u0096\u0001J\u001f\u0010\u0012\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0096\u0001J\u0016\u0010\r\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0002\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0096\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u0096\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R*\u0010!\u001a\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00100\"X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u0004\u0018\u00010&X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/margelo/nitro/rive/HybridViewModelImageProperty;", "Lcom/margelo/nitro/rive/HybridViewModelImagePropertySpec;", "Lcom/margelo/nitro/rive/BaseHybridViewModelProperty;", "", "viewModelImage", "Lapp/rive/runtime/kotlin/core/ViewModelImageProperty;", "<init>", "(Lapp/rive/runtime/kotlin/core/ViewModelImageProperty;)V", "set", "image", "Lcom/margelo/nitro/rive/HybridRiveImageSpec;", "addListener", "Lkotlin/Function0;", "onChanged", "addListenerInternal", "callback", "Lkotlin/Function1;", "dispose", "ensureValueListenerJob", "valueFlow", "Lkotlinx/coroutines/flow/Flow;", "drop", "", "value", "(Lkotlin/Unit;)V", "removeListener", StackTraceHelper.ID_KEY, "", "removeListeners", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "listeners", "", "getListeners", "()Ljava/util/Map;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@xa.a
@SourceDebugExtension({"SMAP\nHybridViewModelImageProperty.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HybridViewModelImageProperty.kt\ncom/margelo/nitro/rive/HybridViewModelImageProperty\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,23:1\n49#2:24\n51#2:28\n46#3:25\n51#3:27\n105#4:26\n*S KotlinDebug\n*F\n+ 1 HybridViewModelImageProperty.kt\ncom/margelo/nitro/rive/HybridViewModelImageProperty\n*L\n19#1:24\n19#1:28\n19#1:25\n19#1:27\n19#1:26\n*E\n"})
public final class HybridViewModelImageProperty extends HybridViewModelImagePropertySpec implements BaseHybridViewModelProperty<Unit> {
    private final /* synthetic */ BaseHybridViewModelPropertyImpl<Unit> $$delegate_0;

    @NotNull
    private final ViewModelImageProperty viewModelImage;

    public HybridViewModelImageProperty(@NotNull ViewModelImageProperty viewModelImage) {
        Intrinsics.checkNotNullParameter(viewModelImage, "viewModelImage");
        this.$$delegate_0 = new BaseHybridViewModelPropertyImpl<>();
        this.viewModelImage = viewModelImage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addListener$lambda$0(Function0 function0, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "<unused var>");
        function0.invoke();
        return Unit.f14616a;
    }

    @Override // com.margelo.nitro.rive.HybridViewModelImagePropertySpec
    @NotNull
    public Function0<Unit> addListener(@NotNull Function0<Unit> onChanged) {
        Intrinsics.checkNotNullParameter(onChanged, "onChanged");
        Function0<Unit> function0AddListenerInternal = addListenerInternal(new com.facebook.react.defaults.a(1, onChanged));
        ensureValueListenerJob(new g1(this.viewModelImage.getValueFlow(), 0), 0);
        return function0AddListenerInternal;
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    @NotNull
    public Function0<Unit> addListenerInternal(@NotNull Function1<? super Unit, Unit> callback) {
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
    public Map<String, Function1<Unit, Unit>> getListeners() {
        return this.$$delegate_0.getListeners();
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    public CoroutineScope getScope() {
        return this.$$delegate_0.getScope();
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    public void onChanged(@NotNull Unit value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.$$delegate_0.onChanged(value);
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    public void removeListener(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.$$delegate_0.removeListener(id2);
    }

    @Override // com.margelo.nitro.rive.HybridViewModelImagePropertySpec, com.margelo.nitro.rive.BaseHybridViewModelProperty
    @xa.a
    @Keep
    public void removeListeners() {
        this.$$delegate_0.removeListeners();
    }

    @Override // com.margelo.nitro.rive.HybridViewModelImagePropertySpec
    public void set(HybridRiveImageSpec image) {
        ViewModelImageProperty viewModelImageProperty = this.viewModelImage;
        HybridRiveImage hybridRiveImage = image instanceof HybridRiveImage ? (HybridRiveImage) image : null;
        viewModelImageProperty.set(hybridRiveImage != null ? hybridRiveImage.getRenderImage() : null);
    }
}
