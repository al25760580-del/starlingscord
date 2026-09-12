package pa;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements o, Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f17819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17820e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f17821i = System.identityHashCode(this);

    public i(int i7) {
        this.f17819d = ByteBuffer.allocateDirect(i7);
        this.f17820e = i7;
    }

    @Override // pa.o
    public final long c() {
        return this.f17821i;
    }

    @Override // pa.o, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f17819d = null;
    }

    @Override // pa.o
    public final synchronized byte f(int i7) {
        boolean z5 = true;
        n8.i.e(!isClosed());
        n8.i.a(Boolean.valueOf(i7 >= 0));
        if (i7 >= this.f17820e) {
            z5 = false;
        }
        n8.i.a(Boolean.valueOf(z5));
        this.f17819d.getClass();
        return this.f17819d.get(i7);
    }

    @Override // pa.o
    public final synchronized ByteBuffer g() {
        return this.f17819d;
    }

    @Override // pa.o
    public final synchronized int i(int i7, int i10, int i11, byte[] bArr) {
        int iC;
        n8.i.e(!isClosed());
        this.f17819d.getClass();
        iC = w3.q.c(i7, i11, this.f17820e);
        w3.q.i(i7, bArr.length, i10, iC, this.f17820e);
        this.f17819d.position(i7);
        this.f17819d.get(bArr, i10, iC);
        return iC;
    }

    @Override // pa.o
    public final synchronized boolean isClosed() {
        return this.f17819d == null;
    }

    @Override // pa.o
    public final synchronized int l(int i7, int i10, int i11, byte[] bArr) {
        int iC;
        n8.i.e(!isClosed());
        this.f17819d.getClass();
        iC = w3.q.c(i7, i11, this.f17820e);
        w3.q.i(i7, bArr.length, i10, iC, this.f17820e);
        this.f17819d.position(i7);
        this.f17819d.put(bArr, i10, iC);
        return iC;
    }

    @Override // pa.o
    public final void n(o oVar, int i7) {
        oVar.getClass();
        if (oVar.c() == this.f17821i) {
            Log.w("BufferMemoryChunk", "Copying from BufferMemoryChunk " + Long.toHexString(this.f17821i) + " to BufferMemoryChunk " + Long.toHexString(oVar.c()) + " which are the same ");
            n8.i.a(Boolean.FALSE);
        }
        if (oVar.c() < this.f17821i) {
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
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // pa.o
    public final int u() {
        return this.f17820e;
    }

    public final void y(o oVar, int i7) {
        if (!(oVar instanceof i)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        n8.i.e(!isClosed());
        i iVar = (i) oVar;
        n8.i.e(!iVar.isClosed());
        this.f17819d.getClass();
        w3.q.i(0, iVar.f17820e, 0, i7, this.f17820e);
        this.f17819d.position(0);
        ByteBuffer byteBufferG = iVar.g();
        byteBufferG.getClass();
        byteBufferG.position(0);
        byte[] bArr = new byte[i7];
        this.f17819d.get(bArr, 0, i7);
        byteBufferG.put(bArr, 0, i7);
    }
}
