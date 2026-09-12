package com.discord.chat.presentation.list.delegate;

import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.GameMentionContentNode;
import com.discord.chat.bridge.contentnode.InlineCodeContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.contentnode.SoundmojiContentNode;
import com.discord.chat.presentation.blockedmessage.BlockedMessageGroupView;
import com.discord.chat.presentation.message.view.ActivityRichPresenceInviteEmbedView;
import com.discord.chat.presentation.message.view.FlaggedMessageEmbedView;
import com.discord.chat.presentation.message.view.ForumPostActionBarView;
import com.discord.chat.presentation.message.view.MediaView;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.discord.chat.presentation.message.view.polls.PollAnswerAdapter;
import com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentVideoViewHolder;
import com.discord.crash_reporting.CrashReporting;
import com.discord.crash_reporting.system_logs.SystemLogUtils;
import com.discord.emoji.RenderableEmojiKt;
import com.discord.media_player.reactevents.MediaPlayFinishedAnalytics;
import com.discord.reactions.ReactionView;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import io.sentry.protocol.SentryStackFrame;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4090d;

    public /* synthetic */ a(int i7) {
        this.f4090d = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4090d) {
            case 0:
                return BlockedGroupDelegate._init_$lambda$0((BlockedMessageGroupView) obj);
            case 1:
                return ActivityRichPresenceInviteEmbedView.setActivityRichPresenceInviteEmbed_Uv5W4H4$lambda$12((CommandMentionContentNode) obj);
            case 2:
                return ActivityRichPresenceInviteEmbedView.setActivityRichPresenceInviteEmbed_Uv5W4H4$lambda$13((CommandMentionContentNode) obj);
            case 3:
                return ActivityRichPresenceInviteEmbedView.setActivityRichPresenceInviteEmbed_Uv5W4H4$lambda$15((String) obj);
            case 4:
                return ActivityRichPresenceInviteEmbedView.setActivityRichPresenceInviteEmbed_Uv5W4H4$lambda$6((LinkContentNode) obj);
            case 5:
                return ActivityRichPresenceInviteEmbedView.setActivityRichPresenceInviteEmbed_Uv5W4H4$lambda$16((InlineCodeContentNode) obj);
            case 6:
                return ActivityRichPresenceInviteEmbedView.setActivityRichPresenceInviteEmbed_Uv5W4H4$lambda$17((EmojiContentNode) obj);
            case 7:
                return ActivityRichPresenceInviteEmbedView.setActivityRichPresenceInviteEmbed_Uv5W4H4$lambda$18((SoundmojiContentNode) obj);
            case 8:
                return ActivityRichPresenceInviteEmbedView.setActivityRichPresenceInviteEmbed_Uv5W4H4$lambda$9((String) obj);
            case 9:
                return FlaggedMessageEmbedView.configureMessageContent$lambda$18$lambda$7((String) obj);
            case 10:
                return FlaggedMessageEmbedView.configureMessageContent$lambda$18$lambda$10((CommandMentionContentNode) obj);
            case 11:
                return FlaggedMessageEmbedView.configureMessageContent$lambda$18$lambda$11((CommandMentionContentNode) obj);
            case 12:
                return FlaggedMessageEmbedView.configureMessageContent$lambda$18$lambda$3((LinkContentNode) obj);
            case 13:
                return FlaggedMessageEmbedView.configureMessageContent$lambda$18$lambda$13((String) obj);
            case 14:
                return FlaggedMessageEmbedView.configureMessageContent$lambda$18$lambda$14((InlineCodeContentNode) obj);
            case 15:
                return FlaggedMessageEmbedView.configureMessageContent$lambda$18$lambda$15((EmojiContentNode) obj);
            case 16:
                return FlaggedMessageEmbedView.configureMessageContent$lambda$18$lambda$16((SoundmojiContentNode) obj);
            case 17:
                return FlaggedMessageEmbedView.configureMessageContent$lambda$18$lambda$17((LinkContentNode) obj);
            case 18:
                return FlaggedMessageEmbedView.configureMessageContent$lambda$18$lambda$4((LinkContentNode) obj);
            case 19:
                return ForumPostActionBarView.setReactions$lambda$12((ReactionView.Reaction) obj);
            case 20:
                return MediaView.onMediaPlayFinishedAnalytics$lambda$1((MediaPlayFinishedAnalytics) obj);
            case 21:
                return MessageContentView.setMessageContent_hYrISQc$lambda$2((GameMentionContentNode) obj);
            case 22:
                return MessageContentView.setMessageContent_hYrISQc$lambda$3((LinkContentNode) obj);
            case 23:
                return MessageContentView.setMessageContent$lambda$1((LinkContentNode) obj);
            case 24:
                return PollAnswerAdapter.onTapAnswer$lambda$0((String) obj);
            case 25:
                return MosaicItemMessageAttachmentVideoViewHolder.bindGalleryItem$lambda$0((MediaPlayFinishedAnalytics) obj);
            case 26:
                return CrashReporting.getErrorStack$lambda$10((SentryStackFrame) obj);
            case 27:
                return SystemLogUtils.hashString$lambda$7(((Byte) obj).byteValue());
            case 28:
                return RenderableEmojiKt.renderEmoji$lambda$2((GenericDraweeHierarchyBuilder) obj);
            default:
                return RenderableEmojiKt.renderEmojiInto$lambda$0((GenericDraweeHierarchyBuilder) obj);
        }
    }
}
