package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import app.rive.runtime.kotlin.core.ViewModelListProperty;
import com.facebook.react.devsupport.StackTraceHelper;
import com.margelo.nitro.core.Promise;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u001bH\u0016J\u0018\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u001b2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0016J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030#H\u0016J#\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030#2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030'H\u0096\u0001J\t\u0010(\u001a\u00020\u0003H\u0096\u0001J\u001f\u0010)\u001a\u00020\u00032\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030+2\u0006\u0010,\u001a\u00020-H\u0096\u0001J\u0016\u0010$\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0002\u0010/J\u0011\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u000202H\u0096\u0001J\t\u00103\u001a\u00020\u0003H\u0096\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u00104\u001a\u0004\u0018\u000105X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107R*\u00108\u001a\u001a\u0012\u0004\u0012\u000202\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030'09X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010<\u001a\u0004\u0018\u00010=X\u0096\u0005¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lcom/margelo/nitro/rive/HybridViewModelListProperty;", "Lcom/margelo/nitro/rive/HybridViewModelListPropertySpec;", "Lcom/margelo/nitro/rive/BaseHybridViewModelProperty;", "", "listProperty", "Lapp/rive/runtime/kotlin/core/ViewModelListProperty;", "<init>", "(Lapp/rive/runtime/kotlin/core/ViewModelListProperty;)V", "length", "", "getLength", "()D", "requireHybridInstance", "Lcom/margelo/nitro/rive/HybridViewModelInstance;", "instance", "Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec;", "getInstanceAt", "index", "addInstance", "addInstanceAt", "", "removeInstance", "removeInstanceAt", "swap", "index1", "index2", "getLengthAsync", "Lcom/margelo/nitro/core/Promise;", "getInstanceAtAsync", "addInstanceAsync", "addInstanceAtAsync", "removeInstanceAsync", "removeInstanceAtAsync", "swapAsync", "addListener", "Lkotlin/Function0;", "onChanged", "addListenerInternal", "callback", "Lkotlin/Function1;", "dispose", "ensureValueListenerJob", "valueFlow", "Lkotlinx/coroutines/flow/Flow;", "drop", "", "value", "(Lkotlin/Unit;)V", "removeListener", StackTraceHelper.ID_KEY, "", "removeListeners", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "listeners", "", "getListeners", "()Ljava/util/Map;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@xa.a
@SourceDebugExtension({"SMAP\nHybridViewModelListProperty.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HybridViewModelListProperty.kt\ncom/margelo/nitro/rive/HybridViewModelListProperty\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,94:1\n49#2:95\n51#2:99\n46#3:96\n51#3:98\n105#4:97\n*S KotlinDebug\n*F\n+ 1 HybridViewModelListProperty.kt\ncom/margelo/nitro/rive/HybridViewModelListProperty\n*L\n90#1:95\n90#1:99\n90#1:96\n90#1:98\n90#1:97\n*E\n"})
public final class HybridViewModelListProperty extends HybridViewModelListPropertySpec implements BaseHybridViewModelProperty<Unit> {
    private final /* synthetic */ BaseHybridViewModelPropertyImpl<Unit> $$delegate_0;

    @NotNull
    private final ViewModelListProperty listProperty;

    public HybridViewModelListProperty(@NotNull ViewModelListProperty listProperty) {
        Intrinsics.checkNotNullParameter(listProperty, "listProperty");
        this.$$delegate_0 = new BaseHybridViewModelPropertyImpl<>();
        this.listProperty = listProperty;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addListener$lambda$0(Function0 function0, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "<unused var>");
        function0.invoke();
        return Unit.f14616a;
    }

    private final HybridViewModelInstance requireHybridInstance(HybridViewModelInstanceSpec instance) {
        HybridViewModelInstance hybridViewModelInstance = instance instanceof HybridViewModelInstance ? (HybridViewModelInstance) instance : null;
        if (hybridViewModelInstance != null) {
            return hybridViewModelInstance;
        }
        throw new IllegalArgumentException(a3.e.l("Expected HybridViewModelInstance but got ", Reflection.getOrCreateKotlinClass(instance.getClass()).getSimpleName()));
    }

    @Override // com.margelo.nitro.rive.HybridViewModelListPropertySpec
    public void addInstance(@NotNull HybridViewModelInstanceSpec instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.listProperty.add(requireHybridInstance(instance).getViewModelInstance());
    }

    @Override // com.margelo.nitro.rive.HybridViewModelListPropertySpec
    @NotNull
    public Promise<Unit> addInstanceAsync(@NotNull HybridViewModelInstanceSpec instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        return com.margelo.nitro.core.f.a(Promise.Companion, new j1(this, instance, null, 0));
    }

