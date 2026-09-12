package we;

import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z5) {
        if (!Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            return super.loadClass(str, z5);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3)) {
            return f.class;
        }
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return f.class;
    }
}
