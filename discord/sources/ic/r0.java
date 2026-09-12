package ic;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f11633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f11634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f11635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l f11636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f11637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l f11638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f11639i;
    public q0 j;
    public ByteBuffer k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ShortBuffer f11640l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ByteBuffer f11641m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f11642n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f11643o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f11644p;

    @Override // ic.n
    public final ByteBuffer a() {
        q0 q0Var = this.j;
        if (q0Var != null) {
            int i7 = q0Var.f11612b;
            int i10 = q0Var.f11621m * i7 * 2;
            if (i10 > 0) {
                if (this.k.capacity() < i10) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
                    this.k = byteBufferOrder;
                    this.f11640l = byteBufferOrder.asShortBuffer();
                } else {
                    this.k.clear();
                    this.f11640l.clear();
                }
                ShortBuffer shortBuffer = this.f11640l;
                int iMin = Math.min(shortBuffer.remaining() / i7, q0Var.f11621m);
                int i11 = iMin * i7;
                shortBuffer.put(q0Var.f11620l, 0, i11);
                int i12 = q0Var.f11621m - iMin;
                q0Var.f11621m = i12;
                short[] sArr = q0Var.f11620l;
                System.arraycopy(sArr, i11, sArr, 0, i12 * i7);
                this.f11643o += (long) i10;
                this.k.limit(i10);
                this.f11641m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.f11641m;
        this.f11641m = n.f11577a;
        return byteBuffer;
    }

    @Override // ic.n
    public final l b(l lVar) throws m {
        if (lVar.f11564c != 2) {
            throw new m(lVar);
        }
        int i7 = this.f11632b;
        if (i7 == -1) {
            i7 = lVar.f11562a;
        }
        this.f11635e = lVar;
        l lVar2 = new l(i7, lVar.f11563b, 2);
        this.f11636f = lVar2;
        this.f11639i = true;
        return lVar2;
    }

    @Override // ic.n
    public final boolean c() {
        if (this.f11636f.f11562a != -1) {
            return Math.abs(this.f11633c - 1.0f) >= 1.0E-4f || Math.abs(this.f11634d - 1.0f) >= 1.0E-4f || this.f11636f.f11562a != this.f11635e.f11562a;
        }
        return false;
    }

    @Override // ic.n
    public final void d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            q0 q0Var = this.j;
            q0Var.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f11642n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i7 = q0Var.f11612b;
            int i10 = iRemaining2 / i7;
            short[] sArrC = q0Var.c(q0Var.j, q0Var.k, i10);
            q0Var.j = sArrC;
            shortBufferAsShortBuffer.get(sArrC, q0Var.k * i7, ((i10 * i7) * 2) / 2);
            q0Var.k += i10;
            q0Var.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // ic.n
    public final void e() {
        q0 q0Var = this.j;
        if (q0Var != null) {
            int i7 = q0Var.k;
            float f2 = q0Var.f11613c;
            float f7 = q0Var.f11614d;
            int i10 = q0Var.f11621m + ((int) ((((i7 / (f2 / f7)) + q0Var.f11623o) / (q0Var.f11615e * f7)) + 0.5f));
            short[] sArr = q0Var.j;
            int i11 = q0Var.f11618h * 2;
            q0Var.j = q0Var.c(sArr, i7, i11 + i7);
            int i12 = 0;
            while (true) {
                int i13 = q0Var.f11612b;
                if (i12 >= i11 * i13) {
                    break;
                }
                q0Var.j[(i13 * i7) + i12] = 0;
                i12++;
            }
            q0Var.k = i11 + q0Var.k;
            q0Var.f();
            if (q0Var.f11621m > i10) {
                q0Var.f11621m = i10;
            }
            q0Var.k = 0;
            q0Var.f11626r = 0;
            q0Var.f11623o = 0;
        }
        this.f11644p = true;
    }

    @Override // ic.n
    public final boolean f() {
        if (!this.f11644p) {
            return false;
        }
        q0 q0Var = this.j;
        return q0Var == null || (q0Var.f11621m * q0Var.f11612b) * 2 == 0;
    }

    @Override // ic.n
    public final void flush() {
        if (c()) {
            l lVar = this.f11635e;
            this.f11637g = lVar;
            l lVar2 = this.f11636f;
            this.f11638h = lVar2;
            if (this.f11639i) {
                this.j = new q0(lVar.f11562a, lVar.f11563b, this.f11633c, this.f11634d, lVar2.f11562a);
            } else {
                q0 q0Var = this.j;
                if (q0Var != null) {
                    q0Var.k = 0;
                    q0Var.f11621m = 0;
                    q0Var.f11623o = 0;
                    q0Var.f11624p = 0;
                    q0Var.f11625q = 0;
                    q0Var.f11626r = 0;
                    q0Var.f11627s = 0;
                    q0Var.f11628t = 0;
                    q0Var.f11629u = 0;
                    q0Var.f11630v = 0;
                }
            }
        }
        this.f11641m = n.f11577a;
        this.f11642n = 0L;
        this.f11643o = 0L;
        this.f11644p = false;
    }

    @Override // ic.n
    public final void reset() {
        this.f11633c = 1.0f;
        this.f11634d = 1.0f;
        l lVar = l.f11561e;
        this.f11635e = lVar;
        this.f11636f = lVar;
        this.f11637g = lVar;
        this.f11638h = lVar;
        ByteBuffer byteBuffer = n.f11577a;
        this.k = byteBuffer;
        this.f11640l = byteBuffer.asShortBuffer();
        this.f11641m = byteBuffer;
        this.f11632b = -1;
        this.f11639i = false;
        this.j = null;
        this.f11642n = 0L;
        this.f11643o = 0L;
        this.f11644p = false;
    }
}
