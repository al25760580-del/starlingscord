package vp;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21875c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InputStream f21877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21878f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21881i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21880h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f21873a = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21874b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21876d = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21879g = 0;

    public e(InputStream inputStream) {
        this.f21877e = inputStream;
    }

    public final void a(int i7) throws q {
        if (this.f21878f != i7) {
            throw new q("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int b() {
        int i7 = this.f21880h;
        if (i7 == Integer.MAX_VALUE) {
            return -1;
        }
        return i7 - (this.f21879g + this.f21876d);
    }

    public final void c(int i7) {
        this.f21880h = i7;
        o();
    }

    public final int d(int i7) throws q {
        if (i7 < 0) {
            throw new q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i10 = this.f21879g + this.f21876d + i7;
        int i11 = this.f21880h;
        if (i10 > i11) {
            throw q.a();
        }
        this.f21880h = i10;
        o();
        return i11;
    }

    public final t e() {
        int iK = k();
        int i7 = this.f21874b;
        int i10 = this.f21876d;
        if (iK > i7 - i10 || iK <= 0) {
            return iK == 0 ? d.f21871d : new t(h(iK));
        }
        byte[] bArr = new byte[iK];
        System.arraycopy(this.f21873a, i10, bArr, 0, iK);
        t tVar = new t(bArr);
        this.f21876d += iK;
        return tVar;
    }

    public final int f() {
        return k();
    }

    public final a g(v vVar, g gVar) throws q {
        int iK = k();
        if (this.f21881i >= 64) {
            throw new q("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iD = d(iK);
        this.f21881i++;
        a aVar = (a) vVar.a(this, gVar);
        a(0);
        this.f21881i--;
        c(iD);
        return aVar;
    }

    public final byte[] h(int i7) throws IOException {
        if (i7 <= 0) {
            if (i7 == 0) {
                return p.f21915a;
            }
            throw new q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i10 = this.f21879g;
        int i11 = this.f21876d;
        int i12 = i10 + i11 + i7;
        int i13 = this.f21880h;
        if (i12 > i13) {
            r((i13 - i10) - i11);
            throw q.a();
        }
        byte[] bArr = this.f21873a;
        if (i7 < 4096) {
            byte[] bArr2 = new byte[i7];
            int i14 = this.f21874b - i11;
            System.arraycopy(bArr, i11, bArr2, 0, i14);
            this.f21876d = this.f21874b;
            int i15 = i7 - i14;
            if (i15 > 0) {
                p(i15);
            }
            System.arraycopy(bArr, 0, bArr2, i14, i15);
            this.f21876d = i15;
            return bArr2;
        }
        int i16 = this.f21874b;
        this.f21879g = i10 + i16;
        this.f21876d = 0;
        this.f21874b = 0;
        int length = i16 - i11;
        int i17 = i7 - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i17 > 0) {
            int iMin = Math.min(i17, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
            byte[] bArr3 = new byte[iMin];
            int i18 = 0;
            while (i18 < iMin) {
                int i19 = this.f21877e.read(bArr3, i18, iMin - i18);
                if (i19 == -1) {
                    throw q.a();
                }
                this.f21879g += i19;
                i18 += i19;
            }
            i17 -= iMin;
            arrayList.add(bArr3);
        }
        byte[] bArr4 = new byte[i7];
        System.arraycopy(bArr, i11, bArr4, 0, length);
        for (byte[] bArr5 : arrayList) {
            System.arraycopy(bArr5, 0, bArr4, length, bArr5.length);
            length += bArr5.length;
        }
        return bArr4;
    }

    public final int i() throws q {
        int i7 = this.f21876d;
        if (this.f21874b - i7 < 4) {
            p(4);
            i7 = this.f21876d;
        }
        this.f21876d = i7 + 4;
        byte[] bArr = this.f21873a;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public final long j() throws q {
        int i7 = this.f21876d;
        if (this.f21874b - i7 < 8) {
            p(8);
            i7 = this.f21876d;
        }
        this.f21876d = i7 + 8;
        byte[] bArr = this.f21873a;
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }

    public final int k() {
        int i7;
        int i10 = this.f21876d;
        int i11 = this.f21874b;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f21873a;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f21876d = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                long j = i14;
                if (j < 0) {
                    i7 = (int) ((-128) ^ j);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    long j5 = i16;
                    if (j5 >= 0) {
                        i7 = (int) (16256 ^ j5);
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        long j7 = i18;
                        if (j7 < 0) {
                            i7 = (int) ((-2080896) ^ j7);
                        } else {
                            i15 = i10 + 5;
                            byte b11 = bArr[i17];
                            int i19 = (int) (((long) (i18 ^ (b11 << 28))) ^ 266354560);
                            if (b11 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i7 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i19;
                            }
                            i7 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.f21876d = i13;
                return i7;
            }
        }
        return (int) m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long l() {
        /*
            r12 = this;
            int r0 = r12.f21876d
            int r1 = r12.f21874b
            if (r1 != r0) goto L8
            goto Lb8
        L8:
            int r2 = r0 + 1
            byte[] r3 = r12.f21873a
            r4 = r3[r0]
            if (r4 < 0) goto L14
            r12.f21876d = r2
            long r0 = (long) r4
            return r0
        L14:
            int r1 = r1 - r2
            r5 = 9
            if (r1 >= r5) goto L1b
            goto Lb8
        L1b:
            int r1 = r0 + 2
            r2 = r3[r2]
            int r2 = r2 << 7
            r2 = r2 ^ r4
            long r4 = (long) r2
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L2e
            r2 = -128(0xffffffffffffff80, double:NaN)
        L2b:
            long r2 = r2 ^ r4
            goto Lc1
        L2e:
            int r2 = r0 + 3
            r1 = r3[r1]
            int r1 = r1 << 14
            long r8 = (long) r1
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L42
            r0 = 16256(0x3f80, double:8.0315E-320)
        L3c:
            long r0 = r0 ^ r4
            r10 = r0
            r1 = r2
            r2 = r10
            goto Lc1
        L42:
            int r1 = r0 + 4
            r2 = r3[r2]
            int r2 = r2 << 21
            long r8 = (long) r2
            long r4 = r4 ^ r8
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L52
            r2 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L2b
        L52:
            int r2 = r0 + 5
            r1 = r3[r1]
            long r8 = (long) r1
            r1 = 28
            long r8 = r8 << r1
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L63
            r0 = 266354560(0xfe03f80, double:1.315966377E-315)
            goto L3c
        L63:
            int r1 = r0 + 6
            r2 = r3[r2]
            long r8 = (long) r2
            r2 = 35
            long r8 = r8 << r2
            long r4 = r4 ^ r8
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L76
            r2 = -34093383808(0xfffffff80fe03f80, double:NaN)
            goto L2b
        L76:
            int r2 = r0 + 7
            r1 = r3[r1]
            long r8 = (long) r1
            r1 = 42
            long r8 = r8 << r1
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L89
            r0 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L3c
        L89:
            int r1 = r0 + 8
            r2 = r3[r2]
            long r8 = (long) r2
            r2 = 49
            long r8 = r8 << r2
            long r4 = r4 ^ r8
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L9c
            r2 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L2b
        L9c:
            int r2 = r0 + 9
            r1 = r3[r1]
            long r8 = (long) r1
            r1 = 56
            long r8 = r8 << r1
            long r4 = r4 ^ r8
            r8 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto Lbf
            int r1 = r0 + 10
            r0 = r3[r2]
            long r2 = (long) r0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto Lbd
        Lb8:
            long r0 = r12.m()
            return r0
        Lbd:
            r2 = r4
            goto Lc1
        Lbf:
            r1 = r2
            goto Lbd
        Lc1:
            r12.f21876d = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: vp.e.l():long");
    }

    public final long m() throws q {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            if (this.f21876d == this.f21874b) {
                p(1);
            }
            int i10 = this.f21876d;
            this.f21876d = i10 + 1;
            byte b10 = this.f21873a[i10];
            j |= ((long) (b10 & ByteCompanionObject.MAX_VALUE)) << i7;
            if ((b10 & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw new q("CodedInputStream encountered a malformed varint.");
    }

    public final int n() throws q {
        if (this.f21876d == this.f21874b && !s(1)) {
            this.f21878f = 0;
            return 0;
        }
        int iK = k();
        this.f21878f = iK;
        if ((iK >>> 3) != 0) {
            return iK;
        }
        throw new q("Protocol message contained an invalid tag (zero).");
    }

    public final void o() {
        int i7 = this.f21874b + this.f21875c;
        this.f21874b = i7;
        int i10 = this.f21879g + i7;
        int i11 = this.f21880h;
        if (i10 <= i11) {
            this.f21875c = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f21875c = i12;
        this.f21874b = i7 - i12;
    }

    public final void p(int i7) throws q {
        if (!s(i7)) {
            throw q.a();
        }
    }

    public final boolean q(int i7, v1 v1Var) throws IOException {
        int iN;
        int i10 = i7 & 7;
        if (i10 == 0) {
            long jL = l();
            v1Var.A(i7);
            v1Var.B(jL);
            return true;
        }
        if (i10 == 1) {
            long j = j();
            v1Var.A(i7);
            v1Var.z(j);
            return true;
        }
        if (i10 == 2) {
            t tVarE = e();
            v1Var.A(i7);
            v1Var.A(tVarE.size());
            v1Var.w(tVarE);
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw new q("Protocol message tag had invalid wire type.");
            }
            int i11 = i();
            v1Var.A(i7);
            v1Var.y(i11);
            return true;
        }
        v1Var.A(i7);
        do {
            iN = n();
            if (iN == 0) {
                break;
            }
        } while (q(iN, v1Var));
        int i12 = ((i7 >>> 3) << 3) | 4;
        a(i12);
        v1Var.A(i12);
        return true;
    }

    public final void r(int i7) throws q {
        int i10 = this.f21874b;
        int i11 = this.f21876d;
        int i12 = i10 - i11;
        if (i7 <= i12 && i7 >= 0) {
            this.f21876d = i11 + i7;
            return;
        }
        if (i7 < 0) {
            throw new q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i13 = this.f21879g;
        int i14 = i13 + i11 + i7;
        int i15 = this.f21880h;
        if (i14 > i15) {
            r((i15 - i13) - i11);
            throw q.a();
        }
        this.f21876d = i10;
        p(1);
        while (true) {
            int i16 = i7 - i12;
            int i17 = this.f21874b;
            if (i16 <= i17) {
                this.f21876d = i16;
                return;
            } else {
                i12 += i17;
                this.f21876d = i17;
                p(1);
            }
        }
    }

    public final boolean s(int i7) throws IOException {
        InputStream inputStream;
        int i10 = this.f21876d;
        int i11 = i10 + i7;
        int i12 = this.f21874b;
        if (i11 <= i12) {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i7);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        if (this.f21879g + i10 + i7 <= this.f21880h && (inputStream = this.f21877e) != null) {
            byte[] bArr = this.f21873a;
            if (i10 > 0) {
                if (i12 > i10) {
                    System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                }
                this.f21879g += i10;
                this.f21874b -= i10;
                this.f21876d = 0;
            }
            int i13 = this.f21874b;
            int i14 = inputStream.read(bArr, i13, bArr.length - i13);
            if (i14 == 0 || i14 < -1 || i14 > bArr.length) {
                StringBuilder sb3 = new StringBuilder(102);
                sb3.append("InputStream#read(byte[]) returned invalid result: ");
                sb3.append(i14);
                sb3.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb3.toString());
            }
            if (i14 > 0) {
                this.f21874b += i14;
                if ((this.f21879g + i7) - 67108864 > 0) {
                    throw new q("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                o();
                if (this.f21874b >= i7) {
                    return true;
                }
                return s(i7);
            }
        }
        return false;
    }
}
