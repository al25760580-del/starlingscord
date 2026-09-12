package com.google.android.exoplayer2;

import com.google.android.exoplayer2.metadata.Metadata;
import gc.g;
import gc.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import je.e0;
import je.o;
import mc.h;
import mc.i;

/* JADX INFO: loaded from: classes3.dex */
public final class Format implements g {
    public final int E;
    public final String F;
    public final Metadata G;
    public final String H;
    public final String I;
    public final int J;
    public final List K;
    public final i L;
    public final long M;
    public final int N;
    public final int O;
    public final float P;
    public final int Q;
    public final float R;
    public final byte[] S;
    public final int T;
    public final ke.b U;
    public final int V;
    public final int W;
    public final int X;
    public final int Y;
    public final int Z;
    public final int a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final int f5522b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final int f5523c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5524d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f5525d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5526e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f5527e0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f5528i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f5529v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f5530w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f5531x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f5532y;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final Format f5502f0 = new Format(new g0());

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f5503g0 = Integer.toString(0, 36);
    public static final String h0 = Integer.toString(1, 36);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f5504i0 = Integer.toString(2, 36);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f5505j0 = Integer.toString(3, 36);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f5506k0 = Integer.toString(4, 36);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final String f5507l0 = Integer.toString(5, 36);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final String f5508m0 = Integer.toString(6, 36);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final String f5509n0 = Integer.toString(7, 36);

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final String f5510o0 = Integer.toString(8, 36);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String f5511p0 = Integer.toString(9, 36);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String f5512q0 = Integer.toString(10, 36);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f5513r0 = Integer.toString(11, 36);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f5514s0 = Integer.toString(12, 36);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String f5515t0 = Integer.toString(13, 36);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final String f5516u0 = Integer.toString(14, 36);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final String f5517v0 = Integer.toString(15, 36);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final String f5518w0 = Integer.toString(16, 36);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final String f5519x0 = Integer.toString(17, 36);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final String f5520y0 = Integer.toString(18, 36);

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final String f5521z0 = Integer.toString(19, 36);
    public static final String A0 = Integer.toString(20, 36);
    public static final String B0 = Integer.toString(21, 36);
    public static final String C0 = Integer.toString(22, 36);
    public static final String D0 = Integer.toString(23, 36);
    public static final String E0 = Integer.toString(24, 36);
    public static final String F0 = Integer.toString(25, 36);
    public static final String G0 = Integer.toString(26, 36);
    public static final String H0 = Integer.toString(27, 36);
    public static final String I0 = Integer.toString(28, 36);
    public static final String J0 = Integer.toString(29, 36);
    public static final String K0 = Integer.toString(30, 36);
    public static final String L0 = Integer.toString(31, 36);
    public static final gb.a M0 = new gb.a(8);

    public Format(g0 g0Var) {
        this.f5524d = g0Var.f9635a;
        this.f5526e = g0Var.f9636b;
        this.f5528i = e0.J(g0Var.f9637c);
        this.f5529v = g0Var.f9638d;
        this.f5530w = g0Var.f9639e;
        int i7 = g0Var.f9640f;
        this.f5531x = i7;
        int i10 = g0Var.f9641g;
        this.f5532y = i10;
        this.E = i10 != -1 ? i10 : i7;
        this.F = g0Var.f9642h;
        this.G = g0Var.f9643i;
        this.H = g0Var.j;
        this.I = g0Var.k;
        this.J = g0Var.f9644l;
        List list = g0Var.f9645m;
        this.K = list == null ? Collections.EMPTY_LIST : list;
        i iVar = g0Var.f9646n;
        this.L = iVar;
        this.M = g0Var.f9647o;
        this.N = g0Var.f9648p;
        this.O = g0Var.f9649q;
        this.P = g0Var.f9650r;
        int i11 = g0Var.f9651s;
        this.Q = i11 == -1 ? 0 : i11;
        float f2 = g0Var.f9652t;
        this.R = f2 == -1.0f ? 1.0f : f2;
        this.S = g0Var.f9653u;
        this.T = g0Var.f9654v;
        this.U = g0Var.f9655w;
        this.V = g0Var.f9656x;
        this.W = g0Var.f9657y;
        this.X = g0Var.f9658z;
        int i12 = g0Var.A;
        this.Y = i12 == -1 ? 0 : i12;
        int i13 = g0Var.B;
        this.Z = i13 != -1 ? i13 : 0;
        this.a0 = g0Var.C;
        this.f5522b0 = g0Var.D;
        this.f5523c0 = g0Var.E;
        int i14 = g0Var.F;
        if (i14 != 0 || iVar == null) {
            this.f5525d0 = i14;
        } else {
            this.f5525d0 = 1;
        }
    }

