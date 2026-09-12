package com.facebook.react.views.text.internal.span;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0004J\u0016\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/views/text/internal/span/StrokeStyleSpan;", "Landroid/text/style/CharacterStyle;", "Lcom/facebook/react/views/text/internal/span/ReactSpan;", "width", "", ViewProps.COLOR, "", "<init>", "(FI)V", "getWidth", "()F", "getColor", "()I", "updateDrawState", "", "textPaint", "Landroid/text/TextPaint;", "hasStroke", "", "getLeftOffset", "draw", "paint", "Landroid/graphics/Paint;", "drawCallback", "Ljava/lang/Runnable;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StrokeStyleSpan extends CharacterStyle implements ReactSpan {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int color;
    private final float width;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/views/text/internal/span/StrokeStyleSpan$Companion;", "", "<init>", "()V", "getStrokeSpan", "Lcom/facebook/react/views/text/internal/span/StrokeStyleSpan;", "spanned", "Landroid/text/Spanned;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StrokeStyleSpan getStrokeSpan(Spanned spanned) {
            if (spanned == null) {
                return null;
            }
            StrokeStyleSpan[] strokeStyleSpanArr = (StrokeStyleSpan[]) spanned.getSpans(0, spanned.length(), StrokeStyleSpan.class);
            Intrinsics.checkNotNull(strokeStyleSpanArr);
            return (StrokeStyleSpan) y.t(strokeStyleSpanArr);
        }

        private Companion() {
        }
    }

    public StrokeStyleSpan(float f2, int i7) {
        this.width = f2;
        this.color = i7;
    }

    public static final StrokeStyleSpan getStrokeSpan(Spanned spanned) {
        return INSTANCE.getStrokeSpan(spanned);
    }

    public final boolean draw(@NotNull Paint paint, @NotNull Runnable drawCallback) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(drawCallback, "drawCallback");
        if (!hasStroke()) {
            return false;
        }
        Paint.Style style = paint.getStyle();
        float strokeWidth = paint.getStrokeWidth();
        Paint.Join strokeJoin = paint.getStrokeJoin();
        Paint.Cap strokeCap = paint.getStrokeCap();
        int color = paint.getColor();
        ColorFilter colorFilter = paint.getColorFilter();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.width);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColorFilter(new PorterDuffColorFilter(this.color, PorterDuff.Mode.SRC_IN));
        drawCallback.run();
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(0.0f);
        paint.setColor(color);
        paint.setColorFilter(colorFilter);
        drawCallback.run();
        paint.setStyle(style);
        paint.setStrokeWidth(strokeWidth);
        paint.setStrokeJoin(strokeJoin);
        paint.setStrokeCap(strokeCap);
        paint.setColor(color);
        paint.setColorFilter(colorFilter);
        return true;
    }

    public final int getColor() {
        return this.color;
    }

    public final float getLeftOffset() {
        if (hasStroke()) {
            return this.width / 2.0f;
        }
        return 0.0f;
    }

    public final float getWidth() {
        return this.width;
    }

    public final boolean hasStroke() {
        return this.width > 0.0f && this.color != 0;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
    }
}
