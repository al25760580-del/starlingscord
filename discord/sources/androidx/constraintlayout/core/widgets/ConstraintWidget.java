package androidx.constraintlayout.core.widgets;

import android.view.View;
import androidx.constraintlayout.core.Metrics;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import n8.f;
import p0.b;
import p0.e;
import r0.a;
import r0.c;
import s0.d;
import s0.h;
import s0.m;
import s0.o;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidget {
    public float A;
    public final int[] B;
    public float C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public final c H;
    public final c I;
    public final c J;
    public final c K;
    public final c L;
    public final c M;
    public final c N;
    public final c O;
    public final c[] P;
    public final ArrayList Q;
    public final boolean[] R;
    public ConstraintWidget S;
    public int T;
    public int U;
    public float V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public int a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f1238b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f1239b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f1240c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f1241c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f1243d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public View f1245e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f1247f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public String f1249g0;
    public int h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1252i0;
    public boolean j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final float[] f1253j0;
    public boolean k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final ConstraintWidget[] f1254k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1255l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final ConstraintWidget[] f1256l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1257m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f1258m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1259n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f1260n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1261o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final int[] f1262o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1263p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1264q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1265r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int[] f1266s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1267t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1268u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f1269v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1270w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1271x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f1272y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f1273z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1237a = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f1242d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f1244e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f1246f = {true, true};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1248g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1250h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1251i = -1;

    public ConstraintWidget() {
        new HashMap();
        this.j = false;
        this.k = false;
        this.f1255l = false;
        this.f1257m = false;
        this.f1259n = -1;
        this.f1261o = -1;
        this.f1263p = 0;
        this.f1264q = 0;
        this.f1265r = 0;
        this.f1266s = new int[2];
        this.f1267t = 0;
        this.f1268u = 0;
        this.f1269v = 1.0f;
        this.f1270w = 0;
        this.f1271x = 0;
        this.f1272y = 1.0f;
        this.f1273z = -1;
        this.A = 1.0f;
        this.B = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.C = 0.0f;
        this.D = false;
        this.E = false;
        this.F = 0;
        this.G = 0;
        c cVar = new c(this, 2);
        this.H = cVar;
        c cVar2 = new c(this, 3);
        this.I = cVar2;
        c cVar3 = new c(this, 4);
        this.J = cVar3;
        c cVar4 = new c(this, 5);
        this.K = cVar4;
        c cVar5 = new c(this, 6);
        this.L = cVar5;
        c cVar6 = new c(this, 8);
        this.M = cVar6;
        c cVar7 = new c(this, 9);
        this.N = cVar7;
        c cVar8 = new c(this, 7);
        this.O = cVar8;
        this.P = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar8};
        ArrayList arrayList = new ArrayList();
        this.Q = arrayList;
        this.R = new boolean[2];
        this.f1262o0 = new int[]{1, 1};
        this.S = null;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.f1241c0 = 0.5f;
        this.f1243d0 = 0.5f;
        this.f1247f0 = 0;
        this.f1249g0 = null;
        this.h0 = 0;
        this.f1252i0 = 0;
        this.f1253j0 = new float[]{-1.0f, -1.0f};
        this.f1254k0 = new ConstraintWidget[]{null, null};
        this.f1256l0 = new ConstraintWidget[]{null, null};
        this.f1258m0 = -1;
        this.f1260n0 = -1;
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar5);
    }

    public final void A() {
        ConstraintWidget constraintWidget = this.S;
        if (constraintWidget != null && (constraintWidget instanceof ConstraintWidgetContainer)) {
            ((ConstraintWidgetContainer) constraintWidget).getClass();
        }
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((c) arrayList.get(i7)).j();
        }
    }

    public final void B() {
        this.j = false;
        this.k = false;
        this.f1255l = false;
        this.f1257m = false;
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            c cVar = (c) arrayList.get(i7);
            cVar.f19145c = false;
            cVar.f19144b = 0;
        }
    }

    public void C(f fVar) {
        this.H.k();
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.O.k();
        this.M.k();
        this.N.k();
    }

    public final void D(int i7) {
        this.Z = i7;
        this.D = i7 > 0;
    }

    public final void E(int i7, int i10) {
        if (this.j) {
            return;
        }
        this.H.l(i7);
        this.J.l(i10);
        this.X = i7;
        this.T = i10 - i7;
        this.j = true;
    }

    public final void F(int i7, int i10) {
        if (this.k) {
            return;
        }
        this.I.l(i7);
        this.K.l(i10);
        this.Y = i7;
        this.U = i10 - i7;
        if (this.D) {
            this.L.l(i7 + this.Z);
        }
        this.k = true;
    }

    public final void G(int i7) {
        this.U = i7;
        int i10 = this.f1239b0;
        if (i7 < i10) {
            this.U = i10;
        }
    }

    public final void H(int i7) {
        this.f1262o0[0] = i7;
    }

    public final void I(int i7) {
        this.f1262o0[1] = i7;
    }

    public final void J(int i7) {
        this.T = i7;
        int i10 = this.a0;
        if (i7 < i10) {
            this.T = i10;
        }
    }

    public void K(boolean z5, boolean z6) {
        int i7;
        int i10;
        m mVar = this.f1242d;
        boolean z7 = z5 & mVar.f19698g;
        o oVar = this.f1244e;
        boolean z10 = z6 & oVar.f19698g;
        int i11 = mVar.f19699h.f19677g;
        int i12 = oVar.f19699h.f19677g;
        int i13 = mVar.f19700i.f19677g;
        int i14 = oVar.f19700i.f19677g;
        int i15 = i14 - i12;
        if (i13 - i11 < 0 || i15 < 0 || i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE) {
            i13 = 0;
            i14 = 0;
            i11 = 0;
            i12 = 0;
        }
        int i16 = i13 - i11;
        int i17 = i14 - i12;
        if (z7) {
            this.X = i11;
        }
        if (z10) {
            this.Y = i12;
        }
        if (this.f1247f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        int[] iArr = this.f1262o0;
        if (z7) {
            if (iArr[0] == 1 && i16 < (i10 = this.T)) {
                i16 = i10;
            }
            this.T = i16;
            int i18 = this.a0;
            if (i16 < i18) {
                this.T = i18;
            }
        }
        if (z10) {
            if (iArr[1] == 1 && i17 < (i7 = this.U)) {
                i17 = i7;
            }
            this.U = i17;
            int i19 = this.f1239b0;
            if (i17 < i19) {
                this.U = i19;
            }
        }
    }

    public void L(p0.c cVar, boolean z5) {
        int i7;
        int i10;
        o oVar;
        m mVar;
        cVar.getClass();
        int iN = p0.c.n(this.H);
        int iN2 = p0.c.n(this.I);
        int iN3 = p0.c.n(this.J);
        int iN4 = p0.c.n(this.K);
        if (z5 && (mVar = this.f1242d) != null) {
            h hVar = mVar.f19699h;
            if (hVar.j) {
                h hVar2 = mVar.f19700i;
                if (hVar2.j) {
                    iN = hVar.f19677g;
                    iN3 = hVar2.f19677g;
                }
            }
        }
        if (z5 && (oVar = this.f1244e) != null) {
            h hVar3 = oVar.f19699h;
            if (hVar3.j) {
                h hVar4 = oVar.f19700i;
                if (hVar4.j) {
                    iN2 = hVar3.f19677g;
                    iN4 = hVar4.f19677g;
                }
            }
        }
        int i11 = iN4 - iN2;
        if (iN3 - iN < 0 || i11 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i12 = iN3 - iN;
        int i13 = iN4 - iN2;
        this.X = iN;
        this.Y = iN2;
        if (this.f1247f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        int[] iArr = this.f1262o0;
        int i14 = iArr[0];
        if (i14 == 1 && i12 < (i10 = this.T)) {
            i12 = i10;
        }
        if (iArr[1] == 1 && i13 < (i7 = this.U)) {
            i13 = i7;
        }
        this.T = i12;
        this.U = i13;
        int i15 = this.f1239b0;
        if (i13 < i15) {
            this.U = i15;
        }
        int i16 = this.a0;
        if (i12 < i16) {
            this.T = i16;
        }
        int i17 = this.f1268u;
        if (i17 > 0 && i14 == 3) {
            this.T = Math.min(this.T, i17);
        }
        int i18 = this.f1271x;
        if (i18 > 0 && iArr[1] == 3) {
            this.U = Math.min(this.U, i18);
        }
        int i19 = this.T;
        if (i12 != i19) {
            this.f1250h = i19;
        }
        int i20 = this.U;
        if (i13 != i20) {
            this.f1251i = i20;
        }
    }

    public final void a(ConstraintWidgetContainer constraintWidgetContainer, p0.c cVar, HashSet hashSet, int i7, boolean z5) {
        if (z5) {
            if (!hashSet.contains(this)) {
                return;
            }
            r0.h.b(constraintWidgetContainer, cVar, this);
            hashSet.remove(this);
            b(cVar, constraintWidgetContainer.R(64));
        }
        if (i7 == 0) {
            HashSet hashSet2 = this.H.f19143a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).f19146d.a(constraintWidgetContainer, cVar, hashSet, i7, true);
                }
            }
            HashSet hashSet3 = this.J.f19143a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((c) it2.next()).f19146d.a(constraintWidgetContainer, cVar, hashSet, i7, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.I.f19143a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((c) it3.next()).f19146d.a(constraintWidgetContainer, cVar, hashSet, i7, true);
            }
        }
        HashSet hashSet5 = this.K.f19143a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((c) it4.next()).f19146d.a(constraintWidgetContainer, cVar, hashSet, i7, true);
            }
        }
        HashSet hashSet6 = this.L.f19143a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((c) it5.next()).f19146d.a(constraintWidgetContainer, cVar, hashSet, i7, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x021a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0223  */
    /* JADX WARN: Code duplicated, block: B:132:0x022a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0234  */
    /* JADX WARN: Code duplicated, block: B:137:0x023b  */
    /* JADX WARN: Code duplicated, block: B:138:0x0246  */
    /* JADX WARN: Code duplicated, block: B:141:0x0252  */
    /* JADX WARN: Code duplicated, block: B:142:0x025b  */
    /* JADX WARN: Code duplicated, block: B:144:0x0261 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:153:0x0280 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:163:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:167:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:170:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:171:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:174:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:176:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:179:0x02df  */
    /* JADX WARN: Code duplicated, block: B:180:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:183:0x0300  */
    /* JADX WARN: Code duplicated, block: B:185:0x0308  */
    /* JADX WARN: Code duplicated, block: B:187:0x030b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:189:0x030f  */
    /* JADX WARN: Code duplicated, block: B:191:0x0313 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:193:0x0319  */
    /* JADX WARN: Code duplicated, block: B:195:0x031f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:255:0x03ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:256:0x03cc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:261:0x03e0 A[PHI: r14
      0x03e0: PHI (r14v38 int) = (r14v19 int), (r14v19 int), (r14v36 int), (r14v19 int), (r14v19 int), (r14v19 int), (r14v19 int), (r14v19 int) binds: [B:263:0x03e8, B:264:0x03ea, B:258:0x03d6, B:245:0x03ac, B:251:0x03ba, B:253:0x03be, B:254:0x03c0, B:250:0x03b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:263:0x03e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:264:0x03ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:273:0x0408  */
    /* JADX WARN: Code duplicated, block: B:277:0x041e  */
    /* JADX WARN: Code duplicated, block: B:279:0x0423 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:281:0x0427  */
    /* JADX WARN: Code duplicated, block: B:284:0x042b  */
    /* JADX WARN: Code duplicated, block: B:289:0x0437  */
    /* JADX WARN: Code duplicated, block: B:292:0x043f  */
    /* JADX WARN: Code duplicated, block: B:295:0x0445  */
    /* JADX WARN: Code duplicated, block: B:297:0x0448  */
    /* JADX WARN: Code duplicated, block: B:298:0x044a  */
    /* JADX WARN: Code duplicated, block: B:301:0x0466  */
    /* JADX WARN: Code duplicated, block: B:320:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:336:0x055c  */
    /* JADX WARN: Code duplicated, block: B:352:0x05af  */
    /* JADX WARN: Code duplicated, block: B:355:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:358:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:395:0x0688  */
    /* JADX WARN: Code duplicated, block: B:397:0x068e  */
    /* JADX WARN: Code duplicated, block: B:399:0x0695  */
    /* JADX WARN: Code duplicated, block: B:400:0x06be  */
    /* JADX WARN: Code duplicated, block: B:403:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:406:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:67:0x010f  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0129  */
    /* JADX WARN: Code duplicated, block: B:79:0x0141  */
    /* JADX WARN: Code duplicated, block: B:82:0x014c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0164  */
    /* JADX WARN: Code duplicated, block: B:89:0x016f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0180  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v26 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v11 */
    /* JADX WARN: Type inference failed for: r27v12 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r4v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r59v0, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    public void b(p0.c cVar, boolean z5) {
        int i7;
        int i10;
        int i11;
        int i12;
        boolean[] zArr;
        int i13;
        int i14;
        boolean z6;
        HashSet hashSet;
        ConstraintWidget constraintWidget;
        ConstraintWidgetContainer constraintWidgetContainer;
        WeakReference weakReference;
        WeakReference weakReference2;
        ConstraintWidget constraintWidget2;
        ConstraintWidgetContainer constraintWidgetContainer2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        Metrics metrics;
        boolean[] zArr2;
        c cVar2;
        boolean[] zArr3;
        boolean[] zArr4;
        boolean z7;
        boolean z10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int[] iArr;
        int i20;
        boolean z11;
        int i21;
        boolean z12;
        float f2;
        int i22;
        int i23;
        c cVar3;
        int i24;
        int i25;
        int i26;
        boolean z13;
        int i27;
        boolean z14;
        boolean z15;
        int i28;
        c cVar4;
        boolean z16;
        int i29;
        ?? r5;
        int[] iArr2;
        e eVar;
        e eVar2;
        boolean z17;
        e eVar3;
        boolean z18;
        ?? r6;
        int i30;
        c cVar5;
        int i31;
        e eVar4;
        e eVar5;
        e eVar6;
        int i32;
        int i33;
        boolean z19;
        int i34;
        e eVar7;
        ?? r27;
        ?? r18;
        o oVar;
        boolean z20;
        m mVar;
        int i35;
        int i36;
        boolean zU;
        int i37;
        boolean zV;
        m mVar2;
        boolean z21;
        ArrayList arrayList;
        int size;
        int i38;
        HashSet hashSet2;
        p0.c cVar6 = cVar;
        c cVar7 = this.H;
        e eVarK = cVar6.k(cVar7);
        c cVar8 = this.J;
        e eVarK2 = cVar6.k(cVar8);
        c cVar9 = this.I;
        e eVarK3 = cVar6.k(cVar9);
        c cVar10 = this.K;
        e eVarK4 = cVar6.k(cVar10);
        c cVar11 = this.L;
        e eVarK5 = cVar6.k(cVar11);
        ConstraintWidget constraintWidget3 = this.S;
        if (constraintWidget3 != null) {
            int[] iArr3 = constraintWidget3.f1262o0;
            i7 = 0;
            i11 = iArr3[0] == 2 ? 1 : 0;
            int i39 = iArr3[1] == 2 ? 1 : 0;
            int i40 = this.f1263p;
            if (i40 != 1) {
                if (i40 == 2) {
                    i11 = 0;
                } else if (i40 != 3) {
                }
                i10 = i39;
            } else {
                i10 = 0;
            }
            i12 = this.f1247f0;
            zArr = this.R;
            i13 = i10;
            if (i12 == 8) {
                arrayList = this.Q;
                size = arrayList.size();
                i14 = i11;
                i38 = i7;
                while (true) {
                    if (i38 < size) {
                        if (!zArr[i7] || zArr[1]) {
                            break;
                            break;
                        }
                        return;
                    }
                    int i41 = size;
                    hashSet2 = ((c) arrayList.get(i38)).f19143a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        break;
                    }
                    i38++;
                    size = i41;
                }
            } else {
                i14 = i11;
            }
            z6 = this.j;
            if (z6 || this.k) {
                if (z6) {
                    cVar6.d(eVarK, this.X);
                    cVar6.d(eVarK2, this.X + this.T);
                    if (i14 != 0 && (constraintWidget2 = this.S) != null) {
                        constraintWidgetContainer2 = (ConstraintWidgetContainer) constraintWidget2;
                        weakReference3 = constraintWidgetContainer2.G0;
                        if (weakReference3 != null || weakReference3.get() == null || cVar7.d() > ((c) constraintWidgetContainer2.G0.get()).d()) {
                            constraintWidgetContainer2.G0 = new WeakReference(cVar7);
                        }
                        weakReference4 = constraintWidgetContainer2.I0;
                        if (weakReference4 != null || weakReference4.get() == null || cVar8.d() > ((c) constraintWidgetContainer2.I0.get()).d()) {
                            constraintWidgetContainer2.I0 = new WeakReference(cVar8);
                        }
                    }
                }
                if (this.k) {
                    cVar6.d(eVarK3, this.Y);
                    cVar6.d(eVarK4, this.Y + this.U);
                    hashSet = cVar11.f19143a;
                    if (hashSet != null && hashSet.size() > 0) {
                        cVar6.d(eVarK5, this.Y + this.Z);
                    }
                    if (i13 != 0 && (constraintWidget = this.S) != null) {
                        constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget;
                        weakReference = constraintWidgetContainer.F0;
                        if (weakReference != null || weakReference.get() == null || cVar9.d() > ((c) constraintWidgetContainer.F0.get()).d()) {
                            constraintWidgetContainer.F0 = new WeakReference(cVar9);
                        }
                        weakReference2 = constraintWidgetContainer.H0;
                        if (weakReference2 != null || weakReference2.get() == null || cVar10.d() > ((c) constraintWidgetContainer.H0.get()).d()) {
                            constraintWidgetContainer.H0 = new WeakReference(cVar10);
                        }
                    }
                }
                if (this.j && this.k) {
                    ?? r12 = i7;
                    this.j = r12;
                    this.k = r12;
                    return;
                }
            }
            metrics = p0.c.f17740r;
            if (metrics != null) {
                metrics.f1236h++;
            }
            zArr2 = this.f1246f;
            if (!z5 && (mVar2 = this.f1242d) != null) {
                cVar2 = cVar11;
                o oVar2 = this.f1244e;
                zArr3 = zArr2;
                if (oVar2 != null) {
                    h hVar = mVar2.f19699h;
                    zArr4 = zArr;
                    if (hVar.j && mVar2.f19700i.j && oVar2.f19699h.j && oVar2.f19700i.j) {
                        if (metrics != null) {
                            metrics.f1232d++;
                        }
                        cVar6.d(eVarK, hVar.f19677g);
                        cVar6.d(eVarK2, this.f1242d.f19700i.f19677g);
                        cVar6.d(eVarK3, this.f1244e.f19699h.f19677g);
                        cVar6.d(eVarK4, this.f1244e.f19700i.f19677g);
                        cVar6.d(eVarK5, this.f1244e.k.f19677g);
                        if (this.S == null) {
                            z21 = false;
                        } else {
                            if (i14 != 0 && zArr3[0] && !u()) {
                                cVar6.f(cVar6.k(this.S.J), eVarK2, 0, 8);
                            }
                            if (i13 == 0 || !zArr3[1] || v()) {
                                z21 = false;
                            } else {
                                z21 = false;
                                cVar6.f(cVar6.k(this.S.K), eVarK4, 0, 8);
                            }
                        }
                        this.j = z21;
                        this.k = z21;
                        return;
                    }
                }
                if (metrics != null) {
                    metrics.f1233e++;
                }
                if (this.S != null) {
                    if (t(0)) {
                        ((ConstraintWidgetContainer) this.S).M(this, 0);
                        zU = true;
                        i37 = 1;
                    } else {
                        zU = u();
                        i37 = 1;
                    }
                    if (t(i37)) {
                        ((ConstraintWidgetContainer) this.S).M(this, i37);
                        zV = true;
                    } else {
                        zV = v();
                    }
                    if (!zU && i14 != 0 && this.f1247f0 != 8 && cVar7.f19148f == null && cVar8.f19148f == null) {
                        cVar6.f(cVar6.k(this.S.J), eVarK2, 0, 1);
                    }
                    if (!zV && i13 != 0 && this.f1247f0 != 8 && cVar9.f19148f == null && cVar10.f19148f == null && cVar2 == null) {
                        cVar6.f(cVar6.k(this.S.K), eVarK4, 0, 1);
                    }
                    z10 = zV;
                    z7 = zU;
                } else {
                    z7 = false;
                    z10 = false;
                }
                i15 = this.T;
                i16 = this.a0;
                if (i15 >= i16) {
                    i16 = i15;
                }
                i17 = this.U;
                i18 = this.f1239b0;
                if (i17 < i18) {
                    i19 = i18;
                } else {
                    i19 = i17;
                }
                iArr = this.f1262o0;
                i20 = iArr[0];
                if (i20 != 3) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i21 = iArr[1];
                if (i21 != 3) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i42 = this.W;
                this.f1273z = i42;
                f2 = this.V;
                this.A = f2;
                i22 = this.f1264q;
                i23 = this.f1265r;
                if (f2 > 0.0f) {
                    cVar3 = cVar10;
                    if (this.f1247f0 != 8) {
                        if (i20 == 3 || i22 != 0) {
                            i36 = i22;
                        } else {
                            i36 = 3;
                        }
                        if (i21 == 3 || i23 != 0) {
                            i26 = i23;
                        } else {
                            i26 = 3;
                        }
                        if (i20 == 3 || i21 != 3 || i36 != 3 || i26 != 3) {
                            if (i20 == 3 || i36 != 3) {
                                if (i21 != 3 && i26 == 3) {
                                    this.f1273z = 1;
                                    if (i42 == -1) {
                                        this.A = 1.0f / f2;
                                    }
                                    i24 = (int) (this.A * i15);
                                    i25 = i36;
                                    if (i20 != 3) {
                                        i26 = 4;
                                    }
                                }
                                z13 = true;
                            } else {
                                this.f1273z = 0;
                                i16 = (int) (i17 * f2);
                                if (i21 != 3) {
                                    i26 = i26;
                                    i24 = i19;
                                    i25 = 4;
                                }
                            }
                            int[] iArr4 = this.f1266s;
                            iArr4[0] = i25;
                            iArr4[1] = i26;
                            if (z13) {
                                int i43 = this.f1273z;
                                i27 = -1;
                                boolean z22 = i43 != 0 || i43 == -1;
                                if (z13 || !((i35 = this.f1273z) == 1 || i35 == i27)) {
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                                if (iArr[0] == 2 || !(this instanceof ConstraintWidgetContainer)) {
                                    z15 = false;
                                } else {
                                    z15 = true;
                                }
                                if (z15) {
                                    i28 = 0;
                                } else {
                                    i28 = i16;
                                }
                                cVar4 = this.O;
                                z16 = !cVar4.h();
                                char c8 = '\b';
                                boolean z23 = zArr4[0];
                                boolean z24 = zArr4[1];
                                i29 = this.f1259n;
                                int[] iArr5 = this.B;
                                if (i29 != 2 || this.j) {
                                    r5 = i13;
                                    iArr2 = iArr;
                                    eVar = eVarK;
                                    eVar2 = eVarK2;
                                    z17 = z16;
                                    eVar3 = eVarK5;
                                    z18 = z7;
                                    r6 = i14;
                                    i30 = i25;
                                    cVar5 = cVar2;
                                    i31 = i26;
                                } else {
                                    if (z5 && (mVar = this.f1242d) != null) {
                                        h hVar2 = mVar.f19699h;
                                        if (hVar2.j && mVar.f19700i.j) {
                                            if (z5) {
                                                cVar6.d(eVarK, hVar2.f19677g);
                                                cVar6.d(eVarK2, this.f1242d.f19700i.f19677g);
                                                if (this.S != null && i14 != 0 && zArr3[0] && !u()) {
                                                    cVar6.f(cVar6.k(this.S.J), eVarK2, 0, 8);
                                                }
                                            }
                                            r5 = i13;
                                            iArr2 = iArr;
                                            eVar = eVarK;
                                            eVar2 = eVarK2;
                                            z17 = z16;
                                            eVar3 = eVarK5;
                                            z18 = z7;
                                            r6 = i14;
                                            i30 = i25;
                                            cVar5 = cVar2;
                                            i31 = i26;
                                        } else {
                                            c8 = '\b';
                                        }
                                    }
                                    ConstraintWidget constraintWidget4 = this.S;
                                    e eVarK6 = constraintWidget4 != null ? cVar6.k(constraintWidget4.J) : null;
                                    ConstraintWidget constraintWidget5 = this.S;
                                    e eVarK7 = constraintWidget5 != null ? cVar6.k(constraintWidget5.H) : null;
                                    ?? r7 = i14;
                                    i30 = i25;
                                    i31 = i26;
                                    z18 = z7;
                                    boolean z25 = z16;
                                    ?? r10 = i13;
                                    iArr2 = iArr;
                                    eVar2 = eVarK2;
                                    eVar = eVarK;
                                    cVar5 = cVar2;
                                    eVar3 = eVarK5;
                                    cVar6 = cVar;
                                    d(cVar6, true, r7, r10, zArr3[0], eVarK7, eVarK6, iArr[0], z15, this.H, this.J, this.X, i28, this.a0, iArr5[0], this.f1241c0, z22, iArr[1] == 3, z18, z10, z23, i30, i31, this.f1267t, this.f1268u, this.f1269v, z25);
                                    r6 = r7;
                                    r5 = r10;
                                    z17 = z25;
                                }
                                if (z5 || (oVar = this.f1244e) == null) {
                                    eVar4 = r33;
                                    eVar5 = eVarK4;
                                    eVar6 = eVar3;
                                    i32 = 0;
                                    i33 = 8;
                                    z19 = true;
                                    i34 = 1;
                                } else {
                                    h hVar3 = oVar.f19699h;
                                    if (hVar3.j && oVar.f19700i.j) {
                                        int i44 = hVar3.f19677g;
                                        eVar4 = eVarK3;
                                        cVar6.d(eVar4, i44);
                                        eVar5 = eVarK4;
                                        cVar6.d(eVar5, this.f1244e.f19700i.f19677g);
                                        eVar6 = eVar3;
                                        cVar6.d(eVar6, this.f1244e.k.f19677g);
                                        ConstraintWidget constraintWidget6 = this.S;
                                        if (constraintWidget6 == null || z10 || r5 == 0) {
                                            i32 = 0;
                                            i33 = 8;
                                            z20 = true;
                                        } else {
                                            z20 = true;
                                            z20 = true;
                                            if (zArr3[1]) {
                                                i32 = 0;
                                                i33 = 8;
                                                cVar6.f(cVar6.k(constraintWidget6.K), eVar5, 0, 8);
                                            } else {
                                                i32 = 0;
                                                i33 = 8;
                                            }
                                        }
                                        i34 = i32;
                                        z19 = z20;
                                    } else {
                                        eVar4 = r33;
                                        eVar5 = eVarK4;
                                        eVar6 = eVar3;
                                        i32 = 0;
                                        i33 = 8;
                                        z19 = true;
                                        i34 = 1;
                                    }
                                }
                                if (this.f1261o == 2) {
                                    i34 = i32;
                                }
                                if (i34 != 0 || this.k) {
                                    eVar7 = eVar4;
                                } else {
                                    int i45 = (iArr2[z19 ? 1 : 0] == 2 && (this instanceof ConstraintWidgetContainer)) ? z19 ? 1 : 0 : i32;
                                    int i46 = i45 != 0 ? i32 : i24;
                                    ConstraintWidget constraintWidget7 = this.S;
                                    e eVarK8 = constraintWidget7 != null ? cVar6.k(constraintWidget7.K) : null;
                                    ConstraintWidget constraintWidget8 = this.S;
                                    e eVarK9 = constraintWidget8 != null ? cVar6.k(constraintWidget8.I) : null;
                                    int i47 = this.Z;
                                    if (i47 > 0 || this.f1247f0 == i33) {
                                        r27 = z17;
                                        c cVar12 = cVar5;
                                        if (cVar12.f19148f != null) {
                                            cVar6.e(eVar6, eVar4, i47, i33);
                                            cVar6.e(eVar6, cVar6.k(cVar12.f19148f), cVar12.e(), i33);
                                            if (r5 != 0) {
                                                cVar6.f(eVarK8, cVar6.k(cVar3), i32, 5);
                                            }
                                            r27 = i32;
                                        } else if (this.f1247f0 == i33) {
                                            cVar6.e(eVar6, eVar4, cVar12.e(), i33);
                                            r27 = z17;
                                        } else {
                                            cVar6.e(eVar6, eVar4, i47, i33);
                                            r27 = z17;
                                        }
                                    }
                                    r27 = z17;
                                    boolean z26 = zArr3[z19 ? 1 : 0];
                                    int i48 = i32;
                                    int i49 = iArr2[z19 ? 1 : 0];
                                    int i50 = this.Y;
                                    int i51 = this.f1239b0;
                                    int i52 = iArr5[z19 ? 1 : 0];
                                    float f7 = this.f1243d0;
                                    if (iArr2[i48] == 3) {
                                        boolean z27 = z19 ? 1 : 0;
                                        r18 = z19;
                                    } else {
                                        boolean z28 = z19 ? 1 : 0;
                                        r18 = i48;
                                    }
                                    eVar7 = eVar4;
                                    cVar6 = cVar;
                                    d(cVar6, false, r5, r6, z26, eVarK9, eVarK8, i49, i45, this.I, this.K, i50, i46, i51, i52, f7, z14, r18, z10, z18, z24, i31, i30, this.f1270w, this.f1271x, this.f1272y, r27);
                                }
                                if (z13) {
                                    if (this.f1273z == 1) {
                                        float f10 = this.A;
                                        b bVarL = cVar6.l();
                                        bVarL.f17736d.g(eVar5, -1.0f);
                                        bVarL.f17736d.g(eVar7, 1.0f);
                                        bVarL.f17736d.g(eVar2, f10);
                                        bVarL.f17736d.g(eVar, -f10);
                                        cVar6.c(bVarL);
                                    } else {
                                        float f11 = this.A;
                                        b bVarL2 = cVar6.l();
                                        bVarL2.f17736d.g(eVar2, -1.0f);
                                        bVarL2.f17736d.g(eVar, 1.0f);
                                        bVarL2.f17736d.g(eVar5, f11);
                                        bVarL2.f17736d.g(eVar7, -f11);
                                        cVar6.c(bVarL2);
                                    }
                                }
                                if (cVar4.h()) {
                                    ConstraintWidget constraintWidget9 = cVar4.f19148f.f19146d;
                                    float radians = (float) Math.toRadians(this.C + 90.0f);
                                    int iE = cVar4.e();
                                    e eVarK10 = cVar6.k(i(2));
                                    e eVarK11 = cVar6.k(i(3));
                                    e eVarK12 = cVar6.k(i(4));
                                    e eVarK13 = cVar6.k(i(5));
                                    e eVarK14 = cVar6.k(constraintWidget9.i(2));
                                    e eVarK15 = cVar6.k(constraintWidget9.i(3));
                                    e eVarK16 = cVar6.k(constraintWidget9.i(4));
                                    e eVarK17 = cVar6.k(constraintWidget9.i(5));
                                    b bVarL3 = cVar6.l();
                                    double d6 = radians;
                                    double dSin = Math.sin(d6);
                                    double d7 = iE;
                                    bVarL3.f17736d.g(eVarK15, 0.5f);
                                    bVarL3.f17736d.g(eVarK17, 0.5f);
                                    bVarL3.f17736d.g(eVarK11, -0.5f);
                                    bVarL3.f17736d.g(eVarK13, -0.5f);
                                    bVarL3.f17734b = -((float) (dSin * d7));
                                    cVar6.c(bVarL3);
                                    b bVarL4 = cVar6.l();
                                    float fCos = (float) (Math.cos(d6) * d7);
                                    bVarL4.f17736d.g(eVarK14, 0.5f);
                                    bVarL4.f17736d.g(eVarK16, 0.5f);
                                    bVarL4.f17736d.g(eVarK10, -0.5f);
                                    bVarL4.f17736d.g(eVarK12, -0.5f);
                                    bVarL4.f17734b = -fCos;
                                    cVar6.c(bVarL4);
                                }
                                this.j = false;
                                this.k = false;
                            }
                            i27 = -1;
                            if (z13) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            if (iArr[0] == 2) {
                                z15 = false;
                            } else {
                                z15 = false;
                            }
                            if (z15) {
                                i28 = 0;
                            } else {
                                i28 = i16;
                            }
                            cVar4 = this.O;
                            z16 = !cVar4.h();
                            char c10 = '\b';
                            boolean z29 = zArr4[0];
                            boolean z210 = zArr4[1];
                            i29 = this.f1259n;
                            int[] iArr6 = this.B;
                            if (i29 != 2) {
                                r5 = i13;
                                iArr2 = iArr;
                                eVar = eVarK;
                                eVar2 = eVarK2;
                                z17 = z16;
                                eVar3 = eVarK5;
                                z18 = z7;
                                r6 = i14;
                                i30 = i25;
                                cVar5 = cVar2;
                                i31 = i26;
                            } else {
                                r5 = i13;
                                iArr2 = iArr;
                                eVar = eVarK;
                                eVar2 = eVarK2;
                                z17 = z16;
                                eVar3 = eVarK5;
                                z18 = z7;
                                r6 = i14;
                                i30 = i25;
                                cVar5 = cVar2;
                                i31 = i26;
                            }
                            if (z5) {
                                eVar4 = r33;
                                eVar5 = eVarK4;
                                eVar6 = eVar3;
                                i32 = 0;
                                i33 = 8;
                                z19 = true;
                                i34 = 1;
                            } else {
                                eVar4 = r33;
                                eVar5 = eVarK4;
                                eVar6 = eVar3;
                                i32 = 0;
                                i33 = 8;
                                z19 = true;
                                i34 = 1;
                            }
                            if (this.f1261o == 2) {
                                i34 = i32;
                            }
                            if (i34 != 0) {
                                eVar7 = eVar4;
                            } else {
                                eVar7 = eVar4;
                            }
                            if (z13) {
                                if (this.f1273z == 1) {
                                    float f12 = this.A;
                                    b bVarL5 = cVar6.l();
                                    bVarL5.f17736d.g(eVar5, -1.0f);
                                    bVarL5.f17736d.g(eVar7, 1.0f);
                                    bVarL5.f17736d.g(eVar2, f12);
                                    bVarL5.f17736d.g(eVar, -f12);
                                    cVar6.c(bVarL5);
                                } else {
                                    float f13 = this.A;
                                    b bVarL6 = cVar6.l();
                                    bVarL6.f17736d.g(eVar2, -1.0f);
                                    bVarL6.f17736d.g(eVar, 1.0f);
                                    bVarL6.f17736d.g(eVar5, f13);
                                    bVarL6.f17736d.g(eVar7, -f13);
                                    cVar6.c(bVarL6);
                                }
                            }
                            if (cVar4.h()) {
                                ConstraintWidget constraintWidget10 = cVar4.f19148f.f19146d;
                                float radians2 = (float) Math.toRadians(this.C + 90.0f);
                                int iE2 = cVar4.e();
                                e eVarK18 = cVar6.k(i(2));
                                e eVarK19 = cVar6.k(i(3));
                                e eVarK110 = cVar6.k(i(4));
                                e eVarK111 = cVar6.k(i(5));
                                e eVarK112 = cVar6.k(constraintWidget10.i(2));
                                e eVarK113 = cVar6.k(constraintWidget10.i(3));
                                e eVarK114 = cVar6.k(constraintWidget10.i(4));
                                e eVarK115 = cVar6.k(constraintWidget10.i(5));
                                b bVarL7 = cVar6.l();
                                double d8 = radians2;
                                double dSin2 = Math.sin(d8);
                                double d9 = iE2;
                                bVarL7.f17736d.g(eVarK113, 0.5f);
                                bVarL7.f17736d.g(eVarK115, 0.5f);
                                bVarL7.f17736d.g(eVarK19, -0.5f);
                                bVarL7.f17736d.g(eVarK111, -0.5f);
                                bVarL7.f17734b = -((float) (dSin2 * d9));
                                cVar6.c(bVarL7);
                                b bVarL8 = cVar6.l();
                                float fCos2 = (float) (Math.cos(d8) * d9);
                                bVarL8.f17736d.g(eVarK112, 0.5f);
                                bVarL8.f17736d.g(eVarK114, 0.5f);
                                bVarL8.f17736d.g(eVarK18, -0.5f);
                                bVarL8.f17736d.g(eVarK110, -0.5f);
                                bVarL8.f17734b = -fCos2;
                                cVar6.c(bVarL8);
                            }
                            this.j = false;
                            this.k = false;
                        }
                        if (i42 == -1) {
                            if (z11 && !z12) {
                                this.f1273z = 0;
                            } else if (!z11 && z12) {
                                this.f1273z = 1;
                                if (i42 == -1) {
                                    this.A = 1.0f / f2;
                                }
                            }
                        }
                        if (this.f1273z == 0 && (!cVar9.h() || !cVar3.h())) {
                            this.f1273z = 1;
                        } else if (this.f1273z == 1 && (!cVar7.h() || !cVar8.h())) {
                            this.f1273z = 0;
                        }
                        if (this.f1273z == -1 && (!cVar9.h() || !cVar3.h() || !cVar7.h() || !cVar8.h())) {
                            if (cVar9.h() && cVar3.h()) {
                                this.f1273z = 0;
                            } else if (cVar7.h() && cVar8.h()) {
                                this.A = 1.0f / this.A;
                                this.f1273z = 1;
                            }
                        }
                        if (this.f1273z == -1) {
                            int i53 = this.f1267t;
                            if (i53 > 0 && this.f1270w == 0) {
                                this.f1273z = 0;
                            } else if (i53 == 0 && this.f1270w > 0) {
                                this.A = 1.0f / this.A;
                                this.f1273z = 1;
                            }
                        }
                        i25 = i36;
                        i24 = i19;
                        z13 = true;
                        int[] iArr7 = this.f1266s;
                        iArr7[0] = i25;
                        iArr7[1] = i26;
                        if (z13) {
                            int i410 = this.f1273z;
                            i27 = -1;
                            if (i410 != 0) {
                            }
                            if (z13) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            if (iArr[0] == 2) {
                                z15 = false;
                            } else {
                                z15 = false;
                            }
                            if (z15) {
                                i28 = 0;
                            } else {
                                i28 = i16;
                            }
                            cVar4 = this.O;
                            z16 = !cVar4.h();
                            char c11 = '\b';
                            boolean z211 = zArr4[0];
                            boolean z212 = zArr4[1];
                            i29 = this.f1259n;
                            int[] iArr8 = this.B;
                            if (i29 != 2) {
                                r5 = i13;
                                iArr2 = iArr;
                                eVar = eVarK;
                                eVar2 = eVarK2;
                                z17 = z16;
                                eVar3 = eVarK5;
                                z18 = z7;
                                r6 = i14;
                                i30 = i25;
                                cVar5 = cVar2;
                                i31 = i26;
                            } else {
                                r5 = i13;
                                iArr2 = iArr;
                                eVar = eVarK;
                                eVar2 = eVarK2;
                                z17 = z16;
                                eVar3 = eVarK5;
                                z18 = z7;
                                r6 = i14;
                                i30 = i25;
                                cVar5 = cVar2;
                                i31 = i26;
                            }
                            if (z5) {
                                eVar4 = r33;
                                eVar5 = eVarK4;
                                eVar6 = eVar3;
                                i32 = 0;
                                i33 = 8;
                                z19 = true;
                                i34 = 1;
                            } else {
                                eVar4 = r33;
                                eVar5 = eVarK4;
                                eVar6 = eVar3;
                                i32 = 0;
                                i33 = 8;
                                z19 = true;
                                i34 = 1;
                            }
                            if (this.f1261o == 2) {
                                i34 = i32;
                            }
                            if (i34 != 0) {
                                eVar7 = eVar4;
                            } else {
                                eVar7 = eVar4;
                            }
                            if (z13) {
                                if (this.f1273z == 1) {
                                    float f14 = this.A;
                                    b bVarL9 = cVar6.l();
                                    bVarL9.f17736d.g(eVar5, -1.0f);
                                    bVarL9.f17736d.g(eVar7, 1.0f);
                                    bVarL9.f17736d.g(eVar2, f14);
                                    bVarL9.f17736d.g(eVar, -f14);
                                    cVar6.c(bVarL9);
                                } else {
                                    float f15 = this.A;
                                    b bVarL10 = cVar6.l();
                                    bVarL10.f17736d.g(eVar2, -1.0f);
                                    bVarL10.f17736d.g(eVar, 1.0f);
                                    bVarL10.f17736d.g(eVar5, f15);
                                    bVarL10.f17736d.g(eVar7, -f15);
                                    cVar6.c(bVarL10);
                                }
                            }
                            if (cVar4.h()) {
                                ConstraintWidget constraintWidget11 = cVar4.f19148f.f19146d;
                                float radians3 = (float) Math.toRadians(this.C + 90.0f);
                                int iE3 = cVar4.e();
                                e eVarK116 = cVar6.k(i(2));
                                e eVarK117 = cVar6.k(i(3));
                                e eVarK118 = cVar6.k(i(4));
                                e eVarK119 = cVar6.k(i(5));
                                e eVarK1110 = cVar6.k(constraintWidget11.i(2));
                                e eVarK1111 = cVar6.k(constraintWidget11.i(3));
                                e eVarK1112 = cVar6.k(constraintWidget11.i(4));
                                e eVarK1113 = cVar6.k(constraintWidget11.i(5));
                                b bVarL11 = cVar6.l();
                                double d10 = radians3;
                                double dSin3 = Math.sin(d10);
                                double d11 = iE3;
                                bVarL11.f17736d.g(eVarK1111, 0.5f);
                                bVarL11.f17736d.g(eVarK1113, 0.5f);
                                bVarL11.f17736d.g(eVarK117, -0.5f);
                                bVarL11.f17736d.g(eVarK119, -0.5f);
                                bVarL11.f17734b = -((float) (dSin3 * d11));
                                cVar6.c(bVarL11);
                                b bVarL12 = cVar6.l();
                                float fCos3 = (float) (Math.cos(d10) * d11);
                                bVarL12.f17736d.g(eVarK1110, 0.5f);
                                bVarL12.f17736d.g(eVarK1112, 0.5f);
                                bVarL12.f17736d.g(eVarK116, -0.5f);
                                bVarL12.f17736d.g(eVarK118, -0.5f);
                                bVarL12.f17734b = -fCos3;
                                cVar6.c(bVarL12);
                            }
                            this.j = false;
                            this.k = false;
                        }
                        i27 = -1;
                        if (z13) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        if (iArr[0] == 2) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        if (z15) {
                            i28 = 0;
                        } else {
                            i28 = i16;
                        }
                        cVar4 = this.O;
                        z16 = !cVar4.h();
                        char c12 = '\b';
                        boolean z213 = zArr4[0];
                        boolean z214 = zArr4[1];
                        i29 = this.f1259n;
                        int[] iArr9 = this.B;
                        if (i29 != 2) {
                            r5 = i13;
                            iArr2 = iArr;
                            eVar = eVarK;
                            eVar2 = eVarK2;
                            z17 = z16;
                            eVar3 = eVarK5;
                            z18 = z7;
                            r6 = i14;
                            i30 = i25;
                            cVar5 = cVar2;
                            i31 = i26;
                        } else {
                            r5 = i13;
                            iArr2 = iArr;
                            eVar = eVarK;
                            eVar2 = eVarK2;
                            z17 = z16;
                            eVar3 = eVarK5;
                            z18 = z7;
                            r6 = i14;
                            i30 = i25;
                            cVar5 = cVar2;
                            i31 = i26;
                        }
                        if (z5) {
                            eVar4 = r33;
                            eVar5 = eVarK4;
                            eVar6 = eVar3;
                            i32 = 0;
                            i33 = 8;
                            z19 = true;
                            i34 = 1;
                        } else {
                            eVar4 = r33;
                            eVar5 = eVarK4;
                            eVar6 = eVar3;
                            i32 = 0;
                            i33 = 8;
                            z19 = true;
                            i34 = 1;
                        }
                        if (this.f1261o == 2) {
                            i34 = i32;
                        }
                        if (i34 != 0) {
                            eVar7 = eVar4;
                        } else {
                            eVar7 = eVar4;
                        }
                        if (z13) {
                            if (this.f1273z == 1) {
                                float f16 = this.A;
                                b bVarL13 = cVar6.l();
                                bVarL13.f17736d.g(eVar5, -1.0f);
                                bVarL13.f17736d.g(eVar7, 1.0f);
                                bVarL13.f17736d.g(eVar2, f16);
                                bVarL13.f17736d.g(eVar, -f16);
                                cVar6.c(bVarL13);
                            } else {
                                float f17 = this.A;
                                b bVarL14 = cVar6.l();
                                bVarL14.f17736d.g(eVar2, -1.0f);
                                bVarL14.f17736d.g(eVar, 1.0f);
                                bVarL14.f17736d.g(eVar5, f17);
                                bVarL14.f17736d.g(eVar7, -f17);
                                cVar6.c(bVarL14);
                            }
                        }
                        if (cVar4.h()) {
                            ConstraintWidget constraintWidget12 = cVar4.f19148f.f19146d;
                            float radians4 = (float) Math.toRadians(this.C + 90.0f);
                            int iE4 = cVar4.e();
                            e eVarK1114 = cVar6.k(i(2));
                            e eVarK1115 = cVar6.k(i(3));
                            e eVarK1116 = cVar6.k(i(4));
                            e eVarK1117 = cVar6.k(i(5));
                            e eVarK1118 = cVar6.k(constraintWidget12.i(2));
                            e eVarK1119 = cVar6.k(constraintWidget12.i(3));
                            e eVarK11110 = cVar6.k(constraintWidget12.i(4));
                            e eVarK11111 = cVar6.k(constraintWidget12.i(5));
                            b bVarL15 = cVar6.l();
                            double d12 = radians4;
                            double dSin4 = Math.sin(d12);
                            double d13 = iE4;
                            bVarL15.f17736d.g(eVarK1119, 0.5f);
                            bVarL15.f17736d.g(eVarK11111, 0.5f);
                            bVarL15.f17736d.g(eVarK1115, -0.5f);
                            bVarL15.f17736d.g(eVarK1117, -0.5f);
                            bVarL15.f17734b = -((float) (dSin4 * d13));
                            cVar6.c(bVarL15);
                            b bVarL16 = cVar6.l();
                            float fCos4 = (float) (Math.cos(d12) * d13);
                            bVarL16.f17736d.g(eVarK1118, 0.5f);
                            bVarL16.f17736d.g(eVarK11110, 0.5f);
                            bVarL16.f17736d.g(eVarK1114, -0.5f);
                            bVarL16.f17736d.g(eVarK1116, -0.5f);
                            bVarL16.f17734b = -fCos4;
                            cVar6.c(bVarL16);
                        }
                        this.j = false;
                        this.k = false;
                    }
                    z13 = false;
                    int[] iArr10 = this.f1266s;
                    iArr10[0] = i25;
                    iArr10[1] = i26;
                    if (z13) {
                        int i411 = this.f1273z;
                        i27 = -1;
                        if (i411 != 0) {
                        }
                        if (z13) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        if (iArr[0] == 2) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        if (z15) {
                            i28 = 0;
                        } else {
                            i28 = i16;
                        }
                        cVar4 = this.O;
                        z16 = !cVar4.h();
                        char c13 = '\b';
                        boolean z215 = zArr4[0];
                        boolean z216 = zArr4[1];
                        i29 = this.f1259n;
                        int[] iArr11 = this.B;
                        if (i29 != 2) {
                            r5 = i13;
                            iArr2 = iArr;
                            eVar = eVarK;
                            eVar2 = eVarK2;
                            z17 = z16;
                            eVar3 = eVarK5;
                            z18 = z7;
                            r6 = i14;
                            i30 = i25;
                            cVar5 = cVar2;
                            i31 = i26;
                        } else {
                            r5 = i13;
                            iArr2 = iArr;
                            eVar = eVarK;
                            eVar2 = eVarK2;
                            z17 = z16;
                            eVar3 = eVarK5;
                            z18 = z7;
                            r6 = i14;
                            i30 = i25;
                            cVar5 = cVar2;
                            i31 = i26;
                        }
                        if (z5) {
                            eVar4 = r33;
                            eVar5 = eVarK4;
                            eVar6 = eVar3;
                            i32 = 0;
                            i33 = 8;
                            z19 = true;
                            i34 = 1;
                        } else {
                            eVar4 = r33;
                            eVar5 = eVarK4;
                            eVar6 = eVar3;
                            i32 = 0;
                            i33 = 8;
                            z19 = true;
                            i34 = 1;
                        }
                        if (this.f1261o == 2) {
                            i34 = i32;
                        }
                        if (i34 != 0) {
                            eVar7 = eVar4;
                        } else {
                            eVar7 = eVar4;
                        }
                        if (z13) {
                            if (this.f1273z == 1) {
                                float f18 = this.A;
                                b bVarL17 = cVar6.l();
                                bVarL17.f17736d.g(eVar5, -1.0f);
                                bVarL17.f17736d.g(eVar7, 1.0f);
                                bVarL17.f17736d.g(eVar2, f18);
                                bVarL17.f17736d.g(eVar, -f18);
                                cVar6.c(bVarL17);
                            } else {
                                float f19 = this.A;
                                b bVarL18 = cVar6.l();
                                bVarL18.f17736d.g(eVar2, -1.0f);
                                bVarL18.f17736d.g(eVar, 1.0f);
                                bVarL18.f17736d.g(eVar5, f19);
                                bVarL18.f17736d.g(eVar7, -f19);
                                cVar6.c(bVarL18);
                            }
                        }
                        if (cVar4.h()) {
                            ConstraintWidget constraintWidget13 = cVar4.f19148f.f19146d;
                            float radians5 = (float) Math.toRadians(this.C + 90.0f);
                            int iE5 = cVar4.e();
                            e eVarK11112 = cVar6.k(i(2));
                            e eVarK11113 = cVar6.k(i(3));
                            e eVarK11114 = cVar6.k(i(4));
                            e eVarK11115 = cVar6.k(i(5));
                            e eVarK11116 = cVar6.k(constraintWidget13.i(2));
                            e eVarK11117 = cVar6.k(constraintWidget13.i(3));
                            e eVarK11118 = cVar6.k(constraintWidget13.i(4));
                            e eVarK11119 = cVar6.k(constraintWidget13.i(5));
                            b bVarL19 = cVar6.l();
                            double d14 = radians5;
                            double dSin5 = Math.sin(d14);
                            double d15 = iE5;
                            bVarL19.f17736d.g(eVarK11117, 0.5f);
                            bVarL19.f17736d.g(eVarK11119, 0.5f);
                            bVarL19.f17736d.g(eVarK11113, -0.5f);
                            bVarL19.f17736d.g(eVarK11115, -0.5f);
                            bVarL19.f17734b = -((float) (dSin5 * d15));
                            cVar6.c(bVarL19);
                            b bVarL110 = cVar6.l();
                            float fCos5 = (float) (Math.cos(d14) * d15);
                            bVarL110.f17736d.g(eVarK11116, 0.5f);
                            bVarL110.f17736d.g(eVarK11118, 0.5f);
                            bVarL110.f17736d.g(eVarK11112, -0.5f);
                            bVarL110.f17736d.g(eVarK11114, -0.5f);
                            bVarL110.f17734b = -fCos5;
                            cVar6.c(bVarL110);
                        }
                        this.j = false;
                        this.k = false;
                    }
                    i27 = -1;
                    if (z13) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (iArr[0] == 2) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        i28 = 0;
                    } else {
                        i28 = i16;
                    }
                    cVar4 = this.O;
                    z16 = !cVar4.h();
                    char c14 = '\b';
                    boolean z217 = zArr4[0];
                    boolean z218 = zArr4[1];
                    i29 = this.f1259n;
                    int[] iArr12 = this.B;
                    if (i29 != 2) {
                        r5 = i13;
                        iArr2 = iArr;
                        eVar = eVarK;
                        eVar2 = eVarK2;
                        z17 = z16;
                        eVar3 = eVarK5;
                        z18 = z7;
                        r6 = i14;
                        i30 = i25;
                        cVar5 = cVar2;
                        i31 = i26;
                    } else {
                        r5 = i13;
                        iArr2 = iArr;
                        eVar = eVarK;
                        eVar2 = eVarK2;
                        z17 = z16;
                        eVar3 = eVarK5;
                        z18 = z7;
                        r6 = i14;
                        i30 = i25;
                        cVar5 = cVar2;
                        i31 = i26;
                    }
                    if (z5) {
                        eVar4 = r33;
                        eVar5 = eVarK4;
                        eVar6 = eVar3;
                        i32 = 0;
                        i33 = 8;
                        z19 = true;
                        i34 = 1;
                    } else {
                        eVar4 = r33;
                        eVar5 = eVarK4;
                        eVar6 = eVar3;
                        i32 = 0;
                        i33 = 8;
                        z19 = true;
                        i34 = 1;
                    }
                    if (this.f1261o == 2) {
                        i34 = i32;
                    }
                    if (i34 != 0) {
                        eVar7 = eVar4;
                    } else {
                        eVar7 = eVar4;
                    }
                    if (z13) {
                        if (this.f1273z == 1) {
                            float f110 = this.A;
                            b bVarL111 = cVar6.l();
                            bVarL111.f17736d.g(eVar5, -1.0f);
                            bVarL111.f17736d.g(eVar7, 1.0f);
                            bVarL111.f17736d.g(eVar2, f110);
                            bVarL111.f17736d.g(eVar, -f110);
                            cVar6.c(bVarL111);
                        } else {
                            float f111 = this.A;
                            b bVarL112 = cVar6.l();
                            bVarL112.f17736d.g(eVar2, -1.0f);
                            bVarL112.f17736d.g(eVar, 1.0f);
                            bVarL112.f17736d.g(eVar5, f111);
                            bVarL112.f17736d.g(eVar7, -f111);
                            cVar6.c(bVarL112);
                        }
                    }
                    if (cVar4.h()) {
                        ConstraintWidget constraintWidget14 = cVar4.f19148f.f19146d;
                        float radians6 = (float) Math.toRadians(this.C + 90.0f);
                        int iE6 = cVar4.e();
                        e eVarK111110 = cVar6.k(i(2));
                        e eVarK111111 = cVar6.k(i(3));
                        e eVarK111112 = cVar6.k(i(4));
                        e eVarK111113 = cVar6.k(i(5));
                        e eVarK111114 = cVar6.k(constraintWidget14.i(2));
                        e eVarK111115 = cVar6.k(constraintWidget14.i(3));
                        e eVarK111116 = cVar6.k(constraintWidget14.i(4));
                        e eVarK111117 = cVar6.k(constraintWidget14.i(5));
                        b bVarL113 = cVar6.l();
                        double d16 = radians6;
                        double dSin6 = Math.sin(d16);
                        double d17 = iE6;
                        bVarL113.f17736d.g(eVarK111115, 0.5f);
                        bVarL113.f17736d.g(eVarK111117, 0.5f);
                        bVarL113.f17736d.g(eVarK111111, -0.5f);
                        bVarL113.f17736d.g(eVarK111113, -0.5f);
                        bVarL113.f17734b = -((float) (dSin6 * d17));
                        cVar6.c(bVarL113);
                        b bVarL114 = cVar6.l();
                        float fCos6 = (float) (Math.cos(d16) * d17);
                        bVarL114.f17736d.g(eVarK111114, 0.5f);
                        bVarL114.f17736d.g(eVarK111116, 0.5f);
                        bVarL114.f17736d.g(eVarK111110, -0.5f);
                        bVarL114.f17736d.g(eVarK111112, -0.5f);
                        bVarL114.f17734b = -fCos6;
                        cVar6.c(bVarL114);
                    }
                    this.j = false;
                    this.k = false;
                }
                cVar3 = cVar10;
                eVarK4 = eVarK4;
                i24 = i19;
                i25 = i22;
                i26 = i23;
                z13 = false;
                int[] iArr13 = this.f1266s;
                iArr13[0] = i25;
                iArr13[1] = i26;
                if (z13) {
                    int i412 = this.f1273z;
                    i27 = -1;
                    if (i412 != 0) {
                    }
                    if (z13) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (iArr[0] == 2) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        i28 = 0;
                    } else {
                        i28 = i16;
                    }
                    cVar4 = this.O;
                    z16 = !cVar4.h();
                    char c15 = '\b';
                    boolean z219 = zArr4[0];
                    boolean z2110 = zArr4[1];
                    i29 = this.f1259n;
                    int[] iArr14 = this.B;
                    if (i29 != 2) {
                        r5 = i13;
                        iArr2 = iArr;
                        eVar = eVarK;
                        eVar2 = eVarK2;
                        z17 = z16;
                        eVar3 = eVarK5;
                        z18 = z7;
                        r6 = i14;
                        i30 = i25;
                        cVar5 = cVar2;
                        i31 = i26;
                    } else {
                        r5 = i13;
                        iArr2 = iArr;
                        eVar = eVarK;
                        eVar2 = eVarK2;
                        z17 = z16;
                        eVar3 = eVarK5;
                        z18 = z7;
                        r6 = i14;
                        i30 = i25;
                        cVar5 = cVar2;
                        i31 = i26;
                    }
                    if (z5) {
                        eVar4 = r33;
                        eVar5 = eVarK4;
                        eVar6 = eVar3;
                        i32 = 0;
                        i33 = 8;
                        z19 = true;
                        i34 = 1;
                    } else {
                        eVar4 = r33;
                        eVar5 = eVarK4;
                        eVar6 = eVar3;
                        i32 = 0;
                        i33 = 8;
                        z19 = true;
                        i34 = 1;
                    }
                    if (this.f1261o == 2) {
                        i34 = i32;
                    }
                    if (i34 != 0) {
                        eVar7 = eVar4;
                    } else {
                        eVar7 = eVar4;
                    }
                    if (z13) {
                        if (this.f1273z == 1) {
                            float f112 = this.A;
                            b bVarL115 = cVar6.l();
                            bVarL115.f17736d.g(eVar5, -1.0f);
                            bVarL115.f17736d.g(eVar7, 1.0f);
                            bVarL115.f17736d.g(eVar2, f112);
                            bVarL115.f17736d.g(eVar, -f112);
                            cVar6.c(bVarL115);
                        } else {
                            float f113 = this.A;
                            b bVarL116 = cVar6.l();
                            bVarL116.f17736d.g(eVar2, -1.0f);
                            bVarL116.f17736d.g(eVar, 1.0f);
                            bVarL116.f17736d.g(eVar5, f113);
                            bVarL116.f17736d.g(eVar7, -f113);
                            cVar6.c(bVarL116);
                        }
                    }
                    if (cVar4.h()) {
                        ConstraintWidget constraintWidget15 = cVar4.f19148f.f19146d;
                        float radians7 = (float) Math.toRadians(this.C + 90.0f);
                        int iE7 = cVar4.e();
                        e eVarK111118 = cVar6.k(i(2));
                        e eVarK111119 = cVar6.k(i(3));
                        e eVarK1111110 = cVar6.k(i(4));
                        e eVarK1111111 = cVar6.k(i(5));
                        e eVarK1111112 = cVar6.k(constraintWidget15.i(2));
                        e eVarK1111113 = cVar6.k(constraintWidget15.i(3));
                        e eVarK1111114 = cVar6.k(constraintWidget15.i(4));
                        e eVarK1111115 = cVar6.k(constraintWidget15.i(5));
                        b bVarL117 = cVar6.l();
                        double d18 = radians7;
                        double dSin7 = Math.sin(d18);
                        double d19 = iE7;
                        bVarL117.f17736d.g(eVarK1111113, 0.5f);
                        bVarL117.f17736d.g(eVarK1111115, 0.5f);
                        bVarL117.f17736d.g(eVarK111119, -0.5f);
                        bVarL117.f17736d.g(eVarK1111111, -0.5f);
                        bVarL117.f17734b = -((float) (dSin7 * d19));
                        cVar6.c(bVarL117);
                        b bVarL118 = cVar6.l();
                        float fCos7 = (float) (Math.cos(d18) * d19);
                        bVarL118.f17736d.g(eVarK1111112, 0.5f);
                        bVarL118.f17736d.g(eVarK1111114, 0.5f);
                        bVarL118.f17736d.g(eVarK111118, -0.5f);
                        bVarL118.f17736d.g(eVarK1111110, -0.5f);
                        bVarL118.f17734b = -fCos7;
                        cVar6.c(bVarL118);
                    }
                    this.j = false;
                    this.k = false;
                }
                i27 = -1;
                if (z13) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                if (iArr[0] == 2) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                if (z15) {
                    i28 = 0;
                } else {
                    i28 = i16;
                }
                cVar4 = this.O;
                z16 = !cVar4.h();
                char c16 = '\b';
                boolean z2111 = zArr4[0];
                boolean z2112 = zArr4[1];
                i29 = this.f1259n;
                int[] iArr15 = this.B;
                if (i29 != 2) {
                    r5 = i13;
                    iArr2 = iArr;
                    eVar = eVarK;
                    eVar2 = eVarK2;
                    z17 = z16;
                    eVar3 = eVarK5;
                    z18 = z7;
                    r6 = i14;
                    i30 = i25;
                    cVar5 = cVar2;
                    i31 = i26;
                } else {
                    r5 = i13;
                    iArr2 = iArr;
                    eVar = eVarK;
                    eVar2 = eVarK2;
                    z17 = z16;
                    eVar3 = eVarK5;
                    z18 = z7;
                    r6 = i14;
                    i30 = i25;
                    cVar5 = cVar2;
                    i31 = i26;
                }
                if (z5) {
                    eVar4 = r33;
                    eVar5 = eVarK4;
                    eVar6 = eVar3;
                    i32 = 0;
                    i33 = 8;
                    z19 = true;
                    i34 = 1;
                } else {
                    eVar4 = r33;
                    eVar5 = eVarK4;
                    eVar6 = eVar3;
                    i32 = 0;
                    i33 = 8;
                    z19 = true;
                    i34 = 1;
                }
                if (this.f1261o == 2) {
                    i34 = i32;
                }
                if (i34 != 0) {
                    eVar7 = eVar4;
                } else {
                    eVar7 = eVar4;
                }
                if (z13) {
                    if (this.f1273z == 1) {
                        float f114 = this.A;
                        b bVarL119 = cVar6.l();
                        bVarL119.f17736d.g(eVar5, -1.0f);
                        bVarL119.f17736d.g(eVar7, 1.0f);
                        bVarL119.f17736d.g(eVar2, f114);
                        bVarL119.f17736d.g(eVar, -f114);
                        cVar6.c(bVarL119);
                    } else {
                        float f115 = this.A;
                        b bVarL1110 = cVar6.l();
                        bVarL1110.f17736d.g(eVar2, -1.0f);
                        bVarL1110.f17736d.g(eVar, 1.0f);
                        bVarL1110.f17736d.g(eVar5, f115);
                        bVarL1110.f17736d.g(eVar7, -f115);
                        cVar6.c(bVarL1110);
                    }
                }
                if (cVar4.h()) {
                    ConstraintWidget constraintWidget16 = cVar4.f19148f.f19146d;
                    float radians8 = (float) Math.toRadians(this.C + 90.0f);
                    int iE8 = cVar4.e();
                    e eVarK1111116 = cVar6.k(i(2));
                    e eVarK1111117 = cVar6.k(i(3));
                    e eVarK1111118 = cVar6.k(i(4));
                    e eVarK1111119 = cVar6.k(i(5));
                    e eVarK11111110 = cVar6.k(constraintWidget16.i(2));
                    e eVarK11111111 = cVar6.k(constraintWidget16.i(3));
                    e eVarK11111112 = cVar6.k(constraintWidget16.i(4));
                    e eVarK11111113 = cVar6.k(constraintWidget16.i(5));
                    b bVarL1111 = cVar6.l();
                    double d110 = radians8;
                    double dSin8 = Math.sin(d110);
                    double d111 = iE8;
                    bVarL1111.f17736d.g(eVarK11111111, 0.5f);
                    bVarL1111.f17736d.g(eVarK11111113, 0.5f);
                    bVarL1111.f17736d.g(eVarK1111117, -0.5f);
                    bVarL1111.f17736d.g(eVarK1111119, -0.5f);
                    bVarL1111.f17734b = -((float) (dSin8 * d111));
                    cVar6.c(bVarL1111);
                    b bVarL1112 = cVar6.l();
                    float fCos8 = (float) (Math.cos(d110) * d111);
                    bVarL1112.f17736d.g(eVarK11111110, 0.5f);
                    bVarL1112.f17736d.g(eVarK11111112, 0.5f);
                    bVarL1112.f17736d.g(eVarK1111116, -0.5f);
                    bVarL1112.f17736d.g(eVarK1111118, -0.5f);
                    bVarL1112.f17734b = -fCos8;
                    cVar6.c(bVarL1112);
                }
                this.j = false;
                this.k = false;
            }
            cVar2 = cVar11;
            zArr3 = zArr2;
            zArr4 = zArr;
            if (metrics != null) {
                metrics.f1233e++;
            }
            if (this.S != null) {
                if (t(0)) {
                    ((ConstraintWidgetContainer) this.S).M(this, 0);
                    zU = true;
                    i37 = 1;
                } else {
                    zU = u();
                    i37 = 1;
                }
                if (t(i37)) {
                    ((ConstraintWidgetContainer) this.S).M(this, i37);
                    zV = true;
                } else {
                    zV = v();
                }
                if (!zU) {
                    cVar6.f(cVar6.k(this.S.J), eVarK2, 0, 1);
                }
                if (!zV) {
                    cVar6.f(cVar6.k(this.S.K), eVarK4, 0, 1);
                }
                z10 = zV;
                z7 = zU;
            } else {
                z7 = false;
                z10 = false;
            }
            i15 = this.T;
            i16 = this.a0;
            if (i15 >= i16) {
                i16 = i15;
            }
            i17 = this.U;
            i18 = this.f1239b0;
            if (i17 < i18) {
                i19 = i18;
            } else {
                i19 = i17;
            }
            iArr = this.f1262o0;
            i20 = iArr[0];
            if (i20 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            i21 = iArr[1];
            if (i21 != 3) {
                z12 = true;
            } else {
                z12 = false;
            }
            int i413 = this.W;
            this.f1273z = i413;
            f2 = this.V;
            this.A = f2;
            i22 = this.f1264q;
            i23 = this.f1265r;
            if (f2 > 0.0f) {
                cVar3 = cVar10;
                if (this.f1247f0 != 8) {
                    if (i20 == 3) {
                        i36 = i22;
                    } else {
                        i36 = i22;
                    }
                    if (i21 == 3) {
                        i26 = i23;
                    } else {
                        i26 = i23;
                    }
                    if (i20 == 3) {
                        if (i20 == 3) {
                            if (i21 != 3) {
                                i25 = i36;
                                i24 = i19;
                            } else {
                                i25 = i36;
                                i24 = i19;
                            }
                            z13 = true;
                        } else {
                            if (i21 != 3) {
                                i25 = i36;
                                i24 = i19;
                            } else {
                                i25 = i36;
                                i24 = i19;
                            }
                            z13 = true;
                        }
                    } else if (i20 == 3) {
                        if (i21 != 3) {
                            i25 = i36;
                            i24 = i19;
                        } else {
                            i25 = i36;
                            i24 = i19;
                        }
                        z13 = true;
                    } else {
                        if (i21 != 3) {
                            i25 = i36;
                            i24 = i19;
                        } else {
                            i25 = i36;
                            i24 = i19;
                        }
                        z13 = true;
                    }
                    int[] iArr16 = this.f1266s;
                    iArr16[0] = i25;
                    iArr16[1] = i26;
                    if (z13) {
                        int i414 = this.f1273z;
                        i27 = -1;
                        if (i414 != 0) {
                        }
                        if (z13) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        if (iArr[0] == 2) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        if (z15) {
                            i28 = 0;
                        } else {
                            i28 = i16;
                        }
                        cVar4 = this.O;
                        z16 = !cVar4.h();
                        char c17 = '\b';
                        boolean z2113 = zArr4[0];
                        boolean z2114 = zArr4[1];
                        i29 = this.f1259n;
                        int[] iArr17 = this.B;
                        if (i29 != 2) {
                            r5 = i13;
                            iArr2 = iArr;
                            eVar = eVarK;
                            eVar2 = eVarK2;
                            z17 = z16;
                            eVar3 = eVarK5;
                            z18 = z7;
                            r6 = i14;
                            i30 = i25;
                            cVar5 = cVar2;
                            i31 = i26;
                        } else {
                            r5 = i13;
                            iArr2 = iArr;
                            eVar = eVarK;
                            eVar2 = eVarK2;
                            z17 = z16;
                            eVar3 = eVarK5;
                            z18 = z7;
                            r6 = i14;
                            i30 = i25;
                            cVar5 = cVar2;
                            i31 = i26;
                        }
                        if (z5) {
                            eVar4 = r33;
                            eVar5 = eVarK4;
                            eVar6 = eVar3;
                            i32 = 0;
                            i33 = 8;
                            z19 = true;
                            i34 = 1;
                        } else {
                            eVar4 = r33;
                            eVar5 = eVarK4;
                            eVar6 = eVar3;
                            i32 = 0;
                            i33 = 8;
                            z19 = true;
                            i34 = 1;
                        }
                        if (this.f1261o == 2) {
                            i34 = i32;
                        }
                        if (i34 != 0) {
                            eVar7 = eVar4;
                        } else {
                            eVar7 = eVar4;
                        }
                        if (z13) {
                            if (this.f1273z == 1) {
                                float f116 = this.A;
                                b bVarL1113 = cVar6.l();
                                bVarL1113.f17736d.g(eVar5, -1.0f);
                                bVarL1113.f17736d.g(eVar7, 1.0f);
                                bVarL1113.f17736d.g(eVar2, f116);
                                bVarL1113.f17736d.g(eVar, -f116);
                                cVar6.c(bVarL1113);
                            } else {
                                float f117 = this.A;
                                b bVarL1114 = cVar6.l();
                                bVarL1114.f17736d.g(eVar2, -1.0f);
                                bVarL1114.f17736d.g(eVar, 1.0f);
                                bVarL1114.f17736d.g(eVar5, f117);
                                bVarL1114.f17736d.g(eVar7, -f117);
                                cVar6.c(bVarL1114);
                            }
                        }
                        if (cVar4.h()) {
                            ConstraintWidget constraintWidget17 = cVar4.f19148f.f19146d;
                            float radians9 = (float) Math.toRadians(this.C + 90.0f);
                            int iE9 = cVar4.e();
                            e eVarK11111114 = cVar6.k(i(2));
                            e eVarK11111115 = cVar6.k(i(3));
                            e eVarK11111116 = cVar6.k(i(4));
                            e eVarK11111117 = cVar6.k(i(5));
                            e eVarK11111118 = cVar6.k(constraintWidget17.i(2));
                            e eVarK11111119 = cVar6.k(constraintWidget17.i(3));
                            e eVarK111111110 = cVar6.k(constraintWidget17.i(4));
                            e eVarK111111111 = cVar6.k(constraintWidget17.i(5));
                            b bVarL1115 = cVar6.l();
                            double d112 = radians9;
                            double dSin9 = Math.sin(d112);
                            double d113 = iE9;
                            bVarL1115.f17736d.g(eVarK11111119, 0.5f);
                            bVarL1115.f17736d.g(eVarK111111111, 0.5f);
                            bVarL1115.f17736d.g(eVarK11111115, -0.5f);
                            bVarL1115.f17736d.g(eVarK11111117, -0.5f);
                            bVarL1115.f17734b = -((float) (dSin9 * d113));
                            cVar6.c(bVarL1115);
                            b bVarL1116 = cVar6.l();
                            float fCos9 = (float) (Math.cos(d112) * d113);
                            bVarL1116.f17736d.g(eVarK11111118, 0.5f);
                            bVarL1116.f17736d.g(eVarK111111110, 0.5f);
                            bVarL1116.f17736d.g(eVarK11111114, -0.5f);
                            bVarL1116.f17736d.g(eVarK11111116, -0.5f);
                            bVarL1116.f17734b = -fCos9;
                            cVar6.c(bVarL1116);
                        }
                        this.j = false;
                        this.k = false;
                    }
                    i27 = -1;
                    if (z13) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (iArr[0] == 2) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        i28 = 0;
                    } else {
                        i28 = i16;
                    }
                    cVar4 = this.O;
                    z16 = !cVar4.h();
                    char c18 = '\b';
                    boolean z2115 = zArr4[0];
                    boolean z2116 = zArr4[1];
                    i29 = this.f1259n;
                    int[] iArr18 = this.B;
                    if (i29 != 2) {
                        r5 = i13;
                        iArr2 = iArr;
                        eVar = eVarK;
                        eVar2 = eVarK2;
                        z17 = z16;
                        eVar3 = eVarK5;
                        z18 = z7;
                        r6 = i14;
                        i30 = i25;
                        cVar5 = cVar2;
                        i31 = i26;
                    } else {
                        r5 = i13;
                        iArr2 = iArr;
                        eVar = eVarK;
                        eVar2 = eVarK2;
                        z17 = z16;
                        eVar3 = eVarK5;
                        z18 = z7;
                        r6 = i14;
                        i30 = i25;
                        cVar5 = cVar2;
                        i31 = i26;
                    }
                    if (z5) {
                        eVar4 = r33;
                        eVar5 = eVarK4;
                        eVar6 = eVar3;
                        i32 = 0;
                        i33 = 8;
                        z19 = true;
                        i34 = 1;
                    } else {
                        eVar4 = r33;
                        eVar5 = eVarK4;
                        eVar6 = eVar3;
                        i32 = 0;
                        i33 = 8;
                        z19 = true;
                        i34 = 1;
                    }
                    if (this.f1261o == 2) {
                        i34 = i32;
                    }
                    if (i34 != 0) {
                        eVar7 = eVar4;
                    } else {
                        eVar7 = eVar4;
                    }
                    if (z13) {
                        if (this.f1273z == 1) {
                            float f118 = this.A;
                            b bVarL1117 = cVar6.l();
                            bVarL1117.f17736d.g(eVar5, -1.0f);
                            bVarL1117.f17736d.g(eVar7, 1.0f);
                            bVarL1117.f17736d.g(eVar2, f118);
                            bVarL1117.f17736d.g(eVar, -f118);
                            cVar6.c(bVarL1117);
                        } else {
                            float f119 = this.A;
                            b bVarL1118 = cVar6.l();
                            bVarL1118.f17736d.g(eVar2, -1.0f);
                            bVarL1118.f17736d.g(eVar, 1.0f);
                            bVarL1118.f17736d.g(eVar5, f119);
                            bVarL1118.f17736d.g(eVar7, -f119);
                            cVar6.c(bVarL1118);
                        }
                    }
                    if (cVar4.h()) {
                        ConstraintWidget constraintWidget18 = cVar4.f19148f.f19146d;
                        float radians10 = (float) Math.toRadians(this.C + 90.0f);
                        int iE10 = cVar4.e();
                        e eVarK111111112 = cVar6.k(i(2));
                        e eVarK111111113 = cVar6.k(i(3));
                        e eVarK111111114 = cVar6.k(i(4));
                        e eVarK111111115 = cVar6.k(i(5));
                        e eVarK111111116 = cVar6.k(constraintWidget18.i(2));
                        e eVarK111111117 = cVar6.k(constraintWidget18.i(3));
                        e eVarK111111118 = cVar6.k(constraintWidget18.i(4));
                        e eVarK111111119 = cVar6.k(constraintWidget18.i(5));
                        b bVarL1119 = cVar6.l();
                        double d114 = radians10;
                        double dSin10 = Math.sin(d114);
                        double d115 = iE10;
                        bVarL1119.f17736d.g(eVarK111111117, 0.5f);
                        bVarL1119.f17736d.g(eVarK111111119, 0.5f);
                        bVarL1119.f17736d.g(eVarK111111113, -0.5f);
                        bVarL1119.f17736d.g(eVarK111111115, -0.5f);
                        bVarL1119.f17734b = -((float) (dSin10 * d115));
                        cVar6.c(bVarL1119);
                        b bVarL11110 = cVar6.l();
                        float fCos10 = (float) (Math.cos(d114) * d115);
                        bVarL11110.f17736d.g(eVarK111111116, 0.5f);
                        bVarL11110.f17736d.g(eVarK111111118, 0.5f);
                        bVarL11110.f17736d.g(eVarK111111112, -0.5f);
                        bVarL11110.f17736d.g(eVarK111111114, -0.5f);
                        bVarL11110.f17734b = -fCos10;
                        cVar6.c(bVarL11110);
                    }
                    this.j = false;
                    this.k = false;
                }
                z13 = false;
                int[] iArr19 = this.f1266s;
                iArr19[0] = i25;
                iArr19[1] = i26;
                if (z13) {
                    int i415 = this.f1273z;
                    i27 = -1;
                    if (i415 != 0) {
                    }
                    if (z13) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (iArr[0] == 2) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        i28 = 0;
                    } else {
                        i28 = i16;
                    }
                    cVar4 = this.O;
                    z16 = !cVar4.h();
                    char c19 = '\b';
                    boolean z2117 = zArr4[0];
                    boolean z2118 = zArr4[1];
                    i29 = this.f1259n;
                    int[] iArr110 = this.B;
                    if (i29 != 2) {
                        r5 = i13;
                        iArr2 = iArr;
                        eVar = eVarK;
                        eVar2 = eVarK2;
                        z17 = z16;
                        eVar3 = eVarK5;
                        z18 = z7;
                        r6 = i14;
                        i30 = i25;
                        cVar5 = cVar2;
                        i31 = i26;
                    } else {
                        r5 = i13;
                        iArr2 = iArr;
                        eVar = eVarK;
                        eVar2 = eVarK2;
                        z17 = z16;
                        eVar3 = eVarK5;
                        z18 = z7;
                        r6 = i14;
                        i30 = i25;
                        cVar5 = cVar2;
                        i31 = i26;
                    }
                    if (z5) {
                        eVar4 = r33;
                        eVar5 = eVarK4;
                        eVar6 = eVar3;
                        i32 = 0;
                        i33 = 8;
                        z19 = true;
                        i34 = 1;
                    } else {
                        eVar4 = r33;
                        eVar5 = eVarK4;
                        eVar6 = eVar3;
                        i32 = 0;
                        i33 = 8;
                        z19 = true;
                        i34 = 1;
                    }
                    if (this.f1261o == 2) {
                        i34 = i32;
                    }
                    if (i34 != 0) {
                        eVar7 = eVar4;
                    } else {
                        eVar7 = eVar4;
                    }
                    if (z13) {
                        if (this.f1273z == 1) {
                            float f1110 = this.A;
                            b bVarL11111 = cVar6.l();
                            bVarL11111.f17736d.g(eVar5, -1.0f);
                            bVarL11111.f17736d.g(eVar7, 1.0f);
                            bVarL11111.f17736d.g(eVar2, f1110);
                            bVarL11111.f17736d.g(eVar, -f1110);
                            cVar6.c(bVarL11111);
                        } else {
                            float f1111 = this.A;
                            b bVarL11112 = cVar6.l();
                            bVarL11112.f17736d.g(eVar2, -1.0f);
                            bVarL11112.f17736d.g(eVar, 1.0f);
                            bVarL11112.f17736d.g(eVar5, f1111);
                            bVarL11112.f17736d.g(eVar7, -f1111);
                            cVar6.c(bVarL11112);
                        }
                    }
                    if (cVar4.h()) {
                        ConstraintWidget constraintWidget19 = cVar4.f19148f.f19146d;
                        float radians11 = (float) Math.toRadians(this.C + 90.0f);
                        int iE11 = cVar4.e();
                        e eVarK1111111110 = cVar6.k(i(2));
                        e eVarK1111111111 = cVar6.k(i(3));
                        e eVarK1111111112 = cVar6.k(i(4));
                        e eVarK1111111113 = cVar6.k(i(5));
                        e eVarK1111111114 = cVar6.k(constraintWidget19.i(2));
                        e eVarK1111111115 = cVar6.k(constraintWidget19.i(3));
                        e eVarK1111111116 = cVar6.k(constraintWidget19.i(4));
                        e eVarK1111111117 = cVar6.k(constraintWidget19.i(5));
                        b bVarL11113 = cVar6.l();
                        double d116 = radians11;
                        double dSin11 = Math.sin(d116);
                        double d117 = iE11;
                        bVarL11113.f17736d.g(eVarK1111111115, 0.5f);
                        bVarL11113.f17736d.g(eVarK1111111117, 0.5f);
                        bVarL11113.f17736d.g(eVarK1111111111, -0.5f);
                        bVarL11113.f17736d.g(eVarK1111111113, -0.5f);
                        bVarL11113.f17734b = -((float) (dSin11 * d117));
                        cVar6.c(bVarL11113);
                        b bVarL11114 = cVar6.l();
                        float fCos11 = (float) (Math.cos(d116) * d117);
                        bVarL11114.f17736d.g(eVarK1111111114, 0.5f);
                        bVarL11114.f17736d.g(eVarK1111111116, 0.5f);
                        bVarL11114.f17736d.g(eVarK1111111110, -0.5f);
                        bVarL11114.f17736d.g(eVarK1111111112, -0.5f);
                        bVarL11114.f17734b = -fCos11;
                        cVar6.c(bVarL11114);
                    }
                    this.j = false;
                    this.k = false;
                }
                i27 = -1;
                if (z13) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                if (iArr[0] == 2) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                if (z15) {
                    i28 = 0;
                } else {
                    i28 = i16;
                }
                cVar4 = this.O;
                z16 = !cVar4.h();
                char c110 = '\b';
                boolean z2119 = zArr4[0];
                boolean z21110 = zArr4[1];
                i29 = this.f1259n;
                int[] iArr111 = this.B;
                if (i29 != 2) {
                    r5 = i13;
                    iArr2 = iArr;
                    eVar = eVarK;
                    eVar2 = eVarK2;
                    z17 = z16;
                    eVar3 = eVarK5;
                    z18 = z7;
                    r6 = i14;
                    i30 = i25;
                    cVar5 = cVar2;
                    i31 = i26;
                } else {
                    r5 = i13;
                    iArr2 = iArr;
                    eVar = eVarK;
                    eVar2 = eVarK2;
                    z17 = z16;
                    eVar3 = eVarK5;
                    z18 = z7;
                    r6 = i14;
                    i30 = i25;
                    cVar5 = cVar2;
                    i31 = i26;
                }
                if (z5) {
                    eVar4 = r33;
                    eVar5 = eVarK4;
                    eVar6 = eVar3;
                    i32 = 0;
                    i33 = 8;
                    z19 = true;
                    i34 = 1;
                } else {
                    eVar4 = r33;
                    eVar5 = eVarK4;
                    eVar6 = eVar3;
                    i32 = 0;
                    i33 = 8;
                    z19 = true;
                    i34 = 1;
                }
                if (this.f1261o == 2) {
                    i34 = i32;
                }
                if (i34 != 0) {
                    eVar7 = eVar4;
                } else {
                    eVar7 = eVar4;
                }
                if (z13) {
                    if (this.f1273z == 1) {
                        float f1112 = this.A;
                        b bVarL11115 = cVar6.l();
                        bVarL11115.f17736d.g(eVar5, -1.0f);
                        bVarL11115.f17736d.g(eVar7, 1.0f);
                        bVarL11115.f17736d.g(eVar2, f1112);
                        bVarL11115.f17736d.g(eVar, -f1112);
                        cVar6.c(bVarL11115);
                    } else {
                        float f1113 = this.A;
                        b bVarL11116 = cVar6.l();
                        bVarL11116.f17736d.g(eVar2, -1.0f);
                        bVarL11116.f17736d.g(eVar, 1.0f);
                        bVarL11116.f17736d.g(eVar5, f1113);
                        bVarL11116.f17736d.g(eVar7, -f1113);
                        cVar6.c(bVarL11116);
                    }
                }
                if (cVar4.h()) {
                    ConstraintWidget constraintWidget110 = cVar4.f19148f.f19146d;
                    float radians12 = (float) Math.toRadians(this.C + 90.0f);
                    int iE12 = cVar4.e();
                    e eVarK1111111118 = cVar6.k(i(2));
                    e eVarK1111111119 = cVar6.k(i(3));
                    e eVarK11111111110 = cVar6.k(i(4));
                    e eVarK11111111111 = cVar6.k(i(5));
                    e eVarK11111111112 = cVar6.k(constraintWidget110.i(2));
                    e eVarK11111111113 = cVar6.k(constraintWidget110.i(3));
                    e eVarK11111111114 = cVar6.k(constraintWidget110.i(4));
                    e eVarK11111111115 = cVar6.k(constraintWidget110.i(5));
                    b bVarL11117 = cVar6.l();
                    double d118 = radians12;
                    double dSin12 = Math.sin(d118);
                    double d119 = iE12;
                    bVarL11117.f17736d.g(eVarK11111111113, 0.5f);
                    bVarL11117.f17736d.g(eVarK11111111115, 0.5f);
                    bVarL11117.f17736d.g(eVarK1111111119, -0.5f);
                    bVarL11117.f17736d.g(eVarK11111111111, -0.5f);
                    bVarL11117.f17734b = -((float) (dSin12 * d119));
                    cVar6.c(bVarL11117);
                    b bVarL11118 = cVar6.l();
                    float fCos12 = (float) (Math.cos(d118) * d119);
                    bVarL11118.f17736d.g(eVarK11111111112, 0.5f);
                    bVarL11118.f17736d.g(eVarK11111111114, 0.5f);
                    bVarL11118.f17736d.g(eVarK1111111118, -0.5f);
                    bVarL11118.f17736d.g(eVarK11111111110, -0.5f);
                    bVarL11118.f17734b = -fCos12;
                    cVar6.c(bVarL11118);
                }
                this.j = false;
                this.k = false;
            }
            cVar3 = cVar10;
            eVarK4 = eVarK4;
            i24 = i19;
            i25 = i22;
            i26 = i23;
            z13 = false;
            int[] iArr112 = this.f1266s;
            iArr112[0] = i25;
            iArr112[1] = i26;
            if (z13) {
                int i416 = this.f1273z;
                i27 = -1;
                if (i416 != 0) {
                }
                if (z13) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                if (iArr[0] == 2) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                if (z15) {
                    i28 = 0;
                } else {
                    i28 = i16;
                }
                cVar4 = this.O;
                z16 = !cVar4.h();
                char c111 = '\b';
                boolean z21111 = zArr4[0];
                boolean z21112 = zArr4[1];
                i29 = this.f1259n;
                int[] iArr113 = this.B;
                if (i29 != 2) {
                    r5 = i13;
                    iArr2 = iArr;
                    eVar = eVarK;
                    eVar2 = eVarK2;
                    z17 = z16;
                    eVar3 = eVarK5;
                    z18 = z7;
                    r6 = i14;
                    i30 = i25;
                    cVar5 = cVar2;
                    i31 = i26;
                } else {
                    r5 = i13;
                    iArr2 = iArr;
                    eVar = eVarK;
                    eVar2 = eVarK2;
                    z17 = z16;
                    eVar3 = eVarK5;
                    z18 = z7;
                    r6 = i14;
                    i30 = i25;
                    cVar5 = cVar2;
                    i31 = i26;
                }
                if (z5) {
                    eVar4 = r33;
                    eVar5 = eVarK4;
                    eVar6 = eVar3;
                    i32 = 0;
                    i33 = 8;
                    z19 = true;
                    i34 = 1;
                } else {
                    eVar4 = r33;
                    eVar5 = eVarK4;
                    eVar6 = eVar3;
                    i32 = 0;
                    i33 = 8;
                    z19 = true;
                    i34 = 1;
                }
                if (this.f1261o == 2) {
                    i34 = i32;
                }
                if (i34 != 0) {
                    eVar7 = eVar4;
                } else {
                    eVar7 = eVar4;
                }
                if (z13) {
                    if (this.f1273z == 1) {
                        float f1114 = this.A;
                        b bVarL11119 = cVar6.l();
                        bVarL11119.f17736d.g(eVar5, -1.0f);
                        bVarL11119.f17736d.g(eVar7, 1.0f);
                        bVarL11119.f17736d.g(eVar2, f1114);
                        bVarL11119.f17736d.g(eVar, -f1114);
                        cVar6.c(bVarL11119);
                    } else {
                        float f1115 = this.A;
                        b bVarL111110 = cVar6.l();
                        bVarL111110.f17736d.g(eVar2, -1.0f);
                        bVarL111110.f17736d.g(eVar, 1.0f);
                        bVarL111110.f17736d.g(eVar5, f1115);
                        bVarL111110.f17736d.g(eVar7, -f1115);
                        cVar6.c(bVarL111110);
                    }
                }
                if (cVar4.h()) {
                    ConstraintWidget constraintWidget111 = cVar4.f19148f.f19146d;
                    float radians13 = (float) Math.toRadians(this.C + 90.0f);
                    int iE13 = cVar4.e();
                    e eVarK11111111116 = cVar6.k(i(2));
                    e eVarK11111111117 = cVar6.k(i(3));
                    e eVarK11111111118 = cVar6.k(i(4));
                    e eVarK11111111119 = cVar6.k(i(5));
                    e eVarK111111111110 = cVar6.k(constraintWidget111.i(2));
                    e eVarK111111111111 = cVar6.k(constraintWidget111.i(3));
                    e eVarK111111111112 = cVar6.k(constraintWidget111.i(4));
                    e eVarK111111111113 = cVar6.k(constraintWidget111.i(5));
                    b bVarL111111 = cVar6.l();
                    double d1110 = radians13;
                    double dSin13 = Math.sin(d1110);
                    double d1111 = iE13;
                    bVarL111111.f17736d.g(eVarK111111111111, 0.5f);
                    bVarL111111.f17736d.g(eVarK111111111113, 0.5f);
                    bVarL111111.f17736d.g(eVarK11111111117, -0.5f);
                    bVarL111111.f17736d.g(eVarK11111111119, -0.5f);
                    bVarL111111.f17734b = -((float) (dSin13 * d1111));
                    cVar6.c(bVarL111111);
                    b bVarL111112 = cVar6.l();
                    float fCos13 = (float) (Math.cos(d1110) * d1111);
                    bVarL111112.f17736d.g(eVarK111111111110, 0.5f);
                    bVarL111112.f17736d.g(eVarK111111111112, 0.5f);
                    bVarL111112.f17736d.g(eVarK11111111116, -0.5f);
                    bVarL111112.f17736d.g(eVarK11111111118, -0.5f);
                    bVarL111112.f17734b = -fCos13;
                    cVar6.c(bVarL111112);
                }
                this.j = false;
                this.k = false;
            }
            i27 = -1;
            if (z13) {
                z14 = false;
            } else {
                z14 = false;
            }
            if (iArr[0] == 2) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (z15) {
                i28 = 0;
            } else {
                i28 = i16;
            }
            cVar4 = this.O;
            z16 = !cVar4.h();
            char c112 = '\b';
            boolean z21113 = zArr4[0];
            boolean z21114 = zArr4[1];
            i29 = this.f1259n;
            int[] iArr114 = this.B;
            if (i29 != 2) {
                r5 = i13;
                iArr2 = iArr;
                eVar = eVarK;
                eVar2 = eVarK2;
                z17 = z16;
                eVar3 = eVarK5;
                z18 = z7;
                r6 = i14;
                i30 = i25;
                cVar5 = cVar2;
                i31 = i26;
            } else {
                r5 = i13;
                iArr2 = iArr;
                eVar = eVarK;
                eVar2 = eVarK2;
                z17 = z16;
                eVar3 = eVarK5;
                z18 = z7;
                r6 = i14;
                i30 = i25;
                cVar5 = cVar2;
                i31 = i26;
            }
            if (z5) {
                eVar4 = r33;
                eVar5 = eVarK4;
                eVar6 = eVar3;
                i32 = 0;
                i33 = 8;
                z19 = true;
                i34 = 1;
            } else {
                eVar4 = r33;
                eVar5 = eVarK4;
                eVar6 = eVar3;
                i32 = 0;
                i33 = 8;
                z19 = true;
                i34 = 1;
            }
            if (this.f1261o == 2) {
                i34 = i32;
            }
            if (i34 != 0) {
                eVar7 = eVar4;
            } else {
                eVar7 = eVar4;
            }
            if (z13) {
                if (this.f1273z == 1) {
                    float f1116 = this.A;
                    b bVarL111113 = cVar6.l();
                    bVarL111113.f17736d.g(eVar5, -1.0f);
                    bVarL111113.f17736d.g(eVar7, 1.0f);
                    bVarL111113.f17736d.g(eVar2, f1116);
                    bVarL111113.f17736d.g(eVar, -f1116);
                    cVar6.c(bVarL111113);
                } else {
                    float f1117 = this.A;
                    b bVarL111114 = cVar6.l();
                    bVarL111114.f17736d.g(eVar2, -1.0f);
                    bVarL111114.f17736d.g(eVar, 1.0f);
                    bVarL111114.f17736d.g(eVar5, f1117);
                    bVarL111114.f17736d.g(eVar7, -f1117);
                    cVar6.c(bVarL111114);
                }
            }
            if (cVar4.h()) {
                ConstraintWidget constraintWidget112 = cVar4.f19148f.f19146d;
                float radians14 = (float) Math.toRadians(this.C + 90.0f);
                int iE14 = cVar4.e();
                e eVarK111111111114 = cVar6.k(i(2));
                e eVarK111111111115 = cVar6.k(i(3));
                e eVarK111111111116 = cVar6.k(i(4));
                e eVarK111111111117 = cVar6.k(i(5));
                e eVarK111111111118 = cVar6.k(constraintWidget112.i(2));
                e eVarK111111111119 = cVar6.k(constraintWidget112.i(3));
                e eVarK1111111111110 = cVar6.k(constraintWidget112.i(4));
                e eVarK1111111111111 = cVar6.k(constraintWidget112.i(5));
                b bVarL111115 = cVar6.l();
                double d1112 = radians14;
                double dSin14 = Math.sin(d1112);
                double d1113 = iE14;
                bVarL111115.f17736d.g(eVarK111111111119, 0.5f);
                bVarL111115.f17736d.g(eVarK1111111111111, 0.5f);
                bVarL111115.f17736d.g(eVarK111111111115, -0.5f);
                bVarL111115.f17736d.g(eVarK111111111117, -0.5f);
                bVarL111115.f17734b = -((float) (dSin14 * d1113));
                cVar6.c(bVarL111115);
                b bVarL111116 = cVar6.l();
                float fCos14 = (float) (Math.cos(d1112) * d1113);
                bVarL111116.f17736d.g(eVarK111111111118, 0.5f);
                bVarL111116.f17736d.g(eVarK1111111111110, 0.5f);
                bVarL111116.f17736d.g(eVarK111111111114, -0.5f);
                bVarL111116.f17736d.g(eVarK111111111116, -0.5f);
                bVarL111116.f17734b = -fCos14;
                cVar6.c(bVarL111116);
            }
            this.j = false;
            this.k = false;
        }
        i7 = 0;
        i10 = i7;
        i11 = i10;
        i12 = this.f1247f0;
        zArr = this.R;
        i13 = i10;
        if (i12 == 8) {
            arrayList = this.Q;
            size = arrayList.size();
            i14 = i11;
            i38 = i7;
            while (true) {
                if (i38 < size) {
                    if (!zArr[i7]) {
                        break;
                    } else {
                        return;
                    }
                }
                int i417 = size;
                hashSet2 = ((c) arrayList.get(i38)).f19143a;
                if (hashSet2 != null) {
                    break;
                    break;
                }
                i38++;
                size = i417;
            }
        } else {
            i14 = i11;
        }
        z6 = this.j;
        if (z6) {
            if (z6) {
                cVar6.d(eVarK, this.X);
                cVar6.d(eVarK2, this.X + this.T);
                if (i14 != 0) {
                    constraintWidgetContainer2 = (ConstraintWidgetContainer) constraintWidget2;
                    weakReference3 = constraintWidgetContainer2.G0;
                    if (weakReference3 != null) {
                        constraintWidgetContainer2.G0 = new WeakReference(cVar7);
                    } else {
                        constraintWidgetContainer2.G0 = new WeakReference(cVar7);
                    }
                    weakReference4 = constraintWidgetContainer2.I0;
                    if (weakReference4 != null) {
                        constraintWidgetContainer2.I0 = new WeakReference(cVar8);
                    } else {
                        constraintWidgetContainer2.I0 = new WeakReference(cVar8);
                    }
                }
            }
            if (this.k) {
                cVar6.d(eVarK3, this.Y);
                cVar6.d(eVarK4, this.Y + this.U);
                hashSet = cVar11.f19143a;
                if (hashSet != null) {
                    cVar6.d(eVarK5, this.Y + this.Z);
                }
                if (i13 != 0) {
                    constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget;
                    weakReference = constraintWidgetContainer.F0;
                    if (weakReference != null) {
                        constraintWidgetContainer.F0 = new WeakReference(cVar9);
                    } else {
                        constraintWidgetContainer.F0 = new WeakReference(cVar9);
                    }
                    weakReference2 = constraintWidgetContainer.H0;
                    if (weakReference2 != null) {
                        constraintWidgetContainer.H0 = new WeakReference(cVar10);
                    } else {
                        constraintWidgetContainer.H0 = new WeakReference(cVar10);
                    }
                }
            }
            if (this.j) {
                ?? r13 = i7;
                this.j = r13;
                this.k = r13;
                return;
            }
        } else {
            if (z6) {
                cVar6.d(eVarK, this.X);
                cVar6.d(eVarK2, this.X + this.T);
                if (i14 != 0) {
                    constraintWidgetContainer2 = (ConstraintWidgetContainer) constraintWidget2;
                    weakReference3 = constraintWidgetContainer2.G0;
                    if (weakReference3 != null) {
                        constraintWidgetContainer2.G0 = new WeakReference(cVar7);
                    } else {
                        constraintWidgetContainer2.G0 = new WeakReference(cVar7);
                    }
                    weakReference4 = constraintWidgetContainer2.I0;
                    if (weakReference4 != null) {
                        constraintWidgetContainer2.I0 = new WeakReference(cVar8);
                    } else {
                        constraintWidgetContainer2.I0 = new WeakReference(cVar8);
                    }
                }
            }
            if (this.k) {
                cVar6.d(eVarK3, this.Y);
                cVar6.d(eVarK4, this.Y + this.U);
                hashSet = cVar11.f19143a;
                if (hashSet != null) {
                    cVar6.d(eVarK5, this.Y + this.Z);
                }
                if (i13 != 0) {
                    constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget;
                    weakReference = constraintWidgetContainer.F0;
                    if (weakReference != null) {
                        constraintWidgetContainer.F0 = new WeakReference(cVar9);
                    } else {
                        constraintWidgetContainer.F0 = new WeakReference(cVar9);
                    }
                    weakReference2 = constraintWidgetContainer.H0;
                    if (weakReference2 != null) {
                        constraintWidgetContainer.H0 = new WeakReference(cVar10);
                    } else {
                        constraintWidgetContainer.H0 = new WeakReference(cVar10);
                    }
                }
            }
            if (this.j) {
                ?? r14 = i7;
                this.j = r14;
                this.k = r14;
                return;
            }
        }
        metrics = p0.c.f17740r;
        if (metrics != null) {
            metrics.f1236h++;
        }
        zArr2 = this.f1246f;
        if (!z5) {
            cVar2 = cVar11;
            zArr3 = zArr2;
            zArr4 = zArr;
        } else {
            cVar2 = cVar11;
            zArr3 = zArr2;
            zArr4 = zArr;
        }
        if (metrics != null) {
            metrics.f1233e++;
        }
        if (this.S != null) {
            if (t(0)) {
                ((ConstraintWidgetContainer) this.S).M(this, 0);
                zU = true;
                i37 = 1;
            } else {
                zU = u();
                i37 = 1;
            }
            if (t(i37)) {
                ((ConstraintWidgetContainer) this.S).M(this, i37);
                zV = true;
            } else {
                zV = v();
            }
            if (!zU) {
                cVar6.f(cVar6.k(this.S.J), eVarK2, 0, 1);
            }
            if (!zV) {
                cVar6.f(cVar6.k(this.S.K), eVarK4, 0, 1);
            }
            z10 = zV;
            z7 = zU;
        } else {
            z7 = false;
            z10 = false;
        }
        i15 = this.T;
        i16 = this.a0;
        if (i15 >= i16) {
            i16 = i15;
        }
        i17 = this.U;
        i18 = this.f1239b0;
        if (i17 < i18) {
            i19 = i18;
        } else {
            i19 = i17;
        }
        iArr = this.f1262o0;
        i20 = iArr[0];
        if (i20 != 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        i21 = iArr[1];
        if (i21 != 3) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i418 = this.W;
        this.f1273z = i418;
        f2 = this.V;
        this.A = f2;
        i22 = this.f1264q;
        i23 = this.f1265r;
        if (f2 > 0.0f) {
            cVar3 = cVar10;
            if (this.f1247f0 != 8) {
                if (i20 == 3) {
                    i36 = i22;
                } else {
                    i36 = i22;
                }
                if (i21 == 3) {
                    i26 = i23;
                } else {
                    i26 = i23;
                }
                if (i20 == 3) {
                    if (i20 == 3) {
                        if (i21 != 3) {
                            i25 = i36;
                            i24 = i19;
                        } else {
                            i25 = i36;
                            i24 = i19;
                        }
                        z13 = true;
                    } else {
                        if (i21 != 3) {
                            i25 = i36;
                            i24 = i19;
                        } else {
                            i25 = i36;
                            i24 = i19;
                        }
                        z13 = true;
                    }
                } else if (i20 == 3) {
                    if (i21 != 3) {
                        i25 = i36;
                        i24 = i19;
                    } else {
                        i25 = i36;
                        i24 = i19;
                    }
                    z13 = true;
                } else {
                    if (i21 != 3) {
                        i25 = i36;
                        i24 = i19;
                    } else {
                        i25 = i36;
                        i24 = i19;
                    }
                    z13 = true;
                }
                int[] iArr115 = this.f1266s;
                iArr115[0] = i25;
                iArr115[1] = i26;
                if (z13) {
                    int i419 = this.f1273z;
                    i27 = -1;
                    if (i419 != 0) {
                    }
                    if (z13) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (iArr[0] == 2) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        i28 = 0;
                    } else {
                        i28 = i16;
                    }
                    cVar4 = this.O;
                    z16 = !cVar4.h();
                    char c113 = '\b';
                    boolean z21115 = zArr4[0];
                    boolean z21116 = zArr4[1];
                    i29 = this.f1259n;
                    int[] iArr116 = this.B;
                    if (i29 != 2) {
                        r5 = i13;
                        iArr2 = iArr;
                        eVar = eVarK;
                        eVar2 = eVarK2;
                        z17 = z16;
                        eVar3 = eVarK5;
                        z18 = z7;
                        r6 = i14;
                        i30 = i25;
                        cVar5 = cVar2;
                        i31 = i26;
                    } else {
                        r5 = i13;
                        iArr2 = iArr;
                        eVar = eVarK;
                        eVar2 = eVarK2;
                        z17 = z16;
                        eVar3 = eVarK5;
                        z18 = z7;
                        r6 = i14;
                        i30 = i25;
                        cVar5 = cVar2;
                        i31 = i26;
                    }
                    if (z5) {
                        eVar4 = r33;
                        eVar5 = eVarK4;
                        eVar6 = eVar3;
                        i32 = 0;
                        i33 = 8;
                        z19 = true;
                        i34 = 1;
                    } else {
                        eVar4 = r33;
                        eVar5 = eVarK4;
                        eVar6 = eVar3;
                        i32 = 0;
                        i33 = 8;
                        z19 = true;
                        i34 = 1;
                    }
                    if (this.f1261o == 2) {
                        i34 = i32;
                    }
                    if (i34 != 0) {
                        eVar7 = eVar4;
                    } else {
                        eVar7 = eVar4;
                    }
                    if (z13) {
                        if (this.f1273z == 1) {
                            float f1118 = this.A;
                            b bVarL111117 = cVar6.l();
                            bVarL111117.f17736d.g(eVar5, -1.0f);
                            bVarL111117.f17736d.g(eVar7, 1.0f);
                            bVarL111117.f17736d.g(eVar2, f1118);
                            bVarL111117.f17736d.g(eVar, -f1118);
                            cVar6.c(bVarL111117);
                        } else {
                            float f1119 = this.A;
                            b bVarL111118 = cVar6.l();
                            bVarL111118.f17736d.g(eVar2, -1.0f);
                            bVarL111118.f17736d.g(eVar, 1.0f);
                            bVarL111118.f17736d.g(eVar5, f1119);
                            bVarL111118.f17736d.g(eVar7, -f1119);
                            cVar6.c(bVarL111118);
                        }
                    }
                    if (cVar4.h()) {
                        ConstraintWidget constraintWidget113 = cVar4.f19148f.f19146d;
                        float radians15 = (float) Math.toRadians(this.C + 90.0f);
                        int iE15 = cVar4.e();
                        e eVarK1111111111112 = cVar6.k(i(2));
                        e eVarK1111111111113 = cVar6.k(i(3));
                        e eVarK1111111111114 = cVar6.k(i(4));
                        e eVarK1111111111115 = cVar6.k(i(5));
                        e eVarK1111111111116 = cVar6.k(constraintWidget113.i(2));
                        e eVarK1111111111117 = cVar6.k(constraintWidget113.i(3));
                        e eVarK1111111111118 = cVar6.k(constraintWidget113.i(4));
                        e eVarK1111111111119 = cVar6.k(constraintWidget113.i(5));
                        b bVarL111119 = cVar6.l();
                        double d1114 = radians15;
                        double dSin15 = Math.sin(d1114);
                        double d1115 = iE15;
                        bVarL111119.f17736d.g(eVarK1111111111117, 0.5f);
                        bVarL111119.f17736d.g(eVarK1111111111119, 0.5f);
                        bVarL111119.f17736d.g(eVarK1111111111113, -0.5f);
                        bVarL111119.f17736d.g(eVarK1111111111115, -0.5f);
                        bVarL111119.f17734b = -((float) (dSin15 * d1115));
                        cVar6.c(bVarL111119);
                        b bVarL1111110 = cVar6.l();
                        float fCos15 = (float) (Math.cos(d1114) * d1115);
                        bVarL1111110.f17736d.g(eVarK1111111111116, 0.5f);
                        bVarL1111110.f17736d.g(eVarK1111111111118, 0.5f);
                        bVarL1111110.f17736d.g(eVarK1111111111112, -0.5f);
                        bVarL1111110.f17736d.g(eVarK1111111111114, -0.5f);
                        bVarL1111110.f17734b = -fCos15;
                        cVar6.c(bVarL1111110);
                    }
                    this.j = false;
                    this.k = false;
                }
                i27 = -1;
                if (z13) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                if (iArr[0] == 2) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                if (z15) {
                    i28 = 0;
                } else {
                    i28 = i16;
                }
                cVar4 = this.O;
                z16 = !cVar4.h();
                char c114 = '\b';
                boolean z21117 = zArr4[0];
                boolean z21118 = zArr4[1];
                i29 = this.f1259n;
                int[] iArr117 = this.B;
                if (i29 != 2) {
                    r5 = i13;
                    iArr2 = iArr;
                    eVar = eVarK;
                    eVar2 = eVarK2;
                    z17 = z16;
                    eVar3 = eVarK5;
                    z18 = z7;
                    r6 = i14;
                    i30 = i25;
                    cVar5 = cVar2;
                    i31 = i26;
                } else {
                    r5 = i13;
                    iArr2 = iArr;
                    eVar = eVarK;
                    eVar2 = eVarK2;
                    z17 = z16;
                    eVar3 = eVarK5;
                    z18 = z7;
                    r6 = i14;
                    i30 = i25;
                    cVar5 = cVar2;
                    i31 = i26;
                }
                if (z5) {
                    eVar4 = r33;
                    eVar5 = eVarK4;
                    eVar6 = eVar3;
                    i32 = 0;
                    i33 = 8;
                    z19 = true;
                    i34 = 1;
                } else {
                    eVar4 = r33;
                    eVar5 = eVarK4;
                    eVar6 = eVar3;
                    i32 = 0;
                    i33 = 8;
                    z19 = true;
                    i34 = 1;
                }
                if (this.f1261o == 2) {
                    i34 = i32;
                }
                if (i34 != 0) {
                    eVar7 = eVar4;
                } else {
                    eVar7 = eVar4;
                }
                if (z13) {
                    if (this.f1273z == 1) {
                        float f11110 = this.A;
                        b bVarL1111111 = cVar6.l();
                        bVarL1111111.f17736d.g(eVar5, -1.0f);
                        bVarL1111111.f17736d.g(eVar7, 1.0f);
                        bVarL1111111.f17736d.g(eVar2, f11110);
                        bVarL1111111.f17736d.g(eVar, -f11110);
                        cVar6.c(bVarL1111111);
                    } else {
                        float f11111 = this.A;
                        b bVarL1111112 = cVar6.l();
                        bVarL1111112.f17736d.g(eVar2, -1.0f);
                        bVarL1111112.f17736d.g(eVar, 1.0f);
                        bVarL1111112.f17736d.g(eVar5, f11111);
                        bVarL1111112.f17736d.g(eVar7, -f11111);
                        cVar6.c(bVarL1111112);
                    }
                }
                if (cVar4.h()) {
                    ConstraintWidget constraintWidget114 = cVar4.f19148f.f19146d;
                    float radians16 = (float) Math.toRadians(this.C + 90.0f);
                    int iE16 = cVar4.e();
                    e eVarK11111111111110 = cVar6.k(i(2));
                    e eVarK11111111111111 = cVar6.k(i(3));
                    e eVarK11111111111112 = cVar6.k(i(4));
                    e eVarK11111111111113 = cVar6.k(i(5));
                    e eVarK11111111111114 = cVar6.k(constraintWidget114.i(2));
                    e eVarK11111111111115 = cVar6.k(constraintWidget114.i(3));
                    e eVarK11111111111116 = cVar6.k(constraintWidget114.i(4));
                    e eVarK11111111111117 = cVar6.k(constraintWidget114.i(5));
                    b bVarL1111113 = cVar6.l();
                    double d1116 = radians16;
                    double dSin16 = Math.sin(d1116);
                    double d1117 = iE16;
                    bVarL1111113.f17736d.g(eVarK11111111111115, 0.5f);
                    bVarL1111113.f17736d.g(eVarK11111111111117, 0.5f);
                    bVarL1111113.f17736d.g(eVarK11111111111111, -0.5f);
                    bVarL1111113.f17736d.g(eVarK11111111111113, -0.5f);
                    bVarL1111113.f17734b = -((float) (dSin16 * d1117));
                    cVar6.c(bVarL1111113);
                    b bVarL1111114 = cVar6.l();
                    float fCos16 = (float) (Math.cos(d1116) * d1117);
                    bVarL1111114.f17736d.g(eVarK11111111111114, 0.5f);
                    bVarL1111114.f17736d.g(eVarK11111111111116, 0.5f);
                    bVarL1111114.f17736d.g(eVarK11111111111110, -0.5f);
                    bVarL1111114.f17736d.g(eVarK11111111111112, -0.5f);
                    bVarL1111114.f17734b = -fCos16;
                    cVar6.c(bVarL1111114);
                }
                this.j = false;
                this.k = false;
            }
            z13 = false;
            int[] iArr118 = this.f1266s;
            iArr118[0] = i25;
            iArr118[1] = i26;
            if (z13) {
                int i4110 = this.f1273z;
                i27 = -1;
                if (i4110 != 0) {
                }
                if (z13) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                if (iArr[0] == 2) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                if (z15) {
                    i28 = 0;
                } else {
                    i28 = i16;
                }
                cVar4 = this.O;
                z16 = !cVar4.h();
                char c115 = '\b';
                boolean z21119 = zArr4[0];
                boolean z211110 = zArr4[1];
                i29 = this.f1259n;
                int[] iArr119 = this.B;
                if (i29 != 2) {
                    r5 = i13;
                    iArr2 = iArr;
                    eVar = eVarK;
                    eVar2 = eVarK2;
                    z17 = z16;
                    eVar3 = eVarK5;
                    z18 = z7;
                    r6 = i14;
                    i30 = i25;
                    cVar5 = cVar2;
                    i31 = i26;
                } else {
                    r5 = i13;
                    iArr2 = iArr;
                    eVar = eVarK;
                    eVar2 = eVarK2;
                    z17 = z16;
                    eVar3 = eVarK5;
                    z18 = z7;
                    r6 = i14;
                    i30 = i25;
                    cVar5 = cVar2;
                    i31 = i26;
                }
                if (z5) {
                    eVar4 = r33;
                    eVar5 = eVarK4;
                    eVar6 = eVar3;
                    i32 = 0;
                    i33 = 8;
                    z19 = true;
                    i34 = 1;
                } else {
                    eVar4 = r33;
                    eVar5 = eVarK4;
                    eVar6 = eVar3;
                    i32 = 0;
                    i33 = 8;
                    z19 = true;
                    i34 = 1;
                }
                if (this.f1261o == 2) {
                    i34 = i32;
                }
                if (i34 != 0) {
                    eVar7 = eVar4;
                } else {
                    eVar7 = eVar4;
                }
                if (z13) {
                    if (this.f1273z == 1) {
                        float f11112 = this.A;
                        b bVarL1111115 = cVar6.l();
                        bVarL1111115.f17736d.g(eVar5, -1.0f);
                        bVarL1111115.f17736d.g(eVar7, 1.0f);
                        bVarL1111115.f17736d.g(eVar2, f11112);
                        bVarL1111115.f17736d.g(eVar, -f11112);
                        cVar6.c(bVarL1111115);
                    } else {
                        float f11113 = this.A;
                        b bVarL1111116 = cVar6.l();
                        bVarL1111116.f17736d.g(eVar2, -1.0f);
                        bVarL1111116.f17736d.g(eVar, 1.0f);
                        bVarL1111116.f17736d.g(eVar5, f11113);
                        bVarL1111116.f17736d.g(eVar7, -f11113);
                        cVar6.c(bVarL1111116);
                    }
                }
                if (cVar4.h()) {
                    ConstraintWidget constraintWidget115 = cVar4.f19148f.f19146d;
                    float radians17 = (float) Math.toRadians(this.C + 90.0f);
                    int iE17 = cVar4.e();
                    e eVarK11111111111118 = cVar6.k(i(2));
                    e eVarK11111111111119 = cVar6.k(i(3));
                    e eVarK111111111111110 = cVar6.k(i(4));
                    e eVarK111111111111111 = cVar6.k(i(5));
                    e eVarK111111111111112 = cVar6.k(constraintWidget115.i(2));
                    e eVarK111111111111113 = cVar6.k(constraintWidget115.i(3));
                    e eVarK111111111111114 = cVar6.k(constraintWidget115.i(4));
                    e eVarK111111111111115 = cVar6.k(constraintWidget115.i(5));
                    b bVarL1111117 = cVar6.l();
                    double d1118 = radians17;
                    double dSin17 = Math.sin(d1118);
                    double d1119 = iE17;
                    bVarL1111117.f17736d.g(eVarK111111111111113, 0.5f);
                    bVarL1111117.f17736d.g(eVarK111111111111115, 0.5f);
                    bVarL1111117.f17736d.g(eVarK11111111111119, -0.5f);
                    bVarL1111117.f17736d.g(eVarK111111111111111, -0.5f);
                    bVarL1111117.f17734b = -((float) (dSin17 * d1119));
                    cVar6.c(bVarL1111117);
                    b bVarL1111118 = cVar6.l();
                    float fCos17 = (float) (Math.cos(d1118) * d1119);
                    bVarL1111118.f17736d.g(eVarK111111111111112, 0.5f);
                    bVarL1111118.f17736d.g(eVarK111111111111114, 0.5f);
                    bVarL1111118.f17736d.g(eVarK11111111111118, -0.5f);
                    bVarL1111118.f17736d.g(eVarK111111111111110, -0.5f);
                    bVarL1111118.f17734b = -fCos17;
                    cVar6.c(bVarL1111118);
                }
                this.j = false;
                this.k = false;
            }
            i27 = -1;
            if (z13) {
                z14 = false;
            } else {
                z14 = false;
            }
            if (iArr[0] == 2) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (z15) {
                i28 = 0;
            } else {
                i28 = i16;
            }
            cVar4 = this.O;
            z16 = !cVar4.h();
            char c116 = '\b';
            boolean z211111 = zArr4[0];
            boolean z211112 = zArr4[1];
            i29 = this.f1259n;
            int[] iArr1110 = this.B;
            if (i29 != 2) {
                r5 = i13;
                iArr2 = iArr;
                eVar = eVarK;
                eVar2 = eVarK2;
                z17 = z16;
                eVar3 = eVarK5;
                z18 = z7;
                r6 = i14;
                i30 = i25;
                cVar5 = cVar2;
                i31 = i26;
            } else {
                r5 = i13;
                iArr2 = iArr;
                eVar = eVarK;
                eVar2 = eVarK2;
                z17 = z16;
                eVar3 = eVarK5;
                z18 = z7;
                r6 = i14;
                i30 = i25;
                cVar5 = cVar2;
                i31 = i26;
            }
            if (z5) {
                eVar4 = r33;
                eVar5 = eVarK4;
                eVar6 = eVar3;
                i32 = 0;
                i33 = 8;
                z19 = true;
                i34 = 1;
            } else {
                eVar4 = r33;
                eVar5 = eVarK4;
                eVar6 = eVar3;
                i32 = 0;
                i33 = 8;
                z19 = true;
                i34 = 1;
            }
            if (this.f1261o == 2) {
                i34 = i32;
            }
            if (i34 != 0) {
                eVar7 = eVar4;
            } else {
                eVar7 = eVar4;
            }
            if (z13) {
                if (this.f1273z == 1) {
                    float f11114 = this.A;
                    b bVarL1111119 = cVar6.l();
                    bVarL1111119.f17736d.g(eVar5, -1.0f);
                    bVarL1111119.f17736d.g(eVar7, 1.0f);
                    bVarL1111119.f17736d.g(eVar2, f11114);
                    bVarL1111119.f17736d.g(eVar, -f11114);
                    cVar6.c(bVarL1111119);
                } else {
                    float f11115 = this.A;
                    b bVarL11111110 = cVar6.l();
                    bVarL11111110.f17736d.g(eVar2, -1.0f);
                    bVarL11111110.f17736d.g(eVar, 1.0f);
                    bVarL11111110.f17736d.g(eVar5, f11115);
                    bVarL11111110.f17736d.g(eVar7, -f11115);
                    cVar6.c(bVarL11111110);
                }
            }
            if (cVar4.h()) {
                ConstraintWidget constraintWidget116 = cVar4.f19148f.f19146d;
                float radians18 = (float) Math.toRadians(this.C + 90.0f);
                int iE18 = cVar4.e();
                e eVarK111111111111116 = cVar6.k(i(2));
                e eVarK111111111111117 = cVar6.k(i(3));
                e eVarK111111111111118 = cVar6.k(i(4));
                e eVarK111111111111119 = cVar6.k(i(5));
                e eVarK1111111111111110 = cVar6.k(constraintWidget116.i(2));
                e eVarK1111111111111111 = cVar6.k(constraintWidget116.i(3));
                e eVarK1111111111111112 = cVar6.k(constraintWidget116.i(4));
                e eVarK1111111111111113 = cVar6.k(constraintWidget116.i(5));
                b bVarL11111111 = cVar6.l();
                double d11110 = radians18;
                double dSin18 = Math.sin(d11110);
                double d11111 = iE18;
                bVarL11111111.f17736d.g(eVarK1111111111111111, 0.5f);
                bVarL11111111.f17736d.g(eVarK1111111111111113, 0.5f);
                bVarL11111111.f17736d.g(eVarK111111111111117, -0.5f);
                bVarL11111111.f17736d.g(eVarK111111111111119, -0.5f);
                bVarL11111111.f17734b = -((float) (dSin18 * d11111));
                cVar6.c(bVarL11111111);
                b bVarL11111112 = cVar6.l();
                float fCos18 = (float) (Math.cos(d11110) * d11111);
                bVarL11111112.f17736d.g(eVarK1111111111111110, 0.5f);
                bVarL11111112.f17736d.g(eVarK1111111111111112, 0.5f);
                bVarL11111112.f17736d.g(eVarK111111111111116, -0.5f);
                bVarL11111112.f17736d.g(eVarK111111111111118, -0.5f);
                bVarL11111112.f17734b = -fCos18;
                cVar6.c(bVarL11111112);
            }
            this.j = false;
            this.k = false;
        }
        cVar3 = cVar10;
        eVarK4 = eVarK4;
        i24 = i19;
        i25 = i22;
        i26 = i23;
        z13 = false;
        int[] iArr1111 = this.f1266s;
        iArr1111[0] = i25;
        iArr1111[1] = i26;
        if (z13) {
            int i4111 = this.f1273z;
            i27 = -1;
            if (i4111 != 0) {
            }
            if (z13) {
                z14 = false;
            } else {
                z14 = false;
            }
            if (iArr[0] == 2) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (z15) {
                i28 = 0;
            } else {
                i28 = i16;
            }
            cVar4 = this.O;
            z16 = !cVar4.h();
            char c117 = '\b';
            boolean z211113 = zArr4[0];
            boolean z211114 = zArr4[1];
            i29 = this.f1259n;
            int[] iArr1112 = this.B;
            if (i29 != 2) {
                r5 = i13;
                iArr2 = iArr;
                eVar = eVarK;
                eVar2 = eVarK2;
                z17 = z16;
                eVar3 = eVarK5;
                z18 = z7;
                r6 = i14;
                i30 = i25;
                cVar5 = cVar2;
                i31 = i26;
            } else {
                r5 = i13;
                iArr2 = iArr;
                eVar = eVarK;
                eVar2 = eVarK2;
                z17 = z16;
                eVar3 = eVarK5;
                z18 = z7;
                r6 = i14;
                i30 = i25;
                cVar5 = cVar2;
                i31 = i26;
            }
            if (z5) {
                eVar4 = r33;
                eVar5 = eVarK4;
                eVar6 = eVar3;
                i32 = 0;
                i33 = 8;
                z19 = true;
                i34 = 1;
            } else {
                eVar4 = r33;
                eVar5 = eVarK4;
                eVar6 = eVar3;
                i32 = 0;
                i33 = 8;
                z19 = true;
                i34 = 1;
            }
            if (this.f1261o == 2) {
                i34 = i32;
            }
            if (i34 != 0) {
                eVar7 = eVar4;
            } else {
                eVar7 = eVar4;
            }
            if (z13) {
                if (this.f1273z == 1) {
                    float f11116 = this.A;
                    b bVarL11111113 = cVar6.l();
                    bVarL11111113.f17736d.g(eVar5, -1.0f);
                    bVarL11111113.f17736d.g(eVar7, 1.0f);
                    bVarL11111113.f17736d.g(eVar2, f11116);
                    bVarL11111113.f17736d.g(eVar, -f11116);
                    cVar6.c(bVarL11111113);
                } else {
                    float f11117 = this.A;
                    b bVarL11111114 = cVar6.l();
                    bVarL11111114.f17736d.g(eVar2, -1.0f);
                    bVarL11111114.f17736d.g(eVar, 1.0f);
                    bVarL11111114.f17736d.g(eVar5, f11117);
                    bVarL11111114.f17736d.g(eVar7, -f11117);
                    cVar6.c(bVarL11111114);
                }
            }
            if (cVar4.h()) {
                ConstraintWidget constraintWidget117 = cVar4.f19148f.f19146d;
                float radians19 = (float) Math.toRadians(this.C + 90.0f);
                int iE19 = cVar4.e();
                e eVarK1111111111111114 = cVar6.k(i(2));
                e eVarK1111111111111115 = cVar6.k(i(3));
                e eVarK1111111111111116 = cVar6.k(i(4));
                e eVarK1111111111111117 = cVar6.k(i(5));
                e eVarK1111111111111118 = cVar6.k(constraintWidget117.i(2));
                e eVarK1111111111111119 = cVar6.k(constraintWidget117.i(3));
                e eVarK11111111111111110 = cVar6.k(constraintWidget117.i(4));
                e eVarK11111111111111111 = cVar6.k(constraintWidget117.i(5));
                b bVarL11111115 = cVar6.l();
                double d11112 = radians19;
                double dSin19 = Math.sin(d11112);
                double d11113 = iE19;
                bVarL11111115.f17736d.g(eVarK1111111111111119, 0.5f);
                bVarL11111115.f17736d.g(eVarK11111111111111111, 0.5f);
                bVarL11111115.f17736d.g(eVarK1111111111111115, -0.5f);
                bVarL11111115.f17736d.g(eVarK1111111111111117, -0.5f);
                bVarL11111115.f17734b = -((float) (dSin19 * d11113));
                cVar6.c(bVarL11111115);
                b bVarL11111116 = cVar6.l();
                float fCos19 = (float) (Math.cos(d11112) * d11113);
                bVarL11111116.f17736d.g(eVarK1111111111111118, 0.5f);
                bVarL11111116.f17736d.g(eVarK11111111111111110, 0.5f);
                bVarL11111116.f17736d.g(eVarK1111111111111114, -0.5f);
                bVarL11111116.f17736d.g(eVarK1111111111111116, -0.5f);
                bVarL11111116.f17734b = -fCos19;
                cVar6.c(bVarL11111116);
            }
            this.j = false;
            this.k = false;
        }
        i27 = -1;
        if (z13) {
            z14 = false;
        } else {
            z14 = false;
        }
        if (iArr[0] == 2) {
            z15 = false;
        } else {
            z15 = false;
        }
        if (z15) {
            i28 = 0;
        } else {
            i28 = i16;
        }
        cVar4 = this.O;
        z16 = !cVar4.h();
        char c118 = '\b';
        boolean z211115 = zArr4[0];
        boolean z211116 = zArr4[1];
        i29 = this.f1259n;
        int[] iArr1113 = this.B;
        if (i29 != 2) {
            r5 = i13;
            iArr2 = iArr;
            eVar = eVarK;
            eVar2 = eVarK2;
            z17 = z16;
            eVar3 = eVarK5;
            z18 = z7;
            r6 = i14;
            i30 = i25;
            cVar5 = cVar2;
            i31 = i26;
        } else {
            r5 = i13;
            iArr2 = iArr;
            eVar = eVarK;
            eVar2 = eVarK2;
            z17 = z16;
            eVar3 = eVarK5;
            z18 = z7;
            r6 = i14;
            i30 = i25;
            cVar5 = cVar2;
            i31 = i26;
        }
        if (z5) {
            eVar4 = r33;
            eVar5 = eVarK4;
            eVar6 = eVar3;
            i32 = 0;
            i33 = 8;
            z19 = true;
            i34 = 1;
        } else {
            eVar4 = r33;
            eVar5 = eVarK4;
            eVar6 = eVar3;
            i32 = 0;
            i33 = 8;
            z19 = true;
            i34 = 1;
        }
        if (this.f1261o == 2) {
            i34 = i32;
        }
        if (i34 != 0) {
            eVar7 = eVar4;
        } else {
            eVar7 = eVar4;
        }
        if (z13) {
            if (this.f1273z == 1) {
                float f11118 = this.A;
                b bVarL11111117 = cVar6.l();
                bVarL11111117.f17736d.g(eVar5, -1.0f);
                bVarL11111117.f17736d.g(eVar7, 1.0f);
                bVarL11111117.f17736d.g(eVar2, f11118);
                bVarL11111117.f17736d.g(eVar, -f11118);
                cVar6.c(bVarL11111117);
            } else {
                float f11119 = this.A;
                b bVarL11111118 = cVar6.l();
                bVarL11111118.f17736d.g(eVar2, -1.0f);
                bVarL11111118.f17736d.g(eVar, 1.0f);
                bVarL11111118.f17736d.g(eVar5, f11119);
                bVarL11111118.f17736d.g(eVar7, -f11119);
                cVar6.c(bVarL11111118);
            }
        }
        if (cVar4.h()) {
            ConstraintWidget constraintWidget118 = cVar4.f19148f.f19146d;
            float radians110 = (float) Math.toRadians(this.C + 90.0f);
            int iE110 = cVar4.e();
            e eVarK11111111111111112 = cVar6.k(i(2));
            e eVarK11111111111111113 = cVar6.k(i(3));
            e eVarK11111111111111114 = cVar6.k(i(4));
            e eVarK11111111111111115 = cVar6.k(i(5));
            e eVarK11111111111111116 = cVar6.k(constraintWidget118.i(2));
            e eVarK11111111111111117 = cVar6.k(constraintWidget118.i(3));
            e eVarK11111111111111118 = cVar6.k(constraintWidget118.i(4));
            e eVarK11111111111111119 = cVar6.k(constraintWidget118.i(5));
            b bVarL11111119 = cVar6.l();
            double d11114 = radians110;
            double dSin110 = Math.sin(d11114);
            double d11115 = iE110;
            bVarL11111119.f17736d.g(eVarK11111111111111117, 0.5f);
            bVarL11111119.f17736d.g(eVarK11111111111111119, 0.5f);
            bVarL11111119.f17736d.g(eVarK11111111111111113, -0.5f);
            bVarL11111119.f17736d.g(eVarK11111111111111115, -0.5f);
            bVarL11111119.f17734b = -((float) (dSin110 * d11115));
            cVar6.c(bVarL11111119);
            b bVarL111111110 = cVar6.l();
            float fCos110 = (float) (Math.cos(d11114) * d11115);
            bVarL111111110.f17736d.g(eVarK11111111111111116, 0.5f);
            bVarL111111110.f17736d.g(eVarK11111111111111118, 0.5f);
            bVarL111111110.f17736d.g(eVarK11111111111111112, -0.5f);
            bVarL111111110.f17736d.g(eVarK11111111111111114, -0.5f);
            bVarL111111110.f17734b = -fCos110;
            cVar6.c(bVarL111111110);
        }
        this.j = false;
        this.k = false;
    }

    public boolean c() {
        return this.f1247f0 != 8;
    }

    /* JADX WARN: Code duplicated, block: B:220:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:222:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:229:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:231:0x0402  */
    /* JADX WARN: Code duplicated, block: B:240:0x041f  */
    /* JADX WARN: Code duplicated, block: B:257:0x0452  */
    /* JADX WARN: Code duplicated, block: B:259:0x0458  */
    /* JADX WARN: Code duplicated, block: B:270:0x046d  */
    /* JADX WARN: Code duplicated, block: B:275:0x0477  */
    /* JADX WARN: Code duplicated, block: B:277:0x047b  */
    /* JADX WARN: Code duplicated, block: B:278:0x047d  */
    /* JADX WARN: Code duplicated, block: B:281:0x0485  */
    /* JADX WARN: Code duplicated, block: B:287:0x0493 A[PHI: r3
      0x0493: PHI (r3v17 int) = (r3v16 int), (r3v21 int), (r3v21 int), (r3v21 int) binds: [B:280:0x0483, B:282:0x0489, B:283:0x048b, B:285:0x048f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:290:0x04a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:291:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:292:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:294:0x04af  */
    /* JADX WARN: Code duplicated, block: B:303:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:337:0x0521  */
    public final void d(p0.c cVar, boolean z5, boolean z6, boolean z7, boolean z10, e eVar, e eVar2, int i7, boolean z11, c cVar2, c cVar3, int i10, int i11, int i12, int i13, float f2, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i14, int i15, int i16, int i17, float f7, boolean z17) {
        boolean z18;
        boolean z19;
        int iMin;
        boolean z20;
        int i18;
        int i19;
        boolean z21;
        e eVarK;
        e eVarK2;
        c cVar4;
        e eVar3;
        int i20;
        int i21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        ConstraintWidget constraintWidget;
        boolean z26;
        int iMin2;
        boolean z27;
        int i22;
        int iE;
        int i23;
        int i24;
        HashSet hashSet;
        boolean z28;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z29;
        boolean z30;
        int i30;
        cVar = cVar;
        int i31 = i16;
        int i32 = i17;
        e eVarK3 = cVar.k(cVar2);
        e eVarK4 = cVar.k(cVar3);
        e eVarK5 = cVar.k(cVar2.f19148f);
        e eVarK6 = cVar.k(cVar3.f19148f);
        boolean zH = cVar2.h();
        boolean zH2 = cVar3.h();
        boolean zH3 = this.O.h();
        int i33 = zH2 ? (zH ? 1 : 0) + 1 : zH ? 1 : 0;
        if (zH3) {
            i33++;
        }
        int i34 = i33;
        int i35 = z12 ? 3 : i14;
        int iB = f0.e.b(i7);
        boolean z31 = (iB == 0 || iB == 1 || iB != 2 || i35 == 4) ? false : true;
        int i36 = this.f1250h;
        if (i36 == -1 || !z5) {
            i36 = i11;
            z18 = z31;
        } else {
            this.f1250h = -1;
            z18 = false;
        }
        int i37 = this.f1251i;
        if (i37 == -1 || z5) {
            z19 = z18;
        } else {
            this.f1251i = -1;
            i36 = i37;
            z19 = false;
        }
        boolean z32 = z19;
        if (this.f1247f0 == 8) {
            z20 = false;
            iMin = 0;
        } else {
            iMin = i36;
            z20 = z32;
        }
        if (z17) {
            if (!zH && !zH2 && !zH3) {
                cVar.d(eVarK3, i10);
            } else if (zH && !zH2) {
                i18 = 8;
                cVar.e(eVarK3, eVarK5, cVar2.e(), 8);
            }
            i18 = 8;
        } else {
            i18 = 8;
        }
        if (z20 != 0) {
            if (i34 == 2 || z12 || !(i35 == 1 || i35 == 0)) {
                if (i31 == -2) {
                    i31 = iMin;
                }
                if (i32 == -2) {
                    i32 = iMin;
                }
                if (iMin > 0 && i35 != 1) {
                    iMin = 0;
                }
                if (i31 > 0) {
                    cVar.f(eVarK4, eVarK3, i31, 8);
                    iMin = Math.max(iMin, i31);
                }
                if (i32 > 0) {
                    if (!z6 || i35 != 1) {
                        cVar.g(eVarK4, eVarK3, i32, 8);
                    }
                    iMin = Math.min(iMin, i32);
                }
                if (i35 == 1) {
                    if (z6) {
                        cVar.e(eVarK4, eVarK3, iMin, 8);
                    } else if (z14) {
                        cVar.e(eVarK4, eVarK3, iMin, 5);
                        cVar.g(eVarK4, eVarK3, iMin, 8);
                    } else {
                        cVar.e(eVarK4, eVarK3, iMin, 5);
                        cVar.g(eVarK4, eVarK3, iMin, 8);
                    }
                } else if (i35 == 2) {
                    int i38 = cVar2.f19147e;
                    if (i38 == 3 || i38 == 5) {
                        eVarK = cVar.k(this.S.i(3));
                        eVarK2 = cVar.k(this.S.i(5));
                    } else {
                        eVarK = cVar.k(this.S.i(2));
                        eVarK2 = cVar.k(this.S.i(4));
                    }
                    b bVarL = cVar.l();
                    int i39 = i31;
                    bVarL.f17736d.g(eVarK4, -1.0f);
                    bVarL.f17736d.g(eVarK3, 1.0f);
                    bVarL.f17736d.g(eVarK2, f7);
                    bVarL.f17736d.g(eVarK, -f7);
                    cVar.c(bVarL);
                    if (z6) {
                        z20 = false;
                    }
                    z21 = z10;
                    i19 = i39;
                } else {
                    i19 = i31;
                    z21 = true;
                }
            } else {
                int iMax = Math.max(i31, iMin);
                if (i32 > 0) {
                    iMax = Math.min(i32, iMax);
                }
                cVar.e(eVarK4, eVarK3, iMax, 8);
                z21 = z10;
                i19 = i31;
                z20 = false;
            }
            if (z17 || z14) {
                boolean z33 = z21;
                if (i34 >= 2 && z6 && z33) {
                    cVar.f(eVarK3, eVar, 0, 8);
                    c cVar5 = this.L;
                    boolean z34 = z5 || cVar5.f19148f == null;
                    if (!z5 && (cVar4 = cVar5.f19148f) != null) {
                        ConstraintWidget constraintWidget2 = cVar4.f19146d;
                        if (constraintWidget2.V != 0.0f) {
                            int[] iArr = constraintWidget2.f1262o0;
                            if (iArr[0] == 3 && iArr[1] == 3) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                        } else {
                            z34 = false;
                        }
                    }
                    if (z34) {
                        cVar.f(eVar2, eVarK4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (zH || zH2 || zH3) {
                if (zH && !zH2) {
                    cVar3 = cVar3;
                    eVarK4 = eVarK4;
                    z21 = z21;
                    eVar3 = eVarK6;
                    z26 = z6;
                    i30 = (z6 && (cVar2.f19148f.f19146d instanceof a)) ? 8 : 5;
                } else if (zH || !zH2) {
                    eVar3 = eVarK6;
                    if (zH && zH2) {
                        ConstraintWidget constraintWidget3 = cVar2.f19148f.f19146d;
                        ConstraintWidget constraintWidget4 = cVar3.f19148f.f19146d;
                        z21 = z21;
                        ConstraintWidget constraintWidget5 = this.S;
                        int i40 = 6;
                        if (z20) {
                            if (i35 == 0) {
                                if (i32 != 0 || i19 != 0) {
                                    i28 = 5;
                                    i29 = 5;
                                    z29 = true;
                                    z30 = false;
                                    z23 = true;
                                } else if (eVarK5.f17763x && eVar3.f17763x) {
                                    cVar.e(eVarK3, eVarK5, cVar2.e(), 8);
                                    cVar.e(eVarK4, eVar3, -cVar3.e(), 8);
                                    return;
                                } else {
                                    i28 = 8;
                                    i29 = 8;
                                    z29 = false;
                                    z30 = true;
                                    z23 = false;
                                }
                                if ((constraintWidget3 instanceof a) || (constraintWidget4 instanceof a)) {
                                    cVar = cVar;
                                    i35 = i35;
                                    eVarK3 = eVarK3;
                                    eVarK4 = eVarK4;
                                    z24 = z30;
                                    eVar2 = eVar2;
                                    i20 = i28;
                                    eVarK5 = eVarK5;
                                    i40 = 6;
                                    z22 = z29;
                                    i21 = 4;
                                } else {
                                    cVar = cVar;
                                    eVarK3 = eVarK3;
                                    eVarK4 = eVarK4;
                                    z24 = z30;
                                    i20 = i28;
                                    eVarK5 = eVarK5;
                                    i40 = 6;
                                    z22 = z29;
                                    i21 = i29;
                                    i35 = i35;
                                    eVar2 = eVar2;
                                }
                            } else {
                                if (i35 == 2) {
                                    if ((constraintWidget3 instanceof a) || (constraintWidget4 instanceof a)) {
                                        i20 = 5;
                                    } else {
                                        cVar = cVar;
                                        i35 = i35;
                                        eVarK3 = eVarK3;
                                        eVarK4 = eVarK4;
                                        eVarK5 = eVarK5;
                                        i40 = 6;
                                        i20 = 5;
                                        i21 = 5;
                                    }
                                    z22 = true;
                                    z23 = true;
                                    z24 = false;
                                    eVar2 = eVar2;
                                } else if (i35 == 1) {
                                    i20 = 8;
                                } else if (i35 == 3) {
                                    i35 = i35;
                                    if (this.f1273z != -1) {
                                        if (z12) {
                                            if (i15 == 2 || i15 == 1) {
                                                i26 = 5;
                                                i27 = 4;
                                            } else {
                                                i26 = 8;
                                                i27 = 5;
                                            }
                                            i21 = i27;
                                            z22 = true;
                                            z23 = true;
                                            z24 = true;
                                        } else {
                                            if (i32 > 0) {
                                                cVar = cVar;
                                                eVar2 = eVar2;
                                                eVarK3 = eVarK3;
                                                eVarK4 = eVarK4;
                                                eVarK5 = eVarK5;
                                                i40 = 6;
                                                i20 = 5;
                                            } else if (i32 != 0 || i19 != 0) {
                                                cVar = cVar;
                                                eVar2 = eVar2;
                                                eVarK3 = eVarK3;
                                                eVarK4 = eVarK4;
                                                eVarK5 = eVarK5;
                                                i40 = 6;
                                                i20 = 5;
                                                i21 = 4;
                                            } else if (z15) {
                                                i26 = (constraintWidget3 == constraintWidget5 || constraintWidget4 == constraintWidget5) ? 5 : 4;
                                                i21 = 4;
                                                z22 = true;
                                                z23 = true;
                                                z24 = true;
                                            } else {
                                                cVar = cVar;
                                                eVar2 = eVar2;
                                                eVarK3 = eVarK3;
                                                eVarK4 = eVarK4;
                                                eVarK5 = eVarK5;
                                                i40 = 6;
                                                i20 = 5;
                                                i21 = 8;
                                            }
                                            z22 = true;
                                            z23 = true;
                                            z24 = true;
                                        }
                                        i20 = i26;
                                        cVar = cVar;
                                    } else if (z15) {
                                        cVar = cVar;
                                        eVar2 = eVar2;
                                        eVarK3 = eVarK3;
                                        eVarK4 = eVarK4;
                                        eVarK5 = eVarK5;
                                        i20 = 8;
                                        i40 = z6 ? 5 : 4;
                                    } else {
                                        cVar = cVar;
                                        eVar2 = eVar2;
                                        eVarK3 = eVarK3;
                                        eVarK4 = eVarK4;
                                        eVarK5 = eVarK5;
                                        i20 = 8;
                                        i40 = 8;
                                    }
                                    i21 = 5;
                                    z22 = true;
                                    z23 = true;
                                    z24 = true;
                                } else {
                                    i20 = 5;
                                    i21 = 4;
                                    z22 = false;
                                    z23 = false;
                                }
                                i21 = 4;
                                z22 = true;
                                z23 = true;
                                z24 = false;
                                eVar2 = eVar2;
                            }
                            if (z23 || eVarK5 != eVar3 || constraintWidget3 == constraintWidget5) {
                                z25 = true;
                            } else {
                                z23 = false;
                                z25 = false;
                            }
                            if (z22) {
                                if (z20 && !z13 && !z15 && eVarK5 == eVar && eVar3 == eVar2) {
                                    i40 = 8;
                                    z26 = false;
                                    i25 = 8;
                                    z28 = false;
                                } else {
                                    z26 = z6;
                                    z28 = z25;
                                    i25 = i20;
                                }
                                e eVar4 = eVarK5;
                                constraintWidget = constraintWidget4;
                                cVar.b(eVarK3, eVar4, cVar2.e(), f2, eVar3, eVarK4, cVar3.e(), i40);
                                eVarK5 = eVar4;
                                i20 = i25;
                                z25 = z28;
                            } else {
                                constraintWidget = constraintWidget4;
                                z26 = z6;
                            }
                            if (this.f1247f0 != 8 && ((hashSet = cVar3.f19143a) == null || hashSet.size() <= 0)) {
                                return;
                            }
                            if (z23) {
                                if (z26 && eVarK5 != eVar3 && !z20 && ((constraintWidget3 instanceof a) || (constraintWidget instanceof a))) {
                                    i20 = 6;
                                }
                                cVar.f(eVarK3, eVarK5, cVar2.e(), i20);
                                cVar.g(eVarK4, eVar3, -cVar3.e(), i20);
                            }
                            if (z26 || !z16 || (constraintWidget3 instanceof a) || (constraintWidget instanceof a) || constraintWidget == constraintWidget5) {
                                iMin2 = i21;
                                z27 = z25;
                            } else {
                                iMin2 = 6;
                                i20 = 6;
                                z27 = true;
                            }
                            if (z27) {
                                if (z24 && (!z15 || z7)) {
                                    if (constraintWidget3 != constraintWidget5 && constraintWidget != constraintWidget5) {
                                        i40 = iMin2;
                                    }
                                    if ((constraintWidget3 instanceof r0.f) || (constraintWidget instanceof r0.f)) {
                                        i40 = 5;
                                    }
                                    if ((constraintWidget3 instanceof a) || (constraintWidget instanceof a)) {
                                        i40 = 5;
                                    }
                                    if (z15) {
                                        i24 = 5;
                                    } else {
                                        i24 = i40;
                                    }
                                    iMin2 = Math.max(i24, iMin2);
                                }
                                if (z26) {
                                    iMin2 = Math.min(i20, iMin2);
                                    if (z12 || z15 || !(constraintWidget3 == constraintWidget5 || constraintWidget == constraintWidget5)) {
                                        i23 = iMin2;
                                    } else {
                                        i23 = 4;
                                    }
                                } else {
                                    i23 = iMin2;
                                }
                                cVar.e(eVarK3, eVarK5, cVar2.e(), i23);
                                cVar.e(eVarK4, eVar3, -cVar3.e(), i23);
                            }
                            if (z26) {
                                if (eVar == eVarK5) {
                                    iE = cVar2.e();
                                } else {
                                    iE = 0;
                                }
                                if (eVarK5 != eVar) {
                                    cVar.f(eVarK3, eVar, iE, 5);
                                }
                            }
                            if (z26 || !z20 || i12 != 0 || i19 != 0) {
                                i22 = 5;
                            } else if (z20 && i35 == 3) {
                                cVar.f(eVarK4, eVarK3, 0, 8);
                                i22 = 5;
                            } else {
                                i22 = 5;
                                cVar.f(eVarK4, eVarK3, 0, 5);
                            }
                        } else {
                            if (eVarK5.f17763x && eVar3.f17763x) {
                                cVar.b(eVarK3, eVarK5, cVar2.e(), f2, eVar3, eVarK4, cVar3.e(), 8);
                                if (z6 && z21) {
                                    int iE2 = cVar3.f19148f != null ? cVar3.e() : 0;
                                    if (eVar3 != eVar2) {
                                        cVar.f(eVar2, eVarK4, iE2, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            i20 = 5;
                            i21 = 4;
                            z22 = true;
                            z23 = true;
                        }
                        z24 = false;
                        if (z23) {
                            z25 = true;
                        } else {
                            z25 = true;
                        }
                        if (z22) {
                            if (z20) {
                                z26 = z6;
                                z28 = z25;
                                i25 = i20;
                            } else {
                                z26 = z6;
                                z28 = z25;
                                i25 = i20;
                            }
                            e eVar5 = eVarK5;
                            constraintWidget = constraintWidget4;
                            cVar.b(eVarK3, eVar5, cVar2.e(), f2, eVar3, eVarK4, cVar3.e(), i40);
                            eVarK5 = eVar5;
                            i20 = i25;
                            z25 = z28;
                        } else {
                            constraintWidget = constraintWidget4;
                            z26 = z6;
                        }
                        if (this.f1247f0 != 8) {
                        }
                        if (z23) {
                            if (z26) {
                                i20 = 6;
                            }
                            cVar.f(eVarK3, eVarK5, cVar2.e(), i20);
                            cVar.g(eVarK4, eVar3, -cVar3.e(), i20);
                        }
                        if (z26) {
                            iMin2 = i21;
                            z27 = z25;
                        } else {
                            iMin2 = i21;
                            z27 = z25;
                        }
                        if (z27) {
                            if (z24) {
                                if (constraintWidget3 != constraintWidget5) {
                                    i40 = iMin2;
                                }
                                if (constraintWidget3 instanceof r0.f) {
                                    i40 = 5;
                                } else {
                                    i40 = 5;
                                }
                                if (constraintWidget3 instanceof a) {
                                    i40 = 5;
                                } else {
                                    i40 = 5;
                                }
                                if (z15) {
                                    i24 = 5;
                                } else {
                                    i24 = i40;
                                }
                                iMin2 = Math.max(i24, iMin2);
                            }
                            if (z26) {
                                iMin2 = Math.min(i20, iMin2);
                                if (z12) {
                                    i23 = iMin2;
                                } else {
                                    i23 = iMin2;
                                }
                            } else {
                                i23 = iMin2;
                            }
                            cVar.e(eVarK3, eVarK5, cVar2.e(), i23);
                            cVar.e(eVarK4, eVar3, -cVar3.e(), i23);
                        }
                        if (z26) {
                            if (eVar == eVarK5) {
                                iE = cVar2.e();
                            } else {
                                iE = 0;
                            }
                            if (eVarK5 != eVar) {
                                cVar.f(eVarK3, eVar, iE, 5);
                            }
                        }
                        if (z26) {
                            i22 = 5;
                        } else {
                            i22 = 5;
                        }
                    }
                    i30 = i22;
                } else {
                    eVar3 = eVarK6;
                    cVar.e(eVarK4, eVar3, -cVar3.e(), 8);
                    if (z6) {
                        cVar.f(eVarK3, eVar, 0, 5);
                        cVar3 = cVar3;
                        i22 = 5;
                        eVarK4 = eVarK4;
                        z21 = z21;
                    }
                    z26 = z6;
                    i30 = i22;
                }
                if (z26 || !z21) {
                    return;
                }
                int iE3 = cVar3.f19148f != null ? cVar3.e() : 0;
                if (eVar3 != eVar2) {
                    cVar.f(eVar2, eVarK4, iE3, i30);
                    return;
                }
                return;
            }
            eVar3 = eVarK6;
            i22 = 5;
            z26 = z6;
            i30 = i22;
            if (z26) {
                return;
            } else {
                return;
            }
        }
        if (z11) {
            cVar.e(eVarK4, eVarK3, 0, 3);
            if (i12 > 0) {
                cVar.f(eVarK4, eVarK3, i12, i18);
            }
            if (i13 < Integer.MAX_VALUE) {
                cVar.g(eVarK4, eVarK3, i13, i18);
            }
        } else {
            cVar.e(eVarK4, eVarK3, iMin, i18);
        }
        z21 = z10;
        i19 = i31;
        if (z17) {
        }
        boolean z35 = z21;
        if (i34 >= 2) {
        }
    }

    public final void e(int i7, ConstraintWidget constraintWidget, int i10, int i11) {
        boolean z5;
        if (i7 == 7) {
            if (i10 != 7) {
                if (i10 == 2 || i10 == 4) {
                    e(2, constraintWidget, i10, 0);
                    e(4, constraintWidget, i10, 0);
                    i(7).a(constraintWidget.i(i10), 0);
                    return;
                } else {
                    if (i10 == 3 || i10 == 5) {
                        e(3, constraintWidget, i10, 0);
                        e(5, constraintWidget, i10, 0);
                        i(7).a(constraintWidget.i(i10), 0);
                        return;
                    }
                    return;
                }
            }
            c cVarI = i(2);
            c cVarI2 = i(4);
            c cVarI3 = i(3);
            c cVarI4 = i(5);
            boolean z6 = true;
            if ((cVarI == null || !cVarI.h()) && (cVarI2 == null || !cVarI2.h())) {
                e(2, constraintWidget, 2, 0);
                e(4, constraintWidget, 4, 0);
                z5 = true;
            } else {
                z5 = false;
            }
            if ((cVarI3 == null || !cVarI3.h()) && (cVarI4 == null || !cVarI4.h())) {
                e(3, constraintWidget, 3, 0);
                e(5, constraintWidget, 5, 0);
            } else {
                z6 = false;
            }
            if (z5 && z6) {
                i(7).a(constraintWidget.i(7), 0);
                return;
            } else if (z5) {
                i(8).a(constraintWidget.i(8), 0);
                return;
            } else {
                if (z6) {
                    i(9).a(constraintWidget.i(9), 0);
                    return;
                }
                return;
            }
        }
        if (i7 == 8 && (i10 == 2 || i10 == 4)) {
            c cVarI5 = i(2);
            c cVarI6 = constraintWidget.i(i10);
            c cVarI7 = i(4);
            cVarI5.a(cVarI6, 0);
            cVarI7.a(cVarI6, 0);
            i(8).a(cVarI6, 0);
            return;
        }
        if (i7 == 9 && (i10 == 3 || i10 == 5)) {
            c cVarI8 = constraintWidget.i(i10);
            i(3).a(cVarI8, 0);
            i(5).a(cVarI8, 0);
            i(9).a(cVarI8, 0);
            return;
        }
        if (i7 == 8 && i10 == 8) {
            i(2).a(constraintWidget.i(2), 0);
            i(4).a(constraintWidget.i(4), 0);
            i(8).a(constraintWidget.i(i10), 0);
            return;
        }
        if (i7 == 9 && i10 == 9) {
            i(3).a(constraintWidget.i(3), 0);
            i(5).a(constraintWidget.i(5), 0);
            i(9).a(constraintWidget.i(i10), 0);
            return;
        }
        c cVarI9 = i(i7);
        c cVarI10 = constraintWidget.i(i10);
        if (cVarI9.i(cVarI10)) {
            if (i7 == 6) {
                c cVarI11 = i(3);
                c cVarI12 = i(5);
                if (cVarI11 != null) {
                    cVarI11.j();
                }
                if (cVarI12 != null) {
                    cVarI12.j();
                }
            } else if (i7 == 3 || i7 == 5) {
                c cVarI13 = i(6);
                if (cVarI13 != null) {
                    cVarI13.j();
                }
                c cVarI14 = i(7);
                if (cVarI14.f19148f != cVarI10) {
                    cVarI14.j();
                }
                c cVarF = i(i7).f();
                c cVarI15 = i(9);
                if (cVarI15.h()) {
                    cVarF.j();
                    cVarI15.j();
                }
            } else if (i7 == 2 || i7 == 4) {
                c cVarI16 = i(7);
                if (cVarI16.f19148f != cVarI10) {
                    cVarI16.j();
                }
                c cVarF2 = i(i7).f();
                c cVarI17 = i(8);
                if (cVarI17.h()) {
                    cVarF2.j();
                    cVarI17.j();
                }
            }
            cVarI9.a(cVarI10, i11);
        }
    }

    public final void f(c cVar, c cVar2, int i7) {
        if (cVar.f19146d == this) {
            e(cVar.f19147e, cVar2.f19146d, cVar2.f19147e, i7);
        }
    }

    public final void g(p0.c cVar) {
        cVar.k(this.H);
        cVar.k(this.I);
        cVar.k(this.J);
        cVar.k(this.K);
        if (this.Z > 0) {
            cVar.k(this.L);
        }
    }

    public final void h() {
        if (this.f1242d == null) {
            m mVar = new m(this);
            mVar.f19699h.f19675e = 4;
            mVar.f19700i.f19675e = 5;
            mVar.f19697f = 0;
            this.f1242d = mVar;
        }
        if (this.f1244e == null) {
            o oVar = new o(this);
            h hVar = new h(oVar);
            oVar.k = hVar;
            oVar.f19685l = null;
            oVar.f19699h.f19675e = 6;
            oVar.f19700i.f19675e = 7;
            hVar.f19675e = 8;
            oVar.f19697f = 1;
            this.f1244e = oVar;
        }
    }

    public c i(int i7) {
        switch (f0.e.b(i7)) {
            case 0:
                return null;
            case 1:
                return this.H;
            case 2:
                return this.I;
            case 3:
                return this.J;
            case 4:
                return this.K;
            case 5:
                return this.L;
            case 6:
                return this.O;
            case 7:
                return this.M;
            case 8:
                return this.N;
            default:
                throw new AssertionError(kk.b.w(i7));
        }
    }

    public final int j(int i7) {
        int[] iArr = this.f1262o0;
        if (i7 == 0) {
            return iArr[0];
        }
        if (i7 == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.f1247f0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final ConstraintWidget l(int i7) {
        c cVar;
        c cVar2;
        if (i7 != 0) {
            if (i7 == 1 && (cVar2 = (cVar = this.K).f19148f) != null && cVar2.f19148f == cVar) {
                return cVar2.f19146d;
            }
            return null;
        }
        c cVar3 = this.J;
        c cVar4 = cVar3.f19148f;
        if (cVar4 == null || cVar4.f19148f != cVar3) {
            return null;
        }
        return cVar4.f19146d;
    }

    public final ConstraintWidget m(int i7) {
        c cVar;
        c cVar2;
        if (i7 != 0) {
            if (i7 == 1 && (cVar2 = (cVar = this.I).f19148f) != null && cVar2.f19148f == cVar) {
                return cVar2.f19146d;
            }
            return null;
        }
        c cVar3 = this.H;
        c cVar4 = cVar3.f19148f;
        if (cVar4 == null || cVar4.f19148f != cVar3) {
            return null;
        }
        return cVar4.f19146d;
    }

    public final int n() {
        if (this.f1247f0 == 8) {
            return 0;
        }
        return this.T;
    }

    public final int o() {
        ConstraintWidget constraintWidget = this.S;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.X : ((ConstraintWidgetContainer) constraintWidget).f1281w0 + this.X;
    }

    public final int p() {
        ConstraintWidget constraintWidget = this.S;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.Y : ((ConstraintWidgetContainer) constraintWidget).f1282x0 + this.Y;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x003b A[RETURN] */
    public final boolean q(int i7) {
        if (i7 == 0) {
            if ((this.H.f19148f != null ? 1 : 0) + (this.J.f19148f != null ? 1 : 0) < 2) {
                return true;
            }
            return false;
        }
        if ((this.I.f19148f != null ? 1 : 0) + (this.K.f19148f != null ? 1 : 0) + (this.L.f19148f != null ? 1 : 0) < 2) {
            return true;
        }
        return false;
    }

    public final boolean r(int i7, int i10) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        if (i7 == 0) {
            c cVar5 = this.H;
            c cVar6 = cVar5.f19148f;
            if (cVar6 == null || !cVar6.f19145c || (cVar4 = (cVar3 = this.J).f19148f) == null || !cVar4.f19145c) {
                return false;
            }
            return (cVar4.d() - cVar3.e()) - (cVar5.e() + cVar5.f19148f.d()) >= i10;
        }
        c cVar7 = this.I;
        c cVar8 = cVar7.f19148f;
        if (cVar8 == null || !cVar8.f19145c || (cVar2 = (cVar = this.K).f19148f) == null || !cVar2.f19145c) {
            return false;
        }
        return (cVar2.d() - cVar.e()) - (cVar7.e() + cVar7.f19148f.d()) >= i10;
    }

    public final void s(int i7, int i10, int i11, int i12, ConstraintWidget constraintWidget) {
        i(i7).b(constraintWidget.i(i10), i11, i12, true);
    }

    public final boolean t(int i7) {
        c cVar;
        c cVar2;
        int i10 = i7 * 2;
        c[] cVarArr = this.P;
        c cVar3 = cVarArr[i10];
        c cVar4 = cVar3.f19148f;
        return (cVar4 == null || cVar4.f19148f == cVar3 || (cVar2 = (cVar = cVarArr[i10 + 1]).f19148f) == null || cVar2.f19148f != cVar) ? false : true;
    }

    public String toString() {
        StringBuilder sbN = kk.b.n("");
        sbN.append(this.f1249g0 != null ? com.discord.chat.presentation.list.a.k(new StringBuilder("id: "), this.f1249g0, " ") : "");
        sbN.append("(");
        sbN.append(this.X);
        sbN.append(", ");
        sbN.append(this.Y);
        sbN.append(") - (");
        sbN.append(this.T);
        sbN.append(" x ");
        return kk.b.l(sbN, this.U, ")");
    }

    public final boolean u() {
        c cVar = this.H;
        c cVar2 = cVar.f19148f;
        if (cVar2 != null && cVar2.f19148f == cVar) {
            return true;
        }
        c cVar3 = this.J;
        c cVar4 = cVar3.f19148f;
        return cVar4 != null && cVar4.f19148f == cVar3;
    }

    public final boolean v() {
        c cVar = this.I;
        c cVar2 = cVar.f19148f;
        if (cVar2 != null && cVar2.f19148f == cVar) {
            return true;
        }
        c cVar3 = this.K;
        c cVar4 = cVar3.f19148f;
        return cVar4 != null && cVar4.f19148f == cVar3;
    }

    public final boolean w() {
        return this.f1248g && this.f1247f0 != 8;
    }

    public boolean x() {
        if (this.j) {
            return true;
        }
        return this.H.f19145c && this.J.f19145c;
    }

    public boolean y() {
        if (this.k) {
            return true;
        }
        return this.I.f19145c && this.K.f19145c;
    }

    public void z() {
        this.H.j();
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.S = null;
        this.C = 0.0f;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.f1239b0 = 0;
        this.f1241c0 = 0.5f;
        this.f1243d0 = 0.5f;
        int[] iArr = this.f1262o0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f1245e0 = null;
        this.f1247f0 = 0;
        this.h0 = 0;
        this.f1252i0 = 0;
        float[] fArr = this.f1253j0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f1259n = -1;
        this.f1261o = -1;
        int[] iArr2 = this.B;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f1264q = 0;
        this.f1265r = 0;
        this.f1269v = 1.0f;
        this.f1272y = 1.0f;
        this.f1268u = Integer.MAX_VALUE;
        this.f1271x = Integer.MAX_VALUE;
        this.f1267t = 0;
        this.f1270w = 0;
        this.f1273z = -1;
        this.A = 1.0f;
        boolean[] zArr = this.f1246f;
        zArr[0] = true;
        zArr[1] = true;
        this.E = false;
        boolean[] zArr2 = this.R;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f1248g = true;
        int[] iArr3 = this.f1266s;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f1250h = -1;
        this.f1251i = -1;
    }
}
