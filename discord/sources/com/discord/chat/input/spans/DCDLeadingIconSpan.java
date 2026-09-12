package com.discord.chat.input.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0006J4\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0016H\u0016JR\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020&2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012¨\u0006+"}, d2 = {"Lcom/discord/chat/input/spans/DCDLeadingIconSpan;", "Landroid/text/style/ReplacementSpan;", "Lcom/discord/chat/input/spans/DCDInputSpan;", "iconUrl", "", "drawable", "Landroid/graphics/drawable/Drawable;", "sizePx", "", "cornerRadiusPx", "", "leadingSpacingPx", "trailingSpacingPx", "<init>", "(Ljava/lang/String;Landroid/graphics/drawable/Drawable;IFII)V", "getIconUrl", "()Ljava/lang/String;", "getSizePx", "()I", "getCornerRadiusPx", "()F", "fontMetricsInt", "Landroid/graphics/Paint$FontMetricsInt;", "iconSlotWidth", "getIconSlotWidth", "setDrawable", "", "newDrawable", "getSize", "paint", "Landroid/graphics/Paint;", "text", "", ViewProps.START, ViewProps.END, "fm", "draw", "canvas", "Landroid/graphics/Canvas;", "x", ViewProps.TOP, "y", ViewProps.BOTTOM, "chat_input_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDCDLeadingIconSpan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DCDLeadingIconSpan.kt\ncom/discord/chat/input/spans/DCDLeadingIconSpan\n+ 2 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,72:1\n44#2,8:73\n*S KotlinDebug\n*F\n+ 1 DCDLeadingIconSpan.kt\ncom/discord/chat/input/spans/DCDLeadingIconSpan\n*L\n67#1:73,8\n*E\n"})
public final class DCDLeadingIconSpan extends ReplacementSpan implements DCDInputSpan {
    private final float cornerRadiusPx;

    @NotNull
    private Drawable drawable;

    @NotNull
    private final Paint.FontMetricsInt fontMetricsInt;

    @NotNull
    private final String iconUrl;
    private final int leadingSpacingPx;
    private final int sizePx;
    private final int trailingSpacingPx;

    public /* synthetic */ DCDLeadingIconSpan(String str, Drawable drawable, int i7, float f2, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, drawable, i7, f2, (i12 & 16) != 0 ? 0 : i10, (i12 & 32) != 0 ? 0 : i11);
    }

    private final int getIconSlotWidth() {
        return this.drawable.getBounds().width() + this.leadingSpacingPx + this.trailingSpacingPx;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, CharSequence text, int start, int end, float x5, int top, int y5, int bottom, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getFontMetricsInt(this.fontMetricsInt);
        Paint.FontMetricsInt fontMetricsInt = this.fontMetricsInt;
        float fHeight = (((fontMetricsInt.descent + fontMetricsInt.ascent) / 2.0f) + y5) - (this.drawable.getBounds().height() / 2.0f);
        float f2 = x5 + this.leadingSpacingPx;
        int iSave = canvas.save();
        canvas.translate(f2, fHeight);
        try {
            this.drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public final float getCornerRadiusPx() {
        return this.cornerRadiusPx;
    }

    @NotNull
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm2) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (fm2 != null) {
            int iHeight = this.drawable.getBounds().height();
            int i7 = fm2.descent;
            int i10 = fm2.ascent;
            int i11 = iHeight - (i7 - i10);
            if (i11 > 0) {
                int i12 = i11 / 2;
                int i13 = i11 - i12;
                fm2.ascent = i10 - i12;
                fm2.top -= i12;
                fm2.descent = i7 + i13;
                fm2.bottom += i13;
            }
        }
        return getIconSlotWidth();
    }

    public final int getSizePx() {
        return this.sizePx;
    }

    public final void setDrawable(@NotNull Drawable newDrawable) {
        Intrinsics.checkNotNullParameter(newDrawable, "newDrawable");
        this.drawable = newDrawable;
    }

    public DCDLeadingIconSpan(@NotNull String iconUrl, @NotNull Drawable drawable, int i7, float f2, int i10, int i11) {
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.iconUrl = iconUrl;
        this.drawable = drawable;
        this.sizePx = i7;
        this.cornerRadiusPx = f2;
        this.leadingSpacingPx = i10;
        this.trailingSpacingPx = i11;
        this.fontMetricsInt = new Paint.FontMetricsInt();
    }
}
