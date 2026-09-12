package com.facebook.react.views.text.internal.span;

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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\u0012B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/views/text/internal/span/ShadowStyleSpan;", "Landroid/text/style/CharacterStyle;", "Lcom/facebook/react/views/text/internal/span/ReactSpan;", "dx", "", "dy", "radius", ViewProps.COLOR, "", "<init>", "(FFFI)V", "getColor", "()I", "updateDrawState", "", "textPaint", "Landroid/text/TextPaint;", "getLeftOffset", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShadowStyleSpan extends CharacterStyle implements ReactSpan {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int color;
    private final float dx;
    private final float dy;
    private final float radius;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/views/text/internal/span/ShadowStyleSpan$Companion;", "", "<init>", "()V", "getShadowSpan", "Lcom/facebook/react/views/text/internal/span/ShadowStyleSpan;", "spanned", "Landroid/text/Spanned;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ShadowStyleSpan getShadowSpan(Spanned spanned) {
            if (spanned == null) {
                return null;
            }
            ShadowStyleSpan[] shadowStyleSpanArr = (ShadowStyleSpan[]) spanned.getSpans(0, spanned.length(), ShadowStyleSpan.class);
            Intrinsics.checkNotNull(shadowStyleSpanArr);
            return (ShadowStyleSpan) y.t(shadowStyleSpanArr);
        }

        private Companion() {
        }
    }

    public ShadowStyleSpan(float f2, float f7, float f10, int i7) {
        this.dx = f2;
        this.dy = f7;
        this.radius = f10;
        this.color = i7;
    }

    public static final ShadowStyleSpan getShadowSpan(Spanned spanned) {
        return INSTANCE.getShadowSpan(spanned);
    }

    public final int getColor() {
        return this.color;
    }

    public final float getLeftOffset() {
        return Math.max(0.0f, this.radius - this.dx);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setShadowLayer(this.radius, this.dx, this.dy, this.color);
    }
}
