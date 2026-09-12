package md;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final he.q f15645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final je.w f15647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j0 f15648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j0 f15649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j0 f15650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f15651g;

    public k0(he.q qVar) {
        this.f15645a = qVar;
        int i7 = qVar.f10662b;
        this.f15646b = i7;
        this.f15647c = new je.w(32);
        j0 j0Var = new j0(0L, i7);
        this.f15648d = j0Var;
        this.f15649e = j0Var;
        this.f15650f = j0Var;
    }

    public static j0 d(j0 j0Var, long j, ByteBuffer byteBuffer, int i7) {
        while (j >= j0Var.f15637e) {
            j0Var = (j0) j0Var.f15639v;
        }
        while (i7 > 0) {
            int iMin = Math.min(i7, (int) (j0Var.f15637e - j));
            he.a aVar = (he.a) j0Var.f15638i;
            byteBuffer.put(aVar.f10586a, ((int) (j - j0Var.f15636d)) + aVar.f10587b, iMin);
            i7 -= iMin;
            j += (long) iMin;
            if (j == j0Var.f15637e) {
                j0Var = (j0) j0Var.f15639v;
            }
        }
        return j0Var;
    }

    public static j0 e(j0 j0Var, long j, byte[] bArr, int i7) {
        while (j >= j0Var.f15637e) {
            j0Var = (j0) j0Var.f15639v;
        }
        int i10 = i7;
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (j0Var.f15637e - j));
            he.a aVar = (he.a) j0Var.f15638i;
            System.arraycopy(aVar.f10586a, ((int) (j - j0Var.f15636d)) + aVar.f10587b, bArr, i7 - i10, iMin);
            i10 -= iMin;
            j += (long) iMin;
            if (j == j0Var.f15637e) {
                j0Var = (j0) j0Var.f15639v;
            }
        }
        return j0Var;
    }

    public static j0 f(j0 j0Var, lc.f fVar, com.rnfs.b bVar, je.w wVar) {
        if (fVar.c(1073741824)) {
            long j = bVar.f7078b;
            int iZ = 1;
            wVar.C(1);
            j0 j0VarE = e(j0Var, j, wVar.f13860a, 1);
            long j5 = j + 1;
            byte b10 = wVar.f13860a[0];
            boolean z5 = (b10 & ByteCompanionObject.MIN_VALUE) != 0;
            int i7 = b10 & ByteCompanionObject.MAX_VALUE;
            lc.c cVar = fVar.f15009i;
            byte[] bArr = cVar.f15000a;
            if (bArr == null) {
                cVar.f15000a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            j0Var = e(j0VarE, j5, cVar.f15000a, i7);
            long j7 = j5 + ((long) i7);
            if (z5) {
                wVar.C(2);
                j0Var = e(j0Var, j7, wVar.f13860a, 2);
                j7 += 2;
                iZ = wVar.z();
            }
            int[] iArr = cVar.f15003d;
            if (iArr == null || iArr.length < iZ) {
                iArr = new int[iZ];
            }
            int[] iArr2 = cVar.f15004e;
            if (iArr2 == null || iArr2.length < iZ) {
                iArr2 = new int[iZ];
            }
            if (z5) {
                int i10 = iZ * 6;
                wVar.C(i10);
                j0Var = e(j0Var, j7, wVar.f13860a, i10);
                j7 += (long) i10;
                wVar.F(0);
                for (int i11 = 0; i11 < iZ; i11++) {
                    iArr[i11] = wVar.z();
                    iArr2[i11] = wVar.x();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = bVar.f7077a - ((int) (j7 - bVar.f7078b));
            }
            pc.w wVar2 = (pc.w) bVar.f7079c;
            int i12 = je.e0.f13788a;
            byte[] bArr2 = wVar2.f17933b;
            byte[] bArr3 = cVar.f15000a;
            int i13 = wVar2.f17932a;
            int i14 = wVar2.f17934c;
            int i15 = wVar2.f17935d;
            cVar.f15005f = iZ;
            cVar.f15003d = iArr;
            cVar.f15004e = iArr2;
            cVar.f15001b = bArr2;
            cVar.f15000a = bArr3;
            cVar.f15002c = i13;
            cVar.f15006g = i14;
            cVar.f15007h = i15;
            MediaCodec.CryptoInfo cryptoInfo = cVar.f15008i;
            cryptoInfo.numSubSamples = iZ;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i13;
            if (je.e0.f13788a >= 24) {
                e4.e eVar = cVar.j;
                eVar.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) eVar.f7972i;
                pattern.set(i14, i15);
                ((MediaCodec.CryptoInfo) eVar.f7971e).setPattern(pattern);
            }
            long j10 = bVar.f7078b;
            int i16 = (int) (j7 - j10);
            bVar.f7078b = j10 + ((long) i16);
            bVar.f7077a -= i16;
        }
        if (!fVar.c(268435456)) {
            fVar.i(bVar.f7077a);
            return d(j0Var, bVar.f7078b, fVar.f15010v, bVar.f7077a);
        }
        wVar.C(4);
        j0 j0VarE2 = e(j0Var, bVar.f7078b, wVar.f13860a, 4);
        int iX = wVar.x();
        bVar.f7078b += 4;
        bVar.f7077a -= 4;
        fVar.i(iX);
        j0 j0VarD = d(j0VarE2, bVar.f7078b, fVar.f15010v, iX);
        bVar.f7078b += (long) iX;
        int i17 = bVar.f7077a - iX;
        bVar.f7077a = i17;
        ByteBuffer byteBuffer = fVar.f15013y;
        if (byteBuffer == null || byteBuffer.capacity() < i17) {
            fVar.f15013y = ByteBuffer.allocate(i17);
        } else {
            fVar.f15013y.clear();
        }
        return d(j0VarD, bVar.f7078b, fVar.f15013y, bVar.f7077a);
    }

    public final void a(j0 j0Var) {
        if (((he.a) j0Var.f15638i) == null) {
            return;
        }
        he.q qVar = this.f15645a;
        synchronized (qVar) {
            j0 j0Var2 = j0Var;
            while (j0Var2 != null) {
                try {
                    he.a[] aVarArr = qVar.f10666f;
                    int i7 = qVar.f10665e;
                    qVar.f10665e = i7 + 1;
                    he.a aVar = (he.a) j0Var2.f15638i;
                    aVar.getClass();
                    aVarArr[i7] = aVar;
                    qVar.f10664d--;
                    j0Var2 = (j0) j0Var2.f15639v;
                    if (j0Var2 == null || ((he.a) j0Var2.f15638i) == null) {
                        j0Var2 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            qVar.notifyAll();
        }
        j0Var.f15638i = null;
        j0Var.f15639v = null;
    }

    public final void b(long j) {
        j0 j0Var;
        if (j == -1) {
            return;
        }
        while (true) {
            j0Var = this.f15648d;
            if (j < j0Var.f15637e) {
                break;
            }
            he.q qVar = this.f15645a;
            he.a aVar = (he.a) j0Var.f15638i;
            synchronized (qVar) {
                he.a[] aVarArr = qVar.f10666f;
                int i7 = qVar.f10665e;
                qVar.f10665e = i7 + 1;
                aVarArr[i7] = aVar;
                qVar.f10664d--;
                qVar.notifyAll();
            }
            j0 j0Var2 = this.f15648d;
            j0Var2.f15638i = null;
            j0 j0Var3 = (j0) j0Var2.f15639v;
            j0Var2.f15639v = null;
            this.f15648d = j0Var3;
        }
        if (this.f15649e.f15636d < j0Var.f15636d) {
            this.f15649e = j0Var;
        }
    }

    public final int c(int i7) {
        he.a aVar;
        j0 j0Var = this.f15650f;
        if (((he.a) j0Var.f15638i) == null) {
            he.q qVar = this.f15645a;
            synchronized (qVar) {
                try {
                    int i10 = qVar.f10664d + 1;
                    qVar.f10664d = i10;
                    int i11 = qVar.f10665e;
                    if (i11 > 0) {
                        he.a[] aVarArr = qVar.f10666f;
                        int i12 = i11 - 1;
                        qVar.f10665e = i12;
                        aVar = aVarArr[i12];
                        aVar.getClass();
                        qVar.f10666f[qVar.f10665e] = null;
                    } else {
                        he.a aVar2 = new he.a(new byte[qVar.f10662b], 0);
                        he.a[] aVarArr2 = qVar.f10666f;
                        if (i10 > aVarArr2.length) {
                            qVar.f10666f = (he.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            j0 j0Var2 = new j0(this.f15650f.f15637e, this.f15646b);
            j0Var.f15638i = aVar;
            j0Var.f15639v = j0Var2;
        }
        return Math.min(i7, (int) (this.f15650f.f15637e - this.f15651g));
    }
}
