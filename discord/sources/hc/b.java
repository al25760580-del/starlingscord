package hc;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;
import com.google.android.exoplayer2.analytics.AnalyticsListener$Events;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.video.VideoSize;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface b {
    default void onAudioDecoderInitialized(AnalyticsListener$EventTime analyticsListener$EventTime, String str, long j, long j5) {
    }

    default void onAudioInputFormatChanged(AnalyticsListener$EventTime analyticsListener$EventTime, Format format) {
    }

    void onBandwidthEstimate(AnalyticsListener$EventTime analyticsListener$EventTime, int i7, long j, long j5);

    default void onCues(AnalyticsListener$EventTime analyticsListener$EventTime, List list) {
    }

    void onDownstreamFormatChanged(AnalyticsListener$EventTime analyticsListener$EventTime, MediaLoadData mediaLoadData);

    default void onDrmSessionAcquired(AnalyticsListener$EventTime analyticsListener$EventTime) {
    }

    void onEvents(Player player, AnalyticsListener$Events analyticsListener$Events);

    void onLoadError(AnalyticsListener$EventTime analyticsListener$EventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z5);

    default void onPositionDiscontinuity(AnalyticsListener$EventTime analyticsListener$EventTime, int i7) {
    }

    void onPositionDiscontinuity(AnalyticsListener$EventTime analyticsListener$EventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i7);

    default void onVideoDecoderInitialized(AnalyticsListener$EventTime analyticsListener$EventTime, String str, long j, long j5) {
    }

    default void onVideoInputFormatChanged(AnalyticsListener$EventTime analyticsListener$EventTime, Format format) {
    }

    default void onVideoSizeChanged(AnalyticsListener$EventTime analyticsListener$EventTime, int i7, int i10, int i11, float f2) {
    }

    void onVideoSizeChanged(AnalyticsListener$EventTime analyticsListener$EventTime, VideoSize videoSize);

    default void onAudioDecoderInitialized(AnalyticsListener$EventTime analyticsListener$EventTime, String str, long j) {
    }

    default void onAudioInputFormatChanged(AnalyticsListener$EventTime analyticsListener$EventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    default void onCues(AnalyticsListener$EventTime analyticsListener$EventTime, CueGroup cueGroup) {
    }

    default void onDrmSessionAcquired(AnalyticsListener$EventTime analyticsListener$EventTime, int i7) {
    }

    default void onVideoDecoderInitialized(AnalyticsListener$EventTime analyticsListener$EventTime, String str, long j) {
    }

    default void onVideoInputFormatChanged(AnalyticsListener$EventTime analyticsListener$EventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    default void onDrmKeysLoaded(AnalyticsListener$EventTime analyticsListener$EventTime) {
    }

    default void onDrmKeysRestored(AnalyticsListener$EventTime analyticsListener$EventTime) {
    }

    default void onDrmSessionReleased(AnalyticsListener$EventTime analyticsListener$EventTime) {
    }

    default void onPlayerReleased(AnalyticsListener$EventTime analyticsListener$EventTime) {
    }

    default void onSeekStarted(AnalyticsListener$EventTime analyticsListener$EventTime) {
    }

    default void onAudioCodecError(AnalyticsListener$EventTime analyticsListener$EventTime, Exception exc) {
    }

    default void onAudioDecoderReleased(AnalyticsListener$EventTime analyticsListener$EventTime, String str) {
    }

    default void onAudioDisabled(AnalyticsListener$EventTime analyticsListener$EventTime, DecoderCounters decoderCounters) {
    }

    default void onAudioEnabled(AnalyticsListener$EventTime analyticsListener$EventTime, DecoderCounters decoderCounters) {
    }

    default void onAudioPositionAdvancing(AnalyticsListener$EventTime analyticsListener$EventTime, long j) {
    }

    default void onAudioSinkError(AnalyticsListener$EventTime analyticsListener$EventTime, Exception exc) {
    }

    default void onAvailableCommandsChanged(AnalyticsListener$EventTime analyticsListener$EventTime, Player.Commands commands) {
    }

    default void onDrmSessionManagerError(AnalyticsListener$EventTime analyticsListener$EventTime, Exception exc) {
    }

    default void onIsLoadingChanged(AnalyticsListener$EventTime analyticsListener$EventTime, boolean z5) {
    }

    default void onIsPlayingChanged(AnalyticsListener$EventTime analyticsListener$EventTime, boolean z5) {
    }

    default void onLoadingChanged(AnalyticsListener$EventTime analyticsListener$EventTime, boolean z5) {
    }

    default void onMediaMetadataChanged(AnalyticsListener$EventTime analyticsListener$EventTime, MediaMetadata mediaMetadata) {
    }

    default void onMetadata(AnalyticsListener$EventTime analyticsListener$EventTime, Metadata metadata) {
    }

    default void onPlaybackParametersChanged(AnalyticsListener$EventTime analyticsListener$EventTime, PlaybackParameters playbackParameters) {
    }

    default void onPlaybackStateChanged(AnalyticsListener$EventTime analyticsListener$EventTime, int i7) {
    }

    default void onPlaybackSuppressionReasonChanged(AnalyticsListener$EventTime analyticsListener$EventTime, int i7) {
    }

    default void onPlayerError(AnalyticsListener$EventTime analyticsListener$EventTime, PlaybackException playbackException) {
    }

    default void onPlayerErrorChanged(AnalyticsListener$EventTime analyticsListener$EventTime, PlaybackException playbackException) {
    }

    default void onRepeatModeChanged(AnalyticsListener$EventTime analyticsListener$EventTime, int i7) {
    }

    default void onShuffleModeChanged(AnalyticsListener$EventTime analyticsListener$EventTime, boolean z5) {
    }

    default void onSkipSilenceEnabledChanged(AnalyticsListener$EventTime analyticsListener$EventTime, boolean z5) {
    }

    default void onTimelineChanged(AnalyticsListener$EventTime analyticsListener$EventTime, int i7) {
    }

    default void onTracksChanged(AnalyticsListener$EventTime analyticsListener$EventTime, Tracks tracks) {
    }

    default void onUpstreamDiscarded(AnalyticsListener$EventTime analyticsListener$EventTime, MediaLoadData mediaLoadData) {
    }

    default void onVideoCodecError(AnalyticsListener$EventTime analyticsListener$EventTime, Exception exc) {
    }

    default void onVideoDecoderReleased(AnalyticsListener$EventTime analyticsListener$EventTime, String str) {
    }

    default void onVideoDisabled(AnalyticsListener$EventTime analyticsListener$EventTime, DecoderCounters decoderCounters) {
    }

    default void onVideoEnabled(AnalyticsListener$EventTime analyticsListener$EventTime, DecoderCounters decoderCounters) {
    }

    default void onVolumeChanged(AnalyticsListener$EventTime analyticsListener$EventTime, float f2) {
    }

    default void onDroppedVideoFrames(AnalyticsListener$EventTime analyticsListener$EventTime, int i7, long j) {
    }

    default void onLoadCanceled(AnalyticsListener$EventTime analyticsListener$EventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onLoadCompleted(AnalyticsListener$EventTime analyticsListener$EventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onLoadStarted(AnalyticsListener$EventTime analyticsListener$EventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onMediaItemTransition(AnalyticsListener$EventTime analyticsListener$EventTime, MediaItem mediaItem, int i7) {
    }

    default void onPlayWhenReadyChanged(AnalyticsListener$EventTime analyticsListener$EventTime, boolean z5, int i7) {
    }

    default void onPlayerStateChanged(AnalyticsListener$EventTime analyticsListener$EventTime, boolean z5, int i7) {
    }

    default void onRenderedFirstFrame(AnalyticsListener$EventTime analyticsListener$EventTime, Object obj, long j) {
    }

    default void onSurfaceSizeChanged(AnalyticsListener$EventTime analyticsListener$EventTime, int i7, int i10) {
    }

    default void onVideoFrameProcessingOffset(AnalyticsListener$EventTime analyticsListener$EventTime, long j, int i7) {
    }

    default void onAudioUnderrun(AnalyticsListener$EventTime analyticsListener$EventTime, int i7, long j, long j5) {
    }
}
