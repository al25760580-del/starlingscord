package c5;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f3524a = Log.isLoggable("Volley", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f3525b = w.class.getName();

    public static String a(String str, Object... objArr) {
        String string;
        String str2 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i7 = 2; i7 < stackTrace.length; i7++) {
            if (!stackTrace[i7].getClassName().equals(f3525b)) {
                String className = stackTrace[i7].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                StringBuilder sbO = kk.b.o(strSubstring.substring(strSubstring.lastIndexOf(36) + 1), ".");
                sbO.append(stackTrace[i7].getMethodName());
                string = sbO.toString();
                Locale locale = Locale.US;
                long id2 = Thread.currentThread().getId();
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(id2);
                sb2.append("] ");
                sb2.append(string);
                return com.discord.chat.presentation.list.a.k(sb2, ": ", str2);
            }
        }
        string = "<unknown>";
        Locale locale2 = Locale.US;
        long id3 = Thread.currentThread().getId();
        StringBuilder sb3 = new StringBuilder("[");
        sb3.append(id3);
        sb3.append("] ");
        sb3.append(string);
        return com.discord.chat.presentation.list.a.k(sb3, ": ", str2);
    }

    public static void b(String str, Object... objArr) {
        Log.d("Volley", a(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e("Volley", a(str, objArr));
    }

    public static void d(String str, Object... objArr) {
        if (f3524a) {
            Log.v("Volley", a(str, objArr));
        }
    }
}
