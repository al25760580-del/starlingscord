package io.sentry.android.core.internal.util;

import android.os.StrictMode;
import android.os.SystemClock;
import com.discord.chat.presentation.message.view.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements io.sentry.transport.f, io.sentry.util.runtime.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f12289d = new d();

    @Override // io.sentry.util.runtime.b
    public void c(a0 a0Var) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        try {
            a0Var.run();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    @Override // io.sentry.transport.f
    public long e() {
        return SystemClock.uptimeMillis();
    }

    @Override // io.sentry.util.runtime.b
    public Object h(io.sentry.util.runtime.a aVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        try {
            return aVar.run();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
            StrictMode.setVmPolicy(vmPolicy);
        }
    }
}
