package ff;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f9151a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f9152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f9153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f9154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f9155e;

    public static byte[] a(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f9152b == null) {
            f9152b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f9152b.booleanValue();
        if (f9153c == null) {
            f9153c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (f9153c.booleanValue()) {
            return !c() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }
}
