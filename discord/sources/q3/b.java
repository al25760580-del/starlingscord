package q3;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f18590c = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f18592b;

    public boolean a(Context context) throws IOException {
        String strB = hf.b.b((File) this.f18592b);
        String strB2 = hf.b.b(context.getCacheDir());
        String strB3 = hf.b.b(context.getDataDir());
        if ((!strB.startsWith(strB2) && !strB.startsWith(strB3)) || strB.equals(strB2) || strB.equals(strB3)) {
            return false;
        }
        for (int i7 = 0; i7 < 5; i7++) {
            if (strB.startsWith(strB3 + f18590c[i7])) {
                return false;
            }
        }
        return true;
    }

    public b(Context context, File file) {
        this.f18591a = 2;
        try {
            this.f18592b = new File(hf.b.b(file));
            if (a(context)) {
                return;
            }
            throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
        } catch (IOException e10) {
            throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e10);
        }
    }
}
