package io.sentry.android.core;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f12423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f12424b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final io.sentry.util.a f12425c = new io.sentry.util.a();

    public static String a(Context context) {
        io.sentry.r rVarA = f12425c.a();
        try {
            if (f12423a == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                try {
                    boolean zExists = file.exists();
                    Charset charset = f12424b;
                    if (!zExists) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            String strR = ls.l.r();
                            fileOutputStream.write(strR.getBytes(charset));
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            f12423a = strR;
                            rVarA.close();
                            return strR;
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        byte[] bArr = new byte[(int) randomAccessFile.length()];
                        randomAccessFile.readFully(bArr);
                        String str = new String(bArr, charset);
                        randomAccessFile.close();
                        f12423a = str;
                    } catch (Throwable th4) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    throw new RuntimeException(th6);
                }
            }
            String str2 = f12423a;
            rVarA.close();
            return str2;
        } catch (Throwable th7) {
            try {
                rVarA.close();
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
            }
            throw th7;
        }
    }
}
