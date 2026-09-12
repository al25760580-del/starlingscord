package com.google.android.exoplayer2;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.video.VideoSize;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface e {
    default void onAvailableCommandsChanged(Player.Commands commands) {
    }

    default void onCues(CueGroup cueGroup) {
    }

    default void onEvents(Player player, Player.Events events) {
    }

    default void onIsLoadingChanged(boolean z5) {
    }

    default void onIsPlayingChanged(boolean z5) {
    }

    default void onLoadingChanged(boolean z5) {
    }

    default void onMediaItemTransition(MediaItem mediaItem, int i7) {
    }

    default void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
    }

    default void onMetadata(Metadata metadata) {
    }

    default void onPlayWhenReadyChanged(boolean z5, int i7) {
    }

    default void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
    }

    default void onPlaybackStateChanged(int i7) {
    }

    default void onPlaybackSuppressionReasonChanged(int i7) {
    }

    default void onPlayerError(PlaybackException playbackException) {
    }

    default void onPlayerErrorChanged(PlaybackException playbackException) {
    }

    default void onPlayerStateChanged(boolean z5, int i7) {
    }

    default void onPositionDiscontinuity(int i7) {
    }

    default void onRenderedFirstFrame() {
    }

    default void onRepeatModeChanged(int i7) {
    }

    default void onShuffleModeEnabledChanged(boolean z5) {
    }

    default void onSkipSilenceEnabledChanged(boolean z5) {
    }

    default void onSurfaceSizeChanged(int i7, int i10) {
    }

    default void onTimelineChanged(Timeline timeline, int i7) {
    }

    default void onTracksChanged(Tracks tracks) {
    }

    default void onVideoSizeChanged(VideoSize videoSize) {
    }

    default void onVolumeChanged(float f2) {
    }

    default void onCues(List list) {
    }

    default void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i7) {
    }
}
