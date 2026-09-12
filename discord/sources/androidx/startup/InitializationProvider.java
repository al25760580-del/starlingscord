package androidx.startup;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0037 */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onCreate() {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L46
            android.content.Context r1 = r0.getApplicationContext()
            if (r1 == 0) goto L44
            j3.a r0 = j3.a.c(r0)
            java.lang.Class r1 = r4.getClass()
            android.content.Context r2 = r0.f13644c
            java.lang.String r3 = "Startup"
            java.lang.String r3 = mo.c0.Q(r3)     // Catch: java.lang.Throwable -> L37 android.content.pm.PackageManager.NameNotFoundException -> L39
            android.os.Trace.beginSection(r3)     // Catch: java.lang.Throwable -> L37 android.content.pm.PackageManager.NameNotFoundException -> L39
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L37 android.content.pm.PackageManager.NameNotFoundException -> L39
            r3.<init>(r2, r1)     // Catch: java.lang.Throwable -> L37 android.content.pm.PackageManager.NameNotFoundException -> L39
            android.content.pm.PackageManager r1 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L37 android.content.pm.PackageManager.NameNotFoundException -> L39
            r2 = 128(0x80, float:1.794E-43)
            android.content.pm.ProviderInfo r1 = r1.getProviderInfo(r3, r2)     // Catch: java.lang.Throwable -> L37 android.content.pm.PackageManager.NameNotFoundException -> L39
            android.os.Bundle r1 = r1.metaData     // Catch: java.lang.Throwable -> L37 android.content.pm.PackageManager.NameNotFoundException -> L39
            r0.a(r1)     // Catch: java.lang.Throwable -> L37 android.content.pm.PackageManager.NameNotFoundException -> L39
            android.os.Trace.endSection()
            goto L44
        L37:
            r0 = move-exception
            goto L40
        L39:
            r0 = move-exception
            androidx.datastore.preferences.protobuf.d1 r1 = new androidx.datastore.preferences.protobuf.d1     // Catch: java.lang.Throwable -> L37
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L37
            throw r1     // Catch: java.lang.Throwable -> L37
        L40:
            android.os.Trace.endSection()
            throw r0
        L44:
            r0 = 1
            return r0
        L46:
            androidx.datastore.preferences.protobuf.d1 r0 = new androidx.datastore.preferences.protobuf.d1
            java.lang.String r1 = "Context cannot be null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.startup.InitializationProvider.onCreate():boolean");
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
