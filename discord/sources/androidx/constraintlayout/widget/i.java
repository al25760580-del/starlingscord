package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final SparseIntArray j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f1423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f1424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f1426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1427i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f1449f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            switch (j.get(index)) {
                case 1:
                    this.f1423e = typedArrayObtainStyledAttributes.getFloat(index, this.f1423e);
                    break;
                case 2:
                    this.f1421c = typedArrayObtainStyledAttributes.getInt(index, this.f1421c);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = q0.a.f18576a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f1419a = ConstraintSet.h(typedArrayObtainStyledAttributes, index, this.f1419a);
                    break;
                case 6:
                    this.f1420b = typedArrayObtainStyledAttributes.getInteger(index, this.f1420b);
                    break;
                case 7:
                    this.f1422d = typedArrayObtainStyledAttributes.getFloat(index, this.f1422d);
                    break;
                case 8:
                    this.f1425g = typedArrayObtainStyledAttributes.getInteger(index, this.f1425g);
                    break;
                case 9:
                    this.f1424f = typedArrayObtainStyledAttributes.getFloat(index, this.f1424f);
                    break;
                case 10:
                    int i10 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i10 == 1) {
                        this.f1427i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    } else if (i10 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f1426h = string;
                        if (string.indexOf("/") > 0) {
                            this.f1427i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.f1427i);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
