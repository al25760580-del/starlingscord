package com.discord.media_player;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.discord.logging.Log;
import com.discord.media_player.reactevents.MediaPlayFinishedAnalytics;
import com.discord.resource_usage.DeviceResourceUsageRecorder;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;
import com.google.android.exoplayer2.analytics.AnalyticsListener$Events;
import com.google.android.exoplayer2.analytics.PlaybackStats;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.e;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.video.VideoSize;
import fe.g;
import fe.h;
import fe.r;
import gc.j;
import gc.m;
import gc.n0;
import gc.o;
import gc.p0;
import gc.v1;
import gc.w1;
import hc.a0;
import hc.u;
import he.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import je.e0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mc.s;
import md.i0;
import md.y0;
import org.jetbrains.annotations.NotNull;
import pc.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 N2\u00020\u0001:\u0003LMNB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJF\u0010 \u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)H\u0007J\b\u0010*\u001a\u00020\rH\u0007J\b\u0010+\u001a\u00020\rH\u0007J\u0006\u0010,\u001a\u00020\rJ\b\u0010-\u001a\u00020\rH\u0007J\u0010\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\u0013H\u0007J\b\u00100\u001a\u00020\rH\u0007J\u000e\u00101\u001a\u00020\r2\u0006\u00102\u001a\u00020%J\u0006\u00103\u001a\u00020%J\u0006\u00104\u001a\u00020%J\u0006\u00105\u001a\u00020%J\b\u00106\u001a\u00020\u0013H\u0007J\b\u00107\u001a\u00020\u0013H\u0007J\u0006\u00108\u001a\u00020\"J\u0006\u00109\u001a\u00020\"J\u0006\u0010:\u001a\u00020\"J\u0006\u0010;\u001a\u00020\"J\u0006\u0010<\u001a\u00020\"J\u0006\u0010=\u001a\u00020\"J\u0010\u0010>\u001a\u00020\r2\u0006\u0010?\u001a\u00020\fH\u0002J\b\u0010@\u001a\u00020\rH\u0002J\u0010\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020CH\u0002J \u0010D\u001a\u00020\"2\u0006\u0010B\u001a\u00020C2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020HH\u0002J\u000e\u0010I\u001a\u00020\"2\u0006\u0010J\u001a\u00020\u0007J\u0010\u0010K\u001a\u00020\r2\u0006\u0010&\u001a\u00020'H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006O"}, d2 = {"Lcom/discord/media_player/MediaPlayer;", "", "exoPlayer", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "dataSourceFactory", "Lcom/google/android/exoplayer2/upstream/DataSource$Factory;", "currentSettings", "Lcom/discord/media_player/MediaPlayer$PlayerSettings;", "<init>", "(Lcom/google/android/exoplayer2/SimpleExoPlayer;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/discord/media_player/MediaPlayer$PlayerSettings;)V", "eventListener", "Lkotlin/Function1;", "Lcom/discord/media_player/MediaPlayer$Event;", "", "getEventListener", "()Lkotlin/jvm/functions/Function1;", "setEventListener", "(Lkotlin/jvm/functions/Function1;)V", "volumeListener", "", "getVolumeListener", "setVolumeListener", "analyticsListener", "Lcom/discord/media_player/reactevents/MediaPlayFinishedAnalytics;", "getAnalyticsListener", "setAnalyticsListener", "mediaSource", "Lcom/discord/media_player/MediaSource;", "getMediaSource", "()Lcom/discord/media_player/MediaSource;", "setMediaSource", "(Lcom/discord/media_player/MediaSource;)V", "preparePlayer", "autoPlayWhenReady", "", "loopMedia", "initialSeekPositionMs", "", "mediaPlayerView", "Lcom/discord/media_player/MediaPlayerView;", "playerControlView", "Lcom/discord/media_player/MediaPlayerView$ControlView;", "release", "play", "playOrReset", "pause", "setVolume", "volume", "reset", "seekTo", "positionMs", "durationMs", "currentPositionMs", "bufferedPositionMs", "currentPositionPercentage", "bufferedPercentage", "shouldPlay", "isPlaying", "isBuffering", "hasError", "isMuted", "hasEnded", "setEvent", "event", "configureMultiAudioTrackSelection", "configureDefaultAudioTrackOverride", "trackSelector", "Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;", "findAndConfigureAudioRenderer", "mappedTrackInfo", "Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector$MappedTrackInfo;", "rendererIndex", "", "hasDifferentSettings", "newSettings", "reattachSurface", "Event", "PlayerSettings", "Factory", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMediaPlayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaPlayer.kt\ncom/discord/media_player/MediaPlayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,489:1\n1#2:490\n*E\n"})
public final class MediaPlayer {
    private static final int FIRST_AUDIO_GROUP = 0;
    private static final int FIRST_TRACK_IN_GROUP = 0;

    /* JADX INFO: renamed from: Factory, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final PlayerSettings defaultSettings = new PlayerSettings(20000, 20000, 1000, 1000, false, true, HttpEngine.DEFAULT);

    @NotNull
    private Function1<? super MediaPlayFinishedAnalytics, Unit> analyticsListener;

    @NotNull
    private final PlayerSettings currentSettings;

    @NotNull
    private final DataSource.Factory dataSourceFactory;

    @NotNull
    private Function1<? super Event, Unit> eventListener;

    @NotNull
    private final SimpleExoPlayer exoPlayer;
    private MediaSource mediaSource;

    @NotNull
    private Function1<? super Float, Unit> volumeListener;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/discord/media_player/MediaPlayer$Event;", "", "<init>", "()V", "BufferStart", "BufferEnd", "Paused", "StartedPlaying", "PlaybackEnded", "PlaybackError", "Lcom/discord/media_player/MediaPlayer$Event$BufferEnd;", "Lcom/discord/media_player/MediaPlayer$Event$BufferStart;", "Lcom/discord/media_player/MediaPlayer$Event$Paused;", "Lcom/discord/media_player/MediaPlayer$Event$PlaybackEnded;", "Lcom/discord/media_player/MediaPlayer$Event$PlaybackError;", "Lcom/discord/media_player/MediaPlayer$Event$StartedPlaying;", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Event {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/discord/media_player/MediaPlayer$Event$BufferEnd;", "Lcom/discord/media_player/MediaPlayer$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BufferEnd extends Event {

            @NotNull
            public static final BufferEnd INSTANCE = new BufferEnd();

            private BufferEnd() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof BufferEnd);
            }

            public int hashCode() {
                return 1704075707;
            }

            @NotNull
            public String toString() {
                return "BufferEnd";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/discord/media_player/MediaPlayer$Event$BufferStart;", "Lcom/discord/media_player/MediaPlayer$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BufferStart extends Event {

            @NotNull
            public static final BufferStart INSTANCE = new BufferStart();

            private BufferStart() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof BufferStart);
            }

            public int hashCode() {
                return 1247323458;
            }

            @NotNull
            public String toString() {
                return "BufferStart";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/discord/media_player/MediaPlayer$Event$Paused;", "Lcom/discord/media_player/MediaPlayer$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Paused extends Event {

            @NotNull
            public static final Paused INSTANCE = new Paused();

            private Paused() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Paused);
            }

            public int hashCode() {
                return -1136552978;
            }

            @NotNull
            public String toString() {
                return "Paused";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/discord/media_player/MediaPlayer$Event$PlaybackEnded;", "Lcom/discord/media_player/MediaPlayer$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PlaybackEnded extends Event {

            @NotNull
            public static final PlaybackEnded INSTANCE = new PlaybackEnded();

            private PlaybackEnded() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof PlaybackEnded);
            }

            public int hashCode() {
                return -1335489889;
            }

            @NotNull
            public String toString() {
                return "PlaybackEnded";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\t\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\n\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/discord/media_player/MediaPlayer$Event$PlaybackError;", "Lcom/discord/media_player/MediaPlayer$Event;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PlaybackError extends Event {

            @NotNull
            private final Exception exception;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlaybackError(@NotNull Exception exception) {
                super(null);
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.exception = exception;
            }

            public static /* synthetic */ PlaybackError copy$default(PlaybackError playbackError, Exception exc, int i7, Object obj) {
                if ((i7 & 1) != 0) {
                    exc = playbackError.exception;
                }
                return playbackError.copy(exc);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Exception getException() {
                return this.exception;
            }

            @NotNull
            public final PlaybackError copy(@NotNull Exception exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                return new PlaybackError(exception);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PlaybackError) && Intrinsics.areEqual(this.exception, ((PlaybackError) other).exception);
            }

            @NotNull
            public final Exception getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            @NotNull
            public String toString() {
                return "PlaybackError(exception=" + this.exception + ")";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/discord/media_player/MediaPlayer$Event$StartedPlaying;", "Lcom/discord/media_player/MediaPlayer$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class StartedPlaying extends Event {

            @NotNull
            public static final StartedPlaying INSTANCE = new StartedPlaying();

            private StartedPlaying() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof StartedPlaying);
            }

            public int hashCode() {
                return -142606547;
            }

            @NotNull
            public String toString() {
                return "StartedPlaying";
            }
        }

        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Event() {
        }
    }

    /* JADX INFO: renamed from: com.discord.media_player.MediaPlayer$Factory, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/discord/media_player/MediaPlayer$Factory;", "", "<init>", "()V", "FIRST_AUDIO_GROUP", "", "FIRST_TRACK_IN_GROUP", "defaultSettings", "Lcom/discord/media_player/MediaPlayer$PlayerSettings;", "getDefaultSettings", "()Lcom/discord/media_player/MediaPlayer$PlayerSettings;", "create", "Lcom/discord/media_player/MediaPlayer;", "context", "Landroid/content/Context;", "playerSettings", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ MediaPlayer create$default(Companion companion, Context context, PlayerSettings playerSettings, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                playerSettings = null;
            }
            return companion.create(context, playerSettings);
        }

        @NotNull
        public final MediaPlayer create(@NotNull Context context, PlayerSettings playerSettings) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (playerSettings == null) {
                playerSettings = getDefaultSettings();
            }
            int minBufferMs = playerSettings.getMinBufferMs();
            int maxBufferMs = playerSettings.getMaxBufferMs();
            int bufferForPlaybackMs = playerSettings.getBufferForPlaybackMs();
            int bufferForPlaybackAfterRebufferMs = playerSettings.getBufferForPlaybackAfterRebufferMs();
            j.a(bufferForPlaybackMs, 0, "bufferForPlaybackMs", "0");
            j.a(bufferForPlaybackAfterRebufferMs, 0, "bufferForPlaybackAfterRebufferMs", "0");
            j.a(minBufferMs, bufferForPlaybackMs, "minBufferMs", "bufferForPlaybackMs");
            j.a(minBufferMs, bufferForPlaybackAfterRebufferMs, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            j.a(maxBufferMs, minBufferMs, "maxBufferMs", "minBufferMs");
            j jVar = new j(new q(), minBufferMs, maxBufferMs, bufferForPlaybackMs, bufferForPlaybackAfterRebufferMs, false);
            Intrinsics.checkNotNullExpressionValue(jVar, "build(...)");
            gc.b bVar = new gc.b(context);
            bVar.f9562b = playerSettings.getEnableDecoderFallback();
            Intrinsics.checkNotNullExpressionValue(bVar, "setEnableDecoderFallback(...)");
            if (playerSettings.getEnableAsyncBufferQueueing()) {
                ((o9.d) bVar.f9563c).f17185e = 1;
            }
            m mVar = new m(context, bVar);
            je.b.k(!mVar.f9772s);
            mVar.f9761f = new app.rive.runtime.kotlin.core.a(26, jVar);
            DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(context);
            je.b.k(!mVar.f9772s);
            mVar.f9760e = new app.rive.runtime.kotlin.core.a(27, defaultTrackSelector);
            je.b.k(!mVar.f9772s);
            mVar.f9772s = true;
            SimpleExoPlayer simpleExoPlayer = new SimpleExoPlayer(mVar);
            Intrinsics.checkNotNullExpressionValue(simpleExoPlayer, "build(...)");
            return new MediaPlayer(simpleExoPlayer, CacheDataSourceFactory.INSTANCE.getInstance(playerSettings.getHttpEngine()), playerSettings);
        }

        @NotNull
        public final PlayerSettings getDefaultSettings() {
            return MediaPlayer.defaultSettings;
        }

        private Companion() {
        }
    }

    public MediaPlayer(@NotNull SimpleExoPlayer exoPlayer, @NotNull DataSource.Factory dataSourceFactory, @NotNull PlayerSettings currentSettings) {
        Intrinsics.checkNotNullParameter(exoPlayer, "exoPlayer");
        Intrinsics.checkNotNullParameter(dataSourceFactory, "dataSourceFactory");
        Intrinsics.checkNotNullParameter(currentSettings, "currentSettings");
        this.exoPlayer = exoPlayer;
        this.dataSourceFactory = dataSourceFactory;
        this.currentSettings = currentSettings;
        this.eventListener = new com.discord.emoji.a(11);
        this.volumeListener = new com.discord.emoji.a(12);
        this.analyticsListener = new com.discord.emoji.a(13);
        exoPlayer.u(new e() { // from class: com.discord.media_player.MediaPlayer.1
            public /* bridge */ /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
            }

            public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i7) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onCues(CueGroup cueGroup) {
            }

            public /* bridge */ /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
            }

            public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i7, boolean z5) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onEvents(Player player, Player.Events events) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z5) {
            }

            @Override // com.google.android.exoplayer2.e
            public void onIsPlayingChanged(boolean isPlaying) {
                if (isPlaying) {
                    MediaPlayer.this.setEvent(Event.StartedPlaying.INSTANCE);
                } else {
                    if (MediaPlayer.this.exoPlayer.w() == 4 || MediaPlayer.this.exoPlayer.w() == 2) {
                        return;
                    }
                    MediaPlayer.this.setEvent(Event.Paused.INSTANCE);
                }
            }

            @Override // com.google.android.exoplayer2.e
            @Deprecated
            public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z5) {
            }

            public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i7) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onMetadata(com.google.android.exoplayer2.metadata.Metadata metadata) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z5, int i7) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            }

            @Override // com.google.android.exoplayer2.e
            public void onPlaybackStateChanged(int playbackState) {
                if (playbackState == 2) {
                    MediaPlayer.this.setEvent(Event.BufferStart.INSTANCE);
                } else if (playbackState == 3) {
                    MediaPlayer.this.setEvent(Event.BufferEnd.INSTANCE);
                } else {
                    if (playbackState != 4) {
                        return;
                    }
                    MediaPlayer.this.setEvent(Event.PlaybackEnded.INSTANCE);
                }
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i7) {
            }

            @Override // com.google.android.exoplayer2.e
            public void onPlayerError(PlaybackException error) {
                Intrinsics.checkNotNullParameter(error, "error");
                MediaPlayer.this.setEvent(new Event.PlaybackError(error));
                Log log = Log.INSTANCE;
                Intrinsics.checkNotNullExpressionValue("", "getSimpleName(...)");
                MediaSource mediaSource = MediaPlayer.this.getMediaSource();
                log.e("", "Playback error for feature: " + (mediaSource != null ? mediaSource.getFeatureTag() : null), error);
                if (error instanceof com.google.android.exoplayer2.b) {
                    com.google.android.exoplayer2.b bVar = (com.google.android.exoplayer2.b) error;
                    int i7 = bVar.f5636w;
                    if (bVar.f5634i == 1) {
                        Intrinsics.checkNotNullExpressionValue("", "getSimpleName(...)");
                        MediaSource mediaSource2 = MediaPlayer.this.getMediaSource();
                        Log.e$default(log, "", "Disabling problematic renderer index " + i7 + ", retrying: " + (mediaSource2 != null ? mediaSource2.getFeatureTag() : null), (Throwable) null, 4, (Object) null);
                        SimpleExoPlayer simpleExoPlayer = MediaPlayer.this.exoPlayer;
                        simpleExoPlayer.c0();
                        com.google.android.exoplayer2.c cVar = simpleExoPlayer.f5586b;
                        cVar.x0();
                        r rVar = cVar.f5651h;
                        DefaultTrackSelector defaultTrackSelector = rVar instanceof DefaultTrackSelector ? (DefaultTrackSelector) rVar : null;
                        if (defaultTrackSelector == null) {
                            Intrinsics.checkNotNullExpressionValue("", "getSimpleName(...)");
                            Log.e$default(log, "", "TrackSelector is not of type DefaultTrackSelector.", (Throwable) null, 4, (Object) null);
                            return;
                        }
                        com.google.android.exoplayer2.trackselection.a aVarC = defaultTrackSelector.c();
                        aVarC.getClass();
                        g gVar = new g(aVarC);
                        Intrinsics.checkNotNullExpressionValue(gVar, "buildUponParameters(...)");
                        gVar.d(i7, true);
                        defaultTrackSelector.h(new com.google.android.exoplayer2.trackselection.a(gVar));
                        MediaPlayer.this.exoPlayer.a();
                        MediaPlayer.this.exoPlayer.r(true);
                    }
                }
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
            }

            @Override // com.google.android.exoplayer2.e
            @rn.d
            public void onPlayerStateChanged(boolean playWhenReady, int playbackState) {
                if (playWhenReady && playbackState == 3) {
                    MediaPlayer.this.exoPlayer.r(true);
                }
            }

            public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
            }

            @Override // com.google.android.exoplayer2.e
            @Deprecated
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i7) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i7) {
            }

            public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
            }

            public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z5) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z5) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i7, int i10) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onTimelineChanged(Timeline timeline, int i7) {
            }

            public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onTracksChanged(Tracks tracks) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onVolumeChanged(float f2) {
            }

            @Override // com.google.android.exoplayer2.e
            @Deprecated
            public /* bridge */ /* synthetic */ void onCues(List list) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i7) {
            }
        });
        a0 a0Var = new a0(new app.rive.runtime.kotlin.core.a(13, this));
        exoPlayer.c0();
        com.google.android.exoplayer2.c cVar = exoPlayer.f5586b;
        u uVar = (u) cVar.f5659q;
        uVar.getClass();
        uVar.f10476x.a(a0Var);
        hc.b bVar = new hc.b() { // from class: com.discord.media_player.MediaPlayer.3
            public /* bridge */ /* synthetic */ void onAudioAttributesChanged(AnalyticsListener$EventTime analyticsListener$EventTime, AudioAttributes audioAttributes) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onAudioCodecError(AnalyticsListener$EventTime analyticsListener$EventTime, Exception exc) {
            }

            @Override // hc.b
            @Deprecated
            public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(AnalyticsListener$EventTime analyticsListener$EventTime, String str, long j) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onAudioDecoderReleased(AnalyticsListener$EventTime analyticsListener$EventTime, String str) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onAudioDisabled(AnalyticsListener$EventTime analyticsListener$EventTime, DecoderCounters decoderCounters) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onAudioEnabled(AnalyticsListener$EventTime analyticsListener$EventTime, DecoderCounters decoderCounters) {
            }

            @Override // hc.b
            @Deprecated
            public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(AnalyticsListener$EventTime analyticsListener$EventTime, Format format) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onAudioPositionAdvancing(AnalyticsListener$EventTime analyticsListener$EventTime, long j) {
            }

            public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(AnalyticsListener$EventTime analyticsListener$EventTime, int i7) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onAudioSinkError(AnalyticsListener$EventTime analyticsListener$EventTime, Exception exc) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onAudioUnderrun(AnalyticsListener$EventTime analyticsListener$EventTime, int i7, long j, long j5) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(AnalyticsListener$EventTime analyticsListener$EventTime, Player.Commands commands) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onBandwidthEstimate(AnalyticsListener$EventTime analyticsListener$EventTime, int i7, long j, long j5) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onCues(AnalyticsListener$EventTime analyticsListener$EventTime, CueGroup cueGroup) {
            }

            public /* bridge */ /* synthetic */ void onDeviceInfoChanged(AnalyticsListener$EventTime analyticsListener$EventTime, DeviceInfo deviceInfo) {
            }

            public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(AnalyticsListener$EventTime analyticsListener$EventTime, int i7, boolean z5) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onDownstreamFormatChanged(AnalyticsListener$EventTime analyticsListener$EventTime, MediaLoadData mediaLoadData) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onDrmKeysLoaded(AnalyticsListener$EventTime analyticsListener$EventTime) {
            }

            public /* bridge */ /* synthetic */ void onDrmKeysRemoved(AnalyticsListener$EventTime analyticsListener$EventTime) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onDrmKeysRestored(AnalyticsListener$EventTime analyticsListener$EventTime) {
            }

            @Override // hc.b
            @Deprecated
            public /* bridge */ /* synthetic */ void onDrmSessionAcquired(AnalyticsListener$EventTime analyticsListener$EventTime) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onDrmSessionManagerError(AnalyticsListener$EventTime analyticsListener$EventTime, Exception exc) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onDrmSessionReleased(AnalyticsListener$EventTime analyticsListener$EventTime) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onDroppedVideoFrames(AnalyticsListener$EventTime analyticsListener$EventTime, int i7, long j) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onEvents(Player player, AnalyticsListener$Events analyticsListener$Events) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onIsLoadingChanged(AnalyticsListener$EventTime analyticsListener$EventTime, boolean z5) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onIsPlayingChanged(AnalyticsListener$EventTime analyticsListener$EventTime, boolean z5) {
            }

            @Override // hc.b
            public void onLoadCanceled(AnalyticsListener$EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                Intrinsics.checkNotNullParameter(loadEventInfo, "loadEventInfo");
                Intrinsics.checkNotNullParameter(mediaLoadData, "mediaLoadData");
                if (loadEventInfo.f5696a.isEmpty()) {
                    return;
                }
                DeviceResourceUsageRecorder.Companion companion = DeviceResourceUsageRecorder.INSTANCE;
                companion.setMediaPlayerBytesReceived(companion.getMediaPlayerBytesReceived() + loadEventInfo.f5697b);
            }

            @Override // hc.b
            public void onLoadCompleted(AnalyticsListener$EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                Intrinsics.checkNotNullParameter(loadEventInfo, "loadEventInfo");
                Intrinsics.checkNotNullParameter(mediaLoadData, "mediaLoadData");
                if (loadEventInfo.f5696a.isEmpty()) {
                    return;
                }
                DeviceResourceUsageRecorder.Companion companion = DeviceResourceUsageRecorder.INSTANCE;
                companion.setMediaPlayerBytesReceived(companion.getMediaPlayerBytesReceived() + loadEventInfo.f5697b);
            }

            @Override // hc.b
            public void onLoadError(AnalyticsListener$EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException error, boolean wasCanceled) {
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                Intrinsics.checkNotNullParameter(loadEventInfo, "loadEventInfo");
                Intrinsics.checkNotNullParameter(mediaLoadData, "mediaLoadData");
                Intrinsics.checkNotNullParameter(error, "error");
                if (loadEventInfo.f5696a.isEmpty()) {
                    return;
                }
                DeviceResourceUsageRecorder.Companion companion = DeviceResourceUsageRecorder.INSTANCE;
                companion.setMediaPlayerBytesReceived(companion.getMediaPlayerBytesReceived() + loadEventInfo.f5697b);
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onLoadStarted(AnalyticsListener$EventTime analyticsListener$EventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            }

            @Override // hc.b
            @Deprecated
            public /* bridge */ /* synthetic */ void onLoadingChanged(AnalyticsListener$EventTime analyticsListener$EventTime, boolean z5) {
            }

            public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(AnalyticsListener$EventTime analyticsListener$EventTime, long j) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onMediaItemTransition(AnalyticsListener$EventTime analyticsListener$EventTime, MediaItem mediaItem, int i7) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onMediaMetadataChanged(AnalyticsListener$EventTime analyticsListener$EventTime, MediaMetadata mediaMetadata) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onMetadata(AnalyticsListener$EventTime analyticsListener$EventTime, com.google.android.exoplayer2.metadata.Metadata metadata) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(AnalyticsListener$EventTime analyticsListener$EventTime, boolean z5, int i7) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(AnalyticsListener$EventTime analyticsListener$EventTime, PlaybackParameters playbackParameters) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onPlaybackStateChanged(AnalyticsListener$EventTime analyticsListener$EventTime, int i7) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(AnalyticsListener$EventTime analyticsListener$EventTime, int i7) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onPlayerError(AnalyticsListener$EventTime analyticsListener$EventTime, PlaybackException playbackException) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onPlayerErrorChanged(AnalyticsListener$EventTime analyticsListener$EventTime, PlaybackException playbackException) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onPlayerReleased(AnalyticsListener$EventTime analyticsListener$EventTime) {
            }

            @Override // hc.b
            @Deprecated
            public /* bridge */ /* synthetic */ void onPlayerStateChanged(AnalyticsListener$EventTime analyticsListener$EventTime, boolean z5, int i7) {
            }

            public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(AnalyticsListener$EventTime analyticsListener$EventTime, MediaMetadata mediaMetadata) {
            }

            @Override // hc.b
            @Deprecated
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(AnalyticsListener$EventTime analyticsListener$EventTime, int i7) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onRenderedFirstFrame(AnalyticsListener$EventTime analyticsListener$EventTime, Object obj, long j) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onRepeatModeChanged(AnalyticsListener$EventTime analyticsListener$EventTime, int i7) {
            }

            public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(AnalyticsListener$EventTime analyticsListener$EventTime, long j) {
            }

            public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(AnalyticsListener$EventTime analyticsListener$EventTime, long j) {
            }

            @Override // hc.b
            @Deprecated
            public /* bridge */ /* synthetic */ void onSeekStarted(AnalyticsListener$EventTime analyticsListener$EventTime) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onShuffleModeChanged(AnalyticsListener$EventTime analyticsListener$EventTime, boolean z5) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(AnalyticsListener$EventTime analyticsListener$EventTime, boolean z5) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(AnalyticsListener$EventTime analyticsListener$EventTime, int i7, int i10) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onTimelineChanged(AnalyticsListener$EventTime analyticsListener$EventTime, int i7) {
            }

            public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(AnalyticsListener$EventTime analyticsListener$EventTime, TrackSelectionParameters trackSelectionParameters) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onTracksChanged(AnalyticsListener$EventTime analyticsListener$EventTime, Tracks tracks) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onUpstreamDiscarded(AnalyticsListener$EventTime analyticsListener$EventTime, MediaLoadData mediaLoadData) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onVideoCodecError(AnalyticsListener$EventTime analyticsListener$EventTime, Exception exc) {
            }

            @Override // hc.b
            @Deprecated
            public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(AnalyticsListener$EventTime analyticsListener$EventTime, String str, long j) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onVideoDecoderReleased(AnalyticsListener$EventTime analyticsListener$EventTime, String str) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onVideoDisabled(AnalyticsListener$EventTime analyticsListener$EventTime, DecoderCounters decoderCounters) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onVideoEnabled(AnalyticsListener$EventTime analyticsListener$EventTime, DecoderCounters decoderCounters) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onVideoFrameProcessingOffset(AnalyticsListener$EventTime analyticsListener$EventTime, long j, int i7) {
            }

            @Override // hc.b
            @Deprecated
            public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(AnalyticsListener$EventTime analyticsListener$EventTime, Format format) {
            }

            @Override // hc.b
            @Deprecated
            public /* bridge */ /* synthetic */ void onVideoSizeChanged(AnalyticsListener$EventTime analyticsListener$EventTime, int i7, int i10, int i11, float f2) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onVolumeChanged(AnalyticsListener$EventTime analyticsListener$EventTime, float f2) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(AnalyticsListener$EventTime analyticsListener$EventTime, String str, long j, long j5) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(AnalyticsListener$EventTime analyticsListener$EventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            }

            @Override // hc.b
            @Deprecated
            public /* bridge */ /* synthetic */ void onCues(AnalyticsListener$EventTime analyticsListener$EventTime, List list) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onDrmSessionAcquired(AnalyticsListener$EventTime analyticsListener$EventTime, int i7) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(AnalyticsListener$EventTime analyticsListener$EventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i7) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(AnalyticsListener$EventTime analyticsListener$EventTime, String str, long j, long j5) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(AnalyticsListener$EventTime analyticsListener$EventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            }

            @Override // hc.b
            public /* bridge */ /* synthetic */ void onVideoSizeChanged(AnalyticsListener$EventTime analyticsListener$EventTime, VideoSize videoSize) {
            }
        };
        exoPlayer.c0();
        u uVar2 = (u) cVar.f5659q;
        uVar2.getClass();
        uVar2.f10476x.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(MediaPlayer mediaPlayer, AnalyticsListener$EventTime eventTime, PlaybackStats playbackStats) {
        String str;
        Uri uri;
        String lastPathSegment;
        String strW;
        Locale locale;
        String strP;
        String str2;
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(playbackStats, "playbackStats");
        if (playbackStats.N[3] == 0) {
            return;
        }
        v1 v1Var = new v1();
        eventTime.f5593b.n(eventTime.f5594c, v1Var);
        long jU = e0.U(v1Var.K);
        long duration = mediaPlayer.exoPlayer.getDuration();
        SimpleExoPlayer simpleExoPlayer = mediaPlayer.exoPlayer;
        Timeline timelineJ = simpleExoPlayer.J();
        long jX = sa.a.x(jU, duration, timelineJ.p() ? -9223372036854775807L : e0.U(timelineJ.m(simpleExoPlayer.D(), simpleExoPlayer.f5591a, 0L).K));
        Function1<? super MediaPlayFinishedAnalytics, Unit> function1 = mediaPlayer.analyticsListener;
        long[] jArr = playbackStats.N;
        long j = jArr[3];
        long j5 = jArr[6];
        int i7 = playbackStats.f5614n;
        int i10 = playbackStats.f5613m;
        long jF = lo.j.f(playbackStats.f5611i, 0L, 600000L);
        p0 p0Var = v1Var.f9911i.f5535i;
        String mimeTypeFromExtension = null;
        String strValueOf = String.valueOf(p0Var != null ? p0Var.f9811d : null);
        float f2 = jX / 1000.0f;
        p0 p0Var2 = v1Var.f9911i.f5535i;
        if (p0Var2 == null || (str2 = p0Var2.f9812e) == null) {
            if (p0Var2 != null && (uri = p0Var2.f9811d) != null && (lastPathSegment = uri.getLastPathSegment()) != null && (strW = StringsKt.W('.', lastPathSegment, "")) != null && (strP = a3.e.p((locale = Locale.ROOT), "ROOT", strW, locale, "toLowerCase(...)")) != null) {
                mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(strP);
            }
            str = mimeTypeFromExtension;
        } else {
            str = str2;
        }
        function1.invoke(new MediaPlayFinishedAnalytics(j, j5, i7, i10, jF, strValueOf, f2, str, playbackStats.J, playbackStats.K, playbackStats.G, playbackStats.F));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit analyticsListener$lambda$2(MediaPlayFinishedAnalytics it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureDefaultAudioTrackOverride(DefaultTrackSelector trackSelector) {
        MappingTrackSelector$MappedTrackInfo mappingTrackSelector$MappedTrackInfo = trackSelector.f9116c;
        if (mappingTrackSelector$MappedTrackInfo == null) {
            return;
        }
        int i7 = mappingTrackSelector$MappedTrackInfo.f5734a;
        for (int i10 = 0; i10 < i7 && !findAndConfigureAudioRenderer(trackSelector, mappingTrackSelector$MappedTrackInfo, i10); i10++) {
        }
    }

    private final void configureMultiAudioTrackSelection() {
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        simpleExoPlayer.c0();
        com.google.android.exoplayer2.c cVar = simpleExoPlayer.f5586b;
        cVar.x0();
        r rVar = cVar.f5651h;
        final DefaultTrackSelector defaultTrackSelector = rVar instanceof DefaultTrackSelector ? (DefaultTrackSelector) rVar : null;
        if (defaultTrackSelector == null) {
            return;
        }
        this.exoPlayer.u(new e() { // from class: com.discord.media_player.MediaPlayer$configureMultiAudioTrackSelection$listener$1
            public /* bridge */ /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
            }

            public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i7) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onCues(CueGroup cueGroup) {
            }

            public /* bridge */ /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
            }

            public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i7, boolean z5) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onEvents(Player player, Player.Events events) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z5) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z5) {
            }

            @Override // com.google.android.exoplayer2.e
            @Deprecated
            public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z5) {
            }

            public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i7) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onMetadata(com.google.android.exoplayer2.metadata.Metadata metadata) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z5, int i7) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onPlaybackStateChanged(int i7) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i7) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onPlayerError(PlaybackException playbackException) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
            }

            @Override // com.google.android.exoplayer2.e
            @Deprecated
            public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z5, int i7) {
            }

            public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
            }

            @Override // com.google.android.exoplayer2.e
            @Deprecated
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i7) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i7) {
            }

            public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
            }

            public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z5) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z5) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i7, int i10) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onTimelineChanged(Timeline timeline, int i7) {
            }

            public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
            }

            @Override // com.google.android.exoplayer2.e
            public void onTracksChanged(Tracks tracks) {
                Intrinsics.checkNotNullParameter(tracks, "tracks");
                ei.e0 e0Var = tracks.f5590d;
                Intrinsics.checkNotNullExpressionValue(e0Var, "getGroups(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj : e0Var) {
                    if (((w1) obj).f9929e.f15729i == 1) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                int i7 = 0;
                while (it.hasNext()) {
                    i7 += ((w1) it.next()).f9928d;
                }
                if (i7 <= 1) {
                    this.this$0.exoPlayer.m(this);
                    return;
                }
                try {
                    this.this$0.configureDefaultAudioTrackOverride(defaultTrackSelector);
                } catch (Exception e10) {
                    Log log = Log.INSTANCE;
                    MediaSource mediaSource = this.this$0.getMediaSource();
                    log.e("MediaPlayer", "Failed to configure multi-audio track selection for feature: " + (mediaSource != null ? mediaSource.getFeatureTag() : null), e10);
                }
                this.this$0.exoPlayer.m(this);
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onVolumeChanged(float f2) {
            }

            @Override // com.google.android.exoplayer2.e
            @Deprecated
            public /* bridge */ /* synthetic */ void onCues(List list) {
            }

            @Override // com.google.android.exoplayer2.e
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i7) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit eventListener$lambda$0(Event it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    private final boolean findAndConfigureAudioRenderer(DefaultTrackSelector trackSelector, MappingTrackSelector$MappedTrackInfo mappedTrackInfo, int rendererIndex) {
        if (mappedTrackInfo.f5735b[rendererIndex] != 1) {
            return false;
        }
        y0 y0Var = mappedTrackInfo.f5736c[rendererIndex];
        Intrinsics.checkNotNullExpressionValue(y0Var, "getTrackGroups(...)");
        int i7 = y0Var.f15737d;
        if (i7 > 1 && i7 != 0 && y0Var.a(0).f15727d != 0) {
            com.google.android.exoplayer2.trackselection.a aVarC = trackSelector.c();
            aVarC.getClass();
            g gVar = new g(aVarC);
            Intrinsics.checkNotNullExpressionValue(gVar, "buildUponParameters(...)");
            gVar.f9142x = false;
            gVar.e(rendererIndex, y0Var, new h(0, 0, new int[]{0}));
            trackSelector.h(new com.google.android.exoplayer2.trackselection.a(gVar));
        }
        return true;
    }

    public static /* synthetic */ void preparePlayer$default(MediaPlayer mediaPlayer, MediaSource mediaSource, boolean z5, boolean z6, long j, MediaPlayerView mediaPlayerView, MediaPlayerView.ControlView controlView, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z5 = false;
        }
        if ((i7 & 4) != 0) {
            z6 = false;
        }
        if ((i7 & 8) != 0) {
            j = 0;
        }
        if ((i7 & 16) != 0) {
            mediaPlayerView = null;
        }
        if ((i7 & 32) != 0) {
            controlView = null;
        }
        mediaPlayer.preparePlayer(mediaSource, z5, z6, j, mediaPlayerView, controlView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void setEvent(Event event) {
        MediaPlayerManager.INSTANCE.mediaPlayerEventHandler$media_player_release(event, this);
        this.eventListener.invoke(event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit volumeListener$lambda$1(float f2) {
        return Unit.f14616a;
    }

    public final float bufferedPercentage() {
        return this.exoPlayer.U() / 100.0f;
    }

    public final long bufferedPositionMs() {
        return this.exoPlayer.v();
    }

    public final long currentPositionMs() {
        return this.exoPlayer.S();
    }

    public final float currentPositionPercentage() {
        return currentPositionMs() / durationMs();
    }

    public final long durationMs() {
        return this.exoPlayer.getDuration();
    }

    @NotNull
    public final Function1<MediaPlayFinishedAnalytics, Unit> getAnalyticsListener() {
        return this.analyticsListener;
    }

    @NotNull
    public final Function1<Event, Unit> getEventListener() {
        return this.eventListener;
    }

    public final MediaSource getMediaSource() {
        return this.mediaSource;
    }

    @NotNull
    public final Function1<Float, Unit> getVolumeListener() {
        return this.volumeListener;
    }

    public final boolean hasDifferentSettings(@NotNull PlayerSettings newSettings) {
        Intrinsics.checkNotNullParameter(newSettings, "newSettings");
        return !Intrinsics.areEqual(this.currentSettings, newSettings);
    }

    public final boolean hasEnded() {
        return this.exoPlayer.w() == 4;
    }

    public final boolean hasError() {
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        simpleExoPlayer.c0();
        com.google.android.exoplayer2.c cVar = simpleExoPlayer.f5586b;
        cVar.x0();
        return cVar.f5650g0.f9719f != null;
    }

    public final boolean isBuffering() {
        return this.exoPlayer.w() == 2;
    }

    public final boolean isMuted() {
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        simpleExoPlayer.c0();
        com.google.android.exoplayer2.c cVar = simpleExoPlayer.f5586b;
        cVar.x0();
        return cVar.Z == 0.0f;
    }

    public final boolean isPlaying() {
        return this.exoPlayer.y();
    }

    public final void pause() {
        this.exoPlayer.r(false);
    }

    public final void play() {
        this.exoPlayer.r(true);
    }

    public final void playOrReset() {
        if (Math.abs(currentPositionMs() - durationMs()) < 0.1d) {
            seekTo(0L);
        }
        play();
    }

    public final void preparePlayer(@NotNull MediaSource mediaSource, boolean autoPlayWhenReady, boolean loopMedia, long initialSeekPositionMs, MediaPlayerView mediaPlayerView, MediaPlayerView.ControlView playerControlView) {
        s sVarA;
        Intrinsics.checkNotNullParameter(mediaSource, "mediaSource");
        this.mediaSource = mediaSource;
        if (mediaSource.getSourceUrl() == null) {
            return;
        }
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        simpleExoPlayer.c0();
        com.google.android.exoplayer2.c cVar = simpleExoPlayer.f5586b;
        cVar.x0();
        r rVar = cVar.f5651h;
        DefaultTrackSelector defaultTrackSelector = rVar instanceof DefaultTrackSelector ? (DefaultTrackSelector) rVar : null;
        if (defaultTrackSelector != null) {
            defaultTrackSelector.h(com.google.android.exoplayer2.trackselection.a.f5748o0);
        }
        SimpleExoPlayer simpleExoPlayer2 = this.exoPlayer;
        simpleExoPlayer2.c0();
        com.google.android.exoplayer2.c cVar2 = simpleExoPlayer2.f5586b;
        cVar2.x0();
        cVar2.V = 1;
        cVar2.o0(2, 4, 1);
        DataSource.Factory factory = this.dataSourceFactory;
        o oVar = new o(29, new i());
        Object obj = new Object();
        o9.d dVar = new o9.d(-1, 3);
        MediaItem mediaItemA = MediaItem.a(mediaSource.getSourceUrl());
        mediaItemA.f5534e.getClass();
        mediaItemA.f5534e.getClass();
        n0 n0Var = mediaItemA.f5534e.f9813i;
        if (n0Var == null || e0.f13788a < 18) {
            sVarA = s.f15573a;
        } else {
            synchronized (obj) {
                try {
                    sVarA = n0Var.equals(null) ? null : mc.g.a(n0Var);
                    sVarA.getClass();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        i0 i0Var = new i0(mediaItemA, factory, oVar, sVarA, dVar);
        Intrinsics.checkNotNullExpressionValue(i0Var, "createMediaSource(...)");
        SimpleExoPlayer simpleExoPlayer3 = this.exoPlayer;
        simpleExoPlayer3.c0();
        com.google.android.exoplayer2.c cVar3 = simpleExoPlayer3.f5586b;
        cVar3.x0();
        List listSingletonList = Collections.singletonList(i0Var);
        cVar3.x0();
        cVar3.p0(listSingletonList, true);
        if (initialSeekPositionMs >= 0) {
            simpleExoPlayer3.b0(5, initialSeekPositionMs);
        }
        simpleExoPlayer3.F(loopMedia ? 1 : 0);
        simpleExoPlayer3.a();
        configureMultiAudioTrackSelection();
        if (mediaPlayerView != null) {
            mediaPlayerView.assignViewToPlayer(this.exoPlayer);
        }
        if (mediaPlayerView != null) {
            mediaPlayerView.setPlayer$media_player_release(this.exoPlayer);
        }
        if (playerControlView != null) {
            playerControlView.setPlayer$media_player_release(this.exoPlayer);
        }
        if (autoPlayWhenReady) {
            play();
        }
    }

    public final void reattachSurface(@NotNull MediaPlayerView mediaPlayerView) {
        Intrinsics.checkNotNullParameter(mediaPlayerView, "mediaPlayerView");
        mediaPlayerView.assignViewToPlayer(this.exoPlayer);
    }

    public final void release() {
        this.exoPlayer.d0();
    }

    public final void reset() {
        String sourceUrl;
        s sVarA;
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        simpleExoPlayer.c0();
        com.google.android.exoplayer2.c cVar = simpleExoPlayer.f5586b;
        cVar.x0();
        r rVar = cVar.f5651h;
        DefaultTrackSelector defaultTrackSelector = rVar instanceof DefaultTrackSelector ? (DefaultTrackSelector) rVar : null;
        if (defaultTrackSelector != null) {
            defaultTrackSelector.h(com.google.android.exoplayer2.trackselection.a.f5748o0);
        }
        MediaSource mediaSource = this.mediaSource;
        if (mediaSource != null && (sourceUrl = mediaSource.getSourceUrl()) != null) {
            DataSource.Factory factory = this.dataSourceFactory;
            o oVar = new o(29, new i());
            Object obj = new Object();
            o9.d dVar = new o9.d(-1, 3);
            MediaItem mediaItemA = MediaItem.a(sourceUrl);
            mediaItemA.f5534e.getClass();
            mediaItemA.f5534e.getClass();
            n0 n0Var = mediaItemA.f5534e.f9813i;
            if (n0Var == null || e0.f13788a < 18) {
                sVarA = s.f15573a;
            } else {
                synchronized (obj) {
                    try {
                        sVarA = n0Var.equals(null) ? null : mc.g.a(n0Var);
                        sVarA.getClass();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            i0 i0Var = new i0(mediaItemA, factory, oVar, sVarA, dVar);
            Intrinsics.checkNotNullExpressionValue(i0Var, "createMediaSource(...)");
            SimpleExoPlayer simpleExoPlayer2 = this.exoPlayer;
            simpleExoPlayer2.c0();
            com.google.android.exoplayer2.c cVar2 = simpleExoPlayer2.f5586b;
            cVar2.x0();
            List listSingletonList = Collections.singletonList(i0Var);
            cVar2.x0();
            cVar2.p0(listSingletonList, true);
        }
        seekTo(0L);
        this.exoPlayer.r(false);
    }

    public final void seekTo(long positionMs) {
        try {
            this.exoPlayer.b0(5, positionMs);
        } catch (IllegalArgumentException e10) {
            Log log = Log.INSTANCE;
            Intrinsics.checkNotNullExpressionValue("MediaPlayer", "getSimpleName(...)");
            log.e("MediaPlayer", "Invalid seek position: " + positionMs, e10);
        }
    }

    public final void setAnalyticsListener(@NotNull Function1<? super MediaPlayFinishedAnalytics, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.analyticsListener = function1;
    }

    public final void setEventListener(@NotNull Function1<? super Event, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.eventListener = function1;
    }

    public final void setMediaSource(MediaSource mediaSource) {
        this.mediaSource = mediaSource;
    }

    public final void setVolume(float volume) {
        this.exoPlayer.f0(volume);
        this.volumeListener.invoke(Float.valueOf(volume));
    }

    public final void setVolumeListener(@NotNull Function1<? super Float, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.volumeListener = function1;
    }

    public final boolean shouldPlay() {
        return this.exoPlayer.g();
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/discord/media_player/MediaPlayer$PlayerSettings;", "", "minBufferMs", "", "maxBufferMs", "bufferForPlaybackMs", "bufferForPlaybackAfterRebufferMs", "enableDecoderFallback", "", "enableAsyncBufferQueueing", "httpEngine", "Lcom/discord/media_player/HttpEngine;", "<init>", "(IIIIZZLcom/discord/media_player/HttpEngine;)V", "getMinBufferMs", "()I", "getMaxBufferMs", "getBufferForPlaybackMs", "getBufferForPlaybackAfterRebufferMs", "getEnableDecoderFallback", "()Z", "getEnableAsyncBufferQueueing", "getHttpEngine", "()Lcom/discord/media_player/HttpEngine;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PlayerSettings {
        private final int bufferForPlaybackAfterRebufferMs;
        private final int bufferForPlaybackMs;
        private final boolean enableAsyncBufferQueueing;
        private final boolean enableDecoderFallback;

        @NotNull
        private final HttpEngine httpEngine;
        private final int maxBufferMs;
        private final int minBufferMs;

        public PlayerSettings(int i7, int i10, int i11, int i12, boolean z5, boolean z6, @NotNull HttpEngine httpEngine) {
            Intrinsics.checkNotNullParameter(httpEngine, "httpEngine");
            this.minBufferMs = i7;
            this.maxBufferMs = i10;
            this.bufferForPlaybackMs = i11;
            this.bufferForPlaybackAfterRebufferMs = i12;
            this.enableDecoderFallback = z5;
            this.enableAsyncBufferQueueing = z6;
            this.httpEngine = httpEngine;
        }

        public static /* synthetic */ PlayerSettings copy$default(PlayerSettings playerSettings, int i7, int i10, int i11, int i12, boolean z5, boolean z6, HttpEngine httpEngine, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i7 = playerSettings.minBufferMs;
            }
            if ((i13 & 2) != 0) {
                i10 = playerSettings.maxBufferMs;
            }
            if ((i13 & 4) != 0) {
                i11 = playerSettings.bufferForPlaybackMs;
            }
            if ((i13 & 8) != 0) {
                i12 = playerSettings.bufferForPlaybackAfterRebufferMs;
            }
            if ((i13 & 16) != 0) {
                z5 = playerSettings.enableDecoderFallback;
            }
            if ((i13 & 32) != 0) {
                z6 = playerSettings.enableAsyncBufferQueueing;
            }
            if ((i13 & 64) != 0) {
                httpEngine = playerSettings.httpEngine;
            }
            boolean z7 = z6;
            HttpEngine httpEngine2 = httpEngine;
            boolean z10 = z5;
            int i14 = i11;
            return playerSettings.copy(i7, i10, i14, i12, z10, z7, httpEngine2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMinBufferMs() {
            return this.minBufferMs;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getMaxBufferMs() {
            return this.maxBufferMs;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getBufferForPlaybackMs() {
            return this.bufferForPlaybackMs;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getBufferForPlaybackAfterRebufferMs() {
            return this.bufferForPlaybackAfterRebufferMs;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getEnableDecoderFallback() {
            return this.enableDecoderFallback;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getEnableAsyncBufferQueueing() {
            return this.enableAsyncBufferQueueing;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final HttpEngine getHttpEngine() {
            return this.httpEngine;
        }

        @NotNull
        public final PlayerSettings copy(int minBufferMs, int maxBufferMs, int bufferForPlaybackMs, int bufferForPlaybackAfterRebufferMs, boolean enableDecoderFallback, boolean enableAsyncBufferQueueing, @NotNull HttpEngine httpEngine) {
            Intrinsics.checkNotNullParameter(httpEngine, "httpEngine");
            return new PlayerSettings(minBufferMs, maxBufferMs, bufferForPlaybackMs, bufferForPlaybackAfterRebufferMs, enableDecoderFallback, enableAsyncBufferQueueing, httpEngine);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PlayerSettings)) {
                return false;
            }
            PlayerSettings playerSettings = (PlayerSettings) other;
            return this.minBufferMs == playerSettings.minBufferMs && this.maxBufferMs == playerSettings.maxBufferMs && this.bufferForPlaybackMs == playerSettings.bufferForPlaybackMs && this.bufferForPlaybackAfterRebufferMs == playerSettings.bufferForPlaybackAfterRebufferMs && this.enableDecoderFallback == playerSettings.enableDecoderFallback && this.enableAsyncBufferQueueing == playerSettings.enableAsyncBufferQueueing && this.httpEngine == playerSettings.httpEngine;
        }

        public final int getBufferForPlaybackAfterRebufferMs() {
            return this.bufferForPlaybackAfterRebufferMs;
        }

        public final int getBufferForPlaybackMs() {
            return this.bufferForPlaybackMs;
        }

        public final boolean getEnableAsyncBufferQueueing() {
            return this.enableAsyncBufferQueueing;
        }

        public final boolean getEnableDecoderFallback() {
            return this.enableDecoderFallback;
        }

        @NotNull
        public final HttpEngine getHttpEngine() {
            return this.httpEngine;
        }

        public final int getMaxBufferMs() {
            return this.maxBufferMs;
        }

        public final int getMinBufferMs() {
            return this.minBufferMs;
        }

        public int hashCode() {
            return this.httpEngine.hashCode() + com.discord.chat.presentation.list.a.g(com.discord.chat.presentation.list.a.g(com.discord.chat.presentation.list.a.u(this.bufferForPlaybackAfterRebufferMs, com.discord.chat.presentation.list.a.u(this.bufferForPlaybackMs, com.discord.chat.presentation.list.a.u(this.maxBufferMs, Integer.hashCode(this.minBufferMs) * 31, 31), 31), 31), 31, this.enableDecoderFallback), 31, this.enableAsyncBufferQueueing);
        }

        @NotNull
        public String toString() {
            int i7 = this.minBufferMs;
            int i10 = this.maxBufferMs;
            int i11 = this.bufferForPlaybackMs;
            int i12 = this.bufferForPlaybackAfterRebufferMs;
            boolean z5 = this.enableDecoderFallback;
            boolean z6 = this.enableAsyncBufferQueueing;
            HttpEngine httpEngine = this.httpEngine;
            StringBuilder sbR = a3.e.r(i7, "PlayerSettings(minBufferMs=", i10, ", maxBufferMs=", ", bufferForPlaybackMs=");
            a3.e.z(sbR, i11, ", bufferForPlaybackAfterRebufferMs=", i12, ", enableDecoderFallback=");
            a3.e.B(sbR, z5, ", enableAsyncBufferQueueing=", z6, ", httpEngine=");
            sbR.append(httpEngine);
            sbR.append(")");
            return sbR.toString();
        }

        public /* synthetic */ PlayerSettings(int i7, int i10, int i11, int i12, boolean z5, boolean z6, HttpEngine httpEngine, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(i7, i10, i11, i12, z5, z6, (i13 & 64) != 0 ? HttpEngine.DEFAULT : httpEngine);
        }
    }
}
