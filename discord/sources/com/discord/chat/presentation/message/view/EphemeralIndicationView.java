package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.ephemeral.EphemeralIndication;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.databinding.EphemeralActionViewBinding;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.SimpleDraweeSpanTextViewUtilsKt;
import com.discord.primitives.MessageId;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.span.utilities.BackgroundSpanDrawer;
import com.discord.span.utilities.SpannableExtensionsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJK\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/discord/chat/presentation/message/view/EphemeralIndicationView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/discord/primitives/MessageId;", "messageId", "Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;", "ephemeralIndication", "Lkotlin/Function2;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "", "onLinkClicked", "Lkotlin/Function1;", "", "onHelpArticleClicked", "setEphemeralIndication-AFFcxXc", "(Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "setEphemeralIndication", "Lcom/discord/chat/databinding/EphemeralActionViewBinding;", "binding", "Lcom/discord/chat/databinding/EphemeralActionViewBinding;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEphemeralIndicationView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EphemeralIndicationView.kt\ncom/discord/chat/presentation/message/view/EphemeralIndicationView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
public final class EphemeralIndicationView extends ConstraintLayout {

    @NotNull
    private EphemeralActionViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EphemeralIndicationView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setEphemeralIndication_AFFcxXc$lambda$4$lambda$3(Function1 function1, EphemeralIndication ephemeralIndication, View view) {
        function1.invoke(ephemeralIndication.getHelpArticleLink());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setEphemeralIndication_AFFcxXc$lambda$7$lambda$5(Function2 function2, String str, LinkContentNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        function2.invoke(MessageId.m1156boximpl(str), node);
        return Unit.f14616a;
    }

    /* JADX INFO: renamed from: setEphemeralIndication-AFFcxXc, reason: not valid java name */
    public final void m739setEphemeralIndicationAFFcxXc(@NotNull String messageId, @NotNull EphemeralIndication ephemeralIndication, @NotNull Function2<? super MessageId, ? super LinkContentNode, Unit> onLinkClicked, @NotNull Function1<? super String, Unit> onHelpArticleClicked) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(ephemeralIndication, "ephemeralIndication");
        Intrinsics.checkNotNullParameter(onLinkClicked, "onLinkClicked");
        Intrinsics.checkNotNullParameter(onHelpArticleClicked, "onHelpArticleClicked");
        SimpleDraweeView simpleDraweeView = this.binding.chatListAdapterItemIconHelp;
        simpleDraweeView.setContentDescription(ephemeralIndication.getHelpButtonAccessibilityLabel());
        simpleDraweeView.setOnClickListener(new com.discord.chat.presentation.message.t(3, onHelpArticleClicked, ephemeralIndication));
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = this.binding.chatListAdapterItemTextDismiss;
        Intrinsics.checkNotNull(simpleDraweeSpanTextView);
        StructurableText content = ephemeralIndication.getContent();
        Context context = simpleDraweeSpanTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Paint.FontMetrics fontMetrics = simpleDraweeSpanTextView.getPaint().getFontMetrics();
        Intrinsics.checkNotNullExpressionValue(fontMetrics, "getFontMetrics(...)");
        float baselineHeightPx = TextUtilsKt.getBaselineHeightPx(fontMetrics);
        TextPaint paint = simpleDraweeSpanTextView.getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "getPaint(...)");
        DraweeSpanStringBuilder spannable = TextUtilsKt.toSpannable(content, context, messageId, false, false, false, false, paint, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? new f6.a(20) : new a(onLinkClicked, messageId, 4), (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new n6.e(0) : null, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new b(5) : null, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? new c(5) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? new f6.a(21) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? new ar.s(27) : null, (8388608 & 8192) != 0 ? new d(4) : null, (8388608 & 16384) != 0 ? new f6.a(22) : null, (32768 & 8388608) != 0 ? new f6.a(23) : null, (65536 & 8388608) != 0 ? new f6.a(24) : null, (131072 & 8388608) != 0 ? new f6.a(25) : null, (262144 & 8388608) != 0 ? new f6.a(26) : null, (524288 & 8388608) != 0 ? new f6.a(27) : null, (1048576 & 8388608) != 0 ? new f6.a(28) : null, (2097152 & 8388608) != 0 ? new i5.a(22) : null, (4194304 & 8388608) != 0 ? new f6.a(29) : null, (8388608 & 8388608) != 0 ? false : false, (16777216 & 8388608) != 0 ? ThemeManagerKt.getTheme() : null, (33554432 & 8388608) != 0 ? -1.0f : baselineHeightPx, (67108864 & 8388608) != 0 ? null : null, (8388608 & 134217728) != 0 ? false : false);
        SpannableExtensionsKt.coverWithSpan(spannable, new BackgroundSpanDrawer(simpleDraweeSpanTextView));
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(simpleDraweeSpanTextView, spannable);
        NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener$default(simpleDraweeSpanTextView, false, 1, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EphemeralIndicationView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ EphemeralIndicationView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EphemeralIndicationView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        EphemeralActionViewBinding ephemeralActionViewBindingInflate = EphemeralActionViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(ephemeralActionViewBindingInflate, "inflate(...)");
        this.binding = ephemeralActionViewBindingInflate;
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = ephemeralActionViewBindingInflate.chatListAdapterItemTextDismiss;
        Intrinsics.checkNotNull(simpleDraweeSpanTextView);
        DiscordFontUtilsKt.setDiscordFont(simpleDraweeSpanTextView, DiscordFont.PrimaryMedium);
        SetTextSizeSpKt.setTextSizeSp(simpleDraweeSpanTextView, 12.0f);
        simpleDraweeSpanTextView.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        SimpleDraweeView simpleDraweeView = this.binding.chatListAdapterItemIconHelp;
        Intrinsics.checkNotNull(simpleDraweeView);
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.CircleQuestionIcon);
        ColorUtilsKt.setTintColor(simpleDraweeView, Integer.valueOf(ThemeManagerKt.getTheme().getTextMuted()));
        SimpleDraweeView simpleDraweeView2 = this.binding.chatListAdapterItemVisibilityIcon;
        Intrinsics.checkNotNull(simpleDraweeView2);
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView2, ReactAsset.EyeIcon);
        ColorUtilsKt.setTintColor(simpleDraweeView2, Integer.valueOf(ThemeManagerKt.getTheme().getTextMuted()));
    }
}
