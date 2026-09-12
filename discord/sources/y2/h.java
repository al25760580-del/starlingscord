package y2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0.h f23157a = new o0.h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f23158b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static g f23159c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? e.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static g b(int i7) {
        g gVar = new g(i7);
        f23159c = gVar;
        f23157a.j(gVar);
        return f23159c;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x002e  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    public static void c(Context context, boolean z5) {
        int i7;
        boolean z6;
        int i10;
        File file;
        boolean z7;
        File file2;
        long length;
        boolean z10;
        File file3;
        f fVarA;
        f fVar;
        int i11;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z5 || f23159c == null) {
            synchronized (f23158b) {
                if (z5) {
                    i7 = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                    i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 28) {
                        file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file.length();
                        if (file.exists()) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists()) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        long jA = a(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            fVarA = f.a(file3);
                        } else {
                            fVarA = null;
                        }
                        if (fVarA == null) {
                            if (!z6) {
                                i7 = 327680;
                            } else if (z7) {
                                i7 = 1;
                            } else if (z10) {
                                i7 = 2;
                            }
                        } else if (!z6) {
                            i7 = 327680;
                        } else if (z7) {
                            i7 = 1;
                        } else if (z10) {
                            i7 = 2;
                        }
                        if (z5) {
                            i7 = 2;
                        }
                        if (fVarA != null) {
                            i7 = 3;
                        }
                        int i12 = i7;
                        fVar = new f(1, i12, jA, length);
                        if (fVarA != null) {
                            fVar.b(file3);
                        } else {
                            fVar.b(file3);
                        }
                        b(i12);
                        return;
                    }
                    b(262144);
                    return;
                }
                if (f23159c != null) {
                    return;
                }
                i7 = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        if (assetFileDescriptorOpenFd.getLength() > 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        assetFileDescriptorOpenFd.close();
                    } catch (Throwable th2) {
                        if (assetFileDescriptorOpenFd == null) {
                            throw th2;
                        }
                        try {
                            assetFileDescriptorOpenFd.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (IOException unused) {
                    z6 = false;
                }
                i10 = Build.VERSION.SDK_INT;
                if (i10 >= 28 && i10 != 30) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length3 = file.length();
                    if (file.exists() || length3 <= 0) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists() || length <= 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    try {
                        long jA2 = a(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                fVarA = f.a(file3);
                            } catch (IOException unused2) {
                                b(131072);
                                return;
                            }
                        } else {
                            fVarA = null;
                        }
                        if (fVarA == null && fVarA.f23154c == jA2 && (i11 = fVarA.f23153b) != 2) {
                            i7 = i11;
                        } else if (!z6) {
                            i7 = 327680;
                        } else if (z7) {
                            i7 = 1;
                        } else if (z10) {
                            i7 = 2;
                        }
                        if (z5 && z10 && i7 != 1) {
                            i7 = 2;
                        }
                        if (fVarA != null && fVarA.f23153b == 2 && i7 == 1 && length3 < fVarA.f23155d) {
                            i7 = 3;
                        }
                        int i13 = i7;
                        fVar = new f(1, i13, jA2, length);
                        if (fVarA != null || !fVarA.equals(fVar)) {
                            try {
                                fVar.b(file3);
                            } catch (IOException unused3) {
                                i13 = 196608;
                            }
                        }
                        b(i13);
                        return;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        b(65536);
                        return;
                    }
                }
                b(262144);
                return;
                throw th;
            }
        }
    }
}
