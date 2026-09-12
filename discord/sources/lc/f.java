package lc;

import gc.f0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class f extends a {
    public final int E;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f15009i = new c();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ByteBuffer f15010v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f15011w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f15012x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ByteBuffer f15013y;

    static {
        f0.a("goog.exo.decoder");
    }

    public f(int i7) {
        this.E = i7;
    }

    public void e() {
        this.f14999e = 0;
        ByteBuffer byteBuffer = this.f15010v;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f15013y;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f15011w = false;
    }

    public final ByteBuffer g(int i7) {
        int i10 = this.E;
        if (i10 == 1) {
            return ByteBuffer.allocate(i7);
        }
        if (i10 == 2) {
            return ByteBuffer.allocateDirect(i7);
        }
        ByteBuffer byteBuffer = this.f15010v;
        throw new e(s0.g.c(byteBuffer == null ? 0 : byteBuffer.capacity(), "Buffer too small (", i7, " < ", ")"));
    }

    public final void i(int i7) {
        ByteBuffer byteBuffer = this.f15010v;
        if (byteBuffer == null) {
            this.f15010v = g(i7);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i10 = i7 + iPosition;
        if (iCapacity >= i10) {
            this.f15010v = byteBuffer;
            return;
        }
        ByteBuffer byteBufferG = g(i10);
        byteBufferG.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferG.put(byteBuffer);
        }
        this.f15010v = byteBufferG;
    }

    public final void j() {
        ByteBuffer byteBuffer = this.f15010v;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f15013y;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
