package wh;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import ci.b0;
import ci.t;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f22278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f22280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kh.f f22281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ci.d f22282e;

    public g(Context context, b0 b0Var, kh.f fVar) {
        this.f22279b = context.getPackageName();
        this.f22278a = b0Var;
        this.f22281d = fVar;
        this.f22280c = context;
        b0 b0Var2 = ci.f.f3700a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    if (ci.f.b(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                        this.f22282e = new ci.d(context, b0Var, "IntegrityService", h.f22283a, new ga.k());
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    b0Var2.c("Play Store package is not found.", new Object[0]);
                }
            } else {
                b0Var2.c("Play Store package is disabled.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            b0Var2.c("Play Store package is not found.", new Object[0]);
        }
        Object[] objArr = new Object[0];
        b0Var.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", b0.d(b0Var.f3680a, "Phonesky is not installed.", objArr));
        }
        this.f22282e = null;
    }

    public static Bundle a(g gVar, byte[] bArr, Long l6) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", gVar.f22279b);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 6);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l6 != null) {
            bundle.putLong("cloud.prj", l6.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new t(3, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(io.sentry.config.a.a(arrayList)));
        return bundle;
    }
}
