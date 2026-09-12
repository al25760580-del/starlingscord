package mi;

import android.graphics.Bitmap;
import android.util.Log;
import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.react.common.assets.ReactFontManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements e, ig.d, pc.c, la.b, eh.n, di.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15798e;

    public /* synthetic */ a(int i7, Object obj) {
        this.f15797d = i7;
        this.f15798e = obj;
    }

    @Override // mi.e
    public Object a(zl.e eVar) {
        return this.f15798e;
    }

    @Override // di.e
    public Object apply(Object obj) {
        xc.o oVar = (xc.o) obj;
        ((xc.i) this.f15798e).getClass();
        return oVar;
    }

    public com.rnfs.b b(n8.f fVar) throws IOException {
        tb.b bVar = (tb.b) this.f15798e;
        URL url = (URL) fVar.f16512v;
        String strF = io.sentry.config.a.F("CctTransportBackend");
        if (Log.isLoggable(strF, 4)) {
            Log.i(strF, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bVar.f20683g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) fVar.f16510e;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    pc.r rVar = bVar.f20677a;
                    ub.i iVar = (ub.i) fVar.f16511i;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    si.d dVar = (si.d) rVar.f17922d;
                    si.e eVar = new si.e(bufferedWriter, dVar.f20267a, dVar.f20268b, dVar.f20269c, dVar.f20270d);
                    eVar.f(iVar);
                    eVar.h();
                    eVar.f20272b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strF2 = io.sentry.config.a.F("CctTransportBackend");
                    if (Log.isLoggable(strF2, 4)) {
                        Log.i(strF2, String.format("Status Code: %d", numValueOf));
                    }
                    io.sentry.config.a.k(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    io.sentry.config.a.k(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new com.rnfs.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new com.rnfs.b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            com.rnfs.b bVar2 = new com.rnfs.b(responseCode, null, ub.m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f21012a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar2;
                        } catch (Throwable th2) {
                            if (gZIPInputStream == null) {
                                throw th2;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (Throwable th4) {
                        if (inputStream == null) {
                            throw th4;
                        }
                        try {
                            inputStream.close();
                            throw th4;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                            throw th4;
                        }
                    }
                } catch (Throwable th6) {
                    try {
                        gZIPOutputStream.close();
                        throw th6;
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                        throw th6;
                    }
                }
            } catch (Throwable th8) {
                if (outputStream == null) {
                    throw th8;
                }
                try {
                    outputStream.close();
                    throw th8;
                } catch (Throwable th9) {
                    th8.addSuppressed(th9);
                    throw th8;
                }
            }
        } catch (ConnectException e10) {
            e = e10;
            io.sentry.config.a.p("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new com.rnfs.b(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            io.sentry.config.a.p("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new com.rnfs.b(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            io.sentry.config.a.p("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new com.rnfs.b(ReactFontManager.TypefaceStyle.NORMAL, null, 0L);
        } catch (qi.b e13) {
            e = e13;
            io.sentry.config.a.p("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new com.rnfs.b(ReactFontManager.TypefaceStyle.NORMAL, null, 0L);
        }
    }

    @Override // pc.c
    public long d(long j) {
        pc.p pVar = (pc.p) this.f15798e;
        return e0.j((j * ((long) pVar.f17913e)) / 1000000, 0L, pVar.j - 1);
    }

    @Override // la.b
    public na.c g(EncodedImage encodedImage, int i7, na.k kVar, ImageDecodeOptions imageDecodeOptions) {
        AnimatedFactoryV2Impl animatedFactoryV2Impl = (AnimatedFactoryV2Impl) this.f15798e;
        if (animatedFactoryV2Impl.f4736e == null) {
            animatedFactoryV2Impl.f4736e = new ba.b(new ph.c(animatedFactoryV2Impl), animatedFactoryV2Impl.f4732a, animatedFactoryV2Impl.k);
        }
        ba.b bVar = animatedFactoryV2Impl.f4736e;
        Bitmap.Config config = imageDecodeOptions.f4811b;
        bVar.getClass();
        ba.a aVar = ba.b.f3085b;
        if (aVar == null) {
            throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
        }
        CloseableReference byteBufferRef = encodedImage.getByteBufferRef();
        byteBufferRef.getClass();
        try {
            pa.q qVar = (pa.q) byteBufferRef.q();
            return ba.b.a(encodedImage.getSource(), imageDecodeOptions, qVar.f() != null ? aVar.a(qVar.f(), imageDecodeOptions) : aVar.b(qVar.g(), qVar.n(), imageDecodeOptions));
        } finally {
            byteBufferRef.close();
        }
    }

    @Override // ig.d
    public void onSuccess(Object obj) {
        switch (this.f15797d) {
            case 2:
                ((s1.d) this.f15798e).invoke(obj);
                break;
            case 7:
                ((com.facebook.react.runtime.p) this.f15798e).invoke(obj);
                break;
            case 8:
                ((com.facebook.react.runtime.p) this.f15798e).invoke(obj);
                break;
            case 10:
                ((com.discord.media.engine.video.a) this.f15798e).invoke(obj);
                break;
            case 12:
                ((com.discord.media.engine.video.a) this.f15798e).invoke(obj);
                break;
            case 14:
                ((com.facebook.react.runtime.p) this.f15798e).invoke(obj);
                break;
            default:
                ((t1.e) this.f15798e).invoke(obj);
                break;
        }
    }
}
