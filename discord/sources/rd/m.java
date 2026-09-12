package rd;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.upstream.DataSource;
import ei.e0;
import ei.r0;
import gc.g0;
import hc.c0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import je.b0;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends od.l {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final AtomicInteger f19289i0 = new AtomicInteger();
    public final int H;
    public final int I;
    public final Uri J;
    public final boolean K;
    public final int L;
    public final DataSource M;
    public final he.p N;
    public final b O;
    public final boolean P;
    public final boolean Q;
    public final b0 R;
    public final l S;
    public final List T;
    public final mc.i U;
    public final hd.i V;
    public final je.w W;
    public final boolean X;
    public final boolean Y;
    public b Z;
    public t a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f19290b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f19291c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public volatile boolean f19292d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f19293e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public e0 f19294f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f19295g0;
    public boolean h0;

    public m(l lVar, DataSource dataSource, he.p pVar, Format format, boolean z5, DataSource dataSource2, he.p pVar2, boolean z6, Uri uri, List list, int i7, Object obj, long j, long j5, long j7, int i10, boolean z7, int i11, boolean z10, boolean z11, b0 b0Var, mc.i iVar, b bVar, hd.i iVar2, je.w wVar, boolean z12, c0 c0Var) {
        super(dataSource, pVar, format, i7, obj, j, j5, j7);
        this.X = z5;
        this.L = i10;
        this.h0 = z7;
        this.I = i11;
        this.N = pVar2;
        this.M = dataSource2;
        this.f19291c0 = pVar2 != null;
        this.Y = z6;
        this.J = uri;
        this.P = z11;
        this.R = b0Var;
        this.Q = z10;
        this.S = lVar;
        this.T = list;
        this.U = iVar;
        this.O = bVar;
        this.V = iVar2;
        this.W = wVar;
        this.K = z12;
        ei.c0 c0Var2 = e0.f8303e;
        this.f19294f0 = r0.f8352w;
        this.H = f19289i0.getAndIncrement();
    }

    public static byte[] d(String str) {
        if (m3.m.T(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // od.l
    public final boolean b() {
        throw null;
    }

    public final void c(DataSource dataSource, he.p pVar, boolean z5, boolean z6) {
        he.p pVarC;
        long j;
        boolean z7 = false;
        if (z5) {
            z7 = this.f19290b0 != 0;
            pVarC = pVar;
        } else {
            pVarC = pVar.c(this.f19290b0);
        }
        try {
            pc.h hVarF = f(dataSource, pVarC, z6);
            if (z7) {
                hVarF.u(this.f19290b0);
            }
            while (!this.f19292d0 && this.Z.f19259a.d(hVarF, b.f19258d) == 0) {
                try {
                    try {
                    } catch (EOFException e10) {
                        if ((this.f17224v.f5530w & 16384) == 0) {
                            throw e10;
                        }
                        this.Z.f19259a.g(0L, 0L);
                        j = hVarF.f17895v;
                    }
                } catch (Throwable th2) {
                    this.f19290b0 = (int) (hVarF.f17895v - pVar.f10654f);
                    throw th2;
                }
            }
            j = hVarF.f17895v;
            this.f19290b0 = (int) (j - pVar.f10654f);
            c9.a.f(dataSource);
        } catch (Throwable th3) {
            c9.a.f(dataSource);
            throw th3;
        }
    }

    public final int e(int i7) {
        je.b.k(!this.K);
        if (i7 >= this.f19294f0.size()) {
            return 0;
        }
        return ((Integer) this.f19294f0.get(i7)).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0205 A[PHI: r20
      0x0205: PHI (r20v5 int) = (r20v4 int), (r20v6 int) binds: [B:93:0x01ee, B:99:0x0203] A[DONT_GENERATE, DONT_INLINE]] */
    public final pc.h f(DataSource dataSource, he.p pVar, boolean z5) throws IOException {
        int i7;
        long j;
        long jO;
        long j5;
        b bVar;
        b bVar2;
        pc.k aVar;
        boolean zF;
        boolean z6;
        List list;
        int i10;
        List listSingletonList;
        int i11;
        int i12;
        pc.k dVar;
        long jD = dataSource.d(pVar);
        long j7 = this.f17227y;
        b0 b0Var = this.R;
        if (z5) {
            try {
                b0Var.f(j7, this.P);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e10) {
                throw new IOException(e10);
            }
        }
        pc.h hVar = new pc.h(dataSource, pVar.f10654f, jD);
        if (this.Z == null) {
            je.w wVar = this.W;
            hVar.f17897x = 0;
            try {
                wVar.C(10);
                hVar.g(wVar.f13860a, 0, 10, false);
                if (wVar.w() == 4801587) {
                    wVar.G(3);
                    int iT = wVar.t();
                    int i13 = iT + 10;
                    byte[] bArr = wVar.f13860a;
                    j = -9223372036854775807L;
                    if (i13 > bArr.length) {
                        wVar.C(i13);
                        System.arraycopy(bArr, 0, wVar.f13860a, 0, 10);
                    }
                    hVar.g(wVar.f13860a, 10, iT, false);
                    Metadata metadataE = this.V.E(wVar.f13860a, iT);
                    if (metadataE == null) {
                        jO = j;
                        break;
                    }
                    cd.b[] bVarArr = metadataE.f5693d;
                    int length = bVarArr.length;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= length) {
                            jO = j;
                            break;
                        }
                        cd.b bVar3 = bVarArr[i14];
                        if (bVar3 instanceof hd.m) {
                            hd.m mVar = (hd.m) bVar3;
                            if ("com.apple.streaming.transportStreamTimestamp".equals(mVar.f10579e)) {
                                System.arraycopy(mVar.f10580i, 0, wVar.f13860a, 0, 8);
                                wVar.F(0);
                                wVar.E(8);
                                jO = wVar.o() & 8589934591L;
                                break;
                            }
                        }
                        i14++;
                    }
                } else {
                    jO = -9223372036854775807L;
                    j = -9223372036854775807L;
                }
            } catch (EOFException unused2) {
                j = -9223372036854775807L;
            }
            hVar.f17897x = 0;
            b bVar4 = this.O;
            if (bVar4 != null) {
                pc.k kVar = bVar4.f19259a;
                b0 b0Var2 = bVar4.f19261c;
                Format format = bVar4.f19260b;
                je.b.k(!((kVar instanceof zc.b0) || (kVar instanceof xc.i)));
                if (kVar instanceof x) {
                    dVar = new x(format.f5528i, b0Var2);
                } else if (kVar instanceof zc.d) {
                    dVar = new zc.d(0);
                } else if (kVar instanceof zc.a) {
                    dVar = new zc.a();
                } else if (kVar instanceof zc.c) {
                    dVar = new zc.c();
                } else {
                    if (!(kVar instanceof wc.d)) {
                        throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(kVar.getClass().getSimpleName()));
                    }
                    dVar = new wc.d(0);
                }
                bVar2 = new b(dVar, format, b0Var2);
                jO = jO;
                j5 = j7;
                i7 = 0;
            } else {
                Uri uri = pVar.f10649a;
                Map mapS = dataSource.s();
                ((d) this.S).getClass();
                Format format2 = this.f17224v;
                int iZ = je.b.z(format2.I);
                List list2 = (List) mapS.get("Content-Type");
                int iZ2 = je.b.z((list2 == null || list2.isEmpty()) ? null : (String) list2.get(0));
                int iA = je.b.A(uri);
                ArrayList arrayList = new ArrayList(7);
                d.a(iZ, arrayList);
                d.a(iZ2, arrayList);
                d.a(iA, arrayList);
                int i15 = 0;
                for (int i16 = 7; i15 < i16; i16 = 7) {
                    d.a(d.f19263b[i15], arrayList);
                    i15++;
                }
                hVar.f17897x = 0;
                int i17 = 0;
                pc.k kVar2 = null;
                while (true) {
                    int size = arrayList.size();
                    b0 b0Var3 = this.R;
                    if (i17 >= size) {
                        jO = jO;
                        j5 = j7;
                        i7 = 0;
                        kVar2.getClass();
                        bVar = new b(kVar2, format2, b0Var3);
                        break;
                    }
                    int iIntValue = ((Integer) arrayList.get(i17)).intValue();
                    j5 = j7;
                    if (iIntValue == 0) {
                        aVar = new zc.a();
                    } else if (iIntValue == 1) {
                        aVar = new zc.c();
                    } else if (iIntValue == 2) {
                        aVar = new zc.d(0);
                    } else if (iIntValue != 7) {
                        List list3 = this.T;
                        if (iIntValue == 8) {
                            Metadata metadata = format2.G;
                            if (metadata == null) {
                                z6 = false;
                                break;
                            }
                            int i18 = 0;
                            while (true) {
                                cd.b[] bVarArr2 = metadata.f5693d;
                                if (i18 >= bVarArr2.length) {
                                    z6 = false;
                                    break;
                                }
                                cd.b bVar5 = bVarArr2[i18];
                                if (bVar5 instanceof w) {
                                    z6 = !((w) bVar5).f19351i.isEmpty();
                                    break;
                                }
                                i18++;
                            }
                            if (z6) {
                                i10 = 4;
                                list = list3;
                            } else {
                                list = list3;
                                i10 = 0;
                            }
                            aVar = new xc.i(i10, b0Var3, null, list != null ? list : Collections.EMPTY_LIST, null);
                        } else if (iIntValue != 11) {
                            aVar = iIntValue != 13 ? null : new x(format2.f5528i, b0Var3);
                        } else {
                            if (list3 != null) {
                                i11 = 48;
                                listSingletonList = list3;
                            } else {
                                g0 g0Var = new g0();
                                g0Var.k = "application/cea-608";
                                listSingletonList = Collections.singletonList(new Format(g0Var));
                                i11 = 16;
                            }
                            int i19 = i11;
                            String str = format2.F;
                            if (TextUtils.isEmpty(str)) {
                                i12 = i19;
                            } else {
                                if (je.o.b(str, "audio/mp4a-latm") == null) {
                                    i19 |= 2;
                                }
                                if (je.o.b(str, "video/avc") != null) {
                                    i12 = i19;
                                } else {
                                    i12 = i19 | 4;
                                }
                            }
                            aVar = new zc.b0(2, b0Var3, new i1.g(i12, listSingletonList));
                        }
                    } else {
                        aVar = new wc.d(0L);
                    }
                    aVar.getClass();
                    try {
                        zF = aVar.f(hVar);
                        i7 = 0;
                        hVar.f17897x = 0;
                    } catch (EOFException unused3) {
                        i7 = 0;
                        hVar.f17897x = 0;
                        zF = false;
                    } catch (Throwable th2) {
                        hVar.f17897x = 0;
                        throw th2;
                    }
                    if (zF) {
                        bVar = new b(aVar, format2, b0Var3);
                        break;
                    }
                    if (kVar2 == null && (iIntValue == iZ || iIntValue == iZ2 || iIntValue == iA || iIntValue == 11)) {
                        kVar2 = aVar;
                    }
                    i17++;
                    jO = jO;
                    j7 = j5;
                    arrayList = arrayList;
                }
                bVar2 = bVar;
            }
            this.Z = bVar2;
            pc.k kVar3 = bVar2.f19259a;
            if ((((kVar3 instanceof zc.d) || (kVar3 instanceof zc.a) || (kVar3 instanceof zc.c) || (kVar3 instanceof wc.d)) ? 1 : i7) != 0) {
                t tVar = this.a0;
                long jB = jO != j ? b0Var.b(jO) : j5;
                if (tVar.f19335s0 != jB) {
                    tVar.f19335s0 = jB;
                    s[] sVarArr = tVar.S;
                    int length2 = sVarArr.length;
                    for (int i20 = i7; i20 < length2; i20++) {
                        s sVar = sVarArr[i20];
                        if (sVar.F != jB) {
                            sVar.F = jB;
                            sVar.f15688z = true;
                        }
                    }
                }
            } else {
                t tVar2 = this.a0;
                if (tVar2.f19335s0 != 0) {
                    tVar2.f19335s0 = 0L;
                    s[] sVarArr2 = tVar2.S;
                    int length3 = sVarArr2.length;
                    for (int i21 = i7; i21 < length3; i21++) {
                        s sVar2 = sVarArr2[i21];
                        if (sVar2.F != 0) {
                            sVar2.F = 0L;
                            sVar2.f15688z = true;
                        }
                    }
                }
            }
            this.a0.U.clear();
            this.Z.f19259a.e(this.a0);
        } else {
            i7 = 0;
        }
        t tVar3 = this.a0;
        mc.i iVar = tVar3.f19336t0;
        mc.i iVar2 = this.U;
        if (!je.e0.a(iVar, iVar2)) {
            tVar3.f19336t0 = iVar2;
            int i22 = i7;
            while (true) {
                s[] sVarArr3 = tVar3.S;
                if (i22 >= sVarArr3.length) {
                    break;
                }
                if (tVar3.f19328l0[i22]) {
                    s sVar3 = sVarArr3[i22];
                    sVar3.I = iVar2;
                    sVar3.f15688z = true;
                }
                i22++;
            }
        }
        return hVar;
    }

    @Override // he.h0
    public final void l() {
        b bVar;
        this.a0.getClass();
        if (this.Z == null && (bVar = this.O) != null) {
            pc.k kVar = bVar.f19259a;
            if ((kVar instanceof zc.b0) || (kVar instanceof xc.i)) {
                this.Z = bVar;
                this.f19291c0 = false;
            }
        }
        he.p pVar = this.N;
        DataSource dataSource = this.M;
        if (this.f19291c0) {
            dataSource.getClass();
            pVar.getClass();
            c(dataSource, pVar, this.Y, false);
            this.f19290b0 = 0;
            this.f19291c0 = false;
        }
        if (this.f19292d0) {
            return;
        }
        if (!this.Q) {
            c(this.F, this.f17222e, this.X, true);
        }
        this.f19293e0 = !this.f19292d0;
    }

    @Override // he.h0
    public final void t() {
        this.f19292d0 = true;
    }
}
