package com.discord.media.engine;

import com.discord.p000native.engine.NativeEngine;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class MediaEngine$getAudioSubsystem$1$1 implements NativeEngine.GetAudioSubsystemCallback {
    final /* synthetic */ Function2<String, String, Unit> $cb;

    /* JADX WARN: Multi-variable type inference failed */
    public MediaEngine$getAudioSubsystem$1$1(Function2<? super String, ? super String, Unit> function2) {
        this.$cb = function2;
    }

    @Override // com.discord.native.engine.NativeEngine.GetAudioSubsystemCallback
    public final void onAudioSubsystem(String subsystem, String audioLayer) {
        Intrinsics.checkNotNullParameter(subsystem, "subsystem");
        Intrinsics.checkNotNullParameter(audioLayer, "audioLayer");
        this.$cb.invoke(subsystem, audioLayer);
    }
}
