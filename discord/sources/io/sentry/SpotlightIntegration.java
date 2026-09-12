package io.sentry;

import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
public final class SpotlightIntegration implements l1, i5, Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w5 f12021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ILogger f12022e = j2.f12781d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a1 f12023i = g2.f12684v;

    public static void c(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public static HttpURLConnection f(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) URI.create(str).toURL().openConnection();
        httpURLConnection.setReadTimeout(1000);
        httpURLConnection.setConnectTimeout(1000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12023i.b(0L);
        w5 w5Var = this.f12021d;
        if (w5Var == null || w5Var.getBeforeEnvelopeCallback() != this) {
            return;
        }
        this.f12021d.setBeforeEnvelopeCallback(null);
    }

    @Override // io.sentry.l1
    public final void register(x0 x0Var, w5 w5Var) {
        this.f12021d = w5Var;
        this.f12022e = w5Var.getLogger();
        if (w5Var.getBeforeEnvelopeCallback() != null || !w5Var.isEnableSpotlight()) {
            this.f12022e.q(SentryLevel.DEBUG, "SpotlightIntegration is not enabled. BeforeEnvelopeCallback is already set or spotlight is not enabled.", new Object[0]);
            return;
        }
        this.f12023i = new com.google.firebase.messaging.r(w5Var);
        w5Var.setBeforeEnvelopeCallback(this);
        this.f12022e.q(SentryLevel.DEBUG, "SpotlightIntegration enabled.", new Object[0]);
        c9.a.c("Spotlight");
    }
}
