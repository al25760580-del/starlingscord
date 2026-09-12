package l3;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void a(int i7, String str) {
        Trace.beginAsyncSection(str, i7);
    }

    public static void b(int i7, String str) {
        Trace.endAsyncSection(str, i7);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}
