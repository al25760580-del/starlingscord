package com.discord.theme.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import com.discord.theme.DiscordThemeObject;
import com.discord.theme.ThemeManager;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import ho.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lo.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0016\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0003H\u0007\u001a\"\u0010\u0002\u001a\u00020\u0003*\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\bR\u00020\u0006H\u0007\u001a\u0016\u0010\u0002\u001a\u00020\u0003*\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u0003H\u0007\u001a\u001b\u0010\u000b\u001a\u00020\f*\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000f\u001a\u001b\u0010\u000b\u001a\u00020\f*\u00020\u00102\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011\u001a\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0002\u001a\u001a\u0010\u0014\u001a\u00020\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0007\u001a \u0010\u0017\u001a\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0018\u001a\u00020\u00032\b\b\u0001\u0010\u0019\u001a\u00020\u0003H\u0007\u001a(\u0010\u0017\u001a\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0018\u001a\u00020\u00032\b\b\u0001\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u001aH\u0007\u001a8\u0010\u001b\u001a\u00020\u00032\b\b\u0001\u0010\u001c\u001a\u00020\u00032\b\b\u0001\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00162\b\b\u0002\u0010\u001f\u001a\u00020\u00162\b\b\u0002\u0010 \u001a\u00020\u0016H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"hsv", "", "getColorCompat", "", "Landroid/content/Context;", StackTraceHelper.ID_KEY, "Landroid/content/res/Resources;", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/view/View;", "colorRes", "setTintColor", "", "Landroid/widget/ImageView;", "colorInt", "(Landroid/widget/ImageView;Ljava/lang/Integer;)V", "Lcom/facebook/drawee/view/SimpleDraweeView;", "(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/Integer;)V", "applySaturationFactor", ViewProps.COLOR, "argbWithAdjustedAlpha", "alpha", "", "getThemeColor", "lightColorRes", "darkColorRes", "Lcom/discord/theme/DiscordThemeObject;", "interpolateColors", "colorA", "colorB", "t", "minT", "maxT", "theme_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nColorUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorUtils.kt\ncom/discord/theme/utils/ColorUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1#2:133\n*E\n"})
public final class ColorUtilsKt {

    @NotNull
    private static final float[] hsv = new float[3];

    private static final int applySaturationFactor(int i7) {
        float saturationFactor = ThemeManager.INSTANCE.getSaturationFactor();
        if (saturationFactor == 1.0f) {
            return i7;
        }
        float[] fArr = hsv;
        Color.colorToHSV(i7, fArr);
        float fAbs = fArr[1];
        float f2 = fArr[2];
        float f7 = f2 * fAbs;
        float f10 = 2;
        float f11 = f2 - (f7 / f10);
        if (f11 != 0.0f && f11 != 1.0f) {
            fAbs = f7 / (1 - Math.abs((2.0f * f11) - 1.0f));
        }
        float fMin = (Math.min(1.0f, 1.0f - f11) * fAbs * saturationFactor) + f11;
        fArr[1] = fMin != 0.0f ? (1.0f - (f11 / fMin)) * f10 : 0.0f;
        fArr[2] = fMin;
        return Color.HSVToColor(Color.alpha(i7), fArr);
    }

    public static final int argbWithAdjustedAlpha(int i7, float f2) {
        return Color.argb(c.b(Color.alpha(i7) * f2), Color.red(i7), Color.green(i7), Color.blue(i7));
    }

    public static final int getColorCompat(@NotNull Context context, int i7) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return applySaturationFactor(context.getColor(i7));
    }

    public static final int getThemeColor(@NotNull Context context, int i7, int i10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return getThemeColor(context, i7, i10, ThemeManagerKt.getTheme());
    }

    public static final int interpolateColors(int i7, int i10, float f2, float f7, float f10) {
        if (f2 <= f7) {
            return i7;
        }
        if (f2 >= f10) {
            return i10;
        }
        int iRed = Color.red(i7);
        int iGreen = Color.green(i7);
        int iBlue = Color.blue(i7);
        int iAlpha = Color.alpha(i7);
        int iRed2 = Color.red(i10);
        int iGreen2 = Color.green(i10);
        int iBlue2 = Color.blue(i10);
        float f11 = (f2 - f7) / (f10 - f7);
        return Color.argb(j.d((int) (((Color.alpha(i10) - iAlpha) * f11) + iAlpha), 0, 255), j.d((int) (((iRed2 - iRed) * f11) + iRed), 0, 255), j.d((int) (((iGreen2 - iGreen) * f11) + iGreen), 0, 255), j.d((int) (((iBlue2 - iBlue) * f11) + iBlue), 0, 255));
    }

    public static /* synthetic */ int interpolateColors$default(int i7, int i10, float f2, float f7, float f10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            f7 = 0.0f;
        }
        if ((i11 & 16) != 0) {
            f10 = 1.0f;
        }
        return interpolateColors(i7, i10, f2, f7, f10);
    }

    public static final void setTintColor(@NotNull ImageView imageView, Integer num) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        imageView.setImageTintList(num != null ? ColorStateList.valueOf(num.intValue()) : null);
    }

    public static final int getColorCompat(@NotNull Resources resources, int i7, @NotNull Resources.Theme theme) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        Intrinsics.checkNotNullParameter(theme, "theme");
        return applySaturationFactor(resources.getColor(i7, theme));
    }

    public static final int getThemeColor(@NotNull Context context, int i7, int i10, @NotNull DiscordThemeObject theme) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(theme, "theme");
        return getColorCompat(context, theme.getColorRes(i7, i10));
    }

    public static final int getColorCompat(@NotNull View view, int i7) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return getColorCompat(context, i7);
    }

    public static final void setTintColor(@NotNull SimpleDraweeView simpleDraweeView, Integer num) {
        Intrinsics.checkNotNullParameter(simpleDraweeView, "<this>");
        if (num == null) {
            simpleDraweeView.clearColorFilter();
        } else {
            simpleDraweeView.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }
}