    public final g0 a() {
        g0 g0Var = new g0();
        g0Var.f9635a = this.f5524d;
        g0Var.f9636b = this.f5526e;
        g0Var.f9637c = this.f5528i;
        g0Var.f9638d = this.f5529v;
        g0Var.f9639e = this.f5530w;
        g0Var.f9640f = this.f5531x;
        g0Var.f9641g = this.f5532y;
        g0Var.f9642h = this.F;
        g0Var.f9643i = this.G;
        g0Var.j = this.H;
        g0Var.k = this.I;
        g0Var.f9644l = this.J;
        g0Var.f9645m = this.K;
        g0Var.f9646n = this.L;
        g0Var.f9647o = this.M;
        g0Var.f9648p = this.N;
        g0Var.f9649q = this.O;
        g0Var.f9650r = this.P;
        g0Var.f9651s = this.Q;
        g0Var.f9652t = this.R;
        g0Var.f9653u = this.S;
        g0Var.f9654v = this.T;
        g0Var.f9655w = this.U;
        g0Var.f9656x = this.V;
        g0Var.f9657y = this.W;
        g0Var.f9658z = this.X;
        g0Var.A = this.Y;
        g0Var.B = this.Z;
        g0Var.C = this.a0;
        g0Var.D = this.f5522b0;
        g0Var.E = this.f5523c0;
        g0Var.F = this.f5525d0;
        return g0Var;
    }

    public final boolean b(Format format) {
        List list = this.K;
        if (list.size() != format.K.size()) {
            return false;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (!Arrays.equals((byte[]) list.get(i7), (byte[]) format.K.get(i7))) {
                return false;
            }
        }
        return true;
    }

    public final Format c(Format format) {
        String str;
        String str2;
        int i7;
        int i10;
        if (this == format) {
            return this;
        }
        int iH = o.h(this.I);
        String str3 = format.f5524d;
        Metadata metadataA = format.G;
        String str4 = format.f5526e;
        if (str4 == null) {
            str4 = this.f5526e;
        }
        if ((iH != 3 && iH != 1) || (str = format.f5528i) == null) {
            str = this.f5528i;
        }
        int i11 = this.f5531x;
        if (i11 == -1) {
            i11 = format.f5531x;
        }
        int i12 = this.f5532y;
        if (i12 == -1) {
            i12 = format.f5532y;
        }
        String str5 = this.F;
        if (str5 == null) {
            String strQ = e0.q(iH, format.F);
            if (e0.S(strQ).length == 1) {
                str5 = strQ;
            }
        }
        Metadata metadata = this.G;
        if (metadata != null) {
            metadataA = metadataA == null ? metadata : metadata.a(metadataA.f5693d);
        }
        float f2 = this.P;
        if (f2 == -1.0f && iH == 2) {
            f2 = format.P;
        }
        int i13 = this.f5529v | format.f5529v;
        int i14 = this.f5530w | format.f5530w;
        i iVar = format.L;
        ArrayList arrayList = new ArrayList();
        if (iVar != null) {
            str2 = iVar.f15560i;
            h[] hVarArr = iVar.f15558d;
            int length = hVarArr.length;
            int i15 = 0;
            while (i15 < length) {
                h[] hVarArr2 = hVarArr;
                h hVar = hVarArr2[i15];
                int i16 = length;
                if (hVar.f15557w != null) {
                    arrayList.add(hVar);
                }
                i15++;
                hVarArr = hVarArr2;
                length = i16;
            }
        } else {
            str2 = null;
        }
        i iVar2 = this.L;
        if (iVar2 != null) {
            if (str2 == null) {
                str2 = iVar2.f15560i;
            }
            int size = arrayList.size();
            h[] hVarArr3 = iVar2.f15558d;
            int length2 = hVarArr3.length;
            int i17 = 0;
            while (i17 < length2) {
                int i18 = i17;
                h hVar2 = hVarArr3[i18];
                h[] hVarArr4 = hVarArr3;
                if (hVar2.f15557w != null) {
                    UUID uuid = hVar2.f15554e;
                    i10 = length2;
                    int i19 = 0;
                    while (true) {
                        if (i19 >= size) {
                            i7 = size;
                            arrayList.add(hVar2);
                            break;
                        }
                        i7 = size;
                        if (((h) arrayList.get(i19)).f15554e.equals(uuid)) {
                            break;
                        }
                        i19++;
                        size = i7;
                    }
                } else {
                    i7 = size;
                    i10 = length2;
                }
                i17 = i18 + 1;
                hVarArr3 = hVarArr4;
                length2 = i10;
                size = i7;
            }
        }
        i iVar3 = arrayList.isEmpty() ? null : new i(str2, arrayList);
        g0 g0VarA = a();
        g0VarA.f9635a = str3;
        g0VarA.f9636b = str4;
        g0VarA.f9637c = str;
        g0VarA.f9638d = i13;
        g0VarA.f9639e = i14;
        g0VarA.f9640f = i11;
        g0VarA.f9641g = i12;
        g0VarA.f9642h = str5;
        g0VarA.f9643i = metadataA;
        g0VarA.f9646n = iVar3;
        g0VarA.f9650r = f2;
        return new Format(g0VarA);
    }

