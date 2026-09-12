package io.sentry;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes3.dex */
public final class g2 implements o0, j3, a1, g1, h1, ILogger {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g2 f12682e = new g2(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g2 f12683i = new g2(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final g2 f12684v = new g2(2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final g2 f12685w = new g2(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12686d;

    public /* synthetic */ g2(int i7) {
        this.f12686d = i7;
    }

    @Override // io.sentry.h1
    public io.sentry.transport.g a(w5 w5Var, e4.l lVar) {
        return new io.sentry.transport.c(w5Var, new io.sentry.transport.p(w5Var), w5Var.getTransportGate(), lVar);
    }

    @Override // io.sentry.ILogger
    public void e(SentryLevel sentryLevel, Throwable th2, String str, Object... objArr) {
        PrintStream printStream = System.out;
        String str2 = String.format(str, objArr);
        String string = th2.toString();
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(sentryLevel + ": " + str2 + " \n " + string + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + stringWriter.toString());
    }

    @Override // io.sentry.g1
    public g3 f(e6 e6Var, List list, w5 w5Var) {
        return null;
    }

    @Override // io.sentry.ILogger
    public void g(SentryLevel sentryLevel, String str, Throwable th2) {
        if (th2 == null) {
            q(sentryLevel, str, new Object[0]);
            return;
        }
        PrintStream printStream = System.out;
        String str2 = String.format(str, th2.toString());
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(sentryLevel + ": " + str2 + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + stringWriter.toString());
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: getBreadcrumbConverter */
    public i3 getReplayBreadcrumbConverter() {
        return l2.f12792a;
    }

    @Override // io.sentry.a1
    public Future h(Runnable runnable, long j) {
        return new FutureTask(new g0(1));
    }

    @Override // io.sentry.a1
    public boolean isClosed() {
        return false;
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: isDebugMaskingOverlayEnabled */
    public boolean getDebugMaskingEnabled() {
        return false;
    }

    @Override // io.sentry.g1
    public boolean isRunning() {
        return false;
    }

    @Override // io.sentry.ILogger
    public void q(SentryLevel sentryLevel, String str, Object... objArr) {
        System.out.println(sentryLevel + ": " + String.format(str, objArr));
    }

    @Override // io.sentry.ILogger
    public boolean s(SentryLevel sentryLevel) {
        return true;
    }

    @Override // io.sentry.j3
    public void start() {
        int i7 = this.f12686d;
    }

    @Override // io.sentry.a1
    public Future submit(Runnable runnable) {
        return new FutureTask(new g0(1));
    }

    private final void i() {
    }

    private final void j() {
    }

    @Override // io.sentry.a1
    public void c() {
    }

    @Override // io.sentry.g1
    public void close() {
    }

    @Override // io.sentry.j3
    public void pause() {
    }

    @Override // io.sentry.j3
    public void resume() {
    }

    @Override // io.sentry.j3
    public void stop() {
    }

    @Override // io.sentry.a1
    public void b(long j) {
    }

    @Override // io.sentry.j3
    public void captureReplay(Boolean bool) {
    }

    @Override // io.sentry.g1
    public void d(f1 f1Var) {
    }

    @Override // io.sentry.j3
    public void setBreadcrumbConverter(i3 i3Var) {
    }
}
