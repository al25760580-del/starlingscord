package io.sentry.internal.modules;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.r;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f12770d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ILogger f12771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.sentry.util.a f12772b = new io.sentry.util.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Map f12773c = null;

    public d(ILogger iLogger) {
        this.f12771a = iLogger;
    }

    @Override // io.sentry.internal.modules.a
    public final Map a() {
        if (this.f12773c == null) {
            r rVarA = this.f12772b.a();
            try {
                if (this.f12773c == null) {
                    this.f12773c = b();
                }
                rVarA.close();
            } catch (Throwable th2) {
                try {
                    rVarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return this.f12773c;
    }

    public abstract Map b();

    public final TreeMap c(InputStream inputStream) {
        ILogger iLogger = this.f12771a;
        TreeMap treeMap = new TreeMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, f12770d));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    int iLastIndexOf = line.lastIndexOf(58);
                    treeMap.put(line.substring(0, iLastIndexOf), line.substring(iLastIndexOf + 1));
                }
                iLogger.q(SentryLevel.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
                bufferedReader.close();
                return treeMap;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            iLogger.g(SentryLevel.ERROR, "Error extracting modules.", e10);
            return treeMap;
        } catch (RuntimeException e11) {
            iLogger.e(SentryLevel.ERROR, e11, "%s file is malformed.", "sentry-external-modules.txt");
            return treeMap;
        }
    }
}
