package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/margelo/nitro/rive/HybridViewModelArtboardPropertySpec;", "Lcom/margelo/nitro/rive/HybridViewModelPropertySpec;", "<init>", "()V", "Lcom/margelo/nitro/rive/HybridBindableArtboardSpec;", "artboard", "", "set", "(Lcom/margelo/nitro/rive/HybridBindableArtboardSpec;)V", "", "toString", "()Ljava/lang/String;", "Lcom/margelo/nitro/rive/HybridViewModelArtboardPropertySpec$CxxPart;", "createCxxPart", "()Lcom/margelo/nitro/rive/HybridViewModelArtboardPropertySpec$CxxPart;", "Companion", "CxxPart", "com/margelo/nitro/rive/z0", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class HybridViewModelArtboardPropertySpec extends HybridViewModelPropertySpec {

    @NotNull
    public static final z0 Companion = new z0();

    @NotNull
    protected static final String TAG = "HybridViewModelArtboardPropertySpec";

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0015\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0094 ¨\u0006\b"}, d2 = {"Lcom/margelo/nitro/rive/HybridViewModelArtboardPropertySpec$CxxPart;", "Lcom/margelo/nitro/rive/HybridViewModelPropertySpec$CxxPart;", "javaPart", "Lcom/margelo/nitro/rive/HybridViewModelArtboardPropertySpec;", "<init>", "(Lcom/margelo/nitro/rive/HybridViewModelArtboardPropertySpec;)V", "initHybrid", "Lcom/facebook/jni/HybridData;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @xa.a
    public static class CxxPart extends HybridViewModelPropertySpec.CxxPart {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CxxPart(@NotNull HybridViewModelArtboardPropertySpec javaPart) {
            super(javaPart);
            Intrinsics.checkNotNullParameter(javaPart, "javaPart");
        }

        @Override // com.margelo.nitro.rive.HybridViewModelPropertySpec.CxxPart, com.margelo.nitro.core.HybridObject.CxxPart
        @NotNull
        public native HybridData initHybrid();
    }

    @xa.a
    @Keep
    public abstract void set(HybridBindableArtboardSpec artboard);

    @Override // com.margelo.nitro.rive.HybridViewModelPropertySpec, com.margelo.nitro.core.HybridObject
    @NotNull
    public String toString() {
        return "[HybridObject ViewModelArtboardProperty]";
    }

    @Override // com.margelo.nitro.rive.HybridViewModelPropertySpec, com.margelo.nitro.core.HybridObject
    @NotNull
    public CxxPart createCxxPart() {
        return new CxxPart(this);
    }
}
