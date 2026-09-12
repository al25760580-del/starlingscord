package io.sentry;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z3 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w5 f13305e;

    public /* synthetic */ z3(w5 w5Var, int i7) {
        this.f13304d = i7;
        this.f13305e = w5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13304d) {
            case 0:
                this.f13305e.loadLazyFields();
                return;
            case 1:
                w5 w5Var = this.f13305e;
                String cacheDirPathWithoutDsn = w5Var.getCacheDirPathWithoutDsn();
                if (cacheDirPathWithoutDsn != null) {
                    File file = new File(cacheDirPathWithoutDsn, "app_start_profiling_config");
                    try {
                        a.a.d(file);
                        if (w5Var.isEnableAppStartProfiling() || w5Var.isStartProfilerOnAppStart()) {
                            if (!w5Var.isStartProfilerOnAppStart() && !w5Var.isTracingEnabled()) {
                                w5Var.getLogger().q(SentryLevel.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                                return;
                            }
                            if (file.createNewFile()) {
                                d4 d4Var = new d4(w5Var, w5Var.isEnableAppStartProfiling() ? w5Var.getInternalTracesSampler().a(new e4.r(new q6("app.launch", "profile"), Double.valueOf(io.sentry.util.j.a().c()))) : new e9.b(Boolean.FALSE, null));
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, c4.f12517e));
                                    try {
                                        w5Var.getSerializer().b(d4Var, bufferedWriter);
                                        bufferedWriter.close();
                                        fileOutputStream.close();
                                        return;
                                    } catch (Throwable th2) {
                                        try {
                                            bufferedWriter.close();
                                            break;
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                        }
                                        throw th2;
                                    }
                                } catch (Throwable th4) {
                                    try {
                                        fileOutputStream.close();
                                        break;
                                    } catch (Throwable th5) {
                                        th4.addSuppressed(th5);
                                    }
                                    throw th4;
                                }
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th6) {
                        w5Var.getLogger().g(SentryLevel.ERROR, "Unable to create app start profiling config file. ", th6);
                        return;
                    }
                }
                return;
            case 2:
                w5 w5Var2 = this.f13305e;
                for (r0 r0Var : w5Var2.getOptionsObservers()) {
                    String release = w5Var2.getRelease();
                    io.sentry.cache.e eVar = (io.sentry.cache.e) r0Var;
                    if (release == null) {
                        eVar.a("release.json");
                    } else {
                        eVar.b(release, "release.json");
                    }
                    String proguardUuid = w5Var2.getProguardUuid();
                    if (proguardUuid == null) {
                        eVar.a("proguard-uuid.json");
                    } else {
                        eVar.b(proguardUuid, "proguard-uuid.json");
                    }
                    io.sentry.protocol.t sdkVersion = w5Var2.getSdkVersion();
                    if (sdkVersion == null) {
                        eVar.a("sdk-version.json");
                    } else {
                        eVar.b(sdkVersion, "sdk-version.json");
                    }
                    String dist = w5Var2.getDist();
                    if (dist == null) {
                        eVar.a("dist.json");
                    } else {
                        eVar.b(dist, "dist.json");
                    }
                    String environment = w5Var2.getEnvironment();
                    if (environment == null) {
                        eVar.a("environment.json");
                    } else {
                        eVar.b(environment, "environment.json");
                    }
                    eVar.b(w5Var2.getTags(), "tags.json");
                    Double d6 = w5Var2.getSessionReplay().f12050b;
                    if (d6 == null) {
                        eVar.a("replay-error-sample-rate.json");
                    } else {
                        eVar.b(d6.toString(), "replay-error-sample-rate.json");
                    }
                }
                io.sentry.cache.g gVarFindPersistingScopeObserver = w5Var2.findPersistingScopeObserver();
                if (gVarFindPersistingScopeObserver != null) {
                    try {
                        ((io.sentry.cache.tape.e) gVarFindPersistingScopeObserver.f12543b.a()).clear();
                        break;
                    } catch (IOException e10) {
                        gVarFindPersistingScopeObserver.f12542a.getLogger().g(SentryLevel.ERROR, "Failed to clear breadcrumbs from file queue", e10);
                    }
                    gVarFindPersistingScopeObserver.o("user.json");
                    gVarFindPersistingScopeObserver.o("level.json");
                    gVarFindPersistingScopeObserver.o("request.json");
                    gVarFindPersistingScopeObserver.o("fingerprint.json");
                    gVarFindPersistingScopeObserver.o("contexts.json");
                    gVarFindPersistingScopeObserver.o("extras.json");
                    gVarFindPersistingScopeObserver.o("tags.json");
                    gVarFindPersistingScopeObserver.o("trace.json");
                    gVarFindPersistingScopeObserver.o("transaction.json");
                    return;
                }
                return;
            case 3:
                c4.e(this.f13305e.getFlushTimeoutMillis());
                return;
            default:
                io.sentry.android.core.w0.d(this.f13305e);
                return;
        }
    }
}
