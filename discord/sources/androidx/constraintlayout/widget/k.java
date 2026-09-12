package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f1432n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f1433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f1434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f1435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f1437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f1438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f1439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f1441i;
    public float j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1442l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f1443m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1432n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f1452i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            switch (f1432n.get(index)) {
                case 1:
                    this.f1433a = typedArrayObtainStyledAttributes.getFloat(index, this.f1433a);
                    break;
                case 2:
                    this.f1434b = typedArrayObtainStyledAttributes.getFloat(index, this.f1434b);
                    break;
                case 3:
                    this.f1435c = typedArrayObtainStyledAttributes.getFloat(index, this.f1435c);
                    break;
                case 4:
                    this.f1436d = typedArrayObtainStyledAttributes.getFloat(index, this.f1436d);
                    break;
                case 5:
                    this.f1437e = typedArrayObtainStyledAttributes.getFloat(index, this.f1437e);
                    break;
                case 6:
                    this.f1438f = typedArrayObtainStyledAttributes.getDimension(index, this.f1438f);
                    break;
                case 7:
                    this.f1439g = typedArrayObtainStyledAttributes.getDimension(index, this.f1439g);
                    break;
                case 8:
                    this.f1441i = typedArrayObtainStyledAttributes.getDimension(index, this.f1441i);
                    break;
                case 9:
                    this.j = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                    break;
                case 10:
                    this.k = typedArrayObtainStyledAttributes.getDimension(index, this.k);
                    break;
                case 11:
                    this.f1442l = true;
                    this.f1443m = typedArrayObtainStyledAttributes.getDimension(index, this.f1443m);
                    break;
                case 12:
                    this.f1440h = ConstraintSet.h(typedArrayObtainStyledAttributes, index, this.f1440h);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
