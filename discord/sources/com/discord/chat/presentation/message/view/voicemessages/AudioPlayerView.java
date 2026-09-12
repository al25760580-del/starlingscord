package com.discord.chat.presentation.message.view.voicemessages;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.u0;
import androidx.lifecycle.r0;
import ar.b0;
import ar.k0;
import co.s;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.R;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.databinding.AudioPlayerViewBinding;
import com.discord.chat.presentation.message.messagepart.AudioAttachmentMessageAccessory;
import com.discord.chat.presentation.message.view.AttachmentUploadOverlayView;
import com.discord.chat.presentation.message.view.UploadItemProps;
import com.discord.chat.presentation.message.view.media.ViewAttachedListener;
import com.discord.chat.presentation.message.view.t;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.media_player.MediaPlayer;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.react_strings.RenderContext;
import com.discord.theme.DiscordThemeObject;
import com.discord.theme.ThemeManager;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import rn.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0012\u0018\u0000 p2\u00020\u0001:\u0002opB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u00106\u001a\u000207H\u0003J\u000e\u00108\u001a\u0002072\u0006\u00109\u001a\u00020:J\u000e\u0010;\u001a\u0002072\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010<\u001a\u000207J\u000e\u0010\u001d\u001a\u0002072\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010=\u001a\u0002072\u0006\u0010>\u001a\u00020?J\u000e\u0010@\u001a\u0002072\u0006\u0010A\u001a\u00020BJ\u000e\u0010C\u001a\u0002072\u0006\u00104\u001a\u000205J\u0010\u0010D\u001a\u0002072\b\u0010E\u001a\u0004\u0018\u00010FJ\u0015\u0010G\u001a\u0002072\b\u0010H\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010IJ\u0010\u0010J\u001a\u0002072\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010K\u001a\u0002072\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010L\u001a\u0002072\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010M\u001a\u0002072\u0006\u0010N\u001a\u00020OH\u0002J\u0010\u0010P\u001a\u0002072\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010Q\u001a\u000207H\u0002J\u0010\u0010R\u001a\u0002072\u0006\u0010S\u001a\u00020\u001eH\u0002J\b\u0010T\u001a\u000207H\u0002J\u0010\u0010U\u001a\u0002072\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\f\u0010V\u001a\u00020W*\u00020\u0007H\u0002J\f\u0010X\u001a\u00020W*\u00020\u0007H\u0002J\f\u0010Y\u001a\u00020\u0007*\u00020\u001bH\u0002J#\u0010Z\u001a\u0002072\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\\\u001a\u00020\u001eH\u0002¢\u0006\u0002\u0010]J \u0010^\u001a\u00020_2\u0006\u0010\\\u001a\u00020\u001e2\u0006\u0010`\u001a\u00020\u00072\u0006\u0010a\u001a\u00020\u0007H\u0002J\u001a\u0010b\u001a\u0002072\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010c\u001a\u00020\u001eH\u0002J\u001c\u0010d\u001a\u0002072\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010e\u001a\u00020\u001eH\u0002J\u0010\u0010f\u001a\u0002072\u0006\u0010g\u001a\u00020\u001eH\u0002J\b\u0010i\u001a\u000207H\u0002J\b\u0010j\u001a\u000207H\u0002J\u000f\u0010k\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0002\u0010lJ\u0012\u0010m\u001a\u0002072\b\u0010n\u001a\u0004\u0018\u00010WH\u0002R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010(\u001a\n **\u0004\u0018\u00010)0)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b+\u0010,R\u001b\u0010/\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b1\u00102R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010h\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001c¨\u0006q"}, d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/AudioPlayerViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/AudioPlayerViewBinding;", "listener", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener;", "getListener", "()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener;", "setListener", "(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener;)V", "audioProgressView", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioProgressView;", "getAudioProgressView", "()Lcom/discord/chat/presentation/message/view/voicemessages/AudioProgressView;", "state", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;", "durationMs", "", "Ljava/lang/Long;", "shouldAnimate", "", "durationJob", "Lkotlinx/coroutines/Job;", "playerJob", "resetJob", "isScrubbingEnabled", "wasPlayingBeforeBeingPaused", "uploadFinished", "attachStateChangeListener", "Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;", "bounceAnimator", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "getBounceAnimator", "()Landroid/view/animation/Animation;", "bounceAnimator$delegate", "Lkotlin/Lazy;", "animatorManager", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;", "getAnimatorManager", "()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;", "animatorManager$delegate", "onLongPress", "Landroid/view/View$OnLongClickListener;", "configureGestures", "", "setSourceUrl", "accessory", "Lcom/discord/chat/presentation/message/messagepart/AudioAttachmentMessageAccessory;", "setDurationMs", "setUnknownDuration", "setSampleData", "sampleData", "", "setAudioFileDetails", "attachment", "Lcom/discord/chat/bridge/attachment/Attachment;", "setOnLongPress", "setUploadProgress", "uploadItemProps", "Lcom/discord/chat/presentation/message/view/UploadItemProps;", "setContainerBackgroundColor", ViewProps.COLOR, "(Ljava/lang/Integer;)V", "configurePlayButton", "prepareAudio", "configureLoading", "onAudioProgressChange", "progressEvent", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioProgressEvent;", "configureAudioProgressView", "pauseForScrubbing", "toggleDurationEmitter", "shouldEmit", "configureProgress", "configureAudioDetails", "timeRemainingText", "", "timeRemainingAccessibilityText", "toSeconds", "configureDuration", "overrideDuration", "isPlaying", "(Ljava/lang/Long;Z)V", "getA11yAudioProgressDescription", "", "durationSecs", "timeRemaining", "configurePlayerState", "hasSourceChanged", "setState", "forceRefresh", "reset", "logDuration", "startTimeMS", "maybeLogPlaybackStarted", "maybeLogPlaybackEnded", "getCurrentPosition", "()Ljava/lang/Long;", "maybeLogPlaybackFailed", "errorMessage", "Listener", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAudioPlayerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioPlayerView.kt\ncom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,740:1\n176#2,2:741\n255#2:743\n257#2,2:744\n257#2,2:746\n297#2:749\n255#2:750\n257#2,2:751\n1#3:748\n*S KotlinDebug\n*F\n+ 1 AudioPlayerView.kt\ncom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView\n*L\n139#1:741,2\n84#1:743\n387#1:744,2\n451#1:746,2\n533#1:749\n600#1:750\n390#1:751,2\n*E\n"})
public final class AudioPlayerView extends FrameLayout {
    public static final long RESET_DELAY_MS = 500;

