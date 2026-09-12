package com.discord.reactions;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.u;
import com.discord.misc.utilities.ids.IdUtilsKt;
import com.discord.recycler_view.utils.ItemDiffer;
import com.discord.theme.DiscordTheme;
import com.discord.theme.ThemeManager;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ne.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0004H\u0016J\u0018\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0004H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010 \u001a\u00020\u0004H\u0016J\b\u0010%\u001a\u00020\u0004H\u0002J\u0088\u0001\u0010&\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010'\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u0011X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/discord/reactions/ReactionsViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "reactionHeight", "", "<init>", "(I)V", "reactions", "", "Lcom/discord/reactions/ReactionView$Reaction;", "reactionsTheme", "Lcom/discord/reactions/ReactionView$ReactionsTheme;", "messageId", "", "onAddReactionClick", "Landroid/view/View$OnClickListener;", "onReactionClick", "Lkotlin/Function1;", "", "onReactionLongPress", "addNewReactionAccessibilityLabel", "theme", "Lcom/discord/theme/DiscordTheme;", "canAddNewReactions", "", "showReactLabel", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", ViewProps.POSITION, "getItemCount", "getItemViewType", "getItemId", "", "getAddReactionIndex", "setReactions", "areChatAnimationsEnabled", "reactions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactionsViewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactionsViewAdapter.kt\ncom/discord/reactions/ReactionsViewAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
public final class ReactionsViewAdapter extends RecyclerView.Adapter {
    private String addNewReactionAccessibilityLabel;
    private boolean canAddNewReactions;
    private String messageId;
    private View.OnClickListener onAddReactionClick;
    private Function1<? super ReactionView.Reaction, Unit> onReactionClick;
    private Function1<? super ReactionView.Reaction, Unit> onReactionLongPress;
    private final int reactionHeight;

    @NotNull
    private List<? extends ReactionView.Reaction> reactions = n0.f14659d;
    private ReactionView.ReactionsTheme reactionsTheme;
    private boolean showReactLabel;
    private DiscordTheme theme;

    public ReactionsViewAdapter(int i7) {
        this.reactionHeight = i7;
        setHasStableIds(true);
    }

    private final int getAddReactionIndex() {
        return this.reactions.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int size = this.reactions.size();
        return this.canAddNewReactions ? size + 1 : size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        String str = null;
        if (position == getAddReactionIndex()) {
            String str2 = this.messageId;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("messageId");
            } else {
                str = str2;
            }
            return IdUtilsKt.convertToId(str + "_add_reactions");
        }
        ReactionView.Reaction reaction = this.reactions.get(position);
        String str3 = this.messageId;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageId");
        } else {
            str = str3;
        }
        return IdUtilsKt.convertToId(str + "_" + reaction.getEmoji().getEmojiId() + reaction.isBurstReaction());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (position == getAddReactionIndex()) {
            return 47;
        }
        return this.reactions.get(position).isBurstReaction() ? 45 : 46;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ThemeManager themeManager = ThemeManager.INSTANCE;
        DiscordTheme themeOverride = themeManager.getThemeOverride();
        themeManager.setThemeOverride(this.theme);
        View.OnClickListener onClickListener = null;
        Function1<? super ReactionView.Reaction, Unit> function1 = null;
        if (holder instanceof ReactionViewHolder) {
            ReactionView.Reaction reaction = this.reactions.get(position);
            ReactionViewHolder reactionViewHolder = (ReactionViewHolder) holder;
            Function1<? super ReactionView.Reaction, Unit> function2 = this.onReactionClick;
            if (function2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onReactionClick");
                function2 = null;
            }
            Function1<? super ReactionView.Reaction, Unit> function3 = this.onReactionLongPress;
            if (function3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onReactionLongPress");
            } else {
                function1 = function3;
            }
            reactionViewHolder.bind(reaction, function2, function1, this.reactionsTheme);
        } else {
            if (!(holder instanceof AddReactionViewHolder)) {
                throw new IllegalStateException(("Invalid view holder type " + holder.getClass()).toString());
            }
            AddReactionViewHolder addReactionViewHolder = (AddReactionViewHolder) holder;
            String str = this.addNewReactionAccessibilityLabel;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("addNewReactionAccessibilityLabel");
                str = null;
            }
            View.OnClickListener onClickListener2 = this.onAddReactionClick;
            if (onClickListener2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onAddReactionClick");
            } else {
                onClickListener = onClickListener2;
            }
            addReactionViewHolder.bind(str, onClickListener, this.reactionsTheme, this.showReactLabel);
        }
        themeManager.setThemeOverride(themeOverride);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder reactionViewHolder;
        Intrinsics.checkNotNullParameter(parent, "parent");
        e eVar = new e(this.reactionHeight);
        ThemeManager themeManager = ThemeManager.INSTANCE;
        DiscordTheme themeOverride = themeManager.getThemeOverride();
        themeManager.setThemeOverride(this.theme);
        if (viewType == 46) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ReactionView reactionView = new ReactionView(context, null, 2, null);
            reactionView.setLayoutParams(eVar);
            reactionViewHolder = new ReactionViewHolder(reactionView);
        } else {
            if (viewType != 47) {
                throw new IllegalStateException(("Invalid view type " + viewType).toString());
            }
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            AddReactionView addReactionView = new AddReactionView(context2, null, 2, null);
            addReactionView.setLayoutParams(eVar);
            reactionViewHolder = new AddReactionViewHolder(addReactionView);
        }
        themeManager.setThemeOverride(themeOverride);
        return reactionViewHolder;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setReactions(@NotNull String messageId, @NotNull List<? extends ReactionView.Reaction> reactions, boolean canAddNewReactions, @NotNull String addNewReactionAccessibilityLabel, ReactionView.ReactionsTheme reactionsTheme, @NotNull View.OnClickListener onAddReactionClick, @NotNull Function1<? super ReactionView.Reaction, Unit> onReactionClick, @NotNull Function1<? super ReactionView.Reaction, Unit> onReactionLongPress, DiscordTheme theme, boolean areChatAnimationsEnabled, boolean showReactLabel) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(reactions, "reactions");
        Intrinsics.checkNotNullParameter(addNewReactionAccessibilityLabel, "addNewReactionAccessibilityLabel");
        Intrinsics.checkNotNullParameter(onAddReactionClick, "onAddReactionClick");
        Intrinsics.checkNotNullParameter(onReactionClick, "onReactionClick");
        Intrinsics.checkNotNullParameter(onReactionLongPress, "onReactionLongPress");
        this.messageId = messageId;
        this.canAddNewReactions = canAddNewReactions;
        this.addNewReactionAccessibilityLabel = addNewReactionAccessibilityLabel;
        this.showReactLabel = showReactLabel;
        this.reactionsTheme = reactionsTheme;
        this.onAddReactionClick = onAddReactionClick;
        this.onReactionClick = onReactionClick;
        this.onReactionLongPress = onReactionLongPress;
        this.theme = theme;
        if (!areChatAnimationsEnabled) {
            this.reactions = reactions;
            notifyDataSetChanged();
            return;
        }
        List<? extends ReactionView.Reaction> list = this.reactions;
        this.reactions = reactions;
        u uVarA = c.a(new ItemDiffer(list, reactions), true);
        Intrinsics.checkNotNullExpressionValue(uVarA, "calculateDiff(...)");
        uVarA.a(new b(this));
    }
}
