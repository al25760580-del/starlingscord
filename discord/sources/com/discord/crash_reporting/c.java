package com.discord.crash_reporting;

import com.facebook.react.runtime.o;
import io.sentry.ILogger;
import io.sentry.c1;
import io.sentry.g3;
import io.sentry.p4;
import io.sentry.protocol.i0;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.concurrent.Callable;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Callable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f4338e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4339i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f4340v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f4341w;

    public /* synthetic */ c(Object obj, long j, Object obj2, Object obj3, int i7) {
        this.f4337d = i7;
        this.f4339i = obj;
        this.f4338e = j;
        this.f4340v = obj2;
        this.f4341w = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws io.sentry.exception.b {
        switch (this.f4337d) {
            case 0:
                return TelemetryRing.snapshot$lambda$6((List) this.f4339i, this.f4338e, (TelemetryRingTypes.Budget) this.f4340v, (Long) this.f4341w);
            case 1:
                io.sentry.a aVar = (io.sentry.a) this.f4339i;
                c1 c1Var = (c1) this.f4340v;
                ILogger iLogger = (ILogger) this.f4341w;
                byte[] bArrC = aVar.f12029a;
                String str = aVar.f12032d;
                long j = this.f4338e;
                if (bArrC == null) {
                    i0 i0Var = aVar.f12030b;
                    if (i0Var != null) {
                        bArrC = io.sentry.util.c.c(c1Var, iLogger, i0Var);
                        if (bArrC != null) {
                            p4.a(bArrC.length, j, str);
                        }
                        throw new io.sentry.exception.b(g.e("Couldn't attach the attachment ", str, ".\nPlease check that either bytes, serializable, path or provider is set."));
                    }
                    o oVar = aVar.f12031c;
                    if (oVar != null && (bArrC = (byte[]) oVar.call()) != null) {
                        p4.a(bArrC.length, j, str);
                    }
                    throw new io.sentry.exception.b(g.e("Couldn't attach the attachment ", str, ".\nPlease check that either bytes, serializable, path or provider is set."));
                }
                p4.a(bArrC.length, j, str);
                return bArrC;
            default:
                File file = (File) this.f4339i;
                g3 g3Var = (g3) this.f4340v;
                c1 c1Var2 = (c1) this.f4341w;
                if (!file.exists()) {
                    throw new io.sentry.exception.b(g.e("Dropping profiling trace data, because the file '", file.getName(), "' doesn't exists"));
                }
                String strR = io.sentry.config.a.r(a.a.w(this.f4338e, file.getPath()));
                if (strR.isEmpty()) {
                    throw new io.sentry.exception.b("Profiling trace file is empty");
                }
                g3Var.Y = strR;
                try {
                    g3Var.I = (List) g3Var.f12688e.call();
                    break;
                } catch (Throwable unused) {
                }
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, p4.f12886d));
                            try {
                                c1Var2.b(g3Var, bufferedWriter);
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                bufferedWriter.close();
                                byteArrayOutputStream.close();
                                file.delete();
                                return byteArray;
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
                                byteArrayOutputStream.close();
                                break;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    } catch (IOException e10) {
                        throw new io.sentry.exception.b("Failed to serialize profiling trace data\n" + e10.getMessage());
                    }
                } catch (Throwable th6) {
                    file.delete();
                    throw th6;
                }
        }
    }
}
