package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f1212a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f2, float f7, boolean z5) {
        if (!z5) {
            return f2;
        }
        return (float) (((1.0d - f1212a) * ((double) f7)) + ((double) f2));
    }

    public static float b(float f2, float f7, boolean z5) {
        if (!z5) {
            return f2 * 1.5f;
        }
        return (float) (((1.0d - f1212a) * ((double) f7)) + ((double) (f2 * 1.5f)));
    }
}
