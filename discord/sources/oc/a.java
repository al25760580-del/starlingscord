package oc;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.google.common.util.concurrent.SettableFuture;
import cs.r;
import e4.l;
import gc.f0;
import gs.i;
import he.b0;
import he.d0;
import he.e0;
import he.h;
import he.m;
import he.p;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import u4.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h {
    public final l E;
    public Response F;
    public InputStream G;
    public boolean H;
    public long I;
    public long J;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Call.Factory f17199w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final l f17200x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f17201y;

    static {
        f0.a("goog.exo.okhttp");
    }

    public a(Call.Factory factory, String str, l lVar) {
        super(true);
        factory.getClass();
        this.f17199w = factory;
        this.f17201y = str;
        this.E = lVar;
        this.f17200x = new l(7);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
        if (this.H) {
            this.H = false;
            c();
            h();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long d(p pVar) throws b0 {
        HttpUrl url;
        this.J = 0L;
        this.I = 0L;
        e();
        long j = pVar.f10654f;
        int i7 = pVar.f10651c;
        long j5 = pVar.f10655g;
        String string = pVar.f10649a.toString();
        Intrinsics.checkNotNullParameter(string, "<this>");
        try {
            Intrinsics.checkNotNullParameter(string, "<this>");
            r rVar = new r(0);
            rVar.g(null, string);
            url = rVar.b();
        } catch (IllegalArgumentException unused) {
            url = null;
        }
        if (url == null) {
            throw new b0("Malformed URL", 1004);
        }
        Request.Builder builder = new Request.Builder();
        Intrinsics.checkNotNullParameter(url, "url");
        builder.f17374a = url;
        HashMap map = new HashMap();
        l lVar = this.E;
        if (lVar != null) {
            map.putAll(lVar.p());
        }
        map.putAll(this.f17200x.p());
        map.putAll(pVar.f10653e);
        for (Map.Entry entry : map.entrySet()) {
            builder.d((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = e0.a(j, j5);
        if (strA != null) {
            builder.a("Range", strA);
        }
        String str = this.f17201y;
        if (str != null) {
            builder.a("User-Agent", str);
        }
        if ((pVar.f10657i & 1) != 1) {
            builder.a("Accept-Encoding", InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY);
        }
        byte[] bArr = pVar.f10652d;
        builder.f(p.b(i7), bArr != null ? RequestBody.create((MediaType) null, bArr) : i7 == 2 ? RequestBody.create((MediaType) null, je.e0.f13793f) : null);
        i iVarA = this.f17199w.a(builder.b());
        try {
            SettableFuture settableFuture = new SettableFuture();
            iVarA.d(new c(settableFuture));
            try {
                Response response = (Response) settableFuture.get();
                this.F = response;
                ResponseBody responseBody = response.f17385y;
                responseBody.getClass();
                this.G = responseBody.byteStream();
                int i10 = response.f17382v;
                if (response.g()) {
                    responseBody.contentType();
                    long j7 = (i10 != 200 || j == 0) ? 0L : j;
                    if (j5 != -1) {
                        this.I = j5;
                    } else {
                        long jContentLength = responseBody.contentLength();
                        this.I = jContentLength != -1 ? jContentLength - j7 : -1L;
                    }
                    this.H = true;
                    f(pVar);
                    try {
                        i(j7);
                        return this.I;
                    } catch (b0 e10) {
                        h();
                        throw e10;
                    }
                }
                if (i10 == 416 && j == e0.c(response.f17384x.a("Content-Range"))) {
                    this.H = true;
                    f(pVar);
                    if (j5 != -1) {
                        return j5;
                    }
                    return 0L;
                }
                try {
                    InputStream inputStream = this.G;
                    inputStream.getClass();
                    je.e0.T(inputStream);
                } catch (IOException unused2) {
                    int i11 = je.e0.f13788a;
                }
                TreeMap treeMapE = response.f17384x.e();
                h();
                throw new d0(i10, i10 == 416 ? new m(2008) : null, treeMapE);
            } catch (InterruptedException unused3) {
                iVarA.cancel();
                throw new InterruptedIOException();
            } catch (ExecutionException e11) {
                throw new IOException(e11);
            }
        } catch (IOException e12) {
            throw b0.a(e12, 1);
        }
    }

    public final void h() {
        Response response = this.F;
        if (response != null) {
            ResponseBody responseBody = response.f17385y;
            responseBody.getClass();
            responseBody.close();
            this.F = null;
        }
        this.G = null;
    }

    public final void i(long j) throws b0 {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];
        while (j > 0) {
            try {
                int iMin = (int) Math.min(j, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
                InputStream inputStream = this.G;
                int i7 = je.e0.f13788a;
                int i10 = inputStream.read(bArr, 0, iMin);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (i10 == -1) {
                    throw new b0(2008);
                }
                j -= (long) i10;
                b(i10);
            } catch (IOException e10) {
                if (!(e10 instanceof b0)) {
                    throw new b0(2000);
                }
                throw ((b0) e10);
            }
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
            long j = this.I;
            if (j != -1) {
                long j5 = j - this.J;
                if (j5 != 0) {
                    i10 = (int) Math.min(i10, j5);
                    InputStream inputStream = this.G;
                    int i12 = je.e0.f13788a;
                    i11 = inputStream.read(bArr, i7, i10);
                    if (i11 != -1) {
                        this.J += (long) i11;
                        b(i11);
                        return i11;
                    }
                }
            } else {
                InputStream inputStream2 = this.G;
                int i13 = je.e0.f13788a;
                i11 = inputStream2.read(bArr, i7, i10);
                if (i11 != -1) {
                    this.J += (long) i11;
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
        Response response = this.F;
        return response == null ? Collections.EMPTY_MAP : response.f17384x.e();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri y() {
        Response response = this.F;
        if (response == null) {
            return null;
        }
        return Uri.parse(response.f17379d.f17368a.f17327h);
    }
}
