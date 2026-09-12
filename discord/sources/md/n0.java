package md;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import java.io.EOFException;
import java.util.ArrayList;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public class n0 implements pc.x {
    public Format A;
    public Format B;
    public long C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f15665a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mc.s f15668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mc.n f15669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f15670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Format f15671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public mc.k f15672h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15678p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15679q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15680r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15681s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f15685w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f15688z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.rnfs.b f15666b = new com.rnfs.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15673i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long[] f15676n = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f15675m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f15674l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public pc.w[] f15677o = new pc.w[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1.d f15667c = new a1.d(new mc.q(2));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f15682t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f15683u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f15684v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f15687y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f15686x = true;

    public n0(he.q qVar, mc.s sVar, mc.n nVar) {
        this.f15668d = sVar;
        this.f15669e = nVar;
        this.f15665a = new k0(qVar);
    }

    @Override // pc.x
    public final int a(he.k kVar, int i7, boolean z5) throws EOFException {
        k0 k0Var = this.f15665a;
        int iC = k0Var.c(i7);
        j0 j0Var = k0Var.f15650f;
        he.a aVar = (he.a) j0Var.f15638i;
        int i10 = kVar.read(aVar.f10586a, ((int) (k0Var.f15651g - j0Var.f15636d)) + aVar.f10587b, iC);
        if (i10 == -1) {
            if (z5) {
                return -1;
            }
            throw new EOFException();
        }
        long j = k0Var.f15651g + ((long) i10);
        k0Var.f15651g = j;
        j0 j0Var2 = k0Var.f15650f;
        if (j == j0Var2.f15637e) {
            k0Var.f15650f = (j0) j0Var2.f15639v;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x017b A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:87:0x0124, B:110:0x01a1, B:112:0x01aa, B:89:0x013f, B:91:0x0143, B:93:0x014e, B:95:0x0167, B:99:0x0170, B:100:0x0175, B:102:0x017b, B:106:0x0189, B:108:0x018e, B:109:0x019e, B:92:0x014c), top: B:118:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0186  */
    /* JADX WARN: Code duplicated, block: B:105:0x0188  */
    /* JADX WARN: Code duplicated, block: B:108:0x018e A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:87:0x0124, B:110:0x01a1, B:112:0x01aa, B:89:0x013f, B:91:0x0143, B:93:0x014e, B:95:0x0167, B:99:0x0170, B:100:0x0175, B:102:0x017b, B:106:0x0189, B:108:0x018e, B:109:0x019e, B:92:0x014c), top: B:118:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:89:0x013f A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:87:0x0124, B:110:0x01a1, B:112:0x01aa, B:89:0x013f, B:91:0x0143, B:93:0x014e, B:95:0x0167, B:99:0x0170, B:100:0x0175, B:102:0x017b, B:106:0x0189, B:108:0x018e, B:109:0x019e, B:92:0x014c), top: B:118:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0143 A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:87:0x0124, B:110:0x01a1, B:112:0x01aa, B:89:0x013f, B:91:0x0143, B:93:0x014e, B:95:0x0167, B:99:0x0170, B:100:0x0175, B:102:0x017b, B:106:0x0189, B:108:0x018e, B:109:0x019e, B:92:0x014c), top: B:118:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x014c A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:87:0x0124, B:110:0x01a1, B:112:0x01aa, B:89:0x013f, B:91:0x0143, B:93:0x014e, B:95:0x0167, B:99:0x0170, B:100:0x0175, B:102:0x017b, B:106:0x0189, B:108:0x018e, B:109:0x019e, B:92:0x014c), top: B:118:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0167 A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:87:0x0124, B:110:0x01a1, B:112:0x01aa, B:89:0x013f, B:91:0x0143, B:93:0x014e, B:95:0x0167, B:99:0x0170, B:100:0x0175, B:102:0x017b, B:106:0x0189, B:108:0x018e, B:109:0x019e, B:92:0x014c), top: B:118:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x016d  */
    /* JADX WARN: Code duplicated, block: B:98:0x016f  */
    @Override // pc.x
    public void c(long j, int i7, int i10, int i11, pc.w wVar) {
        int i12;
        mc.s sVar;
        mc.r rVarD;
        a1.d dVar;
        int i13;
        SparseArray sparseArray;
        int iKeyAt;
        boolean z5;
        boolean z6;
        boolean z7;
        if (this.f15688z) {
            Format format = this.A;
            je.b.l(format);
            e(format);
        }
        int i14 = i7 & 1;
        boolean z10 = i14 != 0;
        if (this.f15686x) {
            if (!z10) {
                return;
            } else {
                this.f15686x = false;
            }
        }
        long j5 = j + this.F;
        if (!this.D) {
            i12 = i7;
        } else {
            if (j5 < this.f15682t) {
                return;
            }
            if (i14 == 0) {
                if (!this.E) {
                    je.b.N("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.B);
                    this.E = true;
                }
                i12 = i7 | 1;
            } else {
                i12 = i7;
            }
        }
        if (this.G) {
            if (!z10) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f15678p == 0) {
                        z7 = j5 > this.f15683u;
                    } else {
                        synchronized (this) {
                            long jMax = Math.max(this.f15683u, m(this.f15681s));
                            if (jMax >= j5) {
                                z7 = false;
                            } else {
                                int i15 = this.f15678p;
                                int iO = o(i15 - 1);
                                while (i15 > this.f15681s && this.f15676n[iO] >= j5) {
                                    i15--;
                                    iO--;
                                    if (iO == -1) {
                                        iO = this.f15673i - 1;
                                    }
                                }
                                i(this.f15679q + i15);
                                z7 = true;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!z7) {
                return;
            } else {
                this.G = false;
            }
        }
        long j7 = (this.f15665a.f15651g - ((long) i10)) - ((long) i11);
        synchronized (this) {
            try {
                int i16 = this.f15678p;
                if (i16 > 0) {
                    int iO2 = o(i16 - 1);
                    je.b.g(this.k[iO2] + ((long) this.f15674l[iO2]) <= j7);
                }
                this.f15685w = (536870912 & i12) != 0;
                this.f15684v = Math.max(this.f15684v, j5);
                int iO3 = o(this.f15678p);
                this.f15676n[iO3] = j5;
                this.k[iO3] = j7;
                this.f15674l[iO3] = i10;
                this.f15675m[iO3] = i12;
                this.f15677o[iO3] = wVar;
                this.j[iO3] = this.C;
                if (((SparseArray) this.f15667c.f18i).size() == 0) {
                    sVar = this.f15668d;
                    if (sVar != null) {
                        rVarD = sVar.d(this.f15669e, this.B);
                    } else {
                        rVarD = mc.r.f15572r;
                    }
                    dVar = this.f15667c;
                    i13 = this.f15679q + this.f15678p;
                    Format format2 = this.B;
                    format2.getClass();
                    l0 l0Var = new l0(format2, rVarD);
                    sparseArray = (SparseArray) dVar.f18i;
                    if (dVar.f17e == -1) {
                        if (sparseArray.size() == 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        je.b.k(z6);
                        dVar.f17e = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i13 >= iKeyAt) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        je.b.g(z5);
                        if (iKeyAt == i13) {
                            ((mc.q) dVar.f19v).c(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i13, l0Var);
                } else {
                    SparseArray sparseArray2 = (SparseArray) this.f15667c.f18i;
                    if (!((l0) sparseArray2.valueAt(sparseArray2.size() - 1)).f15659a.equals(this.B)) {
                        sVar = this.f15668d;
                        if (sVar != null) {
                            rVarD = sVar.d(this.f15669e, this.B);
                        } else {
                            rVarD = mc.r.f15572r;
                        }
                        dVar = this.f15667c;
                        i13 = this.f15679q + this.f15678p;
                        Format format3 = this.B;
                        format3.getClass();
                        l0 l0Var2 = new l0(format3, rVarD);
                        sparseArray = (SparseArray) dVar.f18i;
                        if (dVar.f17e == -1) {
                            if (sparseArray.size() == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            je.b.k(z6);
                            dVar.f17e = 0;
                        }
                        if (sparseArray.size() > 0) {
                            iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            if (i13 >= iKeyAt) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            je.b.g(z5);
                            if (iKeyAt == i13) {
                                ((mc.q) dVar.f19v).c(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i13, l0Var2);
                    }
                }
                int i17 = this.f15678p + 1;
                this.f15678p = i17;
                int i18 = this.f15673i;
                if (i17 == i18) {
                    int i19 = i18 + 1000;
                    long[] jArr = new long[i19];
                    long[] jArr2 = new long[i19];
                    long[] jArr3 = new long[i19];
                    int[] iArr = new int[i19];
                    int[] iArr2 = new int[i19];
                    pc.w[] wVarArr = new pc.w[i19];
                    int i20 = this.f15680r;
                    int i21 = i18 - i20;
                    System.arraycopy(this.k, i20, jArr2, 0, i21);
                    System.arraycopy(this.f15676n, this.f15680r, jArr3, 0, i21);
                    System.arraycopy(this.f15675m, this.f15680r, iArr, 0, i21);
                    System.arraycopy(this.f15674l, this.f15680r, iArr2, 0, i21);
                    System.arraycopy(this.f15677o, this.f15680r, wVarArr, 0, i21);
                    System.arraycopy(this.j, this.f15680r, jArr, 0, i21);
                    int i22 = this.f15680r;
                    System.arraycopy(this.k, 0, jArr2, i21, i22);
                    System.arraycopy(this.f15676n, 0, jArr3, i21, i22);
                    System.arraycopy(this.f15675m, 0, iArr, i21, i22);
                    System.arraycopy(this.f15674l, 0, iArr2, i21, i22);
                    System.arraycopy(this.f15677o, 0, wVarArr, i21, i22);
                    System.arraycopy(this.j, 0, jArr, i21, i22);
                    this.k = jArr2;
                    this.f15676n = jArr3;
                    this.f15675m = iArr;
                    this.f15674l = iArr2;
                    this.f15677o = wVarArr;
                    this.j = jArr;
                    this.f15680r = 0;
                    this.f15673i = i19;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // pc.x
    public final void d(int i7, je.w wVar) {
        while (true) {
            k0 k0Var = this.f15665a;
            if (i7 <= 0) {
                k0Var.getClass();
                return;
            }
            int iC = k0Var.c(i7);
            j0 j0Var = k0Var.f15650f;
            he.a aVar = (he.a) j0Var.f15638i;
            wVar.e(aVar.f10586a, ((int) (k0Var.f15651g - j0Var.f15636d)) + aVar.f10587b, iC);
            i7 -= iC;
            long j = k0Var.f15651g + ((long) iC);
            k0Var.f15651g = j;
            j0 j0Var2 = k0Var.f15650f;
            if (j == j0Var2.f15637e) {
                k0Var.f15650f = (j0) j0Var2.f15639v;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005b A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:4:0x000a, B:8:0x0017, B:13:0x0029, B:15:0x0042, B:19:0x005d, B:81:0x0111, B:73:0x00fe, B:76:0x0106, B:18:0x005b), top: B:91:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:80:0x0110  */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object, md.m0] */
    @Override // pc.x
    public final void e(Format format) {
        boolean z5;
        c5.e eVarF;
        int iB;
        Format formatL = l(format);
        boolean z6 = false;
        this.f15688z = false;
        this.A = format;
        synchronized (this) {
            try {
                this.f15687y = false;
                if (!je.e0.a(formatL, this.B)) {
                    if (((SparseArray) this.f15667c.f18i).size() == 0) {
                        this.B = formatL;
                    } else {
                        SparseArray sparseArray = (SparseArray) this.f15667c.f18i;
                        if (((l0) sparseArray.valueAt(sparseArray.size() - 1)).f15659a.equals(formatL)) {
                            SparseArray sparseArray2 = (SparseArray) this.f15667c.f18i;
                            this.B = ((l0) sparseArray2.valueAt(sparseArray2.size() - 1)).f15659a;
                        } else {
                            this.B = formatL;
                        }
                    }
                    Format format2 = this.B;
                    String str = format2.I;
                    String str2 = format2.F;
                    ArrayList arrayList = je.o.f13816a;
                    if (str != null) {
                        switch (str) {
                            case "audio/eac3-joc":
                            case "audio/mpeg-L1":
                            case "audio/mpeg-L2":
                            case "audio/ac3":
                            case "audio/raw":
                            case "audio/eac3":
                            case "audio/flac":
                            case "audio/mpeg":
                            case "audio/g711-alaw":
                            case "audio/g711-mlaw":
                                z5 = true;
                                break;
                            case "audio/mp4a-latm":
                                if (str2 != null && (eVarF = je.o.f(str2)) != null && (iB = eVarF.b()) != 0 && iB != 16) {
                                    z5 = true;
                                    break;
                                } else {
                                    z5 = false;
                                    break;
                                }
                                break;
                            default:
                                z5 = false;
                                break;
                        }
                    } else {
                        z5 = false;
                    }
                    this.D = z5;
                    this.E = false;
                    z6 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ?? r6 = this.f15670f;
        if (r6 == 0 || !z6) {
            return;
        }
        r6.b();
    }

    public final long f(int i7) {
        this.f15683u = Math.max(this.f15683u, m(i7));
        this.f15678p -= i7;
        int i10 = this.f15679q + i7;
        this.f15679q = i10;
        int i11 = this.f15680r + i7;
        this.f15680r = i11;
        int i12 = this.f15673i;
        if (i11 >= i12) {
            this.f15680r = i11 - i12;
        }
        int i13 = this.f15681s - i7;
        this.f15681s = i13;
        int i14 = 0;
        if (i13 < 0) {
            this.f15681s = 0;
        }
        a1.d dVar = this.f15667c;
        SparseArray sparseArray = (SparseArray) dVar.f18i;
        while (i14 < sparseArray.size() - 1) {
            int i15 = i14 + 1;
            if (i10 < sparseArray.keyAt(i15)) {
                break;
            }
            ((mc.q) dVar.f19v).c(sparseArray.valueAt(i14));
            sparseArray.removeAt(i14);
            int i16 = dVar.f17e;
            if (i16 > 0) {
                dVar.f17e = i16 - 1;
            }
            i14 = i15;
        }
        if (this.f15678p != 0) {
            return this.k[this.f15680r];
        }
        int i17 = this.f15680r;
        if (i17 == 0) {
            i17 = this.f15673i;
        }
        int i18 = i17 - 1;
        return this.k[i18] + ((long) this.f15674l[i18]);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final void g(long j, boolean z5) throws Throwable {
        Throwable th2;
        k0 k0Var = this.f15665a;
        synchronized (this) {
            try {
                try {
                    int i7 = this.f15678p;
                    long jF = -1;
                    if (i7 != 0) {
                        long[] jArr = this.f15676n;
                        int i10 = this.f15680r;
                        if (j >= jArr[i10]) {
                            if (z5) {
                                try {
                                    int i11 = this.f15681s;
                                    if (i11 != i7) {
                                        i7 = i11 + 1;
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    throw th2;
                                }
                            }
                            int iK = k(i10, j, i7, false);
                            if (iK != -1) {
                                jF = f(iK);
                            }
                        }
                    }
                    k0Var.b(jF);
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                throw th2;
            }
        }
    }

    public final void h() {
        long jF;
        k0 k0Var = this.f15665a;
        synchronized (this) {
            int i7 = this.f15678p;
            jF = i7 == 0 ? -1L : f(i7);
        }
        k0Var.b(jF);
    }

    public final long i(int i7) {
        int i10 = this.f15679q;
        int i11 = this.f15678p;
        int i12 = (i10 + i11) - i7;
        boolean z5 = false;
        je.b.g(i12 >= 0 && i12 <= i11 - this.f15681s);
        int i13 = this.f15678p - i12;
        this.f15678p = i13;
        this.f15684v = Math.max(this.f15683u, m(i13));
        if (i12 == 0 && this.f15685w) {
            z5 = true;
        }
        this.f15685w = z5;
        a1.d dVar = this.f15667c;
        SparseArray sparseArray = (SparseArray) dVar.f18i;
        for (int size = sparseArray.size() - 1; size >= 0 && i7 < sparseArray.keyAt(size); size--) {
            ((mc.q) dVar.f19v).c(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        dVar.f17e = sparseArray.size() > 0 ? Math.min(dVar.f17e, sparseArray.size() - 1) : -1;
        int i14 = this.f15678p;
        if (i14 == 0) {
            return 0L;
        }
        int iO = o(i14 - 1);
        return this.k[iO] + ((long) this.f15674l[iO]);
    }

    public final void j(int i7) {
        long jI = i(i7);
        k0 k0Var = this.f15665a;
        int i10 = k0Var.f15646b;
        je.b.g(jI <= k0Var.f15651g);
        k0Var.f15651g = jI;
        if (jI != 0) {
            j0 j0Var = k0Var.f15648d;
            if (jI != j0Var.f15636d) {
                while (k0Var.f15651g > j0Var.f15637e) {
                    j0Var = (j0) j0Var.f15639v;
                }
                j0 j0Var2 = (j0) j0Var.f15639v;
                j0Var2.getClass();
                k0Var.a(j0Var2);
                j0 j0Var3 = new j0(j0Var.f15637e, i10);
                j0Var.f15639v = j0Var3;
                if (k0Var.f15651g == j0Var.f15637e) {
                    j0Var = j0Var3;
                }
                k0Var.f15650f = j0Var;
                if (k0Var.f15649e == j0Var2) {
                    k0Var.f15649e = j0Var3;
                    return;
                }
                return;
            }
        }
        k0Var.a(k0Var.f15648d);
        j0 j0Var4 = new j0(k0Var.f15651g, i10);
        k0Var.f15648d = j0Var4;
        k0Var.f15649e = j0Var4;
        k0Var.f15650f = j0Var4;
    }

    public final int k(int i7, long j, int i10, boolean z5) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            long j5 = this.f15676n[i7];
            if (j5 > j) {
                break;
            }
            if (!z5 || (this.f15675m[i7] & 1) != 0) {
                if (j5 == j) {
                    return i12;
                }
                i11 = i12;
            }
            i7++;
            if (i7 == this.f15673i) {
                i7 = 0;
            }
        }
        return i11;
    }

    public Format l(Format format) {
        if (this.F == 0 || format.M == LongCompanionObject.MAX_VALUE) {
            return format;
        }
        gc.g0 g0VarA = format.a();
        g0VarA.f9647o = format.M + this.F;
        return new Format(g0VarA);
    }

    public final long m(int i7) {
        long jMax = Long.MIN_VALUE;
        if (i7 == 0) {
            return Long.MIN_VALUE;
        }
        int iO = o(i7 - 1);
        for (int i10 = 0; i10 < i7; i10++) {
            jMax = Math.max(jMax, this.f15676n[iO]);
            if ((this.f15675m[iO] & 1) != 0) {
                return jMax;
            }
            iO--;
            if (iO == -1) {
                iO = this.f15673i - 1;
            }
        }
        return jMax;
    }

    public final int n() {
        return this.f15679q + this.f15681s;
    }

    public final int o(int i7) {
        int i10 = this.f15680r + i7;
        int i11 = this.f15673i;
        return i10 < i11 ? i10 : i10 - i11;
    }

    public final synchronized int p(long j, boolean z5) throws Throwable {
        try {
            try {
                int iO = o(this.f15681s);
                int i7 = this.f15681s;
                int i10 = this.f15678p;
                if (!(i7 != i10) || j < this.f15676n[iO]) {
                    return 0;
                }
                if (j > this.f15684v && z5) {
                    return i10 - i7;
                }
                int iK = k(iO, j, i10 - i7, true);
                if (iK == -1) {
                    return 0;
                }
                return iK;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized Format q() {
        return this.f15687y ? null : this.B;
    }

    public final synchronized boolean r(boolean z5) {
        Format format;
        boolean z6 = false;
        if (this.f15681s != this.f15678p) {
            if (((l0) this.f15667c.h(n())).f15659a != this.f15671g) {
                return true;
            }
            return s(o(this.f15681s));
        }
        if (z5 || this.f15685w || ((format = this.B) != null && format != this.f15671g)) {
            z6 = true;
        }
        return z6;
    }

    public final boolean s(int i7) {
        mc.k kVar = this.f15672h;
        if (kVar == null || kVar.getState() == 4) {
            return true;
        }
        return (this.f15675m[i7] & 1073741824) == 0 && this.f15672h.c();
    }

    public final void t() throws mc.j {
        mc.k kVar = this.f15672h;
        if (kVar == null || kVar.getState() != 1) {
            return;
        }
        mc.j error = this.f15672h.getError();
        error.getClass();
        throw error;
    }

    public final void u(Format format, e4.r rVar) {
        Format format2;
        Format format3 = this.f15671g;
        boolean z5 = format3 == null;
        mc.i iVar = z5 ? null : format3.L;
        this.f15671g = format;
        mc.i iVar2 = format.L;
        mc.s sVar = this.f15668d;
        if (sVar != null) {
            int iB = sVar.b(format);
            gc.g0 g0VarA = format.a();
            g0VarA.F = iB;
            format2 = new Format(g0VarA);
        } else {
            format2 = format;
        }
        rVar.f8035i = format2;
        rVar.f8034e = this.f15672h;
        if (sVar == null) {
            return;
        }
        if (z5 || !je.e0.a(iVar, iVar2)) {
            mc.k kVar = this.f15672h;
            mc.n nVar = this.f15669e;
            mc.k kVarC = sVar.c(nVar, format);
            this.f15672h = kVarC;
            rVar.f8034e = kVarC;
            if (kVar != null) {
                kVar.d(nVar);
            }
        }
    }

    public final synchronized long v() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f15681s != this.f15678p ? this.j[o(this.f15681s)] : this.C;
    }

    public final int w(e4.r rVar, lc.f fVar, int i7, boolean z5) {
        int i10;
        boolean z6 = (i7 & 2) != 0;
        com.rnfs.b bVar = this.f15666b;
        synchronized (this) {
            try {
                fVar.f15011w = false;
                i10 = -3;
                if (this.f15681s != this.f15678p) {
                    Format format = ((l0) this.f15667c.h(n())).f15659a;
                    if (z6 || format != this.f15671g) {
                        u(format, rVar);
                        i10 = -5;
                    } else {
                        int iO = o(this.f15681s);
                        if (s(iO)) {
                            fVar.f14999e = this.f15675m[iO];
                            if (this.f15681s == this.f15678p - 1 && (z5 || this.f15685w)) {
                                fVar.a(536870912);
                            }
                            long j = this.f15676n[iO];
                            fVar.f15012x = j;
                            if (j < this.f15682t) {
                                fVar.a(Integer.MIN_VALUE);
                            }
                            bVar.f7077a = this.f15674l[iO];
                            bVar.f7078b = this.k[iO];
                            bVar.f7079c = this.f15677o[iO];
                            i10 = -4;
                        } else {
                            fVar.f15011w = true;
                        }
                    }
                } else if (z5 || this.f15685w) {
                    fVar.f14999e = 4;
                    i10 = -4;
                } else {
                    Format format2 = this.B;
                    if (format2 != null && (z6 || format2 != this.f15671g)) {
                        u(format2, rVar);
                        i10 = -5;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i10 == -4 && !fVar.c(4)) {
            boolean z7 = (i7 & 1) != 0;
            if ((i7 & 4) == 0) {
                if (z7) {
                    k0 k0Var = this.f15665a;
                    k0.f(k0Var.f15649e, fVar, this.f15666b, k0Var.f15647c);
                } else {
                    k0 k0Var2 = this.f15665a;
                    k0Var2.f15649e = k0.f(k0Var2.f15649e, fVar, this.f15666b, k0Var2.f15647c);
                }
            }
            if (!z7) {
                this.f15681s++;
            }
        }
        return i10;
    }

    public final void x(boolean z5) {
        k0 k0Var = this.f15665a;
        k0Var.a(k0Var.f15648d);
        j0 j0Var = k0Var.f15648d;
        int i7 = k0Var.f15646b;
        je.b.k(((he.a) j0Var.f15638i) == null);
        j0Var.f15636d = 0L;
        j0Var.f15637e = i7;
        j0 j0Var2 = k0Var.f15648d;
        k0Var.f15649e = j0Var2;
        k0Var.f15650f = j0Var2;
        k0Var.f15651g = 0L;
        k0Var.f15645a.b();
        this.f15678p = 0;
        this.f15679q = 0;
        this.f15680r = 0;
        this.f15681s = 0;
        this.f15686x = true;
        this.f15682t = Long.MIN_VALUE;
        this.f15683u = Long.MIN_VALUE;
        this.f15684v = Long.MIN_VALUE;
        this.f15685w = false;
        a1.d dVar = this.f15667c;
        SparseArray sparseArray = (SparseArray) dVar.f18i;
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            ((mc.q) dVar.f19v).c(sparseArray.valueAt(i10));
        }
        dVar.f17e = -1;
        sparseArray.clear();
        if (z5) {
            this.A = null;
            this.B = null;
            this.f15687y = true;
        }
    }

    public final synchronized boolean y(long j, boolean z5) throws Throwable {
        try {
            try {
                synchronized (this) {
                    try {
                        this.f15681s = 0;
                        k0 k0Var = this.f15665a;
                        k0Var.f15649e = k0Var.f15648d;
                        int iO = o(0);
                        int i7 = this.f15681s;
                        int i10 = this.f15678p;
                        if (!(i7 != i10) || j < this.f15676n[iO] || (j > this.f15684v && !z5)) {
                            return false;
                        }
                        int iK = k(iO, j, i10 - i7, true);
                        if (iK == -1) {
                            return false;
                        }
                        this.f15682t = j;
                        this.f15681s += iK;
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void z(int i7) {
        boolean z5;
        if (i7 >= 0) {
            try {
                if (this.f15681s + i7 <= this.f15678p) {
                    z5 = true;
                } else {
                    z5 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            z5 = false;
        }
        je.b.g(z5);
        this.f15681s += i7;
    }
}
