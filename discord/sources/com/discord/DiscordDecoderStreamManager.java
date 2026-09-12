package com.discord;

import android.view.Surface;
import java.util.function.Consumer;
import org.webrtc.AndroidVideoDecoder;

/* JADX INFO: loaded from: classes.dex */
public class DiscordDecoderStreamManager {
    private static DiscordDecoderStreamManagerDelegate delegate = null;
    private static boolean surfaceDirectPathEnabled = false;

    public static void addOnConsumerReadyListener(String str, Consumer<Surface> consumer) {
        checkDelegate();
        delegate.addOnConsumerReadyListener(str, consumer);
    }

    private static void checkDelegate() {
        if (delegate == null) {
            throw new IllegalStateException("DiscordDecoderStreamManagerDelegate cannot be null.");
        }
    }

    public static Surface getStreamConsumer(String str) {
        checkDelegate();
        return delegate.getStreamConsumer(str);
    }

    public static boolean isSurfaceDirectPathEnabled() {
        return surfaceDirectPathEnabled;
    }

    public static void registerStreamProducer(String str, AndroidVideoDecoder androidVideoDecoder) {
        checkDelegate();
        delegate.registerStreamProducer(str, androidVideoDecoder);
    }

    public static void removeOnConsumerReadyListener(String str, Consumer<Surface> consumer) {
        checkDelegate();
        delegate.removeOnConsumerReadyListener(str, consumer);
    }

    public static DiscordDecoderStreamManagerDelegate setDelegate(DiscordDecoderStreamManagerDelegate discordDecoderStreamManagerDelegate) {
        delegate = discordDecoderStreamManagerDelegate;
        return discordDecoderStreamManagerDelegate;
    }

    public static void setSurfaceDirectPathEnabled(boolean z5) {
        surfaceDirectPathEnabled = z5;
    }
}
