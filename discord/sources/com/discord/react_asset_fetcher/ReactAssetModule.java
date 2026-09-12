package com.discord.react_asset_fetcher;

import com.discord.codegen.NativeReactAssetModuleSpec;
import com.discord.emoji.a;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/react_asset_fetcher/ReactAssetModule;", "Lcom/discord/codegen/NativeReactAssetModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "keysRequest", "", "callback", "Lcom/facebook/react/bridge/Callback;", "valuesResult", "values", "Lcom/facebook/react/bridge/ReadableArray;", "react_asset_fetcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactAssetModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactAssetModule.kt\ncom/discord/react_asset_fetcher/ReactAssetModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1878#2,3:37\n*S KotlinDebug\n*F\n+ 1 ReactAssetModule.kt\ncom/discord/react_asset_fetcher/ReactAssetModule\n*L\n29#1:37,3\n*E\n"})
public final class ReactAssetModule extends NativeReactAssetModuleSpec {

    @NotNull
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactAssetModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object keysRequest$lambda$0(ReactAsset key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return key.name();
    }

    @Override // com.discord.codegen.NativeReactAssetModuleSpec
    public void keysRequest(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(NativeArrayExtensionsKt.toNativeArray(ReactAsset.getEntries(), new a(24)));
    }

    @Override // com.discord.codegen.NativeReactAssetModuleSpec
    public void valuesResult(@NotNull ReadableArray values) {
        Intrinsics.checkNotNullParameter(values, "values");
        ReactAssetCache reactAssetCache = ReactAssetCache.INSTANCE;
        ReactApplicationContext reactApplicationContext = this.reactContext;
        HashMap map = new HashMap();
        int i7 = 0;
        for (Object obj : ReactAsset.getEntries()) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                d0.k();
                throw null;
            }
            String strName = ((ReactAsset) obj).name();
            String string = values.getString(i7);
            Intrinsics.checkNotNull(string);
            map.put(strName, string);
            i7 = i10;
        }
        Unit unit = Unit.f14616a;
        reactAssetCache.set(reactApplicationContext, map);
    }
}
