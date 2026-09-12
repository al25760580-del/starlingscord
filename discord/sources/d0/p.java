package d0;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class p extends c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final com.google.firebase.messaging.n f7559p = new com.google.firebase.messaging.n(6);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f7560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f7561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f7562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f7563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f7564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f7565i;
    public final float[] j;
    public final h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l f7566l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h f7567m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l f7568n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f7569o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:42:0x0230  */
    /* JADX WARN: Code duplicated, block: B:45:0x023f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0243  */
    /* JADX WARN: Code duplicated, block: B:53:0x0261  */
    /* JADX WARN: Code duplicated, block: B:56:0x026a  */
    /* JADX WARN: Code duplicated, block: B:63:0x027e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0296  */
    /* JADX WARN: Code duplicated, block: B:68:0x02b0 A[EDGE_INSN: B:68:0x02b0->B:69:0x02b2 BREAK  A[LOOP:1: B:61:0x0278->B:67:0x02a9]] */
    /* JADX WARN: Code duplicated, block: B:76:0x0261 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x02b0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public p(String name, float[] primaries, r whitePoint, float[] fArr, h oetf, h eotf, float f2, float f7, q qVar, int i7) {
        int i10;
        float f10;
        float f11;
        float[] b10;
        p pVar;
        double d6;
        int i11;
        super(name, b.f7518a, i7);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(oetf, "oetf");
        Intrinsics.checkNotNullParameter(eotf, "eotf");
        this.f7560d = whitePoint;
        this.f7561e = f2;
        this.f7562f = f7;
        this.f7563g = qVar;
        this.k = oetf;
        boolean z5 = 1;
        z5 = 1;
        new o(this, z5 ? 1 : 0);
        int i12 = 0;
        this.f7566l = new l(this, i12);
        this.f7567m = eotf;
        new o(this, i12);
        this.f7568n = new l(this, z5 ? 1 : 0);
        if (primaries.length != 6 && primaries.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f2 >= f7) {
            throw new IllegalArgumentException("Invalid range: min=" + f2 + ", max=" + f7 + "; min must be strictly < max");
        }
        float[] destination = new float[6];
        if (primaries.length == 9) {
            float f12 = primaries[0];
            float f13 = primaries[1];
            float f14 = f12 + f13 + primaries[2];
            destination[0] = f12 / f14;
            destination[1] = f13 / f14;
            float f15 = primaries[3];
            float f16 = primaries[4];
            float f17 = f15 + f16 + primaries[5];
            destination[2] = f15 / f17;
            destination[3] = f16 / f17;
            float f18 = primaries[6];
            float f19 = primaries[7];
            float f20 = f18 + f19 + primaries[8];
            destination[4] = f18 / f20;
            destination[5] = f19 / f20;
        } else {
            Intrinsics.checkNotNullParameter(primaries, "<this>");
            Intrinsics.checkNotNullParameter(destination, "destination");
            System.arraycopy(primaries, 0, destination, 0, 6);
        }
        this.f7564h = destination;
        if (fArr == null) {
            float f21 = destination[0];
            float f22 = destination[1];
            float f23 = destination[2];
            float f24 = destination[3];
            float f25 = destination[4];
            float f26 = destination[5];
            f10 = 1.0f;
            float f27 = whitePoint.f7575a;
            i10 = 0;
            float f28 = whitePoint.f7576b;
            float f29 = 1;
            float f30 = (f29 - f21) / f22;
            float f31 = (f29 - f23) / f24;
            float f32 = (f29 - f25) / f26;
            float f33 = (f29 - f27) / f28;
            float f34 = f21 / f22;
            float f35 = (f23 / f24) - f34;
            float f36 = (f27 / f28) - f34;
            float f37 = f31 - f30;
            float f38 = (f25 / f26) - f34;
            float f39 = (((f33 - f30) * f35) - (f36 * f37)) / (((f32 - f30) * f35) - (f37 * f38));
            float f40 = (f36 - (f38 * f39)) / f35;
            float f41 = (1.0f - f40) - f39;
            float f42 = f41 / f22;
            float f43 = f40 / f24;
            float f44 = f39 / f26;
            this.f7565i = new float[]{f42 * f21, f41, ((1.0f - f21) - f22) * f42, f43 * f23, f40, ((1.0f - f23) - f24) * f43, f44 * f25, f39, ((1.0f - f25) - f26) * f44};
        } else {
            i10 = 0;
            f10 = 1.0f;
            if (fArr.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr.length);
            }
            this.f7565i = fArr;
        }
        this.j = i.f(this.f7565i);
        float fB = i.b(destination);
        float[] fArr2 = d.f7526a;
        if (fB / i.b(d.f7527b) > 0.9f) {
            float[] fArr3 = d.f7526a;
            float f45 = destination[i10];
            float f46 = fArr3[i10];
            float f47 = destination[1];
            float f48 = fArr3[1];
            float f49 = destination[2] - fArr3[2];
            float f50 = destination[3] - fArr3[3];
            float f51 = destination[4];
            float f52 = fArr3[4];
            float f53 = destination[5];
            float f54 = fArr3[5];
            f11 = 0.0f;
            float[] fArr4 = new float[6];
            fArr4[i10] = f45 - f46;
            fArr4[1] = f47 - f48;
            fArr4[2] = f49;
            fArr4[3] = f50;
            fArr4[4] = f51 - f52;
            fArr4[5] = f53 - f54;
            if (i.e(fArr4[i10], fArr4[1], f46 - f52, f48 - f54) < 0.0f || i.e(fArr3[i10] - fArr3[2], fArr3[1] - fArr3[3], fArr4[i10], fArr4[1]) < 0.0f || i.e(fArr4[2], fArr4[3], fArr3[2] - fArr3[i10], fArr3[3] - fArr3[1]) < 0.0f || i.e(fArr3[2] - fArr3[4], fArr3[3] - fArr3[5], fArr4[2], fArr4[3]) < 0.0f || i.e(fArr4[4], fArr4[5], fArr3[4] - fArr3[2], fArr3[5] - fArr3[3]) < 0.0f || i.e(fArr3[4] - fArr3[i10], fArr3[5] - fArr3[1], fArr4[4], fArr4[5]) < 0.0f) {
            }
            if (i7 != 0) {
                b10 = d.f7526a;
                Intrinsics.checkNotNullParameter(destination, "a");
                Intrinsics.checkNotNullParameter(b10, "b");
                if (destination == b10) {
                    i11 = i10;
                    while (true) {
                        if (i11 >= 6) {
                            if (i.d(whitePoint, i.f7544d)) {
                                break;
                            }
                            float[] fArr5 = d.f7526a;
                            pVar = d.f7528c;
                            while (d6 <= 1.0d) {
                                if (Math.abs(oetf.invoke(d6) - pVar.k.invoke(d6)) <= 0.001d) {
                                }
                            }
                        } else if (Float.compare(destination[i11], b10[i11]) != 0 || Math.abs(destination[i11] - b10[i11]) <= 0.001f) {
                            i11++;
                        }
                        z5 = i10;
                        break;
                    }
                }
                if (i.d(whitePoint, i.f7544d) || f2 != f11 || f7 != f10) {
                    z5 = i10;
                    break;
                }
                float[] fArr6 = d.f7526a;
                pVar = d.f7528c;
                for (d6 = 0.0d; d6 <= 1.0d; d6 += 0.00392156862745098d) {
                    if (Math.abs(oetf.invoke(d6) - pVar.k.invoke(d6)) <= 0.001d || Math.abs(eotf.invoke(d6) - pVar.f7567m.invoke(d6)) > 0.001d) {
                        z5 = i10;
                        break;
                    }
                }
            }
            this.f7569o = z5;
        }
        f11 = 0.0f;
        int i13 = (f2 > f11 ? 1 : (f2 == f11 ? 0 : -1));
        if (i7 != 0) {
            b10 = d.f7526a;
            Intrinsics.checkNotNullParameter(destination, "a");
            Intrinsics.checkNotNullParameter(b10, "b");
            if (destination == b10) {
                i11 = i10;
                while (true) {
                    if (i11 >= 6) {
                        if (Float.compare(destination[i11], b10[i11]) != 0) {
                        }
                        i11++;
                    } else {
                        if (i.d(whitePoint, i.f7544d)) {
                            break;
                        }
                        float[] fArr7 = d.f7526a;
                        pVar = d.f7528c;
                        while (d6 <= 1.0d) {
                            if (Math.abs(oetf.invoke(d6) - pVar.k.invoke(d6)) <= 0.001d) {
                            }
                        }
                    }
                    z5 = i10;
                    break;
                }
            }
            if (i.d(whitePoint, i.f7544d)) {
                z5 = i10;
                break;
            }
            float[] fArr8 = d.f7526a;
            pVar = d.f7528c;
            while (d6 <= 1.0d) {
                if (Math.abs(oetf.invoke(d6) - pVar.k.invoke(d6)) <= 0.001d) {
                }
                z5 = i10;
            }
        }
        this.f7569o = z5;
    }

    @Override // d0.c
    public final float a(int i7) {
        return this.f7562f;
    }

    @Override // d0.c
    public final float b(int i7) {
        return this.f7561e;
    }

    @Override // d0.c
    public final boolean c() {
        return this.f7569o;
    }

    @Override // d0.c
    public final long d(float f2, float f7, float f10) {
        double d6 = f2;
        l lVar = this.f7568n;
        float fInvoke = (float) lVar.invoke(d6);
        float fInvoke2 = (float) lVar.invoke(f7);
        float fInvoke3 = (float) lVar.invoke(f10);
        float[] fArr = this.f7565i;
        return (((long) Float.floatToIntBits(i.i(fArr, fInvoke, fInvoke2, fInvoke3))) << 32) | (((long) Float.floatToIntBits(i.j(fArr, fInvoke, fInvoke2, fInvoke3))) & 4294967295L);
    }

    @Override // d0.c
    public final float e(float f2, float f7, float f10) {
        double d6 = f2;
        l lVar = this.f7568n;
        return i.k(this.f7565i, (float) lVar.invoke(d6), (float) lVar.invoke(f7), (float) lVar.invoke(f10));
    }

    @Override // d0.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        p pVar = (p) obj;
        q qVar = pVar.f7563g;
        if (Float.compare(pVar.f7561e, this.f7561e) != 0 || Float.compare(pVar.f7562f, this.f7562f) != 0 || !Intrinsics.areEqual(this.f7560d, pVar.f7560d) || !Arrays.equals(this.f7564h, pVar.f7564h)) {
            return false;
        }
        q qVar2 = this.f7563g;
        if (qVar2 != null) {
            return Intrinsics.areEqual(qVar2, qVar);
        }
        if (qVar == null) {
            return true;
        }
        if (Intrinsics.areEqual(this.k, pVar.k)) {
            return Intrinsics.areEqual(this.f7567m, pVar.f7567m);
        }
        return false;
    }

    @Override // d0.c
    public final long f(float f2, float f7, float f10, float f11, c colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        float[] fArr = this.j;
        float fI = i.i(fArr, f2, f7, f10);
        float fJ = i.j(fArr, f2, f7, f10);
        float fK = i.k(fArr, f2, f7, f10);
        l lVar = this.f7566l;
        return w3.q.a((float) lVar.invoke(fI), (float) lVar.invoke(fJ), (float) lVar.invoke(fK), f11, colorSpace);
    }

    @Override // d0.c
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f7564h) + ((this.f7560d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f2 = this.f7561e;
        int iFloatToIntBits = (iHashCode + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        float f7 = this.f7562f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f7 == 0.0f ? 0 : Float.floatToIntBits(f7))) * 31;
        q qVar = this.f7563g;
        int iHashCode2 = iFloatToIntBits2 + (qVar != null ? qVar.hashCode() : 0);
        if (qVar == null) {
            return this.f7567m.hashCode() + ((this.k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    public p(String name, float[] primaries, r whitePoint, final q function, int i7) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(function, "function");
        final int i10 = 0;
        h hVar = new h() { // from class: d0.n
            @Override // d0.h
            public final double invoke(double d6) {
                switch (i10) {
                    case 0:
                        q function2 = function;
                        Intrinsics.checkNotNullParameter(function2, "$function");
                        double d7 = function2.f7571b;
                        double d8 = function2.f7572c;
                        double d9 = function2.f7573d;
                        return d6 >= function2.f7574e * d9 ? (Math.pow(d6, 1.0d / function2.f7570a) - d8) / d7 : d6 / d9;
                    default:
                        q function3 = function;
                        Intrinsics.checkNotNullParameter(function3, "$function");
                        double d10 = function3.f7571b;
                        return d6 >= function3.f7574e ? Math.pow((d10 * d6) + function3.f7572c, function3.f7570a) : d6 * function3.f7573d;
                }
            }
        };
        final int i11 = 1;
        this(name, primaries, whitePoint, null, hVar, new h() { // from class: d0.n
            @Override // d0.h
            public final double invoke(double d6) {
                switch (i11) {
                    case 0:
                        q function2 = function;
                        Intrinsics.checkNotNullParameter(function2, "$function");
                        double d7 = function2.f7571b;
                        double d8 = function2.f7572c;
                        double d9 = function2.f7573d;
                        return d6 >= function2.f7574e * d9 ? (Math.pow(d6, 1.0d / function2.f7570a) - d8) / d7 : d6 / d9;
                    default:
                        q function3 = function;
                        Intrinsics.checkNotNullParameter(function3, "$function");
                        double d10 = function3.f7571b;
                        return d6 >= function3.f7574e ? Math.pow((d10 * d6) + function3.f7572c, function3.f7570a) : d6 * function3.f7573d;
                }
            }
        }, 0.0f, 1.0f, function, i7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p(String name, float[] primaries, r whitePoint, final double d6, float f2, float f7, int i7) {
        h hVar;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        h hVar2 = f7559p;
        if (d6 == 1.0d) {
            hVar = hVar2;
        } else {
            final int i10 = 0;
            hVar = new h() { // from class: d0.m
                @Override // d0.h
                public final double invoke(double d7) {
                    switch (i10) {
                        case 0:
                            if (d7 < 0.0d) {
                                d7 = 0.0d;
                            }
                            return Math.pow(d7, 1.0d / d6);
                        default:
                            if (d7 < 0.0d) {
                                d7 = 0.0d;
                            }
                            return Math.pow(d7, d6);
                    }
                }
            };
        }
        if (d6 != 1.0d) {
            final int i11 = 1;
            hVar2 = new h() { // from class: d0.m
                @Override // d0.h
                public final double invoke(double d7) {
                    switch (i11) {
                        case 0:
                            if (d7 < 0.0d) {
                                d7 = 0.0d;
                            }
                            return Math.pow(d7, 1.0d / d6);
                        default:
                            if (d7 < 0.0d) {
                                d7 = 0.0d;
                            }
                            return Math.pow(d7, d6);
                    }
                }
            };
        }
        this(name, primaries, whitePoint, null, hVar, hVar2, f2, f7, new q(d6, 1.0d, 0.0d, 0.0d, 0.0d), i7);
    }
}
