package com.discord.chat.presentation.message.view.polls;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.g0;
import androidx.core.view.q0;
import androidx.core.view.u0;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.R;
import com.discord.chat.databinding.PollRecyclerViewBinding;
import com.discord.chat.presentation.message.messagepart.PollMessageAccessory;
import com.discord.chat.presentation.message.view.polls.a11y.PollAnswersRecyclerAccessibilityDelegate;
import com.discord.chat.reactevents.ViewResizeMode;
import com.discord.device.views.DiscordRecyclerView;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import com.discord.recycler_view.animator.NoMoveItemAnimator;
import com.discord.theme.ThemeManagerKt;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0095\u0001\u0010\u0017\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u001e\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\r2\u001e\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\r2<\u0010\u0016\u001a8\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00110\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\u00020\u00198\u0004X\u0084\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010#\u001a\u0006\u0012\u0002\b\u00030 8$X¤\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/discord/chat/presentation/message/view/polls/BasePollWithRecyclerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/discord/chat/presentation/message/view/polls/PollPresenter;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/discord/chat/presentation/message/messagepart/PollMessageAccessory;", "accessory", "Lkotlin/Function3;", "Lcom/discord/primitives/ChannelId;", "Lcom/discord/primitives/MessageId;", "", "", "onTapAnswer", "onTapPollAction", "Lkotlin/Function8;", "Lcom/discord/chat/reactevents/ViewResizeMode;", "onLongPressImage", "bind", "(Lcom/discord/chat/presentation/message/messagepart/PollMessageAccessory;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function8;)V", "Lcom/discord/chat/databinding/PollRecyclerViewBinding;", "binding", "Lcom/discord/chat/databinding/PollRecyclerViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/PollRecyclerViewBinding;", "getBinding$annotations", "()V", "Lcom/discord/chat/presentation/message/view/polls/PollAnswerAdapter;", "getMyAdapter", "()Lcom/discord/chat/presentation/message/view/polls/PollAnswerAdapter;", "myAdapter", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBasePollWithRecyclerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasePollWithRecyclerView.kt\ncom/discord/chat/presentation/message/view/polls/BasePollWithRecyclerView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,170:1\n176#2,2:171\n257#2,2:173\n*S KotlinDebug\n*F\n+ 1 BasePollWithRecyclerView.kt\ncom/discord/chat/presentation/message/view/polls/BasePollWithRecyclerView\n*L\n49#1:171,2\n136#1:173,2\n*E\n"})
public abstract class BasePollWithRecyclerView extends ConstraintLayout implements PollPresenter {

