package com.discord.media.engine.types;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.webrtc.VideoFrame;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/discord/media/engine/types/VideoSink;", "", "onFrame", "", "frame", "Lorg/webrtc/VideoFrame;", "mirror", "", "media_engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface VideoSink {
    void onFrame(@NotNull VideoFrame frame, boolean mirror);
}
