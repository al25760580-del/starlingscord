package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import com.facebook.react.devsupport.StackTraceHelper;
import com.margelo.nitro.core.HybridObject;
import com.margelo.nitro.core.Promise;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\b'\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\b\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0005H'¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\nH'¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\nH'¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00042\u0006\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004H'¢\u0006\u0004\b\u0016\u0010\u0007J\u0017\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004H'¢\u0006\u0004\b\u0017\u0010\u0007J\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0014\u0010#\u001a\u00020\r8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0019¨\u0006'"}, d2 = {"Lcom/margelo/nitro/rive/HybridViewModelSpec;", "Lcom/margelo/nitro/core/HybridObject;", "<init>", "()V", "Lcom/margelo/nitro/core/Promise;", "", "getPropertyCountAsync", "()Lcom/margelo/nitro/core/Promise;", "getInstanceCountAsync", "index", "Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec;", "createInstanceByIndex", "(D)Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec;", "", StackTraceHelper.NAME_KEY, "createInstanceByName", "(Ljava/lang/String;)Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec;", "createDefaultInstance", "()Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec;", "createInstance", "createInstanceByNameAsync", "(Ljava/lang/String;)Lcom/margelo/nitro/core/Promise;", "createDefaultInstanceAsync", "createBlankInstanceAsync", "toString", "()Ljava/lang/String;", "Lcom/margelo/nitro/rive/HybridViewModelSpec$CxxPart;", "createCxxPart", "()Lcom/margelo/nitro/rive/HybridViewModelSpec$CxxPart;", "getPropertyCount", "()D", "propertyCount", "getInstanceCount", "instanceCount", "getModelName", "modelName", "Companion", "CxxPart", "com/margelo/nitro/rive/s1", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class HybridViewModelSpec extends HybridObject {

    @NotNull
    public static final s1 Companion = new s1();

    @NotNull
    protected static final String TAG = "HybridViewModelSpec";

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0015\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0094 ¨\u0006\b"}, d2 = {"Lcom/margelo/nitro/rive/HybridViewModelSpec$CxxPart;", "Lcom/margelo/nitro/core/HybridObject$CxxPart;", "javaPart", "Lcom/margelo/nitro/rive/HybridViewModelSpec;", "<init>", "(Lcom/margelo/nitro/rive/HybridViewModelSpec;)V", "initHybrid", "Lcom/facebook/jni/HybridData;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @xa.a
    public static class CxxPart extends HybridObject.CxxPart {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CxxPart(@NotNull HybridViewModelSpec javaPart) {
            super(javaPart);
            Intrinsics.checkNotNullParameter(javaPart, "javaPart");
        }

        @Override // com.margelo.nitro.core.HybridObject.CxxPart
        @NotNull
        public native HybridData initHybrid();
    }

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<HybridViewModelInstanceSpec> createBlankInstanceAsync();

    @xa.a
    @Keep
    public abstract HybridViewModelInstanceSpec createDefaultInstance();

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<HybridViewModelInstanceSpec> createDefaultInstanceAsync();

    @xa.a
    @Keep
    public abstract HybridViewModelInstanceSpec createInstance();

    @xa.a
    @Keep
    public abstract HybridViewModelInstanceSpec createInstanceByIndex(double index);

    @xa.a
    @Keep
    public abstract HybridViewModelInstanceSpec createInstanceByName(@NotNull String name);

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<HybridViewModelInstanceSpec> createInstanceByNameAsync(@NotNull String name);

    @xa.a
    @Keep
    public abstract double getInstanceCount();

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<Double> getInstanceCountAsync();

    @xa.a
    @Keep
    @NotNull
    public abstract String getModelName();

    @xa.a
    @Keep
    public abstract double getPropertyCount();

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<Double> getPropertyCountAsync();

    @Override // com.margelo.nitro.core.HybridObject
    @NotNull
    public String toString() {
        return "[HybridObject ViewModel]";
    }

    @Override // com.margelo.nitro.core.HybridObject
    @NotNull
    public CxxPart createCxxPart() {
        return new CxxPart(this);
    }
}
