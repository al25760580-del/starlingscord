package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class c3 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f924a;

    public /* synthetic */ c3(int i7) {
        this.f924a = i7;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f924a) {
            case 0:
                return new d3(parcel, classLoader);
            case 1:
                return new u3(parcel, classLoader);
            case 2:
                return new androidx.drawerlayout.widget.e(parcel, classLoader);
            case 3:
                return new bh.b(parcel, classLoader);
            case 4:
                return new bh.g(parcel, classLoader);
            case 5:
                if (parcel.readParcelable(classLoader) == null) {
                    return d2.b.f7577e;
                }
                throw new IllegalStateException("superState must be null");
            case 6:
                return new eh.o(parcel, classLoader);
            case 7:
                return new lh.c(parcel, classLoader);
            case 8:
                return new mg.d(parcel, classLoader);
            case 9:
                return new nh.z(parcel, classLoader);
            case 10:
                return new rg.c(parcel, classLoader);
            case 11:
                return new sg.b(parcel, classLoader);
            default:
                return new v0.e(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f924a) {
            case 0:
                return new d3[i7];
            case 1:
                return new u3[i7];
            case 2:
                return new androidx.drawerlayout.widget.e[i7];
            case 3:
                return new bh.b[i7];
            case 4:
                return new bh.g[i7];
            case 5:
                return new d2.b[i7];
            case 6:
                return new eh.o[i7];
            case 7:
                return new lh.c[i7];
            case 8:
                return new mg.d[i7];
            case 9:
                return new nh.z[i7];
            case 10:
                return new rg.c[i7];
            case 11:
                return new sg.b[i7];
            default:
                return new v0.e[i7];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f924a) {
            case 0:
                return new d3(parcel, null);
            case 1:
                return new u3(parcel, null);
            case 2:
                return new androidx.drawerlayout.widget.e(parcel, null);
            case 3:
                return new bh.b(parcel, null);
            case 4:
                return new bh.g(parcel, null);
            case 5:
                if (parcel.readParcelable(null) == null) {
                    return d2.b.f7577e;
                }
                throw new IllegalStateException("superState must be null");
            case 6:
                return new eh.o(parcel, null);
            case 7:
                return new lh.c(parcel, null);
            case 8:
                return new mg.d(parcel, null);
            case 9:
                return new nh.z(parcel, null);
            case 10:
                return new rg.c(parcel, null);
            case 11:
                return new sg.b(parcel, null);
            default:
                return new v0.e(parcel, null);
        }
    }
}
