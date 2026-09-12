package hd;

import android.os.Parcel;
import android.os.Parcelable;
import ei.e0;
import ei.r0;
import gc.u0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends j {
    public static final Parcelable.Creator<n> CREATOR = new fd.a(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10581e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f10582i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final e0 f10583v;

    public n(String str, String str2, r0 r0Var) {
        super(str);
        je.b.g(!r0Var.isEmpty());
        this.f10581e = str2;
        e0 e0VarK = e0.k(r0Var);
        this.f10583v = e0VarK;
        this.f10582i = (String) e0VarK.get(0);
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    @Override // cd.b
    public final void b(u0 u0Var) {
        byte b10;
        String str = this.f10570d;
        str.getClass();
        switch (str) {
            case "TAL":
                b10 = 0;
                break;
            case "TCM":
                b10 = 1;
                break;
            case "TDA":
                b10 = 2;
                break;
            case "TP1":
                b10 = 3;
                break;
            case "TP2":
                b10 = 4;
                break;
            case "TP3":
                b10 = 5;
                break;
            case "TRK":
                b10 = 6;
                break;
            case "TT2":
                b10 = 7;
                break;
            case "TXT":
                b10 = 8;
                break;
            case "TYE":
                b10 = 9;
                break;
            case "TALB":
                b10 = 10;
                break;
            case "TCOM":
                b10 = 11;
                break;
            case "TDAT":
                b10 = 12;
                break;
            case "TDRC":
                b10 = 13;
                break;
            case "TDRL":
                b10 = 14;
                break;
            case "TEXT":
                b10 = 15;
                break;
            case "TIT2":
                b10 = 16;
                break;
            case "TPE1":
                b10 = 17;
                break;
            case "TPE2":
                b10 = 18;
                break;
            case "TPE3":
                b10 = 19;
                break;
            case "TRCK":
                b10 = 20;
                break;
            case "TYER":
                b10 = 21;
                break;
            default:
                b10 = -1;
                break;
        }
        e0 e0Var = this.f10583v;
        try {
            switch (b10) {
                case 0:
                case 10:
                    u0Var.f9864c = (CharSequence) e0Var.get(0);
                    break;
                case 1:
                case 11:
                    u0Var.f9884y = (CharSequence) e0Var.get(0);
                    break;
                case 2:
                case 12:
                    String str2 = (String) e0Var.get(0);
                    int i7 = Integer.parseInt(str2.substring(2, 4));
                    int i10 = Integer.parseInt(str2.substring(0, 2));
                    u0Var.f9878s = Integer.valueOf(i7);
                    u0Var.f9879t = Integer.valueOf(i10);
                    break;
                case 3:
                case 17:
                    u0Var.f9863b = (CharSequence) e0Var.get(0);
                    break;
                case 4:
                case 18:
                    u0Var.f9865d = (CharSequence) e0Var.get(0);
                    break;
                case 5:
                case 19:
                    u0Var.f9885z = (CharSequence) e0Var.get(0);
                    break;
                case 6:
                case 20:
                    String str3 = (String) e0Var.get(0);
                    int i11 = je.e0.f13788a;
                    String[] strArrSplit = str3.split("/", -1);
                    int i12 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    u0Var.f9872m = Integer.valueOf(i12);
                    u0Var.f9873n = numValueOf;
                    break;
                case 7:
                case 16:
                    u0Var.f9862a = (CharSequence) e0Var.get(0);
                    break;
                case 8:
                case 15:
                    u0Var.f9883x = (CharSequence) e0Var.get(0);
                    break;
                case 9:
                case 21:
                    u0Var.f9877r = Integer.valueOf(Integer.parseInt((String) e0Var.get(0)));
                    break;
                case 13:
                    ArrayList arrayListA = a((String) e0Var.get(0));
                    int size = arrayListA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                u0Var.f9879t = (Integer) arrayListA.get(2);
                            }
                        }
                        u0Var.f9878s = (Integer) arrayListA.get(1);
                    }
                    u0Var.f9877r = (Integer) arrayListA.get(0);
                    break;
                case 14:
                    ArrayList arrayListA2 = a((String) e0Var.get(0));
                    int size2 = arrayListA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                u0Var.f9882w = (Integer) arrayListA2.get(2);
                            }
                        }
                        u0Var.f9881v = (Integer) arrayListA2.get(1);
                    }
                    u0Var.f9880u = (Integer) arrayListA2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (je.e0.a(this.f10570d, nVar.f10570d) && je.e0.a(this.f10581e, nVar.f10581e) && this.f10583v.equals(nVar.f10583v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iD = a3.e.d(527, 31, this.f10570d);
        String str = this.f10581e;
        return this.f10583v.hashCode() + ((iD + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // hd.j
    public final String toString() {
        return this.f10570d + ": description=" + this.f10581e + ": values=" + this.f10583v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10570d);
        parcel.writeString(this.f10581e);
        parcel.writeStringArray((String[]) this.f10583v.toArray(new String[0]));
    }
}
