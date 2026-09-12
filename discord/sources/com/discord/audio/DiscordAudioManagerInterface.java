package com.discord.audio;

import com.facebook.react.uimanager.ViewProps;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\r\u001a\u00020\bH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H&¨\u0006\u0013"}, d2 = {"Lcom/discord/audio/DiscordAudioManagerInterface;", "", "setCommunicationModeOn", "", ViewProps.ON, "", "setActiveAudioDevice", "device", "Lcom/discord/audio/AndroidAudioDevice;", "addListener", "listener", "Lcom/discord/audio/DiscordAudioManagerListener;", "removeListener", "getEffectiveAudioDevice", "setSCORetryCount", "count", "", "getAudioDevices", "", "audio_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface DiscordAudioManagerInterface {
    void addListener(@NotNull DiscordAudioManagerListener listener);

    @NotNull
    Set<AndroidAudioDevice> getAudioDevices();

    @NotNull
    AndroidAudioDevice getEffectiveAudioDevice();

    void removeListener(@NotNull DiscordAudioManagerListener listener);

    void setActiveAudioDevice(@NotNull AndroidAudioDevice device);

    void setCommunicationModeOn(boolean on2);

    void setSCORetryCount(int count);
}
