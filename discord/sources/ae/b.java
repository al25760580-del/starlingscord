package ae;

import android.text.TextUtils;
import m3.m;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f365f;

    public static b b(String str) {
        je.b.g(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i7 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < strArrSplit.length; i13++) {
            String strT = m.T(strArrSplit[i13].trim());
            strT.getClass();
            switch (strT) {
                case "end":
                    i10 = i13;
                    break;
                case "text":
                    i12 = i13;
                    break;
                case "start":
                    i7 = i13;
                    break;
                case "style":
                    i11 = i13;
                    break;
            }
        }
        if (i7 == -1 || i10 == -1 || i12 == -1) {
            return null;
        }
        return new b(i7, i10, i11, i12, strArrSplit.length);
    }

    public boolean a() {
        int i7;
        int i10;
        int i11;
        int i12 = this.f361b;
        int i13 = 2;
        if ((i12 & 7) != 0) {
            int i14 = this.f364e;
            int i15 = this.f362c;
            if (i14 > i15) {
                i11 = 1;
            } else {
                i11 = i14 == i15 ? 2 : 4;
            }
            if ((i11 & i12) == 0) {
                return false;
            }
        }
        if ((i12 & 112) != 0) {
            int i16 = this.f364e;
            int i17 = this.f363d;
            if (i16 > i17) {
                i10 = 1;
            } else {
                i10 = i16 == i17 ? 2 : 4;
            }
            if (((i10 << 4) & i12) == 0) {
                return false;
            }
        }
        if ((i12 & 1792) != 0) {
            int i18 = this.f365f;
            int i19 = this.f362c;
            if (i18 > i19) {
                i7 = 1;
            } else {
                i7 = i18 == i19 ? 2 : 4;
            }
            if (((i7 << 8) & i12) == 0) {
                return false;
            }
        }
        if ((i12 & 28672) != 0) {
            int i20 = this.f365f;
            int i21 = this.f363d;
            if (i20 > i21) {
                i13 = 1;
            } else if (i20 != i21) {
                i13 = 4;
            }
            if ((i12 & (i13 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean c(int i7) {
        return i7 != -1 && this.f363d == (i7 % 3) * 3;
    }

    public void d() {
        this.f365f = (this.f363d / 3) + ((this.f364e / 30) * 3);
    }

    public String toString() {
        switch (this.f360a) {
            case 3:
                return this.f365f + "|" + this.f364e;
            default:
                return super.toString();
        }
    }

    public b(int i7, int i10, int i11, int i12, int i13, byte b10) {
        this.f360a = i13;
        switch (i13) {
            case 3:
                this.f365f = -1;
                this.f361b = i7;
                this.f362c = i10;
                this.f363d = i11;
                this.f364e = i12;
                break;
            default:
                this.f361b = i7;
                this.f362c = i12;
                this.f363d = i10;
                this.f364e = i11;
                this.f365f = i10 + i11;
                break;
        }
    }

    public b(int i7, int i10, int i11, int i12, int i13) {
        this.f360a = 0;
        this.f361b = i7;
        this.f362c = i10;
        this.f363d = i11;
        this.f364e = i12;
        this.f365f = i13;
    }
}
