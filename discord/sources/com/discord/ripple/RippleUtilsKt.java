package com.discord.ripple;

import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.view.View;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000b"}, d2 = {"addRipple", "", "Landroid/view/View;", "foreground", "", "cornerRadius", "", "addCircleRipple", "setDrawableRipple", "maskShape", "Landroid/graphics/drawable/shapes/Shape;", "ripple_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RippleUtilsKt {
    public static final void addCircleRipple(@NotNull View view, boolean z5) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        setDrawableRipple(view, z5, new OvalShape());
    }

    public static /* synthetic */ void addCircleRipple$default(View view, boolean z5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z5 = false;
        }
        addCircleRipple(view, z5);
    }

    public static final void addRipple(@NotNull View view, boolean z5, int i7) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        float f2 = i7;
        float[] fArr = new float[8];
        for (int i10 = 0; i10 < 8; i10++) {
            fArr[i10] = f2;
        }
        setDrawableRipple(view, z5, new RoundRectShape(fArr, null, null));
    }

    public static /* synthetic */ void addRipple$default(View view, boolean z5, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z5 = false;
        }
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        addRipple(view, z5, i7);
    }

    private static final void setDrawableRipple(View view, boolean z5, Shape shape) {
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(ThemeManagerKt.getTheme().getMobileAndroidButtonBackgroundRipple()), null, new ShapeDrawable(shape));
        if (z5) {
            view.setForeground(rippleDrawable);
        } else {
            view.setBackground(rippleDrawable);
        }
    }
}
