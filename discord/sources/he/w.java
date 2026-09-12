package he;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.animated.InterpolationAnimatedNode;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends h {
    public final e4.l E;
    public HttpURLConnection F;
    public InputStream G;
    public boolean H;
    public int I;
    public long J;
    public long K;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f10715w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f10716x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4.l f10717y;

    public w(int i7, int i10, e4.l lVar) {
        super(true);
        this.f10715w = i7;
        this.f10716x = i10;
        this.f10717y = lVar;
        this.E = new e4.l(7);
    }

    public static void j(HttpURLConnection httpURLConnection, long j) {
        int i7;
        if (httpURLConnection == null || (i7 = je.e0.f13788a) < 19 || i7 > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
        try {
            InputStream inputStream = this.G;
            if (inputStream != null) {
                long j = this.J;
                long j5 = -1;
                if (j != -1) {
                    j5 = j - this.K;
                }
                j(this.F, j5);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    int i7 = je.e0.f13788a;
                    throw new b0(e10, 2000, 3);
                }
            }
            this.G = null;
            h();
            if (this.H) {
                this.H = false;
                c();
            }
        } catch (Throwable th2) {
            this.G = null;
            h();
            if (this.H) {
                this.H = false;
                c();
            }
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long d(p pVar) throws b0 {
        long j = 0;
        this.K = 0L;
        this.J = 0L;
        e();
        try {
            HttpURLConnection httpURLConnectionI = i(new URL(pVar.f10649a.toString()), pVar.f10651c, pVar.f10652d, pVar.f10654f, pVar.f10655g, (pVar.f10657i & 1) == 1, true, pVar.f10653e);
            long j5 = pVar.f10654f;
            long j7 = pVar.f10655g;
            this.F = httpURLConnectionI;
            this.I = httpURLConnectionI.getResponseCode();
            httpURLConnectionI.getResponseMessage();
            int i7 = this.I;
            if (i7 < 200 || i7 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionI.getHeaderFields();
                if (this.I == 416 && j5 == e0.c(httpURLConnectionI.getHeaderField("Content-Range"))) {
                    this.H = true;
                    f(pVar);
                    if (j7 != -1) {
                        return j7;
                    }
                    return 0L;
                }
                InputStream errorStream = httpURLConnectionI.getErrorStream();
                try {
                    if (errorStream != null) {
                        je.e0.T(errorStream);
                    } else {
                        int i10 = je.e0.f13788a;
                    }
                } catch (IOException unused) {
                    int i11 = je.e0.f13788a;
                }
                h();
                throw new d0(this.I, this.I == 416 ? new m(2008) : null, headerFields);
            }
            httpURLConnectionI.getContentType();
            if (this.I == 200 && j5 != 0) {
                j = j5;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionI.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase || j7 != -1) {
                this.J = j7;
            } else {
                long jB = e0.b(httpURLConnectionI.getHeaderField("Content-Length"), httpURLConnectionI.getHeaderField("Content-Range"));
                this.J = jB != -1 ? jB - j : -1L;
            }
            try {
                this.G = httpURLConnectionI.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.G = new GZIPInputStream(this.G);
                }
                this.H = true;
                f(pVar);
                try {
                    k(j);
                    return this.J;
                } catch (IOException e10) {
                    h();
                    if (e10 instanceof b0) {
                        throw ((b0) e10);
                    }
                    throw new b0(e10, 2000, 1);
                }
            } catch (IOException e11) {
                h();
                throw new b0(e11, 2000, 1);
            }
        } catch (IOException e12) {
            h();
            throw b0.a(e12, 1);
        }
    }

    public final void h() {
        HttpURLConnection httpURLConnection = this.F;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                je.b.s("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.F = null;
        }
    }

    public final HttpURLConnection i(URL url, int i7, byte[] bArr, long j, long j5, boolean z5, boolean z6, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f10715w);
        httpURLConnection.setReadTimeout(this.f10716x);
        HashMap map2 = new HashMap();
        e4.l lVar = this.f10717y;
        if (lVar != null) {
            map2.putAll(lVar.p());
        }
        map2.putAll(this.E.p());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = e0.a(j, j5);
        if (strA != null) {
            httpURLConnection.setRequestProperty("Range", strA);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z5 ? "gzip" : InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY);
        httpURLConnection.setInstanceFollowRedirects(z6);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(p.b(i7));
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    public final void k(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];
        while (j > 0) {
            int iMin = (int) Math.min(j, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
            InputStream inputStream = this.G;
            int i7 = je.e0.f13788a;
            int i10 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new b0(new InterruptedIOException(), 2000, 1);
            }
            if (i10 == -1) {
                throw new b0(2008);
            }
            j -= (long) i10;
            b(i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // he.k
    public final int read(byte[] bArr, int i7, int i10) throws b0 {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        try {
            long j = this.J;
            if (j != -1) {
                long j5 = j - this.K;
                if (j5 != 0) {
                    i10 = (int) Math.min(i10, j5);
                    InputStream inputStream = this.G;
                    int i12 = je.e0.f13788a;
                    i11 = inputStream.read(bArr, i7, i10);
                    if (i11 != -1) {
                        this.K += (long) i11;
                        b(i11);
                        return i11;
                    }
                }
            } else {
                InputStream inputStream2 = this.G;
                int i13 = je.e0.f13788a;
                i11 = inputStream2.read(bArr, i7, i10);
                if (i11 != -1) {
                    this.K += (long) i11;
                    b(i11);
                    return i11;
                }
            }
            return -1;
        } catch (IOException e10) {
            int i14 = je.e0.f13788a;
            throw b0.a(e10, 2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Map s() {
        HttpURLConnection httpURLConnection = this.F;
        return httpURLConnection == null ? ei.w0.f8376y : new v(httpURLConnection.getHeaderFields());
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri y() {
        HttpURLConnection httpURLConnection = this.F;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }
}