    @Override // com.margelo.nitro.rive.HybridViewModelListPropertySpec
    public boolean addInstanceAt(@NotNull HybridViewModelInstanceSpec instance, double index) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        HybridViewModelInstance hybridViewModelInstanceRequireHybridInstance = requireHybridInstance(instance);
        int i7 = (int) index;
        if (i7 < 0 || i7 > this.listProperty.getSize()) {
            return false;
        }
        this.listProperty.add(i7, hybridViewModelInstanceRequireHybridInstance.getViewModelInstance());
        return true;
    }

    @Override // com.margelo.nitro.rive.HybridViewModelListPropertySpec
    @NotNull
    public Promise<Unit> addInstanceAtAsync(@NotNull HybridViewModelInstanceSpec instance, double index) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        return com.margelo.nitro.core.f.a(Promise.Companion, new k1(this, instance, index, null));
    }

    @Override // com.margelo.nitro.rive.HybridViewModelListPropertySpec
    @NotNull
    public Function0<Unit> addListener(@NotNull Function0<Unit> onChanged) {
        Intrinsics.checkNotNullParameter(onChanged, "onChanged");
        Function0<Unit> function0AddListenerInternal = addListenerInternal(new com.facebook.react.defaults.a(2, onChanged));
        ensureValueListenerJob(new g1(this.listProperty.getValueFlow(), 1), 0);
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

    @Override // com.margelo.nitro.rive.HybridViewModelListPropertySpec
    public HybridViewModelInstanceSpec getInstanceAt(double index) {
        int i7 = (int) index;
        if (i7 < 0 || i7 >= this.listProperty.getSize()) {
            return null;
        }
        return new HybridViewModelInstance(this.listProperty.elementAt(i7));
    }

    @Override // com.margelo.nitro.rive.HybridViewModelListPropertySpec
    @NotNull
    public Promise<HybridViewModelInstanceSpec> getInstanceAtAsync(double index) {
        return com.margelo.nitro.core.f.a(Promise.Companion, new m1(this, index, null, 0));
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    public Job getJob() {
        return this.$$delegate_0.getJob();
    }

    @Override // com.margelo.nitro.rive.HybridViewModelListPropertySpec
    public double getLength() {
        return this.listProperty.getSize();
    }

    @Override // com.margelo.nitro.rive.HybridViewModelListPropertySpec
    @NotNull
    public Promise<Double> getLengthAsync() {
        return com.margelo.nitro.core.f.a(Promise.Companion, new a1(this, null, 3));
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

    @Override // com.margelo.nitro.rive.HybridViewModelListPropertySpec
    public void removeInstance(@NotNull HybridViewModelInstanceSpec instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.listProperty.remove(requireHybridInstance(instance).getViewModelInstance());
    }

    @Override // com.margelo.nitro.rive.HybridViewModelListPropertySpec
    @NotNull
    public Promise<Unit> removeInstanceAsync(@NotNull HybridViewModelInstanceSpec instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        return com.margelo.nitro.core.f.a(Promise.Companion, new j1(this, instance, null, 1));
    }

    @Override // com.margelo.nitro.rive.HybridViewModelListPropertySpec
    public void removeInstanceAt(double index) {
        this.listProperty.removeAt((int) index);
    }

    @Override // com.margelo.nitro.rive.HybridViewModelListPropertySpec
    @NotNull
    public Promise<Unit> removeInstanceAtAsync(double index) {
        return com.margelo.nitro.core.f.a(Promise.Companion, new m1(this, index, null, 1));
    }

    @Override // com.margelo.nitro.rive.BaseHybridViewModelProperty
    public void removeListener(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.$$delegate_0.removeListener(id2);
    }

    @Override // com.margelo.nitro.rive.HybridViewModelListPropertySpec, com.margelo.nitro.rive.BaseHybridViewModelProperty
    @xa.a
    @Keep
    public void removeListeners() {
        this.$$delegate_0.removeListeners();
    }

    @Override // com.margelo.nitro.rive.HybridViewModelListPropertySpec
    public boolean swap(double index1, double index2) {
        int i7 = (int) index1;
        int i10 = (int) index2;
        if (i7 < 0 || i7 >= this.listProperty.getSize() || i10 < 0 || i10 >= this.listProperty.getSize()) {
            return false;
        }
        this.listProperty.swap(i7, i10);
        return true;
    }

    @Override // com.margelo.nitro.rive.HybridViewModelListPropertySpec
    @NotNull
    public Promise<Unit> swapAsync(double index1, double index2) {
        return com.margelo.nitro.core.f.a(Promise.Companion, new n1(this, index1, index2, null));
    }
}
