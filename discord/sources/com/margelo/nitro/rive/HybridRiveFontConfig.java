package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import app.rive.runtime.kotlin.fonts.FontHelper;
import app.rive.runtime.kotlin.fonts.Fonts;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.StackTraceHelper;
import com.margelo.nitro.NitroModules;
import com.margelo.nitro.core.ArrayBuffer;
import com.margelo.nitro.core.Promise;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001d¨\u0006!"}, d2 = {"Lcom/margelo/nitro/rive/HybridRiveFontConfig;", "Lcom/margelo/nitro/rive/HybridRiveFontConfigSpec;", "<init>", "()V", "", "url", "Lcom/margelo/nitro/core/Promise;", "Lcom/margelo/nitro/rive/HybridFallbackFontSpec;", "loadFontFromURL", "(Ljava/lang/String;)Lcom/margelo/nitro/core/Promise;", "resource", "loadFontFromResource", "(Ljava/lang/String;)Lcom/margelo/nitro/rive/HybridFallbackFontSpec;", "Lcom/margelo/nitro/core/ArrayBuffer;", "bytes", "loadFontFromBytes", "(Lcom/margelo/nitro/core/ArrayBuffer;)Lcom/margelo/nitro/rive/HybridFallbackFontSpec;", StackTraceHelper.NAME_KEY, "loadFontByName", "getSystemDefaultFont", "()Lcom/margelo/nitro/rive/HybridFallbackFontSpec;", "", "weight", "", "fonts", "", "setFontsForWeight", "(D[Lcom/margelo/nitro/rive/HybridFallbackFontSpec;)V", "applyFallbackFonts", "()Lcom/margelo/nitro/core/Promise;", "clearFallbackFonts", "Companion", "com/margelo/nitro/rive/g0", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@xa.a
@SourceDebugExtension({"SMAP\nHybridRiveFontConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HybridRiveFontConfig.kt\ncom/margelo/nitro/rive/HybridRiveFontConfig\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n1#2:138\n*E\n"})
public final class HybridRiveFontConfig extends HybridRiveFontConfigSpec {

    @NotNull
    public static final g0 Companion = new g0();
    private static final int DEFAULT_WEIGHT = 0;

    @NotNull
    private static final String TAG = "RiveFonts";

    @NotNull
    private static final Map<Integer, List<HybridFallbackFontSpec>> fontsByWeight;

    static {
        Map<Integer, List<HybridFallbackFontSpec>> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, "synchronizedMap(...)");
        fontsByWeight = mapSynchronizedMap;
    }

    @Override // com.margelo.nitro.rive.HybridRiveFontConfigSpec
    @NotNull
    public Promise<Unit> applyFallbackFonts() {
        return com.margelo.nitro.core.f.a(Promise.Companion, new i0(1, null));
    }

    @Override // com.margelo.nitro.rive.HybridRiveFontConfigSpec
    @NotNull
    public Promise<Unit> clearFallbackFonts() {
        return com.margelo.nitro.core.f.a(Promise.Companion, new j0(1, null));
    }

    @Override // com.margelo.nitro.rive.HybridRiveFontConfigSpec
    @NotNull
    public HybridFallbackFontSpec getSystemDefaultFont() {
        return new HybridDefaultFallbackFont();
    }

    @Override // com.margelo.nitro.rive.HybridRiveFontConfigSpec
    @NotNull
    public HybridFallbackFontSpec loadFontByName(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        FontHelper.Companion companion = FontHelper.INSTANCE;
        List<Fonts.Font> fallbackFonts = companion.getFallbackFonts(new Fonts.FontOpts(name, null, null, null, 14, null));
        if (fallbackFonts.isEmpty()) {
            throw new Error(a3.e.l("System font not found: ", name));
        }
        byte[] fontBytes = companion.getFontBytes((Fonts.Font) CollectionsKt.K(fallbackFonts));
        if (fontBytes != null) {
            return new HybridFallbackFont(fontBytes);
        }
        throw new Error(a3.e.l("Could not read font bytes for: ", name));
    }

    @Override // com.margelo.nitro.rive.HybridRiveFontConfigSpec
    @NotNull
    public HybridFallbackFontSpec loadFontFromBytes(@NotNull ArrayBuffer bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        ByteBuffer buffer = bytes.getBuffer(false);
        byte[] bArr = new byte[buffer.remaining()];
        buffer.get(bArr);
        return new HybridFallbackFont(bArr);
    }

    @Override // com.margelo.nitro.rive.HybridRiveFontConfigSpec
    @NotNull
    public HybridFallbackFontSpec loadFontFromResource(@NotNull String resource) throws IOException {
        Intrinsics.checkNotNullParameter(resource, "resource");
        NitroModules.Companion.getClass();
        ReactApplicationContext reactApplicationContext = NitroModules.applicationContext;
        if (reactApplicationContext == null) {
            throw new Error("Application context not available");
        }
        String strZ = StringsKt.Z(resource, resource);
        int identifier = reactApplicationContext.getResources().getIdentifier(strZ, "raw", reactApplicationContext.getPackageName());
        if (identifier != 0) {
            InputStream inputStreamOpenRawResource = reactApplicationContext.getResources().openRawResource(identifier);
            try {
                Intrinsics.checkNotNull(inputStreamOpenRawResource);
                byte[] bArrK = m3.m.K(inputStreamOpenRawResource);
                inputStreamOpenRawResource.close();
                return new HybridFallbackFont(bArrK);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ls.d.k(inputStreamOpenRawResource, th2);
                    throw th3;
                }
            }
        }
        int identifier2 = reactApplicationContext.getResources().getIdentifier(strZ, "font", reactApplicationContext.getPackageName());
        if (identifier2 != 0) {
            InputStream inputStreamOpenRawResource2 = reactApplicationContext.getResources().openRawResource(identifier2);
            try {
                Intrinsics.checkNotNull(inputStreamOpenRawResource2);
                byte[] bArrK2 = m3.m.K(inputStreamOpenRawResource2);
                inputStreamOpenRawResource2.close();
                return new HybridFallbackFont(bArrK2);
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    ls.d.k(inputStreamOpenRawResource2, th4);
                    throw th5;
                }
            }
        }
        Iterator it = kotlin.collections.d0.g("fonts/".concat(resource), resource).iterator();
        while (it.hasNext()) {
            try {
                InputStream inputStreamOpen = reactApplicationContext.getAssets().open((String) it.next());
                try {
                    continue;
                    Intrinsics.checkNotNull(inputStreamOpen);
                    byte[] bArrK3 = m3.m.K(inputStreamOpen);
                    inputStreamOpen.close();
                    return new HybridFallbackFont(bArrK3);
                } catch (Throwable th6) {
                    try {
                        continue;
                        throw th6;
                    } catch (Throwable th7) {
                        ls.d.k(inputStreamOpen, th6);
                        throw th7;
                    }
                }
            } catch (Exception unused) {
            }
        }
        throw new Error(s0.g.e("Font resource not found: ", resource, " (checked res/raw, res/font, assets/fonts)"));
    }

    @Override // com.margelo.nitro.rive.HybridRiveFontConfigSpec
    @NotNull
    public Promise<HybridFallbackFontSpec> loadFontFromURL(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return com.margelo.nitro.core.f.a(Promise.Companion, new com.margelo.nitro.playagerangedeclaration.d(url, null, 1));
    }

    @Override // com.margelo.nitro.rive.HybridRiveFontConfigSpec
    public void setFontsForWeight(double weight, @NotNull HybridFallbackFontSpec[] fonts) {
        Intrinsics.checkNotNullParameter(fonts, "fonts");
        int i7 = (int) weight;
        Map<Integer, List<HybridFallbackFontSpec>> map = fontsByWeight;
        synchronized (map) {
            map.put(Integer.valueOf(i7), kotlin.collections.y.H(fonts));
            Unit unit = Unit.f14616a;
        }
    }
}
