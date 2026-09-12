package com.discord.media.engine;

import com.discord.media.engine.types.NativeTypeExtensionsKt;
import com.discord.p000native.engine.AudioInputInitializationInfo;
import com.discord.p000native.engine.NativeEngine;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class MediaEngine$setAudioInputInitializationCallback$1$1 implements NativeEngine.AudioInputInitializationCallback {
    final /* synthetic */ Function2<Double, Map<String, ? extends Object>, Unit> $callback;

    /* JADX WARN: Multi-variable type inference failed */
    public MediaEngine$setAudioInputInitializationCallback$1$1(Function2<? super Double, ? super Map<String, ? extends Object>, Unit> function2) {
        this.$callback = function2;
    }

    @Override // com.discord.native.engine.NativeEngine.AudioInputInitializationCallback
    public final void onAudioInputInitialized(AudioInputInitializationInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.$callback.invoke(Double.valueOf(info.getTimeToInitializedNanos() / 1.0E9d), NativeTypeExtensionsKt.toMap(info.getDescription()));
    }
}
