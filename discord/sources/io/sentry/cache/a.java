package io.sentry.cache;

import io.sentry.SentryLevel;
import io.sentry.w5;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f12529a = Charset.forName("UTF-8");

    public static void a(w5 w5Var, String str, String str2) {
        File fileB = b(w5Var, str);
        if (fileB == null) {
            w5Var.getLogger().q(SentryLevel.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file = new File(fileB, str2);
        w5Var.getLogger().q(SentryLevel.DEBUG, "Deleting %s from scope cache", str2);
        if (file.delete()) {
            return;
        }
        w5Var.getLogger().q(SentryLevel.INFO, "Failed to delete: %s", file.getAbsolutePath());
    }

    public static File b(w5 w5Var, String str) {
        String cacheDirPath = w5Var.getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        File file = new File(cacheDirPath, str);
        file.mkdirs();
        return file;
    }

    public static Object c(w5 w5Var, String str, String str2, Class cls) {
        File fileB = b(w5Var, str);
        if (fileB == null) {
            w5Var.getLogger().q(SentryLevel.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file = new File(fileB, str2);
        if (!file.exists()) {
            w5Var.getLogger().q(SentryLevel.DEBUG, "No entry stored for %s", str2);
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f12529a));
            try {
                Object objD = w5Var.getSerializer().d(bufferedReader, cls);
                bufferedReader.close();
                return objD;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            w5Var.getLogger().e(SentryLevel.ERROR, th4, "Error reading entity from scope cache: %s", str2);
            return null;
        }
    }

    public static void d(w5 w5Var, Object obj, String str, String str2) {
        File fileB = b(w5Var, str);
        if (fileB == null) {
            w5Var.getLogger().q(SentryLevel.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileB, str2));
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f12529a));
                try {
                    w5Var.getSerializer().b(obj, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            w5Var.getLogger().e(SentryLevel.ERROR, th6, "Error persisting entity: %s", str2);
        }
    }
}
