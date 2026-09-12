package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.discord.SetTextSizeSpKt;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discord/chat/presentation/message/view/BlockedApplicationEmbedView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "headerText", "Landroid/widget/TextView;", "bodyText", "configure", "", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BlockedApplicationEmbedView extends LinearLayout {

    @NotNull
    private final TextView bodyText;

    @NotNull
    private final TextView headerText;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlockedApplicationEmbedView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void configure(String headerText, String bodyText) {
        this.headerText.setText(headerText);
        this.bodyText.setText(bodyText);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlockedApplicationEmbedView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BlockedApplicationEmbedView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockedApplicationEmbedView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        TextView textView = new TextView(context);
        this.headerText = textView;
        TextView textView2 = new TextView(context);
        this.bodyText = textView2;
        setOrientation(1);
        setPadding(SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(12));
        ViewBackgroundUtilsKt.setBackgroundRectangle(this, ThemeManagerKt.getTheme().getBackgroundSurfaceHighest(), SizeUtilsKt.getDpToPx(12), Integer.valueOf(ThemeManagerKt.getTheme().getBorderSubtle()), SizeUtilsKt.getDpToPx(1));
        SetTextSizeSpKt.setTextSizeSp(textView, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimarySemibold);
        textView.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        textView.setMaxLines(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = SizeUtilsKt.getDpToPx(4);
        Unit unit = Unit.f14616a;
        addView(textView, layoutParams);
        SetTextSizeSpKt.setTextSizeSp(textView2, 14.0f);
        DiscordFontUtilsKt.setDiscordFont(textView2, DiscordFont.PrimaryNormal);
        textView2.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        addView(textView2, new LinearLayout.LayoutParams(-1, -2));
    }
}
