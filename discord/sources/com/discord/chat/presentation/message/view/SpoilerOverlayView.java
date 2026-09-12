package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.discord.chat.databinding.SpoilerOverlayViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.R;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/chat/presentation/message/view/SpoilerOverlayView;", "Landroid/widget/FrameLayout;", "Lcom/discord/chat/presentation/message/view/SpoilerViewOverlay;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/SpoilerOverlayViewBinding;", "configure", "", "label", "", "description", "onReveal", "Lkotlin/Function0;", "getOverlayView", "Landroid/view/View;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SpoilerOverlayView extends FrameLayout implements SpoilerViewOverlay {

    @NotNull
    private final SpoilerOverlayViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SpoilerOverlayView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void configure(@NotNull String label, @NotNull String description, @NotNull Function0<Unit> onReveal) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(onReveal, "onReveal");
        this.binding.label.setText(label);
        this.binding.label.setContentDescription(description);
        FrameLayout overlayContainer = this.binding.overlayContainer;
        Intrinsics.checkNotNullExpressionValue(overlayContainer, "overlayContainer");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(overlayContainer, false, new a6.a(4, onReveal), 1, null);
    }

    @Override // com.discord.chat.presentation.message.view.SpoilerViewOverlay
    @NotNull
    public View getOverlayView() {
        FrameLayout overlayContainer = this.binding.overlayContainer;
        Intrinsics.checkNotNullExpressionValue(overlayContainer, "overlayContainer");
        return overlayContainer;
    }

    public /* synthetic */ SpoilerOverlayView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpoilerOverlayView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        SpoilerOverlayViewBinding spoilerOverlayViewBindingInflate = SpoilerOverlayViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(spoilerOverlayViewBindingInflate, "inflate(...)");
        this.binding = spoilerOverlayViewBindingInflate;
        TextView textView = spoilerOverlayViewBindingInflate.label;
        Intrinsics.checkNotNull(textView);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryBold);
        textView.setBackgroundColor(ColorUtilsKt.getColorCompat(context, R.color.primary_800));
        ViewClippingUtilsKt.clipToCircle(textView);
        spoilerOverlayViewBindingInflate.overlayContainer.setBackgroundColor(ThemeManagerKt.getTheme().getSpoilerHiddenBackground());
    }
}
