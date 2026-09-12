package com.discord.reactions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.DiscordTheme;
import com.discord.theme.ThemeManager;
import com.google.android.flexbox.FlexboxLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import t7.a;
import t7.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 '2\u00020\u0001:\u0001'B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007Jx\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u00192\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u0011J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\tH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020#H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/discord/reactions/ShortcutsFlexbox;", "Lcom/google/android/flexbox/FlexboxLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "addReactionView", "Lcom/discord/reactions/AddReactionView;", "shortcutsView", "setReactions", "", "reactions", "", "Lcom/discord/reactions/ReactionView$Reaction;", "canAddNewReactions", "", "addNewReactionAccessibilityLabel", "", "reactionsTheme", "Lcom/discord/reactions/ReactionView$ReactionsTheme;", "onAddReactionClick", "Landroid/view/View$OnClickListener;", "onReactionClick", "Lkotlin/Function1;", "onReactionLongPress", "theme", "Lcom/discord/theme/DiscordTheme;", "showReactLabel", "setShortcutMargins", "shortcutView", "getOrCreateReactionView", "Lcom/discord/reactions/ReactionView;", "index", "", "createAndAddReactionView", "hideRemainingReactionsInRow", "startIndex", "Companion", "reactions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShortcutsFlexbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShortcutsFlexbox.kt\ncom/discord/reactions/ShortcutsFlexbox\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1878#2,3:158\n1#3:161\n*S KotlinDebug\n*F\n+ 1 ShortcutsFlexbox.kt\ncom/discord/reactions/ShortcutsFlexbox\n*L\n55#1:158,3\n*E\n"})
public final class ShortcutsFlexbox extends FlexboxLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final AddReactionView addReactionView;

    @NotNull
    private final FlexboxLayout shortcutsView;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n¨\u0006\f"}, d2 = {"Lcom/discord/reactions/ShortcutsFlexbox$Companion;", "", "<init>", "()V", "copyReactionWithoutCount", "Lcom/discord/reactions/ReactionView$Reaction;", "reaction", "isBurstReaction", "", "separateAndSortDuplicateReactions", "", "reactions", "reactions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ReactionView.Reaction copyReactionWithoutCount(@NotNull final ReactionView.Reaction reaction, final boolean isBurstReaction) {
            Intrinsics.checkNotNullParameter(reaction, "reaction");
            return new ReactionView.Reaction(isBurstReaction, reaction) { // from class: com.discord.reactions.ShortcutsFlexbox$Companion$copyReactionWithoutCount$1
                private final int burstCount;
                private final int count;
                private final ReactionView.Emoji emoji;
                private final boolean isMe;
                private final boolean isMeBurst;
                private final ReactionView.ThemedBurstColorPalette themedBurstColors;

                {
                    this.count = isBurstReaction ? 0 : reaction.getCount();
                    this.burstCount = isBurstReaction ? reaction.getBurstCount() : 0;
                    this.isMe = reaction.getIsMe();
                    this.isMeBurst = reaction.getIsMeBurst();
                    this.emoji = reaction.getEmoji();
                    this.themedBurstColors = reaction.getThemedBurstColors();
                }

                @Override // com.discord.reactions.ReactionView.Reaction
                public int getBurstCount() {
                    return this.burstCount;
                }

                @Override // com.discord.reactions.ReactionView.Reaction
                public int getCount() {
                    return this.count;
                }

                @Override // com.discord.reactions.ReactionView.Reaction
                public ReactionView.Emoji getEmoji() {
                    return this.emoji;
                }

                @Override // com.discord.recycler_view.utils.ItemDiffableType
                public Long getItemId() {
                    return ReactionView.Reaction.DefaultImpls.getItemId(this);
                }

                @Override // com.discord.reactions.ReactionView.Reaction
                public ReactionView.ThemedBurstColorPalette getThemedBurstColors() {
                    return this.themedBurstColors;
                }

                @Override // com.discord.reactions.ReactionView.Reaction
                public boolean isBurstReaction() {
                    return ReactionView.Reaction.DefaultImpls.isBurstReaction(this);
                }

                @Override // com.discord.reactions.ReactionView.Reaction
                /* JADX INFO: renamed from: isMe, reason: from getter */
                public boolean getIsMe() {
                    return this.isMe;
                }

                @Override // com.discord.reactions.ReactionView.Reaction
                /* JADX INFO: renamed from: isMeBurst, reason: from getter */
                public boolean getIsMeBurst() {
                    return this.isMeBurst;
                }
            };
        }

        @NotNull
        public final List<ReactionView.Reaction> separateAndSortDuplicateReactions(List<? extends ReactionView.Reaction> reactions) {
            ArrayList arrayList = new ArrayList();
            if (reactions != null) {
                for (ReactionView.Reaction reaction : reactions) {
                    if (reaction.getBurstCount() <= 0 || reaction.getCount() <= 0) {
                        arrayList.add(reaction);
                    } else {
                        arrayList.add(copyReactionWithoutCount(reaction, true));
                        arrayList.add(copyReactionWithoutCount(reaction, false));
                    }
                }
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShortcutsFlexbox(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ReactionView createAndAddReactionView(int index) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ReactionView reactionView = new ReactionView(context, null, 2, 0 == true ? 1 : 0);
        addView(reactionView, index);
        ViewGroup.LayoutParams layoutParams = reactionView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
        FlexboxLayout.LayoutParams layoutParams2 = (FlexboxLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(0, 0, SizeUtilsKt.getDpToPx(4), SizeUtilsKt.getDpToPx(4));
        reactionView.setLayoutParams(layoutParams2);
        return reactionView;
    }

    private final ReactionView getOrCreateReactionView(int index) {
        if (index >= getChildCount() - 1) {
            return createAndAddReactionView(getChildCount() - 1);
        }
        View childAt = getChildAt(index);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.discord.reactions.ReactionView");
        ReactionView reactionView = (ReactionView) childAt;
        ViewGroup.LayoutParams layoutParams = reactionView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
        reactionView.setLayoutParams((FlexboxLayout.LayoutParams) layoutParams);
        reactionView.setVisibility(0);
        return reactionView;
    }

    private final void hideRemainingReactionsInRow(int startIndex) {
        int childCount = getChildCount() - 1;
        while (startIndex < childCount) {
            getChildAt(startIndex).setVisibility(8);
            startIndex++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setReactions$lambda$0(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setReactions$lambda$1(ReactionView.Reaction reaction) {
        Intrinsics.checkNotNullParameter(reaction, "<unused var>");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setReactions$lambda$4$lambda$3(Function1 function1, ReactionView.Reaction reaction, View view) {
        function1.invoke(reaction);
        return true;
    }

    private final void setShortcutMargins(AddReactionView shortcutView) {
        ViewGroup.LayoutParams layoutParams = shortcutView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
        FlexboxLayout.LayoutParams layoutParams2 = (FlexboxLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(0, 0, SizeUtilsKt.getDpToPx(6), SizeUtilsKt.getDpToPx(4));
        shortcutView.setLayoutParams(layoutParams2);
    }

    public final void setReactions(@NotNull List<? extends ReactionView.Reaction> reactions, boolean canAddNewReactions, @NotNull String addNewReactionAccessibilityLabel, ReactionView.ReactionsTheme reactionsTheme, @NotNull View.OnClickListener onAddReactionClick, @NotNull Function1<? super ReactionView.Reaction, Unit> onReactionClick, @NotNull Function1<? super ReactionView.Reaction, Unit> onReactionLongPress, DiscordTheme theme, boolean showReactLabel) {
        Intrinsics.checkNotNullParameter(reactions, "reactions");
        Intrinsics.checkNotNullParameter(addNewReactionAccessibilityLabel, "addNewReactionAccessibilityLabel");
        Intrinsics.checkNotNullParameter(onAddReactionClick, "onAddReactionClick");
        Intrinsics.checkNotNullParameter(onReactionClick, "onReactionClick");
        Intrinsics.checkNotNullParameter(onReactionLongPress, "onReactionLongPress");
        ThemeManager themeManager = ThemeManager.INSTANCE;
        DiscordTheme themeOverride = themeManager.getThemeOverride();
        themeManager.setThemeOverride(theme);
        List<ReactionView.Reaction> listSeparateAndSortDuplicateReactions = INSTANCE.separateAndSortDuplicateReactions(reactions);
        int i7 = 0;
        for (Object obj : listSeparateAndSortDuplicateReactions) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                d0.k();
                throw null;
            }
            ReactionView.Reaction reaction = (ReactionView.Reaction) obj;
            ReactionView orCreateReactionView = getOrCreateReactionView(i7);
            orCreateReactionView.setReaction(reaction, reactionsTheme);
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(orCreateReactionView, false, new a(onReactionClick, reaction, 1), 1, null);
            NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(orCreateReactionView, false, new b(onReactionLongPress, reaction, 1), 1, null);
            listSeparateAndSortDuplicateReactions = listSeparateAndSortDuplicateReactions;
            i7 = i10;
        }
        hideRemainingReactionsInRow(listSeparateAndSortDuplicateReactions.size());
        if (canAddNewReactions) {
            AddReactionView.configure$default(this.addReactionView, reactionsTheme, false, null, showReactLabel, 4, null);
            this.addReactionView.setContentDescription(addNewReactionAccessibilityLabel);
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this.addReactionView, false, onAddReactionClick, 1, null);
            setShortcutMargins(this.addReactionView);
        }
        this.shortcutsView.setVisibility(canAddNewReactions ? 0 : 8);
        this.addReactionView.setVisibility(canAddNewReactions ? 0 : 8);
        ThemeManager.INSTANCE.setThemeOverride(themeOverride);
    }

    public /* synthetic */ ShortcutsFlexbox(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShortcutsFlexbox(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.addReactionView = new AddReactionView(context, null, 2, 0 == true ? 1 : 0);
        this.shortcutsView = new FlexboxLayout(context, null);
        setFlexDirection(0);
        setFlexWrap(1);
        setJustifyContent(0);
        for (int i7 = 0; i7 < 10; i7++) {
            createAndAddReactionView(i7);
        }
        addView(this.shortcutsView);
        this.shortcutsView.setFlexDirection(0);
        this.shortcutsView.setFlexWrap(0);
        this.shortcutsView.setJustifyContent(0);
        this.shortcutsView.addView(this.addReactionView);
    }
}
