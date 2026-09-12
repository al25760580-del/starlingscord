package na;

import com.facebook.common.references.CloseableReference;
import com.google.firebase.messaging.r;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public r f16525v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f16526w;

    @Override // na.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                r rVar = this.f16525v;
                if (rVar == null) {
                    return;
                }
                this.f16525v = null;
                synchronized (rVar) {
                    CloseableReference.l((CloseableReference) rVar.f6612i);
                    rVar.f6612i = null;
                    CloseableReference.n((ArrayList) rVar.f6613v);
                    rVar.f6613v = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // na.c, com.facebook.imagepipeline.image.ImageInfo
    public final synchronized int getHeight() {
        r rVar;
        rVar = this.f16525v;
        return rVar == null ? 0 : ((aa.b) rVar.f6611e).getHeight();
    }

    @Override // na.c, com.facebook.imagepipeline.image.ImageInfo
    public final synchronized int getWidth() {
        r rVar;
        rVar = this.f16525v;
        return rVar == null ? 0 : ((aa.b) rVar.f6611e).getWidth();
    }

    @Override // na.a, na.c
    public final boolean h0() {
        return this.f16526w;
    }

    @Override // na.c
    public final synchronized boolean isClosed() {
        return this.f16525v == null;
    }

    @Override // na.c
    public final synchronized int j() {
        r rVar;
        rVar = this.f16525v;
        return rVar == null ? 0 : ((aa.b) rVar.f6611e).j();
    }
}
