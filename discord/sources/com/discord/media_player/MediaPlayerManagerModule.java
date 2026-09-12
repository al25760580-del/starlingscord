package com.discord.media_player;

import android.app.Activity;
import android.view.View;
import ar.b0;
import ar.k0;
import ar.q1;
import ar.u0;
import com.discord.logging.Log;
import com.discord.media_player.reactevents.MediaPlayerDownloadProgress;
import com.discord.media_player.reactevents.MediaPlayerMuteStateChanged;
import com.discord.media_player.reactevents.MediaPlayerPause;
import com.discord.media_player.reactevents.MediaPlayerPlaybackProgressUpdated;
import com.discord.media_player.reactevents.MediaPlayerPlaybackRateChanged;
import com.discord.media_player.reactevents.MediaPlayerPlaybackSource;
import com.discord.media_player.reactevents.MediaPlayerPlaybackSourceChanged;
import com.discord.media_player.reactevents.MediaPlayerProgress;
import com.discord.media_player.reactevents.MediaPlayerViewDidDisappear;
import com.discord.media_player.reactevents.MediaPlayerViewWillAppear;
import com.discord.portals.from_native.PortalFromNativeContextManager;
import com.discord.reactevents.ReactEvents;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;
import dr.d0;
import dr.p;
import dr.q;
import dr.z;
import er.k;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import lo.j;
import org.jetbrains.annotations.NotNull;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = MediaPlayerManagerModule.NAME)
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 G2\u00020\u0001:\u0001GB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0007J\u0018\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001bH\u0007J\u0018\u0010 \u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u001bH\u0007J\b\u0010\"\u001a\u00020\u0017H\u0007J\b\u0010#\u001a\u00020\u0017H\u0007J\b\u0010$\u001a\u00020\u0017H\u0007J\u0016\u0010%\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u001bJ$\u0010'\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\b2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00170)H\u0002J\u0016\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/J\u000e\u00100\u001a\u00020\u00172\u0006\u0010,\u001a\u00020-J\"\u00101\u001a\u00020\u00172\b\u0010,\u001a\u0004\u0018\u00010-2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000203H\u0002J \u00105\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\b2\u0006\u00106\u001a\u0002032\u0006\u00107\u001a\u000203H\u0002J)\u00108\u001a\u00020\t2\u0006\u00109\u001a\u00020:2\u0012\u0010;\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0<\"\u00020-¢\u0006\u0004\b=\u0010>J)\u0010?\u001a\u00020\t2\u0006\u00109\u001a\u00020:2\u0012\u0010;\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0<\"\u00020-¢\u0006\u0004\b@\u0010>J\u0010\u0010A\u001a\u00020\u00172\u0006\u0010B\u001a\u00020\u000eH\u0007J\u0010\u0010C\u001a\u00020\u00172\u0006\u0010D\u001a\u00020EH\u0007J\b\u0010F\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/discord/media_player/MediaPlayerManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "mediaPlayerProgressMap", "", "", "Lkotlinx/coroutines/Job;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "_pausePlayerFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "pausePlayerFlow", "Lkotlinx/coroutines/flow/Flow;", "getPausePlayerFlow", "()Lkotlinx/coroutines/flow/Flow;", "getName", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "pauseAllMediaPlayers", "", "toggle", "portal", "play", "", "changeProgress", "seekToSec", "setMuted", "muted", "setLoopPlayback", "loop", "pauseCurrentPlayer", "playCurrentPlayer", "subscribeToPlaybackEvents", "onMuteToggle", "isMuted", "withPlayer", "callback", "Lkotlin/Function1;", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "startPlayerProgressInterval", "mediaSource", "Lcom/discord/media_player/MediaSource;", "mediaPlayer", "Lcom/discord/media_player/MediaPlayer;", "stopPlayerProgressInterval", "onMediaPlayerPlaybackProgress", "timeMs", "", "durationMs", "onMediaPlayerDownloadProgress", "bufferedPosition", "duration", "onMediaPlayerViewWillAppear", "channelId", "Lcom/discord/primitives/ChannelId;", "mediaSources", "", "onMediaPlayerViewWillAppear-LJLSWy8", "(J[Lcom/discord/media_player/MediaSource;)Lkotlinx/coroutines/Job;", "onMediaPlayerViewDetached", "onMediaPlayerViewDetached-LJLSWy8", "addListener", "type", "removeListeners", "count", "", "invalidate", "Companion", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMediaPlayerManagerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaPlayerManagerModule.kt\ncom/discord/media_player/MediaPlayerManagerModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CastUtils.kt\ncom/discord/misc/utilities/kotlin/CastUtilsKt\n*L\n1#1,353:1\n1#2:354\n8#3:355\n8#3:356\n*S KotlinDebug\n*F\n+ 1 MediaPlayerManagerModule.kt\ncom/discord/media_player/MediaPlayerManagerModule\n*L\n224#1:355\n226#1:356\n*E\n"})
public final class MediaPlayerManagerModule extends ReactContextBaseJavaModule {

