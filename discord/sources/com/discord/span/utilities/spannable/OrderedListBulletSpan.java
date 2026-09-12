package com.discord.span.utilities.spannable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJh\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010!\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/discord/span/utilities/spannable/OrderedListBulletSpan;", "Landroid/text/style/LeadingMarginSpan;", "listItemIndex", "", "trailingMargin", "", "largestListItemIndex", "paint", "Landroid/graphics/Paint;", ViewProps.COLOR, "<init>", "(JIJLandroid/graphics/Paint;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "largestBulletContentWidth", "", "drawLeadingMargin", "", "canvas", "Landroid/graphics/Canvas;", "x", "dir", ViewProps.TOP, "baseline", ViewProps.BOTTOM, "text", "", ViewProps.START, ViewProps.END, "first", "", "layout", "Landroid/text/Layout;", "getLeadingMargin", "calculateBulletContentWidth", "bulletContent", "", "span_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OrderedListBulletSpan implements LeadingMarginSpan {
    private final Integer color;
    private final float largestBulletContentWidth;
    private final long listItemIndex;
    private final int trailingMargin;

    public OrderedListBulletSpan(long j, int i7, long j5, @NotNull Paint paint, Integer num) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.listItemIndex = j;
        this.trailingMargin = i7;
        this.color = num;
        this.largestBulletContentWidth = calculateBulletContentWidth(paint, j5 + ".");
    }

    private final float calculateBulletContentWidth(Paint paint, String bulletContent) {
        Paint paint2 = new Paint(paint);
        paint2.setFontFeatureSettings("tnum");
        return paint2.measureText(bulletContent);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(@NotNull Canvas canvas, @NotNull Paint paint, int x5, int dir, int top, int baseline, int bottom, @NotNull CharSequence text, int start, int end, boolean first, @NotNull Layout layout) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (((Spanned) text).getSpanStart(this) == start) {
            String fontFeatureSettings = paint.getFontFeatureSettings();
            Integer numValueOf = this.color != null ? Integer.valueOf(paint.getColor()) : null;
            paint.setFontFeatureSettings("tnum");
            Integer num = this.color;
            if (num != null) {
                paint.setColor(num.intValue());
            }
            String str = this.listItemIndex + ".";
            canvas.drawText(str, x5 + (this.largestBulletContentWidth - calculateBulletContentWidth(paint, str)), baseline, paint);
            paint.setFontFeatureSettings(fontFeatureSettings);
            if (numValueOf != null) {
                paint.setColor(numValueOf.intValue());
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean first) {
        return ((int) this.largestBulletContentWidth) + this.trailingMargin;
    }

    public /* synthetic */ OrderedListBulletSpan(long j, int i7, long j5, Paint paint, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i7, j5, paint, (i10 & 16) != 0 ? null : num);
    }
}
