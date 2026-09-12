package com.facebook.react.views.text.internal.span;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.rnlineargradient.LinearGradientManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B7\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/views/text/internal/span/LinearGradientSpan;", "Landroid/text/style/CharacterStyle;", "Lcom/facebook/react/views/text/internal/span/ReactSpan;", "Landroid/text/style/UpdateAppearance;", ViewProps.START, "", LinearGradientManager.PROP_COLORS, "", LinearGradientManager.PROP_ANGLE, "gradientLength", "gradientMode", "", "<init>", "(F[IFFLjava/lang/String;)V", "updateDrawState", "", "tp", "Landroid/text/TextPaint;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LinearGradientSpan extends CharacterStyle implements ReactSpan, UpdateAppearance {
    private final float angle;

    @NotNull
    private final int[] colors;
    private final float gradientLength;
    private final String gradientMode;
    private final float start;

    public /* synthetic */ LinearGradientSpan(float f2, int[] iArr, float f7, float f10, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, iArr, (i7 & 4) != 0 ? 0.0f : f7, (i7 & 8) != 0 ? Float.NaN : f10, (i7 & 16) != 0 ? "mirror" : str);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint tp2) {
        int[] iArr;
        Intrinsics.checkNotNullParameter(tp2, "tp");
        Shader.TileMode tileMode = Intrinsics.areEqual(this.gradientMode, InterpolationAnimatedNode.EXTRAPOLATE_TYPE_CLAMP) ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
        tp2.setColor(this.colors[0]);
        double radians = Math.toRadians(this.angle);
        float fDpToPx = (Float.isNaN(this.gradientLength) ? 100.0f : PixelUtil.INSTANCE.dpToPx(this.gradientLength)) / 2.0f;
        float fCos = (float) Math.cos(radians);
        float fSin = (float) Math.sin(radians);
        Shader.TileMode tileMode2 = Shader.TileMode.MIRROR;
        float f2 = tileMode == tileMode2 ? this.start + fDpToPx : fDpToPx;
        float f7 = fCos * fDpToPx;
        float f10 = f2 - f7;
        float f11 = fSin * fDpToPx;
        float f12 = fDpToPx - f11;
        float f13 = f7 + f2;
        float f14 = fDpToPx + f11;
        int[] iArr2 = this.colors;
        if (tileMode == tileMode2) {
            iArr = new int[iArr2.length + 1];
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            int[] iArr3 = this.colors;
            iArr[iArr3.length] = iArr3[0];
        } else {
            iArr = iArr2;
        }
        tp2.setShader(new LinearGradient(f10, f12, f13, f14, iArr, (float[]) null, tileMode));
    }

    public LinearGradientSpan(float f2, @NotNull int[] colors, float f7, float f10, String str) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.start = f2;
        this.colors = colors;
        this.angle = f7;
        this.gradientLength = f10;
        this.gradientMode = str;
    }
}
