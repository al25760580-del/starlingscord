package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import com.margelo.nitro.core.ArrayBuffer;
import com.margelo.nitro.core.HybridObject;
import com.margelo.nitro.core.Promise;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b\u000f\u0010\rJ/\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b\u0011\u0010\rJ/\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/margelo/nitro/rive/HybridRiveFileFactorySpec;", "Lcom/margelo/nitro/core/HybridObject;", "<init>", "()V", "", "url", "", "loadCdn", "Lcom/margelo/nitro/rive/ReferencedAssetsType;", "referencedAssets", "Lcom/margelo/nitro/core/Promise;", "Lcom/margelo/nitro/rive/HybridRiveFileSpec;", "fromURL", "(Ljava/lang/String;ZLcom/margelo/nitro/rive/ReferencedAssetsType;)Lcom/margelo/nitro/core/Promise;", "fileURL", "fromFileURL", "resource", "fromResource", "Lcom/margelo/nitro/core/ArrayBuffer;", "bytes", "fromBytes", "(Lcom/margelo/nitro/core/ArrayBuffer;ZLcom/margelo/nitro/rive/ReferencedAssetsType;)Lcom/margelo/nitro/core/Promise;", "toString", "()Ljava/lang/String;", "Lcom/margelo/nitro/rive/HybridRiveFileFactorySpec$CxxPart;", "createCxxPart", "()Lcom/margelo/nitro/rive/HybridRiveFileFactorySpec$CxxPart;", "Companion", "CxxPart", "com/margelo/nitro/rive/e0", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class HybridRiveFileFactorySpec extends HybridObject {

    @NotNull
    public static final e0 Companion = new e0();

    @NotNull
    protected static final String TAG = "HybridRiveFileFactorySpec";

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0015\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0094 ¨\u0006\b"}, d2 = {"Lcom/margelo/nitro/rive/HybridRiveFileFactorySpec$CxxPart;", "Lcom/margelo/nitro/core/HybridObject$CxxPart;", "javaPart", "Lcom/margelo/nitro/rive/HybridRiveFileFactorySpec;", "<init>", "(Lcom/margelo/nitro/rive/HybridRiveFileFactorySpec;)V", "initHybrid", "Lcom/facebook/jni/HybridData;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @xa.a
    public static class CxxPart extends HybridObject.CxxPart {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CxxPart(@NotNull HybridRiveFileFactorySpec javaPart) {
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
    public abstract Promise<HybridRiveFileSpec> fromBytes(@NotNull ArrayBuffer bytes, boolean loadCdn, ReferencedAssetsType referencedAssets);

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<HybridRiveFileSpec> fromFileURL(@NotNull String fileURL, boolean loadCdn, ReferencedAssetsType referencedAssets);

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<HybridRiveFileSpec> fromResource(@NotNull String resource, boolean loadCdn, ReferencedAssetsType referencedAssets);

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<HybridRiveFileSpec> fromURL(@NotNull String url, boolean loadCdn, ReferencedAssetsType referencedAssets);

    @Override // com.margelo.nitro.core.HybridObject
    @NotNull
    public String toString() {
        return "[HybridObject RiveFileFactory]";
    }

    @Override // com.margelo.nitro.core.HybridObject
    @NotNull
    public CxxPart createCxxPart() {
        return new CxxPart(this);
    }
}
