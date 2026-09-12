package com.discord.reactions;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t7.a;
import t7.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J@\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/reactions/ReactionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "reactionView", "Lcom/discord/reactions/ReactionView;", "<init>", "(Lcom/discord/reactions/ReactionView;)V", "bind", "", "reaction", "Lcom/discord/reactions/ReactionView$Reaction;", "onReactionClick", "Lkotlin/Function1;", "onReactionLongPress", "reactionsTheme", "Lcom/discord/reactions/ReactionView$ReactionsTheme;", "reactions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactionViewHolder extends RecyclerView.ViewHolder {

    @NotNull
    private final ReactionView reactionView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionViewHolder(@NotNull ReactionView reactionView) {
        super(reactionView);
        Intrinsics.checkNotNullParameter(reactionView, "reactionView");
        this.reactionView = reactionView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bind$lambda$2$lambda$1(Function1 function1, ReactionView.Reaction reaction, View view) {
        function1.invoke(reaction);
        return true;
    }

    public final void bind(@NotNull ReactionView.Reaction reaction, @NotNull Function1<? super ReactionView.Reaction, Unit> onReactionClick, @NotNull Function1<? super ReactionView.Reaction, Unit> onReactionLongPress, ReactionView.ReactionsTheme reactionsTheme) {
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Intrinsics.checkNotNullParameter(onReactionClick, "onReactionClick");
        Intrinsics.checkNotNullParameter(onReactionLongPress, "onReactionLongPress");
        ReactionView reactionView = this.reactionView;
        reactionView.setReaction(reaction, reactionsTheme);
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(reactionView, false, new a(onReactionClick, reaction, 0), 1, null);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(reactionView, false, new b(onReactionLongPress, reaction, 0), 1, null);
    }
}
