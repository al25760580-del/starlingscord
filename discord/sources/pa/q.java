package pa;

import androidx.datastore.preferences.protobuf.d1;
import com.facebook.common.references.CloseableReference;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CloseableReference f17825e;

    public q(r8.b bVar, int i7) {
        bVar.getClass();
        if (!(i7 >= 0 && i7 <= ((o) bVar.q()).u())) {
            throw new IllegalArgumentException();
        }
        this.f17825e = bVar.clone();
        this.f17824d = i7;
    }

    public final synchronized void c() {
        synchronized (this) {
        }
        if (!CloseableReference.z(this.f17825e)) {
            throw new d1("Invalid bytebuf. Already closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        CloseableReference.l(this.f17825e);
        this.f17825e = null;
    }

    public final synchronized ByteBuffer f() {
        this.f17825e.getClass();
        return ((o) this.f17825e.q()).g();
    }

    public final synchronized long g() {
        c();
        this.f17825e.getClass();
        return ((o) this.f17825e.q()).q();
    }

    public final synchronized byte i(int i7) {
        c();
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i7 < this.f17824d)) {
            throw new IllegalArgumentException();
        }
        this.f17825e.getClass();
        return ((o) this.f17825e.q()).f(i7);
    }

    public final synchronized void l(int i7, int i10, int i11, byte[] bArr) {
        c();
        if (!(i7 + i11 <= this.f17824d)) {
            throw new IllegalArgumentException();
        }
        this.f17825e.getClass();
        ((o) this.f17825e.q()).i(i7, i10, i11, bArr);
    }

    public final synchronized int n() {
        c();
        return this.f17824d;
    }
}
