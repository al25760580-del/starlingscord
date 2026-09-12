package com.discord.emoji;

import android.view.MotionEvent;
import android.view.View;
import com.discord.emoji_picker.EmojiPickerCache;
import com.discord.emoji_picker.EmojiPickerRowView;
import com.discord.external_pip.ExternalPipManager;
import com.discord.fastest_list.android.FastestListLayoutManager;
import com.discord.fastest_list.android.view_holder.FastestListViewHolderView;
import com.discord.media.utils.ContentResolverMedia;
import com.discord.media.utils.Transcoder;
import com.discord.media_player.MediaPlayer;
import com.discord.media_player.reactevents.MediaPlayFinishedAnalytics;
import com.discord.mobile_voice_overlay.views.OverlayBubbleWrap;
import com.discord.mobile_voice_overlay.views.OverlayDialog;
import com.discord.mobile_voice_overlay.views.OverlayVoiceSelectorBubbleDialog;
import com.discord.notifications.client.NotificationCache;
import com.discord.notifications.client.NotificationClient;
import com.discord.notifications.renderer.utils.RenderNotificationMessageContentKt;
import com.discord.portals.from_native.PortalFromNativeContextManager;
import com.discord.primitives.ChannelId;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetModule;
import com.discord.recycler_view.utils.TransitionResilientGridLayoutManager;
import com.discord.recycler_view.utils.TransitionResilientLinearLayoutManager;
import com.discord.recycler_view.utils.TransitionResilientRecyclingDelegate;
import com.discord.tti_manager.TTIBroadcastReceiverKt;
import com.discord.user_search_worker.UserSearchWorker;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import kotlin.Result;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;
import kotlinx.serialization.json.JsonBuilder;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4348d;

    public /* synthetic */ a(int i7) {
        this.f4348d = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4348d) {
            case 0:
                return RenderableEmojiKt.renderEmojiInto$lambda$4((GenericDraweeHierarchyBuilder) obj);
            case 1:
                return UnicodeEmojis.emojiJsonParser$lambda$0((JsonBuilder) obj);
            case 2:
                return EmojiPickerCache.emojiJsonConfig$lambda$0((JsonBuilder) obj);
            case 3:
                return EmojiPickerRowView.onPressEmoji$lambda$0((String) obj);
            case 4:
                return EmojiPickerRowView.onLongPressEmoji$lambda$1((String) obj);
            case 5:
                return ExternalPipManager.enterPipMode$lambda$1((Result) obj);
            case 6:
                return FastestListLayoutManager._init_$lambda$0((Exception) obj);
            case 7:
                return FastestListViewHolderView.onViewTransitioning$lambda$0(((Boolean) obj).booleanValue());
            case 8:
                return ContentResolverMedia.QueryType.getSelection$lambda$2((String) obj);
            case 9:
                return ContentResolverMedia.QueryType.Companion.getUnsupportedImageMimeTypes$lambda$0((String) obj);
            case 10:
                return Transcoder.convertCompress$lambda$0(((Float) obj).floatValue());
            case 11:
                return MediaPlayer.eventListener$lambda$0((MediaPlayer.Event) obj);
            case 12:
                return MediaPlayer.volumeListener$lambda$1(((Float) obj).floatValue());
            case 13:
                return MediaPlayer.analyticsListener$lambda$2((MediaPlayFinishedAnalytics) obj);
            case 14:
                return OverlayBubbleWrap.touchDispatchSideEffectHandler$lambda$1((MotionEvent) obj);
            case 15:
                return OverlayDialog.onDialogClosed$lambda$0((OverlayDialog) obj);
            case 16:
                return OverlayVoiceSelectorBubbleDialog.onTextChanged$lambda$1((String) obj);
            case 17:
                return OverlayVoiceSelectorBubbleDialog.onChannelSelected$lambda$2((ChannelId) obj);
            case 18:
                return NotificationCache.json$lambda$19((JsonBuilder) obj);
            case 19:
                return NotificationClient.tokenListener$lambda$1((String) obj);
            case 20:
                return RenderNotificationMessageContentKt.renderNotificationMessageContent$lambda$0((MatchResult) obj);
            case 21:
                return RenderNotificationMessageContentKt.renderNotificationMessageContent$lambda$1((MatchResult) obj);
            case 22:
                return PortalFromNativeContextManager.addPortal$lambda$0((View) obj);
            case 23:
                return PortalFromNativeContextManager.addPortal$lambda$1((View) obj);
            case 24:
                return ReactAssetModule.keysRequest$lambda$0((ReactAsset) obj);
            case 25:
                return TransitionResilientGridLayoutManager._init_$lambda$0((Exception) obj);
            case 26:
                return TransitionResilientLinearLayoutManager._init_$lambda$0((Exception) obj);
            case 27:
                return TransitionResilientRecyclingDelegate._init_$lambda$0((Exception) obj);
            case 28:
                return TTIBroadcastReceiverKt.json$lambda$0((JsonBuilder) obj);
            default:
                return UserSearchWorker.json$lambda$0((JsonBuilder) obj);
        }
    }
}