    @NotNull
    private final PollRecyclerViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BasePollWithRecyclerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$3(Function3 function3, PollMessageAccessory pollMessageAccessory, String answerId) {
        Intrinsics.checkNotNullParameter(answerId, "answerId");
        function3.invoke(ChannelId.m1130boximpl(pollMessageAccessory.m672getChannelIdo4g7jtM()), MessageId.m1156boximpl(pollMessageAccessory.getMessageId()), answerId);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$4(Function8 function8, PollMessageAccessory pollMessageAccessory, String attachmentId, int i7, int i10, int i11, int i12, ViewResizeMode viewResizeMode) {
        Intrinsics.checkNotNullParameter(attachmentId, "attachmentId");
        Intrinsics.checkNotNullParameter(viewResizeMode, "viewResizeMode");
        function8.invoke(ChannelId.m1130boximpl(pollMessageAccessory.m672getChannelIdo4g7jtM()), MessageId.m1156boximpl(pollMessageAccessory.getMessageId()), attachmentId, Integer.valueOf((int) SizeUtilsKt.getPxToDp(i7)), Integer.valueOf((int) SizeUtilsKt.getPxToDp(i10)), Integer.valueOf((int) SizeUtilsKt.getPxToDp(i11)), Integer.valueOf((int) SizeUtilsKt.getPxToDp(i12)), viewResizeMode);
        return Unit.f14616a;
    }

    public static /* synthetic */ void getBinding$annotations() {
    }

    @Override // com.discord.chat.presentation.message.view.polls.PollPresenter
    public void bind(@NotNull PollMessageAccessory accessory, @NotNull Function3 onTapAnswer, @NotNull Function3 onTapPollAction, @NotNull Function8 onLongPressImage) {
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        Intrinsics.checkNotNullParameter(onTapAnswer, "onTapAnswer");
        Intrinsics.checkNotNullParameter(onTapPollAction, "onTapPollAction");
        Intrinsics.checkNotNullParameter(onLongPressImage, "onLongPressImage");
        int i7 = 0;
        getMyAdapter().setData(accessory.getAnswers(), new b7.a(15, onTapAnswer, accessory), new a(i7, onLongPressImage, accessory));
        View root = this.binding.getRoot();
        Intrinsics.checkNotNull(root);
        ViewBackgroundUtilsKt.setBackgroundRectangle(root, accessory.getFillColor(), SizeUtilsKt.getDpToPx(16), Integer.valueOf(accessory.getBorderColor()), accessory.getBorderWidthPx());
        DiscordRecyclerView discordRecyclerView = this.binding.answers;
        discordRecyclerView.setFocusableInTouchMode(!accessory.getData().getCanSelectMultipleAnswers());
        WeakHashMap weakHashMap = u0.f1729a;
        if (Build.VERSION.SDK_INT >= 30) {
            q0.d(discordRecyclerView, 4);
        }
        discordRecyclerView.setImportantForAccessibility(1);
        u0.p(discordRecyclerView, new PollAnswersRecyclerAccessibilityDelegate(accessory));
        boolean zHasAccessibilityFocus = this.binding.primaryAction.hasAccessibilityFocus();
        boolean zHasAccessibilityFocus2 = this.binding.secondaryActionButton.hasAccessibilityFocus();
        boolean zHasAccessibilityFocus3 = this.binding.tertiaryActionButton.hasAccessibilityFocus();
        this.binding.questionText.setText(accessory.getData().getQuestion().getText());
        TextView textView = this.binding.promptText;
        Intrinsics.checkNotNull(textView);
        textView.setVisibility(accessory.getData().getPromptLabel() != null ? 0 : 8);
        textView.setText(accessory.getData().getPromptLabel());
        this.binding.primaryAction.m758bindurJ__Hs(accessory.getData().getPrimaryAction(), accessory.m672getChannelIdo4g7jtM(), accessory.getMessageId(), onTapPollAction);
        this.binding.secondaryActionButton.m758bindurJ__Hs(accessory.getData().getSecondaryAction(), accessory.m672getChannelIdo4g7jtM(), accessory.getMessageId(), onTapPollAction);
        this.binding.tertiaryActionButton.m758bindurJ__Hs(accessory.getData().getTertiaryAction(), accessory.m672getChannelIdo4g7jtM(), accessory.getMessageId(), onTapPollAction);
        boolean z5 = zHasAccessibilityFocus && !this.binding.primaryAction.hasAccessibilityFocus();
        boolean z6 = zHasAccessibilityFocus2 && !this.binding.secondaryActionButton.hasAccessibilityFocus();
        if (zHasAccessibilityFocus3 && !this.binding.tertiaryActionButton.hasAccessibilityFocus()) {
            i7 = 1;
        }
        if ((z5 || z6 || i7 != 0) && !this.binding.answers.isAccessibilityFocused()) {
            this.binding.answers.sendAccessibilityEvent(8);
        }
    }

    @NotNull
    public final PollRecyclerViewBinding getBinding() {
        return this.binding;
    }

    @NotNull
    public abstract PollAnswerAdapter<?> getMyAdapter();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BasePollWithRecyclerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BasePollWithRecyclerView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePollWithRecyclerView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        PollRecyclerViewBinding pollRecyclerViewBindingInflate = PollRecyclerViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(pollRecyclerViewBindingInflate, "inflate(...)");
        this.binding = pollRecyclerViewBindingInflate;
        DiscordRecyclerView discordRecyclerView = pollRecyclerViewBindingInflate.answers;
        NoMoveItemAnimator noMoveItemAnimator = new NoMoveItemAnimator() { // from class: com.discord.chat.presentation.message.view.polls.BasePollWithRecyclerView.1
            @Override // androidx.recyclerview.widget.r, androidx.recyclerview.widget.RecyclerView.ItemAnimator
            public void endAnimation(RecyclerView.ViewHolder item) {
                Intrinsics.checkNotNullParameter(item, "item");
                super.endAnimation(item);
                View itemView = item.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                MaybeAnimateElevationToKt.maybeEndAnimation(itemView);
            }
        };
        noMoveItemAnimator.setSupportsChangeAnimations(false);
        discordRecyclerView.setItemAnimator(noMoveItemAnimator);
        View root = pollRecyclerViewBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        int dpToPx = SizeUtilsKt.getDpToPx(16);
        root.setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
        TextView textView = pollRecyclerViewBindingInflate.questionText;
        textView.setTextColor(ThemeManagerKt.getTheme().getMobileTextHeadingPrimary());
        Intrinsics.checkNotNull(textView);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimarySemibold);
        WeakHashMap weakHashMap = u0.f1729a;
        g0 g0Var = new g0(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3);
        Boolean bool = Boolean.TRUE;
        g0Var.f(textView, bool);
        new g0(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).f(textView, bool);
        TextView textView2 = pollRecyclerViewBindingInflate.promptText;
        textView2.setTextColor(ThemeManagerKt.getTheme().getTextSubtle());
        Intrinsics.checkNotNull(textView2);
        DiscordFontUtilsKt.setDiscordFont(textView2, DiscordFont.PrimaryNormal);
        new g0(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).f(textView2, bool);
        setClipChildren(false);
        setClipToPadding(false);
    }
}
