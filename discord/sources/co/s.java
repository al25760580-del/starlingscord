package co;

import android.content.Context;
import com.discord.browser_manager.BrowserManager;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.input.views.ChatInputRootView;
import com.discord.chat.input.views.ChatInputRootViewMeasurer;
import com.discord.chat.presentation.list.ChatListView;
import com.discord.chat.presentation.list.ScrollState;
import com.discord.chat.presentation.message.MessageAccessoriesAdapter;
import com.discord.chat.presentation.message.messagepart.MessageContentAccessory;
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView;
import com.discord.chat.presentation.message.viewholder.MessageContentViewHolder;
import com.discord.crash_reporting.system_logs.SystemLogCapture;
import com.discord.crash_reporting.system_logs.SystemLogUtils;
import com.discord.emoji_picker.EmojiPickerView;
import com.discord.external_pip.ExternalPipModule;
import com.discord.fastest_list.android.view_holder.FastestListViewHolder;
import com.discord.image.animated_image.apng.APNGImageView;
import com.discord.media.engine.video.egl_renderer.EglRenderer;
import com.discord.mobile_voice_overlay.MobileVoiceOverlay;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayAssets;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayModule;
import com.discord.mobile_voice_overlay.utils.OverlayViewProvider;
import com.discord.mobile_voice_overlay.views.OverlayDialog;
import com.discord.mobile_voice_overlay.views.OverlayView;
import com.discord.mobile_voice_overlay.views.OverlayVoiceSelectorBubbleDialog;
import com.discord.notifications.api.Sticker;
import com.discord.notifications.renderer.utils.NotificationDataUtilsKt;
import com.discord.permissions.NativePermissionManagerModule;
import com.discord.primitives.ChannelId;
import com.discord.react_strings.RenderContext;
import com.discord.socialrpc.SocialRpcSessionManager;
import com.discord.zoom_layout.ZoomLayoutFixed;
import com.discord.zoom_layout.ZoomLayoutViewManager;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArrayBuilder;
import com.facebook.react.devsupport.inspector.FrameTimingSequence;
import com.facebook.react.fabric.mounting.MountItemDispatcher;
import com.facebook.react.fabric.mounting.mountitems.DispatchCommandMountItem;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.ReactHostInspectorTarget;
import com.swmansion.rnscreens.v0;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3781e;

    public /* synthetic */ s(int i7, Object obj) {
        this.f3780d = i7;
        this.f3781e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3780d) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f3781e;
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                arrayList.add(it);
                return Unit.f14616a;
            case 1:
                return Boolean.valueOf(BrowserManager.openUrlExternally$lambda$2((Context) this.f3781e, (String) obj));
            case 2:
                return ChatInputRootView.lineHeightMeasurer$lambda$0((ChatInputRootView) this.f3781e, ((Integer) obj).intValue());
            case 3:
                return ChatInputRootViewMeasurer.measureHeight$lambda$0((ChatInputRootViewMeasurer) this.f3781e, (ChatInputRootView) obj);
            case 4:
                return ChatListView.scrollStateObserver$lambda$4((ChatListView) this.f3781e, (ScrollState) obj);
            case 5:
                return MessageAccessoriesAdapter.onBindViewHolder$lambda$15$lambda$14((com.discord.chat.presentation.message.h) this.f3781e, ((Integer) obj).intValue());
            case 6:
                return AudioPlayerView.setAudioFileDetails$lambda$9((Attachment) this.f3781e, (RenderContext) obj);
            case 7:
                return MessageContentViewHolder.bind$lambda$2((MessageContentAccessory) this.f3781e, (LinkContentNode) obj);
            case 8:
                return SystemLogCapture.readFromLogcat$lambda$2$lambda$1((SystemLogCapture) this.f3781e, (String) obj);
            case 9:
                return SystemLogUtils.fetchLastTombstone$lambda$2((Regex) this.f3781e, (MatchResult) obj);
            case 10:
                return Integer.valueOf(EmojiPickerView._init_$lambda$6((EmojiPickerView) this.f3781e, ((Integer) obj).intValue()));
            case 11:
                return ExternalPipModule.Companion.onUserLeaveHint$lambda$0((ReactContext) this.f3781e, (Result) obj);
            case 12:
                return FastestListViewHolder._init_$lambda$0((FastestListViewHolder) this.f3781e, ((Boolean) obj).booleanValue());
            case 13:
                return APNGImageView.inflateApngView$lambda$0((APNGImageView) this.f3781e, (String) obj);
            case 14:
                return EglRenderer.init$lambda$10$lambda$6((EglRenderer) this.f3781e, (Exception) obj);
            case 15:
                return MobileVoiceOverlay.selectorDialogProvider$lambda$19$lambda$18$lambda$15((OverlayViewProvider) this.f3781e, (OverlayDialog) obj);
            case 16:
                return MobileVoiceOverlay.selectorDialogProvider$lambda$19$lambda$18$lambda$17((OverlayVoiceSelectorBubbleDialog) this.f3781e, (ChannelId) obj);
            case 17:
                return MobileVoiceOverlayModule.mobileVoiceOverlay_delegate$lambda$2$lambda$1((MobileVoiceOverlayModule) this.f3781e, (String) obj);
            case 18:
                return NotificationDataUtilsKt.renderMessageContent$lambda$6((Sticker) this.f3781e, (RenderContext) obj);
            case 19:
                return NativePermissionManagerModule.AnonymousClass1.reject$lambda$6((Throwable) this.f3781e, (Promise) obj);
            case 20:
                return NativePermissionManagerModule.AnonymousClass1.resolve$lambda$2(this.f3781e, (Promise) obj);
            case 21:
                return SocialRpcSessionManager.sendReady$lambda$16$lambda$15((JsonObject) this.f3781e, (JsonObjectBuilder) obj);
            case 22:
                return ZoomLayoutViewManager.createViewInstance$lambda$0((ZoomLayoutViewManager) this.f3781e, (ZoomLayoutFixed) obj);
            case 23:
                return NativeAnimatedModule.userDrivenScrollEnded$lambda$2$lambda$1((Set) this.f3781e, (ReadableArrayBuilder) obj);
            case 24:
                return MountItemDispatcher.dispatchMountItems$lambda$1((MountItemDispatcher) this.f3781e, (DispatchCommandMountItem) obj);
            case 25:
                return ReactHostImpl.createReactHostInspectorTarget$lambda$69$lambda$68((ReactHostInspectorTarget) this.f3781e, (FrameTimingSequence) obj);
            case 26:
                return v0.c((v0) this.f3781e, (com.swmansion.rnscreens.c) obj);
            case 27:
                return OverlayViewProvider.setData$lambda$2((MobileVoiceOverlayData) this.f3781e, (OverlayView) obj);
            case 28:
                return OverlayViewProvider.setAssets$lambda$1((MobileVoiceOverlayAssets) this.f3781e, (OverlayView) obj);
            default:
                ((jr.b) this.f3781e).b(null);
                return Unit.f14616a;
        }
    }

    public /* synthetic */ s(jr.b bVar, jr.a aVar) {
        this.f3780d = 29;
        this.f3781e = bVar;
    }
}
