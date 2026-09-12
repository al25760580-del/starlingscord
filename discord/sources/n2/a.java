package n2;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f16241e;

    public a(g gVar) {
        this.f16241e = gVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j5 = this.f16240d;
            g gVar = this.f16241e;
            if (j5 != j) {
                if (j5 >= 0 && j >= j5 + ((long) gVar.f16242d.available())) {
                    return -1;
                }
                gVar.f(j);
                this.f16240d = j;
            }
            if (i10 > gVar.f16242d.available()) {
                i10 = gVar.f16242d.available();
            }
            int i11 = gVar.read(bArr, i7, i10);
            if (i11 >= 0) {
                this.f16240d += (long) i11;
                return i11;
            }
        } catch (IOException unused) {
        }
        this.f16240d = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
