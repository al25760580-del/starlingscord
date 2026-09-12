package com.discord.image.color_quantizer;

import android.graphics.Color;
import ho.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\r"}, d2 = {"Lcom/discord/image/color_quantizer/ColorUtils;", "", "<init>", "()V", "RGBtoHSL", "", "r", "", "g", "b", "hsl", "", "HSLtoRGB", "color_quantizer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ColorUtils {

    @NotNull
    public static final ColorUtils INSTANCE = new ColorUtils();

    private ColorUtils() {
    }

    public static final int HSLtoRGB(@NotNull float[] hsl) {
        int iB;
        int iB2;
        int iB3;
        int iB4;
        Intrinsics.checkNotNullParameter(hsl, "hsl");
        float f2 = hsl[0];
        float f7 = hsl[1];
        float f10 = hsl[2];
        float fAbs = (1.0f - Math.abs((2 * f10) - 1.0f)) * f7;
        float f11 = f10 - (0.5f * fAbs);
        float fAbs2 = (1.0f - Math.abs(((f2 / 60.0f) % 2.0f) - 1.0f)) * fAbs;
        switch (((int) f2) / 60) {
            case 0:
                iB = c.b((fAbs + f11) * 255.0f);
                iB2 = c.b((fAbs2 + f11) * 255.0f);
                iB3 = c.b(f11 * 255.0f);
                break;
            case 1:
                iB = c.b((fAbs2 + f11) * 255.0f);
                iB2 = c.b((fAbs + f11) * 255.0f);
                iB3 = c.b(f11 * 255.0f);
                break;
            case 2:
                iB = c.b(f11 * 255.0f);
                iB2 = c.b((fAbs + f11) * 255.0f);
                iB3 = c.b((fAbs2 + f11) * 255.0f);
                break;
            case 3:
                iB = c.b(f11 * 255.0f);
                iB4 = c.b((fAbs2 + f11) * 255.0f);
                iB3 = c.b((fAbs + f11) * 255.0f);
                iB2 = iB4;
                break;
            case 4:
                iB = c.b((fAbs2 + f11) * 255.0f);
                iB4 = c.b(f11 * 255.0f);
                iB3 = c.b((fAbs + f11) * 255.0f);
                iB2 = iB4;
                break;
            case 5:
            case 6:
                iB = c.b((fAbs + f11) * 255.0f);
                iB2 = c.b(f11 * 255.0f);
                iB3 = c.b((fAbs2 + f11) * 255.0f);
                break;
            default:
                iB3 = 0;
                iB = 0;
                iB2 = 0;
                break;
        }
        return Color.rgb(Math.max(0, Math.min(255, iB)), Math.max(0, Math.min(255, iB2)), Math.max(0, Math.min(255, iB3)));
    }

    public static final void RGBtoHSL(int r5, int g6, int b10, @NotNull float[] hsl) {
        float f2;
        float fAbs;
        Intrinsics.checkNotNullParameter(hsl, "hsl");
        float f7 = r5 / 255.0f;
        float f10 = g6 / 255.0f;
        float f11 = b10 / 255.0f;
        float fMax = Math.max(f7, Math.max(f10, f11));
        float fMin = Math.min(f7, Math.min(f10, f11));
        float f12 = fMax - fMin;
        float f13 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f2 = 0.0f;
            fAbs = 0.0f;
        } else {
            if (fMax == f7) {
                f2 = ((f10 - f11) / f12) % 6.0f;
            } else {
                f2 = fMax == f10 ? ((f11 - f7) / f12) + 2.0f : ((f7 - f10) / f12) + 4.0f;
            }
            fAbs = f12 / (1.0f - Math.abs((2.0f * f13) - 1.0f));
        }
        hsl[0] = (f2 * 60.0f) % 360.0f;
        hsl[1] = fAbs;
        hsl[2] = f13;
    }
}
