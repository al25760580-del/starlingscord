package com.discord.misc.utilities.size;

import android.content.res.Resources;
import android.util.TypedValue;
import ho.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0002*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\u0005\u001a\u00020\u0002*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b\"\u0015\u0010\u0005\u001a\u00020\u0002*\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\n\"\u001b\u0010\u000b\u001a\u00020\u0002*\u00020\u00028F¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u000f"}, d2 = {"pxToDp", "", "", "getPxToDp", "(I)F", "dpToPx", "getDpToPx", "(I)I", "(F)I", "", "(D)I", "spToPx", "getSpToPx$annotations", "(I)V", "getSpToPx", "misc_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SizeUtilsKt {
    public static final int getDpToPx(int i7) {
        return getDpToPx(i7);
    }

    public static final float getPxToDp(int i7) {
        return i7 / Resources.getSystem().getDisplayMetrics().density;
    }

    public static final int getSpToPx(int i7) {
        return c.b(TypedValue.applyDimension(2, i7, Resources.getSystem().getDisplayMetrics()));
    }

    public static /* synthetic */ void getSpToPx$annotations(int i7) {
    }

    public static final int getDpToPx(float f2) {
        return c.b(f2 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final int getDpToPx(double d6) {
        return c.a(d6 * ((double) Resources.getSystem().getDisplayMetrics().density));
    }
}
