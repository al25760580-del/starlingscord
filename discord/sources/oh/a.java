package oh;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f17259a = {R.attr.theme, com.discord.R.attr.theme};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f17260b = {com.discord.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i7, int i10) {
        return b(context, attributeSet, i7, i10, new int[0]);
    }

    public static Context b(Context context, AttributeSet attributeSet, int i7, int i10, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f17260b, i7, i10);
        int[] iArr2 = {typedArrayObtainStyledAttributes.getResourceId(0, 0)};
        typedArrayObtainStyledAttributes.recycle();
        int i11 = iArr2[0];
        boolean z5 = (context instanceof ContextThemeWrapper) && ((ContextThemeWrapper) context).f766a == i11;
        if (i11 == 0 || z5) {
            return context;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i11);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i7, i10);
            for (int i12 = 0; i12 < iArr.length; i12++) {
                iArr3[i12] = typedArrayObtainStyledAttributes2.getResourceId(i12, 0);
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr3[i13];
            if (i14 != 0) {
                contextThemeWrapper.getTheme().applyStyle(i14, true);
            }
        }
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f17259a);
        int resourceId = typedArrayObtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(1, 0);
        typedArrayObtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId, true);
        }
        return contextThemeWrapper;
    }
}
