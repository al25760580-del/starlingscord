package us;

import android.os.Trace;
import kk.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements AutoCloseable {
    public static void c(String str) {
        if (str.length() > 127) {
            str = b.j(str.substring(0, 124), "...");
        }
        Trace.beginSection(str);
    }
}
