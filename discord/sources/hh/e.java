package hh;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public static Typeface a(Configuration configuration, Typeface typeface) {
        int i7;
        if (Build.VERSION.SDK_INT < 31 || (i7 = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i7 == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, yk.a.f(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
