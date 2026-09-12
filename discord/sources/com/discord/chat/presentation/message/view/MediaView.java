package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ar.b0;
import com.discord.chat.databinding.MediaViewBinding;
import com.discord.chat.presentation.message.utils.GetMediaImagePlaceholderStatesListenerKt;
import com.discord.chat.presentation.message.view.media.ViewAttachedListener;
import com.discord.image.fresco.SetOptionalImageUrlKt;
import com.discord.media_player.MediaPlayer;
import com.discord.media_player.MediaPlayerManager;
import com.discord.media_player.MediaPlayerManagerModule;
import com.discord.media_player.MediaPlayerView;
import com.discord.media_player.MediaSource;
import com.discord.media_player.reactevents.MediaPlayFinishedAnalytics;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.portals.from_native.PortalFromNativeContextManager;
import com.discord.portals.utils.ViewRemoveFromParentKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.theme.R;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.drawable.ScalingUtils$ScaleType;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000½\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001n\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\fJã\u0001\u0010.\u001a\u00020\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00142\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00142\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00142\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\u00062\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010+\u001a\u00020*2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020,¢\u0006\u0004\b1\u00102J!\u00107\u001a\u00020\n2\b\u00104\u001a\u0004\u0018\u0001032\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108J!\u0010<\u001a\u00020\n2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\n09¢\u0006\u0004\b<\u0010=J?\u0010C\u001a\u00020\n2\u0006\u0010>\u001a\u00020\u00142\b\u0010?\u001a\u0004\u0018\u00010$2\b\u0010@\u001a\u0004\u0018\u00010&2\b\u0010A\u001a\u0004\u0018\u00010\u00062\b\u0010B\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\nH\u0002¢\u0006\u0004\bE\u0010\fJ\u000f\u0010F\u001a\u00020\nH\u0002¢\u0006\u0004\bF\u0010\fJ\u000f\u0010G\u001a\u00020\nH\u0002¢\u0006\u0004\bG\u0010\fJ\u0017\u0010H\u001a\u00020\n2\u0006\u0010F\u001a\u00020\u0014H\u0002¢\u0006\u0004\bH\u0010IJ-\u0010N\u001a\u0010\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020M\u0018\u00010K2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010J\u001a\u00020\u0014H\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\nH\u0002¢\u0006\u0004\bP\u0010\fJ\u000f\u0010Q\u001a\u00020\nH\u0002¢\u0006\u0004\bQ\u0010\fR\u001a\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bS\u0010T\u0012\u0004\bU\u0010\fR\u0018\u0010V\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010XR\u0018\u0010Y\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010[R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010[R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010[R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\\R\u0016\u0010\u001a\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010[R\u0016\u0010]\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010[R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010^R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010_R\u0016\u0010\u001e\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010[R\u0016\u0010\u001f\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010[R\u0016\u0010 \u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010[R\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010`R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010aR\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010bR\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010cR\u0018\u0010)\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010^R\u0018\u0010(\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010^R\"\u0010;\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\n098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010dR\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010eR\u0018\u0010f\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010bR\u0016\u0010h\u001a\u0004\u0018\u00010g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u001a\u0010k\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bk\u0010l\u0012\u0004\bm\u0010\fR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010t\u001a\u0004\u0018\u00010q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u0018\u0010w\u001a\u00020\u0014*\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bu\u0010v¨\u0006x"}, d2 = {"Lcom/discord/chat/presentation/message/view/MediaView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onDetachedFromWindow", "()V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onAttachedToWindow", "Lcom/discord/media_player/MediaSource;", "mediaSource", "", "mediaViewDetached", "mediaViewScrolling", "mediaViewFocused", "Lcom/discord/media_player/MediaPlayer$Event;", "mediaPlaybackState", "mediaVolumeOn", "mediaOrientation", "Lcom/discord/portals/from_native/PortalFromNativeContextManager$Event;", "mediaPortalEvent", "mediaCanPlayInline", "mediaPlayThirdParty", "mediaHidePlayButton", "mediaThumbnailFadeDuration", "Lkotlin/Function0;", "mediaOnPlayCallback", "", "overlayTagText", "Lcom/discord/react_asset_fetcher/ReactAsset;", "overlayTagIcon", "overlayTagBackgroundColor", "overlayTagTextColor", "Lcom/discord/media_player/MediaPlayer$PlayerSettings;", "playerSettings", "Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;", "imagePreviewScaleType", "setMediaData", "(Lcom/discord/media_player/MediaSource;ZZZLcom/discord/media_player/MediaPlayer$Event;ZLjava/lang/Integer;Lcom/discord/portals/from_native/PortalFromNativeContextManager$Event;ZZZILkotlin/jvm/functions/Function0;Ljava/lang/String;Lcom/discord/react_asset_fetcher/ReactAsset;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/discord/media_player/MediaPlayer$PlayerSettings;Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;)V", "scaleType", "setImagePreviewScaleType", "(Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;)V", "Landroid/view/View$OnClickListener;", "onClickListener", "Landroid/view/View$OnLongClickListener;", "onLongClickListener", "setOnMediaClickListeners", "(Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V", "Lkotlin/Function1;", "Lcom/discord/media_player/reactevents/MediaPlayFinishedAnalytics;", "onMediaPlayFinishedAnalytics", "setAnalyticsListener", "(Lkotlin/jvm/functions/Function1;)V", "isTagVisible", "content", "icon", ViewProps.BACKGROUND_COLOR, "textColor", "setupTag", "(ZLjava/lang/String;Lcom/discord/react_asset_fetcher/ReactAsset;Ljava/lang/Integer;Ljava/lang/Integer;)V", "pause", "play", "prepareAndPlay", "togglePortalControl", "(Z)V", "loopMedia", "Lkotlin/Pair;", "Lcom/discord/media_player/MediaPlayer;", "Lcom/discord/media_player/MediaPlayerView;", "prepareMediaPlayer", "(Lcom/discord/media_player/MediaSource;Z)Lkotlin/Pair;", "registerForPortal", "releasePlayer", "Lcom/discord/chat/databinding/MediaViewBinding;", "binding", "Lcom/discord/chat/databinding/MediaViewBinding;", "getBinding$annotations", "mediaPlayerView", "Lcom/discord/media_player/MediaPlayerView;", "Lcom/discord/media_player/MediaSource;", "mediaPlayer", "Lcom/discord/media_player/MediaPlayer;", "Z", "Lcom/discord/media_player/MediaPlayer$Event;", "mediaShouldResume", "Ljava/lang/Integer;", "Lcom/discord/portals/from_native/PortalFromNativeContextManager$Event;", "I", "Lkotlin/jvm/functions/Function0;", "Ljava/lang/String;", "Lcom/discord/react_asset_fetcher/ReactAsset;", "Lkotlin/jvm/functions/Function1;", "Lcom/discord/media_player/MediaPlayer$PlayerSettings;", "pauseId", "Lcom/discord/media_player/MediaPlayerManagerModule;", "managerModule", "Lcom/discord/media_player/MediaPlayerManagerModule;", "Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;", "attachStateChangeListener", "Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;", "getAttachStateChangeListener$annotations", "com/discord/chat/presentation/message/view/MediaView$lifecycleListener$1", "lifecycleListener", "Lcom/discord/chat/presentation/message/view/MediaView$lifecycleListener$1;", "Lcom/facebook/react/bridge/ReactContext;", "getReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "reactContext", "getShouldShowGifIndicator", "(Lcom/discord/media_player/MediaSource;)Z", "shouldShowGifIndicator", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMediaView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaView.kt\ncom/discord/chat/presentation/message/view/MediaView\n+ 2 CastUtils.kt\ncom/discord/misc/utilities/kotlin/CastUtilsKt\n+ 3 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,654:1\n8#2:655\n27#3:656\n257#4,2:657\n257#4,2:659\n257#4,2:661\n257#4,2:663\n257#4,2:665\n255#4:667\n257#4,2:668\n255#4:670\n257#4,2:671\n257#4,2:673\n1#5:675\n*S KotlinDebug\n*F\n+ 1 MediaView.kt\ncom/discord/chat/presentation/message/view/MediaView\n*L\n83#1:655\n129#1:656\n258#1:657,2\n279#1:659,2\n283#1:661,2\n291#1:663,2\n303#1:665,2\n335#1:667\n477#1:668,2\n484#1:670\n490#1:671,2\n494#1:673,2\n*E\n"})
public class MediaView extends FrameLayout {

    @NotNull
    private final ViewAttachedListener attachStateChangeListener;

    @NotNull
    private final MediaViewBinding binding;

    @NotNull
    private final MediaView$lifecycleListener$1 lifecycleListener;
    private final MediaPlayerManagerModule managerModule;
    private boolean mediaCanPlayInline;
    private boolean mediaHidePlayButton;

    @NotNull
    private Function0<Unit> mediaOnPlayCallback;
    private Integer mediaOrientation;
    private boolean mediaPlayThirdParty;
    private MediaPlayer.Event mediaPlaybackState;
    private MediaPlayer mediaPlayer;
    private MediaPlayerView mediaPlayerView;
    private PortalFromNativeContextManager.Event mediaPortalEvent;
    private boolean mediaShouldResume;
    private MediaSource mediaSource;
    private int mediaThumbnailFadeDuration;
    private boolean mediaViewDetached;
    private boolean mediaViewFocused;
    private boolean mediaViewScrolling;
    private boolean mediaVolumeOn;

    @NotNull
    private Function1<? super MediaPlayFinishedAnalytics, Unit> onMediaPlayFinishedAnalytics;
    private Integer overlayTagBackgroundColor;
    private ReactAsset overlayTagIcon;
    private String overlayTagText;
    private Integer overlayTagTextColor;
    private String pauseId;

    @NotNull
    private MediaPlayer.PlayerSettings playerSettings;

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.view.MediaView$onAttachedToWindow$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.chat.presentation.message.view.MediaView$onAttachedToWindow$1", f = "MediaView.kt", l = {158}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaView.this.new AnonymousClass1(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                Flow portalContextIdsFlow = PortalFromNativeContextManager.INSTANCE.getPortalContextIdsFlow();
                final MediaView mediaView = MediaView.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.discord.chat.presentation.message.view.MediaView.onAttachedToWindow.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(PortalFromNativeContextManager.Event event, Continuation continuation) {
                        MediaView.setMediaData$default(mediaView, null, false, false, false, null, false, null, event, false, false, false, 0, null, null, null, null, null, null, null, 524159, null);
                        return Unit.f14616a;
                    }
                };
                this.label = 1;
                if (portalContextIdsFlow.collect(flowCollector, this) == aVar) {
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

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.view.MediaView$onAttachedToWindow$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.chat.presentation.message.view.MediaView$onAttachedToWindow$2", f = "MediaView.kt", l = {165}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MediaView.this.new AnonymousClass2(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            Flow pausePlayerFlow;
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MediaPlayerManagerModule mediaPlayerManagerModule = MediaView.this.managerModule;
                if (mediaPlayerManagerModule != null && (pausePlayerFlow = mediaPlayerManagerModule.getPausePlayerFlow()) != null) {
                    final MediaView mediaView = MediaView.this;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.discord.chat.presentation.message.view.MediaView.onAttachedToWindow.2.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(String str, Continuation continuation) {
                            if (!Intrinsics.areEqual(mediaView.pauseId, str)) {
                                mediaView.pauseId = str;
                                mediaView.pause();
                            }
                            return Unit.f14616a;
                        }
                    };
                    this.label = 1;
                    if (pausePlayerFlow.collect(flowCollector, this) == aVar) {
                        return aVar;
                    }
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachStateChangeListener$lambda$2(MediaView mediaView, boolean z5) {
        if (z5) {
            setMediaData$default(mediaView, null, false, false, false, null, false, null, null, false, false, false, 0, null, null, null, null, null, null, null, 524285, null);
        } else {
            setMediaData$default(mediaView, null, true, false, false, null, false, null, null, false, false, false, 0, null, null, null, null, null, null, null, 524281, null);
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachStateChangeListener$lambda$3(MediaView mediaView, boolean z5) {
        setMediaData$default(mediaView, null, false, z5, false, null, false, null, null, false, false, false, 0, null, null, null, null, null, null, null, 524283, null);
        return Unit.f14616a;
    }

    private static /* synthetic */ void getAttachStateChangeListener$annotations() {
    }

    private static /* synthetic */ void getBinding$annotations() {
    }

    private final ReactContext getReactContext() {
        Context context = getContext();
        if (context instanceof ReactContext) {
            return (ReactContext) context;
        }
        return null;
    }

    private final boolean getShouldShowGifIndicator(MediaSource mediaSource) {
        return mediaSource.getIsGifv() && !mediaSource.getShouldAutoPlay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMediaPlayFinishedAnalytics$lambda$1(MediaPlayFinishedAnalytics it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pause() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
        togglePortalControl(false);
    }

    private final void play() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.play();
        }
        togglePortalControl(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareAndPlay() {
        if (this.mediaPlayer != null && this.mediaPlayerView != null) {
            play();
            return;
        }
        MediaSource mediaSource = this.mediaSource;
        if (mediaSource == null) {
            return;
        }
        prepareMediaPlayer(mediaSource, false);
        this.mediaOnPlayCallback.invoke();
    }

    private final Pair<MediaPlayer, MediaPlayerView> prepareMediaPlayer(MediaSource mediaSource, boolean loopMedia) {
        if (mediaSource.getSourceUrl() == null) {
            return null;
        }
        MediaPlayerView mediaPlayerView = this.mediaPlayerView;
        if (mediaPlayerView == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            mediaPlayerView = new MediaPlayerView(context);
            addView(mediaPlayerView.getView(), 0, new FrameLayout.LayoutParams(-1, -1));
        }
        MediaPlayerView mediaPlayerView2 = mediaPlayerView;
        mediaPlayerView2.setVisible(true);
        MediaPlayer mediaPlayerAcquire = this.mediaPlayer;
        if (mediaPlayerAcquire == null) {
            MediaPlayerManager mediaPlayerManager = MediaPlayerManager.INSTANCE;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Double portal = mediaSource.getPortal();
            Intrinsics.checkNotNull(portal);
            mediaPlayerAcquire = mediaPlayerManager.acquire(context2, portal.doubleValue(), this.playerSettings);
        }
        MediaPlayer mediaPlayer = mediaPlayerAcquire;
        mediaPlayer.setEventListener(new r(this, 3));
        mediaPlayer.setVolumeListener(new r(this, 4));
        mediaPlayer.setAnalyticsListener(new r(this, 5));
        mediaPlayer.setVolume(mediaSource.getIsGifv() ? 0.0f : 1.0f);
        MediaPlayer.preparePlayer$default(mediaPlayer, mediaSource, true, loopMedia, 0L, mediaPlayerView2, null, 40, null);
        this.mediaPlayer = mediaPlayer;
        this.mediaPlayerView = mediaPlayerView2;
        ViewMeasureExtensionsKt.measureAndLayout(this);
        return new Pair<>(mediaPlayer, mediaPlayerView2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit prepareMediaPlayer$lambda$21$lambda$18(MediaView mediaView, MediaPlayer.Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        setMediaData$default(mediaView, null, false, false, false, event, false, null, null, false, false, false, 0, null, null, null, null, null, null, null, 524271, null);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit prepareMediaPlayer$lambda$21$lambda$19(MediaView mediaView, float f2) {
        setMediaData$default(mediaView, null, false, false, false, null, f2 > 0.0f, null, null, false, false, false, 0, null, null, null, null, null, null, null, 524255, null);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit prepareMediaPlayer$lambda$21$lambda$20(MediaView mediaView, MediaPlayFinishedAnalytics event) {
        Intrinsics.checkNotNullParameter(event, "event");
        mediaView.onMediaPlayFinishedAnalytics.invoke(event);
        return Unit.f14616a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r1 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void registerForPortal() {
        /*
            r11 = this;
            com.discord.media_player.MediaSource r2 = r11.mediaSource
            if (r2 != 0) goto L7
        L4:
            r1 = r11
            goto L6b
        L7:
            java.lang.Double r0 = r2.getPortal()
            if (r0 == 0) goto L4
            double r4 = r0.doubleValue()
            com.discord.media_player.MediaPlayer r0 = r11.mediaPlayer
            if (r0 == 0) goto L27
            com.discord.media_player.MediaPlayerView r1 = r11.mediaPlayerView
            if (r1 == 0) goto L27
            kotlin.Pair r1 = new kotlin.Pair
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            com.discord.media_player.MediaPlayerView r3 = r11.mediaPlayerView
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            r1.<init>(r0, r3)
            goto L38
        L27:
            boolean r0 = r2.getIsValid()
            if (r0 == 0) goto L4
            boolean r0 = r2.getIsGifv()
            kotlin.Pair r1 = r11.prepareMediaPlayer(r2, r0)
            if (r1 != 0) goto L38
            goto L4
        L38:
            java.lang.Object r0 = r1.f14612d
            r3 = r0
            com.discord.media_player.MediaPlayer r3 = (com.discord.media_player.MediaPlayer) r3
            java.lang.Object r0 = r1.f14613e
            com.discord.media_player.MediaPlayerView r0 = (com.discord.media_player.MediaPlayerView) r0
            com.discord.portals.from_native.PortalFromNativeContextManager r7 = com.discord.portals.from_native.PortalFromNativeContextManager.INSTANCE
            android.view.View r8 = r0.getView()
            r9 = r7
            com.discord.chat.presentation.message.view.r r7 = new com.discord.chat.presentation.message.view.r
            r1 = 2
            r7.<init>(r11, r1)
            r5 = r4
            r4 = r0
            com.discord.chat.presentation.message.view.s r0 = new com.discord.chat.presentation.message.view.s
            r1 = r11
            r0.<init>()
            r4 = r9
            com.discord.age_assurance.a r9 = new com.discord.age_assurance.a
            r10 = 3
            r9.<init>(r11, r3, r2, r10)
            b7.a r10 = new b7.a
            r3 = 12
            r10.<init>(r3, r2, r11)
            r3 = r4
            r4 = r5
            r6 = r8
            r8 = r0
            r3.addPortal(r4, r6, r7, r8, r9, r10)
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.MediaView.registerForPortal():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerForPortal$lambda$22(MediaView mediaView, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        mediaView.removeOnAttachStateChangeListener(mediaView.attachStateChangeListener);
        ViewRemoveFromParentKt.removeFromParent(view);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerForPortal$lambda$24(final MediaView mediaView, MediaSource mediaSource, final MediaPlayer mediaPlayer, final MediaPlayerView mediaPlayerView, final double d6, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        MediaPlayerManagerModule mediaPlayerManagerModule = mediaView.managerModule;
        if (mediaPlayerManagerModule != null) {
            mediaPlayerManagerModule.startPlayerProgressInterval(mediaSource, mediaPlayer);
        }
        mediaPlayerView.getView().post(new Runnable() { // from class: com.discord.chat.presentation.message.view.q
            @Override // java.lang.Runnable
            public final void run() {
                MediaView.registerForPortal$lambda$24$lambda$23(this.f4244d, d6, mediaPlayer, mediaPlayerView);
            }
        });
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerForPortal$lambda$24$lambda$23(MediaView mediaView, double d6, MediaPlayer mediaPlayer, MediaPlayerView mediaPlayerView) {
        if (!mediaView.mediaViewFocused || Intrinsics.areEqual(PortalFromNativeContextManager.INSTANCE.isMediaViewBeingPortaled(Double.valueOf(d6)), Boolean.FALSE)) {
            return;
        }
        MediaSource mediaSource = mediaView.mediaSource;
        if (Intrinsics.areEqual(d6, mediaSource != null ? mediaSource.getPortal() : null)) {
            mediaPlayer.reattachSurface(mediaPlayerView);
            mediaView.play();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerForPortal$lambda$25(MediaView mediaView, MediaPlayer mediaPlayer, MediaSource mediaSource, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mediaView.mediaVolumeOn = !mediaPlayer.isMuted();
        MediaPlayerManagerModule mediaPlayerManagerModule = mediaView.managerModule;
        if (mediaPlayerManagerModule != null) {
            mediaPlayerManagerModule.stopPlayerProgressInterval(mediaSource);
        }
        Double portal = mediaSource.getPortal();
        MediaSource mediaSource2 = mediaView.mediaSource;
        if (!Intrinsics.areEqual(portal, mediaSource2 != null ? mediaSource2.getPortal() : null) || mediaPlayer.hasEnded() || !mediaView.isAttachedToWindow()) {
            mediaView.releasePlayer();
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerForPortal$lambda$26(MediaSource mediaSource, MediaView mediaView, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Double portal = mediaSource.getPortal();
        MediaSource mediaSource2 = mediaView.mediaSource;
        if (Intrinsics.areEqual(portal, mediaSource2 != null ? mediaSource2.getPortal() : null)) {
            setMediaData$default(mediaView, null, false, false, false, null, false, null, null, false, false, false, 0, null, null, null, null, null, null, null, 524287, null);
            mediaView.addView(view, 0);
            ViewMeasureExtensionsKt.measureAndLayout(mediaView);
        }
        mediaView.addOnAttachStateChangeListener(mediaView.attachStateChangeListener);
        return Unit.f14616a;
    }

    private final void releasePlayer() {
        Double portal;
        MediaPlayerManagerModule mediaPlayerManagerModule = this.managerModule;
        if (mediaPlayerManagerModule != null) {
            MediaSource mediaSource = this.mediaSource;
            if (mediaSource == null || (portal = mediaSource.getPortal()) == null) {
                return;
            } else {
                mediaPlayerManagerModule.toggle(portal.doubleValue(), false);
            }
        }
        MediaPlayerManager mediaPlayerManager = MediaPlayerManager.INSTANCE;
        MediaSource mediaSource2 = this.mediaSource;
        mediaPlayerManager.release(mediaSource2 != null ? mediaSource2.getPortal() : null);
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            Unit unit = Unit.f14616a;
            this.mediaPlayer = null;
        }
        MediaPlayerView mediaPlayerView = this.mediaPlayerView;
        if (mediaPlayerView != null) {
            mediaPlayerView.reset();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setMediaData$default(MediaView mediaView, MediaSource mediaSource, boolean z5, boolean z6, boolean z7, MediaPlayer.Event event, boolean z10, Integer num, PortalFromNativeContextManager.Event event2, boolean z11, boolean z12, boolean z13, int i7, Function0 function0, String str, ReactAsset reactAsset, Integer num2, Integer num3, MediaPlayer.PlayerSettings playerSettings, ScalingUtils$ScaleType scalingUtils$ScaleType, int i10, Object obj) {
        ScalingUtils$ScaleType scalingUtils$ScaleTypeF;
        MediaPlayer.PlayerSettings playerSettings2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMediaData");
        }
        MediaSource mediaSource2 = (i10 & 1) != 0 ? mediaView.mediaSource : mediaSource;
        boolean z14 = (i10 & 2) != 0 ? mediaView.mediaViewDetached : z5;
        boolean z15 = (i10 & 4) != 0 ? mediaView.mediaViewScrolling : z6;
        boolean z16 = (i10 & 8) != 0 ? mediaView.mediaViewFocused : z7;
        MediaPlayer.Event event3 = (i10 & 16) != 0 ? mediaView.mediaPlaybackState : event;
        boolean z17 = (i10 & 32) != 0 ? mediaView.mediaVolumeOn : z10;
        Integer num4 = (i10 & 64) != 0 ? mediaView.mediaOrientation : num;
        PortalFromNativeContextManager.Event event4 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? mediaView.mediaPortalEvent : event2;
        boolean z18 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? mediaView.mediaCanPlayInline : z11;
        boolean z19 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? mediaView.mediaPlayThirdParty : z12;
        boolean z20 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? mediaView.mediaHidePlayButton : z13;
        int i11 = (i10 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? mediaView.mediaThumbnailFadeDuration : i7;
        Function0 function1 = (i10 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? mediaView.mediaOnPlayCallback : function0;
        String str2 = (i10 & 8192) != 0 ? mediaView.overlayTagText : str;
        MediaSource mediaSource3 = mediaSource2;
        ReactAsset reactAsset2 = (i10 & 16384) != 0 ? mediaView.overlayTagIcon : reactAsset;
        Integer num5 = (i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? mediaView.overlayTagBackgroundColor : num2;
        Integer num6 = (i10 & 65536) != 0 ? mediaView.overlayTagTextColor : num3;
        MediaPlayer.PlayerSettings playerSettings3 = (i10 & 131072) != 0 ? mediaView.playerSettings : playerSettings;
        if ((i10 & 262144) != 0) {
            playerSettings2 = playerSettings3;
            scalingUtils$ScaleTypeF = ((GenericDraweeHierarchy) mediaView.binding.inlineMediaImagePreview.getHierarchy()).f();
        } else {
            scalingUtils$ScaleTypeF = scalingUtils$ScaleType;
            playerSettings2 = playerSettings3;
        }
        mediaView.setMediaData(mediaSource3, z14, z15, z16, event3, z17, num4, event4, z18, z19, z20, i11, function1, str2, reactAsset2, num5, num6, playerSettings2, scalingUtils$ScaleTypeF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setMediaData$lambda$10(MediaView mediaView, boolean z5, MediaSource mediaSource, View view) {
        Double portal;
        MediaPlayer mediaPlayer = mediaView.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(z5 ? 0.0f : 1.0f);
        }
        if (mediaSource == null || (portal = mediaSource.getPortal()) == null) {
            return;
        }
        double dDoubleValue = portal.doubleValue();
        MediaPlayerManagerModule mediaPlayerManagerModule = mediaView.managerModule;
        if (mediaPlayerManagerModule != null) {
            mediaPlayerManagerModule.onMuteToggle(dDoubleValue, z5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setMediaData$lambda$11(boolean z5, boolean z6, MediaSource mediaSource, MediaView mediaView, MediaPlayer mediaPlayer, MediaPlayerView mediaPlayerView) {
        if (z5 || !z6) {
            return;
        }
        if (!Intrinsics.areEqual(PortalFromNativeContextManager.INSTANCE.isMediaViewBeingPortaled(mediaSource != null ? mediaSource.getPortal() : null), Boolean.FALSE) && mediaView.mediaPlayer == mediaPlayer && mediaView.mediaPlayerView == mediaPlayerView) {
            mediaPlayer.reattachSurface(mediaPlayerView);
            mediaView.play();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnMediaClickListeners$lambda$12(MediaView mediaView, View.OnClickListener onClickListener, View view) {
        if (mediaView.mediaCanPlayInline && !mediaView.mediaPlayThirdParty) {
            MediaSource mediaSource = mediaView.mediaSource;
            if ((mediaSource != null ? mediaSource.getPortal() : null) != null) {
                mediaView.prepareAndPlay();
            }
        }
        mediaView.registerForPortal();
        onClickListener.onClick(mediaView);
    }

    private final void setupTag(boolean isTagVisible, String content, ReactAsset icon, Integer backgroundColor, Integer textColor) {
        ConstraintLayout constraintLayout = this.binding.overlayTag;
        Intrinsics.checkNotNull(constraintLayout);
        constraintLayout.setVisibility(isTagVisible ? 0 : 8);
        if (backgroundColor != null) {
            constraintLayout.setBackgroundTintList(ColorStateList.valueOf(backgroundColor.intValue()));
        }
        ConstraintLayout overlayTag = this.binding.overlayTag;
        Intrinsics.checkNotNullExpressionValue(overlayTag, "overlayTag");
        if (overlayTag.getVisibility() == 0) {
            int iIntValue = textColor != null ? textColor.intValue() : R.color.white_500;
            SimpleDraweeView simpleDraweeView = this.binding.overlayTagIcon;
            if (icon != null) {
                Intrinsics.checkNotNull(simpleDraweeView);
                simpleDraweeView.setVisibility(0);
                ReactAssetUtilsKt.setReactAsset(simpleDraweeView, icon);
                ColorUtilsKt.setTintColor(simpleDraweeView, Integer.valueOf(iIntValue));
            } else {
                Intrinsics.checkNotNull(simpleDraweeView);
                simpleDraweeView.setVisibility(8);
            }
            TextView textView = this.binding.overlayTagText;
            textView.setTextColor(iIntValue);
            textView.setText(content);
        }
    }

    private final void togglePortalControl(boolean play) {
        Double portal;
        MediaSource mediaSource = this.mediaSource;
        if (mediaSource == null || (portal = mediaSource.getPortal()) == null) {
            return;
        }
        double dDoubleValue = portal.doubleValue();
        MediaPlayerManagerModule mediaPlayerManagerModule = this.managerModule;
        if (mediaPlayerManagerModule != null) {
            mediaPlayerManagerModule.toggle(dDoubleValue, play);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ReactContext reactContext = getReactContext();
        if (reactContext != null) {
            reactContext.addLifecycleEventListener(this.lifecycleListener);
        }
        b0.t(CoroutineViewUtilsKt.attachedScope(this, true), null, new AnonymousClass1(null), 3);
        b0.t(CoroutineViewUtilsKt.attachedScope(this, true), null, new AnonymousClass2(null), 3);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        setMediaData$default(this, null, false, false, false, null, false, newConfig != null ? Integer.valueOf(newConfig.orientation) : null, null, false, false, false, 0, null, null, null, null, null, null, null, 524223, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ReactContext reactContext = getReactContext();
        if (reactContext != null) {
            reactContext.removeLifecycleEventListener(this.lifecycleListener);
        }
    }

    public final void setAnalyticsListener(@NotNull Function1<? super MediaPlayFinishedAnalytics, Unit> onMediaPlayFinishedAnalytics) {
        Intrinsics.checkNotNullParameter(onMediaPlayFinishedAnalytics, "onMediaPlayFinishedAnalytics");
        this.onMediaPlayFinishedAnalytics = onMediaPlayFinishedAnalytics;
    }

    public final void setImagePreviewScaleType(@NotNull ScalingUtils$ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        ((GenericDraweeHierarchy) this.binding.inlineMediaImagePreview.getHierarchy()).j(scaleType);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01da  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:117:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:120:0x020a  */
    /* JADX WARN: Code duplicated, block: B:136:0x023c  */
    /* JADX WARN: Code duplicated, block: B:139:0x024a  */
    /* JADX WARN: Code duplicated, block: B:140:0x024d  */
    /* JADX WARN: Code duplicated, block: B:143:0x026a  */
    /* JADX WARN: Code duplicated, block: B:144:0x026d  */
    /* JADX WARN: Code duplicated, block: B:153:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:159:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:168:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:170:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:171:0x02d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:176:0x0300  */
    /* JADX WARN: Code duplicated, block: B:180:0x030c  */
    /* JADX WARN: Code duplicated, block: B:201:0x0341  */
    /* JADX WARN: Code duplicated, block: B:216:0x0368  */
    /* JADX WARN: Code duplicated, block: B:230:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:236:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:238:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:240:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:242:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:246:? A[RETURN, SYNTHETIC] */
    public final void setMediaData(final MediaSource mediaSource, final boolean mediaViewDetached, boolean mediaViewScrolling, final boolean mediaViewFocused, MediaPlayer.Event mediaPlaybackState, boolean mediaVolumeOn, Integer mediaOrientation, PortalFromNativeContextManager.Event mediaPortalEvent, boolean mediaCanPlayInline, boolean mediaPlayThirdParty, boolean mediaHidePlayButton, int mediaThumbnailFadeDuration, @NotNull Function0<Unit> mediaOnPlayCallback, String overlayTagText, ReactAsset overlayTagIcon, Integer overlayTagBackgroundColor, Integer overlayTagTextColor, @NotNull MediaPlayer.PlayerSettings playerSettings, ScalingUtils$ScaleType imagePreviewScaleType) {
        Integer num;
        boolean z5;
        boolean z6;
        boolean z7;
        int i7;
        com.discord.chat.presentation.list.delegate.b bVar;
        int i10;
        ReactAsset reactAsset;
        I18nMessage i18nMessage;
        SimpleDraweeView inlineMediaPlayButton;
        boolean z10;
        boolean zAreEqual;
        boolean z11;
        boolean z12;
        MediaPlayerView mediaPlayerView;
        boolean z13;
        MediaPlayerView mediaPlayerView2;
        View view;
        boolean z14;
        boolean z15;
        Intrinsics.checkNotNullParameter(mediaOnPlayCallback, "mediaOnPlayCallback");
        Intrinsics.checkNotNullParameter(playerSettings, "playerSettings");
        if (Intrinsics.areEqual(this.mediaSource, mediaSource) && this.mediaViewDetached == mediaViewDetached && this.mediaViewScrolling == mediaViewScrolling && this.mediaViewFocused == mediaViewFocused && Intrinsics.areEqual(this.mediaPlaybackState, mediaPlaybackState) && this.mediaVolumeOn == mediaVolumeOn && Intrinsics.areEqual(this.mediaOrientation, mediaOrientation) && Intrinsics.areEqual(this.mediaPortalEvent, mediaPortalEvent) && this.mediaCanPlayInline == mediaCanPlayInline && this.mediaPlayThirdParty == mediaPlayThirdParty && this.mediaHidePlayButton == mediaHidePlayButton && this.mediaThumbnailFadeDuration == mediaThumbnailFadeDuration && Intrinsics.areEqual(this.mediaOnPlayCallback, mediaOnPlayCallback) && Intrinsics.areEqual(this.overlayTagText, overlayTagText) && this.overlayTagIcon == overlayTagIcon && Intrinsics.areEqual(this.overlayTagBackgroundColor, overlayTagBackgroundColor)) {
            num = overlayTagTextColor;
            if (Intrinsics.areEqual(this.overlayTagTextColor, num) && Intrinsics.areEqual(this.playerSettings, playerSettings)) {
                return;
            }
        } else {
            num = overlayTagTextColor;
        }
        boolean zAreEqual2 = Intrinsics.areEqual(this.mediaSource, mediaSource);
        boolean zAreEqual3 = Intrinsics.areEqual(this.mediaOrientation, mediaOrientation);
        this.mediaSource = mediaSource;
        this.mediaViewDetached = mediaViewDetached;
        this.mediaViewScrolling = mediaViewScrolling;
        this.mediaViewFocused = mediaViewFocused;
        this.mediaPlaybackState = mediaPlaybackState;
        this.mediaOrientation = mediaOrientation;
        this.mediaVolumeOn = mediaVolumeOn;
        this.mediaPortalEvent = mediaPortalEvent;
        this.mediaCanPlayInline = mediaCanPlayInline;
        this.mediaPlayThirdParty = mediaPlayThirdParty;
        this.mediaHidePlayButton = mediaHidePlayButton;
        this.mediaThumbnailFadeDuration = mediaThumbnailFadeDuration;
        this.mediaOnPlayCallback = mediaOnPlayCallback;
        this.overlayTagText = overlayTagText;
        this.overlayTagIcon = overlayTagIcon;
        this.overlayTagBackgroundColor = overlayTagBackgroundColor;
        this.overlayTagTextColor = num;
        this.playerSettings = playerSettings;
        Boolean boolIsMediaViewBeingPortaled = PortalFromNativeContextManager.INSTANCE.isMediaViewBeingPortaled(mediaSource != null ? mediaSource.getPortal() : null);
        if (!zAreEqual3 && !Intrinsics.areEqual(boolIsMediaViewBeingPortaled, Boolean.TRUE)) {
            releasePlayer();
        }
        boolean z16 = Intrinsics.areEqual(mediaPlaybackState, MediaPlayer.Event.BufferStart.INSTANCE) && (mediaSource == null || !mediaSource.getIsGifv());
        ProgressBar inlineMediaLoadingIndicator = this.binding.inlineMediaLoadingIndicator;
        boolean z17 = z16;
        Intrinsics.checkNotNullExpressionValue(inlineMediaLoadingIndicator, "inlineMediaLoadingIndicator");
        inlineMediaLoadingIndicator.setVisibility(z17 ? 0 : 8);
        if (!zAreEqual2) {
            GenericDraweeHierarchy genericDraweeHierarchy = (GenericDraweeHierarchy) this.binding.inlineMediaImagePreview.getHierarchy();
            genericDraweeHierarchy.l(mediaThumbnailFadeDuration);
            if (imagePreviewScaleType != null) {
                genericDraweeHierarchy.j(imagePreviewScaleType);
            }
            SimpleDraweeView inlineMediaImagePreview = this.binding.inlineMediaImagePreview;
            Intrinsics.checkNotNullExpressionValue(inlineMediaImagePreview, "inlineMediaImagePreview");
            Boolean boolValueOf = mediaSource != null ? Boolean.valueOf(mediaSource.getShouldAutoPlay()) : null;
            Boolean srcIsAnimated = mediaSource != null ? mediaSource.getSrcIsAnimated() : null;
            String previewUrl = mediaSource != null ? mediaSource.getPreviewUrl() : null;
            SimpleDraweeView inlineMediaImagePreview2 = this.binding.inlineMediaImagePreview;
            Intrinsics.checkNotNullExpressionValue(inlineMediaImagePreview2, "inlineMediaImagePreview");
            SetOptionalImageUrlKt.setOptionalImageUrl$default(inlineMediaImagePreview, previewUrl, boolValueOf, srcIsAnimated, GetMediaImagePlaceholderStatesListenerKt.getMediaImagePlaceholderStatesListener(inlineMediaImagePreview2, mediaSource != null ? mediaSource.getPlaceholder() : null, mediaSource != null ? mediaSource.getPlaceholderVersion() : null), null, null, 48, null);
        }
        SimpleDraweeView inlineMediaImagePreview3 = this.binding.inlineMediaImagePreview;
        Intrinsics.checkNotNullExpressionValue(inlineMediaImagePreview3, "inlineMediaImagePreview");
        MediaPlayer.Event.StartedPlaying startedPlaying = MediaPlayer.Event.StartedPlaying.INSTANCE;
        inlineMediaImagePreview3.setVisibility((Intrinsics.areEqual(mediaPlaybackState, startedPlaying) || Intrinsics.areEqual(mediaPlaybackState, MediaPlayer.Event.Paused.INSTANCE)) ? 8 : 0);
        SimpleDraweeView inlineMediaGifIndicator = this.binding.inlineMediaGifIndicator;
        Intrinsics.checkNotNullExpressionValue(inlineMediaGifIndicator, "inlineMediaGifIndicator");
        if (mediaSource != null) {
            z5 = true;
            int i11 = getShouldShowGifIndicator(mediaSource) ? 0 : 8;
            inlineMediaGifIndicator.setVisibility(i11);
            if (mediaSource != null || mediaSource.getIsValid() != z5 || z17 || Intrinsics.areEqual(mediaPlaybackState, startedPlaying)) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (mediaSource == null && mediaSource.getIsVideo() && ((z6 || mediaPlayThirdParty) && !mediaHidePlayButton)) {
                z7 = true;
            } else {
                z7 = false;
            }
            SimpleDraweeView inlineMediaPlayButton2 = this.binding.inlineMediaPlayButton;
            Intrinsics.checkNotNullExpressionValue(inlineMediaPlayButton2, "inlineMediaPlayButton");
            if (z7) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            inlineMediaPlayButton2.setVisibility(i7);
            SimpleDraweeView inlineMediaPlayButton3 = this.binding.inlineMediaPlayButton;
            Intrinsics.checkNotNullExpressionValue(inlineMediaPlayButton3, "inlineMediaPlayButton");
            if (this.mediaCanPlayInline || mediaPlayThirdParty || mediaSource == null) {
                bVar = null;
            } else {
                bVar = new com.discord.chat.presentation.list.delegate.b(2, this);
            }
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(inlineMediaPlayButton3, false, bVar, 1, null);
            SimpleDraweeView inlineMediaVolumeToggle = this.binding.inlineMediaVolumeToggle;
            Intrinsics.checkNotNullExpressionValue(inlineMediaVolumeToggle, "inlineMediaVolumeToggle");
            if (mediaSource == null && mediaSource.getIsVideo() && mediaSource.getIsValid() && mediaPlaybackState != null && mediaCanPlayInline) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            inlineMediaVolumeToggle.setVisibility(i10);
            SimpleDraweeView inlineMediaVolumeToggle2 = this.binding.inlineMediaVolumeToggle;
            Intrinsics.checkNotNullExpressionValue(inlineMediaVolumeToggle2, "inlineMediaVolumeToggle");
            if (mediaVolumeOn) {
                reactAsset = ReactAsset.VoiceNormalIcon;
            } else {
                reactAsset = ReactAsset.VoiceXIcon;
            }
            ReactAssetUtilsKt.setReactAsset(inlineMediaVolumeToggle2, reactAsset);
            SimpleDraweeView inlineMediaVolumeToggle3 = this.binding.inlineMediaVolumeToggle;
            Intrinsics.checkNotNullExpressionValue(inlineMediaVolumeToggle3, "inlineMediaVolumeToggle");
            ColorUtilsKt.setTintColor(inlineMediaVolumeToggle3, (Integer) (-1));
            SimpleDraweeView inlineMediaVolumeToggle4 = this.binding.inlineMediaVolumeToggle;
            Intrinsics.checkNotNullExpressionValue(inlineMediaVolumeToggle4, "inlineMediaVolumeToggle");
            if (mediaVolumeOn) {
                i18nMessage = I18nMessage.SOUND_MUTE;
            } else {
                i18nMessage = I18nMessage.SOUND_UNMUTE;
            }
            I18nUtilsKt.i18nContentDescription$default(inlineMediaVolumeToggle4, i18nMessage, (Function1) null, 2, (Object) null);
            SimpleDraweeView inlineMediaVolumeToggle5 = this.binding.inlineMediaVolumeToggle;
            Intrinsics.checkNotNullExpressionValue(inlineMediaVolumeToggle5, "inlineMediaVolumeToggle");
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(inlineMediaVolumeToggle5, false, new t(this, mediaVolumeOn, mediaSource), 1, null);
            inlineMediaPlayButton = this.binding.inlineMediaPlayButton;
            Intrinsics.checkNotNullExpressionValue(inlineMediaPlayButton, "inlineMediaPlayButton");
            if (inlineMediaPlayButton.getVisibility() == 0 || overlayTagText == null || overlayTagText.length() == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            setupTag(z10, overlayTagText, overlayTagIcon, overlayTagBackgroundColor, num);
            zAreEqual = Intrinsics.areEqual(mediaPlaybackState, MediaPlayer.Event.PlaybackEnded.INSTANCE);
            if (zAreEqual || !Intrinsics.areEqual(boolIsMediaViewBeingPortaled, Boolean.TRUE)) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!zAreEqual || (((mediaViewDetached || !mediaCanPlayInline) && !Intrinsics.areEqual(boolIsMediaViewBeingPortaled, Boolean.TRUE)) || !zAreEqual2)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11) {
                togglePortalControl(false);
            } else if (z12) {
                releasePlayer();
                setMediaData$default(this, null, false, false, false, null, false, null, null, false, false, false, 0, null, null, null, null, null, null, null, 524271, null);
                return;
            }
            mediaPlayerView = this.mediaPlayerView;
            if (mediaPlayerView != null) {
                if (mediaSource != null || Intrinsics.areEqual(boolIsMediaViewBeingPortaled, Boolean.FALSE)) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                mediaPlayerView.setVisible(z15);
            }
            if (mediaSource == null && mediaSource.getShouldAutoPlay() && !mediaViewDetached && !mediaViewScrolling) {
                if (mediaPlaybackState == null) {
                    Intrinsics.checkNotNull(mediaSource);
                    prepareMediaPlayer(mediaSource, true);
                    return;
                } else {
                    if (Intrinsics.areEqual(mediaPlaybackState, startedPlaying)) {
                        return;
                    }
                    play();
                    return;
                }
            }
            if (mediaViewDetached && mediaViewFocused && !Intrinsics.areEqual(boolIsMediaViewBeingPortaled, Boolean.FALSE)) {
                z13 = false;
            } else {
                z13 = true;
            }
            mediaPlayerView2 = this.mediaPlayerView;
            if (mediaPlayerView2 != null && (view = mediaPlayerView2.getView()) != null) {
                if (Intrinsics.areEqual(mediaPlaybackState, startedPlaying) || z13 || ((mediaSource == null || !mediaSource.getIsVideo()) && !Intrinsics.areEqual(boolIsMediaViewBeingPortaled, Boolean.TRUE))) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                view.setKeepScreenOn(z14);
            }
            if (z13 && this.mediaShouldResume) {
                final MediaPlayerView mediaPlayerView3 = this.mediaPlayerView;
                final MediaPlayer mediaPlayer = this.mediaPlayer;
                if (mediaPlayerView3 == null || mediaPlayer == null) {
                    play();
                } else {
                    mediaPlayerView3.getView().post(new Runnable() { // from class: com.discord.chat.presentation.message.view.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            MediaView.setMediaData$lambda$11(mediaViewDetached, mediaViewFocused, mediaSource, this, mediaPlayer, mediaPlayerView3);
                        }
                    });
                }
                this.mediaShouldResume = false;
                return;
            }
            if (z13) {
                pause();
                if (Intrinsics.areEqual(mediaPlaybackState, startedPlaying) || Intrinsics.areEqual(boolIsMediaViewBeingPortaled, Boolean.FALSE)) {
                }
                this.mediaShouldResume = true;
                return;
            }
            if (Intrinsics.areEqual(mediaPlaybackState, startedPlaying)) {
                play();
            } else if (Intrinsics.areEqual(mediaPlaybackState, MediaPlayer.Event.Paused.INSTANCE)) {
                pause();
            }
        }
        z5 = true;
        inlineMediaGifIndicator.setVisibility(i11);
        if (mediaSource != null) {
            z6 = false;
        } else {
            z6 = false;
        }
        if (mediaSource == null) {
            z7 = false;
        } else {
            z7 = false;
        }
        SimpleDraweeView inlineMediaPlayButton4 = this.binding.inlineMediaPlayButton;
        Intrinsics.checkNotNullExpressionValue(inlineMediaPlayButton4, "inlineMediaPlayButton");
        if (z7) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        inlineMediaPlayButton4.setVisibility(i7);
        SimpleDraweeView inlineMediaPlayButton5 = this.binding.inlineMediaPlayButton;
        Intrinsics.checkNotNullExpressionValue(inlineMediaPlayButton5, "inlineMediaPlayButton");
        if (this.mediaCanPlayInline) {
            bVar = null;
        } else {
            bVar = new com.discord.chat.presentation.list.delegate.b(2, this);
        }
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(inlineMediaPlayButton5, false, bVar, 1, null);
        SimpleDraweeView inlineMediaVolumeToggle6 = this.binding.inlineMediaVolumeToggle;
        Intrinsics.checkNotNullExpressionValue(inlineMediaVolumeToggle6, "inlineMediaVolumeToggle");
        if (mediaSource == null) {
            i10 = 8;
        } else {
            i10 = 8;
        }
        inlineMediaVolumeToggle6.setVisibility(i10);
        SimpleDraweeView inlineMediaVolumeToggle7 = this.binding.inlineMediaVolumeToggle;
        Intrinsics.checkNotNullExpressionValue(inlineMediaVolumeToggle7, "inlineMediaVolumeToggle");
        if (mediaVolumeOn) {
            reactAsset = ReactAsset.VoiceNormalIcon;
        } else {
            reactAsset = ReactAsset.VoiceXIcon;
        }
        ReactAssetUtilsKt.setReactAsset(inlineMediaVolumeToggle7, reactAsset);
        SimpleDraweeView inlineMediaVolumeToggle8 = this.binding.inlineMediaVolumeToggle;
        Intrinsics.checkNotNullExpressionValue(inlineMediaVolumeToggle8, "inlineMediaVolumeToggle");
        ColorUtilsKt.setTintColor(inlineMediaVolumeToggle8, (Integer) (-1));
        SimpleDraweeView inlineMediaVolumeToggle9 = this.binding.inlineMediaVolumeToggle;
        Intrinsics.checkNotNullExpressionValue(inlineMediaVolumeToggle9, "inlineMediaVolumeToggle");
        if (mediaVolumeOn) {
            i18nMessage = I18nMessage.SOUND_MUTE;
        } else {
            i18nMessage = I18nMessage.SOUND_UNMUTE;
        }
        I18nUtilsKt.i18nContentDescription$default(inlineMediaVolumeToggle9, i18nMessage, (Function1) null, 2, (Object) null);
        SimpleDraweeView inlineMediaVolumeToggle10 = this.binding.inlineMediaVolumeToggle;
        Intrinsics.checkNotNullExpressionValue(inlineMediaVolumeToggle10, "inlineMediaVolumeToggle");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(inlineMediaVolumeToggle10, false, new t(this, mediaVolumeOn, mediaSource), 1, null);
        inlineMediaPlayButton = this.binding.inlineMediaPlayButton;
        Intrinsics.checkNotNullExpressionValue(inlineMediaPlayButton, "inlineMediaPlayButton");
        if (inlineMediaPlayButton.getVisibility() == 0) {
            z10 = false;
        } else {
            z10 = false;
        }
        setupTag(z10, overlayTagText, overlayTagIcon, overlayTagBackgroundColor, num);
        zAreEqual = Intrinsics.areEqual(mediaPlaybackState, MediaPlayer.Event.PlaybackEnded.INSTANCE);
        if (zAreEqual) {
            z11 = false;
        } else {
            z11 = false;
        }
        if (zAreEqual) {
            z12 = true;
        } else {
            z12 = true;
        }
        if (z11) {
            togglePortalControl(false);
        } else if (z12) {
            releasePlayer();
            setMediaData$default(this, null, false, false, false, null, false, null, null, false, false, false, 0, null, null, null, null, null, null, null, 524271, null);
            return;
        }
        mediaPlayerView = this.mediaPlayerView;
        if (mediaPlayerView != null) {
            if (mediaSource != null) {
                z15 = false;
            } else {
                z15 = false;
            }
            mediaPlayerView.setVisible(z15);
        }
        if (mediaSource == null) {
        }
        if (mediaViewDetached) {
            z13 = true;
        } else {
            z13 = true;
        }
        mediaPlayerView2 = this.mediaPlayerView;
        if (mediaPlayerView2 != null) {
            if (Intrinsics.areEqual(mediaPlaybackState, startedPlaying)) {
                z14 = false;
            } else {
                z14 = false;
            }
            view.setKeepScreenOn(z14);
        }
        if (z13) {
        }
        if (z13) {
            pause();
            if (Intrinsics.areEqual(mediaPlaybackState, startedPlaying)) {
            }
        } else if (Intrinsics.areEqual(mediaPlaybackState, startedPlaying)) {
            play();
        } else if (Intrinsics.areEqual(mediaPlaybackState, MediaPlayer.Event.Paused.INSTANCE)) {
            pause();
        }
    }

    public final void setOnMediaClickListeners(View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, onClickListener != null ? new com.discord.chat.presentation.message.t(4, this, onClickListener) : null, 1, null);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(this, false, onLongClickListener, 1, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MediaView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.discord.chat.presentation.message.view.MediaView$lifecycleListener$1] */
    public MediaView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        MediaViewBinding mediaViewBindingInflate = MediaViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(mediaViewBindingInflate, "inflate(...)");
        this.binding = mediaViewBindingInflate;
        this.mediaViewFocused = true;
        this.mediaViewDetached = true;
        this.mediaCanPlayInline = true;
        this.mediaThumbnailFadeDuration = getResources().getInteger(com.discord.image.fresco.R.integer.image_fade_duration);
        this.mediaOnPlayCallback = new com.discord.chat.presentation.list.f(16);
        this.onMediaPlayFinishedAnalytics = new com.discord.chat.presentation.list.delegate.a(20);
        this.playerSettings = MediaPlayer.INSTANCE.getDefaultSettings();
        ThemedReactContext themedReactContext = (ThemedReactContext) (!(context instanceof ThemedReactContext) ? null : context);
        this.managerModule = themedReactContext != null ? (MediaPlayerManagerModule) themedReactContext.getNativeModule(MediaPlayerManagerModule.class) : null;
        ViewAttachedListener viewAttachedListener = new ViewAttachedListener(this, new r(this, 0), new r(this, 1));
        this.attachStateChangeListener = viewAttachedListener;
        this.lifecycleListener = new LifecycleEventListener() { // from class: com.discord.chat.presentation.message.view.MediaView$lifecycleListener$1
            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostDestroy() {
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostPause() {
                MediaView.setMediaData$default(this.this$0, null, false, false, false, null, false, null, null, false, false, false, 0, null, null, null, null, null, null, null, 524279, null);
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostResume() {
                MediaView.setMediaData$default(this.this$0, null, false, false, true, null, false, null, null, false, false, false, 0, null, null, null, null, null, null, null, 524279, null);
            }
        };
        addOnAttachStateChangeListener(viewAttachedListener);
        SimpleDraweeView simpleDraweeView = mediaViewBindingInflate.inlineMediaPlayButton;
        Intrinsics.checkNotNull(simpleDraweeView);
        ViewBackgroundUtilsKt.setBackgroundOval$default(simpleDraweeView, -16777216, 0, 2, null);
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.PlayIcon);
        ColorUtilsKt.setTintColor(simpleDraweeView, (Integer) (-1));
        I18nUtilsKt.i18nContentDescription$default(simpleDraweeView, I18nMessage.PLAY_FULL_VIDEO, (Function1) null, 2, (Object) null);
        SimpleDraweeView inlineMediaGifIndicator = mediaViewBindingInflate.inlineMediaGifIndicator;
        Intrinsics.checkNotNullExpressionValue(inlineMediaGifIndicator, "inlineMediaGifIndicator");
        ReactAssetUtilsKt.setReactAsset(inlineMediaGifIndicator, ReactAsset.GifIcon);
        SimpleDraweeView simpleDraweeView2 = mediaViewBindingInflate.inlineMediaImagePreview;
        ((GenericDraweeHierarchy) simpleDraweeView2.getHierarchy()).k(new ColorDrawable(ThemeManagerKt.getTheme().getBackgroundModNormal()), 1);
        ((GenericDraweeHierarchy) simpleDraweeView2.getHierarchy()).j(com.facebook.drawee.drawable.o.f4692f);
        GenericDraweeHierarchy genericDraweeHierarchy = (GenericDraweeHierarchy) simpleDraweeView2.getHierarchy();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(simpleDraweeView2.getResources().getDimensionPixelSize(com.discord.chat.R.dimen.message_media_view_stroke), ColorUtilsKt.getColorCompat(context, com.discord.chat.R.color.chat_media_view_stroke));
        genericDraweeHierarchy.n(gradientDrawable);
    }
}
