package je;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d0 {
    public static Drawable a(Context context, Resources resources, int i7) {
        return resources.getDrawable(i7, context.getTheme());
    }
}
