package b7;

import a1.k;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import br.d;
import com.discord.avatar.react.APNGPreloadModule;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.input.views.ChatInputLeadingIconRenderer;
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate;
import com.discord.chat.presentation.list.delegate.BlockedGroupDelegate;
import com.discord.chat.presentation.list.delegate.DeserializationErrorMessageDelegate;
import com.discord.chat.presentation.list.item.BlockedGroupChatListItem;
import com.discord.chat.presentation.list.item.DeserializationErrorMessageItem;
import com.discord.chat.presentation.message.MessageAccessoriesAdapter;
import com.discord.chat.presentation.message.MessageViewReplyPreview;
import com.discord.chat.presentation.message.messagepart.EmbedMessageAccessory;
import com.discord.chat.presentation.message.messagepart.EphemeralIndicationMessageAccessory;
import com.discord.chat.presentation.message.messagepart.GiftMessageAccessory;
import com.discord.chat.presentation.message.messagepart.GuildInviteDisabledMessageAccessory;
import com.discord.chat.presentation.message.messagepart.MediaMosaicAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageComponentsAccessory;
import com.discord.chat.presentation.message.messagepart.MessageContentAccessory;
import com.discord.chat.presentation.message.messagepart.PollMessageAccessory;
import com.discord.chat.presentation.message.messagepart.PostPreviewEmbedMessageAccessory;
import com.discord.chat.presentation.message.messagepart.PremiumGroupInviteMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ReferralMessageAccessory;
import com.discord.chat.presentation.message.view.MediaView;
import com.discord.chat.presentation.message.view.PremiumGroupInviteView;
import com.discord.chat.presentation.message.view.ReferralView;
import com.discord.chat.presentation.message.view.polls.BasePollWithRecyclerView;
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager;
import com.discord.chat.presentation.message.viewholder.EphemeralIndicationViewHolder;
import com.discord.chat.presentation.message.viewholder.GuildInviteDisabledViewHolder;
import com.discord.chat.presentation.message.viewholder.MessageContentViewHolder;
import com.discord.crash_reporting.system_logs.SystemLogReport;
import com.discord.crash_reporting.system_logs.SystemLogUtils;
import com.discord.foreground_service.ForegroundServiceManager;
import com.discord.foreground_service.service.ServiceNotificationConfiguration;
import com.discord.lifecycle.ForegroundServiceStartGuard;
import com.discord.media.utils.MediaResolver;
import com.discord.media_player.MediaPlayer;
import com.discord.media_player.MediaSource;
import com.discord.metric_monitor.MetricEvent;
import com.discord.metric_monitor.MetricMonitorModule;
import com.discord.mobile_voice_overlay.MobileVoiceOverlay;
import com.discord.mobile_voice_overlay.views.OverlayMenuBubbleDialog;
import com.discord.mobile_voice_overlay.views.OverlayVoiceBubble;
import com.discord.notifications.api.Embed;
import com.discord.notifications.api.NotificationData;
import com.discord.notifications.renderer.utils.NotificationDataUtilsKt;
import com.discord.permissions.NativePermissionManagerModule;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchListener;
import com.discord.react_strings.RenderContext;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3074e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3075i;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f3073d = i7;
        this.f3074e = obj;
        this.f3075i = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3073d) {
            case 0:
                return MetricMonitorModule._init_$lambda$0((MetricMonitorModule) this.f3074e, (ReactApplicationContext) this.f3075i, (MetricEvent) obj);
            case 1:
                d dVar = (d) this.f3074e;
                dVar.f3386i.removeCallbacks((k) this.f3075i);
                return Unit.f14616a;
            case 2:
                return APNGPreloadModule.getOrStartDownload$lambda$0((APNGPreloadModule) this.f3074e, (String) this.f3075i, (String) obj);
            case 3:
                return ChatInputLeadingIconRenderer.applyLeadingIcon$lambda$2((ChatInputLeadingIconRenderer) this.f3074e, (String) this.f3075i, (Bitmap) obj);
            case 4:
                return BlockedGroupDelegate.bindView$lambda$2((BlockedGroupDelegate) this.f3074e, (BlockedGroupChatListItem) this.f3075i, (View) obj);
            case 5:
                return DeserializationErrorMessageDelegate.bindView$lambda$1((BaseChatListItemDelegate.Metadata) this.f3074e, (DeserializationErrorMessageItem) this.f3075i, ((Boolean) obj).booleanValue());
            case 6:
                return MessageAccessoriesAdapter.onBindViewHolder$lambda$6((MessageAccessoriesAdapter) this.f3074e, (EmbedMessageAccessory) this.f3075i, ((Boolean) obj).booleanValue());
            case 7:
                return MessageAccessoriesAdapter.onBindViewHolder$lambda$37((MessageAccessoriesAdapter) this.f3074e, (MessageComponentsAccessory) this.f3075i, ((Boolean) obj).booleanValue());
            case 8:
                return MessageAccessoriesAdapter.onBindViewHolder$lambda$41((MessageAccessoriesAdapter) this.f3074e, (PostPreviewEmbedMessageAccessory) this.f3075i, ((Boolean) obj).booleanValue());
            case 9:
                return MessageAccessoriesAdapter.onBindViewHolder$lambda$12((MessageAccessoriesAdapter) this.f3074e, (GiftMessageAccessory) this.f3075i, (String) obj);
            case 10:
                return MessageAccessoriesAdapter.onBindViewHolder$lambda$17((MessageAccessoriesAdapter) this.f3074e, (MediaMosaicAttachmentMessageAccessory) this.f3075i, ((Boolean) obj).booleanValue());
            case 11:
                return MessageViewReplyPreview.configureReply$lambda$10((MessageViewReplyPreview) this.f3074e, (String) this.f3075i, ((Integer) obj).intValue());
            case 12:
                return MediaView.registerForPortal$lambda$26((MediaSource) this.f3074e, (MediaView) this.f3075i, (View) obj);
            case 13:
                return PremiumGroupInviteView.bind$lambda$4$lambda$3((Function2) this.f3074e, (PremiumGroupInviteMessageAccessory) this.f3075i, (LinkContentNode) obj);
            case 14:
                return ReferralView.bind$lambda$13$lambda$11((Function2) this.f3074e, (ReferralMessageAccessory) this.f3075i, (LinkContentNode) obj);
            case 15:
                return BasePollWithRecyclerView.bind$lambda$3((Function3) this.f3074e, (PollMessageAccessory) this.f3075i, (String) obj);
            case 16:
                return AudioPlayerManager.setupPlayer$lambda$2$lambda$1((AudioPlayerManager.AudioSource) this.f3074e, (Function1) this.f3075i, (MediaPlayer.Event) obj);
            case 17:
                return EphemeralIndicationViewHolder.bind$lambda$1$lambda$0((EphemeralIndicationViewHolder) this.f3074e, (EphemeralIndicationMessageAccessory) this.f3075i, (String) obj);
            case 18:
                return GuildInviteDisabledViewHolder.bind$lambda$1$lambda$0((GuildInviteDisabledViewHolder) this.f3074e, (GuildInviteDisabledMessageAccessory) this.f3075i, (String) obj);
            case 19:
                return MessageContentViewHolder.bind$lambda$0((Function2) this.f3074e, (MessageContentAccessory) this.f3075i, (LinkContentNode) obj);
            case 20:
                return SystemLogReport.fetchNativeCrashDiagnostics$lambda$2((Function1) this.f3074e, (Context) this.f3075i, (SystemLogUtils.Tombstone) obj);
            case 21:
                return ForegroundServiceManager.handleCreateOrUpdateService$lambda$6$lambda$5((ServiceNotificationConfiguration.Type) this.f3074e, (ForegroundServiceStartGuard.Result) this.f3075i, (Exception) obj);
            case 22:
                return MediaResolver.handleVideo$lambda$4$lambda$3((MediaResolver) this.f3074e, (Uri) this.f3075i, ((Float) obj).floatValue());
            case 23:
                return MobileVoiceOverlay.voiceBubbleProvider$lambda$9$lambda$4$lambda$3((OverlayVoiceBubble) this.f3074e, (Rect) this.f3075i, (OverlayMenuBubbleDialog) obj);
            case 24:
                return NotificationDataUtilsKt.renderMessageContent$lambda$12((Embed) this.f3074e, (NotificationData) this.f3075i, (RenderContext) obj);
            case 25:
                return NativePermissionManagerModule.AnonymousClass1.reject$lambda$7((Throwable) this.f3074e, (WritableMap) this.f3075i, (Promise) obj);
            case 26:
                return NativePermissionManagerModule.AnonymousClass1.reject$lambda$3((String) this.f3074e, (String) this.f3075i, (Promise) obj);
            case 27:
                return NativePermissionManagerModule.AnonymousClass1.reject$lambda$4((String) this.f3074e, (Throwable) this.f3075i, (Promise) obj);
            case 28:
                return NativePermissionManagerModule.AnonymousClass1.reject$lambda$8((String) this.f3074e, (WritableMap) this.f3075i, (Promise) obj);
            default:
                return NestedScrollOnTouchListener.onSupplementalMotionEventReceived$lambda$2((NestedScrollOnTouchListener) this.f3074e, (View) this.f3075i, (MotionEvent) obj);
        }
    }
}
