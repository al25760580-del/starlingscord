package nc;

import a5.i0;
import android.net.Uri;
import android.os.SystemClock;
import com.facebook.react.animated.InterpolationAnimatedNode;
import e4.l;
import gc.f0;
import he.a0;
import he.b0;
import he.d0;
import he.e0;
import he.h;
import he.p;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import je.y;
import kotlin.jvm.internal.LongCompanionObject;
import m3.m;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends h {
    public final int E;
    public final int F;
    public final int G;
    public final l H;
    public final l I;
    public final i0 J;
    public final y K;
    public boolean L;
    public long M;
    public UrlRequest N;
    public p O;
    public ByteBuffer P;
    public UrlResponseInfo Q;
    public IOException R;
    public boolean S;
    public volatile long T;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f16545w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CronetEngine f16546x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Executor f16547y;

    static {
        f0.a("goog.exo.cronet");
    }

    public e(CronetEngine cronetEngine, Executor executor, int i7, int i10, int i11, l lVar) {
        super(true);
        cronetEngine.getClass();
        this.f16546x = cronetEngine;
        executor.getClass();
        this.f16547y = executor;
        this.E = i7;
        this.F = i10;
        this.G = i11;
        this.H = lVar;
        this.K = y.f13866a;
        this.f16545w = new d(this);
        this.I = new l(7);
        this.J = new i0(0);
    }

    public static String i(String str, Map map) {
        List list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final synchronized void close() {
        try {
            UrlRequest urlRequest = this.N;
            if (urlRequest != null) {
                urlRequest.cancel();
                this.N = null;
            }
            ByteBuffer byteBuffer = this.P;
            if (byteBuffer != null) {
                byteBuffer.limit(0);
            }
            this.O = null;
            this.Q = null;
            this.R = null;
            this.S = false;
            if (this.L) {
                this.L = false;
                c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c1  */
    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long d(p pVar) throws b0 {
        long j;
        pVar.getClass();
        je.b.k(!this.L);
        this.J.l();
        this.K.getClass();
        this.T = SystemClock.elapsedRealtime() + ((long) this.F);
        this.O = pVar;
        try {
            UrlRequest urlRequestBuild = h(pVar).build();
            this.N = urlRequestBuild;
            urlRequestBuild.start();
            e();
            try {
                this.K.getClass();
                boolean z5 = false;
                boolean zI = false;
                for (long jElapsedRealtime = SystemClock.elapsedRealtime(); !zI && jElapsedRealtime < this.T; jElapsedRealtime = SystemClock.elapsedRealtime()) {
                    zI = this.J.i((this.T - jElapsedRealtime) + 5);
                    this.K.getClass();
                }
                IOException iOException = this.R;
                if (iOException != null) {
                    String message = iOException.getMessage();
                    if (message != null && m.T(message).contains("err_cleartext_not_permitted")) {
                        throw new a0(iOException);
                    }
                    i0 i0Var = new i0(0);
                    urlRequestBuild.getStatus(new b(new int[1], i0Var));
                    i0Var.h();
                    throw new c(iOException, 2001, 1);
                }
                if (!zI) {
                    SocketTimeoutException socketTimeoutException = new SocketTimeoutException();
                    i0 i0Var2 = new i0(0);
                    urlRequestBuild.getStatus(new b(new int[1], i0Var2));
                    i0Var2.h();
                    throw new c(socketTimeoutException, 2002, 1);
                }
                UrlResponseInfo urlResponseInfo = this.Q;
                urlResponseInfo.getClass();
                int httpStatusCode = urlResponseInfo.getHttpStatusCode();
                Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
                if (httpStatusCode < 200 || httpStatusCode > 299) {
                    if (httpStatusCode == 416) {
                        if (pVar.f10654f == e0.c(i("Content-Range", allHeaders))) {
                            this.L = true;
                            f(pVar);
                            long j5 = pVar.f10655g;
                            if (j5 != -1) {
                                return j5;
                            }
                            return 0L;
                        }
                    }
                    try {
                        l();
                    } catch (IOException unused) {
                        int i7 = je.e0.f13788a;
                    }
                    he.m mVar = httpStatusCode == 416 ? new he.m(2008) : null;
                    urlResponseInfo.getHttpStatusText();
                    throw new d0(httpStatusCode, mVar, allHeaders);
                }
                if (httpStatusCode == 200) {
                    j = pVar.f10654f;
                    if (j == 0) {
                        j = 0;
                    }
                } else {
                    j = 0;
                }
                for (Map.Entry<String, String> entry : urlResponseInfo.getAllHeadersAsList()) {
                    if (entry.getKey().equalsIgnoreCase("Content-Encoding")) {
                        z5 = !entry.getValue().equalsIgnoreCase(InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY);
                        break;
                    }
                }
                if (z5) {
                    this.M = pVar.f10655g;
                } else {
                    long j7 = pVar.f10655g;
                    if (j7 != -1) {
                        this.M = j7;
                    } else {
                        long jB = e0.b(i("Content-Length", allHeaders), i("Content-Range", allHeaders));
                        this.M = jB != -1 ? jB - j : -1L;
                    }
                }
                this.L = true;
                f(pVar);
                if (j != 0) {
                    ByteBuffer byteBufferJ = j();
                    while (j > 0) {
                        try {
                            this.J.l();
                            byteBufferJ.clear();
                            k(byteBufferJ);
                            if (Thread.currentThread().isInterrupted()) {
                                throw new InterruptedIOException();
                            }
                            if (this.S) {
                                throw new c(2008);
                            }
                            byteBufferJ.flip();
                            je.b.k(byteBufferJ.hasRemaining());
                            int iMin = (int) Math.min(byteBufferJ.remaining(), j);
                            byteBufferJ.position(byteBufferJ.position() + iMin);
                            j -= (long) iMin;
                        } catch (IOException e10) {
                            if (e10 instanceof b0) {
                                throw ((b0) e10);
                            }
                            throw new c(e10, e10 instanceof SocketTimeoutException ? 2002 : 2001, 1);
                        }
                    }
                }
                return this.M;
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                throw new c(new InterruptedIOException(), 1004, 1);
            }
        } catch (IOException e11) {
            if (e11 instanceof b0) {
                throw ((b0) e11);
            }
            throw new c(e11, 2000, 1);
        }
    }

    public final UrlRequest.Builder h(p pVar) throws c {
        Uri uri = pVar.f10649a;
        byte[] bArr = pVar.f10652d;
        String string = uri.toString();
        CronetEngine cronetEngine = this.f16546x;
        d dVar = this.f16545w;
        Executor executor = this.f16547y;
        UrlRequest.Builder builderAllowDirectExecutor = cronetEngine.newUrlRequestBuilder(string, dVar, executor).setPriority(this.E).allowDirectExecutor();
        HashMap map = new HashMap();
        l lVar = this.H;
        if (lVar != null) {
            map.putAll(lVar.p());
        }
        map.putAll(this.I.p());
        map.putAll(pVar.f10653e);
        for (Map.Entry entry : map.entrySet()) {
            builderAllowDirectExecutor.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        if (bArr != null && !map.containsKey("Content-Type")) {
            throw new c("HTTP request with non-empty body must set Content-Type", 1004);
        }
        String strA = e0.a(pVar.f10654f, pVar.f10655g);
        if (strA != null) {
            builderAllowDirectExecutor.addHeader("Range", strA);
        }
        builderAllowDirectExecutor.setHttpMethod(p.b(pVar.f10651c));
        if (bArr != null) {
            builderAllowDirectExecutor.setUploadDataProvider(new a(bArr), executor);
        }
        return builderAllowDirectExecutor;
    }

    public final ByteBuffer j() {
        if (this.P == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS);
            this.P = byteBufferAllocateDirect;
            byteBufferAllocateDirect.limit(0);
        }
        return this.P;
    }

    public final void k(ByteBuffer byteBuffer) throws b0 {
        UrlRequest urlRequest = this.N;
        int i7 = je.e0.f13788a;
        urlRequest.read(byteBuffer);
        try {
            if (!this.J.i(this.G)) {
                throw new SocketTimeoutException();
            }
        } catch (InterruptedException unused) {
            if (byteBuffer == this.P) {
                this.P = null;
            }
            Thread.currentThread().interrupt();
            this.R = new InterruptedIOException();
        } catch (SocketTimeoutException e10) {
            if (byteBuffer == this.P) {
                this.P = null;
            }
            this.R = new b0(e10, 2002, 2);
        }
        IOException iOException = this.R;
        if (iOException != null) {
            if (!(iOException instanceof b0)) {
                throw b0.a(iOException, 2);
            }
            throw ((b0) iOException);
        }
    }

    public final byte[] l() throws b0 {
        byte[] bArrCopyOf = je.e0.f13793f;
        ByteBuffer byteBufferJ = j();
        while (!this.S) {
            this.J.l();
            byteBufferJ.clear();
            k(byteBufferJ);
            byteBufferJ.flip();
            if (byteBufferJ.remaining() > 0) {
                int length = bArrCopyOf.length;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, byteBufferJ.remaining() + bArrCopyOf.length);
                byteBufferJ.get(bArrCopyOf, length, byteBufferJ.remaining());
            }
        }
        return bArrCopyOf;
    }

    @Override // he.k
    public final int read(byte[] bArr, int i7, int i10) throws b0 {
        je.b.k(this.L);
        if (i10 == 0) {
            return 0;
        }
        if (this.M == 0) {
            return -1;
        }
        ByteBuffer byteBufferJ = j();
        if (!byteBufferJ.hasRemaining()) {
            this.J.l();
            byteBufferJ.clear();
            int i11 = je.e0.f13788a;
            k(byteBufferJ);
            if (this.S) {
                this.M = 0L;
                return -1;
            }
            byteBufferJ.flip();
            je.b.k(byteBufferJ.hasRemaining());
        }
        long j = this.M;
        if (j == -1) {
            j = LongCompanionObject.MAX_VALUE;
        }
        long[] jArr = {j, byteBufferJ.remaining(), i10};
        long j5 = jArr[0];
        for (int i12 = 1; i12 < 3; i12++) {
            long j7 = jArr[i12];
            if (j7 < j5) {
                j5 = j7;
            }
        }
        int i13 = (int) j5;
        byteBufferJ.get(bArr, i7, i13);
        long j10 = this.M;
        if (j10 != -1) {
            this.M = j10 - ((long) i13);
        }
        b(i13);
        return i13;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Map s() {
        UrlResponseInfo urlResponseInfo = this.Q;
        return urlResponseInfo == null ? Collections.EMPTY_MAP : urlResponseInfo.getAllHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri y() {
        UrlResponseInfo urlResponseInfo = this.Q;
        if (urlResponseInfo == null) {
            return null;
        }
        return Uri.parse(urlResponseInfo.getUrl());
    }
}
