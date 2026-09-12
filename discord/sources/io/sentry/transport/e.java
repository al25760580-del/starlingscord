package io.sentry.transport;

import com.discord.misc.utilities.logThrottle.LogThrottleSingleton;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.t5;
import io.sentry.w5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f13181e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Proxy f13182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4.l f13183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w5 f13184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f13185d;

    public e(w5 w5Var, e4.l lVar, p pVar) {
        Proxy proxy;
        this.f13183b = lVar;
        this.f13184c = w5Var;
        this.f13185d = pVar;
        t5 proxy2 = w5Var.getProxy();
        if (proxy2 != null) {
            String str = proxy2.f13158b;
            try {
                proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxy2.f13157a, Integer.parseInt(str)));
            } catch (NumberFormatException e10) {
                this.f13184c.getLogger().e(SentryLevel.ERROR, e10, s0.g.e("Failed to parse Sentry Proxy port: ", str, ". Proxy is ignored"), new Object[0]);
                proxy = null;
            }
        } else {
            proxy = null;
        }
        this.f13182a = proxy;
        if (proxy == null || w5Var.getProxy() == null) {
            return;
        }
        String str2 = w5Var.getProxy().f13159c;
        String str3 = w5Var.getProxy().f13160d;
        if (str2 == null || str3 == null) {
            return;
        }
        Authenticator.setDefault(new l(str2, str3));
    }

    public static void a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String b(HttpURLConnection httpURLConnection) {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f13181e));
                try {
                    StringBuilder sb2 = new StringBuilder();
                    boolean z5 = true;
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!z5) {
                            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                        }
                        sb2.append(line);
                        z5 = false;
                        if (errorStream != null) {
                            try {
                                errorStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                    String string = sb2.toString();
                    bufferedReader.close();
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    return string;
                } catch (Throwable th3) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                if (errorStream != null) {
                    errorStream.close();
                }
                throw th5;
            }
        } catch (IOException unused) {
            return "Failed to obtain error message while analyzing send failure.";
        }
    }

    public final sa.a c(HttpURLConnection httpURLConnection) {
        w5 w5Var = this.f13184c;
        try {
            int responseCode = httpURLConnection.getResponseCode();
            e(httpURLConnection, responseCode);
            if (responseCode == 200) {
                w5Var.getLogger().q(SentryLevel.DEBUG, "Envelope sent successfully.", new Object[0]);
                return s.f13204g;
            }
            ILogger logger = w5Var.getLogger();
            SentryLevel sentryLevel = SentryLevel.ERROR;
            logger.q(sentryLevel, "Request failed, API returned %s", Integer.valueOf(responseCode));
            if (w5Var.isDebug()) {
                w5Var.getLogger().q(sentryLevel, "%s", b(httpURLConnection));
            }
            return new r(responseCode);
        } catch (IOException e10) {
            w5Var.getLogger().e(SentryLevel.ERROR, e10, "Error reading and logging the response stream", new Object[0]);
            return new r(-1);
        } finally {
            a(httpURLConnection);
        }
    }

    public final sa.a d(e4.c cVar) {
        w5 w5Var = this.f13184c;
        w5Var.getSocketTagger().b();
        e4.l lVar = this.f13183b;
        URL url = (URL) lVar.f7989e;
        Proxy proxy = this.f13182a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) (proxy == null ? url.openConnection() : url.openConnection(proxy));
        for (Map.Entry entry : ((HashMap) lVar.f7990i).entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.setConnectTimeout(w5Var.getConnectionTimeoutMillis());
        httpURLConnection.setReadTimeout(w5Var.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = w5Var.getSslSocketFactory();
        if ((httpURLConnection instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnection.connect();
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    w5Var.getSerializer().a(cVar, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } catch (Throwable th2) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (Throwable th6) {
            try {
                w5Var.getLogger().e(SentryLevel.ERROR, th6, "An exception occurred while submitting the envelope to the Sentry server.", new Object[0]);
            } finally {
                c(httpURLConnection);
                w5Var.getSocketTagger().a();
            }
        }
        return c(httpURLConnection);
    }

    public final void e(HttpURLConnection httpURLConnection, int i7) {
        long j;
        String[] strArr;
        long j5;
        String[] strArr2;
        String string;
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        String headerField2 = httpURLConnection.getHeaderField("X-Sentry-Rate-Limits");
        p pVar = this.f13185d;
        w5 w5Var = pVar.f13197e;
        d dVar = pVar.f13196d;
        double d6 = 1000.0d;
        if (headerField2 == null) {
            if (i7 == 429) {
                if (headerField != null) {
                    try {
                        j = (long) (Double.parseDouble(headerField) * 1000.0d);
                    } catch (NumberFormatException unused) {
                        j = LogThrottleSingleton.RATE_LIMIT_ONE_MINUTE;
                    }
                } else {
                    j = LogThrottleSingleton.RATE_LIMIT_ONE_MINUTE;
                }
                dVar.getClass();
                pVar.c(io.sentry.l.All, new Date(System.currentTimeMillis() + j));
                return;
            }
            return;
        }
        int i10 = -1;
        String[] strArrSplit = headerField2.split(",", -1);
        int length = strArrSplit.length;
        int i11 = 0;
        int i12 = 0;
        while (i12 < length) {
            String[] strArrSplit2 = strArrSplit[i12].replace(" ", "").split(":", i10);
            if (strArrSplit2.length > 0) {
                String str = strArrSplit2[i11];
                if (str != null) {
                    try {
                        j5 = (long) (Double.parseDouble(str) * d6);
                    } catch (NumberFormatException unused2) {
                        j5 = LogThrottleSingleton.RATE_LIMIT_ONE_MINUTE;
                    }
                } else {
                    j5 = LogThrottleSingleton.RATE_LIMIT_ONE_MINUTE;
                }
                if (strArrSplit2.length > 1) {
                    String str2 = strArrSplit2[1];
                    dVar.getClass();
                    Date date = new Date(System.currentTimeMillis() + j5);
                    if (str2 == null || str2.isEmpty()) {
                        strArr = strArrSplit;
                        pVar.c(io.sentry.l.All, date);
                    } else {
                        String[] strArrSplit3 = str2.split(";", i10);
                        int length2 = strArrSplit3.length;
                        int i13 = i11;
                        while (i13 < length2) {
                            String str3 = strArrSplit3[i13];
                            io.sentry.l lVarValueOf = io.sentry.l.Unknown;
                            try {
                                Charset charset = io.sentry.util.l.f13233a;
                                if (str3 == null || str3.isEmpty()) {
                                    string = str3;
                                } else {
                                    String[] strArrSplit4 = io.sentry.util.l.f13234b.split(str3, i10);
                                    StringBuilder sb2 = new StringBuilder();
                                    for (String str4 : strArrSplit4) {
                                        sb2.append(io.sentry.util.l.a(str4));
                                    }
                                    string = sb2.toString();
                                }
                                if (string != null) {
                                    lVarValueOf = io.sentry.l.valueOf(string);
                                    strArr2 = strArrSplit;
                                } else {
                                    strArr2 = strArrSplit;
                                    try {
                                        w5Var.getLogger().q(SentryLevel.ERROR, "Couldn't capitalize: %s", str3);
                                    } catch (IllegalArgumentException e10) {
                                        e = e10;
                                        w5Var.getLogger().e(SentryLevel.INFO, e, "Unknown category: %s", str3);
                                    }
                                }
                            } catch (IllegalArgumentException e11) {
                                e = e11;
                                strArr2 = strArrSplit;
                            }
                            if (!io.sentry.l.Unknown.equals(lVarValueOf)) {
                                pVar.c(lVarValueOf, date);
                            }
                            i13++;
                            strArrSplit = strArr2;
                            i10 = -1;
                        }
                        strArr = strArrSplit;
                    }
                } else {
                    strArr = strArrSplit;
                }
            } else {
                strArr = strArrSplit;
                d6 = d6;
            }
            i12++;
            d6 = d6;
            strArrSplit = strArr;
            i10 = -1;
            i11 = 0;
        }
    }
}
