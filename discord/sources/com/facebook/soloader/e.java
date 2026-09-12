package com.facebook.soloader;

import android.os.StrictMode;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class e extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f5386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f5388c = Arrays.asList(new String[0]);

    public e(File file, int i7) {
        this.f5386a = file;
        this.f5387b = i7;
    }

    @Override // com.facebook.soloader.b0
    public String b() {
        return "DirectorySoSource";
    }

    @Override // com.facebook.soloader.b0
    public int c(String str, int i7, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        if (SoLoader.f5364b == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        boolean zContains = this.f5388c.contains(str);
        File file = this.f5386a;
        if (zContains) {
            StringBuilder sbO = kk.b.o(str, " is on the denyList, skip loading from ");
            sbO.append(file.getCanonicalPath());
            r.b(sbO.toString());
            return 0;
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2 = null;
        }
        if (file2 == null) {
            StringBuilder sbO2 = kk.b.o(str, " file not found on ");
            sbO2.append(file.getCanonicalPath());
            r.h("SoLoader", sbO2.toString());
            return 0;
        }
        String canonicalPath = file2.getCanonicalPath();
        r.b(str + " file found at " + canonicalPath);
        if ((i7 & 1) != 0 && (this.f5387b & 2) != 0) {
            r.b(str + " loaded implicitly");
            return 2;
        }
        if ((this.f5387b & 1) != 0) {
            h hVar = new h();
            hVar.f5397d = file2;
            FileInputStream fileInputStream = new FileInputStream(file2);
            hVar.f5398e = fileInputStream;
            hVar.f5399i = fileInputStream.getChannel();
            try {
                u.b(str, hVar, i7, threadPolicy);
                hVar.close();
            } catch (Throwable th2) {
                try {
                    hVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } else {
            r.b("Not resolving dependencies for " + str);
        }
        try {
            SoLoader.f5364b.l(i7, canonicalPath);
            return 1;
        } catch (UnsatisfiedLinkError e10) {
            throw r.a(str, e10);
        }
    }

    @Override // com.facebook.soloader.b0
    public String toString() {
        String name;
        File file = this.f5386a;
        try {
            name = String.valueOf(file.getCanonicalPath());
        } catch (IOException unused) {
            name = file.getName();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b());
        sb2.append("[root = ");
        sb2.append(name);
        sb2.append(" flags = ");
        return com.discord.chat.presentation.list.a.j(sb2, this.f5387b, ']');
    }
}
