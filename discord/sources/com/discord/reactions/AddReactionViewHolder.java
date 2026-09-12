package com.discord.reactions;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discord/reactions/AddReactionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "addReactionView", "Lcom/discord/reactions/AddReactionView;", "<init>", "(Lcom/discord/reactions/AddReactionView;)V", "bind", "", "addNewReactionAccessibilityLabel", "", "onAddReactionClick", "Landroid/view/View$OnClickListener;", "reactionsTheme", "Lcom/discord/reactions/ReactionView$ReactionsTheme;", "showReactLabel", "", "reactions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AddReactionViewHolder extends RecyclerView.ViewHolder {

    @NotNull
    private final AddReactionView addReactionView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddReactionViewHolder(@NotNull AddReactionView addReactionView) {
        super(addReactionView);
        Intrinsics.checkNotNullParameter(addReactionView, "addReactionView");
        this.addReactionView = addReactionView;
    }

    public static /* synthetic */ void bind$default(AddReactionViewHolder addReactionViewHolder, String str, View.OnClickListener onClickListener, ReactionView.ReactionsTheme reactionsTheme, boolean z5, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        addReactionViewHolder.bind(str, onClickListener, reactionsTheme, z5);
    }

    public final void bind(@NotNull String addNewReactionAccessibilityLabel, @NotNull View.OnClickListener onAddReactionClick, ReactionView.ReactionsTheme reactionsTheme, boolean showReactLabel) {
        Intrinsics.checkNotNullParameter(addNewReactionAccessibilityLabel, "addNewReactionAccessibilityLabel");
        Intrinsics.checkNotNullParameter(onAddReactionClick, "onAddReactionClick");
        AddReactionView addReactionView = this.addReactionView;
        AddReactionView.configure$default(addReactionView, reactionsTheme, false, null, showReactLabel, 4, null);
        addReactionView.setContentDescription(addNewReactionAccessibilityLabel);
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(addReactionView, false, onAddReactionClick, 1, null);
    }
}