    /* JADX INFO: renamed from: animatorManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy animatorManager;

    @NotNull
    private final ViewAttachedListener attachStateChangeListener;

    @NotNull
    private final AudioPlayerViewBinding binding;

    /* JADX INFO: renamed from: bounceAnimator$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bounceAnimator;
    private Job durationJob;
    private Long durationMs;
    private boolean isScrubbingEnabled;
    private Listener listener;
    private View.OnLongClickListener onLongPress;
    private Job playerJob;
    private Job resetJob;
    private boolean shouldAnimate;
    private Long startTimeMS;

    @NotNull
    private AudioPlayerViewState state;
    private boolean uploadFinished;
    private boolean wasPlayingBeforeBeingPaused;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&¨\u0006\r"}, d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener;", "", "mediaAttachmentPlaybackStarted", "", "startedDurationSecs", "", "mediaAttachmentPlaybackEnded", "endDurationSecs", "durationListeningSecs", "voiceMessagePlaybackFailed", "errorMessage", "", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Listener {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener$Companion;", "", "<init>", "()V", "secondsSinceStart", "", "startTimeMS", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final float secondsSinceStart(long startTimeMS) {
                yq.a aVar = Duration.f14747e;
                Duration duration = new Duration(yq.c.h(System.currentTimeMillis() - startTimeMS, yq.d.MILLISECONDS));
                Duration.f14747e.getClass();
                Duration minimumValue = new Duration(0L);
                Intrinsics.checkNotNullParameter(duration, "<this>");
                Intrinsics.checkNotNullParameter(minimumValue, "minimumValue");
                if (duration.compareTo(minimumValue) < 0) {
                    duration = minimumValue;
                }
                return (float) Duration.j(duration.f14750d, yq.d.SECONDS);
            }
        }

        void mediaAttachmentPlaybackEnded(float endDurationSecs, float durationListeningSecs);

        void mediaAttachmentPlaybackStarted(float startedDurationSecs);

        void voiceMessagePlaybackFailed(String errorMessage);
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$reset$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$reset$1", f = "AudioPlayerView.kt", l = {683}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        /* JADX INFO: renamed from: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$reset$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @xn.d(c = "com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$reset$1$1", f = "AudioPlayerView.kt", l = {684}, m = "invokeSuspend")
        public static final class C00281 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
            int label;

            public C00281(Continuation continuation) {
                super(2, continuation);
            }

            @Override // xn.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00281(continuation);
            }

            @Override // xn.a
            public final Object invokeSuspend(Object obj) {
                wn.a aVar = wn.a.f22354d;
                int i7 = this.label;
                if (i7 == 0) {
                    ib.a.L(obj);
                    this.label = 1;
                    if (b0.j(500L, this) == aVar) {
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
                return ((C00281) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return AudioPlayerView.this.new AnonymousClass1(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                hr.e eVar = k0.f2938a;
                C00281 c00281 = new C00281(null);
                this.label = 1;
                if (b0.A(eVar, c00281, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            AudioPlayerView audioPlayerView = AudioPlayerView.this;
            audioPlayerView.configureDuration(audioPlayerView.durationMs, false);
            AudioPlayerView.this.configureProgress();
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$reset$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$reset$2", f = "AudioPlayerView.kt", l = {693}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        /* JADX INFO: renamed from: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$reset$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @xn.d(c = "com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$reset$2$1", f = "AudioPlayerView.kt", l = {694}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
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
                wn.a aVar = wn.a.f22354d;
                int i7 = this.label;
                if (i7 == 0) {
                    ib.a.L(obj);
                    this.label = 1;
                    if (b0.j(500L, this) == aVar) {
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
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return AudioPlayerView.this.new AnonymousClass2(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                hr.e eVar = k0.f2938a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                if (b0.A(eVar, anonymousClass1, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            AudioPlayerView.this.wasPlayingBeforeBeingPaused = false;
            AudioPlayerView audioPlayerView = AudioPlayerView.this;
            audioPlayerView.configurePlayButton(audioPlayerView.state);
            AudioPlayerView audioPlayerView2 = AudioPlayerView.this;
            audioPlayerView2.configureAudioProgressView(audioPlayerView2.state);
            AudioPlayerView.this.getBinding().wave.reset();
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$toggleDurationEmitter$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$toggleDurationEmitter$2", f = "AudioPlayerView.kt", l = {516}, m = "invokeSuspend")
    public static final class C01162 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$toggleDurationEmitter$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @xn.d(c = "com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$toggleDurationEmitter$2$1", f = "AudioPlayerView.kt", l = {517}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
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
                wn.a aVar = wn.a.f22354d;
                int i7 = this.label;
                if (i7 == 0) {
                    ib.a.L(obj);
                    this.label = 1;
                    if (b0.j(50L, this) == aVar) {
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
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
            }
        }

        public C01162(Continuation continuation) {
            super(2, continuation);
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            C01162 c01162 = AudioPlayerView.this.new C01162(continuation);
            c01162.L$0 = obj;
            return c01162;
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                coroutineScope = (CoroutineScope) this.L$0;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                ib.a.L(obj);
            }
            while (b0.s(coroutineScope) && AudioPlayerView.this.state.shouldEmitDuration$chat_release()) {
                AudioPlayerView.this.configureProgress();
                AudioPlayerView.configureDuration$default(AudioPlayerView.this, null, false, 3, null);
                hr.e eVar = k0.f2938a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.L$0 = coroutineScope;
                this.label = 1;
                if (b0.A(eVar, anonymousClass1, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01162) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioPlayerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$8(AudioPlayerView audioPlayerView, View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean zIsPlaying$chat_release = audioPlayerView.state.isPlaying$chat_release(audioPlayerView.wasPlayingBeforeBeingPaused);
        if (zIsPlaying$chat_release) {
            audioPlayerView.getAnimatorManager().startAnimator(zIsPlaying$chat_release, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AudioPlayerWipeAnimatorManager animatorManager_delegate$lambda$3(Context context, AudioPlayerView audioPlayerView) {
        return new AudioPlayerWipeAnimatorManager(context, audioPlayerView.binding);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachStateChangeListener$lambda$0(AudioPlayerView audioPlayerView, boolean z5) {
        Job job = audioPlayerView.playerJob;
        if (job != null) {
            job.f(null);
        }
        if (z5) {
            audioPlayerView.playerJob = b0.t(CoroutineViewUtilsKt.getAttachedScope(audioPlayerView), null, new AudioPlayerView$attachStateChangeListener$1$1(audioPlayerView, null), 3);
        }
        setState$default(audioPlayerView, AudioPlayerViewState.copy$default(audioPlayerView.state, null, z5, 1, null), false, 2, null);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Animation bounceAnimator_delegate$lambda$2(Context context) {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.bounce);
        animationLoadAnimation.setDuration(100L);
        animationLoadAnimation.start();
        return animationLoadAnimation;
    }

    private final void configureAudioDetails(AudioPlayerViewState state) {
        LinearLayout audioDetailsView = this.binding.audioDetailsView;
        Intrinsics.checkNotNullExpressionValue(audioDetailsView, "audioDetailsView");
        if (audioDetailsView.getVisibility() == 8) {
            return;
        }
        MediaPlayer player$chat_release = state.getPlayer$chat_release();
        boolean zIsPlaying = player$chat_release != null ? player$chat_release.isPlaying() : false;
        DiscordThemeObject theme = ThemeManagerKt.getTheme();
        int white = zIsPlaying ? theme.getWhite() : theme.getInteractiveTextDefault();
        this.binding.audioFileName.setTextColor(white);
        this.binding.audioFileSize.setTextColor(white);
        this.binding.audioProgressBar.setPlaying(zIsPlaying);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureAudioProgressView(AudioPlayerViewState state) {
        int backgroundModMuted;
        AudioProgressView audioProgressView = getAudioProgressView();
        if (state.isPlaying$chat_release(this.wasPlayingBeforeBeingPaused)) {
            backgroundModMuted = getContext().getColor(com.discord.theme.R.color.brand_430);
        } else {
            backgroundModMuted = state.getCurrentProgress$chat_release() != null ? ThemeManagerKt.getTheme().getBackgroundModMuted() : ThemeManagerKt.getTheme().getInteractiveTextDefault();
        }
        audioProgressView.setDefaultPaintColor(backgroundModMuted);
        MediaPlayer player$chat_release = state.getPlayer$chat_release();
        Float fValueOf = player$chat_release != null ? Float.valueOf(player$chat_release.currentPositionPercentage()) : null;
        if (fValueOf != null) {
            AudioProgressView.DefaultImpls.setAudioProgress$default(getAudioProgressView(), fValueOf.floatValue(), false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    public final void configureDuration(Long overrideDuration, boolean isPlaying) {
        MediaPlayer player$chat_release;
        if (overrideDuration == null) {
            MediaPlayer player$chat_release2 = this.state.getPlayer$chat_release();
            if (player$chat_release2 == null) {
                overrideDuration = null;
            } else {
                if (player$chat_release2.durationMs() <= 0) {
                    player$chat_release2 = null;
                }
                if (player$chat_release2 != null) {
                    overrideDuration = Long.valueOf(player$chat_release2.durationMs() - player$chat_release2.currentPositionMs());
                } else {
                    overrideDuration = null;
                }
            }
            if (overrideDuration == null) {
                this.binding.text.setText("  --:--  ");
                return;
            }
        }
        int seconds = toSeconds(overrideDuration.longValue());
        if (this.durationMs == null && (player$chat_release = this.state.getPlayer$chat_release()) != null) {
            MediaPlayer mediaPlayer = player$chat_release.durationMs() > 0 ? player$chat_release : null;
            if (mediaPlayer != null) {
                this.durationMs = Long.valueOf(mediaPlayer.durationMs());
            }
        }
        Long l6 = this.durationMs;
        this.binding.audioProgressView.setContentDescription(getA11yAudioProgressDescription(isPlaying, toSeconds(l6 != null ? l6.longValue() : 0L), seconds));
        this.binding.text.setText("  " + timeRemainingText(seconds) + "  ");
    }

    public static /* synthetic */ void configureDuration$default(AudioPlayerView audioPlayerView, Long l6, boolean z5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            l6 = null;
        }
        if ((i7 & 2) != 0) {
            z5 = true;
        }
        audioPlayerView.configureDuration(l6, z5);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void configureGestures() {
        this.binding.audioProgressView.setOnTouchListener(new AudioPlayerView$configureGestures$onTouchListener$1(this));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    private final void configureLoading(AudioPlayerViewState state) {
        boolean z5;
        MediaPlayer player$chat_release;
        ProgressBar progress = this.binding.progress;
        Intrinsics.checkNotNullExpressionValue(progress, "progress");
        if (Intrinsics.areEqual(state.getMediaState$chat_release(), MediaPlayer.Event.BufferStart.INSTANCE) && (player$chat_release = state.getPlayer$chat_release()) != null) {
            z5 = player$chat_release.shouldPlay();
        }
        progress.setVisibility(z5 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configurePlayButton(AudioPlayerViewState state) {
        boolean zIsPlaying$chat_release = state.isPlaying$chat_release(this.wasPlayingBeforeBeingPaused);
        if (zIsPlaying$chat_release) {
            View view = this.binding.buttonContainer;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            view.setContentDescription(I18nUtilsKt.i18nFormat$default(context, I18nMessage.PAUSE, null, 2, null));
            SimpleDraweeView button = this.binding.button;
            Intrinsics.checkNotNullExpressionValue(button, "button");
            ReactAssetUtilsKt.setReactAsset(button, ReactAsset.PauseIcon);
            this.binding.button.setPadding(0, 0, 0, 0);
        } else {
            View view2 = this.binding.buttonContainer;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            view2.setContentDescription(I18nUtilsKt.i18nFormat$default(context2, I18nMessage.PLAY, null, 2, null));
            SimpleDraweeView button2 = this.binding.button;
            Intrinsics.checkNotNullExpressionValue(button2, "button");
            ReactAssetUtilsKt.setReactAsset(button2, ReactAsset.PlayIcon);
            this.binding.button.setPadding(2, 0, 0, 0);
        }
        getAnimatorManager().startAnimator(zIsPlaying$chat_release, this.shouldAnimate);
        View buttonContainer = this.binding.buttonContainer;
        Intrinsics.checkNotNullExpressionValue(buttonContainer, "buttonContainer");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(buttonContainer, false, state.getSourceUrl() != null ? new t(this, state, zIsPlaying$chat_release) : null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configurePlayButton$lambda$12(AudioPlayerView audioPlayerView, AudioPlayerViewState audioPlayerViewState, boolean z5, View view) {
        audioPlayerView.binding.buttonContainer.startAnimation(audioPlayerView.getBounceAnimator());
        if (audioPlayerViewState.getPlayer$chat_release() == null) {
            audioPlayerView.prepareAudio(audioPlayerViewState);
        } else if (z5) {
            audioPlayerViewState.pause$chat_release();
        } else {
            audioPlayerViewState.play$chat_release();
        }
    }

    private final void configurePlayerState(AudioPlayerViewState state, boolean hasSourceChanged) {
        boolean zAreEqual = Intrinsics.areEqual(state.getMediaState$chat_release(), MediaPlayer.Event.PlaybackEnded.INSTANCE);
        if ((!hasSourceChanged || AudioPlayerManager.INSTANCE.hasCurrentPlayer(state.getAudioSource())) && !zAreEqual) {
            setKeepScreenOn(Intrinsics.areEqual(state.getMediaState$chat_release(), MediaPlayer.Event.StartedPlaying.INSTANCE) && hasWindowFocus() && state.getAttached());
        } else {
            reset(!zAreEqual);
        }
    }

    public static /* synthetic */ void configurePlayerState$default(AudioPlayerView audioPlayerView, AudioPlayerViewState audioPlayerViewState, boolean z5, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z5 = false;
        }
        audioPlayerView.configurePlayerState(audioPlayerViewState, z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureProgress() {
        float currentProgressPercentage;
        AudioProgressView audioProgressView = getAudioProgressView();
        MediaPlayer player$chat_release = this.state.getPlayer$chat_release();
        if (player$chat_release != null) {
            currentProgressPercentage = player$chat_release.currentPositionPercentage();
        } else {
            AudioPlayerManager.CurrentProgress currentProgress$chat_release = this.state.getCurrentProgress$chat_release();
            currentProgressPercentage = currentProgress$chat_release != null ? currentProgress$chat_release.getCurrentProgressPercentage() : 0.0f;
        }
        audioProgressView.setAudioProgress(currentProgressPercentage, true);
    }

    private final CharSequence getA11yAudioProgressDescription(boolean isPlaying, final int durationSecs, int timeRemaining) {
        AudioWaveView wave = this.binding.wave;
        Intrinsics.checkNotNullExpressionValue(wave, "wave");
        if (wave.getVisibility() == 0) {
            if (isPlaying) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return I18nUtilsKt.i18nFormat(context, I18nMessage.VOICE_MESSAGES_PLAYING_A11Y_STATUS, new d(this, durationSecs, timeRemaining, 0));
            }
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            final int i7 = 0;
            return I18nUtilsKt.i18nFormat(context2, I18nMessage.VOICE_MESSAGES_A11Y_STATUS, new Function1(this) { // from class: com.discord.chat.presentation.message.view.voicemessages.e

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ AudioPlayerView f4277e;

                {
                    this.f4277e = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i7) {
                        case 0:
                            return AudioPlayerView.getA11yAudioProgressDescription$lambda$23(this.f4277e, durationSecs, (RenderContext) obj);
                        default:
                            return AudioPlayerView.getA11yAudioProgressDescription$lambda$25(this.f4277e, durationSecs, (RenderContext) obj);
                    }
                }
            });
        }
        if (isPlaying) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            return I18nUtilsKt.i18nFormat(context3, I18nMessage.AUDIO_FILE_PLAYING_VALUE, new d(this, durationSecs, timeRemaining, 1));
        }
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        final int i10 = 1;
        return I18nUtilsKt.i18nFormat(context4, I18nMessage.AUDIO_FILE_NOT_PLAYING_VALUE, new Function1(this) { // from class: com.discord.chat.presentation.message.view.voicemessages.e

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ AudioPlayerView f4277e;

            {
                this.f4277e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        return AudioPlayerView.getA11yAudioProgressDescription$lambda$23(this.f4277e, durationSecs, (RenderContext) obj);
                    default:
                        return AudioPlayerView.getA11yAudioProgressDescription$lambda$25(this.f4277e, durationSecs, (RenderContext) obj);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getA11yAudioProgressDescription$lambda$22(AudioPlayerView audioPlayerView, int i7, int i10, RenderContext i18nFormat) {
        Intrinsics.checkNotNullParameter(i18nFormat, "$this$i18nFormat");
        i18nFormat.getArgs().put("duration", audioPlayerView.timeRemainingAccessibilityText(i7));
        i18nFormat.getArgs().put("currentTime", audioPlayerView.timeRemainingAccessibilityText(i7 - i10));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getA11yAudioProgressDescription$lambda$23(AudioPlayerView audioPlayerView, int i7, RenderContext i18nFormat) {
        Intrinsics.checkNotNullParameter(i18nFormat, "$this$i18nFormat");
        i18nFormat.getArgs().put("duration", audioPlayerView.timeRemainingAccessibilityText(i7));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getA11yAudioProgressDescription$lambda$24(AudioPlayerView audioPlayerView, int i7, int i10, RenderContext i18nFormat) {
        Intrinsics.checkNotNullParameter(i18nFormat, "$this$i18nFormat");
        i18nFormat.getArgs().put("duration", audioPlayerView.timeRemainingAccessibilityText(i7));
        i18nFormat.getArgs().put("currentTime", audioPlayerView.timeRemainingAccessibilityText(i7 - i10));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getA11yAudioProgressDescription$lambda$25(AudioPlayerView audioPlayerView, int i7, RenderContext i18nFormat) {
        Intrinsics.checkNotNullParameter(i18nFormat, "$this$i18nFormat");
        i18nFormat.getArgs().put("duration", audioPlayerView.timeRemainingAccessibilityText(i7));
        return Unit.f14616a;
    }

    private final AudioPlayerWipeAnimatorManager getAnimatorManager() {
        return (AudioPlayerWipeAnimatorManager) this.animatorManager.getValue();
    }

    private final AudioProgressView getAudioProgressView() {
        AudioWaveView wave = this.binding.wave;
        Intrinsics.checkNotNullExpressionValue(wave, "wave");
        if (wave.getVisibility() == 0) {
            AudioWaveView wave2 = this.binding.wave;
            Intrinsics.checkNotNullExpressionValue(wave2, "wave");
            return wave2;
        }
        AudioProgressBar audioProgressBar = this.binding.audioProgressBar;
        Intrinsics.checkNotNullExpressionValue(audioProgressBar, "audioProgressBar");
        return audioProgressBar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Animation getBounceAnimator() {
        return (Animation) this.bounceAnimator.getValue();
    }

    private final Long getCurrentPosition() {
        MediaPlayer player$chat_release = this.state.getPlayer$chat_release();
        if (player$chat_release != null) {
            return Long.valueOf(player$chat_release.currentPositionMs());
        }
        AudioPlayerManager.CurrentProgress currentProgress$chat_release = this.state.getCurrentProgress$chat_release();
        if (currentProgress$chat_release != null) {
            return Long.valueOf(currentProgress$chat_release.getCurrentProgress());
        }
        return null;
    }

    private final void maybeLogPlaybackEnded() {
        Long currentPosition = getCurrentPosition();
        if (currentPosition != null) {
            long jLongValue = currentPosition.longValue();
            Long l6 = this.startTimeMS;
            if (l6 != null) {
                float fSecondsSinceStart = Listener.INSTANCE.secondsSinceStart(l6.longValue());
                this.startTimeMS = null;
                Listener listener = this.listener;
                if (listener != null) {
                    yq.a aVar = Duration.f14747e;
                    listener.mediaAttachmentPlaybackEnded((float) Duration.j(yq.c.h(jLongValue, yq.d.MILLISECONDS), yq.d.SECONDS), fSecondsSinceStart);
                }
            }
        }
    }

    private final void maybeLogPlaybackFailed(String errorMessage) {
        Listener listener = this.listener;
        if (listener != null) {
            listener.voiceMessagePlaybackFailed(errorMessage);
        }
    }

    private final void maybeLogPlaybackStarted() {
        Long currentPosition = getCurrentPosition();
        if (currentPosition != null) {
            long jLongValue = currentPosition.longValue();
            this.startTimeMS = Long.valueOf(System.currentTimeMillis());
            Listener listener = this.listener;
            if (listener != null) {
                yq.a aVar = Duration.f14747e;
                listener.mediaAttachmentPlaybackStarted((float) Duration.j(yq.c.h(jLongValue, yq.d.MILLISECONDS), yq.d.SECONDS));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAudioProgressChange(AudioProgressEvent progressEvent) {
        Job job = this.resetJob;
        if (job != null) {
            job.f(null);
        }
        MediaPlayer player$chat_release = this.state.getPlayer$chat_release();
        int eventAction = progressEvent.getEventAction();
        if (eventAction == 0) {
            pauseForScrubbing();
        } else if (eventAction == 1) {
            if (player$chat_release != null) {
                toggleDurationEmitter(this.state.shouldEmitDuration$chat_release());
                player$chat_release.seekTo((long) (progressEvent.getProgress() * player$chat_release.durationMs()));
                if (this.wasPlayingBeforeBeingPaused) {
                    this.wasPlayingBeforeBeingPaused = false;
                    this.state.play$chat_release();
                }
            } else {
                AudioPlayerViewState audioPlayerViewState = this.state;
                float progress = progressEvent.getProgress();
                Long l6 = this.durationMs;
                audioPlayerViewState.setCurrentProgress$chat_release(progress, l6 != null ? l6.longValue() : 0L);
            }
        }
        configureDuration$default(this, Long.valueOf((long) ((1 - progressEvent.getProgress()) * (player$chat_release != null ? player$chat_release.durationMs() : 0L))), false, 2, null);
        getAudioProgressView().setAudioProgress(progressEvent.getProgress(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pauseForScrubbing() {
        MediaPlayer player$chat_release = this.state.getPlayer$chat_release();
        if (player$chat_release != null) {
            this.wasPlayingBeforeBeingPaused = player$chat_release.shouldPlay();
            this.state.pause$chat_release();
            toggleDurationEmitter(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareAudio(AudioPlayerViewState state) {
        AudioPlayerManager.AudioSource audioSource = state.getAudioSource();
        if (audioSource == null) {
            return;
        }
        AudioPlayerManager audioPlayerManager = AudioPlayerManager.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Long l6 = this.durationMs;
        audioPlayerManager.setupPlayer(context, audioSource, l6 != null ? l6.longValue() : 0L, new c(this, 0));
        this.isScrubbingEnabled = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit prepareAudio$lambda$13(AudioPlayerView audioPlayerView, MediaPlayer.Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.areEqual(event, MediaPlayer.Event.Paused.INSTANCE) || Intrinsics.areEqual(event, MediaPlayer.Event.PlaybackEnded.INSTANCE)) {
            audioPlayerView.maybeLogPlaybackEnded();
        } else if (event instanceof MediaPlayer.Event.PlaybackError) {
            audioPlayerView.maybeLogPlaybackFailed(((MediaPlayer.Event.PlaybackError) event).getException().getMessage());
        } else if (Intrinsics.areEqual(event, MediaPlayer.Event.StartedPlaying.INSTANCE)) {
            audioPlayerView.maybeLogPlaybackStarted();
        }
        setState$default(audioPlayerView, null, true, 1, null);
        return Unit.f14616a;
    }

    private final void reset(boolean logDuration) {
        boolean z5 = false;
        toggleDurationEmitter(false);
        MediaPlayer player$chat_release = this.state.getPlayer$chat_release();
        if (player$chat_release != null && player$chat_release.shouldPlay()) {
            z5 = true;
        }
        this.wasPlayingBeforeBeingPaused = z5;
        if (logDuration) {
            this.state.storeDuration$chat_release();
        }
        this.state.releasePlayer$chat_release();
        this.resetJob = b0.t(CoroutineViewUtilsKt.getAttachedScope(this), null, new AnonymousClass1(null), 3);
        b0.t(CoroutineViewUtilsKt.getAttachedScope(this), null, new AnonymousClass2(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAudioFileDetails$lambda$9(Attachment attachment, RenderContext i18nFormat) {
        Intrinsics.checkNotNullParameter(i18nFormat, "$this$i18nFormat");
        i18nFormat.getArgs().put("filename", attachment.getFilename());
        return Unit.f14616a;
    }

    private final synchronized void setState(AudioPlayerViewState state, boolean forceRefresh) {
        boolean zAreEqual;
        if (forceRefresh) {
            zAreEqual = Intrinsics.areEqual(state.getSourceUrl(), this.state.getSourceUrl());
            boolean z5 = !zAreEqual;
            if (!zAreEqual) {
                prepareAudio(state);
            }
            this.state = state;
            configurePlayButton(state);
            configureLoading(state);
            configureAudioProgressView(state);
            configureAudioDetails(state);
            toggleDurationEmitter(state.shouldEmitDuration$chat_release());
            configurePlayerState(state, z5);
            return;
        }
        if (Intrinsics.areEqual(this.state, state)) {
            return;
        }
        zAreEqual = Intrinsics.areEqual(state.getSourceUrl(), this.state.getSourceUrl());
        boolean z6 = !zAreEqual;
        if (!zAreEqual && AudioPlayerManager.INSTANCE.hasCurrentPlayer(state.getAudioSource())) {
            prepareAudio(state);
        }
        this.state = state;
        configurePlayButton(state);
        configureLoading(state);
        configureAudioProgressView(state);
        configureAudioDetails(state);
        toggleDurationEmitter(state.shouldEmitDuration$chat_release());
        configurePlayerState(state, z6);
        return;
        throw th;
    }

    public static /* synthetic */ void setState$default(AudioPlayerView audioPlayerView, AudioPlayerViewState audioPlayerViewState, boolean z5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            audioPlayerViewState = audioPlayerView.state;
        }
        if ((i7 & 2) != 0) {
            z5 = false;
        }
        audioPlayerView.setState(audioPlayerViewState, z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setUploadProgress$lambda$11(AudioPlayerView audioPlayerView) {
        LinearLayout uploadOverlayBackground = audioPlayerView.binding.uploadOverlayBackground;
        Intrinsics.checkNotNullExpressionValue(uploadOverlayBackground, "uploadOverlayBackground");
        uploadOverlayBackground.setVisibility(8);
        audioPlayerView.uploadFinished = true;
        return Unit.f14616a;
    }

    private final String timeRemainingAccessibilityText(int i7) {
        return i7 >= 60 ? timeRemainingText(i7) : String.valueOf(i7);
    }

    private final String timeRemainingText(int i7) {
        String str = String.format("%01d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i7 / 60), Integer.valueOf(i7 % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private final int toSeconds(long j) {
        yq.a aVar = Duration.f14747e;
        return (int) Math.ceil(Duration.j(yq.c.h(j, yq.d.MILLISECONDS), yq.d.SECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toggleDurationEmitter(boolean shouldEmit) {
        Job job = this.durationJob;
        if (job != null) {
            job.f(null);
            Unit unit = Unit.f14616a;
        }
        this.durationJob = null;
        if (shouldEmit) {
            this.durationJob = b0.t(CoroutineViewUtilsKt.getAttachedScope(this), null, new C01162(null), 3);
        }
    }

    @NotNull
    public final AudioPlayerViewBinding getBinding() {
        return this.binding;
    }

    public final Listener getListener() {
        return this.listener;
    }

    public final void setAudioFileDetails(@NotNull Attachment attachment) {
        Intrinsics.checkNotNullParameter(attachment, "attachment");
        this.binding.wave.setVisibility(8);
        this.binding.audioDetailsView.setVisibility(0);
        this.binding.audioFileName.setText(attachment.getFilename());
        this.binding.audioFileSize.setText(attachment.getSize());
        LinearLayout linearLayout = this.binding.playerContainer;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        linearLayout.setContentDescription(I18nUtilsKt.i18nFormat(context, I18nMessage.AUDIO_FILE_A11Y_LABEL, new s(6, attachment)));
    }

    public final void setContainerBackgroundColor(Integer color) {
        this.binding.playerContainer.setBackgroundColor(color != null ? color.intValue() : ThemeManagerKt.getTheme().getEmbedBackground());
    }

    public final void setDurationMs(long durationMs) {
        this.durationMs = Long.valueOf(durationMs);
        AudioPlayerManager.CurrentProgress currentProgress$chat_release = this.state.getCurrentProgress$chat_release();
        long currentProgress = currentProgress$chat_release != null ? currentProgress$chat_release.getCurrentProgress() : 0L;
        AudioProgressView.DefaultImpls.setAudioProgress$default(getAudioProgressView(), currentProgress / durationMs, false, 2, null);
        this.isScrubbingEnabled = this.state.getCurrentProgress$chat_release() != null;
        this.binding.wave.setDuration(Long.valueOf(durationMs));
        configureDuration(Long.valueOf(durationMs - currentProgress), false);
    }

    public final void setListener(Listener listener) {
        this.listener = listener;
    }

    public final void setOnLongPress(@NotNull View.OnLongClickListener onLongPress) {
        Intrinsics.checkNotNullParameter(onLongPress, "onLongPress");
        this.onLongPress = onLongPress;
    }

    public final void setSampleData(@NotNull byte[] sampleData) {
        Intrinsics.checkNotNullParameter(sampleData, "sampleData");
        this.binding.wave.setVisibility(0);
        this.binding.audioDetailsView.setVisibility(8);
        this.binding.wave.setOriginalSampleData(sampleData);
        LinearLayout linearLayout = this.binding.playerContainer;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        linearLayout.setContentDescription(I18nUtilsKt.i18nFormat$default(context, I18nMessage.VOICE_MESSAGES_A11Y_LABEL, null, 2, null));
    }

    public final void setSourceUrl(@NotNull AudioAttachmentMessageAccessory accessory) {
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        boolean z5 = false;
        this.isScrubbingEnabled = false;
        if (Intrinsics.areEqual(accessory.getAttachment().getUrl(), this.state.getSourceUrl())) {
            return;
        }
        setState(new AudioPlayerViewState(accessory, z5, 2, null), true);
    }

    public final void setUnknownDuration() {
        configureDuration$default(this, null, false, 2, null);
    }

    public final void setUploadProgress(UploadItemProps uploadItemProps) {
        boolean z5 = uploadItemProps != null;
        this.binding.getRoot().setAlpha(uploadItemProps != null ? uploadItemProps.getUploadOpacity() : 1.0f);
        AttachmentUploadOverlayView attachmentUploadOverlayView = this.binding.uploadOverlay;
        Integer numValueOf = Integer.valueOf(SizeUtilsKt.getDpToPx(32));
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        Paint paint = shapeDrawable.getPaint();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        paint.setColor(ColorUtilsKt.getColorCompat(context, android.R.color.transparent));
        Unit unit = Unit.f14616a;
        int i7 = 16;
        attachmentUploadOverlayView.configureProgressView(numValueOf, shapeDrawable, Integer.valueOf(SizeUtilsKt.getDpToPx(16)), Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveTextDefault()), Integer.valueOf(SizeUtilsKt.getDpToPx(29)), Integer.valueOf(ThemeManagerKt.getTheme().getBorderSubtle()));
        this.binding.uploadOverlay.configureCompleteView(Integer.valueOf(SizeUtilsKt.getDpToPx(32)), Integer.valueOf(SizeUtilsKt.getDpToPx(19)));
        if (z5 && !this.uploadFinished) {
            this.binding.uploadOverlayBackground.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSurfaceHigh());
            LinearLayout uploadOverlayBackground = this.binding.uploadOverlayBackground;
            Intrinsics.checkNotNullExpressionValue(uploadOverlayBackground, "uploadOverlayBackground");
            uploadOverlayBackground.setVisibility(0);
        }
        r0 r0Var = new r0(i7, this);
        this.binding.uploadOverlay.setProgress(uploadItemProps);
        this.binding.uploadOverlay.setUploadCancel(uploadItemProps);
        this.binding.uploadOverlay.setOnProgressAnimationComplete(r0Var);
    }

    public final void shouldAnimate(boolean shouldAnimate) {
        this.shouldAnimate = shouldAnimate;
        getAudioProgressView().setShouldAnimate(shouldAnimate);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioPlayerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AudioPlayerView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AudioPlayerView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        int i10;
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        AudioPlayerViewBinding audioPlayerViewBindingInflate = AudioPlayerViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(audioPlayerViewBindingInflate, "inflate(...)");
        this.binding = audioPlayerViewBindingInflate;
        this.state = new AudioPlayerViewState(null, false, 3, 0 == true ? 1 : 0);
        this.shouldAnimate = true;
        ViewAttachedListener viewAttachedListener = new ViewAttachedListener(this, new c(this, 1), null, 4, null);
        this.attachStateChangeListener = viewAttachedListener;
        this.bounceAnimator = l.b(new f(context, 0));
        this.animatorManager = l.b(new c6.a(9, context, this));
        addOnAttachStateChangeListener(viewAttachedListener);
        LinearLayout linearLayout = audioPlayerViewBindingInflate.playerContainer;
        Intrinsics.checkNotNull(linearLayout);
        int dpToPx = SizeUtilsKt.getDpToPx(4);
        linearLayout.setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
        linearLayout.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSurfaceHigh());
        ViewClippingUtilsKt.clipToRoundedRectangle(linearLayout, SizeUtilsKt.getDpToPx(24));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        SimpleDraweeView button = audioPlayerViewBindingInflate.button;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        ViewClippingUtilsKt.clipToCircle(button);
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = audioPlayerViewBindingInflate.text;
        Intrinsics.checkNotNull(simpleDraweeSpanTextView);
        SetTextSizeSpKt.setTextSizeSp(simpleDraweeSpanTextView, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(simpleDraweeSpanTextView, DiscordFont.PrimaryMedium);
        simpleDraweeSpanTextView.setTextColor(ThemeManagerKt.getTheme().getInteractiveTextDefault());
        if (ThemeManager.INSTANCE.isThemeLight()) {
            i10 = R.drawable.drawable_audio_play_button_gradient_light;
        } else {
            i10 = R.drawable.drawable_audio_play_button_gradient_dark;
        }
        audioPlayerViewBindingInflate.buttonContainer.setBackgroundResource(i10);
        audioPlayerViewBindingInflate.wipe.setBackgroundResource(i10);
        u0.p(audioPlayerViewBindingInflate.buttonContainer, new androidx.core.view.b() { // from class: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView.3
            @Override // androidx.core.view.b
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.o("android.widget.Button");
            }
        });
        TextView textView = audioPlayerViewBindingInflate.audioFileName;
        textView.setTextColor(ThemeManagerKt.getTheme().getInteractiveTextDefault());
        Intrinsics.checkNotNull(textView);
        DiscordFont discordFont = DiscordFont.PrimaryNormal;
        DiscordFontUtilsKt.setDiscordFont(textView, discordFont);
        TextView textView2 = audioPlayerViewBindingInflate.audioFileSize;
        textView2.setTextColor(ThemeManagerKt.getTheme().getInteractiveTextDefault());
        Intrinsics.checkNotNull(textView2);
        DiscordFontUtilsKt.setDiscordFont(textView2, discordFont);
        configureGestures();
        u0.p(this, new androidx.core.view.b() { // from class: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView.6
            @Override // androidx.core.view.b
            public boolean onRequestSendAccessibilityEvent(ViewGroup host, View child, AccessibilityEvent event) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(child, "child");
                Intrinsics.checkNotNullParameter(event, "event");
                AudioPlayerView.this.getBinding().audioDetailsView.setImportantForAccessibility(event.getAction() == 32768 ? 2 : 0);
                return super.onRequestSendAccessibilityEvent(host, child, event);
            }
        });
        addOnLayoutChangeListener(new com.discord.channel_spine.a(2, this));
    }
}
