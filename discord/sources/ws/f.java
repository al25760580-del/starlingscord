package ws;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.Trace;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static v3.f f22487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f22488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f22489c = new Object();

    public static void a(b bVar, boolean z5) {
        Iterator it = bVar.f22482e.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    public static ApplicationInfo b(Context context) {
        us.a.c("HttpFlagsLoader#getProviderApplicationInfo");
        try {
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(new Intent("android.net.http.FLAGS_FILE_PROVIDER"), 1048576);
            if (resolveInfoResolveService == null) {
                Log.i("HttpFlagsLoader", "Unable to resolve the HTTP flags file provider package. This is expected if the host system is not set up to provide HTTP flags.");
                Trace.endSection();
                return null;
            }
            ApplicationInfo applicationInfo = resolveInfoResolveService.serviceInfo.applicationInfo;
            Trace.endSection();
            return applicationInfo;
        } catch (Throwable th2) {
            try {
                Trace.endSection();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static e c(Context context) {
        try {
            ApplicationInfo applicationInfoB = b(context);
            if (applicationInfoB != null) {
                Log.d("HttpFlagsLoader", "Found application exporting HTTP flags: " + applicationInfoB.packageName);
                File file = new File(new File(new File(applicationInfoB.deviceProtectedDataDir), "app_httpflags"), "flags.binarypb");
                Log.d("HttpFlagsLoader", "HTTP flags file path: " + file.getAbsolutePath());
                e eVarD = d(file);
                if (eVarD != null) {
                    Log.d("HttpFlagsLoader", "Successfully loaded HTTP flags: " + eVarD);
                    return eVarD;
                }
            }
            return null;
        } catch (RuntimeException e10) {
            Log.i("HttpFlagsLoader", "Unable to load HTTP flags file", e10);
            return null;
        }
    }

    public static e d(File file) {
        us.a.c("HttpFlagsLoader#loadFlagsFile");
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    e eVarI = e.i(fileInputStream);
                    fileInputStream.close();
                    Trace.endSection();
                    return eVarI;
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    Trace.endSection();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (FileNotFoundException unused) {
            Log.i("HttpFlagsLoader", "HTTP flags file `" + file.getPath() + "` is missing. This is expected if HTTP flags functionality is currently disabled in the host system.");
            Trace.endSection();
            return null;
        } catch (IOException e10) {
            throw new RuntimeException("Unable to read HTTP flags file", e10);
        }
    }
}
