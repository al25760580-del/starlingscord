package xc;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import gc.g0;
import gc.h1;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import je.e0;
import je.w;
import kotlin.jvm.internal.LongCompanionObject;
import pc.t;
import pc.u;
import pc.v;
import pc.x;
import pc.y;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements pc.k, u {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22811i;
    public long j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public w f22812l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f22814n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f22815o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f22816p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long[][] f22819s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f22820t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f22821u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f22822v;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22810h = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f22808f = new n();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f22809g = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f22806d = new w(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f22807e = new ArrayDeque();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f22803a = new w(je.b.f13761d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f22804b = new w(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f22805c = new w();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22813m = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public pc.m f22817q = pc.m.f17904u;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public k[] f22818r = new k[0];

    public l(int i7) {
    }

    @Override // pc.u
    public final boolean c() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:332:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x0159 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fe  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // pc.k
    public final int d(pc.l lVar, pc.n nVar) throws h1 {
        int i7;
        w wVar;
        byte b10;
        char c8;
        int i10;
        ArrayList arrayList;
        List listZ;
        int i11;
        List listZ2;
        boolean z5;
        a aVar;
        while (true) {
            int i12 = this.f22810h;
            ArrayDeque arrayDeque = this.f22807e;
            w wVar2 = this.f22805c;
            int i13 = 4;
            if (i12 != 0) {
                int i14 = 2;
                if (i12 != 1) {
                    if (i12 == 2) {
                        long position = lVar.getPosition();
                        if (this.f22813m == -1) {
                            int i15 = 0;
                            int i16 = -1;
                            int i17 = -1;
                            boolean z6 = true;
                            boolean z7 = true;
                            long j = LongCompanionObject.MAX_VALUE;
                            long j5 = LongCompanionObject.MAX_VALUE;
                            long j7 = LongCompanionObject.MAX_VALUE;
                            while (true) {
                                k[] kVarArr = this.f22818r;
                                if (i15 >= kVarArr.length) {
                                    break;
                                }
                                k kVar = kVarArr[i15];
                                int i18 = kVar.f22802e;
                                r rVar = kVar.f22799b;
                                if (i18 != rVar.f22860b) {
                                    long j10 = rVar.f22861c[i18];
                                    long[][] jArr = this.f22819s;
                                    int i19 = e0.f13788a;
                                    long j11 = jArr[i15][i18];
                                    long j12 = j10 - position;
                                    boolean z10 = j12 < 0 || j12 >= 262144;
                                    if ((!z10 && z7) || (z10 == z7 && j12 < j7)) {
                                        z7 = z10;
                                        i17 = i15;
                                        j7 = j12;
                                        j5 = j11;
                                    }
                                    if (j11 < j) {
                                        z6 = z10;
                                        i16 = i15;
                                        j = j11;
                                    }
                                }
                                i15++;
                            }
                            if (j == LongCompanionObject.MAX_VALUE || !z6 || j5 < j + 10485760) {
                                i16 = i17;
                            }
                            this.f22813m = i16;
                            if (i16 == -1) {
                                return -1;
                            }
                        }
                        k kVar2 = this.f22818r[this.f22813m];
                        x xVar = kVar2.f22800c;
                        o oVar = kVar2.f22798a;
                        r rVar2 = kVar2.f22799b;
                        int i20 = kVar2.f22802e;
                        long j13 = rVar2.f22861c[i20];
                        int i21 = rVar2.f22862d[i20];
                        y yVar = kVar2.f22801d;
                        int i22 = 0;
                        long j14 = (j13 - position) + ((long) this.f22814n);
                        if (j14 < 0 || j14 >= 262144) {
                            nVar.f17905a = j13;
                            return 1;
                        }
                        if (oVar.f22836g == 1) {
                            j14 += 8;
                            i21 -= 8;
                        }
                        lVar.u((int) j14);
                        int i23 = oVar.j;
                        if (i23 == 0) {
                            if ("audio/ac4".equals(oVar.f22835f.I)) {
                                if (this.f22815o == 0) {
                                    ic.a.d(i21, wVar2);
                                    xVar.d(7, wVar2);
                                    this.f22815o += 7;
                                }
                                i21 += 7;
                            } else if (yVar != null) {
                                yVar.c(lVar);
                            }
                            while (true) {
                                int i24 = this.f22815o;
                                if (i24 >= i21) {
                                    break;
                                }
                                int iA = xVar.a(lVar, i21 - i24, false);
                                this.f22814n += iA;
                                this.f22815o += iA;
                                this.f22816p -= iA;
                            }
                        } else {
                            w wVar3 = this.f22804b;
                            byte[] bArr = wVar3.f13860a;
                            bArr[0] = 0;
                            bArr[1] = 0;
                            bArr[2] = 0;
                            int i25 = 4 - i23;
                            while (this.f22815o < i21) {
                                int i26 = this.f22816p;
                                if (i26 == 0) {
                                    lVar.readFully(bArr, i25, i23);
                                    this.f22814n += i23;
                                    int i27 = i22;
                                    wVar3.F(i27);
                                    int iG = wVar3.g();
                                    if (iG < 0) {
                                        throw h1.a("Invalid NAL length", null);
                                    }
                                    this.f22816p = iG;
                                    w wVar4 = this.f22803a;
                                    wVar4.F(i27);
                                    xVar.d(4, wVar4);
                                    this.f22815o += 4;
                                    i21 += i25;
                                    i22 = i27;
                                } else {
                                    int iA2 = xVar.a(lVar, i26, i22);
                                    this.f22814n += iA2;
                                    this.f22815o += iA2;
                                    this.f22816p -= iA2;
                                    i22 = 0;
                                }
                            }
                        }
                        int i28 = i21;
                        long j15 = rVar2.f22864f[i20];
                        int i29 = rVar2.f22865g[i20];
                        if (yVar != null) {
                            yVar.b(xVar, j15, i29, i28, 0, null);
                            if (i20 + 1 == rVar2.f22860b) {
                                yVar.a(xVar, null);
                            }
                        } else {
                            xVar.c(j15, i29, i28, 0, null);
                        }
                        kVar2.f22802e++;
                        this.f22813m = -1;
                        this.f22814n = 0;
                        this.f22815o = 0;
                        this.f22816p = 0;
                        return 0;
                    }
                    if (i12 != 3) {
                        throw new IllegalStateException();
                    }
                    n nVar2 = this.f22808f;
                    ArrayList arrayList2 = nVar2.f22827a;
                    int i30 = nVar2.f22828b;
                    if (i30 != 0) {
                        if (i30 != 1) {
                            short s2 = 2816;
                            short s5 = 2192;
                            if (i30 == 2) {
                                long length = lVar.getLength();
                                int i31 = nVar2.f22829c - 20;
                                w wVar5 = new w(i31);
                                lVar.readFully(wVar5.f13860a, 0, i31);
                                int i32 = 0;
                                while (i32 < i31 / 12) {
                                    wVar5.G(i14);
                                    short sK = wVar5.k();
                                    if (sK != s5 && sK != s2 && sK != 2817 && sK != 2819) {
                                        if (sK != 2820) {
                                            wVar5.G(8);
                                            wVar = wVar5;
                                        }
                                        i32++;
                                        wVar5 = wVar;
                                        s5 = 2192;
                                        i14 = 2;
                                        s2 = 2816;
                                    }
                                    wVar = wVar5;
                                    arrayList2.add(new m((length - ((long) nVar2.f22829c)) - ((long) wVar.i()), wVar.i()));
                                    i32++;
                                    wVar5 = wVar;
                                    s5 = 2192;
                                    i14 = 2;
                                    s2 = 2816;
                                }
                                if (arrayList2.isEmpty()) {
                                    nVar.f17905a = 0L;
                                } else {
                                    nVar2.f22828b = 3;
                                    nVar.f17905a = ((m) arrayList2.get(0)).f22823a;
                                }
                            } else {
                                if (i30 != 3) {
                                    throw new IllegalStateException();
                                }
                                long position2 = lVar.getPosition();
                                int length2 = (int) ((lVar.getLength() - lVar.getPosition()) - ((long) nVar2.f22829c));
                                w wVar6 = new w(length2);
                                lVar.readFully(wVar6.f13860a, 0, length2);
                                int i33 = 0;
                                while (i33 < arrayList2.size()) {
                                    m mVar = (m) arrayList2.get(i33);
                                    wVar6.F((int) (mVar.f22823a - position2));
                                    wVar6.G(i13);
                                    int i34 = wVar6.i();
                                    Charset charset = di.d.f7631c;
                                    String strS = wVar6.s(i34, charset);
                                    switch (strS.hashCode()) {
                                        case -1711564334:
                                            if (strS.equals("SlowMotion_Data")) {
                                                b10 = 0;
                                            }
                                            switch (b10) {
                                                case 0:
                                                    c8 = 2192;
                                                    break;
                                                case 1:
                                                    c8 = 2819;
                                                    break;
                                                case 2:
                                                    c8 = 2816;
                                                    break;
                                                case 3:
                                                    c8 = 2820;
                                                    break;
                                                case 4:
                                                    c8 = 2817;
                                                    break;
                                                default:
                                                    throw h1.a("Invalid SEF name", null);
                                            }
                                            i10 = mVar.f22824b - (i34 + 8);
                                            if (c8 != 2192) {
                                                arrayList = new ArrayList();
                                                listZ = n.f22826e.z(wVar6.s(i10, charset));
                                                for (i11 = 0; i11 < listZ.size(); i11++) {
                                                    listZ2 = n.f22825d.z((CharSequence) listZ.get(i11));
                                                    if (listZ2.size() == 3) {
                                                        throw h1.a(null, null);
                                                    }
                                                    try {
                                                        arrayList.add(new id.c(1 << (Integer.parseInt((String) listZ2.get(2)) - 1), Long.parseLong((String) listZ2.get(0)), Long.parseLong((String) listZ2.get(1))));
                                                    } catch (NumberFormatException e10) {
                                                        throw h1.a(null, e10);
                                                    }
                                                }
                                                this.f22809g.add(new id.d(arrayList));
                                            } else if (c8 != 2816 && c8 != 2817 && c8 != 2819 && c8 != 2820) {
                                                throw new IllegalStateException();
                                            }
                                            i33++;
                                            i13 = 4;
                                            break;
                                        case -1332107749:
                                            if (strS.equals("Super_SlowMotion_Edit_Data")) {
                                                b10 = 1;
                                            }
                                            switch (b10) {
                                                case 0:
                                                    c8 = 2192;
                                                    break;
                                                case 1:
                                                    c8 = 2819;
                                                    break;
                                                case 2:
                                                    c8 = 2816;
                                                    break;
                                                case 3:
                                                    c8 = 2820;
                                                    break;
                                                case 4:
                                                    c8 = 2817;
                                                    break;
                                                default:
                                                    throw h1.a("Invalid SEF name", null);
                                            }
                                            i10 = mVar.f22824b - (i34 + 8);
                                            if (c8 != 2192) {
                                                arrayList = new ArrayList();
                                                listZ = n.f22826e.z(wVar6.s(i10, charset));
                                                while (i11 < listZ.size()) {
                                                    listZ2 = n.f22825d.z((CharSequence) listZ.get(i11));
                                                    if (listZ2.size() == 3) {
                                                        throw h1.a(null, null);
                                                    }
                                                    arrayList.add(new id.c(1 << (Integer.parseInt((String) listZ2.get(2)) - 1), Long.parseLong((String) listZ2.get(0)), Long.parseLong((String) listZ2.get(1))));
                                                }
                                                this.f22809g.add(new id.d(arrayList));
                                            } else if (c8 != 2816) {
                                                continue;
                                            }
                                            i33++;
                                            i13 = 4;
                                            break;
                                        case -1251387154:
                                            if (strS.equals("Super_SlowMotion_Data")) {
                                                b10 = 2;
                                            }
                                            switch (b10) {
                                                case 0:
                                                    c8 = 2192;
                                                    break;
                                                case 1:
                                                    c8 = 2819;
                                                    break;
                                                case 2:
                                                    c8 = 2816;
                                                    break;
                                                case 3:
                                                    c8 = 2820;
                                                    break;
                                                case 4:
                                                    c8 = 2817;
                                                    break;
                                                default:
                                                    throw h1.a("Invalid SEF name", null);
                                            }
                                            i10 = mVar.f22824b - (i34 + 8);
                                            if (c8 != 2192) {
                                                arrayList = new ArrayList();
                                                listZ = n.f22826e.z(wVar6.s(i10, charset));
                                                while (i11 < listZ.size()) {
                                                    listZ2 = n.f22825d.z((CharSequence) listZ.get(i11));
                                                    if (listZ2.size() == 3) {
                                                        throw h1.a(null, null);
                                                    }
                                                    arrayList.add(new id.c(1 << (Integer.parseInt((String) listZ2.get(2)) - 1), Long.parseLong((String) listZ2.get(0)), Long.parseLong((String) listZ2.get(1))));
                                                }
                                                this.f22809g.add(new id.d(arrayList));
                                            } else if (c8 != 2816) {
                                                continue;
                                            }
                                            i33++;
                                            i13 = 4;
                                            break;
                                        case -830665521:
                                            if (strS.equals("Super_SlowMotion_Deflickering_On")) {
                                                b10 = 3;
                                            }
                                            switch (b10) {
                                                case 0:
                                                    c8 = 2192;
                                                    break;
                                                case 1:
                                                    c8 = 2819;
                                                    break;
                                                case 2:
                                                    c8 = 2816;
                                                    break;
                                                case 3:
                                                    c8 = 2820;
                                                    break;
                                                case 4:
                                                    c8 = 2817;
                                                    break;
                                                default:
                                                    throw h1.a("Invalid SEF name", null);
                                            }
                                            i10 = mVar.f22824b - (i34 + 8);
                                            if (c8 != 2192) {
                                                arrayList = new ArrayList();
                                                listZ = n.f22826e.z(wVar6.s(i10, charset));
                                                while (i11 < listZ.size()) {
                                                    listZ2 = n.f22825d.z((CharSequence) listZ.get(i11));
                                                    if (listZ2.size() == 3) {
                                                        throw h1.a(null, null);
                                                    }
                                                    arrayList.add(new id.c(1 << (Integer.parseInt((String) listZ2.get(2)) - 1), Long.parseLong((String) listZ2.get(0)), Long.parseLong((String) listZ2.get(1))));
                                                }
                                                this.f22809g.add(new id.d(arrayList));
                                            } else if (c8 != 2816) {
                                                continue;
                                            }
                                            i33++;
                                            i13 = 4;
                                            break;
                                        case 1760745220:
                                            if (strS.equals("Super_SlowMotion_BGM")) {
                                                b10 = 4;
                                            }
                                            switch (b10) {
                                                case 0:
                                                    c8 = 2192;
                                                    break;
                                                case 1:
                                                    c8 = 2819;
                                                    break;
                                                case 2:
                                                    c8 = 2816;
                                                    break;
                                                case 3:
                                                    c8 = 2820;
                                                    break;
                                                case 4:
                                                    c8 = 2817;
                                                    break;
                                                default:
                                                    throw h1.a("Invalid SEF name", null);
                                            }
                                            i10 = mVar.f22824b - (i34 + 8);
                                            if (c8 != 2192) {
                                                arrayList = new ArrayList();
                                                listZ = n.f22826e.z(wVar6.s(i10, charset));
                                                while (i11 < listZ.size()) {
                                                    listZ2 = n.f22825d.z((CharSequence) listZ.get(i11));
                                                    if (listZ2.size() == 3) {
                                                        throw h1.a(null, null);
                                                    }
                                                    arrayList.add(new id.c(1 << (Integer.parseInt((String) listZ2.get(2)) - 1), Long.parseLong((String) listZ2.get(0)), Long.parseLong((String) listZ2.get(1))));
                                                }
                                                this.f22809g.add(new id.d(arrayList));
                                            } else if (c8 != 2816) {
                                                continue;
                                            }
                                            i33++;
                                            i13 = 4;
                                            break;
                                    }
                                    b10 = -1;
                                    switch (b10) {
                                        case 0:
                                            c8 = 2192;
                                            break;
                                        case 1:
                                            c8 = 2819;
                                            break;
                                        case 2:
                                            c8 = 2816;
                                            break;
                                        case 3:
                                            c8 = 2820;
                                            break;
                                        case 4:
                                            c8 = 2817;
                                            break;
                                        default:
                                            throw h1.a("Invalid SEF name", null);
                                    }
                                    i10 = mVar.f22824b - (i34 + 8);
                                    if (c8 != 2192) {
                                        arrayList = new ArrayList();
                                        listZ = n.f22826e.z(wVar6.s(i10, charset));
                                        while (i11 < listZ.size()) {
                                            listZ2 = n.f22825d.z((CharSequence) listZ.get(i11));
                                            if (listZ2.size() == 3) {
                                                throw h1.a(null, null);
                                            }
                                            arrayList.add(new id.c(1 << (Integer.parseInt((String) listZ2.get(2)) - 1), Long.parseLong((String) listZ2.get(0)), Long.parseLong((String) listZ2.get(1))));
                                        }
                                        this.f22809g.add(new id.d(arrayList));
                                    } else if (c8 != 2816) {
                                        continue;
                                    }
                                    i33++;
                                    i13 = 4;
                                }
                                nVar.f17905a = 0L;
                            }
                        } else {
                            w wVar7 = new w(8);
                            lVar.readFully(wVar7.f13860a, 0, 8);
                            nVar2.f22829c = wVar7.i() + 8;
                            if (wVar7.g() != 1397048916) {
                                nVar.f17905a = 0L;
                            } else {
                                nVar.f17905a = lVar.getPosition() - ((long) (nVar2.f22829c - 12));
                                nVar2.f22828b = 2;
                            }
                        }
                        i7 = 1;
                    } else {
                        long length3 = lVar.getLength();
                        nVar.f17905a = (length3 == -1 || length3 < 8) ? 0L : length3 - 8;
                        i7 = 1;
                        nVar2.f22828b = 1;
                    }
                    if (nVar.f17905a != 0) {
                        return i7;
                    }
                    this.f22810h = 0;
                    this.k = 0;
                    return i7;
                }
                long j16 = this.j - ((long) this.k);
                long position3 = lVar.getPosition() + j16;
                w wVar8 = this.f22812l;
                if (wVar8 != null) {
                    lVar.readFully(wVar8.f13860a, this.k, (int) j16);
                    if (this.f22811i == 1718909296) {
                        wVar8.F(8);
                        int iG2 = wVar8.g();
                        int i35 = iG2 != 1751476579 ? iG2 != 1903435808 ? 0 : 1 : 2;
                        if (i35 == 0) {
                            wVar8.G(4);
                            do {
                                if (wVar8.a() <= 0) {
                                    i35 = 0;
                                    break;
                                }
                                int iG3 = wVar8.g();
                                i35 = iG3 != 1751476579 ? iG3 != 1903435808 ? 0 : 1 : 2;
                            } while (i35 == 0);
                        }
                        this.f22822v = i35;
                    } else if (!arrayDeque.isEmpty()) {
                        ((a) arrayDeque.peek()).f22742v.add(new b(this.f22811i, wVar8));
                    }
                } else {
                    if (j16 < 262144) {
                        lVar.u((int) j16);
                    } else {
                        nVar.f17905a = lVar.getPosition() + j16;
                        z5 = true;
                    }
                    j(position3);
                    if (z5 && this.f22810h != 2) {
                        return 1;
                    }
                }
                z5 = false;
                j(position3);
                if (z5) {
                    continue;
                }
            } else {
                int i36 = this.k;
                w wVar9 = this.f22806d;
                if (i36 == 0) {
                    if (!lVar.a(wVar9.f13860a, 0, 8, true)) {
                        return -1;
                    }
                    this.k = 8;
                    wVar9.F(0);
                    this.j = wVar9.v();
                    this.f22811i = wVar9.g();
                }
                long j17 = this.j;
                if (j17 == 1) {
                    lVar.readFully(wVar9.f13860a, 8, 8);
                    this.k += 8;
                    this.j = wVar9.y();
                } else if (j17 == 0) {
                    long length4 = lVar.getLength();
                    if (length4 == -1 && (aVar = (a) arrayDeque.peek()) != null) {
                        length4 = aVar.f22741i;
                    }
                    if (length4 != -1) {
                        this.j = (length4 - lVar.getPosition()) + ((long) this.k);
                    }
                }
                long j18 = this.j;
                int i37 = this.k;
                if (j18 < i37) {
                    throw h1.c("Atom size less than header length (unsupported).");
                }
                int i38 = this.f22811i;
                if (i38 == 1836019574 || i38 == 1953653099 || i38 == 1835297121 || i38 == 1835626086 || i38 == 1937007212 || i38 == 1701082227 || i38 == 1835365473) {
                    long position4 = lVar.getPosition();
                    long j19 = this.j;
                    long j20 = this.k;
                    long j21 = (position4 + j19) - j20;
                    if (j19 != j20 && this.f22811i == 1835365473) {
                        wVar2.C(8);
                        lVar.C(wVar2.f13860a, 0, 8);
                        byte[] bArr2 = e.f22754a;
                        int i39 = wVar2.f13861b;
                        wVar2.G(4);
                        if (wVar2.g() != 1751411826) {
                            i39 += 4;
                        }
                        wVar2.F(i39);
                        lVar.u(wVar2.f13861b);
                        lVar.t();
                    }
                    arrayDeque.push(new a(this.f22811i, j21));
                    if (this.j == this.k) {
                        j(j21);
                    } else {
                        this.f22810h = 0;
                        this.k = 0;
                    }
                } else if (i38 == 1835296868 || i38 == 1836476516 || i38 == 1751411826 || i38 == 1937011556 || i38 == 1937011827 || i38 == 1937011571 || i38 == 1668576371 || i38 == 1701606260 || i38 == 1937011555 || i38 == 1937011578 || i38 == 1937013298 || i38 == 1937007471 || i38 == 1668232756 || i38 == 1953196132 || i38 == 1718909296 || i38 == 1969517665 || i38 == 1801812339 || i38 == 1768715124) {
                    je.b.k(i37 == 8);
                    je.b.k(this.j <= 2147483647L);
                    w wVar10 = new w((int) this.j);
                    System.arraycopy(wVar9.f13860a, 0, wVar10.f13860a, 0, 8);
                    this.f22812l = wVar10;
                    this.f22810h = 1;
                } else {
                    long position5 = lVar.getPosition();
                    long j22 = this.k;
                    long j23 = position5 - j22;
                    if (this.f22811i == 1836086884) {
                        new id.b(0L, j23, -9223372036854775807L, j23 + j22, this.j - j22);
                    }
                    this.f22812l = null;
                    this.f22810h = 1;
                }
            }
        }
    }

    @Override // pc.k
    public final void e(pc.m mVar) {
        this.f22817q = mVar;
    }

    @Override // pc.k
    public final boolean f(pc.l lVar) {
        return j.j(lVar, false, false);
    }

    @Override // pc.k
    public final void g(long j, long j5) {
        this.f22807e.clear();
        this.k = 0;
        this.f22813m = -1;
        this.f22814n = 0;
        this.f22815o = 0;
        this.f22816p = 0;
        if (j == 0) {
            if (this.f22810h != 3) {
                this.f22810h = 0;
                this.k = 0;
                return;
            } else {
                n nVar = this.f22808f;
                nVar.f22827a.clear();
                nVar.f22828b = 0;
                this.f22809g.clear();
                return;
            }
        }
        for (k kVar : this.f22818r) {
            r rVar = kVar.f22799b;
            int iE = e0.e(rVar.f22864f, j5, false);
            while (true) {
                if (iE < 0) {
                    iE = -1;
                    break;
                } else if ((rVar.f22865g[iE] & 1) != 0) {
                    break;
                } else {
                    iE--;
                }
            }
            if (iE == -1) {
                iE = rVar.a(j5);
            }
            kVar.f22802e = iE;
            y yVar = kVar.f22801d;
            if (yVar != null) {
                yVar.f17937b = false;
                yVar.f17938c = 0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092 A[LOOP:2: B:37:0x0087->B:41:0x0092, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x0098  */
    /* JADX WARN: Code duplicated, block: B:46:0x009e  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bc A[LOOP:3: B:51:0x00b2->B:55:0x00bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e4 A[EDGE_INSN: B:73:0x00e4->B:65:0x00e4 BREAK  A[LOOP:1: B:32:0x006b->B:64:0x00e0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00ba A[EDGE_INSN: B:81:0x00ba->B:54:0x00ba BREAK  A[LOOP:3: B:51:0x00b2->B:55:0x00bc], SYNTHETIC] */
    @Override // pc.u
    public final t h(long j) {
        long j5;
        long j7;
        long j10;
        int i7;
        long jMin;
        k[] kVarArr;
        int i10;
        r rVar;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int iE;
        int iA;
        int iE2;
        int iA2;
        k[] kVarArr2 = this.f22818r;
        int length = kVarArr2.length;
        v vVar = v.f17929c;
        if (length == 0) {
            return new t(vVar, vVar);
        }
        int i11 = this.f22820t;
        boolean z5 = false;
        int i12 = -1;
        long jMin2 = -1;
        if (i11 != -1) {
            r rVar2 = kVarArr2[i11].f22799b;
            long[] jArr3 = rVar2.f22864f;
            int iE3 = e0.e(jArr3, j, false);
            while (true) {
                if (iE3 < 0) {
                    iE3 = -1;
                    break;
                }
                if ((rVar2.f22865g[iE3] & 1) != 0) {
                    break;
                }
                iE3--;
            }
            if (iE3 == -1) {
                iE3 = rVar2.a(j);
            }
            long[] jArr4 = rVar2.f22861c;
            if (iE3 == -1) {
                return new t(vVar, vVar);
            }
            j7 = jArr3[iE3];
            j5 = jArr4[iE3];
            if (j7 < j && iE3 < rVar2.f22860b - 1 && (iA2 = rVar2.a(j)) != -1 && iA2 != iE3) {
                j10 = jArr3[iA2];
                jMin2 = jArr4[iA2];
            }
            i7 = 0;
            jMin = j5;
            while (true) {
                kVarArr = this.f22818r;
                if (i7 < kVarArr.length) {
                    break;
                }
                if (i7 != this.f22820t) {
                    rVar = kVarArr[i7].f22799b;
                    jArr = rVar.f22861c;
                    iArr = rVar.f22865g;
                    jArr2 = rVar.f22864f;
                    iE = e0.e(jArr2, j7, z5);
                    while (true) {
                        if (iE >= 0) {
                            iA = i12;
                            break;
                        }
                        if ((iArr[iE] & 1) != 0) {
                            iA = iE;
                            break;
                        }
                        iE--;
                    }
                    if (iA == i12) {
                        iA = rVar.a(j7);
                    }
                    if (iA == i12) {
                        jMin = Math.min(jArr[iA], jMin);
                    }
                    if (j10 != -9223372036854775807L) {
                        z5 = false;
                        iE2 = e0.e(jArr2, j10, false);
                        while (true) {
                            if (iE2 >= 0) {
                                iE2 = -1;
                                break;
                            }
                            if ((iArr[iE2] & 1) != 0) {
                                break;
                            }
                            iE2--;
                        }
                        i10 = -1;
                        if (iE2 == -1) {
                            iE2 = rVar.a(j10);
                        }
                        if (iE2 == -1) {
                            jMin2 = jMin2;
                        } else {
                            jMin2 = Math.min(jArr[iE2], jMin2);
                        }
                    } else {
                        jMin2 = jMin2;
                        z5 = false;
                        i10 = -1;
                    }
                } else {
                    i10 = i12;
                }
                i7++;
                i12 = i10;
            }
            v vVar2 = new v(j7, jMin);
            return j10 == -9223372036854775807L ? new t(vVar2, vVar2) : new t(vVar2, new v(j10, jMin2));
        }
        j5 = LongCompanionObject.MAX_VALUE;
        j7 = j;
        j10 = -9223372036854775807L;
        i7 = 0;
        jMin = j5;
        while (true) {
            kVarArr = this.f22818r;
            if (i7 < kVarArr.length) {
                break;
                break;
            }
            if (i7 != this.f22820t) {
                rVar = kVarArr[i7].f22799b;
                jArr = rVar.f22861c;
                iArr = rVar.f22865g;
                jArr2 = rVar.f22864f;
                iE = e0.e(jArr2, j7, z5);
                while (true) {
                    if (iE >= 0) {
                        iA = i12;
                        break;
                    }
                    if ((iArr[iE] & 1) != 0) {
                        iA = iE;
                        break;
                    }
                    iE--;
                }
                if (iA == i12) {
                    iA = rVar.a(j7);
                }
                if (iA == i12) {
                    jMin = Math.min(jArr[iA], jMin);
                }
                if (j10 != -9223372036854775807L) {
                    z5 = false;
                    iE2 = e0.e(jArr2, j10, false);
                    while (true) {
                        if (iE2 >= 0) {
                            iE2 = -1;
                            break;
                        }
                        if ((iArr[iE2] & 1) != 0) {
                            break;
                            break;
                        }
                        iE2--;
                    }
                    i10 = -1;
                    if (iE2 == -1) {
                        iE2 = rVar.a(j10);
                    }
                    if (iE2 == -1) {
                        jMin2 = jMin2;
                    } else {
                        jMin2 = Math.min(jArr[iE2], jMin2);
                    }
                } else {
                    jMin2 = jMin2;
                    z5 = false;
                    i10 = -1;
                }
            } else {
                i10 = i12;
            }
            i7++;
            i12 = i10;
        }
        v vVar3 = new v(j7, jMin);
        if (j10 == -9223372036854775807L) {
        }
    }

    @Override // pc.u
    public final long i() {
        return this.f22821u;
    }

    /* JADX WARN: Code duplicated, block: B:242:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00da  */
    public final void j(long j) throws h1 {
        ArrayDeque arrayDeque;
        int i7;
        Metadata metadata;
        Metadata metadata2;
        Metadata metadata3;
        pc.q qVar;
        Metadata metadata4;
        long j5;
        int i10;
        Metadata metadata5;
        int size;
        Metadata metadata6;
        int i11;
        int i12;
        pc.q qVar2;
        id.a aVar;
        ArrayDeque arrayDeque2;
        int i13;
        int i14;
        hd.j jVarG;
        String str;
        hd.j jVarH;
        while (true) {
            ArrayDeque arrayDeque3 = this.f22807e;
            if (arrayDeque3.isEmpty() || ((a) arrayDeque3.peek()).f22741i != j) {
                break;
            }
            a aVar2 = (a) arrayDeque3.pop();
            if (aVar2.f14999e == 1836019574) {
                ArrayList arrayList = new ArrayList();
                boolean z5 = this.f22822v == 1;
                pc.q qVar3 = new pc.q();
                b bVarG = aVar2.g(1969517665);
                int i15 = 1751411826;
                int i16 = 4;
                int i17 = 1768715124;
                int i18 = 1835365473;
                int i19 = 8;
                if (bVarG != null) {
                    byte[] bArr = e.f22754a;
                    w wVar = bVarG.f22744i;
                    wVar.F(8);
                    Metadata metadata7 = null;
                    Metadata metadata8 = null;
                    Metadata metadata9 = null;
                    while (wVar.a() >= i19) {
                        int i20 = wVar.f13861b;
                        int iG = wVar.g();
                        int iG2 = wVar.g();
                        if (iG2 == i18) {
                            wVar.F(i20);
                            int i21 = i20 + iG;
                            wVar.G(i19);
                            int i22 = wVar.f13861b;
                            wVar.G(i16);
                            if (wVar.g() != i15) {
                                i22 += 4;
                            }
                            wVar.F(i22);
                            while (true) {
                                int i23 = wVar.f13861b;
                                if (i23 < i21) {
                                    int iG3 = wVar.g();
                                    if (wVar.g() == i17) {
                                        wVar.F(i23);
                                        int i24 = i23 + iG3;
                                        wVar.G(i19);
                                        ArrayList arrayList2 = new ArrayList();
                                        while (true) {
                                            int i25 = wVar.f13861b;
                                            if (i25 >= i24) {
                                                break;
                                            }
                                            int iG4 = wVar.g() + i25;
                                            int i26 = i19;
                                            int iG5 = wVar.g();
                                            int i27 = (iG5 >> 24) & 255;
                                            ArrayDeque arrayDeque4 = arrayDeque3;
                                            if (i27 == 169 || i27 == 253) {
                                                i14 = i24;
                                                int i28 = 16777215 & iG5;
                                                if (i28 == 6516084) {
                                                    jVarG = j.b(iG5, wVar);
                                                } else if (i28 == 7233901 || i28 == 7631467) {
                                                    jVarG = j.g(iG5, "TIT2", wVar);
                                                } else if (i28 == 6516589 || i28 == 7828084) {
                                                    jVarG = j.g(iG5, "TCOM", wVar);
                                                } else if (i28 == 6578553) {
                                                    jVarG = j.g(iG5, "TDRC", wVar);
                                                } else if (i28 == 4280916) {
                                                    jVarG = j.g(iG5, "TPE1", wVar);
                                                } else if (i28 == 7630703) {
                                                    jVarG = j.g(iG5, "TSSE", wVar);
                                                } else if (i28 == 6384738) {
                                                    jVarG = j.g(iG5, "TALB", wVar);
                                                } else if (i28 == 7108978) {
                                                    jVarG = j.g(iG5, "USLT", wVar);
                                                } else if (i28 == 6776174) {
                                                    jVarG = j.g(iG5, "TCON", wVar);
                                                } else if (i28 == 6779504) {
                                                    jVarG = j.g(iG5, "TIT1", wVar);
                                                } else {
                                                    je.b.q("MetadataUtil", "Skipped unknown metadata entry: " + lc.a.b(iG5));
                                                    wVar.F(iG4);
                                                    jVarG = null;
                                                }
                                                wVar.F(iG4);
                                            } else {
                                                if (iG5 == 1735291493) {
                                                    try {
                                                        int i29 = j.i(wVar);
                                                        if (i29 > 0) {
                                                            String[] strArr = j.f22796a;
                                                            if (i29 <= 192) {
                                                                str = strArr[i29 - 1];
                                                            } else {
                                                                str = null;
                                                            }
                                                        } else {
                                                            str = null;
                                                        }
                                                        if (str != null) {
                                                            jVarG = new hd.n("TCON", null, ei.e0.r(str));
                                                        } else {
                                                            je.b.N("MetadataUtil", "Failed to parse standard genre code");
                                                            jVarG = null;
                                                        }
                                                    } catch (Throwable th2) {
                                                        wVar.F(iG4);
                                                        throw th2;
                                                    }
                                                } else if (iG5 == 1684632427) {
                                                    jVarG = j.d(iG5, "TPOS", wVar);
                                                } else if (iG5 == 1953655662) {
                                                    jVarG = j.d(iG5, "TRCK", wVar);
                                                } else {
                                                    if (iG5 == 1953329263) {
                                                        jVarH = j.h(iG5, "TBPM", wVar, true, false);
                                                    } else if (iG5 == 1668311404) {
                                                        jVarH = j.h(iG5, "TCMP", wVar, true, true);
                                                    } else if (iG5 == 1668249202) {
                                                        jVarG = j.c(wVar);
                                                    } else if (iG5 == 1631670868) {
                                                        jVarG = j.g(iG5, "TPE2", wVar);
                                                    } else if (iG5 == 1936682605) {
                                                        jVarG = j.g(iG5, "TSOT", wVar);
                                                    } else if (iG5 == 1936679276) {
                                                        jVarG = j.g(iG5, "TSO2", wVar);
                                                    } else if (iG5 == 1936679282) {
                                                        jVarG = j.g(iG5, "TSOA", wVar);
                                                    } else if (iG5 == 1936679265) {
                                                        jVarG = j.g(iG5, "TSOP", wVar);
                                                    } else if (iG5 == 1936679791) {
                                                        jVarG = j.g(iG5, "TSOC", wVar);
                                                    } else if (iG5 == 1920233063) {
                                                        jVarG = j.h(iG5, "ITUNESADVISORY", wVar, false, false);
                                                    } else if (iG5 == 1885823344) {
                                                        jVarH = j.h(iG5, "ITUNESGAPLESS", wVar, false, true);
                                                    } else if (iG5 == 1936683886) {
                                                        jVarG = j.g(iG5, "TVSHOWSORT", wVar);
                                                    } else if (iG5 == 1953919848) {
                                                        jVarG = j.g(iG5, "TVSHOW", wVar);
                                                    } else if (iG5 == 757935405) {
                                                        String strQ = null;
                                                        String strQ2 = null;
                                                        int i30 = -1;
                                                        int i31 = -1;
                                                        while (true) {
                                                            int i32 = wVar.f13861b;
                                                            if (i32 >= iG4) {
                                                                break;
                                                            }
                                                            int iG6 = wVar.g();
                                                            int iG7 = wVar.g();
                                                            int i33 = i24;
                                                            wVar.G(4);
                                                            if (iG7 == 1835360622) {
                                                                strQ = wVar.q(iG6 - 12);
                                                            } else if (iG7 == 1851878757) {
                                                                strQ2 = wVar.q(iG6 - 12);
                                                            } else {
                                                                if (iG7 == 1684108385) {
                                                                    i30 = i32;
                                                                    i31 = iG6;
                                                                }
                                                                wVar.G(iG6 - 12);
                                                            }
                                                            i24 = i33;
                                                        }
                                                        i14 = i24;
                                                        if (strQ == null || strQ2 == null || i30 == -1) {
                                                            jVarG = null;
                                                        } else {
                                                            wVar.F(i30);
                                                            wVar.G(16);
                                                            jVarG = new hd.k(strQ, strQ2, wVar.q(i31 - 16));
                                                        }
                                                        wVar.F(iG4);
                                                    } else {
                                                        i14 = i24;
                                                        je.b.q("MetadataUtil", "Skipped unknown metadata entry: " + lc.a.b(iG5));
                                                        wVar.F(iG4);
                                                        jVarG = null;
                                                    }
                                                    wVar.F(iG4);
                                                    jVarG = jVarH;
                                                    i14 = i24;
                                                }
                                                wVar.F(iG4);
                                                i14 = i24;
                                            }
                                            if (jVarG != null) {
                                                arrayList2.add(jVarG);
                                            }
                                            i19 = i26;
                                            arrayDeque3 = arrayDeque4;
                                            i24 = i14;
                                        }
                                        arrayDeque2 = arrayDeque3;
                                        i13 = i19;
                                        if (!arrayList2.isEmpty()) {
                                            metadata8 = new Metadata(arrayList2);
                                            break;
                                        }
                                    } else {
                                        wVar.F(i23 + iG3);
                                        i17 = 1768715124;
                                    }
                                } else {
                                    arrayDeque2 = arrayDeque3;
                                    i13 = i19;
                                }
                                metadata8 = null;
                                break;
                            }
                        } else {
                            arrayDeque2 = arrayDeque3;
                            i13 = i19;
                            if (iG2 == 1936553057) {
                                wVar.F(i20);
                                int i34 = i20 + iG;
                                wVar.G(12);
                                while (true) {
                                    int i35 = wVar.f13861b;
                                    if (i35 < i34) {
                                        int iG8 = wVar.g();
                                        if (wVar.g() != 1935766900) {
                                            wVar.F(i35 + iG8);
                                        } else if (iG8 >= 14) {
                                            wVar.G(5);
                                            int iU = wVar.u();
                                            if (iU == 12 || iU == 13) {
                                                float f2 = iU == 12 ? 240.0f : 120.0f;
                                                wVar.G(1);
                                                metadata7 = new Metadata(new id.e(f2, wVar.u()));
                                                break;
                                            }
                                        }
                                    }
                                    metadata7 = null;
                                    break;
                                }
                            } else if (iG2 == -1451722374) {
                                short sR = wVar.r();
                                wVar.G(2);
                                String strS = wVar.s(sR, di.d.f7631c);
                                int iMax = Math.max(strS.lastIndexOf(43), strS.lastIndexOf(45));
                                try {
                                    metadata9 = new Metadata(new jc.b(Float.parseFloat(strS.substring(0, iMax)), Float.parseFloat(strS.substring(iMax, strS.length() - 1))));
                                } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                    metadata9 = null;
                                }
                            }
                        }
                        wVar.F(i20 + iG);
                        i19 = i13;
                        arrayDeque3 = arrayDeque2;
                        i18 = 1835365473;
                        i15 = 1751411826;
                        i17 = 1768715124;
                        i16 = 4;
                    }
                    arrayDeque = arrayDeque3;
                    i7 = i19;
                    Metadata metadata10 = metadata8;
                    if (metadata10 != null) {
                        qVar3.b(metadata10);
                    }
                    metadata3 = metadata10;
                    metadata = metadata7;
                    metadata2 = metadata9;
                    i18 = 1835365473;
                } else {
                    arrayDeque = arrayDeque3;
                    i7 = 8;
                    metadata = null;
                    metadata2 = null;
                    metadata3 = null;
                }
                a aVarE = aVar2.e(i18);
                if (aVarE != null) {
                    byte[] bArr2 = e.f22754a;
                    b bVarG2 = aVarE.g(1751411826);
                    b bVarG3 = aVarE.g(1801812339);
                    b bVarG4 = aVarE.g(1768715124);
                    if (bVarG2 == null || bVarG3 == null || bVarG4 == null) {
                        qVar = qVar3;
                        metadata4 = null;
                    } else {
                        w wVar2 = bVarG2.f22744i;
                        wVar2.F(16);
                        if (wVar2.g() != 1835299937) {
                            qVar = qVar3;
                        } else {
                            w wVar3 = bVarG3.f22744i;
                            wVar3.F(12);
                            int iG9 = wVar3.g();
                            String[] strArr2 = new String[iG9];
                            for (int i36 = 0; i36 < iG9; i36++) {
                                int iG10 = wVar3.g();
                                wVar3.G(4);
                                strArr2[i36] = wVar3.s(iG10 - 8, di.d.f7631c);
                            }
                            w wVar4 = bVarG4.f22744i;
                            int i37 = i7;
                            wVar4.F(i37);
                            ArrayList arrayList3 = new ArrayList();
                            while (wVar4.a() > i37) {
                                int i38 = wVar4.f13861b;
                                int iG11 = wVar4.g();
                                int iG12 = wVar4.g() - 1;
                                if (iG12 < 0 || iG12 >= iG9) {
                                    qVar2 = qVar3;
                                    iG9 = iG9;
                                    strArr2 = strArr2;
                                    com.discord.chat.presentation.list.a.q(iG12, "Skipped metadata with unknown key index: ", "AtomParsers");
                                } else {
                                    String str2 = strArr2[iG12];
                                    int i39 = i38 + iG11;
                                    while (true) {
                                        int i40 = wVar4.f13861b;
                                        if (i40 >= i39) {
                                            qVar2 = qVar3;
                                            aVar = null;
                                            break;
                                        }
                                        int iG13 = wVar4.g();
                                        qVar2 = qVar3;
                                        if (wVar4.g() == 1684108385) {
                                            int iG14 = wVar4.g();
                                            int iG15 = wVar4.g();
                                            int i41 = iG13 - 16;
                                            byte[] bArr3 = new byte[i41];
                                            wVar4.e(bArr3, 0, i41);
                                            aVar = new id.a(str2, bArr3, iG15, iG14);
                                            break;
                                        }
                                        wVar4.F(i40 + iG13);
                                        qVar3 = qVar2;
                                    }
                                    if (aVar != null) {
                                        arrayList3.add(aVar);
                                    }
                                }
                                wVar4.F(i38 + iG11);
                                qVar3 = qVar2;
                                iG9 = iG9;
                                strArr2 = strArr2;
                                i37 = 8;
                            }
                            qVar = qVar3;
                            if (!arrayList3.isEmpty()) {
                                metadata4 = new Metadata(arrayList3);
                            }
                        }
                        metadata4 = null;
                    }
                } else {
                    qVar = qVar3;
                    metadata4 = null;
                }
                b bVarG5 = aVar2.g(1836476516);
                bVarG5.getClass();
                Metadata metadata11 = (Metadata) e.c(bVarG5.f22744i).f2615i;
                pc.q qVar4 = qVar;
                ArrayList arrayListF = e.f(aVar2, qVar4, -9223372036854775807L, null, false, z5, new vd.a());
                int size2 = arrayListF.size();
                int i42 = -1;
                int i43 = 0;
                long j7 = -9223372036854775807L;
                while (true) {
                    j5 = 0;
                    if (i43 >= size2) {
                        break;
                    }
                    r rVar = (r) arrayListF.get(i43);
                    int i44 = rVar.f22860b;
                    int i45 = rVar.f22863e;
                    if (i44 == 0) {
                        metadata5 = metadata;
                        size = i42;
                    } else {
                        o oVar = rVar.f22859a;
                        int i46 = i42;
                        long j10 = oVar.f22834e;
                        Format format = oVar.f22835f;
                        int i47 = oVar.f22831b;
                        if (j10 == -9223372036854775807L) {
                            j10 = rVar.f22866h;
                        }
                        long jMax = Math.max(j7, j10);
                        k kVar = new k(oVar, rVar, this.f22817q.x(i43, i47));
                        int i48 = "audio/true-hd".equals(format.I) ? i45 * 16 : i45 + 30;
                        g0 g0VarA = format.a();
                        g0VarA.f9644l = i48;
                        if (i47 != 2 || j10 <= 0) {
                            i10 = 1;
                        } else {
                            int i49 = rVar.f22860b;
                            i10 = 1;
                            if (i49 > 1) {
                                g0VarA.f9650r = i49 / (j10 / 1000000.0f);
                            }
                        }
                        if (i47 == i10 && (i11 = qVar4.f17920a) != -1 && (i12 = qVar4.f17921b) != -1) {
                            g0VarA.A = i11;
                            g0VarA.B = i12;
                        }
                        ArrayList arrayList4 = this.f22809g;
                        Metadata[] metadataArr = {metadata, arrayList4.isEmpty() ? null : new Metadata(arrayList4), metadata2, metadata11};
                        Metadata metadata12 = new Metadata(new cd.b[0]);
                        if (i47 == 1 && metadata3 != null) {
                            metadata12 = metadata3;
                        }
                        if (metadata4 != null) {
                            int i50 = 0;
                            while (true) {
                                cd.b[] bVarArr = metadata4.f5693d;
                                if (i50 >= bVarArr.length) {
                                    break;
                                }
                                cd.b bVar = bVarArr[i50];
                                if (bVar instanceof id.a) {
                                    id.a aVar3 = (id.a) bVar;
                                    metadata6 = metadata;
                                    if (!aVar3.f11698d.equals("com.android.capture.fps")) {
                                        metadata12 = metadata12.a(aVar3);
                                    } else if (i47 == 2) {
                                        metadata12 = metadata12.a(aVar3);
                                    }
                                } else {
                                    metadata6 = metadata;
                                }
                                i50++;
                                metadata = metadata6;
                            }
                        }
                        metadata5 = metadata;
                        for (int i51 = 0; i51 < 4; i51++) {
                            Metadata metadata13 = metadataArr[i51];
                            metadata12.getClass();
                            if (metadata13 != null) {
                                metadata12 = metadata12.a(metadata13.f5693d);
                            }
                        }
                        if (metadata12.f5693d.length > 0) {
                            g0VarA.f9643i = metadata12;
                        }
                        kVar.f22800c.e(new Format(g0VarA));
                        if (i47 == 2) {
                            size = i46;
                            if (size == -1) {
                                size = arrayList.size();
                            }
                        } else {
                            size = i46;
                        }
                        arrayList.add(kVar);
                        j7 = jMax;
                    }
                    i43++;
                    i42 = size;
                    metadata = metadata5;
                    arrayListF = arrayListF;
                    size2 = size2;
                }
                this.f22820t = i42;
                this.f22821u = j7;
                k[] kVarArr = (k[]) arrayList.toArray(new k[0]);
                this.f22818r = kVarArr;
                long[][] jArr = new long[kVarArr.length][];
                int[] iArr = new int[kVarArr.length];
                long[] jArr2 = new long[kVarArr.length];
                boolean[] zArr = new boolean[kVarArr.length];
                for (int i52 = 0; i52 < kVarArr.length; i52++) {
                    jArr[i52] = new long[kVarArr[i52].f22799b.f22860b];
                    jArr2[i52] = kVarArr[i52].f22799b.f22864f[0];
                }
                int i53 = 0;
                while (i53 < kVarArr.length) {
                    long j11 = Long.MAX_VALUE;
                    int i54 = -1;
                    for (int i55 = 0; i55 < kVarArr.length; i55++) {
                        if (!zArr[i55]) {
                            long j12 = jArr2[i55];
                            if (j12 <= j11) {
                                i54 = i55;
                                j11 = j12;
                            }
                        }
                    }
                    int i56 = iArr[i54];
                    long[] jArr3 = jArr[i54];
                    jArr3[i56] = j5;
                    r rVar2 = kVarArr[i54].f22799b;
                    j5 += (long) rVar2.f22862d[i56];
                    int i57 = i56 + 1;
                    iArr[i54] = i57;
                    if (i57 < jArr3.length) {
                        jArr2[i54] = rVar2.f22864f[i57];
                    } else {
                        zArr[i54] = true;
                        i53++;
                    }
                }
                this.f22819s = jArr;
                this.f22817q.q();
                this.f22817q.c(this);
                arrayDeque.clear();
                this.f22810h = 2;
            } else if (!arrayDeque3.isEmpty()) {
                ((a) arrayDeque3.peek()).f22743w.add(aVar2);
            }
        }
        if (this.f22810h != 2) {
            this.f22810h = 0;
            this.k = 0;
        }
    }

    @Override // pc.k
    public final void release() {
    }
}
