package xs;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import bh.t;
import f0.e;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f23088b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Context f23089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Bundle f23090d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23091a;

    public static Bundle a(Context context) {
        Bundle bundle;
        ServiceInfo serviceInfo;
        Bundle bundle2;
        Context applicationContext = context.getApplicationContext();
        synchronized (f23088b) {
            if (applicationContext != f23089c) {
                us.a.c("CronetManifest#getMetaData fetching info");
                try {
                    try {
                        serviceInfo = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, "android.net.http.MetaDataHolder"), 787072);
                    } catch (Throwable th2) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    serviceInfo = null;
                }
                if (serviceInfo == null || (bundle2 = serviceInfo.metaData) == null) {
                    bundle2 = new Bundle();
                }
                f23090d = bundle2;
                f23089c = applicationContext;
                Trace.endSection();
            }
            bundle = f23090d;
        }
        return bundle;
    }

    public final void b(a aVar) {
        int i7;
        int i10;
        switch (this.f23091a) {
            case 0:
                return;
            default:
                us.a.c("CronetLoggerImpl#logCronetEngineBuilderInitializedInfo");
                try {
                    long j = aVar.f23073a;
                    int iB = e.b(aVar.f23074b);
                    int i11 = 2;
                    int i12 = 1;
                    if (iB == 0) {
                        i7 = 0;
                        i10 = 1;
                    } else if (iB != 1) {
                        i10 = 0;
                        i7 = 0;
                    } else {
                        i10 = 2;
                        i7 = 0;
                    }
                    int i13 = aVar.f23075c;
                    int iOrdinal = aVar.f23076d.ordinal();
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            i12 = 2;
                        } else if (iOrdinal != 3) {
                            i12 = iOrdinal != 4 ? i7 : 4;
                        } else {
                            i12 = 3;
                        }
                    }
                    Boolean bool = aVar.f23077e;
                    if (bool == null) {
                        i11 = 1;
                    } else if (!bool.booleanValue()) {
                        i11 = 3;
                    }
                    int iB2 = e.b(i11);
                    t tVar = aVar.f23078f;
                    int i14 = tVar.f3301b;
                    int i15 = tVar.f3302c;
                    int i16 = tVar.f3303d;
                    int i17 = tVar.f3304e;
                    t tVar2 = aVar.f23079g;
                    int i18 = tVar2 == null ? -1 : tVar2.f3301b;
                    int i19 = tVar2 == null ? -1 : tVar2.f3302c;
                    int i20 = tVar2 == null ? -1 : tVar2.f3303d;
                    int i21 = tVar2 == null ? -1 : tVar2.f3304e;
                    ys.a.a(j, i10, i13, i12, iB2, i14, i15, i16, i17, i18, i19, i20, i21, aVar.f23080h);
                    Trace.endSection();
                    return;
                } catch (Throwable th2) {
                    try {
                        Trace.endSection();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
        }
    }

    private final void c(a aVar) {
    }
}
