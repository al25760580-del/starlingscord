package ye;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements Parcelable.Creator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f23313b = new q(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23314a;

    public /* synthetic */ q(int i7) {
        this.f23314a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f23314a) {
            case 0:
                int iDataPosition = parcel.dataPosition();
                if (parcel.readInt() != -204102970) {
                    parcel.setDataPosition(iDataPosition - 4);
                    return f.f23290v;
                }
                int iW = m3.m.W(parcel);
                boolean zJ = false;
                g gVar = null;
                while (parcel.dataPosition() < iW) {
                    int i7 = parcel.readInt();
                    char c8 = (char) i7;
                    if (c8 == 1) {
                        gVar = (g) m3.m.p(parcel, i7, g.CREATOR);
                    } else if (c8 != 2) {
                        m3.m.S(i7, parcel);
                    } else {
                        zJ = m3.m.J(i7, parcel);
                    }
                }
                m3.m.v(iW, parcel);
                return new f(gVar, zJ);
            case 1:
                int iW2 = m3.m.W(parcel);
                int iL = 0;
                boolean zJ2 = true;
                int iL2 = 0;
                int iL3 = 0;
                while (parcel.dataPosition() < iW2) {
                    int i10 = parcel.readInt();
                    char c10 = (char) i10;
                    if (c10 == 1) {
                        iL = m3.m.L(i10, parcel);
                    } else if (c10 == 2) {
                        iL2 = m3.m.L(i10, parcel);
                    } else if (c10 == 3) {
                        iL3 = m3.m.L(i10, parcel);
                    } else if (c10 != 4) {
                        m3.m.S(i10, parcel);
                    } else {
                        zJ2 = m3.m.J(i10, parcel);
                    }
                }
                m3.m.v(iW2, parcel);
                return new g(iL, iL2, iL3, zJ2);
            case 2:
                int iW3 = m3.m.W(parcel);
                String strQ = null;
                int iL4 = 0;
                while (parcel.dataPosition() < iW3) {
                    int i11 = parcel.readInt();
                    char c11 = (char) i11;
                    if (c11 == 1) {
                        iL4 = m3.m.L(i11, parcel);
                    } else if (c11 != 2) {
                        m3.m.S(i11, parcel);
                    } else {
                        strQ = m3.m.q(i11, parcel);
                    }
                }
                m3.m.v(iW3, parcel);
                return new Scope(iL4, strQ);
            default:
                int iW4 = m3.m.W(parcel);
                String strQ2 = null;
                xe.b bVar = null;
                int iL5 = 0;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iW4) {
                    int i12 = parcel.readInt();
                    char c12 = (char) i12;
                    if (c12 == 1) {
                        iL5 = m3.m.L(i12, parcel);
                    } else if (c12 == 2) {
                        strQ2 = m3.m.q(i12, parcel);
                    } else if (c12 == 3) {
                        pendingIntent = (PendingIntent) m3.m.p(parcel, i12, PendingIntent.CREATOR);
                    } else if (c12 != 4) {
                        m3.m.S(i12, parcel);
                    } else {
                        bVar = (xe.b) m3.m.p(parcel, i12, xe.b.CREATOR);
                    }
                }
                m3.m.v(iW4, parcel);
                return new Status(iL5, strQ2, pendingIntent, bVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.f23314a) {
            case 0:
                return new f[i7];
            case 1:
                return new g[i7];
            case 2:
                return new Scope[i7];
            default:
                return new Status[i7];
        }
    }
}
