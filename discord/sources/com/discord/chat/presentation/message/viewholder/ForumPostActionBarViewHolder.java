package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.forums.ForumPostActions;
import com.discord.chat.bridge.reaction.ReactionsTheme;
import com.discord.chat.presentation.message.messagepart.ForumPostActionBar;
import com.discord.chat.presentation.message.view.ForumPostActionBarView;
import com.discord.primitives.MessageId;
import com.discord.reactions.ReactionView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0089\u0001\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0014\u001a\u00020\n2\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110\u0015¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/ForumPostActionBarViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;", "forumPostActionBarView", "<init>", "(Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;)V", "Lcom/discord/chat/presentation/message/messagepart/ForumPostActionBar;", "forumPostActionBar", "Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "reactionsTheme", "Landroid/view/View$OnClickListener;", "onTapFollowForumPost", "onTapShareForumPost", "onAddReactionClick", "onTapReactionOverflow", "Lkotlin/Function1;", "Lcom/discord/reactions/ReactionView$Reaction;", "", "onReactionClick", "onReactionLongPress", "onTapDismissMediaPostSharePrompt", "Lkotlin/Function2;", "Lcom/discord/primitives/MessageId;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "onLinkClicked", "bind", "(Lcom/discord/chat/presentation/message/messagepart/ForumPostActionBar;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function2;)V", "Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ForumPostActionBarViewHolder extends MessagePartViewHolder {

    @NotNull
    private final ForumPostActionBarView forumPostActionBarView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForumPostActionBarViewHolder(@NotNull ForumPostActionBarView forumPostActionBarView) {
        super(forumPostActionBarView, null);
        Intrinsics.checkNotNullParameter(forumPostActionBarView, "forumPostActionBarView");
        this.forumPostActionBarView = forumPostActionBarView;
    }

    public final void bind(@NotNull ForumPostActionBar forumPostActionBar, ReactionsTheme reactionsTheme, @NotNull View.OnClickListener onTapFollowForumPost, @NotNull View.OnClickListener onTapShareForumPost, @NotNull View.OnClickListener onAddReactionClick, @NotNull View.OnClickListener onTapReactionOverflow, @NotNull Function1<? super ReactionView.Reaction, Unit> onReactionClick, @NotNull Function1<? super ReactionView.Reaction, Unit> onReactionLongPress, @NotNull View.OnClickListener onTapDismissMediaPostSharePrompt, @NotNull Function2<? super MessageId, ? super LinkContentNode, Unit> onLinkClicked) {
        Intrinsics.checkNotNullParameter(forumPostActionBar, "forumPostActionBar");
        Intrinsics.checkNotNullParameter(onTapFollowForumPost, "onTapFollowForumPost");
        Intrinsics.checkNotNullParameter(onTapShareForumPost, "onTapShareForumPost");
        Intrinsics.checkNotNullParameter(onAddReactionClick, "onAddReactionClick");
        Intrinsics.checkNotNullParameter(onTapReactionOverflow, "onTapReactionOverflow");
        Intrinsics.checkNotNullParameter(onReactionClick, "onReactionClick");
        Intrinsics.checkNotNullParameter(onReactionLongPress, "onReactionLongPress");
        Intrinsics.checkNotNullParameter(onTapDismissMediaPostSharePrompt, "onTapDismissMediaPostSharePrompt");
        Intrinsics.checkNotNullParameter(onLinkClicked, "onLinkClicked");
        ForumPostActions postActions = forumPostActionBar.getPostActions();
        this.forumPostActionBarView.m742configureCgeVRR0(forumPostActionBar.getMessageId(), postActions.getNumDisplayedReactions(), postActions.isFollowing(), postActions.getFollowIcon(), postActions.getFollowLabel(), postActions.getShareIcon(), postActions.getShareLabel(), forumPostActionBar.getReactions(), postActions.getDefaultReaction(), forumPostActionBar.getCanAddNewReactions(), forumPostActionBar.getAddNewReactionAccessibilityLabel(), reactionsTheme, onAddReactionClick, onReactionClick, onReactionLongPress, onTapFollowForumPost, onTapShareForumPost, onTapReactionOverflow, postActions.getSharePrompt(), onTapDismissMediaPostSharePrompt, onLinkClicked);
    }
}
