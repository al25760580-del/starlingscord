package com.discord.span.utilities.spannable;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0013\b\u0016\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\bJ8\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/discord/span/utilities/spannable/VerticalPaddingSpan;", "Landroid/text/style/LineHeightSpan;", ViewProps.TOP, "", ViewProps.BOTTOM, "<init>", "(II)V", ViewProps.PADDING, "(I)V", "getTop", "()I", "getBottom", "chooseHeight", "", "text", "", ViewProps.START, ViewProps.END, "spanstartv", "v", "fontMetrics", "Landroid/graphics/Paint$FontMetricsInt;", "span_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerticalPaddingSpan implements LineHeightSpan {
    private final int bottom;
    private final int top;

    public VerticalPaddingSpan(int i7, int i10) {
        this.top = i7;
        this.bottom = i10;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(@NotNull CharSequence text, int start, int end, int spanstartv, int v6, @NotNull Paint.FontMetricsInt fontMetrics) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fontMetrics, "fontMetrics");
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            if (spanned.getSpanStart(this) == start) {
                int i7 = fontMetrics.top;
                int i10 = this.top;
                fontMetrics.top = i7 - i10;
                fontMetrics.ascent -= i10;
            }
            if (spanned.getSpanEnd(this) == end) {
                int i11 = fontMetrics.bottom;
                int i12 = this.bottom;
                fontMetrics.bottom = i11 + i12;
                fontMetrics.descent += i12;
            }
        }
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getTop() {
        return this.top;
    }

    public VerticalPaddingSpan(int i7) {
        this(i7, i7);
    }
}
