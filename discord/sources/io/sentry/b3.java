package io.sentry;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class b3 implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f12490e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w5 f12491d;

    public b3(w5 w5Var) {
        this.f12491d = w5Var;
    }

    public final Date a(File file) {
        w5 w5Var = this.f12491d;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f12490e));
            try {
                String line = bufferedReader.readLine();
                w5Var.getLogger().q(SentryLevel.DEBUG, "Crash marker file has %s timestamp.", line);
                Date dateA = io.sentry.config.a.A(line);
                bufferedReader.close();
                return dateA;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            w5Var.getLogger().g(SentryLevel.ERROR, "Error reading the crash marker file.", e10);
            return null;
        } catch (IllegalArgumentException e11) {
            w5Var.getLogger().e(SentryLevel.ERROR, e11, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        w5 w5Var = this.f12491d;
        String cacheDirPath = w5Var.getCacheDirPath();
        if (cacheDirPath == null) {
            w5Var.getLogger().q(SentryLevel.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        if (!w5Var.isEnableAutoSessionTracking()) {
            w5Var.getLogger().q(SentryLevel.DEBUG, "Session tracking is disabled, bailing from previous session finalizer.", new Object[0]);
            return;
        }
        io.sentry.cache.d envelopeDiskCache = w5Var.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.c) && !((io.sentry.cache.c) envelopeDiskCache).i()) {
            w5Var.getLogger().q(SentryLevel.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        int i7 = io.sentry.cache.c.G;
        File file = new File(cacheDirPath, "previous_session.json");
        c1 serializer = w5Var.getSerializer();
        if (!file.exists()) {
            return;
        }
        w5Var.getLogger().q(SentryLevel.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f12490e));
            try {
                h6 h6Var = (h6) serializer.d(bufferedReader, h6.class);
                if (h6Var == null) {
                    w5Var.getLogger().q(SentryLevel.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                } else {
                    File file2 = new File(w5Var.getCacheDirPath(), ".sentry-native/last_crash");
                    g6 g6Var = h6Var.f12722y;
                    g6 g6Var2 = g6.Crashed;
                    if (g6Var == g6Var2) {
                        i4 i4Var = i4.f12740d;
                        r rVarA = i4Var.f12743c.a();
                        try {
                            i4Var.f12741a = false;
                            i4Var.f12742b = null;
                            rVarA.close();
                            i4Var.a(true);
                        } catch (Throwable th2) {
                            try {
                                rVarA.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } else if (file2.exists()) {
                        w5Var.getLogger().q(SentryLevel.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                        Date dateA = a(file2);
                        h6Var.d(g6Var2, null, true, null);
                        h6Var.b(dateA);
                    } else if (h6Var.K == null) {
                        h6Var.b(io.sentry.config.a.y());
                    }
                    if (file2.exists() && !file2.delete()) {
                        w5Var.getLogger().q(SentryLevel.ERROR, "Failed to delete the crash marker file. %s.", file2.getAbsolutePath());
                    }
                    c4.f().i(new e4.c((io.sentry.protocol.v) null, w5Var.getSdkVersion(), p4.d(serializer, h6Var)), new Hint());
                }
                bufferedReader.close();
                if (file.delete()) {
                    return;
                }
                w5Var.getLogger().q(SentryLevel.WARNING, "Failed to delete the previous session file.", new Object[0]);
            } catch (Throwable th4) {
                try {
                    bufferedReader.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            w5Var.getLogger().g(SentryLevel.ERROR, "Error processing previous session.", th6);
        }
    }
}
