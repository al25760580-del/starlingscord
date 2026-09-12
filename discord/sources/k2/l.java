package k2;

import android.os.Trace;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = f1.e.f8791b;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (i.k != null) {
                i.a().c();
            }
        } finally {
            Method method2 = f1.e.f8791b;
            Trace.endSection();
        }
    }
}