    @NotNull
    public static final String NAME = "MediaPlayerManager";

    @NotNull
    private MutableStateFlow _pausePlayerFlow;

    @NotNull
    private final Map<Double, Job> mediaPlayerProgressMap;

    @NotNull
    private final Flow pausePlayerFlow;

    @NotNull
    private final ReactApplicationContext reactContext;

    @NotNull
    private final ReactEvents reactEvents;

    @NotNull
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: com.discord.media_player.MediaPlayerManagerModule$startPlayerProgressInterval$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media_player.MediaPlayerManagerModule$startPlayerProgressInterval$1", f = "MediaPlayerManagerModule.kt", l = {242, 258}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ MediaPlayer $mediaPlayer;
        final /* synthetic */ MediaSource $mediaSource;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MediaPlayerManagerModule this$0;

        /* JADX INFO: renamed from: com.discord.media_player.MediaPlayerManagerModule$startPlayerProgressInterval$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @xn.d(c = "com.discord.media_player.MediaPlayerManagerModule$startPlayerProgressInterval$1$1", f = "MediaPlayerManagerModule.kt", l = {}, m = "invokeSuspend")
        public static final class C00351 extends h implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ MediaPlayer $mediaPlayer;
            final /* synthetic */ MediaSource $mediaSource;
            int label;
            final /* synthetic */ MediaPlayerManagerModule this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00351(MediaPlayer mediaPlayer, MediaPlayerManagerModule mediaPlayerManagerModule, MediaSource mediaSource, Continuation continuation) {
                super(2, continuation);
                this.$mediaPlayer = mediaPlayer;
                this.this$0 = mediaPlayerManagerModule;
                this.$mediaSource = mediaSource;
            }

