package io.sentry.internal.modules;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.p;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import w3.q;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12775e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f12776f;

    public f(List list, ILogger iLogger) {
        super(iLogger);
        this.f12776f = list;
    }

    @Override // io.sentry.internal.modules.d
    public final Map b() {
        switch (this.f12775e) {
            case 0:
                ILogger iLogger = this.f12771a;
                TreeMap treeMap = new TreeMap();
                try {
                    InputStream resourceAsStream = ((ClassLoader) this.f12776f).getResourceAsStream("sentry-external-modules.txt");
                    try {
                        if (resourceAsStream == null) {
                            iLogger.q(SentryLevel.INFO, "%s file was not found.", "sentry-external-modules.txt");
                            if (resourceAsStream != null) {
                                resourceAsStream.close();
                            }
                        } else {
                            TreeMap treeMapC = c(resourceAsStream);
                            resourceAsStream.close();
                            treeMap = treeMapC;
                        }
                    } catch (Throwable th2) {
                        if (resourceAsStream != null) {
                            try {
                                resourceAsStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            break;
                        }
                        throw th2;
                    }
                    break;
                } catch (IOException e10) {
                    iLogger.g(SentryLevel.INFO, "Access to resources failed.", e10);
                } catch (SecurityException e11) {
                    iLogger.g(SentryLevel.INFO, "Access to resources denied.", e11);
                }
                return treeMap;
            case 1:
                ILogger iLogger2 = this.f12771a;
                TreeMap treeMap2 = new TreeMap();
                try {
                    InputStream inputStreamOpen = ((Context) this.f12776f).getAssets().open("sentry-external-modules.txt");
                    try {
                        TreeMap treeMapC2 = c(inputStreamOpen);
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                        return treeMapC2;
                    } catch (Throwable th4) {
                        if (inputStreamOpen != null) {
                            try {
                                inputStreamOpen.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            break;
                        }
                        throw th4;
                    }
                } catch (FileNotFoundException unused) {
                    iLogger2.q(SentryLevel.INFO, "%s file was not found.", "sentry-external-modules.txt");
                    return treeMap2;
                } catch (IOException e12) {
                    iLogger2.g(SentryLevel.ERROR, "Error extracting modules.", e12);
                    return treeMap2;
                }
            default:
                TreeMap treeMap3 = new TreeMap();
                Iterator it = ((List) this.f12776f).iterator();
                while (it.hasNext()) {
                    Map mapA = ((a) it.next()).a();
                    if (mapA != null) {
                        treeMap3.putAll(mapA);
                    }
                }
                return treeMap3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ILogger iLogger) {
        super(iLogger);
        ClassLoader classLoader = f.class.getClassLoader();
        this.f12776f = q.j(classLoader);
    }

    public f(Context context, ILogger iLogger) {
        super(iLogger);
        Context applicationContext = context.getApplicationContext();
        this.f12776f = applicationContext != null ? applicationContext : context;
        new Thread(new p(3, this)).start();
    }
}
