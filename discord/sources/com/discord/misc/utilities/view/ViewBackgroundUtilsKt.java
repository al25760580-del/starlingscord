package com.discord.misc.utilities.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.PaintDrawable;
import android.view.View;
import com.discord.misc.utilities.drawable.GetDrawableCompatKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import com.rnlineargradient.LinearGradientManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0002\u0010\b\u001aW\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0002\u0010\u000e\u001a=\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0002\u0010\u0013\u001a]\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0002\u0010\u0014\u001a\u001e\u0010\u0015\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a\u0014\u0010\u0016\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0004¨\u0006\u0018"}, d2 = {"setBackgroundRectangle", "", "Landroid/view/View;", ViewProps.COLOR, "", "radiusPx", "strokeColor", "strokeWidth", "(Landroid/view/View;IILjava/lang/Integer;I)V", "topStartRadius", "", "topEndRadius", "bottomEndRadius", "bottomStartRadius", "(Landroid/view/View;IFFFFLjava/lang/Integer;I)V", LinearGradientManager.PROP_COLORS, "", "gradientOrientation", "Landroid/graphics/drawable/GradientDrawable$Orientation;", "(Landroid/view/View;[ILandroid/graphics/drawable/GradientDrawable$Orientation;ILjava/lang/Integer;I)V", "(Landroid/view/View;[ILandroid/graphics/drawable/GradientDrawable$Orientation;FFFFLjava/lang/Integer;I)V", "setBackgroundOval", "setBackgroundDrawableRes", "drawableResId", "misc_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ViewBackgroundUtilsKt {
    public static final void setBackgroundDrawableRes(@NotNull View view, int i7) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setBackground(GetDrawableCompatKt.getDrawableCompat(context, i7));
    }

    public static final void setBackgroundOval(@NotNull View view, int i7, int i10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i7);
        gradientDrawable.setCornerRadius(i10);
        view.setBackground(gradientDrawable);
    }

    public static /* synthetic */ void setBackgroundOval$default(View view, int i7, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        setBackgroundOval(view, i7, i10);
    }

    public static final void setBackgroundRectangle(@NotNull View view, int i7, int i10, Integer num, int i11) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (num != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setStroke(i11, num.intValue());
            gradientDrawable.setCornerRadius(i10);
            gradientDrawable.setColor(i7);
            drawable = gradientDrawable;
        } else {
            PaintDrawable paintDrawable = new PaintDrawable(i7);
            paintDrawable.setCornerRadius(i10);
            drawable = paintDrawable;
        }
        view.setBackground(drawable);
    }

    public static /* synthetic */ void setBackgroundRectangle$default(View view, int i7, int i10, Integer num, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        setBackgroundRectangle(view, i7, i10, num, i11);
    }

    public static /* synthetic */ void setBackgroundRectangle$default(View view, int i7, float f2, float f7, float f10, float f11, Integer num, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f7 = 0.0f;
        }
        if ((i11 & 8) != 0) {
            f10 = 0.0f;
        }
        if ((i11 & 16) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 32) != 0) {
            num = null;
        }
        if ((i11 & 64) != 0) {
            i10 = 0;
        }
        setBackgroundRectangle(view, i7, f2, f7, f10, f11, num, i10);
    }

    public static /* synthetic */ void setBackgroundRectangle$default(View view, int[] iArr, GradientDrawable.Orientation orientation, int i7, Integer num, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            num = null;
        }
        Integer num2 = num;
        if ((i11 & 16) != 0) {
            i10 = 0;
        }
        setBackgroundRectangle(view, iArr, orientation, i7, num2, i10);
    }

    public static /* synthetic */ void setBackgroundRectangle$default(View view, int[] iArr, GradientDrawable.Orientation orientation, float f2, float f7, float f10, float f11, Integer num, int i7, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f2 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            f7 = 0.0f;
        }
        if ((i10 & 16) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 32) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 64) != 0) {
            num = null;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            i7 = 0;
        }
        setBackgroundRectangle(view, iArr, orientation, f2, f7, f10, f11, num, i7);
    }

    public static final void setBackgroundRectangle(@NotNull View view, int i7, float f2, float f7, float f10, float f11, Integer num, int i10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        if (num != null) {
            gradientDrawable.setStroke(i10, num.intValue());
        }
        gradientDrawable.setCornerRadii(new float[]{f2, f2, f7, f7, f10, f10, f11, f11});
        gradientDrawable.setColor(i7);
        view.setBackground(gradientDrawable);
    }

    public static final void setBackgroundRectangle(@NotNull View view, @NotNull int[] colors, @NotNull GradientDrawable.Orientation gradientOrientation, int i7, Integer num, int i10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(gradientOrientation, "gradientOrientation");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        if (num != null) {
            gradientDrawable.setStroke(i10, num.intValue());
        }
        gradientDrawable.setCornerRadius(i7);
        gradientDrawable.setColors(colors);
        gradientDrawable.setOrientation(gradientOrientation);
        view.setBackground(gradientDrawable);
    }

    public static final void setBackgroundRectangle(@NotNull View view, @NotNull int[] colors, @NotNull GradientDrawable.Orientation gradientOrientation, float f2, float f7, float f10, float f11, Integer num, int i7) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(gradientOrientation, "gradientOrientation");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        if (num != null) {
            gradientDrawable.setStroke(i7, num.intValue());
        }
        gradientDrawable.setCornerRadii(new float[]{f2, f2, f7, f7, f10, f10, f11, f11});
        gradientDrawable.setColors(colors);
        gradientDrawable.setOrientation(gradientOrientation);
        view.setBackground(gradientDrawable);
    }
}
