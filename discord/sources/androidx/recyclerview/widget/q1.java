package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class q1 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2676a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2676a) {
            case 0:
                r1 r1Var = new r1();
                r1Var.f2677d = parcel.readInt();
                r1Var.f2678e = parcel.readInt();
                r1Var.f2680v = parcel.readInt() == 1;
                int i7 = parcel.readInt();
                if (i7 > 0) {
                    int[] iArr = new int[i7];
                    r1Var.f2679i = iArr;
                    parcel.readIntArray(iArr);
                }
                return r1Var;
            default:
                s1 s1Var = new s1();
                s1Var.f2682d = parcel.readInt();
                s1Var.f2683e = parcel.readInt();
                int i10 = parcel.readInt();
                s1Var.f2684i = i10;
                if (i10 > 0) {
                    int[] iArr2 = new int[i10];
                    s1Var.f2685v = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i11 = parcel.readInt();
                s1Var.f2686w = i11;
                if (i11 > 0) {
                    int[] iArr3 = new int[i11];
                    s1Var.f2687x = iArr3;
                    parcel.readIntArray(iArr3);
                }
                s1Var.E = parcel.readInt() == 1;
                s1Var.F = parcel.readInt() == 1;
                s1Var.G = parcel.readInt() == 1;
                s1Var.f2688y = parcel.readArrayList(r1.class.getClassLoader());
                return s1Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f2676a) {
            case 0:
                return new r1[i7];
            default:
                return new s1[i7];
        }
    }
}
