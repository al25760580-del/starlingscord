package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.bridge.reaction.MessageReaction;
import com.discord.chat.bridge.reaction.ReactionsTheme;
import com.discord.chat.presentation.message.view.z;
import com.discord.reactions.ReactionView;
import com.discord.reactions.ShortcutsFlexbox;
import com.discord.theme.DiscordTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005Jt\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/ReactionsViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "reactionsView", "Lcom/discord/reactions/ShortcutsFlexbox;", "<init>", "(Lcom/discord/reactions/ShortcutsFlexbox;)V", "bind", "", "reactions", "", "Lcom/discord/chat/bridge/reaction/MessageReaction;", "canAddNewReactions", "", "addNewReactionAccessibilityLabel", "", "reactionsTheme", "Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "onAddReactionClick", "Landroid/view/View$OnClickListener;", "onReactionClick", "Lkotlin/Function1;", "Lcom/discord/reactions/ReactionView$Reaction;", "onReactionLongPress", "theme", "Lcom/discord/theme/DiscordTheme;", "showReactLabel", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactionsViewHolder extends MessagePartViewHolder {

    @NotNull
    private final ShortcutsFlexbox reactionsView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionsViewHolder(@NotNull ShortcutsFlexbox reactionsView) {
        super(reactionsView, null);
        Intrinsics.checkNotNullParameter(reactionsView, "reactionsView");
        this.reactionsView = reactionsView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(Function1 function1, ReactionView.Reaction reaction) {
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        function1.invoke(reaction);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$1(Function1 function1, ReactionView.Reaction reaction) {
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        function1.invoke(reaction);
        return Unit.f14616a;
    }

    public final void bind(@NotNull List<MessageReaction> reactions, boolean canAddNewReactions, @NotNull String addNewReactionAccessibilityLabel, ReactionsTheme reactionsTheme, @NotNull View.OnClickListener onAddReactionClick, @NotNull Function1<? super ReactionView.Reaction, Unit> onReactionClick, @NotNull Function1<? super ReactionView.Reaction, Unit> onReactionLongPress, DiscordTheme theme, boolean showReactLabel) {
        Intrinsics.checkNotNullParameter(reactions, "reactions");
        Intrinsics.checkNotNullParameter(addNewReactionAccessibilityLabel, "addNewReactionAccessibilityLabel");
        Intrinsics.checkNotNullParameter(onAddReactionClick, "onAddReactionClick");
        Intrinsics.checkNotNullParameter(onReactionClick, "onReactionClick");
        Intrinsics.checkNotNullParameter(onReactionLongPress, "onReactionLongPress");
        this.reactionsView.setReactions(reactions, canAddNewReactions, addNewReactionAccessibilityLabel, reactionsTheme, onAddReactionClick, new z(onReactionClick, 1), new z(onReactionLongPress, 2), theme, showReactLabel);
    }
}
