package sh;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a5.o f20053c = new a5.o("PackageStateCache", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20055b = -1;

    public h1(Context context) {
        this.f20054a = context;
    }

    public final synchronized int a() {
        if (this.f20055b == -1) {
            try {
                this.f20055b = this.f20054a.getPackageManager().getPackageInfo(this.f20054a.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                f20053c.b("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.f20055b;
    }
}
