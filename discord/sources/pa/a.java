package pa;

import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements o, Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SharedMemory f17793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteBuffer f17794e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f17795i;

    public a(int i7) {
        n8.i.a(Boolean.valueOf(i7 > 0));
        try {
            SharedMemory sharedMemoryCreate = SharedMemory.create("AshmemMemoryChunk", i7);
            this.f17793d = sharedMemoryCreate;
            this.f17794e = sharedMemoryCreate.mapReadWrite();
            this.f17795i = System.identityHashCode(this);
        } catch (ErrnoException e10) {
            throw new RuntimeException("Fail to create AshmemMemory", e10);
        }
    }

    @Override // pa.o
    public final long c() {
        return this.f17795i;
    }

    @Override // pa.o, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.f17793d;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.f17794e;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.f17794e = null;
                this.f17793d = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // pa.o
    public final synchronized byte f(int i7) {
        boolean z5 = true;
        n8.i.e(!isClosed());
        n8.i.a(Boolean.valueOf(i7 >= 0));
        if (i7 >= u()) {
            z5 = false;
        }
        n8.i.a(Boolean.valueOf(z5));
        this.f17794e.getClass();
        return this.f17794e.get(i7);
    }

    @Override // pa.o
    public final ByteBuffer g() {
        return this.f17794e;
    }

    @Override // pa.o
    public final synchronized int i(int i7, int i10, int i11, byte[] bArr) {
        int iC;
        this.f17794e.getClass();
        iC = w3.q.c(i7, i11, u());
        w3.q.i(i7, bArr.length, i10, iC, u());
        this.f17794e.position(i7);
        this.f17794e.get(bArr, i10, iC);
        return iC;
    }

    @Override // pa.o
    public final synchronized boolean isClosed() {
        return this.f17794e == null || this.f17793d == null;
    }

    @Override // pa.o
    public final synchronized int l(int i7, int i10, int i11, byte[] bArr) {
        int iC;
        this.f17794e.getClass();
        iC = w3.q.c(i7, i11, u());
        w3.q.i(i7, bArr.length, i10, iC, u());
        this.f17794e.position(i7);
        this.f17794e.put(bArr, i10, iC);
        return iC;
    }

    @Override // pa.o
    public final void n(o oVar, int i7) {
        oVar.getClass();
        if (oVar.c() == this.f17795i) {
            Log.w("AshmemMemoryChunk", "Copying from AshmemMemoryChunk " + Long.toHexString(this.f17795i) + " to AshmemMemoryChunk " + Long.toHexString(oVar.c()) + " which are the same ");
            n8.i.a(Boolean.FALSE);
        }
        if (oVar.c() < this.f17795i) {
            synchronized (oVar) {
                synchronized (this) {
                    y(oVar, i7);
                }
            }
        } else {
            synchronized (this) {
                synchronized (oVar) {
                    y(oVar, i7);
                }
            }
        }
    }

    @Override // pa.o
    public final long q() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    @Override // pa.o
    public final int u() {
        this.f17793d.getClass();
        return this.f17793d.getSize();
    }

    public final void y(o oVar, int i7) {
        if (!(oVar instanceof a)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        n8.i.e(!isClosed());
        a aVar = (a) oVar;
        n8.i.e(!aVar.isClosed());
        this.f17794e.getClass();
        aVar.f17794e.getClass();
        w3.q.i(0, aVar.u(), 0, i7, u());
        this.f17794e.position(0);
        aVar.f17794e.position(0);
        byte[] bArr = new byte[i7];
        this.f17794e.get(bArr, 0, i7);
        aVar.f17794e.put(bArr, 0, i7);
    }
}
