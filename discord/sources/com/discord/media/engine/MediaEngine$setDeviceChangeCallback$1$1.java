package com.discord.media.engine;

import com.discord.media.engine.types.NativeTypeExtensionsKt;
import com.discord.p000native.engine.AudioInputDeviceDescription;
import com.discord.p000native.engine.AudioOutputDeviceDescription;
import com.discord.p000native.engine.NativeEngine;
import com.discord.p000native.engine.VideoInputDeviceDescription;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class MediaEngine$setDeviceChangeCallback$1$1 implements NativeEngine.DeviceChangeCallback {
    final /* synthetic */ Function3 $callback;

    public MediaEngine$setDeviceChangeCallback$1$1(Function3 function3) {
        this.$callback = function3;
    }

    @Override // com.discord.native.engine.NativeEngine.DeviceChangeCallback
    public final void onChange(AudioInputDeviceDescription[] inputDevices, AudioOutputDeviceDescription[] outputDevices, VideoInputDeviceDescription[] videoInputDevices) {
        Intrinsics.checkNotNullParameter(inputDevices, "inputDevices");
        Intrinsics.checkNotNullParameter(outputDevices, "outputDevices");
        Intrinsics.checkNotNullParameter(videoInputDevices, "videoInputDevices");
        this.$callback.invoke(NativeTypeExtensionsKt.toListOfMaps(inputDevices), NativeTypeExtensionsKt.toListOfMaps(outputDevices), NativeTypeExtensionsKt.toListOfMaps(videoInputDevices));
    }
}
