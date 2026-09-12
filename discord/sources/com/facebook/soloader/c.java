package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends b0 implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f5381a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f5382b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f5383c;

    public c(Context context) {
        HashSet hashSet = new HashSet();
        String strH = h(context.getApplicationInfo().sourceDir);
        if (strH != null) {
            hashSet.add(strH);
        }
        if (context.getApplicationInfo().splitSourceDirs != null) {
            for (String str : context.getApplicationInfo().splitSourceDirs) {
                String strH2 = h(str);
                if (strH2 != null) {
                    hashSet.add(strH2);
                }
            }
        }
        this.f5383c = hashSet;
    }

    public static String h(String str) {
        String[] supportedAbis = SysUtil$MarshmallowSysdeps.getSupportedAbis();
        if (str == null || str.isEmpty()) {
            Log.w("SoLoader", "Cannot compute fallback path, apk path is ".concat(str == null ? "null" : "empty"));
            return null;
        }
        if (supportedAbis == null || supportedAbis.length == 0) {
            Log.w("SoLoader", "Cannot compute fallback path, supportedAbis is ".concat(supportedAbis == null ? "null" : "empty"));
            return null;
        }
        StringBuilder sbO = kk.b.o(str, "!/lib/");
        sbO.append(supportedAbis[0]);
        return sbO.toString();
    }

    @Override // com.facebook.soloader.w
    public final b0 a(Context context) {
        c cVar = new c(context);
        try {
            cVar.i();
            return cVar;
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.facebook.soloader.b0
    public final String b() {
        return "DirectApkSoSource";
    }

    @Override // com.facebook.soloader.b0
    public final int c(String str, int i7, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        if (SoLoader.f5364b == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        Iterator it = this.f5383c.iterator();
        while (true) {
            if (!it.hasNext()) {
                return 0;
            }
            String str2 = (String) it.next();
            Set set = (Set) this.f5381a.get(str2);
            if (TextUtils.isEmpty(str2) || set == null || !set.contains(str)) {
                r.h("SoLoader", str + " not found on " + str2);
            } else {
                Set setG = g(str2, str);
                if (setG == null) {
                    String strSubstring = str2.substring(0, str2.indexOf(33));
                    ZipFile zipFile = new ZipFile(strSubstring);
                    try {
                        String str3 = str2.substring(str2.indexOf(33) + 2) + File.separator + str;
                        ZipEntry entry = zipFile.getEntry(str3);
                        if (entry == null) {
                            Log.e("SoLoader", str3 + " not found in " + strSubstring);
                        } else {
                            i iVar = new i(zipFile, entry);
                            try {
                                for (String str4 : u.a(str, iVar)) {
                                    if (!str4.startsWith("/")) {
                                        e(str2, str, str4);
                                    }
                                }
                                iVar.close();
                            } catch (Throwable th2) {
                                try {
                                    iVar.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        }
                        zipFile.close();
                        setG = g(str2, str);
                    } catch (Throwable th4) {
                        try {
                            zipFile.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                if (setG != null) {
                    Iterator it2 = setG.iterator();
                    while (it2.hasNext()) {
                        SoLoader.l((String) it2.next(), i7, threadPolicy);
                    }
                }
                try {
                    i7 |= 4;
                    SoLoader.f5364b.l(i7, str2 + File.separator + str);
                    r.b(str + " found on " + str2);
                    return 1;
                } catch (UnsatisfiedLinkError e10) {
                    Log.w("SoLoader", str + " not found on " + str2 + " flag: " + i7, e10);
                }
            }
        }
    }

    @Override // com.facebook.soloader.b0
    public final void d(int i7) throws IOException {
        i();
    }

    public final void e(String str, String str2, String str3) {
        synchronized (this.f5382b) {
            try {
                String str4 = str + str2;
                if (!this.f5382b.containsKey(str4)) {
                    this.f5382b.put(str4, new HashSet());
                }
                ((Set) this.f5382b.get(str4)).add(str3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(String str, String str2) {
        synchronized (this.f5381a) {
            try {
                if (!this.f5381a.containsKey(str)) {
                    this.f5381a.put(str, new HashSet());
                }
                ((Set) this.f5381a.get(str)).add(str2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Set g(String str, String str2) {
        Set set;
        synchronized (this.f5382b) {
            set = (Set) this.f5382b.get(str + str2);
        }
        return set;
    }

    public final void i() throws IOException {
        int iIndexOf;
        int i7;
        for (String str : this.f5383c) {
            String strSubstring = (TextUtils.isEmpty(str) || (iIndexOf = str.indexOf(33)) < 0 || (i7 = iIndexOf + 2) >= str.length()) ? null : str.substring(i7);
            if (!TextUtils.isEmpty(strSubstring)) {
                ZipFile zipFile = new ZipFile(str.substring(0, str.indexOf(33)));
                try {
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    while (enumerationEntries.hasMoreElements()) {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        if (zipEntryNextElement != null && zipEntryNextElement.getMethod() == 0 && zipEntryNextElement.getName().startsWith(strSubstring) && zipEntryNextElement.getName().endsWith(".so")) {
                            f(str, zipEntryNextElement.getName().substring(strSubstring.length() + 1));
                        }
                    }
                    zipFile.close();
                } catch (Throwable th2) {
                    try {
                        zipFile.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    }

    @Override // com.facebook.soloader.b0
    public final String toString() {
        return "DirectApkSoSource[root = " + this.f5383c.toString() + ']';
    }
}
