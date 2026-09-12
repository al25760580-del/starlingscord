package rs;

import java.io.Closeable;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Buffer f19559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19560e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q f19561i;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte[] f19563w;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f19562v = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f19564x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f19565y = -1;

    public final void c(long j) {
        Buffer buffer = this.f19559d;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!this.f19560e) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long j5 = buffer.f17413e;
        if (j <= j5) {
            if (j < 0) {
                throw new IllegalArgumentException(kk.b.i(j, "newSize < 0: ").toString());
            }
            long j7 = j5 - j;
            while (j7 > 0) {
                q qVar = buffer.f17412d;
                Intrinsics.checkNotNull(qVar);
                q qVar2 = qVar.f19602g;
                Intrinsics.checkNotNull(qVar2);
                int i7 = qVar2.f19598c;
                long j10 = i7 - qVar2.f19597b;
                if (j10 > j7) {
                    qVar2.f19598c = i7 - ((int) j7);
                    break;
                } else {
                    buffer.f17412d = qVar2.a();
                    r.a(qVar2);
                    j7 -= j10;
                }
            }
            this.f19561i = null;
            this.f19562v = j;
            this.f19563w = null;
            this.f19564x = -1;
            this.f19565y = -1;
        } else if (j > j5) {
            long j11 = j - j5;
            int i10 = 1;
            boolean z5 = true;
            for (long j12 = 0; j11 > j12; j12 = 0) {
                q qVarQ = buffer.Q(i10);
                int iMin = (int) Math.min(j11, 8192 - qVarQ.f19598c);
                int i11 = qVarQ.f19598c + iMin;
                qVarQ.f19598c = i11;
                j11 -= (long) iMin;
                if (z5) {
                    this.f19561i = qVarQ;
                    this.f19562v = j5;
                    this.f19563w = qVarQ.f19596a;
                    this.f19564x = i11 - iMin;
                    this.f19565y = i11;
                    z5 = false;
                }
                i10 = 1;
            }
        }
        buffer.f17413e = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f19559d == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.f19559d = null;
        this.f19561i = null;
        this.f19562v = -1L;
        this.f19563w = null;
        this.f19564x = -1;
        this.f19565y = -1;
    }

    public final int f(long j) {
        q qVar;
        Buffer buffer = this.f19559d;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j >= -1) {
            long j5 = buffer.f17413e;
            if (j <= j5) {
                if (j == -1 || j == j5) {
                    this.f19561i = null;
                    this.f19562v = j;
                    this.f19563w = null;
                    this.f19564x = -1;
                    this.f19565y = -1;
                    return -1;
                }
                q qVar2 = buffer.f17412d;
                q qVar3 = this.f19561i;
                long j7 = 0;
                if (qVar3 != null) {
                    long j10 = this.f19562v;
                    int i7 = this.f19564x;
                    Intrinsics.checkNotNull(qVar3);
                    long j11 = j10 - ((long) (i7 - qVar3.f19597b));
                    if (j11 > j) {
                        qVar = qVar2;
                        qVar2 = this.f19561i;
                        j5 = j11;
                    } else {
                        qVar = this.f19561i;
                        j7 = j11;
                    }
                } else {
                    qVar = qVar2;
                }
                if (j5 - j > j - j7) {
                    while (true) {
                        Intrinsics.checkNotNull(qVar);
                        long j12 = ((long) (qVar.f19598c - qVar.f19597b)) + j7;
                        if (j < j12) {
                            break;
                        }
                        qVar = qVar.f19601f;
                        j7 = j12;
                    }
                } else {
                    while (j5 > j) {
                        Intrinsics.checkNotNull(qVar2);
                        qVar2 = qVar2.f19602g;
                        Intrinsics.checkNotNull(qVar2);
                        j5 -= (long) (qVar2.f19598c - qVar2.f19597b);
                    }
                    qVar = qVar2;
                    j7 = j5;
                }
                if (this.f19560e) {
                    Intrinsics.checkNotNull(qVar);
                    if (qVar.f19599d) {
                        byte[] bArr = qVar.f19596a;
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
                        q qVar4 = new q(bArrCopyOf, qVar.f19597b, qVar.f19598c, false, true);
                        if (buffer.f17412d == qVar) {
                            buffer.f17412d = qVar4;
                        }
                        qVar.b(qVar4);
                        q qVar5 = qVar4.f19602g;
                        Intrinsics.checkNotNull(qVar5);
                        qVar5.a();
                        qVar = qVar4;
                    }
                }
                this.f19561i = qVar;
                this.f19562v = j;
                Intrinsics.checkNotNull(qVar);
                this.f19563w = qVar.f19596a;
                int i10 = qVar.f19597b + ((int) (j - j7));
                this.f19564x = i10;
                int i11 = qVar.f19598c;
                this.f19565y = i11;
                return i11 - i10;
            }
        }
        StringBuilder sbM = kk.b.m(j, "offset=", " > size=");
        sbM.append(buffer.f17413e);
        throw new ArrayIndexOutOfBoundsException(sbM.toString());
    }
}
