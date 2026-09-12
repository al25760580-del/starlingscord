package com.discord;

import android.view.Surface;
import java.util.function.Consumer;
import org.webrtc.AndroidVideoDecoder;

/* JADX INFO: loaded from: classes.dex */
public interface DiscordDecoderStreamManagerDelegate {
    void addOnConsumerReadyListener(String str, Consumer<Surface> consumer);

    Surface getStreamConsumer(String str);

    void registerStreamProducer(String str, AndroidVideoDecoder androidVideoDecoder);

    void removeOnConsumerReadyListener(String str, Consumer<Surface> consumer);
}
