package io.sentry;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x3 implements ig.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13275e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f13276i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f13277v;

    public /* synthetic */ x3(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f13274d = obj;
        this.f13275e = obj2;
        this.f13276i = obj3;
        this.f13277v = obj4;
    }

    public void a() {
        ILogger iLogger = (ILogger) this.f13274d;
        String str = (String) this.f13275e;
        v vVar = (v) this.f13276i;
        File file = (File) this.f13277v;
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        iLogger.q(sentryLevel, "Started processing cached files from %s", str);
        n6 n6Var = vVar.f13242d;
        ILogger iLogger2 = vVar.f13240b;
        try {
            iLogger2.q(sentryLevel, "Processing dir. %s", file.getAbsolutePath());
            File[] fileArrListFiles = file.listFiles(new t(0, vVar));
            if (fileArrListFiles == null) {
                iLogger2.q(SentryLevel.ERROR, "Cache dir %s is null or is not a directory.", file.getAbsolutePath());
            } else {
                iLogger2.q(sentryLevel, "Processing %d items from cache dir %s", Integer.valueOf(fileArrListFiles.length), file.getAbsolutePath());
                int length = fileArrListFiles.length;
                int i7 = 0;
                int i10 = 0;
                while (i10 < length) {
                    File file2 = fileArrListFiles[i10];
                    if (file2.isFile()) {
                        String absolutePath = file2.getAbsolutePath();
                        if (!n6Var.contains(absolutePath)) {
                            io.sentry.transport.p pVarD = vVar.f13239a.d();
                            if (pVarD != null && pVarD.f(l.All)) {
                                iLogger2.q(SentryLevel.INFO, "DirectoryProcessor, rate limiting active.", new Object[i7]);
                                break;
                            } else {
                                iLogger2.q(SentryLevel.DEBUG, "Processing file: %s", absolutePath);
                                vVar.b(file2, a5.l0.p(new u(vVar.f13241c, vVar.f13240b, absolutePath, n6Var)));
                                Thread.sleep(100L);
                            }
                        } else {
                            iLogger2.q(SentryLevel.DEBUG, "File '%s' has already been processed so it will not be processed again.", absolutePath);
                        }
                    } else {
                        iLogger2.q(SentryLevel.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                    }
                    i10++;
                    i7 = 0;
                }
            }
        } catch (Throwable th2) {
            iLogger2.e(SentryLevel.ERROR, th2, "Failed processing '%s'", file.getAbsolutePath());
        }
        iLogger.q(SentryLevel.DEBUG, "Finished processing cached files from %s", str);
    }

    @Override // ig.c
    public void onFailure(Exception exc) {
        CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2((CredentialProviderPlayServicesImpl) this.f13274d, (CancellationSignal) this.f13275e, (Executor) this.f13276i, (n1.h) this.f13277v, exc);
    }
}
