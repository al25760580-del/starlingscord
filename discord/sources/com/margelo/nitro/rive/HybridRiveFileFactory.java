package com.margelo.nitro.rive;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;
import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.Rive;
import com.margelo.nitro.NitroModules;
import com.margelo.nitro.core.ArrayBuffer;
import com.margelo.nitro.core.Promise;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J/\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u0016\u0010\u0012J/\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/margelo/nitro/rive/HybridRiveFileFactory;", "Lcom/margelo/nitro/rive/HybridRiveFileFactorySpec;", "<init>", "()V", "", "data", "Lcom/margelo/nitro/rive/ReferencedAssetsType;", "referencedAssets", "Lcom/margelo/nitro/rive/s;", "buildRiveFile", "([BLcom/margelo/nitro/rive/ReferencedAssetsType;)Lcom/margelo/nitro/rive/s;", "", "url", "", "loadCdn", "Lcom/margelo/nitro/core/Promise;", "Lcom/margelo/nitro/rive/HybridRiveFileSpec;", "fromURL", "(Ljava/lang/String;ZLcom/margelo/nitro/rive/ReferencedAssetsType;)Lcom/margelo/nitro/core/Promise;", "fileURL", "fromFileURL", "resource", "fromResource", "Lcom/margelo/nitro/core/ArrayBuffer;", "bytes", "fromBytes", "(Lcom/margelo/nitro/core/ArrayBuffer;ZLcom/margelo/nitro/rive/ReferencedAssetsType;)Lcom/margelo/nitro/core/Promise;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HybridRiveFileFactory extends HybridRiveFileFactorySpec {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final s buildRiveFile(byte[] data, ReferencedAssetsType referencedAssets) {
        v1 v1Var;
        Map<String, ResolvedReferencedAsset> data2;
        LinkedHashMap cache = new LinkedHashMap();
        x1 x1Var = new x1();
        Intrinsics.checkNotNullParameter(cache, "cache");
        if (referencedAssets == null || (data2 = referencedAssets.getData()) == null) {
            v1Var = null;
        } else {
            NitroModules.Companion.getClass();
            if (NitroModules.applicationContext == null) {
                v1Var = null;
            } else {
                v1Var = new v1(data2, cache, x1Var);
            }
        }
        File file = v1Var != null ? new File(data, Rive.INSTANCE.getDefaultRendererType(), v1Var) : new File(data, null, null, 6, null);
        if (v1Var == null) {
            x1Var = null;
        }
        return new s(file, cache, x1Var);
    }

    @Override // com.margelo.nitro.rive.HybridRiveFileFactorySpec
    @NotNull
    public Promise<HybridRiveFileSpec> fromBytes(@NotNull ArrayBuffer bytes, boolean loadCdn, ReferencedAssetsType referencedAssets) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return com.margelo.nitro.core.f.a(Promise.Companion, new b0(bytes.getBuffer(false), this, referencedAssets, null));
    }

    @Override // com.margelo.nitro.rive.HybridRiveFileFactorySpec
    @NotNull
    public Promise<HybridRiveFileSpec> fromFileURL(@NotNull String fileURL, boolean loadCdn, ReferencedAssetsType referencedAssets) {
        Intrinsics.checkNotNullParameter(fileURL, "fileURL");
        if (!kotlin.text.x.o(fileURL, "file://", false)) {
            throw new Error("fromFileURL: URL must be a file URL: ".concat(fileURL));
        }
        return com.margelo.nitro.core.f.a(Promise.Companion, new d0(fileURL, this, referencedAssets, null, 0));
    }

    @Override // com.margelo.nitro.rive.HybridRiveFileFactorySpec
    @SuppressLint({"DiscouragedApi"})
    @NotNull
    public Promise<HybridRiveFileSpec> fromResource(@NotNull String resource, boolean loadCdn, ReferencedAssetsType referencedAssets) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        return com.margelo.nitro.core.f.a(Promise.Companion, new d0(resource, this, referencedAssets, null, 1));
    }

    @Override // com.margelo.nitro.rive.HybridRiveFileFactorySpec
    @NotNull
    public Promise<HybridRiveFileSpec> fromURL(@NotNull String url, boolean loadCdn, ReferencedAssetsType referencedAssets) {
        Intrinsics.checkNotNullParameter(url, "url");
        return com.margelo.nitro.core.f.a(Promise.Companion, new d0(url, this, referencedAssets, null, 2));
    }
}
