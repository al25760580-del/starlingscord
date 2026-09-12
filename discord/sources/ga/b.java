package ga;

import a5.b0;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.react.runtime.o;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import pa.p;
import pa.q;
import pa.r;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j8.i f9524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4.e f9525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f9526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f9527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f9528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f9529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f9530g;

    public b(j8.i fileCache, e4.e pooledByteBufferFactory, b0 pooledByteStreams, Executor readExecutor, Executor writeExecutor, k imageCacheStatsTracker) {
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(pooledByteStreams, "pooledByteStreams");
        Intrinsics.checkNotNullParameter(readExecutor, "readExecutor");
        Intrinsics.checkNotNullParameter(writeExecutor, "writeExecutor");
        Intrinsics.checkNotNullParameter(imageCacheStatsTracker, "imageCacheStatsTracker");
        this.f9524a = fileCache;
        this.f9525b = pooledByteBufferFactory;
        this.f9526c = pooledByteStreams;
        this.f9527d = readExecutor;
        this.f9528e = writeExecutor;
        this.f9529f = imageCacheStatsTracker;
        l lVar = new l(0, false);
        lVar.f9547e = new HashMap();
        Intrinsics.checkNotNullExpressionValue(lVar, "getInstance(...)");
        this.f9530g = lVar;
    }

    public final void a() {
        this.f9530g.j();
        try {
            j4.e.a(new f4.e(1, this), this.f9528e);
        } catch (Exception e10) {
            o8.a.u(e10, "Failed to schedule disk-cache clear", new Object[0]);
            j4.e.b(e10);
        }
    }

    public final boolean b(CacheKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(key, "key");
        l lVar = this.f9530g;
        synchronized (lVar) {
            key.getClass();
            if (((HashMap) lVar.f9547e).containsKey(key)) {
                EncodedImage encodedImage = (EncodedImage) ((HashMap) lVar.f9547e).get(key);
                synchronized (encodedImage) {
                    if (EncodedImage.isValid(encodedImage)) {
                        return true;
                    }
                    ((HashMap) lVar.f9547e).remove(key);
                    o8.a.t(l.class, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(encodedImage)), key.c(), Integer.valueOf(System.identityHashCode(key)));
                }
            }
            if (((j8.g) this.f9524a).f(key)) {
                return true;
            }
            k kVar = this.f9529f;
            EncodedImage encodedImageK = this.f9530g.k(key);
            if (encodedImageK != null) {
                encodedImageK.close();
                o8.a.q("Found image for %s in staging area", key.c(), b.class);
                kVar.getClass();
                return true;
            }
            o8.a.q("Did not find image for %s in staging area", key.c(), b.class);
            kVar.getClass();
            try {
                return ((j8.g) this.f9524a).e(key);
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public final q c(CacheKey cacheKey) throws IOException {
        k kVar = this.f9529f;
        try {
            o8.a.q("Disk cache read for %s", cacheKey.c(), b.class);
            h8.a aVarC = ((j8.g) this.f9524a).c(cacheKey);
            if (aVarC == null) {
                o8.a.q("Disk cache miss for %s", cacheKey.c(), b.class);
                kVar.getClass();
                return null;
            }
            o8.a.q("Found entry in disk cache for %s", cacheKey.c(), b.class);
            kVar.getClass();
            FileInputStream inputStream = new FileInputStream(aVarC.f10388a);
            try {
                e4.e eVar = this.f9525b;
                int length = (int) aVarC.f10388a.length();
                eVar.getClass();
                Intrinsics.checkNotNullParameter(inputStream, "inputStream");
                r outputStream = new r((p) eVar.f7971e, length);
                try {
                    Intrinsics.checkNotNullParameter(inputStream, "inputStream");
                    Intrinsics.checkNotNullParameter(outputStream, "outputStream");
                    ((b0) eVar.f7972i).p(inputStream, outputStream);
                    q qVarF = outputStream.f();
                    outputStream.close();
                    inputStream.close();
                    o8.a.q("Successful read from disk cache for %s", cacheKey.c(), b.class);
                    return qVarF;
                } catch (Throwable th2) {
                    outputStream.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                inputStream.close();
                throw th3;
            }
        } catch (IOException e10) {
            o8.a.u(e10, "Exception reading from cache for %s", cacheKey.c());
            kVar.getClass();
            throw e10;
        }
    }

    public final void d(CacheKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f9530g.r(key);
        try {
            j4.e.a(new o(2, this, key), this.f9528e);
        } catch (Exception e10) {
            o8.a.u(e10, "Failed to schedule disk-cache remove for %s", key.c());
            j4.e.b(e10);
        }
    }

    public final void e(CacheKey cacheKey, EncodedImage encodedImage) {
        o8.a.q("About to write to disk-cache for key %s", cacheKey.c(), b.class);
        try {
            ((j8.g) this.f9524a).g(cacheKey, new bc.i(14, encodedImage, this));
            this.f9529f.getClass();
            o8.a.q("Successful disk-cache write for key %s", cacheKey.c(), b.class);
        } catch (IOException e10) {
            o8.a.u(e10, "Failed to write to disk-cache for key %s", cacheKey.c());
        }
    }
}
