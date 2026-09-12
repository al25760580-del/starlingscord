package com.discord.media_player;

import android.content.Context;
import ar.b0;
import ar.k0;
import ar.q1;
import ar.u0;
import dr.z;
import fr.q;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001-B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\bH\u0000¢\u0006\u0002\b\u001fJ\u0006\u0010 \u001a\u00020\u000fJ\u0006\u0010!\u001a\u00020\u000fJ\u0016\u0010\"\u001a\u00020\u000f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0002J\u001e\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020)J\u0015\u0010*\u001a\u00020+2\b\u0010'\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010,R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0012\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u000b0\u00140\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017¨\u0006."}, d2 = {"Lcom/discord/media_player/MediaPlayerManager;", "", "<init>", "()V", "MAX_PLAYER_SIZE", "", "playerPool", "Ljava/util/concurrent/ArrayBlockingQueue;", "Lcom/discord/media_player/MediaPlayer;", "acquiredPlayerMap", "", "", "activePlayerRef", "Ljava/lang/ref/WeakReference;", "activeMonitoringJob", "Lkotlinx/coroutines/Job;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "playbackRateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlin/Pair;", "Lcom/discord/media_player/MediaSource;", "getPlaybackRateFlow$media_player_release", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "playbackProgressFlow", "Lcom/discord/media_player/MediaPlayerManager$PlaybackProgress;", "getPlaybackProgressFlow$media_player_release", "mediaPlayerEventHandler", "event", "Lcom/discord/media_player/MediaPlayer$Event;", "mediaPlayer", "mediaPlayerEventHandler$media_player_release", "playActivePlayer", "pauseActivePlayer", "startProgressMonitor", "playerRef", "acquire", "context", "Landroid/content/Context;", "key", "playerSettings", "Lcom/discord/media_player/MediaPlayer$PlayerSettings;", "release", "", "(Ljava/lang/Double;)Z", "PlaybackProgress", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMediaPlayerManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaPlayerManager.kt\ncom/discord/media_player/MediaPlayerManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
public final class MediaPlayerManager {
    private static final int MAX_PLAYER_SIZE = 15;
    private static Job activeMonitoringJob;
    private static WeakReference<MediaPlayer> activePlayerRef;

    @NotNull
    private static final MutableStateFlow playbackProgressFlow;

    @NotNull
    private static final MutableStateFlow playbackRateFlow;

    @NotNull
    private static final CoroutineScope scope;

    @NotNull
    public static final MediaPlayerManager INSTANCE = new MediaPlayerManager();

    @NotNull
    private static final ArrayBlockingQueue<MediaPlayer> playerPool = new ArrayBlockingQueue<>(15);

    @NotNull
    private static Map<Double, MediaPlayer> acquiredPlayerMap = new LinkedHashMap();

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/discord/media_player/MediaPlayerManager$PlaybackProgress;", "", "source", "Lcom/discord/media_player/MediaSource;", "timeMs", "", "durationMs", "<init>", "(Lcom/discord/media_player/MediaSource;JJ)V", "getSource", "()Lcom/discord/media_player/MediaSource;", "getTimeMs", "()J", "getDurationMs", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PlaybackProgress {
        private final long durationMs;
        private final MediaSource source;
        private final long timeMs;

        public PlaybackProgress(MediaSource mediaSource, long j, long j5) {
            this.source = mediaSource;
            this.timeMs = j;
            this.durationMs = j5;
        }

        public static /* synthetic */ PlaybackProgress copy$default(PlaybackProgress playbackProgress, MediaSource mediaSource, long j, long j5, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                mediaSource = playbackProgress.source;
            }
            if ((i7 & 2) != 0) {
                j = playbackProgress.timeMs;
            }
            if ((i7 & 4) != 0) {
                j5 = playbackProgress.durationMs;
            }
            return playbackProgress.copy(mediaSource, j, j5);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final MediaSource getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimeMs() {
            return this.timeMs;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getDurationMs() {
            return this.durationMs;
        }

        @NotNull
        public final PlaybackProgress copy(MediaSource source, long timeMs, long durationMs) {
            return new PlaybackProgress(source, timeMs, durationMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PlaybackProgress)) {
                return false;
            }
            PlaybackProgress playbackProgress = (PlaybackProgress) other;
            return Intrinsics.areEqual(this.source, playbackProgress.source) && this.timeMs == playbackProgress.timeMs && this.durationMs == playbackProgress.durationMs;
        }

        public final long getDurationMs() {
            return this.durationMs;
        }

        public final MediaSource getSource() {
            return this.source;
        }

        public final long getTimeMs() {
            return this.timeMs;
        }

        public int hashCode() {
            MediaSource mediaSource = this.source;
            return Long.hashCode(this.durationMs) + com.discord.chat.presentation.list.a.h(this.timeMs, (mediaSource == null ? 0 : mediaSource.hashCode()) * 31, 31);
        }

        @NotNull
        public String toString() {
            return "PlaybackProgress(source=" + this.source + ", timeMs=" + this.timeMs + ", durationMs=" + this.durationMs + ")";
        }
    }

    /* JADX INFO: renamed from: com.discord.media_player.MediaPlayerManager$pauseActivePlayer$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media_player.MediaPlayerManager$pauseActivePlayer$1", f = "MediaPlayerManager.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            MediaPlayer mediaPlayer;
            wn.a aVar = wn.a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            WeakReference weakReference = MediaPlayerManager.activePlayerRef;
            if (weakReference != null && (mediaPlayer = (MediaPlayer) weakReference.get()) != null) {
                mediaPlayer.pause();
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media_player.MediaPlayerManager$playActivePlayer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media_player.MediaPlayerManager$playActivePlayer$1", f = "MediaPlayerManager.kt", l = {}, m = "invokeSuspend")
    public static final class C01981 extends h implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        public C01981(Continuation continuation) {
            super(2, continuation);
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new C01981(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            MediaPlayer mediaPlayer;
            wn.a aVar = wn.a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            WeakReference weakReference = MediaPlayerManager.activePlayerRef;
            if (weakReference != null && (mediaPlayer = (MediaPlayer) weakReference.get()) != null) {
                mediaPlayer.playOrReset();
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01981) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media_player.MediaPlayerManager$startProgressMonitor$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media_player.MediaPlayerManager$startProgressMonitor$1", f = "MediaPlayerManager.kt", l = {116}, m = "invokeSuspend")
    public static final class C01991 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ WeakReference<MediaPlayer> $playerRef;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01991(WeakReference<MediaPlayer> weakReference, Continuation continuation) {
            super(2, continuation);
            this.$playerRef = weakReference;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new C01991(this.$playerRef, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 != 0 && i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            do {
                MediaPlayer mediaPlayer = this.$playerRef.get();
                if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
                    return Unit.f14616a;
                }
                MediaPlayerManager.INSTANCE.getPlaybackProgressFlow$media_player_release().setValue(new PlaybackProgress(mediaPlayer.getMediaSource(), mediaPlayer.currentPositionMs(), mediaPlayer.durationMs()));
                this.label = 1;
            } while (b0.j(100L, this) != aVar);
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01991) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    static {
        q1 q1Var = new q1();
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        scope = b0.b(e.c(q1Var, new u0(executorServiceNewSingleThreadExecutor)));
        playbackRateFlow = z.b(new Pair(null, Double.valueOf(0.0d)));
        playbackProgressFlow = z.b(new PlaybackProgress(null, 0L, 0L));
    }

    private MediaPlayerManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job startProgressMonitor(WeakReference<MediaPlayer> playerRef) {
        CoroutineScope coroutineScope = scope;
        hr.e eVar = k0.f2938a;
        return b0.t(coroutineScope, q.f9394a, new C01991(playerRef, null), 2);
    }

    @NotNull
    public final synchronized MediaPlayer acquire(@NotNull Context context, double key, @NotNull MediaPlayer.PlayerSettings playerSettings) {
        Double d6;
        MediaPlayer mediaPlayerRemove;
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(playerSettings, "playerSettings");
            MediaPlayer mediaPlayer = acquiredPlayerMap.get(Double.valueOf(key));
            if (mediaPlayer != null) {
                return mediaPlayer;
            }
            ArrayBlockingQueue<MediaPlayer> arrayBlockingQueue = playerPool;
            MediaPlayer mediaPlayerPoll = arrayBlockingQueue.poll();
            if (mediaPlayerPoll == null) {
                if (acquiredPlayerMap.size() >= 15 && (d6 = (Double) CollectionsKt.L(acquiredPlayerMap.keySet())) != null && (mediaPlayerRemove = acquiredPlayerMap.remove(d6)) != null) {
                    arrayBlockingQueue.offer(mediaPlayerRemove);
                }
                MediaPlayer mediaPlayerPoll2 = arrayBlockingQueue.poll();
                if (mediaPlayerPoll2 == null) {
                    mediaPlayerPoll2 = MediaPlayer.INSTANCE.create(context, playerSettings);
                }
                mediaPlayerPoll = mediaPlayerPoll2;
            }
            if (mediaPlayerPoll.hasDifferentSettings(playerSettings)) {
                mediaPlayerPoll.release();
                mediaPlayerPoll = MediaPlayer.INSTANCE.create(context, playerSettings);
            }
            acquiredPlayerMap.put(Double.valueOf(key), mediaPlayerPoll);
            return mediaPlayerPoll;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NotNull
    public final MutableStateFlow getPlaybackProgressFlow$media_player_release() {
        return playbackProgressFlow;
    }

    @NotNull
    public final MutableStateFlow getPlaybackRateFlow$media_player_release() {
        return playbackRateFlow;
    }

    @NotNull
    public final Job mediaPlayerEventHandler$media_player_release(@NotNull MediaPlayer.Event event, @NotNull MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        return b0.t(scope, null, new MediaPlayerManager$mediaPlayerEventHandler$1(mediaPlayer, event, null), 3);
    }

    @NotNull
    public final Job pauseActivePlayer() {
        CoroutineScope coroutineScope = scope;
        hr.e eVar = k0.f2938a;
        return b0.t(coroutineScope, q.f9394a, new AnonymousClass1(null), 2);
    }

    @NotNull
    public final Job playActivePlayer() {
        CoroutineScope coroutineScope = scope;
        hr.e eVar = k0.f2938a;
        return b0.t(coroutineScope, q.f9394a, new C01981(null), 2);
    }

    public final synchronized boolean release(Double key) {
        if (key == null) {
            return false;
        }
        MediaPlayer mediaPlayerRemove = acquiredPlayerMap.remove(key);
        if (mediaPlayerRemove != null && !playerPool.offer(mediaPlayerRemove)) {
            mediaPlayerRemove.release();
        }
        return true;
    }
}
