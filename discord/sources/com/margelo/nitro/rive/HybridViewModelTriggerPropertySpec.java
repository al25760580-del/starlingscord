package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 \u00142\u00020\u0001:\u0002\u0015\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\tH'¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/margelo/nitro/rive/HybridViewModelTriggerPropertySpec;", "Lcom/margelo/nitro/rive/HybridViewModelPropertySpec;", "<init>", "()V", "Lcom/margelo/nitro/rive/Func_void;", "onChanged", "addListener_cxx", "(Lcom/margelo/nitro/rive/Func_void;)Lcom/margelo/nitro/rive/Func_void;", "Lkotlin/Function0;", "", "addListener", "(Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;", "trigger", "removeListeners", "", "toString", "()Ljava/lang/String;", "Lcom/margelo/nitro/rive/HybridViewModelTriggerPropertySpec$CxxPart;", "createCxxPart", "()Lcom/margelo/nitro/rive/HybridViewModelTriggerPropertySpec$CxxPart;", "Companion", "CxxPart", "com/margelo/nitro/rive/u1", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class HybridViewModelTriggerPropertySpec extends HybridViewModelPropertySpec {

    @NotNull
    public static final u1 Companion = new u1();

    @NotNull
    protected static final String TAG = "HybridViewModelTriggerPropertySpec";

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0015\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0094 ¨\u0006\b"}, d2 = {"Lcom/margelo/nitro/rive/HybridViewModelTriggerPropertySpec$CxxPart;", "Lcom/margelo/nitro/rive/HybridViewModelPropertySpec$CxxPart;", "javaPart", "Lcom/margelo/nitro/rive/HybridViewModelTriggerPropertySpec;", "<init>", "(Lcom/margelo/nitro/rive/HybridViewModelTriggerPropertySpec;)V", "initHybrid", "Lcom/facebook/jni/HybridData;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @xa.a
    public static class CxxPart extends HybridViewModelPropertySpec.CxxPart {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CxxPart(@NotNull HybridViewModelTriggerPropertySpec javaPart) {
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

    @NotNull
    public abstract Function0<Unit> addListener(@NotNull Function0<Unit> onChanged);

    @xa.a
    @Keep
    public abstract void removeListeners();

    @Override // com.margelo.nitro.rive.HybridViewModelPropertySpec, com.margelo.nitro.core.HybridObject
    @NotNull
    public String toString() {
        return "[HybridObject ViewModelTriggerProperty]";
    }

    @xa.a
    @Keep
    public abstract void trigger();

    @Override // com.margelo.nitro.rive.HybridViewModelPropertySpec, com.margelo.nitro.core.HybridObject
    @NotNull
    public CxxPart createCxxPart() {
        return new CxxPart(this);
    }
}