    public final boolean equals(Object obj) {
        int i7;
        if (this == obj) {
            return true;
        }
        if (obj != null && Format.class == obj.getClass()) {
            Format format = (Format) obj;
            int i10 = this.f5527e0;
            if ((i10 == 0 || (i7 = format.f5527e0) == 0 || i10 == i7) && this.f5529v == format.f5529v && this.f5530w == format.f5530w && this.f5531x == format.f5531x && this.f5532y == format.f5532y && this.J == format.J && this.M == format.M && this.N == format.N && this.O == format.O && this.Q == format.Q && this.T == format.T && this.V == format.V && this.W == format.W && this.X == format.X && this.Y == format.Y && this.Z == format.Z && this.a0 == format.a0 && this.f5522b0 == format.f5522b0 && this.f5523c0 == format.f5523c0 && this.f5525d0 == format.f5525d0 && Float.compare(this.P, format.P) == 0 && Float.compare(this.R, format.R) == 0 && e0.a(this.f5524d, format.f5524d) && e0.a(this.f5526e, format.f5526e) && e0.a(this.F, format.F) && e0.a(this.H, format.H) && e0.a(this.I, format.I) && e0.a(this.f5528i, format.f5528i) && Arrays.equals(this.S, format.S) && e0.a(this.G, format.G) && e0.a(this.U, format.U) && e0.a(this.L, format.L) && b(format)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f5527e0 == 0) {
            String str = this.f5524d;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f5526e;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f5528i;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f5529v) * 31) + this.f5530w) * 31) + this.f5531x) * 31) + this.f5532y) * 31;
            String str4 = this.F;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.G;
            int iHashCode5 = (iHashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str5 = this.H;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.I;
            this.f5527e0 = ((((((((((((((((((((Float.floatToIntBits(this.R) + ((((Float.floatToIntBits(this.P) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.J) * 31) + ((int) this.M)) * 31) + this.N) * 31) + this.O) * 31)) * 31) + this.Q) * 31)) * 31) + this.T) * 31) + this.V) * 31) + this.W) * 31) + this.X) * 31) + this.Y) * 31) + this.Z) * 31) + this.a0) * 31) + this.f5522b0) * 31) + this.f5523c0) * 31) + this.f5525d0;
        }
        return this.f5527e0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f5524d);
        sb2.append(", ");
        sb2.append(this.f5526e);
        sb2.append(", ");
        sb2.append(this.H);
        sb2.append(", ");
        sb2.append(this.I);
        sb2.append(", ");
        sb2.append(this.F);
        sb2.append(", ");
        sb2.append(this.E);
        sb2.append(", ");
        sb2.append(this.f5528i);
        sb2.append(", [");
        sb2.append(this.N);
        sb2.append(", ");
        sb2.append(this.O);
        sb2.append(", ");
        sb2.append(this.P);
        sb2.append(", ");
        sb2.append(this.U);
        sb2.append("], [");
        sb2.append(this.V);
        sb2.append(", ");
        return kk.b.l(sb2, this.W, "])");
    }
}
