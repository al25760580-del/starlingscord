package com.facebook.react.views.text;

import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import o8.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000J\b\u0010*\u001a\u00020+H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u0012\u0010\u0019\u001a\u00020\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R$\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010\rR\u0011\u0010&\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b'\u0010\rR\u0011\u0010(\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010\r¨\u0006-"}, d2 = {"Lcom/facebook/react/views/text/TextAttributes;", "", "<init>", "()V", ViewProps.ALLOW_FONT_SCALING, "", "getAllowFontScaling", "()Z", "setAllowFontScaling", "(Z)V", ViewProps.FONT_SIZE, "", "getFontSize", "()F", "setFontSize", "(F)V", ViewProps.LINE_HEIGHT, "getLineHeight", "setLineHeight", ViewProps.LETTER_SPACING, "getLetterSpacing", "setLetterSpacing", "heightOfTallestInlineViewOrImage", "getHeightOfTallestInlineViewOrImage", "setHeightOfTallestInlineViewOrImage", "textTransform", "Lcom/facebook/react/views/text/TextTransform;", "applyChild", "child", ViewProps.MAX_FONT_SIZE_MULTIPLIER, "getMaxFontSizeMultiplier", "setMaxFontSizeMultiplier", "effectiveFontSize", "", "getEffectiveFontSize", "()I", "effectiveLineHeight", "getEffectiveLineHeight", "effectiveLetterSpacing", "getEffectiveLetterSpacing", "effectiveMaxFontSizeMultiplier", "getEffectiveMaxFontSizeMultiplier", "toString", "", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextAttributes {
    public static final float DEFAULT_MAX_FONT_SIZE_MULTIPLIER = 0.0f;
    private boolean allowFontScaling = true;
    private float fontSize = Float.NaN;
    private float lineHeight = Float.NaN;
    private float letterSpacing = Float.NaN;
    private float heightOfTallestInlineViewOrImage = Float.NaN;

    @NotNull
    public TextTransform textTransform = TextTransform.UNSET;
    private float maxFontSizeMultiplier = Float.NaN;

    @NotNull
    public final TextAttributes applyChild(@NotNull TextAttributes child) {
        Intrinsics.checkNotNullParameter(child, "child");
        TextAttributes textAttributes = new TextAttributes();
        textAttributes.allowFontScaling = this.allowFontScaling;
        textAttributes.fontSize = !Float.isNaN(child.fontSize) ? child.fontSize : this.fontSize;
        textAttributes.lineHeight = !Float.isNaN(child.lineHeight) ? child.lineHeight : this.lineHeight;
        textAttributes.letterSpacing = !Float.isNaN(child.letterSpacing) ? child.letterSpacing : this.letterSpacing;
        textAttributes.setMaxFontSizeMultiplier(!Float.isNaN(child.maxFontSizeMultiplier) ? child.maxFontSizeMultiplier : this.maxFontSizeMultiplier);
        textAttributes.heightOfTallestInlineViewOrImage = !Float.isNaN(child.heightOfTallestInlineViewOrImage) ? child.heightOfTallestInlineViewOrImage : this.heightOfTallestInlineViewOrImage;
        TextTransform textTransform = child.textTransform;
        if (textTransform == TextTransform.UNSET) {
            textTransform = this.textTransform;
        }
        textAttributes.textTransform = textTransform;
        return textAttributes;
    }

    public final boolean getAllowFontScaling() {
        return this.allowFontScaling;
    }

    public final int getEffectiveFontSize() {
        float f2 = !Float.isNaN(this.fontSize) ? this.fontSize : 14.0f;
        return (int) (this.allowFontScaling ? Math.ceil(PixelUtil.toPixelFromSP(f2, getEffectiveMaxFontSizeMultiplier())) : Math.ceil(PixelUtil.toPixelFromDIP(f2)));
    }

    public final float getEffectiveLetterSpacing() {
        if (Float.isNaN(this.letterSpacing)) {
            return Float.NaN;
        }
        return (this.allowFontScaling ? PixelUtil.toPixelFromSP(this.letterSpacing, getEffectiveMaxFontSizeMultiplier()) : PixelUtil.toPixelFromDIP(this.letterSpacing)) / getEffectiveFontSize();
    }

    public final float getEffectiveLineHeight() {
        if (Float.isNaN(this.lineHeight)) {
            return Float.NaN;
        }
        float pixelFromSP = this.allowFontScaling ? PixelUtil.toPixelFromSP(this.lineHeight, getEffectiveMaxFontSizeMultiplier()) : PixelUtil.toPixelFromDIP(this.lineHeight);
        if (!Float.isNaN(this.heightOfTallestInlineViewOrImage)) {
            float f2 = this.heightOfTallestInlineViewOrImage;
            if (f2 > pixelFromSP) {
                return f2;
            }
        }
        return pixelFromSP;
    }

    public final float getEffectiveMaxFontSizeMultiplier() {
        if (Float.isNaN(this.maxFontSizeMultiplier)) {
            return 0.0f;
        }
        return this.maxFontSizeMultiplier;
    }

    public final float getFontSize() {
        return this.fontSize;
    }

    public final float getHeightOfTallestInlineViewOrImage() {
        return this.heightOfTallestInlineViewOrImage;
    }

    public final float getLetterSpacing() {
        return this.letterSpacing;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    public final float getMaxFontSizeMultiplier() {
        return this.maxFontSizeMultiplier;
    }

    public final void setAllowFontScaling(boolean z5) {
        this.allowFontScaling = z5;
    }

    public final void setFontSize(float f2) {
        this.fontSize = f2;
    }

    public final void setHeightOfTallestInlineViewOrImage(float f2) {
        this.heightOfTallestInlineViewOrImage = f2;
    }

    public final void setLetterSpacing(float f2) {
        this.letterSpacing = f2;
    }

    public final void setLineHeight(float f2) {
        this.lineHeight = f2;
    }

    public final void setMaxFontSizeMultiplier(float f2) {
        if (f2 == 0.0f || f2 >= 1.0f || Float.isNaN(f2)) {
            this.maxFontSizeMultiplier = f2;
        } else {
            a.v(ReactConstants.TAG, "maxFontSizeMultiplier must be NaN, 0, or >= 1");
            this.maxFontSizeMultiplier = Float.NaN;
        }
    }

    @NotNull
    public String toString() {
        return r.b("\n        TextAttributes {\n          getAllowFontScaling(): " + this.allowFontScaling + "\n          getFontSize(): " + this.fontSize + "\n          getEffectiveFontSize(): " + getEffectiveFontSize() + "\n          getHeightOfTallestInlineViewOrImage(): " + this.heightOfTallestInlineViewOrImage + "\n          getLetterSpacing(): " + this.letterSpacing + "\n          getEffectiveLetterSpacing(): " + getEffectiveLetterSpacing() + "\n          getLineHeight(): " + this.lineHeight + "\n          getEffectiveLineHeight(): " + getEffectiveLineHeight() + "\n          getTextTransform(): " + this.textTransform + "\n          getMaxFontSizeMultiplier(): " + this.maxFontSizeMultiplier + "\n          getEffectiveMaxFontSizeMultiplier(): " + getEffectiveMaxFontSizeMultiplier() + "\n        }\n      ");
    }
}
