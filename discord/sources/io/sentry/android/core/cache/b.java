package io.sentry.android.core.cache;

import android.os.SystemClock;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.d;
import io.sentry.android.core.k1;
import io.sentry.android.core.performance.f;
import io.sentry.android.core.z;
import io.sentry.cache.c;
import io.sentry.s6;
import io.sentry.w5;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;
import s0.g;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends c {
    public static final List I = Arrays.asList(new a(z.class, "ANR", "last_anr_report", new hm.a(25)), new a(k1.class, "Tombstone", "last_tombstone_report", new hm.a(26)));
    public final d H;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(SentryAndroidOptions sentryAndroidOptions) {
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        com.facebook.imagepipeline.nativecode.c.H(cacheDirPath, "cacheDirPath must not be null");
        super(sentryAndroidOptions, cacheDirPath, sentryAndroidOptions.getMaxCacheItems());
        this.H = d.f12289d;
    }

    public static Long k(w5 w5Var, String str, String str2) {
        String cacheDirPath = w5Var.getCacheDirPath();
        com.facebook.imagepipeline.nativecode.c.H(cacheDirPath, "Cache dir path should be set for getting " + str2 + "s reported");
        File file = new File(cacheDirPath, str);
        try {
            String strY = a.a.y(file);
            if (strY != null && !strY.equals("null")) {
                return Long.valueOf(Long.parseLong(strY.trim()));
            }
            return null;
        } catch (Throwable th2) {
            if (th2 instanceof FileNotFoundException) {
                w5Var.getLogger().q(SentryLevel.DEBUG, g.e("Last ", str2, " marker does not exist. %s."), file.getAbsolutePath());
                return null;
            }
            w5Var.getLogger().g(SentryLevel.ERROR, g.e("Error reading last ", str2, " marker"), th2);
            return null;
        }
    }

    @Override // io.sentry.cache.c, io.sentry.cache.d
    public final boolean n(e4.c cVar, Hint hint) {
        Long lValueOf;
        boolean zN = super.n(cVar, hint);
        w5 w5Var = this.f12530d;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) w5Var;
        io.sentry.android.core.performance.g gVar = f.b().f12379v;
        if (s6.class.isInstance(hint.b("sentry:typeCheckHint")) && gVar.c()) {
            this.H.getClass();
            long jUptimeMillis = SystemClock.uptimeMillis() - gVar.f12385i;
            if (jUptimeMillis <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                ILogger logger = sentryAndroidOptions.getLogger();
                SentryLevel sentryLevel = SentryLevel.DEBUG;
                logger.q(sentryLevel, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(jUptimeMillis));
                String outboxPath = w5Var.getOutboxPath();
                if (outboxPath == null) {
                    w5Var.getLogger().q(sentryLevel, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
                } else {
                    try {
                        new File(outboxPath, "startup_crash").createNewFile();
                    } catch (Throwable th2) {
                        w5Var.getLogger().g(SentryLevel.ERROR, "Error writing the startup crash marker file to the disk", th2);
                    }
                }
            }
        }
        for (a aVar : I) {
            Class cls = aVar.f12164a;
            ac.b bVar = new ac.b(aVar, sentryAndroidOptions, this, 9);
            Object objB = hint.b("sentry:typeCheckHint");
            if (cls.isInstance(hint.b("sentry:typeCheckHint")) && objB != null) {
                a aVar2 = (a) bVar.f308v;
                SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) bVar.f307i;
                b bVar2 = (b) bVar.f306e;
                switch (aVar2.f12167d.f10947d) {
                    case 25:
                        lValueOf = Long.valueOf(((z) objB).f12451v);
                        break;
                    default:
                        lValueOf = Long.valueOf(((k1) objB).f12342v);
                        break;
                }
                ILogger logger2 = sentryAndroidOptions2.getLogger();
                SentryLevel sentryLevel2 = SentryLevel.DEBUG;
                String str = aVar2.f12165b;
                logger2.q(sentryLevel2, "Writing last reported %s marker with timestamp %d", str, lValueOf);
                String str2 = aVar2.f12166c;
                w5 w5Var2 = bVar2.f12530d;
                String cacheDirPath = w5Var2.getCacheDirPath();
                if (cacheDirPath == null) {
                    w5Var2.getLogger().q(sentryLevel2, g.e("Cache dir path is null, the ", str, " marker will not be written"), new Object[0]);
                } else {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, str2));
                        try {
                            fileOutputStream.write(String.valueOf(lValueOf).getBytes(c.F));
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (Throwable th3) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        w5Var2.getLogger().g(SentryLevel.ERROR, g.e("Error writing the ", str, " marker to the disk"), th5);
                    }
                }
            }
        }
        return zN;
    }
}
