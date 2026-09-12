package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import com.margelo.nitro.core.ArrayBuffer;
import com.margelo.nitro.core.Promise;
import java.net.URI;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/margelo/nitro/rive/HybridRiveImageFactory;", "Lcom/margelo/nitro/rive/HybridRiveImageFactorySpec;", "<init>", "()V", "Lcom/margelo/nitro/rive/p;", "source", "Lcom/margelo/nitro/core/Promise;", "Lcom/margelo/nitro/rive/HybridRiveImageSpec;", "loadFromDataSource", "(Lcom/margelo/nitro/rive/p;)Lcom/margelo/nitro/core/Promise;", "", "url", "loadFromURLAsync", "(Ljava/lang/String;)Lcom/margelo/nitro/core/Promise;", "resource", "loadFromResourceAsync", "Lcom/margelo/nitro/core/ArrayBuffer;", "bytes", "loadFromBytesAsync", "(Lcom/margelo/nitro/core/ArrayBuffer;)Lcom/margelo/nitro/core/Promise;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HybridRiveImageFactory extends HybridRiveImageFactorySpec {
    private final Promise<HybridRiveImageSpec> loadFromDataSource(p source) {
        return com.margelo.nitro.core.f.a(Promise.Companion, new l0(source, null));
    }

    @Override // com.margelo.nitro.rive.HybridRiveImageFactorySpec
    @NotNull
    public Promise<HybridRiveImageSpec> loadFromBytesAsync(@NotNull ArrayBuffer bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(bytes, "buffer");
        ByteBuffer buffer = bytes.getBuffer(false);
        byte[] bArr = new byte[buffer.remaining()];
        buffer.get(bArr);
        return loadFromDataSource(new l(bArr));
    }

    @Override // com.margelo.nitro.rive.HybridRiveImageFactorySpec
    @NotNull
    public Promise<HybridRiveImageSpec> loadFromResourceAsync(@NotNull String resource) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(resource, "nameWithExtension");
        return loadFromDataSource(new o(StringsKt.Z(resource, resource)));
    }

    @Override // com.margelo.nitro.rive.HybridRiveImageFactorySpec
    @NotNull
    public Promise<HybridRiveImageSpec> loadFromURLAsync(@NotNull String url) {
        p nVar;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(url, "url");
        URI uri = new URI(url);
        if (Intrinsics.areEqual(uri.getScheme(), "file")) {
            String path = uri.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
            nVar = new m(path);
        } else {
            nVar = new n(url);
        }
        return loadFromDataSource(nVar);
    }
}
