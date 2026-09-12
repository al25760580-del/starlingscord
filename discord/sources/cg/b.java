package cg;

import android.os.Process;
import android.text.TextUtils;
import android.util.AndroidException;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
import k2.n;
import k2.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3649d;

    public static String e(String str, String str2, Object... objArr) {
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

    public void a(Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", e(this.f3649d, "onError(%d)", objArr));
        }
    }

    public void b(AndroidException androidException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", e(this.f3649d, str, objArr), androidException);
        }
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", e(this.f3649d, str, objArr));
        }
    }

    public void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", e(this.f3649d, str, objArr));
        }
    }

    @Override // k2.n
    public boolean n(CharSequence charSequence, int i7, int i10, u uVar) {
        if (!TextUtils.equals(charSequence.subSequence(i7, i10), this.f3649d)) {
            return true;
        }
        uVar.f14268c = (uVar.f14268c & 3) | 4;
        return false;
    }

    public b(String discriminator, int i7) {
        switch (i7) {
            case 3:
                Intrinsics.checkNotNullParameter(discriminator, "discriminator");
                this.f3649d = discriminator;
                break;
            default:
                this.f3649d = s0.g.c(Process.myUid(), "UID: [", Process.myPid(), "]  PID: [", "] ").concat(discriminator);
                break;
        }
    }

    @Override // k2.n
    public Object getResult() {
        return this;
    }
}
