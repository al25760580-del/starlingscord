package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import com.margelo.nitro.core.Promise;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH'¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00122\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH'¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\r\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0010¨\u0006 "}, d2 = {"Lcom/margelo/nitro/rive/HybridViewModelStringPropertySpec;", "Lcom/margelo/nitro/rive/HybridViewModelPropertySpec;", "<init>", "()V", "Lcom/margelo/nitro/rive/Func_void_std__string;", "onChanged", "Lcom/margelo/nitro/rive/Func_void;", "addListener_cxx", "(Lcom/margelo/nitro/rive/Func_void_std__string;)Lcom/margelo/nitro/rive/Func_void;", "Lcom/margelo/nitro/core/Promise;", "", "getValueAsync", "()Lcom/margelo/nitro/core/Promise;", "value", "", "set", "(Ljava/lang/String;)V", "Lkotlin/Function1;", "Lkotlin/Function0;", "addListener", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;", "removeListeners", "toString", "()Ljava/lang/String;", "Lcom/margelo/nitro/rive/HybridViewModelStringPropertySpec$CxxPart;", "createCxxPart", "()Lcom/margelo/nitro/rive/HybridViewModelStringPropertySpec$CxxPart;", "getValue", "setValue", "Companion", "CxxPart", "com/margelo/nitro/rive/t1", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class HybridViewModelStringPropertySpec extends HybridViewModelPropertySpec {

    @NotNull
    public static final t1 Companion = new t1();

    @NotNull
    protected static final String TAG = "HybridViewModelStringPropertySpec";

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0015\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0094 ¨\u0006\b"}, d2 = {"Lcom/margelo/nitro/rive/HybridViewModelStringPropertySpec$CxxPart;", "Lcom/margelo/nitro/rive/HybridViewModelPropertySpec$CxxPart;", "javaPart", "Lcom/margelo/nitro/rive/HybridViewModelStringPropertySpec;", "<init>", "(Lcom/margelo/nitro/rive/HybridViewModelStringPropertySpec;)V", "initHybrid", "Lcom/facebook/jni/HybridData;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @xa.a
    public static class CxxPart extends HybridViewModelPropertySpec.CxxPart {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CxxPart(@NotNull HybridViewModelStringPropertySpec javaPart) {
            super(javaPart);
            Intrinsics.checkNotNullParameter(javaPart, "javaPart");
        }

        @Override // com.margelo.nitro.rive.HybridViewModelPropertySpec.CxxPart, com.margelo.nitro.core.HybridObject.CxxPart
        @NotNull
        public native HybridData initHybrid();
    }

    @xa.a
    @Keep
    private final Func_void addListener_cxx(Func_void_std__string onChanged) {
        return new Func_void_java(addListener(onChanged));
    }

    @NotNull
    public abstract Function0<Unit> addListener(@NotNull Function1<? super String, Unit> onChanged);

    @xa.a
    @Keep
    @NotNull
    public abstract String getValue();

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<String> getValueAsync();

    @xa.a
    @Keep
    public abstract void removeListeners();

    @xa.a
    @Keep
    public abstract void set(@NotNull String value);

    @xa.a
    @Keep
    public abstract void setValue(@NotNull String str);

    @Override // com.margelo.nitro.rive.HybridViewModelPropertySpec, com.margelo.nitro.core.HybridObject
    @NotNull
    public String toString() {
        return "[HybridObject ViewModelStringProperty]";
    }

    @Override // com.margelo.nitro.rive.HybridViewModelPropertySpec, com.margelo.nitro.core.HybridObject
    @NotNull
    public CxxPart createCxxPart() {
        return new CxxPart(this);
    }
}
