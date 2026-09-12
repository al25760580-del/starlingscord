package com.discord.chat.presentation.message.view.polls;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.discord.chat.bridge.polls.PollAnswer;
import com.discord.chat.databinding.PollTextAndImageAnswerViewBinding;
import com.discord.chat.presentation.message.messagepart.polls.PollAnswerAccessory;
import com.discord.device.views.DiscordRecyclerView;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.theme.ThemeManager;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u000f\u0010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/discord/chat/presentation/message/view/polls/PollTextAndImageView;", "Lcom/discord/chat/presentation/message/view/polls/BasePollWithRecyclerView;", "Lcom/discord/chat/presentation/message/view/polls/PollPresenter;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "myAdapter", "Lcom/discord/chat/presentation/message/view/polls/PollTextAndImageView$ImageAndTextAnswerAdapter;", "getMyAdapter", "()Lcom/discord/chat/presentation/message/view/polls/PollTextAndImageView$ImageAndTextAnswerAdapter;", "ImageAndTextAnswerAdapter", "ImageAndTextAnswerHolder", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PollTextAndImageView extends BasePollWithRecyclerView implements PollPresenter {

    @NotNull
    private final ImageAndTextAnswerAdapter myAdapter;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/discord/chat/presentation/message/view/polls/PollTextAndImageView$ImageAndTextAnswerAdapter;", "Lcom/discord/chat/presentation/message/view/polls/PollAnswerAdapter;", "Lcom/discord/chat/presentation/message/view/polls/PollTextAndImageView$ImageAndTextAnswerHolder;", "<init>", "()V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImageAndTextAnswerAdapter extends PollAnswerAdapter<ImageAndTextAnswerHolder> {
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public ImageAndTextAnswerHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            PollTextAndImageAnswerViewBinding pollTextAndImageAnswerViewBindingInflate = PollTextAndImageAnswerViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(pollTextAndImageAnswerViewBindingInflate, "inflate(...)");
            return new ImageAndTextAnswerHolder(pollTextAndImageAnswerViewBindingInflate);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JW\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b20\u0010\u000f\u001a,\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/discord/chat/presentation/message/view/polls/PollTextAndImageView$ImageAndTextAnswerHolder;", "Lcom/discord/chat/presentation/message/view/polls/PollAnswerViewHolder;", "Lcom/discord/chat/databinding/PollTextAndImageAnswerViewBinding;", "binding", "<init>", "(Lcom/discord/chat/databinding/PollTextAndImageAnswerViewBinding;)V", "Lcom/discord/chat/presentation/message/messagepart/polls/PollAnswerAccessory;", "accessory", "Lkotlin/Function0;", "", "onTapAnswer", "Lkotlin/Function6;", "", "", "Lcom/discord/chat/reactevents/ViewResizeMode;", "onLongPressImage", "bind", "(Lcom/discord/chat/presentation/message/messagepart/polls/PollAnswerAccessory;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function6;)V", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPollTextAndImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollTextAndImageView.kt\ncom/discord/chat/presentation/message/view/polls/PollTextAndImageView$ImageAndTextAnswerHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,163:1\n257#2,2:164\n257#2,2:166\n257#2,2:168\n257#2,2:170\n257#2,2:172\n*S KotlinDebug\n*F\n+ 1 PollTextAndImageView.kt\ncom/discord/chat/presentation/message/view/polls/PollTextAndImageView$ImageAndTextAnswerHolder\n*L\n104#1:164,2\n145#1:166,2\n152#1:168,2\n157#1:170,2\n158#1:172,2\n*E\n"})
    public static final class ImageAndTextAnswerHolder extends PollAnswerViewHolder<PollTextAndImageAnswerViewBinding> {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final long VOTED_TRANSITION_DURATION_MS = 1200;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/discord/chat/presentation/message/view/polls/PollTextAndImageView$ImageAndTextAnswerHolder$Companion;", "", "<init>", "()V", "VOTED_TRANSITION_DURATION_MS", "", "BORDER_RADIUS", "", "getBORDER_RADIUS", "()I", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int getBORDER_RADIUS() {
                return SizeUtilsKt.getDpToPx(ThemeManager.INSTANCE.isVisualRefreshEnabled() ? 8 : 16);
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageAndTextAnswerHolder(@NotNull PollTextAndImageAnswerViewBinding binding) {
            super(binding);
            Intrinsics.checkNotNullParameter(binding, "binding");
            SimpleDraweeSpanTextView simpleDraweeSpanTextView = binding.label;
            simpleDraweeSpanTextView.setTextColor(ThemeManagerKt.getTheme().getMobileTextHeadingPrimary());
            Intrinsics.checkNotNull(simpleDraweeSpanTextView);
            DiscordFontUtilsKt.setDiscordFont(simpleDraweeSpanTextView, DiscordFont.PrimarySemibold);
            FrameLayout percentageBarContainer = binding.percentageBarContainer;
            Intrinsics.checkNotNullExpressionValue(percentageBarContainer, "percentageBarContainer");
            ViewClippingUtilsKt.clipToRoundedRectangle(percentageBarContainer, INSTANCE.getBORDER_RADIUS());
            TextView textView = binding.votePercentage;
            textView.setTextColor(ThemeManagerKt.getTheme().getMobileTextHeadingPrimary());
            Intrinsics.checkNotNull(textView);
            DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryBold);
            TextView textView2 = binding.voteCounts;
            textView2.setTextColor(ThemeManagerKt.getTheme().getMobileTextHeadingPrimary());
            Intrinsics.checkNotNull(textView2);
            DiscordFontUtilsKt.setDiscordFont(textView2, DiscordFont.PrimaryMedium);
        }

        @Override // com.discord.chat.presentation.message.view.polls.PollAnswerViewHolder
        public void bind(@NotNull PollAnswerAccessory accessory, @NotNull Function0<Unit> onTapAnswer, @NotNull Function6 onLongPressImage) {
            Intrinsics.checkNotNullParameter(accessory, "accessory");
            Intrinsics.checkNotNullParameter(onTapAnswer, "onTapAnswer");
            Intrinsics.checkNotNullParameter(onLongPressImage, "onLongPressImage");
            PollAnswer answer = accessory.getAnswer();
            int borderWidthPx = accessory.getBorderWidthPx();
            ConstraintLayout root = getBinding().getRoot();
            Intrinsics.checkNotNull(root);
            ViewBackgroundUtilsKt.setBackgroundRectangle(root, accessory.getAnswerBackgroundColor(), INSTANCE.getBORDER_RADIUS(), Integer.valueOf(accessory.getBorderColor()), borderWidthPx);
            View view = getBinding().percentageBarBackground;
            Intrinsics.checkNotNull(view);
            view.setVisibility(accessory.getCanShowVoteCounts() ? 0 : 8);
            float votesPercentage = answer.getVotesPercentage() / 100.0f;
            if (accessory.getCanShowVoteCounts()) {
                view.setBackgroundColor(accessory.getAnswerFillColor());
                view.setPivotX(0.0f);
                if (accessory.getShouldAnimateTransition()) {
                    view.setScaleX(0.0f);
                    view.animate().setDuration(VOTED_TRANSITION_DURATION_MS).setInterpolator(new AccelerateDecelerateInterpolator()).scaleX(votesPercentage);
                } else {
                    view.setScaleX(votesPercentage);
                }
            }
            PollMediaView pollMediaView = getBinding().image;
            pollMediaView.setAlpha(accessory.getStyleSet().getOpacity());
            pollMediaView.setMedia(accessory, onTapAnswer, onLongPressImage);
            SimpleDraweeSpanTextView simpleDraweeSpanTextView = getBinding().label;
            simpleDraweeSpanTextView.setTextColor(accessory.getLabelColor());
            simpleDraweeSpanTextView.setText(answer.getPollMedia().getText());
            getBinding().checkbox.configure(accessory);
            if (!accessory.getCanShowVoteCounts()) {
                TextView votePercentage = getBinding().votePercentage;
                Intrinsics.checkNotNullExpressionValue(votePercentage, "votePercentage");
                votePercentage.setVisibility(8);
                TextView voteCounts = getBinding().voteCounts;
                Intrinsics.checkNotNullExpressionValue(voteCounts, "voteCounts");
                voteCounts.setVisibility(8);
                return;
            }
            TextView textView = getBinding().votePercentage;
            Intrinsics.checkNotNull(textView);
            textView.setVisibility(0);
            textView.setTextColor(accessory.getLabelColor());
            textView.setText(answer.getVotesPercentage() + "%");
            TextView textView2 = getBinding().voteCounts;
            Intrinsics.checkNotNull(textView2);
            textView2.setVisibility(0);
            textView2.setTextColor(accessory.getLabelColor());
            textView2.setText(answer.getVotes());
            Intrinsics.checkNotNull(textView2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PollTextAndImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PollTextAndImageView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.discord.chat.presentation.message.view.polls.BasePollWithRecyclerView
    @NotNull
    public ImageAndTextAnswerAdapter getMyAdapter() {
        return this.myAdapter;
    }

    public /* synthetic */ PollTextAndImageView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollTextAndImageView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.myAdapter = new ImageAndTextAnswerAdapter();
        DiscordRecyclerView discordRecyclerView = getBinding().answers;
        discordRecyclerView.addItemDecoration(new VerticalGapItemDecoration(SizeUtilsKt.getDpToPx(8)));
        discordRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        discordRecyclerView.setAdapter(getMyAdapter());
    }
}
