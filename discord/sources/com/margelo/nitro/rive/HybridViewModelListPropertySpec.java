package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import com.margelo.nitro.core.Promise;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000 52\u00020\u0001:\u000267B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\r2\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\nH'¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\nH'¢\u0006\u0004\b\u0019\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH'¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\r2\u0006\u0010\u0012\u001a\u00020\nH'¢\u0006\u0004\b \u0010!J%\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130\r2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130\r2\u0006\u0010\u0012\u001a\u00020\nH'¢\u0006\u0004\b$\u0010!J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130\r2\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b%\u0010\u0011J%\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00130\r2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH'¢\u0006\u0004\b&\u0010'J#\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130(2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00130(H&¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0013H'¢\u0006\u0004\b+\u0010\u0003J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b0\u00101R\u0014\u00104\u001a\u00020\b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00068"}, d2 = {"Lcom/margelo/nitro/rive/HybridViewModelListPropertySpec;", "Lcom/margelo/nitro/rive/HybridViewModelPropertySpec;", "<init>", "()V", "Lcom/margelo/nitro/rive/Func_void;", "onChanged", "addListener_cxx", "(Lcom/margelo/nitro/rive/Func_void;)Lcom/margelo/nitro/rive/Func_void;", "", "index", "Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec;", "getInstanceAt", "(D)Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec;", "Lcom/margelo/nitro/core/Promise;", "getLengthAsync", "()Lcom/margelo/nitro/core/Promise;", "getInstanceAtAsync", "(D)Lcom/margelo/nitro/core/Promise;", "instance", "", "addInstance", "(Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec;)V", "", "addInstanceAt", "(Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec;D)Z", "removeInstance", "removeInstanceAt", "(D)V", "index1", "index2", "swap", "(DD)Z", "addInstanceAsync", "(Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec;)Lcom/margelo/nitro/core/Promise;", "addInstanceAtAsync", "(Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec;D)Lcom/margelo/nitro/core/Promise;", "removeInstanceAsync", "removeInstanceAtAsync", "swapAsync", "(DD)Lcom/margelo/nitro/core/Promise;", "Lkotlin/Function0;", "addListener", "(Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;", "removeListeners", "", "toString", "()Ljava/lang/String;", "Lcom/margelo/nitro/rive/HybridViewModelListPropertySpec$CxxPart;", "createCxxPart", "()Lcom/margelo/nitro/rive/HybridViewModelListPropertySpec$CxxPart;", "getLength", "()D", "length", "Companion", "CxxPart", "com/margelo/nitro/rive/o1", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class HybridViewModelListPropertySpec extends HybridViewModelPropertySpec {

    @NotNull
    public static final o1 Companion = new o1();

    @NotNull
    protected static final String TAG = "HybridViewModelListPropertySpec";

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0015\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0094 ¨\u0006\b"}, d2 = {"Lcom/margelo/nitro/rive/HybridViewModelListPropertySpec$CxxPart;", "Lcom/margelo/nitro/rive/HybridViewModelPropertySpec$CxxPart;", "javaPart", "Lcom/margelo/nitro/rive/HybridViewModelListPropertySpec;", "<init>", "(Lcom/margelo/nitro/rive/HybridViewModelListPropertySpec;)V", "initHybrid", "Lcom/facebook/jni/HybridData;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @xa.a
    public static class CxxPart extends HybridViewModelPropertySpec.CxxPart {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CxxPart(@NotNull HybridViewModelListPropertySpec javaPart) {
            super(javaPart);
            Intrinsics.checkNotNullParameter(javaPart, "javaPart");
        }

        @Override // com.margelo.nitro.rive.HybridViewModelPropertySpec.CxxPart, com.margelo.nitro.core.HybridObject.CxxPart
        @NotNull
        public native HybridData initHybrid();
    }

    @xa.a
    @Keep
    private final Func_void addListener_cxx(Func_void onChanged) {
        return new Func_void_java(addListener(onChanged));
    }

    @xa.a
    @Keep
    public abstract void addInstance(@NotNull HybridViewModelInstanceSpec instance);

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<Unit> addInstanceAsync(@NotNull HybridViewModelInstanceSpec instance);

    @xa.a
    @Keep
    public abstract boolean addInstanceAt(@NotNull HybridViewModelInstanceSpec instance, double index);

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<Unit> addInstanceAtAsync(@NotNull HybridViewModelInstanceSpec instance, double index);

    @NotNull
    public abstract Function0<Unit> addListener(@NotNull Function0<Unit> onChanged);

    @xa.a
    @Keep
    public abstract HybridViewModelInstanceSpec getInstanceAt(double index);

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<HybridViewModelInstanceSpec> getInstanceAtAsync(double index);

    @xa.a
    @Keep
    public abstract double getLength();

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<Double> getLengthAsync();

    @xa.a
    @Keep
    public abstract void removeInstance(@NotNull HybridViewModelInstanceSpec instance);

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<Unit> removeInstanceAsync(@NotNull HybridViewModelInstanceSpec instance);

    @xa.a
    @Keep
    public abstract void removeInstanceAt(double index);

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<Unit> removeInstanceAtAsync(double index);

    @xa.a
    @Keep
    public abstract void removeListeners();

    @xa.a
    @Keep
    public abstract boolean swap(double index1, double index2);

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<Unit> swapAsync(double index1, double index2);

    @Override // com.margelo.nitro.rive.HybridViewModelPropertySpec, com.margelo.nitro.core.HybridObject
    @NotNull
    public String toString() {
        return "[HybridObject ViewModelListProperty]";
    }

    @Override // com.margelo.nitro.rive.HybridViewModelPropertySpec, com.margelo.nitro.core.HybridObject
    @NotNull
    public CxxPart createCxxPart() {
        return new CxxPart(this);
    }
}
