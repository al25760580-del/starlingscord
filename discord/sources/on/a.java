package on;

import android.util.Log;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import fr.greweb.reactnativeviewshot.RNViewShotModule;
import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends GuardedAsyncTask implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f17463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f17464b;

    public a(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f17463a = reactApplicationContext.getCacheDir();
        this.f17464b = reactApplicationContext.getExternalCacheDir();
    }

    public final void a(File file) {
        File[] fileArrListFiles = file.listFiles(this);
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.delete()) {
                    Log.d(RNViewShotModule.RNVIEW_SHOT, "deleted file: " + file2.getAbsolutePath());
                }
            }
        }
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith("ReactNative-snapshot-image");
    }

    @Override // com.facebook.react.bridge.GuardedAsyncTask
    public final void doInBackgroundGuarded(Object[] objArr) {
        File file = this.f17463a;
        if (file != null) {
            a(file);
        }
        File file2 = this.f17464b;
        if (file2 != null) {
            a(file2);
        }
    }
}
