package we;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import m3.m;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22194a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f22194a) {
            case 0:
                int iW = m.W(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iW) {
                    int i7 = parcel.readInt();
                    if (((char) i7) != 1) {
                        m.S(i7, parcel);
                    } else {
                        intent = (Intent) m.p(parcel, i7, Intent.CREATOR);
                    }
                }
                m.v(iW, parcel);
                return new a(intent);
            default:
                return new f(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.f22194a) {
            case 0:
                return new a[i7];
            default:
                return new f[i7];
        }
    }
}
