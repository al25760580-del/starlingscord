package com.discord.span.utilities.spannable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016Jh\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000e\u001a\u00020\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t¨\u0006%"}, d2 = {"Lcom/discord/span/utilities/spannable/QuoteSpan;", "Landroid/text/style/LeadingMarginSpan;", "stripeColor", "", "stripeWidth", "gapWidth", "<init>", "(III)V", "getStripeColor", "()I", "rect", "Landroid/graphics/RectF;", "radius", "", "insetStart", "getInsetStart", "getLeadingMargin", "first", "", "drawLeadingMargin", "", "c", "Landroid/graphics/Canvas;", "p", "Landroid/graphics/Paint;", "x", "dir", ViewProps.TOP, "baseline", ViewProps.BOTTOM, "text", "", ViewProps.START, ViewProps.END, "layout", "Landroid/text/Layout;", "draw", "span_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QuoteSpan implements LeadingMarginSpan {
    private final int insetStart;
    private final float radius;

    @NotNull
    private final RectF rect = new RectF();
    private final int stripeColor;
    private final int stripeWidth;

    public QuoteSpan(int i7, int i10, int i11) {
        this.stripeColor = i7;
        this.stripeWidth = i10;
        this.radius = i10 / 2.0f;
        this.insetStart = i10 + i11;
    }

    private final void draw(Canvas c8, Paint p3) {
        Paint.Style style = p3.getStyle();
        int color = p3.getColor();
        p3.setStyle(Paint.Style.FILL);
        p3.setColor(this.stripeColor);
        RectF rectF = this.rect;
        float f2 = this.radius;
        c8.drawRoundRect(rectF, f2, f2, p3);
        p3.setStyle(style);
        p3.setColor(color);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(@NotNull Canvas c8, @NotNull Paint p3, int x5, int dir, int top, int baseline, int bottom, @NotNull CharSequence text, int start, int end, boolean first, @NotNull Layout layout) {
        Intrinsics.checkNotNullParameter(c8, "c");
        Intrinsics.checkNotNullParameter(p3, "p");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            if (spanned.getSpanStart(this) == start) {
                RectF rectF = this.rect;
                rectF.left = x5;
                rectF.right = (dir * this.stripeWidth) + x5;
                rectF.top = top;
            }
            int spanEnd = spanned.getSpanEnd(this);
            if (spanEnd == end || (spanEnd - 1 == end && text.charAt(end) == '\n')) {
                this.rect.bottom = bottom;
                draw(c8, p3);
            }
        }
    }

    public final int getInsetStart() {
        return this.insetStart;
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean first) {
        return this.insetStart;
    }

    public final int getStripeColor() {
        return this.stripeColor;
    }
}
