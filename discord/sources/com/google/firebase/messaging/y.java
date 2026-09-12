package com.google.firebase.messaging;

import a5.l0;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f6635i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f6637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final af.c f6638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f6639d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f6641f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w f6643h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s.e f6640e = new s.e(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6642g = false;

    public y(FirebaseMessaging firebaseMessaging, p pVar, w wVar, af.c cVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f6639d = firebaseMessaging;
        this.f6637b = pVar;
        this.f6643h = wVar;
        this.f6638c = cVar;
        this.f6636a = context;
        this.f6641f = scheduledThreadPoolExecutor;
    }

    public static void a(Task task) throws IOException {
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            l0.i(task, 30L);
        } catch (InterruptedException | TimeoutException e10) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) throws IOException {
        String strA = this.f6639d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        af.c cVar = this.f6638c;
        a(cVar.p(cVar.N(strA, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String strA = this.f6639d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        af.c cVar = this.f6638c;
        a(cVar.p(cVar.N(strA, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z5) {
        this.f6642g = z5;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0105 */
    /* JADX WARN: Code duplicated, block: B:32:0x008b A[Catch: IOException -> 0x0062, TryCatch #2 {IOException -> 0x0062, blocks: (B:15:0x002b, B:32:0x008b, B:34:0x0093, B:20:0x003c, B:22:0x0044, B:24:0x004f, B:27:0x0065, B:29:0x006d, B:31:0x0078), top: B:86:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0093 A[Catch: IOException -> 0x0062, TRY_LEAVE, TryCatch #2 {IOException -> 0x0062, blocks: (B:15:0x002b, B:32:0x008b, B:34:0x0093, B:20:0x003c, B:22:0x0044, B:24:0x004f, B:27:0x0065, B:29:0x006d, B:31:0x0078), top: B:86:0x002b }] */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x0093, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.y.e():boolean");
    }

    public final void f(long j5) {
        this.f6641f.schedule(new a0(this, this.f6636a, this.f6637b, Math.min(Math.max(30L, 2 * j5), f6635i)), j5, TimeUnit.SECONDS);
        d(true);
    }
}
