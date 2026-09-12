package ff;

import android.os.StrictMode;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    public static StrictMode.VmPolicy.Builder a(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }
}
