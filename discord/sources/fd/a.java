package fd;

import af.t;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import ei.e0;
import gg.e;
import gg.f;
import hd.d;
import hd.k;
import hd.l;
import hd.n;
import hd.o;
import java.util.ArrayList;
import jd.i;
import jd.j;
import m3.m;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9054a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f9054a) {
            case 0:
                return new b(parcel);
            case 1:
                return new c(parcel);
            case 2:
                return new gd.b(parcel);
            case 3:
                return new gd.c(parcel);
            case 4:
                int iW = m.W(parcel);
                Intent intent = null;
                int iL = 0;
                int iL2 = 0;
                while (parcel.dataPosition() < iW) {
                    int i7 = parcel.readInt();
                    char c8 = (char) i7;
                    if (c8 == 1) {
                        iL = m.L(i7, parcel);
                    } else if (c8 == 2) {
                        iL2 = m.L(i7, parcel);
                    } else if (c8 != 3) {
                        m.S(i7, parcel);
                    } else {
                        intent = (Intent) m.p(parcel, i7, Intent.CREATOR);
                    }
                }
                m.v(iW, parcel);
                return new gg.b(iL, iL2, intent);
            case 5:
                int iW2 = m.W(parcel);
                ArrayList arrayListR = null;
                String strQ = null;
                while (parcel.dataPosition() < iW2) {
                    int i10 = parcel.readInt();
                    char c10 = (char) i10;
                    if (c10 == 1) {
                        arrayListR = m.r(i10, parcel);
                    } else if (c10 != 2) {
                        m.S(i10, parcel);
                    } else {
                        strQ = m.q(i10, parcel);
                    }
                }
                m.v(iW2, parcel);
                return new e(strQ, arrayListR);
            case 6:
                int iW3 = m.W(parcel);
                xe.b bVar = null;
                int iL3 = 0;
                t tVar = null;
                while (parcel.dataPosition() < iW3) {
                    int i11 = parcel.readInt();
                    char c11 = (char) i11;
                    if (c11 == 1) {
                        iL3 = m.L(i11, parcel);
                    } else if (c11 == 2) {
                        bVar = (xe.b) m.p(parcel, i11, xe.b.CREATOR);
                    } else if (c11 != 3) {
                        m.S(i11, parcel);
                    } else {
                        tVar = (t) m.p(parcel, i11, t.CREATOR);
                    }
                }
                m.v(iW3, parcel);
                return new f(iL3, bVar, tVar);
            case 7:
                return new hd.a(parcel);
            case 8:
                return new hd.b(parcel);
            case 9:
                return new hd.c(parcel);
            case 10:
                return new d(parcel);
            case 11:
                return new hd.e(parcel);
            case 12:
                return new hd.f(parcel);
            case 13:
                return new k(parcel);
            case 14:
                return new l(parcel);
            case 15:
                return new hd.m(parcel);
            case 16:
                String string = parcel.readString();
                string.getClass();
                String string2 = parcel.readString();
                String[] strArrCreateStringArray = parcel.createStringArray();
                strArrCreateStringArray.getClass();
                return new n(string, string2, e0.m(strArrCreateStringArray));
            case 17:
                return new o(parcel);
            case 18:
                return new id.a(parcel);
            case 19:
                return new id.b(parcel);
            case 20:
                ArrayList arrayList = new ArrayList();
                parcel.readList(arrayList, id.c.class.getClassLoader());
                return new id.d(arrayList);
            case 21:
                return new id.c(parcel.readInt(), parcel.readLong(), parcel.readLong());
            case 22:
                return new id.e(parcel);
            case 23:
                return new jc.a(parcel);
            case 24:
                return new jc.b(parcel);
            case 25:
                return new jd.a(parcel);
            case 26:
                return new jd.e(parcel);
            case 27:
                return new jd.f();
            case 28:
                return new i(parcel);
            default:
                return new j(parcel.readLong(), parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f9054a) {
            case 0:
                return new b[i7];
            case 1:
                return new c[i7];
            case 2:
                return new gd.b[i7];
            case 3:
                return new gd.c[i7];
            case 4:
                return new gg.b[i7];
            case 5:
                return new e[i7];
            case 6:
                return new f[i7];
            case 7:
                return new hd.a[i7];
            case 8:
                return new hd.b[i7];
            case 9:
                return new hd.c[i7];
            case 10:
                return new d[i7];
            case 11:
                return new hd.e[i7];
            case 12:
                return new hd.f[i7];
            case 13:
                return new k[i7];
            case 14:
                return new l[i7];
            case 15:
                return new hd.m[i7];
            case 16:
                return new n[i7];
            case 17:
                return new o[i7];
            case 18:
                return new id.a[i7];
            case 19:
                return new id.b[i7];
            case 20:
                return new id.d[i7];
            case 21:
                return new id.c[i7];
            case 22:
                return new id.e[i7];
            case 23:
                return new jc.a[i7];
            case 24:
                return new jc.b[i7];
            case 25:
                return new jd.a[i7];
            case 26:
                return new jd.e[i7];
            case 27:
                return new jd.f[i7];
            case 28:
                return new i[i7];
            default:
                return new j[i7];
        }
    }
}
