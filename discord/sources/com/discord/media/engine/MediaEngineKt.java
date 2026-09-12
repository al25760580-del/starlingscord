package com.discord.media.engine;

import com.discord.codegen.NativeMediaEngineModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getMediaEngine", "Lcom/discord/media/engine/MediaEngine;", "Lcom/facebook/react/bridge/ReactContext;", "media_engine_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MediaEngineKt {
    @NotNull
    public static final MediaEngine getMediaEngine(@NotNull ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "<this>");
        NativeModule nativeModule = reactContext.getNativeModule(NativeMediaEngineModuleSpec.NAME);
        Intrinsics.checkNotNull(nativeModule, "null cannot be cast to non-null type com.discord.media.engine.MediaEngineModule");
        return ((MediaEngineModule) nativeModule).getMediaEngine();
    }
}
