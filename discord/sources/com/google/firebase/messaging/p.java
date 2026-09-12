package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements g0.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f6606e;

    public static String c(ji.f fVar) {
        fVar.a();
        ji.h hVar = fVar.f13892c;
        String str = hVar.f13908e;
        if (str != null) {
            return str;
        }
        fVar.a();
        String str2 = hVar.f13905b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public int a(long j) {
        int i7 = this.f6602a + 1;
        long[] jArr = (long[]) this.f6604c;
        int length = jArr.length;
        if (i7 > length) {
            int i10 = length * 2;
            long[] jArr2 = new long[i10];
            int[] iArr = new int[i10];
            kotlin.collections.w.f(jArr, jArr2, 0, 0, jArr.length);
            kotlin.collections.w.h((int[]) this.f6605d, iArr, 0, 14);
            this.f6604c = jArr2;
            this.f6605d = iArr;
        }
        int i11 = this.f6602a;
        this.f6602a = i11 + 1;
        int length2 = ((int[]) this.f6606e).length;
        if (this.f6603b >= length2) {
            int i12 = length2 * 2;
            int[] iArr2 = new int[i12];
            int i13 = 0;
            while (i13 < i12) {
                int i14 = i13 + 1;
                iArr2[i13] = i14;
                i13 = i14;
            }
            kotlin.collections.w.h((int[]) this.f6606e, iArr2, 0, 14);
            this.f6606e = iArr2;
        }
        int i15 = this.f6603b;
        int[] iArr3 = (int[]) this.f6606e;
        this.f6603b = iArr3[i15];
        long[] jArr3 = (long[]) this.f6604c;
        jArr3[i11] = j;
        ((int[]) this.f6605d)[i11] = i15;
        iArr3[i15] = i11;
        while (i11 > 0) {
            int i16 = ((i11 + 1) >> 1) - 1;
            if (Intrinsics.compare(jArr3[i16], j) <= 0) {
                break;
            }
            h(i16, i11);
            i11 = i16;
        }
        return i15;
    }

    public synchronized String b() {
        try {
            if (((String) this.f6605d) == null) {
                g();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (String) this.f6605d;
    }

    public PackageInfo d(String str) {
        try {
            return ((Context) this.f6604c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004c A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:35:0x007c, B:34:0x007a), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x006a A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:35:0x007c, B:34:0x007a), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0077 A[Catch: all -> 0x0027, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:35:0x007c, B:34:0x007a), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x007a A[Catch: all -> 0x0027, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:35:0x007c, B:34:0x007a), top: B:42:0x0001 }] */
    public boolean e() {
        int i7;
        List<ResolveInfo> listQueryBroadcastReceivers;
        synchronized (this) {
            i7 = this.f6603b;
            if (i7 == 0) {
                PackageManager packageManager = ((Context) this.f6604c).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i7 = 0;
                } else if (ff.c.c()) {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers != null) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (ff.c.c()) {
                            this.f6603b = 2;
                        } else {
                            this.f6603b = 1;
                        }
                        i7 = this.f6603b;
                    } else {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (ff.c.c()) {
                            this.f6603b = 2;
                        } else {
                            this.f6603b = 1;
                        }
                        i7 = this.f6603b;
                    }
                } else {
                    Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
                        Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
                        intent3.setPackage("com.google.android.gms");
                        listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
                        if (listQueryBroadcastReceivers != null || listQueryBroadcastReceivers.size() <= 0) {
                            Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                            if (ff.c.c()) {
                                this.f6603b = 2;
                            } else {
                                this.f6603b = 1;
                            }
                            i7 = this.f6603b;
                        } else {
                            this.f6603b = 2;
                            i7 = 2;
                        }
                    } else {
                        this.f6603b = 1;
                        i7 = 1;
                    }
                }
            }
        }
        return i7 != 0;
    }

    public void f() {
        g0.p pVar = (g0.p) this.f6605d;
        pVar.getLayoutDirection();
        i0.a0 a0Var = pVar instanceof i0.a0 ? (i0.a0) pVar : null;
        Function1 function1 = (Function1) this.f6606e;
        boolean zB = g0.r.b(a0Var);
        function1.invoke(g0.s.f9450a);
        if (a0Var == null) {
            return;
        }
        a0Var.f11284y = zB;
    }

    public synchronized void g() {
        PackageInfo packageInfoD = d(((Context) this.f6604c).getPackageName());
        if (packageInfoD != null) {
            this.f6605d = Integer.toString(packageInfoD.versionCode);
            this.f6606e = packageInfoD.versionName;
        }
    }

    public void h(int i7, int i10) {
        long[] jArr = (long[]) this.f6604c;
        int[] iArr = (int[]) this.f6605d;
        int[] iArr2 = (int[]) this.f6606e;
        long j = jArr[i7];
        jArr[i7] = jArr[i10];
        jArr[i10] = j;
        int i11 = iArr[i7];
        int i12 = iArr[i10];
        iArr[i7] = i12;
        iArr[i10] = i11;
        iArr2[i12] = i7;
        iArr2[i11] = i10;
    }
}
