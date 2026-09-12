package sh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public final class g1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a5.o f20046c = new a5.o("PackMetadataManager", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f20047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f20048b;

    public g1(s sVar, h1 h1Var) {
        this.f20047a = sVar;
        this.f20048b = h1Var;
    }

    public final String a(String str) {
        s sVar = this.f20047a;
        sVar.getClass();
        try {
            if (sVar.m(str) != null) {
                int iA = this.f20048b.a();
                File file = new File(new File(sVar.j(iA, s.b(new File(new File(sVar.d(), str), String.valueOf((int) s.b(new File(sVar.d(), str), true))), true), str), "_metadata"), "properties.dat");
                try {
                    if (!file.exists()) {
                        return String.valueOf(iA);
                    }
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        Properties properties = new Properties();
                        properties.load(fileInputStream);
                        fileInputStream.close();
                        String property = properties.getProperty("moduleVersionTag");
                        return property == null ? String.valueOf(iA) : property;
                    } catch (Throwable th2) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IOException unused) {
                    f20046c.b("Failed to read pack version tag for pack %s", str);
                }
            }
        } catch (IOException unused2) {
        }
        return "";
    }

    public final void b(int i7, String str, long j, String str2) throws IOException {
        if (str2 == null || str2.isEmpty()) {
            str2 = String.valueOf(i7);
        }
        Properties properties = new Properties();
        properties.put("moduleVersionTag", str2);
        s sVar = this.f20047a;
        sVar.getClass();
        File file = new File(new File(sVar.j(i7, j, str), "_metadata"), "properties.dat");
        file.getParentFile().mkdirs();
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
