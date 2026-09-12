package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.premium_group_invite.PremiumGroupInviteEmbed;
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText;
import com.discord.chat.databinding.PremiumGroupInviteViewBinding;
import com.discord.chat.presentation.message.messagepart.PremiumGroupInviteMessageAccessory;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.primitives.MessageId;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/discord/chat/presentation/message/view/PremiumGroupInviteView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/discord/chat/presentation/message/messagepart/PremiumGroupInviteMessageAccessory;", "accessory", "Lkotlin/Function2;", "Lcom/discord/primitives/MessageId;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "", "onTapLink", "bind", "(Lcom/discord/chat/presentation/message/messagepart/PremiumGroupInviteMessageAccessory;Lkotlin/jvm/functions/Function2;)V", "Lcom/discord/chat/databinding/PremiumGroupInviteViewBinding;", "binding", "Lcom/discord/chat/databinding/PremiumGroupInviteViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/PremiumGroupInviteViewBinding;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PremiumGroupInviteView extends CardView {

    @NotNull
    private final PremiumGroupInviteViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PremiumGroupInviteView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$4$lambda$3(Function2 function2, PremiumGroupInviteMessageAccessory premiumGroupInviteMessageAccessory, LinkContentNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        function2.invoke(MessageId.m1156boximpl(premiumGroupInviteMessageAccessory.getMessageId()), node);
        return Unit.f14616a;
    }

    public final void bind(@NotNull PremiumGroupInviteMessageAccessory accessory, @NotNull Function2<? super MessageId, ? super LinkContentNode, Unit> onTapLink) {
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        Intrinsics.checkNotNullParameter(onTapLink, "onTapLink");
        PremiumGroupInviteEmbed premiumGroupInvite = accessory.getPremiumGroupInvite();
        setCardBackgroundColor(premiumGroupInvite.getBackgroundColor());
        SimpleDraweeView headerImage = this.binding.headerImage;
        Intrinsics.checkNotNullExpressionValue(headerImage, "headerImage");
        ReactAssetUtilsKt.setOptionalReactImageUrl(headerImage, premiumGroupInvite.getHeaderImageUrl());
        TextView textView = this.binding.betaPill;
        textView.setText(premiumGroupInvite.getBetaPillText());
        textView.setTextColor(premiumGroupInvite.getBetaPillTextColor());
        textView.getBackground().setTint(premiumGroupInvite.getBetaPillBackgroundColor());
        TextView textView2 = this.binding.headerText;
        textView2.setText(premiumGroupInvite.getHeaderText());
        textView2.setTextColor(premiumGroupInvite.getHeaderColor());
        TextView textView3 = this.binding.bodyText;
        textView3.setText(premiumGroupInvite.getBodyText());
        textView3.setTextColor(premiumGroupInvite.getBodyTextColor());
        TextView textView4 = this.binding.learnMoreLink;
        AnnotatedStructurableText learnMoreLink = premiumGroupInvite.getLearnMoreLink();
        Context context = textView4.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String strM1163toStringimpl = MessageId.m1163toStringimpl(accessory.getMessageId());
        TextPaint paint = textView4.getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "getPaint(...)");
        textView4.setText(TextUtilsKt.toSpannable(learnMoreLink, context, strM1163toStringimpl, false, false, false, false, paint, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? new f6.a(20) : new b7.a(13, onTapLink, accessory), (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new n6.e(0) : null, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new b(5) : null, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? new c(5) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? new f6.a(21) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? new ar.s(27) : null, (8388608 & 8192) != 0 ? new d(4) : null, (8388608 & 16384) != 0 ? new f6.a(22) : null, (32768 & 8388608) != 0 ? new f6.a(23) : null, (65536 & 8388608) != 0 ? new f6.a(24) : null, (131072 & 8388608) != 0 ? new f6.a(25) : null, (262144 & 8388608) != 0 ? new f6.a(26) : null, (524288 & 8388608) != 0 ? new f6.a(27) : null, (1048576 & 8388608) != 0 ? new f6.a(28) : null, (2097152 & 8388608) != 0 ? new i5.a(22) : null, (4194304 & 8388608) != 0 ? new f6.a(29) : null, (8388608 & 8388608) != 0 ? false : false, (16777216 & 8388608) != 0 ? ThemeManagerKt.getTheme() : null, (33554432 & 8388608) != 0 ? -1.0f : 0.0f, (67108864 & 8388608) != 0 ? null : null, (8388608 & 134217728) != 0 ? false : false));
        textView4.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @NotNull
    public final PremiumGroupInviteViewBinding getBinding() {
        return this.binding;
    }

    public /* synthetic */ PremiumGroupInviteView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumGroupInviteView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        PremiumGroupInviteViewBinding premiumGroupInviteViewBindingInflate = PremiumGroupInviteViewBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(premiumGroupInviteViewBindingInflate, "inflate(...)");
        this.binding = premiumGroupInviteViewBindingInflate;
        setUseCompatPadding(true);
        setClickable(true);
        setRadius(SizeUtilsKt.getDpToPx(5));
        setCardElevation(SizeUtilsKt.getDpToPx(1));
        TextView headerText = premiumGroupInviteViewBindingInflate.headerText;
        Intrinsics.checkNotNullExpressionValue(headerText, "headerText");
        DiscordFontUtilsKt.setDiscordFont(headerText, DiscordFont.PrimarySemibold);
        TextView bodyText = premiumGroupInviteViewBindingInflate.bodyText;
        Intrinsics.checkNotNullExpressionValue(bodyText, "bodyText");
        DiscordFont discordFont = DiscordFont.PrimaryNormal;
        DiscordFontUtilsKt.setDiscordFont(bodyText, discordFont);
        TextView learnMoreLink = premiumGroupInviteViewBindingInflate.learnMoreLink;
        Intrinsics.checkNotNullExpressionValue(learnMoreLink, "learnMoreLink");
        DiscordFontUtilsKt.setDiscordFont(learnMoreLink, discordFont);
    }
}
