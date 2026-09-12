package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.discord.chat.databinding.AltTextButtonViewBinding;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u000e\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/discord/chat/presentation/message/view/AltTextButtonView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "description", "Lkotlin/Function1;", "", "Lcom/discord/chat/presentation/events/MessageTapShowAltText;", ViewProps.ON_CLICK, "configure", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lcom/discord/chat/databinding/AltTextButtonViewBinding;", "binding", "Lcom/discord/chat/databinding/AltTextButtonViewBinding;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAltTextButtonView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AltTextButtonView.kt\ncom/discord/chat/presentation/message/view/AltTextButtonView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,41:1\n257#2,2:42\n257#2,2:44\n*S KotlinDebug\n*F\n+ 1 AltTextButtonView.kt\ncom/discord/chat/presentation/message/view/AltTextButtonView\n*L\n31#1:42,2\n36#1:44,2\n*E\n"})
public final class AltTextButtonView extends FrameLayout {

    @NotNull
    private final AltTextButtonViewBinding binding;

    public /* synthetic */ AltTextButtonView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    public final void configure(String description, Function1<? super String, Unit> onClick) {
        if (description == null || onClick == null) {
            setVisibility(8);
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, null, 1, null);
        } else {
            setVisibility(0);
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, new e(0, description, onClick), 1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AltTextButtonView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        AltTextButtonViewBinding altTextButtonViewBindingInflate = AltTextButtonViewBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(altTextButtonViewBindingInflate, "inflate(...)");
        this.binding = altTextButtonViewBindingInflate;
        FrameLayout altTextContainer = altTextButtonViewBindingInflate.altTextContainer;
        Intrinsics.checkNotNullExpressionValue(altTextContainer, "altTextContainer");
        ViewClippingUtilsKt.clipToRoundedRectangle(altTextContainer, SizeUtilsKt.getDpToPx(8));
        altTextButtonViewBindingInflate.altTextLabel.setText(I18nUtilsKt.i18nFormat$default(context, I18nMessage.MEDIA_MOSAIC_ALT_TEXT_CTA, null, 2, null));
        altTextButtonViewBindingInflate.altTextLabel.setContentDescription(I18nUtilsKt.i18nFormat$default(context, I18nMessage.MEDIA_MOSAIC_ALT_TEXT_POPOUT_TITLE, null, 2, null));
    }
}
