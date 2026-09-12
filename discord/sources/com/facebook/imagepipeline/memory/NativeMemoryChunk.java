package com.facebook.imagepipeline.memory;

import android.util.Log;
import ib.a;
import java.io.Closeable;
import java.nio.ByteBuffer;
import n8.c;
import n8.i;
import pa.o;
import w3.q;

/* JADX INFO: loaded from: classes3.dex */
@c
public class NativeMemoryChunk implements o, Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4910e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4911i;

    static {
        a.z("imagepipeline");
    }

    public NativeMemoryChunk(int i7) {
        if (!(i7 > 0)) {
            throw new IllegalArgumentException();
        }
        this.f4910e = i7;
        this.f4909d = nativeAllocate(i7);
        this.f4911i = false;
    }

    @c
    private static native long nativeAllocate(int i7);

    @c
    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i7, int i10);

    @c
    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i7, int i10);

    @c
    private static native void nativeFree(long j);

    @c
    private static native void nativeMemcpy(long j, long j5, int i7);

    @c
    private static native byte nativeReadByte(long j);

    @Override // pa.o
    public final long c() {
        return this.f4909d;
    }

    @Override // pa.o, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.f4911i) {
            this.f4911i = true;
            nativeFree(this.f4909d);
        }
    }

    @Override // pa.o
    public final synchronized byte f(int i7) {
        boolean z5 = true;
        i.e(!isClosed());
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException();
        }
        if (i7 >= this.f4910e) {
            z5 = false;
        }
        if (!z5) {
            throw new IllegalArgumentException();
        }
        return nativeReadByte(this.f4909d + ((long) i7));
    }

    public final void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        Log.w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ");
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // pa.o
    public final ByteBuffer g() {
        return null;
    }

    @Override // pa.o
    public final synchronized int i(int i7, int i10, int i11, byte[] bArr) {
        int iC;
        i.e(!isClosed());
        iC = q.c(i7, i11, this.f4910e);
        q.i(i7, bArr.length, i10, iC, this.f4910e);
        nativeCopyToByteArray(this.f4909d + ((long) i7), bArr, i10, iC);
        return iC;
    }

    @Override // pa.o
    public final synchronized boolean isClosed() {
        return this.f4911i;
    }

    @Override // pa.o
    public final synchronized int l(int i7, int i10, int i11, byte[] bArr) {
        int iC;
        i.e(!isClosed());
        iC = q.c(i7, i11, this.f4910e);
        q.i(i7, bArr.length, i10, iC, this.f4910e);
        nativeCopyFromByteArray(this.f4909d + ((long) i7), bArr, i10, iC);
        return iC;
    }

    @Override // pa.o
    public final void n(o oVar, int i7) {
        oVar.getClass();
        if (oVar.c() == this.f4909d) {
            Log.w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(oVar)) + " which share the same address " + Long.toHexString(this.f4909d));
            i.a(Boolean.FALSE);
        }
        if (oVar.c() < this.f4909d) {
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
        return this.f4909d;
    }

    @Override // pa.o
    public final int u() {
        return this.f4910e;
    }

    public final void y(o oVar, int i7) {
        if (!(oVar instanceof NativeMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        i.e(!isClosed());
        NativeMemoryChunk nativeMemoryChunk = (NativeMemoryChunk) oVar;
        i.e(!nativeMemoryChunk.isClosed());
        q.i(0, nativeMemoryChunk.f4910e, 0, i7, this.f4910e);
        long j = 0;
        nativeMemcpy(nativeMemoryChunk.f4909d + j, this.f4909d + j, i7);
    }

    public NativeMemoryChunk() {
        this.f4910e = 0;
        this.f4909d = 0L;
        this.f4911i = true;
    }
}
