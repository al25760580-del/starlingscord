package a5;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236a;

    public static String f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e10);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return kk.b.k(str, " : ", str2);
    }

    public static o g(je.w wVar) {
        String str;
        wVar.G(2);
        int iU = wVar.u();
        int i7 = iU >> 1;
        int iU2 = ((wVar.u() >> 3) & 31) | ((iU & 1) << 5);
        if (i7 == 4 || i7 == 5 || i7 == 7) {
            str = "dvhe";
        } else if (i7 == 8) {
            str = "hev1";
        } else {
            if (i7 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i7);
        sb2.append(iU2 >= 10 ? "." : ".0");
        sb2.append(iU2);
        return new o(sb2.toString(), 1);
    }

    public void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", f(this.f236a, str, objArr));
        }
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", f(this.f236a, str, objArr));
        }
    }

    public void c(Exception exc, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", f(this.f236a, str, objArr), exc);
        }
    }

    public void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", f(this.f236a, str, objArr));
        }
    }

    public void e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", f(this.f236a, str, objArr));
        }
    }

    public o(String str, int i7) {
        switch (i7) {
            case 2:
                this.f236a = s0.g.c(Process.myUid(), "UID: [", Process.myPid(), "]  PID: [", "] ").concat(str);
                break;
            default:
                this.f236a = str;
                break;
        }
    }
}
