package com.discord.media.engine;

import com.discord.p000native.engine.NativeEngine;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.webrtc.VideoFrame;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class MediaEngine$setVideoOutputSink$1$1 implements NativeEngine.VideoFrameCallback {
    final /* synthetic */ Function2<VideoFrame, Boolean, Boolean> $callback;

    /* JADX WARN: Multi-variable type inference failed */
    public MediaEngine$setVideoOutputSink$1$1(Function2<? super VideoFrame, ? super Boolean, Boolean> function2) {
        this.$callback = function2;
    }

    @Override // com.discord.native.engine.NativeEngine.VideoFrameCallback
    public final boolean onFrame(VideoFrame videoFrame, boolean z5) {
        Intrinsics.checkNotNullParameter(videoFrame, "videoFrame");
        return ((Boolean) this.$callback.invoke(videoFrame, Boolean.valueOf(z5))).booleanValue();
    }
}
