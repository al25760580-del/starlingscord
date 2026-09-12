package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i0 implements w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f5379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5380f;

    public b(Context context, String str, boolean z5) {
        super(context, str, z5);
        ArrayList arrayList = new ArrayList();
        this.f5379e = arrayList;
        this.f5380f = false;
        arrayList.add(new p(context, str, new File(context.getApplicationInfo().sourceDir)));
        if (context.getApplicationInfo().splitSourceDirs == null) {
            return;
        }
        try {
            for (String str2 : context.getApplicationInfo().splitSourceDirs) {
                p pVar = new p(context, str, new File(str2));
                o oVar = new o(pVar, pVar);
                try {
                    boolean z6 = oVar.i().length != 0;
                    oVar.close();
                    if (z6) {
                        Log.w("BackupSoSource", "adding backup source from split: " + pVar.toString());
                        this.f5379e.add(pVar);
                    }
                } catch (Throwable th2) {
                    try {
                        oVar.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException e10) {
            Log.w("BackupSoSource", "failed to read split apks", e10);
        }
    }

    @Override // com.facebook.soloader.w
    public final b0 a(Context context) {
        b bVar = new b(context, this.f5386a.getName(), true);
        try {
            bVar.d(0);
            return bVar;
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.facebook.soloader.e, com.facebook.soloader.b0
    public final String b() {
        return "BackupSoSource";
    }

    @Override // com.facebook.soloader.e, com.facebook.soloader.b0
    public final int c(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        if (this.f5380f) {
            return super.c(str, i7, threadPolicy);
        }
        return 0;
    }

    @Override // com.facebook.soloader.i0, com.facebook.soloader.b0
    public final void d(int i7) {
        if ((i7 & 8) != 0) {
            return;
        }
        super.d(i7);
        this.f5380f = true;
    }

    @Override // com.facebook.soloader.i0
    public final byte[] e() {
        ArrayList arrayList = this.f5379e;
        Context context = this.f5406d;
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeByte((byte) 3);
            PackageManager packageManager = context.getPackageManager();
            int i7 = 0;
            if (packageManager != null) {
                try {
                    i7 = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
                }
            }
            parcelObtain.writeInt(i7);
            parcelObtain.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                parcelObtain.writeByteArray(((p) it.next()).e());
            }
            String str = context.getApplicationInfo().sourceDir;
            if (str == null) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            File canonicalFile = new File(str).getCanonicalFile();
            if (!canonicalFile.exists()) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            parcelObtain.writeByte((byte) 2);
            parcelObtain.writeString(canonicalFile.getPath());
            parcelObtain.writeLong(canonicalFile.lastModified());
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.facebook.soloader.i0
    public final g0[] f() throws IOException {
        p pVar = (p) this.f5379e.get(0);
        pVar.getClass();
        o oVar = new o(pVar, pVar);
        try {
            n[] nVarArrI = oVar.f5412d;
            if (nVarArrI == null) {
                nVarArrI = oVar.i();
                oVar.f5412d = nVarArrI;
            }
            oVar.close();
            return nVarArrI;
        } catch (Throwable th2) {
            try {
                oVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // com.facebook.soloader.i0
    public final h0 g() {
        return new j(this);
    }

    public final boolean j(String str) {
        for (g0 g0Var : new j(this).f()) {
            if (g0Var.f5395d.equals(str)) {
                Log.e("SoLoader", "Found " + str + " in BackupSoSource");
                Log.e("SoLoader", "Preparing BackupSoSource");
                d(0);
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.soloader.e, com.facebook.soloader.b0
    public final String toString() {
        String name;
        File file = this.f5386a;
        try {
            name = String.valueOf(file.getCanonicalPath());
        } catch (IOException unused) {
            name = file.getName();
        }
        StringBuilder sbN = com.discord.chat.presentation.list.a.n("BackupSoSource[root = ", name, " flags = ");
        sbN.append(this.f5387b);
        sbN.append(" apks = ");
        sbN.append(this.f5379e.toString());
        sbN.append("]");
        return sbN.toString();
    }
}
