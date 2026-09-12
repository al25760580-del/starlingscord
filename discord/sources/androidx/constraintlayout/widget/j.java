package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f1430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1431d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f1450g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            if (index == 1) {
                this.f1430c = typedArrayObtainStyledAttributes.getFloat(index, this.f1430c);
            } else if (index == 0) {
                int i10 = typedArrayObtainStyledAttributes.getInt(index, this.f1428a);
                this.f1428a = i10;
                this.f1428a = ConstraintSet.f1335d[i10];
            } else if (index == 4) {
                this.f1429b = typedArrayObtainStyledAttributes.getInt(index, this.f1429b);
            } else if (index == 3) {
                this.f1431d = typedArrayObtainStyledAttributes.getFloat(index, this.f1431d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