            @Override // xn.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00351(this.$mediaPlayer, this.this$0, this.$mediaSource, continuation);
            }

            @Override // xn.a
            public final Object invokeSuspend(Object obj) {
                wn.a aVar = wn.a.f22354d;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
                if (this.$mediaPlayer.isPlaying()) {
                    this.this$0.onMediaPlayerPlaybackProgress(this.$mediaSource, this.$mediaPlayer.currentPositionMs(), this.$mediaPlayer.durationMs());
                }
                if (this.$mediaPlayer.durationMs() > 0 && (this.$mediaPlayer.isPlaying() || this.$mediaPlayer.isBuffering())) {
                    this.this$0.onMediaPlayerDownloadProgress(this.$mediaSource.getPortal().doubleValue(), this.$mediaPlayer.bufferedPositionMs(), this.$mediaPlayer.durationMs());
                }
                return Unit.f14616a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C00351) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MediaPlayer mediaPlayer, MediaPlayerManagerModule mediaPlayerManagerModule, MediaSource mediaSource, Continuation continuation) {
            super(2, continuation);
            this.$mediaPlayer = mediaPlayer;
            this.this$0 = mediaPlayerManagerModule;
            this.$mediaSource = mediaSource;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mediaPlayer, this.this$0, this.$mediaSource, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0032  */
        /* JADX WARN: Code duplicated, block: B:17:0x004d  */
        /* JADX WARN: Code duplicated, block: B:21:0x005b  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        
            if (ar.b0.j(100, r9) == r0) goto L20;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0058 -> B:7:0x0013). Please report as a decompilation issue!!! */
        @Override // xn.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                wn.a r0 = wn.a.f22354d
                int r1 = r9.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                ib.a.L(r10)
            L13:
                r10 = r1
                goto L2c
            L15:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1d:
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                ib.a.L(r10)
                goto L4e
            L25:
                ib.a.L(r10)
                java.lang.Object r10 = r9.L$0
                kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
            L2c:
                boolean r1 = ar.b0.s(r10)
                if (r1 == 0) goto L5b
                hr.e r1 = ar.k0.f2938a
                br.d r1 = fr.q.f9394a
                com.discord.media_player.MediaPlayerManagerModule$startPlayerProgressInterval$1$1 r4 = new com.discord.media_player.MediaPlayerManagerModule$startPlayerProgressInterval$1$1
                com.discord.media_player.MediaPlayer r5 = r9.$mediaPlayer
                com.discord.media_player.MediaPlayerManagerModule r6 = r9.this$0
                com.discord.media_player.MediaSource r7 = r9.$mediaSource
                r8 = 0
                r4.<init>(r5, r6, r7, r8)
                r9.L$0 = r10
                r9.label = r3
                java.lang.Object r1 = ar.b0.A(r1, r4, r9)
                if (r1 != r0) goto L4d
                goto L5a
            L4d:
                r1 = r10
            L4e:
                r9.L$0 = r1
                r9.label = r2
                r4 = 100
                java.lang.Object r10 = ar.b0.j(r4, r9)
                if (r10 != r0) goto L13
            L5a:
                return r0
            L5b:
                kotlin.Unit r10 = kotlin.Unit.f14616a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.media_player.MediaPlayerManagerModule.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media_player.MediaPlayerManagerModule$subscribeToPlaybackEvents$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media_player.MediaPlayerManagerModule$subscribeToPlaybackEvents$1", f = "MediaPlayerManagerModule.kt", l = {167}, m = "invokeSuspend")
    public static final class C02001 extends h implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        /* JADX INFO: renamed from: com.discord.media_player.MediaPlayerManagerModule$subscribeToPlaybackEvents$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "Lcom/discord/media_player/MediaSource;", "<destruct>", "Lkotlin/Pair;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @xn.d(c = "com.discord.media_player.MediaPlayerManagerModule$subscribeToPlaybackEvents$1$1", f = "MediaPlayerManagerModule.kt", l = {}, m = "invokeSuspend")
        public static final class C00361 extends h implements Function2<Pair<? extends MediaSource, ? extends Double>, Continuation, Object> {
            /* synthetic */ Object L$0;
            int label;

            public C00361(Continuation continuation) {
                super(2, continuation);
            }

            @Override // xn.a
            public final Continuation create(Object obj, Continuation continuation) {
                C00361 c00361 = new C00361(continuation);
                c00361.L$0 = obj;
                return c00361;
            }

            @Override // xn.a
            public final Object invokeSuspend(Object obj) {
                wn.a aVar = wn.a.f22354d;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
                return (MediaSource) ((Pair) this.L$0).f14612d;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Pair<MediaSource, Double> pair, Continuation continuation) {
                return ((C00361) create(pair, continuation)).invokeSuspend(Unit.f14616a);
            }
        }

        /* JADX INFO: renamed from: com.discord.media_player.MediaPlayerManagerModule$subscribeToPlaybackEvents$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "mediaSource", "Lcom/discord/media_player/MediaSource;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @xn.d(c = "com.discord.media_player.MediaPlayerManagerModule$subscribeToPlaybackEvents$1$2", f = "MediaPlayerManagerModule.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension({"SMAP\nMediaPlayerManagerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaPlayerManagerModule.kt\ncom/discord/media_player/MediaPlayerManagerModule$subscribeToPlaybackEvents$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,353:1\n1#2:354\n*E\n"})
        public static final class AnonymousClass2 extends h implements Function2<MediaSource, Continuation, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MediaPlayerManagerModule this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(MediaPlayerManagerModule mediaPlayerManagerModule, Continuation continuation) {
                super(2, continuation);
                this.this$0 = mediaPlayerManagerModule;
            }

            @Override // xn.a
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MediaSource mediaSource, Continuation continuation) {
                return ((AnonymousClass2) create(mediaSource, continuation)).invokeSuspend(Unit.f14616a);
            }

            @Override // xn.a
            public final Object invokeSuspend(Object obj) {
                wn.a aVar = wn.a.f22354d;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
                MediaSource mediaSource = (MediaSource) this.L$0;
                this.this$0.reactEvents.emitModuleEvent(this.this$0.reactContext, new MediaPlayerPlaybackSourceChanged(mediaSource != null ? MediaPlayerPlaybackSource.INSTANCE.fromMediaSource(mediaSource) : null));
                return Unit.f14616a;
            }
        }

        public C02001(Continuation continuation) {
            super(2, continuation);
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaPlayerManagerModule.this.new C02001(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MutableStateFlow playbackRateFlow$media_player_release = MediaPlayerManager.INSTANCE.getPlaybackRateFlow$media_player_release();
                C00361 c00361 = new C00361(null);
                int i10 = q.f7782a;
                Flow flowH = z.h(new k(new p(c00361, null), playbackRateFlow$media_player_release, g.f14681d, -2, cr.a.f7342d));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(MediaPlayerManagerModule.this, null);
                this.label = 1;
                if (z.f(flowH, anonymousClass2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C02001) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media_player.MediaPlayerManagerModule$subscribeToPlaybackEvents$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media_player.MediaPlayerManagerModule$subscribeToPlaybackEvents$2", f = "MediaPlayerManagerModule.kt", l = {179}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends h implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        /* JADX INFO: renamed from: com.discord.media_player.MediaPlayerManagerModule$subscribeToPlaybackEvents$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/discord/media_player/MediaSource;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @xn.d(c = "com.discord.media_player.MediaPlayerManagerModule$subscribeToPlaybackEvents$2$1", f = "MediaPlayerManagerModule.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension({"SMAP\nMediaPlayerManagerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaPlayerManagerModule.kt\ncom/discord/media_player/MediaPlayerManagerModule$subscribeToPlaybackEvents$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,353:1\n1#2:354\n*E\n"})
        public static final class AnonymousClass1 extends h implements Function2<Pair<? extends MediaSource, ? extends Double>, Continuation, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MediaPlayerManagerModule this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MediaPlayerManagerModule mediaPlayerManagerModule, Continuation continuation) {
                super(2, continuation);
                this.this$0 = mediaPlayerManagerModule;
            }

            @Override // xn.a
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // xn.a
            public final Object invokeSuspend(Object obj) {
                wn.a aVar = wn.a.f22354d;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
                Pair pair = (Pair) this.L$0;
                MediaSource mediaSource = (MediaSource) pair.f14612d;
                this.this$0.reactEvents.emitModuleEvent(this.this$0.reactContext, new MediaPlayerPlaybackRateChanged(mediaSource != null ? MediaPlayerPlaybackSource.INSTANCE.fromMediaSource(mediaSource) : null, ((Number) pair.f14613e).doubleValue()));
                return Unit.f14616a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Pair<MediaSource, Double> pair, Continuation continuation) {
                return ((AnonymousClass1) create(pair, continuation)).invokeSuspend(Unit.f14616a);
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaPlayerManagerModule.this.new AnonymousClass2(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MutableStateFlow playbackRateFlow$media_player_release = MediaPlayerManager.INSTANCE.getPlaybackRateFlow$media_player_release();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MediaPlayerManagerModule.this, null);
                this.label = 1;
                if (z.f(playbackRateFlow$media_player_release, anonymousClass1, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media_player.MediaPlayerManagerModule$subscribeToPlaybackEvents$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media_player.MediaPlayerManagerModule$subscribeToPlaybackEvents$3", f = "MediaPlayerManagerModule.kt", l = {JfifUtil.MARKER_SOFn}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends h implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaPlayerManagerModule.this.new AnonymousClass3(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MutableStateFlow playbackRateFlow$media_player_release = MediaPlayerManager.INSTANCE.getPlaybackRateFlow$media_player_release();
                final MediaPlayerManagerModule mediaPlayerManagerModule = MediaPlayerManagerModule.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.discord.media_player.MediaPlayerManagerModule.subscribeToPlaybackEvents.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Pair<MediaSource, Double> pair, Continuation continuation) {
                        Double portal;
                        MediaSource mediaSource = (MediaSource) pair.f14612d;
                        double dDoubleValue = ((Number) pair.f14613e).doubleValue();
                        if (mediaSource == null || (portal = mediaSource.getPortal()) == null) {
                            return Unit.f14616a;
                        }
                        mediaPlayerManagerModule.reactEvents.emitModuleEvent(mediaPlayerManagerModule.reactContext, new MediaPlayerPause(portal.doubleValue(), dDoubleValue == 0.0d));
                        return Unit.f14616a;
                    }
                };
                this.label = 1;
                if (playbackRateFlow$media_player_release.collect(flowCollector, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            throw new rn.h();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.media_player.MediaPlayerManagerModule$subscribeToPlaybackEvents$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.media_player.MediaPlayerManagerModule$subscribeToPlaybackEvents$4", f = "MediaPlayerManagerModule.kt", l = {203}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends h implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        /* JADX INFO: renamed from: com.discord.media_player.MediaPlayerManagerModule$subscribeToPlaybackEvents$4$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "playbackProgress", "Lcom/discord/media_player/MediaPlayerManager$PlaybackProgress;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @xn.d(c = "com.discord.media_player.MediaPlayerManagerModule$subscribeToPlaybackEvents$4$1", f = "MediaPlayerManagerModule.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends h implements Function2<MediaPlayerManager.PlaybackProgress, Continuation, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MediaPlayerManagerModule this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MediaPlayerManagerModule mediaPlayerManagerModule, Continuation continuation) {
                super(2, continuation);
                this.this$0 = mediaPlayerManagerModule;
            }

            @Override // xn.a
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MediaPlayerManager.PlaybackProgress playbackProgress, Continuation continuation) {
                return ((AnonymousClass1) create(playbackProgress, continuation)).invokeSuspend(Unit.f14616a);
            }

            @Override // xn.a
            public final Object invokeSuspend(Object obj) {
                wn.a aVar = wn.a.f22354d;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
                MediaPlayerManager.PlaybackProgress playbackProgress = (MediaPlayerManager.PlaybackProgress) this.L$0;
                this.this$0.onMediaPlayerPlaybackProgress(playbackProgress.getSource(), playbackProgress.getTimeMs(), playbackProgress.getDurationMs());
                return Unit.f14616a;
            }
        }

        public AnonymousClass4(Continuation continuation) {
            super(2, continuation);
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaPlayerManagerModule.this.new AnonymousClass4(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MutableStateFlow playbackProgressFlow$media_player_release = MediaPlayerManager.INSTANCE.getPlaybackProgressFlow$media_player_release();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MediaPlayerManagerModule.this, null);
                this.label = 1;
                if (z.f(playbackProgressFlow$media_player_release, anonymousClass1, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayerManagerModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.mediaPlayerProgressMap = new LinkedHashMap();
        q1 q1Var = new q1();
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.scope = b0.b(e.c(q1Var, new u0(executorServiceNewSingleThreadExecutor)));
        d0 d0VarB = z.b(null);
        this._pausePlayerFlow = d0VarB;
        this.pausePlayerFlow = d0VarB;
        this.reactEvents = new ReactEvents(new Pair("MediaPlayerPlaybackProgressUpdated", Reflection.getOrCreateKotlinClass(MediaPlayerPlaybackProgressUpdated.class)), new Pair("MediaPlayerPlaybackRateChanged", Reflection.getOrCreateKotlinClass(MediaPlayerPlaybackRateChanged.class)), new Pair("MediaPlayerPlaybackSourceChanged", Reflection.getOrCreateKotlinClass(MediaPlayerPlaybackSourceChanged.class)), new Pair("MediaPlayerPause", Reflection.getOrCreateKotlinClass(MediaPlayerPause.class)), new Pair("MediaPlayerProgress", Reflection.getOrCreateKotlinClass(MediaPlayerProgress.class)), new Pair("MediaPlayerDownloadProgress", Reflection.getOrCreateKotlinClass(MediaPlayerDownloadProgress.class)), new Pair("MediaPlayerMuteStateChanged", Reflection.getOrCreateKotlinClass(MediaPlayerMuteStateChanged.class)), new Pair("MediaPlayerViewWillAppear", Reflection.getOrCreateKotlinClass(MediaPlayerViewWillAppear.class)), new Pair("MediaPlayerViewDidDisappear", Reflection.getOrCreateKotlinClass(MediaPlayerViewDidDisappear.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit changeProgress$lambda$1(double d6, SimpleExoPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
        yq.a aVar = Duration.f14747e;
        long jD = Duration.d(yq.c.f(d6, yq.d.SECONDS));
        long duration = player.getDuration();
        if (duration <= 0 || jD < 0 || jD > duration) {
            Log log = Log.INSTANCE;
            StringBuilder sbM = kk.b.m(jD, "Invalid seek attempt: position=", ", duration=");
            sbM.append(duration);
            Log.w$default(log, NAME, sbM.toString(), (Throwable) null, 4, (Object) null);
        } else {
            try {
                player.b0(5, jD);
            } catch (IllegalArgumentException e10) {
                Log log2 = Log.INSTANCE;
                StringBuilder sbM2 = kk.b.m(jD, "Invalid seek position: ", ", duration: ");
                sbM2.append(duration);
                log2.e(NAME, sbM2.toString(), e10);
            }
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMediaPlayerDownloadProgress(double portal, long bufferedPosition, long duration) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long seconds = timeUnit.toSeconds(duration);
        this.reactEvents.emitModuleEvent(this.reactContext, new MediaPlayerDownloadProgress(portal, timeUnit.toSeconds(bufferedPosition), j.b(bufferedPosition / duration, 0.0d, 1.0d), seconds));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMediaPlayerPlaybackProgress(MediaSource mediaSource, long timeMs, long durationMs) {
        Double portal;
        this.reactEvents.emitModuleEvent(this.reactContext, new MediaPlayerPlaybackProgressUpdated(mediaSource != null ? MediaPlayerPlaybackSource.INSTANCE.fromMediaSource(mediaSource) : null, timeMs, durationMs));
        if (mediaSource == null || (portal = mediaSource.getPortal()) == null) {
            return;
        }
        double dDoubleValue = portal.doubleValue();
        ReactEvents reactEvents = this.reactEvents;
        ReactApplicationContext reactApplicationContext = this.reactContext;
        yq.a aVar = Duration.f14747e;
        yq.d dVar = yq.d.MILLISECONDS;
        long jH = yq.c.h(timeMs, dVar);
        yq.d dVar2 = yq.d.SECONDS;
        reactEvents.emitModuleEvent(reactApplicationContext, new MediaPlayerProgress(dDoubleValue, Duration.j(jH, dVar2), Duration.j(yq.c.h(durationMs, dVar), dVar2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setLoopPlayback$lambda$3(boolean z5, SimpleExoPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
        if (z5) {
            player.F(1);
        } else {
            player.F(0);
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setMuted$lambda$2(boolean z5, SimpleExoPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
        player.f0(z5 ? 0.0f : 1.0f);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toggle$lambda$0(boolean z5, MediaPlayerManagerModule mediaPlayerManagerModule, double d6, SimpleExoPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
        if (z5 && player.w() == 11) {
            try {
                player.b0(5, 0L);
            } catch (IllegalArgumentException e10) {
                Log.INSTANCE.e(NAME, "Failed to seek to beginning", e10);
            }
        }
        if (player.y() == z5) {
            return Unit.f14616a;
        }
        player.r(z5);
        mediaPlayerManagerModule.reactEvents.emitModuleEvent(mediaPlayerManagerModule.reactContext, new MediaPlayerPause(d6, !z5));
        return Unit.f14616a;
    }

    private final void withPlayer(final double portal, final Function1<? super SimpleExoPlayer, Unit> callback) {
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new Runnable() { // from class: com.discord.media_player.b
                @Override // java.lang.Runnable
                public final void run() {
                    MediaPlayerManagerModule.withPlayer$lambda$6(portal, callback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void withPlayer$lambda$6(double d6, Function1 function1) {
        Player player;
        View view = PortalFromNativeContextManager.INSTANCE.getView(d6);
        if (view != null) {
            if (!(view instanceof PlayerView)) {
                view = null;
            }
            PlayerView playerView = (PlayerView) view;
            if (playerView == null || (player = playerView.getPlayer()) == null) {
                return;
            }
            SimpleExoPlayer simpleExoPlayer = (SimpleExoPlayer) (player instanceof SimpleExoPlayer ? player : null);
            if (simpleExoPlayer != null) {
                function1.invoke(simpleExoPlayer);
            }
        }
    }

    @ReactMethod
    public final void addListener(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @ReactMethod
    public final void changeProgress(double portal, final double seekToSec) {
        withPlayer(portal, new Function1() { // from class: com.discord.media_player.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MediaPlayerManagerModule.changeProgress$lambda$1(seekToSec, (SimpleExoPlayer) obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @NotNull
    public final Flow getPausePlayerFlow() {
        return this.pausePlayerFlow;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        b0.f(this.scope, null);
        super.invalidate();
    }

    @NotNull
    /* JADX INFO: renamed from: onMediaPlayerViewDetached-LJLSWy8, reason: not valid java name */
    public final Job m1012onMediaPlayerViewDetachedLJLSWy8(long channelId, @NotNull MediaSource... mediaSources) {
        Intrinsics.checkNotNullParameter(mediaSources, "mediaSources");
        CoroutineScope coroutineScope = this.scope;
        hr.e eVar = k0.f2938a;
        return b0.t(coroutineScope, fr.q.f9394a, new MediaPlayerManagerModule$onMediaPlayerViewDetached$1(this, channelId, mediaSources, null), 2);
    }

    @NotNull
    /* JADX INFO: renamed from: onMediaPlayerViewWillAppear-LJLSWy8, reason: not valid java name */
    public final Job m1013onMediaPlayerViewWillAppearLJLSWy8(long channelId, @NotNull MediaSource... mediaSources) {
        Intrinsics.checkNotNullParameter(mediaSources, "mediaSources");
        CoroutineScope coroutineScope = this.scope;
        hr.e eVar = k0.f2938a;
        return b0.t(coroutineScope, fr.q.f9394a, new MediaPlayerManagerModule$onMediaPlayerViewWillAppear$1(this, channelId, mediaSources, null), 2);
    }

    public final void onMuteToggle(double portal, boolean isMuted) {
        this.reactEvents.emitModuleEvent(this.reactContext, new MediaPlayerMuteStateChanged(portal, isMuted));
    }

    @ReactMethod
    public final void pauseAllMediaPlayers() {
        this._pausePlayerFlow.setValue(UUID.randomUUID().toString());
    }

    @ReactMethod
    public final void pauseCurrentPlayer() {
        MediaPlayerManager.INSTANCE.pauseActivePlayer();
    }

    @ReactMethod
    public final void playCurrentPlayer() {
        MediaPlayerManager.INSTANCE.playActivePlayer();
    }

    @ReactMethod
    public final void removeListeners(int count) {
    }

    @ReactMethod
    public final void setLoopPlayback(double portal, boolean loop) {
        withPlayer(portal, new c(loop, 1));
    }

    @ReactMethod
    public final void setMuted(double portal, boolean muted) {
        withPlayer(portal, new c(muted, 0));
    }

    public final void startPlayerProgressInterval(@NotNull MediaSource mediaSource, @NotNull MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(mediaSource, "mediaSource");
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        stopPlayerProgressInterval(mediaSource);
        onMediaPlayerPlaybackProgress(mediaSource, mediaPlayer.currentPositionMs(), mediaPlayer.durationMs());
        Map<Double, Job> map = this.mediaPlayerProgressMap;
        Double portal = mediaSource.getPortal();
        Intrinsics.checkNotNull(portal);
        map.put(portal, b0.t(this.scope, null, new AnonymousClass1(mediaPlayer, this, mediaSource, null), 3));
    }

    public final void stopPlayerProgressInterval(@NotNull MediaSource mediaSource) {
        Job jobRemove;
        Intrinsics.checkNotNullParameter(mediaSource, "mediaSource");
        if (mediaSource.getPortal() == null || (jobRemove = this.mediaPlayerProgressMap.remove(mediaSource.getPortal())) == null) {
            return;
        }
        jobRemove.f(null);
    }

    @ReactMethod
    public final void subscribeToPlaybackEvents() {
        b0.t(this.scope, null, new C02001(null), 3);
        b0.t(this.scope, null, new AnonymousClass2(null), 3);
        b0.t(this.scope, null, new AnonymousClass3(null), 3);
        b0.t(this.scope, null, new AnonymousClass4(null), 3);
    }

    @ReactMethod
    public final void toggle(final double portal, final boolean play) {
        withPlayer(portal, new Function1() { // from class: com.discord.media_player.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MediaPlayerManagerModule.toggle$lambda$0(play, this, portal, (SimpleExoPlayer) obj);
            }
        });
    }
}
