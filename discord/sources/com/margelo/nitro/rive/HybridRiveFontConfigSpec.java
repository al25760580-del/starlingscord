package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import com.facebook.react.devsupport.StackTraceHelper;
import com.margelo.nitro.core.ArrayBuffer;
import com.margelo.nitro.core.HybridObject;
import com.margelo.nitro.core.Promise;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004H'¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0004H'¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\u0007H'¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006H'¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006H'¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/margelo/nitro/rive/HybridRiveFontConfigSpec;", "Lcom/margelo/nitro/core/HybridObject;", "<init>", "()V", "", "url", "Lcom/margelo/nitro/core/Promise;", "Lcom/margelo/nitro/rive/HybridFallbackFontSpec;", "loadFontFromURL", "(Ljava/lang/String;)Lcom/margelo/nitro/core/Promise;", "resource", "loadFontFromResource", "(Ljava/lang/String;)Lcom/margelo/nitro/rive/HybridFallbackFontSpec;", "Lcom/margelo/nitro/core/ArrayBuffer;", "bytes", "loadFontFromBytes", "(Lcom/margelo/nitro/core/ArrayBuffer;)Lcom/margelo/nitro/rive/HybridFallbackFontSpec;", StackTraceHelper.NAME_KEY, "loadFontByName", "getSystemDefaultFont", "()Lcom/margelo/nitro/rive/HybridFallbackFontSpec;", "", "weight", "", "fonts", "", "setFontsForWeight", "(D[Lcom/margelo/nitro/rive/HybridFallbackFontSpec;)V", "applyFallbackFonts", "()Lcom/margelo/nitro/core/Promise;", "clearFallbackFonts", "toString", "()Ljava/lang/String;", "Lcom/margelo/nitro/rive/HybridRiveFontConfigSpec$CxxPart;", "createCxxPart", "()Lcom/margelo/nitro/rive/HybridRiveFontConfigSpec$CxxPart;", "Companion", "CxxPart", "com/margelo/nitro/rive/k0", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class HybridRiveFontConfigSpec extends HybridObject {

    @NotNull
    public static final k0 Companion = new k0();

    @NotNull
    protected static final String TAG = "HybridRiveFontConfigSpec";

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0015\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0094 ¨\u0006\b"}, d2 = {"Lcom/margelo/nitro/rive/HybridRiveFontConfigSpec$CxxPart;", "Lcom/margelo/nitro/core/HybridObject$CxxPart;", "javaPart", "Lcom/margelo/nitro/rive/HybridRiveFontConfigSpec;", "<init>", "(Lcom/margelo/nitro/rive/HybridRiveFontConfigSpec;)V", "initHybrid", "Lcom/facebook/jni/HybridData;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @xa.a
    public static class CxxPart extends HybridObject.CxxPart {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CxxPart(@NotNull HybridRiveFontConfigSpec javaPart) {
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
    public abstract Promise<Unit> applyFallbackFonts();

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<Unit> clearFallbackFonts();

    @xa.a
    @Keep
    @NotNull
    public abstract HybridFallbackFontSpec getSystemDefaultFont();

    @xa.a
    @Keep
    @NotNull
    public abstract HybridFallbackFontSpec loadFontByName(@NotNull String name);

    @xa.a
    @Keep
    @NotNull
    public abstract HybridFallbackFontSpec loadFontFromBytes(@NotNull ArrayBuffer bytes);

    @xa.a
    @Keep
    @NotNull
    public abstract HybridFallbackFontSpec loadFontFromResource(@NotNull String resource);

    @xa.a
    @Keep
    @NotNull
    public abstract Promise<HybridFallbackFontSpec> loadFontFromURL(@NotNull String url);

    @xa.a
    @Keep
    public abstract void setFontsForWeight(double weight, @NotNull HybridFallbackFontSpec[] fonts);

    @Override // com.margelo.nitro.core.HybridObject
    @NotNull
    public String toString() {
        return "[HybridObject RiveFontConfig]";
    }

    @Override // com.margelo.nitro.core.HybridObject
    @NotNull
    public CxxPart createCxxPart() {
        return new CxxPart(this);
    }
}
