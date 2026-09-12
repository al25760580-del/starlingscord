package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/margelo/nitro/rive/HybridFallbackFont;", "Lcom/margelo/nitro/rive/HybridFallbackFontSpec;", "fontBytes", "", "<init>", "([B)V", "getFontBytes", "()[B", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HybridFallbackFont extends HybridFallbackFontSpec {

    @NotNull
    private final byte[] fontBytes;

    public HybridFallbackFont(@NotNull byte[] fontBytes) {
        Intrinsics.checkNotNullParameter(fontBytes, "fontBytes");
        this.fontBytes = fontBytes;
    }

    @NotNull
    public final byte[] getFontBytes() {
        return this.fontBytes;
    }
}
