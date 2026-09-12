package x4;

import android.util.Log;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f22625a = new b();

    public static void a() {
        f22625a.getClass();
    }

    public static void b(String str) {
        f22625a.getClass();
        HashSet hashSet = b.f22624a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        hashSet.add(str);
    }

    public static void c(String str, Throwable th2) {
        f22625a.getClass();
        HashSet hashSet = b.f22624a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th2);
        hashSet.add(str);
    }
}
