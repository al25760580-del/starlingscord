package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import n8.f;
import r0.a;
import r0.b;
import r0.e;
import r0.g;
import r0.h;
import s0.c;
import s0.d;
import s0.j;
import s0.p;
import s0.q;

/* JADX INFO: loaded from: classes.dex */
public final class ConstraintWidgetContainer extends ConstraintWidget {
    public b[] A0;
    public b[] B0;
    public int C0;
    public boolean D0;
    public boolean E0;
    public WeakReference F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public final HashSet J0;
    public final s0.b K0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ArrayList f1274p0 = new ArrayList();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final f f1275q0 = new f(this);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final s0.f f1276r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f1277s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public c f1278t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f1279u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final p0.c f1280v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f1281w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f1282x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f1283y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f1284z0;

    public ConstraintWidgetContainer() {
        s0.f fVar = new s0.f();
        fVar.f19664b = true;
        fVar.f19665c = true;
        fVar.f19667e = new ArrayList();
        new ArrayList();
        fVar.f19668f = null;
        fVar.f19669g = new s0.b();
        fVar.f19670h = new ArrayList();
        fVar.f19663a = this;
        fVar.f19666d = this;
        this.f1276r0 = fVar;
        this.f1278t0 = null;
        this.f1279u0 = false;
        this.f1280v0 = new p0.c();
        this.f1283y0 = 0;
        this.f1284z0 = 0;
        this.A0 = new b[4];
        this.B0 = new b[4];
        this.C0 = 257;
        this.D0 = false;
        this.E0 = false;
        this.F0 = null;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = new HashSet();
        this.K0 = new s0.b();
    }

    public static void Q(ConstraintWidget constraintWidget, c cVar, s0.b bVar) {
        int i7;
        int i10;
        if (cVar == null) {
            return;
        }
        int i11 = constraintWidget.f1247f0;
        int[] iArr = constraintWidget.f1266s;
        if (i11 == 8 || (constraintWidget instanceof r0.f) || (constraintWidget instanceof a)) {
            bVar.f19657e = 0;
            bVar.f19658f = 0;
            return;
        }
        int[] iArr2 = constraintWidget.f1262o0;
        bVar.f19653a = iArr2[0];
        bVar.f19654b = iArr2[1];
        bVar.f19655c = constraintWidget.n();
        bVar.f19656d = constraintWidget.k();
        bVar.f19661i = false;
        bVar.j = 0;
        boolean z5 = bVar.f19653a == 3;
        boolean z6 = bVar.f19654b == 3;
        boolean z7 = z5 && constraintWidget.V > 0.0f;
        boolean z10 = z6 && constraintWidget.V > 0.0f;
        if (z5 && constraintWidget.q(0) && constraintWidget.f1264q == 0 && !z7) {
            bVar.f19653a = 2;
            if (z6 && constraintWidget.f1265r == 0) {
                bVar.f19653a = 1;
            }
            z5 = false;
        }
        if (z6 && constraintWidget.q(1) && constraintWidget.f1265r == 0 && !z10) {
            bVar.f19654b = 2;
            if (z5 && constraintWidget.f1264q == 0) {
                bVar.f19654b = 1;
            }
            z6 = false;
        }
        if (constraintWidget.x()) {
            bVar.f19653a = 1;
            z5 = false;
        }
        if (constraintWidget.y()) {
            bVar.f19654b = 1;
            z6 = false;
        }
        if (z7) {
            if (iArr[0] == 4) {
                bVar.f19653a = 1;
            } else if (!z6) {
                if (bVar.f19654b == 1) {
                    i10 = bVar.f19656d;
                } else {
                    bVar.f19653a = 2;
                    ((ConstraintLayout.Measurer) cVar).b(constraintWidget, bVar);
                    i10 = bVar.f19658f;
                }
                bVar.f19653a = 1;
                bVar.f19655c = (int) (constraintWidget.V * i10);
            }
        }
        if (z10) {
            if (iArr[1] == 4) {
                bVar.f19654b = 1;
            } else if (!z5) {
                if (bVar.f19653a == 1) {
                    i7 = bVar.f19655c;
                } else {
                    bVar.f19654b = 2;
                    ((ConstraintLayout.Measurer) cVar).b(constraintWidget, bVar);
                    i7 = bVar.f19657e;
                }
                bVar.f19654b = 1;
                if (constraintWidget.W == -1) {
                    bVar.f19656d = (int) (i7 / constraintWidget.V);
                } else {
                    bVar.f19656d = (int) (constraintWidget.V * i7);
                }
            }
        }
        ((ConstraintLayout.Measurer) cVar).b(constraintWidget, bVar);
        constraintWidget.J(bVar.f19657e);
        constraintWidget.G(bVar.f19658f);
        constraintWidget.D = bVar.f19660h;
        constraintWidget.D(bVar.f19659g);
        bVar.j = 0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void C(f fVar) {
        super.C(fVar);
        int size = this.f1274p0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((ConstraintWidget) this.f1274p0.get(i7)).C(fVar);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void K(boolean z5, boolean z6) {
        super.K(z5, z6);
        int size = this.f1274p0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((ConstraintWidget) this.f1274p0.get(i7)).K(z5, z6);
        }
    }

    public final void M(ConstraintWidget constraintWidget, int i7) {
        if (i7 == 0) {
            int i10 = this.f1283y0 + 1;
            b[] bVarArr = this.B0;
            if (i10 >= bVarArr.length) {
                this.B0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.B0;
            int i11 = this.f1283y0;
            bVarArr2[i11] = new b(constraintWidget, 0, this.f1279u0);
            this.f1283y0 = i11 + 1;
            return;
        }
        if (i7 == 1) {
            int i12 = this.f1284z0 + 1;
            b[] bVarArr3 = this.A0;
            if (i12 >= bVarArr3.length) {
                this.A0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.A0;
            int i13 = this.f1284z0;
            bVarArr4[i13] = new b(constraintWidget, 1, this.f1279u0);
            this.f1284z0 = i13 + 1;
        }
    }

    public final void N(p0.c cVar) {
        ConstraintWidgetContainer constraintWidgetContainer;
        p0.c cVar2;
        boolean zR = R(64);
        b(cVar, zR);
        int size = this.f1274p0.size();
        boolean z5 = false;
        for (int i7 = 0; i7 < size; i7++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.f1274p0.get(i7);
            boolean[] zArr = constraintWidget.R;
            zArr[0] = false;
            zArr[1] = false;
            if (constraintWidget instanceof a) {
                z5 = true;
            }
        }
        if (z5) {
            for (int i10 = 0; i10 < size; i10++) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget) this.f1274p0.get(i10);
                if (constraintWidget2 instanceof a) {
                    a aVar = (a) constraintWidget2;
                    for (int i11 = 0; i11 < aVar.f19185q0; i11++) {
                        ConstraintWidget constraintWidget3 = aVar.f19184p0[i11];
                        if (aVar.f19125s0 || constraintWidget3.c()) {
                            int i12 = aVar.f19124r0;
                            if (i12 == 0 || i12 == 1) {
                                constraintWidget3.R[0] = true;
                            } else if (i12 == 2 || i12 == 3) {
                                constraintWidget3.R[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.J0;
        hashSet.clear();
        for (int i13 = 0; i13 < size; i13++) {
            ConstraintWidget constraintWidget4 = (ConstraintWidget) this.f1274p0.get(i13);
            constraintWidget4.getClass();
            boolean z6 = constraintWidget4 instanceof e;
            if (z6 || (constraintWidget4 instanceof r0.f)) {
                if (z6) {
                    hashSet.add(constraintWidget4);
                } else {
                    constraintWidget4.b(cVar, zR);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                e eVar = (e) ((ConstraintWidget) it.next());
                for (int i14 = 0; i14 < eVar.f19185q0; i14++) {
                    if (hashSet.contains(eVar.f19184p0[i14])) {
                        eVar.b(cVar, zR);
                        hashSet.remove(eVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((ConstraintWidget) it2.next()).b(cVar, zR);
                }
                hashSet.clear();
            }
        }
        if (p0.c.f17738p) {
            HashSet<ConstraintWidget> hashSet2 = new HashSet();
            for (int i15 = 0; i15 < size; i15++) {
                ConstraintWidget constraintWidget5 = (ConstraintWidget) this.f1274p0.get(i15);
                constraintWidget5.getClass();
                if (!(constraintWidget5 instanceof e) && !(constraintWidget5 instanceof r0.f)) {
                    hashSet2.add(constraintWidget5);
                }
            }
            constraintWidgetContainer = this;
            cVar2 = cVar;
            constraintWidgetContainer.a(this, cVar2, hashSet2, this.f1262o0[0] == 2 ? 0 : 1, false);
            for (ConstraintWidget constraintWidget6 : hashSet2) {
                h.b(this, cVar2, constraintWidget6);
                constraintWidget6.b(cVar2, zR);
            }
        } else {
            constraintWidgetContainer = this;
            cVar2 = cVar;
            for (int i16 = 0; i16 < size; i16++) {
                ConstraintWidget constraintWidget7 = (ConstraintWidget) constraintWidgetContainer.f1274p0.get(i16);
                if (constraintWidget7 instanceof ConstraintWidgetContainer) {
                    int[] iArr = constraintWidget7.f1262o0;
                    int i17 = iArr[0];
                    int i18 = iArr[1];
                    if (i17 == 2) {
                        constraintWidget7.H(1);
                    }
                    if (i18 == 2) {
                        constraintWidget7.I(1);
                    }
                    constraintWidget7.b(cVar2, zR);
                    if (i17 == 2) {
                        constraintWidget7.H(i17);
                    }
                    if (i18 == 2) {
                        constraintWidget7.I(i18);
                    }
                } else {
                    h.b(this, cVar2, constraintWidget7);
                    if (!(constraintWidget7 instanceof e) && !(constraintWidget7 instanceof r0.f)) {
                        constraintWidget7.b(cVar2, zR);
                    }
                }
            }
        }
        if (constraintWidgetContainer.f1283y0 > 0) {
            h.a(this, cVar2, null, 0);
        }
        if (constraintWidgetContainer.f1284z0 > 0) {
            h.a(this, cVar2, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009e  */
    public final boolean O(int i7, boolean z5) {
        boolean z6;
        boolean z7;
        s0.f fVar = this.f1276r0;
        ArrayList<q> arrayList = fVar.f19667e;
        ConstraintWidgetContainer constraintWidgetContainer = fVar.f19663a;
        boolean z10 = false;
        int iJ = constraintWidgetContainer.j(0);
        int[] iArr = constraintWidgetContainer.f1262o0;
        int iJ2 = constraintWidgetContainer.j(1);
        int iO = constraintWidgetContainer.o();
        int iP = constraintWidgetContainer.p();
        if (z5 && (iJ == 2 || iJ2 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z7 = z5;
                    break;
                }
                q qVar = (q) it.next();
                if (qVar.f19697f == i7 && !qVar.k()) {
                    z7 = false;
                    break;
                }
            }
            if (i7 == 0) {
                if (z7 && iJ == 2) {
                    constraintWidgetContainer.H(1);
                    constraintWidgetContainer.J(fVar.d(constraintWidgetContainer, 0));
                    constraintWidgetContainer.f1242d.f19696e.d(constraintWidgetContainer.n());
                }
            } else if (z7 && iJ2 == 2) {
                constraintWidgetContainer.I(1);
                constraintWidgetContainer.G(fVar.d(constraintWidgetContainer, 1));
                constraintWidgetContainer.f1244e.f19696e.d(constraintWidgetContainer.k());
            }
        }
        if (i7 == 0) {
            int i10 = iArr[0];
            if (i10 == 1 || i10 == 4) {
                int iN = constraintWidgetContainer.n() + iO;
                constraintWidgetContainer.f1242d.f19700i.d(iN);
                constraintWidgetContainer.f1242d.f19696e.d(iN - iO);
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            int i11 = iArr[1];
            if (i11 == 1 || i11 == 4) {
                int iK = constraintWidgetContainer.k() + iP;
                constraintWidgetContainer.f1244e.f19700i.d(iK);
                constraintWidgetContainer.f1244e.f19696e.d(iK - iP);
                z6 = true;
            } else {
                z6 = false;
            }
        }
        fVar.g();
        for (q qVar2 : arrayList) {
            if (qVar2.f19697f == i7 && (qVar2.f19693b != constraintWidgetContainer || qVar2.f19698g)) {
                qVar2.e();
            }
        }
        for (q qVar3 : arrayList) {
            if (qVar3.f19697f == i7 && (z6 || qVar3.f19693b != constraintWidgetContainer)) {
                if (!qVar3.f19699h.j || !qVar3.f19700i.j || (!(qVar3 instanceof d) && !qVar3.f19696e.j)) {
                    constraintWidgetContainer.H(iJ);
                    constraintWidgetContainer.I(iJ2);
                    return z10;
                }
            }
        }
        z10 = true;
        constraintWidgetContainer.H(iJ);
        constraintWidgetContainer.I(iJ2);
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:227:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:361:0x0616  */
    /* JADX WARN: Code duplicated, block: B:375:0x0645  */
    /* JADX WARN: Code duplicated, block: B:400:0x068e  */
    /* JADX WARN: Code duplicated, block: B:405:0x069f  */
    /* JADX WARN: Code duplicated, block: B:412:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:415:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:417:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:421:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:424:0x06e5 A[Catch: Exception -> 0x06f3, LOOP:12: B:423:0x06e3->B:424:0x06e5, LOOP_END, TryCatch #4 {Exception -> 0x06f3, blocks: (B:422:0x06d7, B:424:0x06e5, B:427:0x06fa), top: B:549:0x06d7 }] */
    /* JADX WARN: Code duplicated, block: B:440:0x072c  */
    /* JADX WARN: Code duplicated, block: B:443:0x0732 A[Catch: Exception -> 0x0722, TryCatch #6 {Exception -> 0x0722, blocks: (B:434:0x071b, B:441:0x072e, B:443:0x0732, B:445:0x0738, B:446:0x0752, B:448:0x0756, B:450:0x075c, B:454:0x0772, B:457:0x077d, B:459:0x0781, B:461:0x0787), top: B:553:0x071b }] */
    /* JADX WARN: Code duplicated, block: B:448:0x0756 A[Catch: Exception -> 0x0722, TryCatch #6 {Exception -> 0x0722, blocks: (B:434:0x071b, B:441:0x072e, B:443:0x0732, B:445:0x0738, B:446:0x0752, B:448:0x0756, B:450:0x075c, B:454:0x0772, B:457:0x077d, B:459:0x0781, B:461:0x0787), top: B:553:0x071b }] */
    /* JADX WARN: Code duplicated, block: B:459:0x0781 A[Catch: Exception -> 0x0722, TryCatch #6 {Exception -> 0x0722, blocks: (B:434:0x071b, B:441:0x072e, B:443:0x0732, B:445:0x0738, B:446:0x0752, B:448:0x0756, B:450:0x075c, B:454:0x0772, B:457:0x077d, B:459:0x0781, B:461:0x0787), top: B:553:0x071b }] */
    /* JADX WARN: Code duplicated, block: B:473:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:479:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:481:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:483:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:485:0x0802  */
    /* JADX WARN: Code duplicated, block: B:488:0x0811  */
    /* JADX WARN: Code duplicated, block: B:490:0x081a A[LOOP:15: B:489:0x0818->B:490:0x081a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:494:0x082e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:499:0x083b A[LOOP:14: B:498:0x0839->B:499:0x083b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:502:0x086f  */
    /* JADX WARN: Code duplicated, block: B:506:0x0881  */
    /* JADX WARN: Code duplicated, block: B:511:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:512:0x08ae  */
    /* JADX WARN: Code duplicated, block: B:515:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:516:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:518:0x08ce  */
    /* JADX WARN: Code duplicated, block: B:520:0x08d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:523:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:526:0x08ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:531:0x0905  */
    /* JADX WARN: Code duplicated, block: B:533:0x0909  */
    /* JADX WARN: Code duplicated, block: B:534:0x090b  */
    /* JADX WARN: Code duplicated, block: B:538:0x091a  */
    /* JADX WARN: Code duplicated, block: B:599:0x06c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0127  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v71 */
    /* JADX WARN: Type inference failed for: r14v72 */
    /* JADX WARN: Type inference failed for: r14v73 */
    /* JADX WARN: Type inference failed for: r14v74 */
    /* JADX WARN: Type inference failed for: r14v75 */
    /* JADX WARN: Type inference failed for: r14v76 */
    /* JADX WARN: Type inference failed for: r14v77 */
    /* JADX WARN: Type inference failed for: r14v78 */
    /* JADX WARN: Type inference failed for: r14v79 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r33v0, types: [androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidgetContainer] */
    /* JADX WARN: Type inference failed for: r5v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v118, types: [int] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v86, types: [int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v69, types: [int] */
    /* JADX WARN: Type inference failed for: r6v83, types: [int] */
    public final void P() {
        ?? r22;
        r0.c cVar;
        int i7;
        boolean z5;
        boolean z6;
        char c8;
        boolean z7;
        int i10;
        boolean zR;
        ?? r13;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        boolean z12;
        boolean[] zArr;
        boolean[] zArr2;
        int i13;
        boolean z13;
        int iMax;
        ?? r5;
        ?? r18;
        boolean z14;
        int iMax2;
        ?? r14;
        boolean z15;
        boolean z16;
        ?? r15;
        ?? r16;
        int i14;
        boolean z17;
        boolean z18;
        boolean z19;
        ?? r17;
        ?? r19;
        int i15;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        boolean zR2;
        int size;
        int i16;
        boolean z20;
        ConstraintWidget constraintWidget;
        boolean z21;
        int i17;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        r0.c cVar2;
        ConstraintWidget constraintWidget2;
        p pVar;
        p pVar2;
        int iB;
        int i18;
        p pVar3;
        p pVar4;
        boolean z22;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i19;
        boolean z23;
        this.X = 0;
        this.Y = 0;
        this.D0 = false;
        this.E0 = false;
        int size2 = this.f1274p0.size();
        int iMax7 = Math.max(0, n());
        int iMax8 = Math.max(0, k());
        int[] iArr = this.f1262o0;
        int i20 = iArr[1];
        int i21 = iArr[0];
        int i22 = this.f1277s0;
        r0.c cVar3 = this.I;
        r0.c cVar4 = this.H;
        if (i22 == 0 && h.c(this.C0, 1)) {
            c cVar5 = this.f1278t0;
            int i23 = iArr[0];
            int i24 = iArr[1];
            B();
            ArrayList arrayList3 = this.f1274p0;
            int size3 = arrayList3.size();
            for (int i25 = 0; i25 < size3; i25++) {
                ((ConstraintWidget) arrayList3.get(i25)).B();
            }
            boolean z24 = this.f1279u0;
            if (i23 == 1) {
                E(0, n());
            } else {
                cVar4.l(0);
                this.X = 0;
            }
            int i26 = 0;
            boolean z25 = false;
            boolean z26 = false;
            while (i26 < size3) {
                int[] iArr2 = iArr;
                ConstraintWidget constraintWidget3 = (ConstraintWidget) arrayList3.get(i26);
                int i27 = i26;
                if (constraintWidget3 instanceof r0.f) {
                    r0.f fVar = (r0.f) constraintWidget3;
                    z23 = z25;
                    if (fVar.f19182t0 == 1) {
                        int i28 = fVar.f19179q0;
                        if (i28 != -1) {
                            fVar.M(i28);
                        } else if (fVar.f19180r0 != -1 && x()) {
                            fVar.M(n() - fVar.f19180r0);
                        } else if (x()) {
                            fVar.M((int) ((fVar.f19178p0 * n()) + 0.5f));
                        }
                        z23 = true;
                    }
                } else {
                    z23 = z25;
                    if ((constraintWidget3 instanceof a) && ((a) constraintWidget3).P() == 0) {
                        z25 = z23;
                        z26 = true;
                    }
                    i26 = i27 + 1;
                    iArr = iArr2;
                }
                z25 = z23;
                i26 = i27 + 1;
                iArr = iArr2;
            }
            r22 = iArr;
            if (z25) {
                for (int i29 = 0; i29 < size3; i29 = i19 + 1) {
                    ConstraintWidget constraintWidget4 = (ConstraintWidget) arrayList3.get(i29);
                    if (constraintWidget4 instanceof r0.f) {
                        r0.f fVar2 = (r0.f) constraintWidget4;
                        i19 = i29;
                        if (fVar2.f19182t0 == 1) {
                            j.c(0, fVar2, cVar5, z24);
                        }
                    } else {
                        i19 = i29;
                    }
                }
            }
            j.c(0, this, cVar5, z24);
            if (z26) {
                for (int i30 = 0; i30 < size3; i30++) {
                    ConstraintWidget constraintWidget5 = (ConstraintWidget) arrayList3.get(i30);
                    if (constraintWidget5 instanceof a) {
                        a aVar = (a) constraintWidget5;
                        if (aVar.P() == 0 && aVar.O()) {
                            j.c(1, aVar, cVar5, z24);
                        }
                    }
                }
            }
            if (i24 == 1) {
                F(0, k());
            } else {
                cVar3.l(0);
                this.Y = 0;
            }
            int i31 = 0;
            boolean z27 = false;
            boolean z28 = false;
            while (i31 < size3) {
                ConstraintWidget constraintWidget6 = (ConstraintWidget) arrayList3.get(i31);
                int i32 = i31;
                if (constraintWidget6 instanceof r0.f) {
                    r0.f fVar3 = (r0.f) constraintWidget6;
                    if (fVar3.f19182t0 == 0) {
                        int i33 = fVar3.f19179q0;
                        if (i33 != -1) {
                            fVar3.M(i33);
                        } else if (fVar3.f19180r0 != -1 && y()) {
                            fVar3.M(k() - fVar3.f19180r0);
                        } else if (y()) {
                            fVar3.M((int) ((fVar3.f19178p0 * k()) + 0.5f));
                        }
                        z27 = true;
                    }
                } else if ((constraintWidget6 instanceof a) && ((a) constraintWidget6).P() == 1) {
                    z28 = true;
                }
                i31 = i32 + 1;
            }
            if (z27) {
                for (int i34 = 0; i34 < size3; i34++) {
                    ConstraintWidget constraintWidget7 = (ConstraintWidget) arrayList3.get(i34);
                    if (constraintWidget7 instanceof r0.f) {
                        r0.f fVar4 = (r0.f) constraintWidget7;
                        if (fVar4.f19182t0 == 0) {
                            j.i(1, fVar4, cVar5);
                        }
                    }
                }
            }
            j.i(0, this, cVar5);
            if (z28) {
                for (int i35 = 0; i35 < size3; i35++) {
                    ConstraintWidget constraintWidget8 = (ConstraintWidget) arrayList3.get(i35);
                    if (constraintWidget8 instanceof a) {
                        a aVar2 = (a) constraintWidget8;
                        if (aVar2.P() == 1 && aVar2.O()) {
                            j.i(1, aVar2, cVar5);
                        }
                    }
                }
            }
            for (int i36 = 0; i36 < size3; i36++) {
                ConstraintWidget constraintWidget9 = (ConstraintWidget) arrayList3.get(i36);
                if (constraintWidget9.w() && j.a(constraintWidget9)) {
                    Q(constraintWidget9, cVar5, j.f19682a);
                    if (!(constraintWidget9 instanceof r0.f)) {
                        j.c(0, constraintWidget9, cVar5, z24);
                        j.i(0, constraintWidget9, cVar5);
                    } else if (((r0.f) constraintWidget9).f19182t0 == 0) {
                        j.i(0, constraintWidget9, cVar5);
                    } else {
                        j.c(0, constraintWidget9, cVar5, z24);
                    }
                }
            }
            for (int i37 = 0; i37 < size2; i37++) {
                ConstraintWidget constraintWidget10 = (ConstraintWidget) this.f1274p0.get(i37);
                if (constraintWidget10.w() && !(constraintWidget10 instanceof r0.f) && !(constraintWidget10 instanceof a) && !(constraintWidget10 instanceof e) && !constraintWidget10.E) {
                    int iJ = constraintWidget10.j(0);
                    int iJ2 = constraintWidget10.j(1);
                    if (iJ != 3 || constraintWidget10.f1264q == 1 || iJ2 != 3 || constraintWidget10.f1265r == 1) {
                        Q(constraintWidget10, this.f1278t0, new s0.b());
                    }
                }
            }
        } else {
            r22 = iArr;
        }
        p0.c cVar6 = this.f1280v0;
        if (size2 > 2 && ((i21 == 2 || i20 == 2) && h.c(this.C0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET))) {
            c cVar7 = this.f1278t0;
            ArrayList arrayList4 = this.f1274p0;
            int size4 = arrayList4.size();
            int i38 = 0;
            while (true) {
                if (i38 >= size4) {
                    cVar = cVar4;
                    int i39 = 0;
                    ArrayList arrayList5 = null;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    ArrayList arrayList9 = null;
                    ArrayList arrayList10 = null;
                    while (i39 < size4) {
                        int i40 = i39;
                        ConstraintWidget constraintWidget11 = (ConstraintWidget) arrayList4.get(i39);
                        ArrayList arrayList11 = arrayList5;
                        ?? r6 = r22[0];
                        ArrayList arrayList12 = arrayList6;
                        ?? r7 = r22[1];
                        ArrayList arrayList13 = arrayList7;
                        int[] iArr3 = constraintWidget11.f1262o0;
                        ArrayList arrayList14 = arrayList8;
                        if (!j.h(r6, r7, iArr3[0], iArr3[1])) {
                            Q(constraintWidget11, cVar7, this.K0);
                        }
                        boolean z29 = constraintWidget11 instanceof r0.f;
                        if (z29) {
                            r0.f fVar5 = (r0.f) constraintWidget11;
                            if (fVar5.f19182t0 == 0) {
                                arrayList7 = arrayList13 == null ? new ArrayList() : arrayList13;
                                arrayList7.add(fVar5);
                            } else {
                                arrayList7 = arrayList13;
                            }
                            z22 = z29;
                            if (fVar5.f19182t0 == 1) {
                                arrayList = arrayList11 == null ? new ArrayList() : arrayList11;
                                arrayList.add(fVar5);
                            } else {
                                arrayList = arrayList11;
                            }
                        } else {
                            z22 = z29;
                            arrayList = arrayList11;
                            arrayList7 = arrayList13;
                        }
                        if (constraintWidget11 instanceof g) {
                            if (constraintWidget11 instanceof a) {
                                a aVar3 = (a) constraintWidget11;
                                if (aVar3.P() == 0) {
                                    arrayList2 = arrayList12 == null ? new ArrayList() : arrayList12;
                                    arrayList2.add(aVar3);
                                } else {
                                    arrayList2 = arrayList12;
                                }
                                if (aVar3.P() == 1) {
                                    ArrayList arrayList15 = arrayList14 == null ? new ArrayList() : arrayList14;
                                    arrayList15.add(aVar3);
                                    arrayList14 = arrayList15;
                                }
                                arrayList6 = arrayList2;
                            } else {
                                arrayList = arrayList;
                                cVar7 = cVar7;
                                g gVar = (g) constraintWidget11;
                                arrayList6 = arrayList12 == null ? new ArrayList() : arrayList12;
                                arrayList6.add(gVar);
                                arrayList8 = arrayList14 == null ? new ArrayList() : arrayList14;
                                arrayList8.add(gVar);
                            }
                            if (constraintWidget11.H.f19148f == null && constraintWidget11.J.f19148f == null && !z22 && !(constraintWidget11 instanceof a)) {
                                if (arrayList9 == null) {
                                    arrayList9 = new ArrayList();
                                }
                                ArrayList arrayList16 = arrayList9;
                                arrayList16.add(constraintWidget11);
                                arrayList9 = arrayList16;
                            }
                            if (constraintWidget11.I.f19148f != null && constraintWidget11.K.f19148f == null && constraintWidget11.L.f19148f == null && !z22 && !(constraintWidget11 instanceof a)) {
                                if (arrayList10 == null) {
                                    arrayList10 = new ArrayList();
                                }
                                ArrayList arrayList17 = arrayList10;
                                arrayList17.add(constraintWidget11);
                                arrayList10 = arrayList17;
                            }
                            i39 = i40 + 1;
                            arrayList5 = arrayList;
                            cVar7 = cVar7;
                        } else {
                            arrayList6 = arrayList12;
                        }
                        arrayList8 = arrayList14;
                        if (constraintWidget11.H.f19148f == null) {
                            if (arrayList9 == null) {
                                arrayList9 = new ArrayList();
                            }
                            ArrayList arrayList18 = arrayList9;
                            arrayList18.add(constraintWidget11);
                            arrayList9 = arrayList18;
                        }
                        if (constraintWidget11.I.f19148f != null) {
                        }
                        i39 = i40 + 1;
                        arrayList5 = arrayList;
                        cVar7 = cVar7;
                    }
                    ArrayList arrayList19 = arrayList5;
                    ArrayList<g> arrayList20 = arrayList6;
                    ArrayList arrayList21 = arrayList7;
                    ArrayList<g> arrayList22 = arrayList8;
                    ArrayList<p> arrayList23 = new ArrayList();
                    if (arrayList19 != null) {
                        Iterator it = arrayList19.iterator();
                        while (it.hasNext()) {
                            j.b((r0.f) it.next(), 0, arrayList23, null);
                        }
                    }
                    p pVar5 = null;
                    int i41 = 0;
                    if (arrayList20 != null) {
                        for (g gVar2 : arrayList20) {
                            p pVarB = j.b(gVar2, i41, arrayList23, pVar5);
                            gVar2.M(i41, arrayList23, pVarB);
                            pVarB.a(arrayList23);
                            pVar5 = null;
                            i41 = 0;
                        }
                    }
                    HashSet hashSet = i(2).f19143a;
                    if (hashSet != null) {
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            j.b(((r0.c) it2.next()).f19146d, 0, arrayList23, null);
                        }
                    }
                    HashSet hashSet2 = i(4).f19143a;
                    if (hashSet2 != null) {
                        Iterator it3 = hashSet2.iterator();
                        while (it3.hasNext()) {
                            j.b(((r0.c) it3.next()).f19146d, 0, arrayList23, null);
                        }
                    }
                    HashSet hashSet3 = i(7).f19143a;
                    if (hashSet3 != null) {
                        Iterator it4 = hashSet3.iterator();
                        while (it4.hasNext()) {
                            j.b(((r0.c) it4.next()).f19146d, 0, arrayList23, null);
                        }
                    }
                    p pVar6 = null;
                    if (arrayList9 != null) {
                        Iterator it5 = arrayList9.iterator();
                        while (it5.hasNext()) {
                            j.b((ConstraintWidget) it5.next(), 0, arrayList23, null);
                        }
                    }
                    if (arrayList21 != null) {
                        Iterator it6 = arrayList21.iterator();
                        while (it6.hasNext()) {
                            j.b((r0.f) it6.next(), 1, arrayList23, null);
                        }
                    }
                    int i42 = 1;
                    if (arrayList22 != null) {
                        for (g gVar3 : arrayList22) {
                            p pVarB2 = j.b(gVar3, i42, arrayList23, pVar6);
                            gVar3.M(i42, arrayList23, pVarB2);
                            pVarB2.a(arrayList23);
                            pVar6 = null;
                            i42 = 1;
                        }
                    }
                    HashSet hashSet4 = i(3).f19143a;
                    if (hashSet4 != null) {
                        Iterator it7 = hashSet4.iterator();
                        while (it7.hasNext()) {
                            j.b(((r0.c) it7.next()).f19146d, 1, arrayList23, null);
                        }
                    }
                    HashSet hashSet5 = i(6).f19143a;
                    if (hashSet5 != null) {
                        Iterator it8 = hashSet5.iterator();
                        while (it8.hasNext()) {
                            j.b(((r0.c) it8.next()).f19146d, 1, arrayList23, null);
                        }
                    }
                    HashSet hashSet6 = i(5).f19143a;
                    if (hashSet6 != null) {
                        Iterator it9 = hashSet6.iterator();
                        while (it9.hasNext()) {
                            j.b(((r0.c) it9.next()).f19146d, 1, arrayList23, null);
                        }
                    }
                    HashSet hashSet7 = i(7).f19143a;
                    if (hashSet7 != null) {
                        Iterator it10 = hashSet7.iterator();
                        while (it10.hasNext()) {
                            j.b(((r0.c) it10.next()).f19146d, 1, arrayList23, null);
                        }
                    }
                    boolean z30 = true;
                    if (arrayList10 != null) {
                        Iterator it11 = arrayList10.iterator();
                        while (it11.hasNext()) {
                            j.b((ConstraintWidget) it11.next(), 1, arrayList23, null);
                        }
                    }
                    int i43 = 0;
                    while (i43 < size4) {
                        ConstraintWidget constraintWidget12 = (ConstraintWidget) arrayList4.get(i43);
                        int[] iArr4 = constraintWidget12.f1262o0;
                        boolean z31 = z30;
                        if (iArr4[0] == 3 && iArr4[z31 ? 1 : 0] == 3) {
                            int i44 = constraintWidget12.f1258m0;
                            int size5 = arrayList23.size();
                            int i45 = 0;
                            while (true) {
                                if (i45 >= size5) {
                                    i18 = i43;
                                    pVar3 = null;
                                    break;
                                }
                                i18 = i43;
                                pVar3 = (p) arrayList23.get(i45);
                                int i46 = size5;
                                if (i44 == pVar3.f19688b) {
                                    break;
                                }
                                i45++;
                                size5 = i46;
                                i43 = i18;
                            }
                            int i47 = constraintWidget12.f1260n0;
                            int size6 = arrayList23.size();
                            int i48 = 0;
                            while (true) {
                                if (i48 >= size6) {
                                    pVar4 = null;
                                    break;
                                }
                                pVar4 = (p) arrayList23.get(i48);
                                int i49 = size6;
                                if (i47 == pVar4.f19688b) {
                                    break;
                                }
                                i48++;
                                size6 = i49;
                            }
                            if (pVar3 != null && pVar4 != null) {
                                pVar3.c(0, pVar4);
                                pVar4.f19689c = 2;
                                arrayList23.remove(pVar3);
                            }
                        } else {
                            i18 = i43;
                        }
                        i43 = i18 + 1;
                        z30 = true;
                    }
                    if (arrayList23.size() <= 1) {
                        break;
                    }
                    int i50 = 0;
                    if (r22[0] == 2) {
                        int i51 = 0;
                        pVar = null;
                        for (p pVar7 : arrayList23) {
                            if (pVar7.f19689c != 1) {
                                int iB2 = pVar7.b(cVar6, i50);
                                if (iB2 > i51) {
                                    pVar = pVar7;
                                    i51 = iB2;
                                }
                                i50 = 0;
                            }
                        }
                        if (pVar != null) {
                            H(1);
                            J(i51);
                        } else {
                            pVar = null;
                        }
                    } else {
                        pVar = null;
                    }
                    if (r22[1] == 2) {
                        int i52 = 0;
                        pVar2 = null;
                        for (p pVar8 : arrayList23) {
                            if (pVar8.f19689c != 0 && (iB = pVar8.b(cVar6, 1)) > i52) {
                                pVar2 = pVar8;
                                i52 = iB;
                            }
                        }
                        if (pVar2 != null) {
                            I(1);
                            G(i52);
                        } else {
                            pVar2 = null;
                        }
                    } else {
                        pVar2 = null;
                    }
                    if (pVar != null || pVar2 != null) {
                        if (i21 == 2) {
                            if (iMax7 >= n() || iMax7 <= 0) {
                                iMax7 = n();
                            } else {
                                J(iMax7);
                                this.D0 = true;
                            }
                        }
                        if (i20 == 2) {
                            if (iMax8 >= k() || iMax8 <= 0) {
                                iMax8 = k();
                            } else {
                                G(iMax8);
                                this.E0 = true;
                            }
                        }
                        i7 = iMax7;
                        z5 = true;
                        break;
                    }
                } else {
                    ConstraintWidget constraintWidget13 = (ConstraintWidget) arrayList4.get(i38);
                    ?? r10 = r22[0];
                    ?? r11 = r22[1];
                    int i53 = i38;
                    int[] iArr5 = constraintWidget13.f1262o0;
                    cVar = cVar4;
                    if (j.h(r10, r11, iArr5[0], iArr5[1]) && !(constraintWidget13 instanceof e)) {
                        i38 = i53 + 1;
                        cVar4 = cVar;
                    }
                }
            }
            if (!R(64) || R(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT)) {
                z6 = true;
            } else {
                z6 = false;
            }
            cVar6.getClass();
            cVar6.f17747g = false;
            if (this.C0 == 0 && z6) {
                c8 = 1;
                cVar6.f17747g = true;
            } else {
                c8 = 1;
            }
            ArrayList arrayList24 = this.f1274p0;
            if (r22[0] != 2 || r22[c8] == 2) {
                z7 = true;
            } else {
                z7 = false;
            }
            this.f1283y0 = 0;
            this.f1284z0 = 0;
            for (i10 = 0; i10 < size2; i10++) {
                constraintWidget2 = (ConstraintWidget) this.f1274p0.get(i10);
                if (constraintWidget2 instanceof ConstraintWidgetContainer) {
                    ((ConstraintWidgetContainer) constraintWidget2).P();
                }
            }
            zR = R(64);
            r13 = z5;
            i11 = 0;
            z10 = true;
            while (z10) {
                i12 = i11 + 1;
                try {
                    cVar6.t();
                    this.f1283y0 = 0;
                    this.f1284z0 = 0;
                    g(cVar6);
                    for (i17 = 0; i17 < size2; i17++) {
                        ((ConstraintWidget) this.f1274p0.get(i17)).g(cVar6);
                    }
                    N(cVar6);
                    try {
                        weakReference = this.F0;
                        if (weakReference != null || weakReference.get() == null) {
                            z11 = z7;
                        } else {
                            z11 = z7;
                            try {
                                cVar6.f(cVar6.k((r0.c) this.F0.get()), cVar6.k(cVar3), 0, 5);
                                this.F0 = null;
                            } catch (Exception e10) {
                                e = e10;
                                z21 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                z12 = z21;
                                zArr = h.f19186a;
                                if (z12) {
                                    zArr[2] = false;
                                    zR2 = R(64);
                                    L(cVar6, zR2);
                                    size = this.f1274p0.size();
                                    i16 = 0;
                                    z20 = false;
                                    while (i16 < size) {
                                        constraintWidget = (ConstraintWidget) this.f1274p0.get(i16);
                                        constraintWidget.L(cVar6, zR2);
                                        boolean[] zArr3 = zArr;
                                        boolean z32 = zR2;
                                        if (constraintWidget.f1250h == -1) {
                                            z20 = true;
                                        } else {
                                            z20 = true;
                                        }
                                        i16++;
                                        zArr = zArr3;
                                        zR2 = z32;
                                        z20 = z20;
                                    }
                                    zArr2 = zArr;
                                    z13 = z20;
                                } else {
                                    zArr2 = zArr;
                                    L(cVar6, zR);
                                    for (i13 = 0; i13 < size2; i13++) {
                                        ((ConstraintWidget) this.f1274p0.get(i13)).L(cVar6, zR);
                                    }
                                    z13 = false;
                                }
                                if (z11) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    for (i15 = 0; i15 < size2; i15++) {
                                        ConstraintWidget constraintWidget14 = (ConstraintWidget) this.f1274p0.get(i15);
                                        iMax3 = Math.max(iMax3, constraintWidget14.n() + constraintWidget14.X);
                                        iMax4 = Math.max(iMax4, constraintWidget14.k() + constraintWidget14.Y);
                                    }
                                    iMax5 = Math.max(this.a0, iMax3);
                                    iMax6 = Math.max(this.f1239b0, iMax4);
                                    r13 = r13;
                                    z13 = z13;
                                    if (i21 == 2) {
                                        r13 = r13;
                                        z13 = z13;
                                        J(iMax5);
                                        r22[0] = 2;
                                        r13 = 1;
                                        z13 = true;
                                    }
                                    if (i20 == 2) {
                                        G(iMax6);
                                        r22[1] = 2;
                                        r13 = 1;
                                        z13 = true;
                                    }
                                }
                                iMax = Math.max(this.a0, n());
                                if (iMax > n()) {
                                    J(iMax);
                                    r5 = 1;
                                    r22[0] = 1;
                                    z14 = true;
                                    r18 = 1;
                                } else {
                                    r5 = 1;
                                    r18 = r13;
                                    z14 = z13;
                                }
                                iMax2 = Math.max(this.f1239b0, k());
                                if (iMax2 > k()) {
                                    G(iMax2);
                                    r22[r5] = r5;
                                    r19 = r5;
                                    z15 = r19 == true ? 1 : 0;
                                } else {
                                    r14 = r18;
                                }
                                if (r14 == 0) {
                                    z15 = z14;
                                    if (r22[0] == 2) {
                                        r17 = r14;
                                        z19 = z15;
                                        if (n() > i7) {
                                            this.D0 = r5;
                                            r22[0] = r5;
                                            J(i7);
                                            ?? r110 = r5;
                                            z19 = r110 == true ? 1 : 0;
                                            r17 = r110;
                                        }
                                    }
                                    r14 = r19;
                                    r17 = r14;
                                    r17 = r14;
                                    z19 = z15;
                                    z19 = z15;
                                    r15 = r17;
                                    r15 = r17;
                                    z16 = z19;
                                    z16 = z19;
                                    if (r22[r5] != 2) {
                                    }
                                    if (i12 > i14) {
                                        r15 = r17;
                                        z16 = z19;
                                        z18 = false;
                                    } else {
                                        r15 = r17;
                                        z16 = z19;
                                        z18 = z17;
                                    }
                                    i11 = i12;
                                    z7 = z11;
                                    cVar3 = cVar3;
                                    r13 = r16;
                                    z10 = z18;
                                } else {
                                    z15 = z14;
                                    r14 = r19;
                                    r15 = r14;
                                    z16 = z15;
                                }
                                r15 = r17;
                                z16 = z19;
                                r16 = r15;
                                i14 = 8;
                                z17 = z16;
                                if (i12 > i14) {
                                    r15 = r17;
                                    z16 = z19;
                                    z18 = false;
                                } else {
                                    r15 = r17;
                                    z16 = z19;
                                    z18 = z17;
                                }
                                i11 = i12;
                                z7 = z11;
                                cVar3 = cVar3;
                                r13 = r16;
                                z10 = z18;
                            }
                        }
                        weakReference2 = this.H0;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            cVar6.f(cVar6.k(this.K), cVar6.k((r0.c) this.H0.get()), 0, 5);
                            this.H0 = null;
                        }
                        weakReference3 = this.G0;
                        if (weakReference3 != null && weakReference3.get() != null) {
                            cVar2 = cVar;
                            try {
                                cVar = cVar2;
                                cVar6.f(cVar6.k((r0.c) this.G0.get()), cVar6.k(cVar2), 0, 5);
                                this.G0 = null;
                            } catch (Exception e11) {
                                e = e11;
                                cVar = cVar2;
                                z21 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                z12 = z21;
                                zArr = h.f19186a;
                                if (z12) {
                                    zArr[2] = false;
                                    zR2 = R(64);
                                    L(cVar6, zR2);
                                    size = this.f1274p0.size();
                                    i16 = 0;
                                    z20 = false;
                                    while (i16 < size) {
                                        constraintWidget = (ConstraintWidget) this.f1274p0.get(i16);
                                        constraintWidget.L(cVar6, zR2);
                                        boolean[] zArr4 = zArr;
                                        boolean z33 = zR2;
                                        if (constraintWidget.f1250h == -1) {
                                            z20 = true;
                                        } else {
                                            z20 = true;
                                        }
                                        i16++;
                                        zArr = zArr4;
                                        zR2 = z33;
                                        z20 = z20;
                                    }
                                    zArr2 = zArr;
                                    z13 = z20;
                                } else {
                                    zArr2 = zArr;
                                    L(cVar6, zR);
                                    while (i13 < size2) {
                                        ((ConstraintWidget) this.f1274p0.get(i13)).L(cVar6, zR);
                                    }
                                    z13 = false;
                                }
                                if (z11) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i15 < size2) {
                                        ConstraintWidget constraintWidget15 = (ConstraintWidget) this.f1274p0.get(i15);
                                        iMax3 = Math.max(iMax3, constraintWidget15.n() + constraintWidget15.X);
                                        iMax4 = Math.max(iMax4, constraintWidget15.k() + constraintWidget15.Y);
                                    }
                                    iMax5 = Math.max(this.a0, iMax3);
                                    iMax6 = Math.max(this.f1239b0, iMax4);
                                    r13 = r13;
                                    z13 = z13;
                                    if (i21 == 2) {
                                        r13 = r13;
                                        z13 = z13;
                                        J(iMax5);
                                        r22[0] = 2;
                                        r13 = 1;
                                        z13 = true;
                                    }
                                    if (i20 == 2) {
                                        G(iMax6);
                                        r22[1] = 2;
                                        r13 = 1;
                                        z13 = true;
                                    }
                                }
                                iMax = Math.max(this.a0, n());
                                if (iMax > n()) {
                                    J(iMax);
                                    r5 = 1;
                                    r22[0] = 1;
                                    z14 = true;
                                    r18 = 1;
                                } else {
                                    r5 = 1;
                                    r18 = r13;
                                    z14 = z13;
                                }
                                iMax2 = Math.max(this.f1239b0, k());
                                if (iMax2 > k()) {
                                    G(iMax2);
                                    r22[r5] = r5;
                                    r19 = r5;
                                    z15 = r19 == true ? 1 : 0;
                                } else {
                                    r14 = r18;
                                }
                                if (r14 == 0) {
                                    z15 = z14;
                                    if (r22[0] == 2) {
                                        r17 = r14;
                                        z19 = z15;
                                        if (n() > i7) {
                                            this.D0 = r5;
                                            r22[0] = r5;
                                            J(i7);
                                            ?? r111 = r5;
                                            z19 = r111 == true ? 1 : 0;
                                            r17 = r111;
                                        }
                                    }
                                    r14 = r19;
                                    r17 = r14;
                                    r17 = r14;
                                    z19 = z15;
                                    z19 = z15;
                                    r15 = r17;
                                    r15 = r17;
                                    z16 = z19;
                                    z16 = z19;
                                    if (r22[r5] != 2) {
                                    }
                                    if (i12 > i14) {
                                        r15 = r17;
                                        z16 = z19;
                                        z18 = false;
                                    } else {
                                        r15 = r17;
                                        z16 = z19;
                                        z18 = z17;
                                    }
                                    i11 = i12;
                                    z7 = z11;
                                    cVar3 = cVar3;
                                    r13 = r16;
                                    z10 = z18;
                                } else {
                                    z15 = z14;
                                    r14 = r19;
                                    r15 = r14;
                                    z16 = z15;
                                }
                                r15 = r17;
                                z16 = z19;
                                r16 = r15;
                                i14 = 8;
                                z17 = z16;
                                if (i12 > i14) {
                                    r15 = r17;
                                    z16 = z19;
                                    z18 = false;
                                } else {
                                    r15 = r17;
                                    z16 = z19;
                                    z18 = z17;
                                }
                                i11 = i12;
                                z7 = z11;
                                cVar3 = cVar3;
                                r13 = r16;
                                z10 = z18;
                            }
                        }
                        weakReference4 = this.I0;
                        if (weakReference4 == null && weakReference4.get() != null) {
                            try {
                                try {
                                    cVar6.f(cVar6.k(this.J), cVar6.k((r0.c) this.I0.get()), 0, 5);
                                    try {
                                        this.I0 = null;
                                    } catch (Exception e12) {
                                        e = e12;
                                        z21 = true;
                                        e.printStackTrace();
                                        System.out.println("EXCEPTION : " + e);
                                        z12 = z21;
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    z21 = true;
                                    e.printStackTrace();
                                    System.out.println("EXCEPTION : " + e);
                                    z12 = z21;
                                    zArr = h.f19186a;
                                    if (z12) {
                                        zArr[2] = false;
                                        zR2 = R(64);
                                        L(cVar6, zR2);
                                        size = this.f1274p0.size();
                                        i16 = 0;
                                        z20 = false;
                                        while (i16 < size) {
                                            constraintWidget = (ConstraintWidget) this.f1274p0.get(i16);
                                            constraintWidget.L(cVar6, zR2);
                                            boolean[] zArr5 = zArr;
                                            boolean z34 = zR2;
                                            if (constraintWidget.f1250h == -1) {
                                                z20 = true;
                                            } else {
                                                z20 = true;
                                            }
                                            i16++;
                                            zArr = zArr5;
                                            zR2 = z34;
                                            z20 = z20;
                                        }
                                        zArr2 = zArr;
                                        z13 = z20;
                                    } else {
                                        zArr2 = zArr;
                                        L(cVar6, zR);
                                        while (i13 < size2) {
                                            ((ConstraintWidget) this.f1274p0.get(i13)).L(cVar6, zR);
                                        }
                                        z13 = false;
                                    }
                                    if (z11) {
                                        iMax3 = 0;
                                        iMax4 = 0;
                                        while (i15 < size2) {
                                            ConstraintWidget constraintWidget16 = (ConstraintWidget) this.f1274p0.get(i15);
                                            iMax3 = Math.max(iMax3, constraintWidget16.n() + constraintWidget16.X);
                                            iMax4 = Math.max(iMax4, constraintWidget16.k() + constraintWidget16.Y);
                                        }
                                        iMax5 = Math.max(this.a0, iMax3);
                                        iMax6 = Math.max(this.f1239b0, iMax4);
                                        r13 = r13;
                                        z13 = z13;
                                        if (i21 == 2) {
                                            r13 = r13;
                                            z13 = z13;
                                            J(iMax5);
                                            r22[0] = 2;
                                            r13 = 1;
                                            z13 = true;
                                        }
                                        if (i20 == 2) {
                                            G(iMax6);
                                            r22[1] = 2;
                                            r13 = 1;
                                            z13 = true;
                                        }
                                    }
                                    iMax = Math.max(this.a0, n());
                                    if (iMax > n()) {
                                        J(iMax);
                                        r5 = 1;
                                        r22[0] = 1;
                                        z14 = true;
                                        r18 = 1;
                                    } else {
                                        r5 = 1;
                                        r18 = r13;
                                        z14 = z13;
                                    }
                                    iMax2 = Math.max(this.f1239b0, k());
                                    if (iMax2 > k()) {
                                        G(iMax2);
                                        r22[r5] = r5;
                                        r19 = r5;
                                        z15 = r19 == true ? 1 : 0;
                                    } else {
                                        r14 = r18;
                                    }
                                    if (r14 == 0) {
                                        z15 = z14;
                                        if (r22[0] == 2) {
                                            r17 = r14;
                                            z19 = z15;
                                            if (n() > i7) {
                                                this.D0 = r5;
                                                r22[0] = r5;
                                                J(i7);
                                                ?? r112 = r5;
                                                z19 = r112 == true ? 1 : 0;
                                                r17 = r112;
                                            }
                                        }
                                        r14 = r19;
                                        r17 = r14;
                                        r17 = r14;
                                        z19 = z15;
                                        z19 = z15;
                                        r15 = r17;
                                        r15 = r17;
                                        z16 = z19;
                                        z16 = z19;
                                        if (r22[r5] != 2) {
                                        }
                                        if (i12 > i14) {
                                            r15 = r17;
                                            z16 = z19;
                                            z18 = false;
                                        } else {
                                            r15 = r17;
                                            z16 = z19;
                                            z18 = z17;
                                        }
                                        i11 = i12;
                                        z7 = z11;
                                        cVar3 = cVar3;
                                        r13 = r16;
                                        z10 = z18;
                                    } else {
                                        z15 = z14;
                                        r14 = r19;
                                        r15 = r14;
                                        z16 = z15;
                                    }
                                    r15 = r17;
                                    z16 = z19;
                                    r16 = r15;
                                    i14 = 8;
                                    z17 = z16;
                                    if (i12 > i14) {
                                        r15 = r17;
                                        z16 = z19;
                                        z18 = false;
                                    } else {
                                        r15 = r17;
                                        z16 = z19;
                                        z18 = z17;
                                    }
                                    i11 = i12;
                                    z7 = z11;
                                    cVar3 = cVar3;
                                    r13 = r16;
                                    z10 = z18;
                                }
                            } catch (Exception e14) {
                                e = e14;
                            }
                        }
                        cVar6.p();
                        z12 = true;
                    } catch (Exception e15) {
                        e = e15;
                        z11 = z7;
                    }
                } catch (Exception e16) {
                    e = e16;
                    z11 = z7;
                    z21 = z10;
                }
                zArr = h.f19186a;
                if (z12) {
                    zArr[2] = false;
                    zR2 = R(64);
                    L(cVar6, zR2);
                    size = this.f1274p0.size();
                    i16 = 0;
                    z20 = false;
                    while (i16 < size) {
                        constraintWidget = (ConstraintWidget) this.f1274p0.get(i16);
                        constraintWidget.L(cVar6, zR2);
                        boolean[] zArr6 = zArr;
                        boolean z35 = zR2;
                        if (constraintWidget.f1250h == -1 || constraintWidget.f1251i != -1) {
                            z20 = true;
                        }
                        i16++;
                        zArr = zArr6;
                        zR2 = z35;
                        z20 = z20;
                    }
                    zArr2 = zArr;
                    z13 = z20;
                } else {
                    zArr2 = zArr;
                    L(cVar6, zR);
                    while (i13 < size2) {
                        ((ConstraintWidget) this.f1274p0.get(i13)).L(cVar6, zR);
                    }
                    z13 = false;
                }
                if (z11 && i12 < 8 && zArr2[2]) {
                    iMax3 = 0;
                    iMax4 = 0;
                    while (i15 < size2) {
                        ConstraintWidget constraintWidget17 = (ConstraintWidget) this.f1274p0.get(i15);
                        iMax3 = Math.max(iMax3, constraintWidget17.n() + constraintWidget17.X);
                        iMax4 = Math.max(iMax4, constraintWidget17.k() + constraintWidget17.Y);
                    }
                    iMax5 = Math.max(this.a0, iMax3);
                    iMax6 = Math.max(this.f1239b0, iMax4);
                    r13 = r13;
                    z13 = z13;
                    if (i21 == 2 && n() < iMax5) {
                        r13 = r13;
                        z13 = z13;
                        J(iMax5);
                        r22[0] = 2;
                        r13 = 1;
                        z13 = true;
                    }
                    if (i20 == 2 && k() < iMax6) {
                        G(iMax6);
                        r22[1] = 2;
                        r13 = 1;
                        z13 = true;
                    }
                }
                iMax = Math.max(this.a0, n());
                if (iMax > n()) {
                    J(iMax);
                    r5 = 1;
                    r22[0] = 1;
                    z14 = true;
                    r18 = 1;
                } else {
                    r5 = 1;
                    r18 = r13;
                    z14 = z13;
                }
                iMax2 = Math.max(this.f1239b0, k());
                if (iMax2 > k()) {
                    G(iMax2);
                    r22[r5] = r5;
                    r19 = r5;
                    z15 = r19 == true ? 1 : 0;
                } else {
                    r14 = r18;
                }
                if (r14 == 0) {
                    z15 = z14;
                    if (r22[0] == 2 && i7 > 0) {
                        r17 = r14;
                        z19 = z15;
                        if (n() > i7) {
                            this.D0 = r5;
                            r22[0] = r5;
                            J(i7);
                            ?? r113 = r5;
                            z19 = r113 == true ? 1 : 0;
                            r17 = r113;
                        }
                    }
                    r14 = r19;
                    r17 = r14;
                    r17 = r14;
                    z19 = z15;
                    z19 = z15;
                    r15 = r17;
                    r15 = r17;
                    z16 = z19;
                    z16 = z19;
                    if (r22[r5] != 2 && iMax8 > 0 && k() > iMax8) {
                        this.E0 = r5;
                        r22[r5] = r5;
                        G(iMax8);
                        i14 = 8;
                        r16 = 1;
                        z17 = true;
                    }
                    if (i12 > i14) {
                        r15 = r17;
                        z16 = z19;
                        z18 = false;
                    } else {
                        r15 = r17;
                        z16 = z19;
                        z18 = z17;
                    }
                    i11 = i12;
                    z7 = z11;
                    cVar3 = cVar3;
                    r13 = r16;
                    z10 = z18;
                } else {
                    z15 = z14;
                    r14 = r19;
                    r15 = r14;
                    z16 = z15;
                }
                r15 = r17;
                z16 = z19;
                r16 = r15;
                i14 = 8;
                z17 = z16;
                if (i12 > i14) {
                    r15 = r17;
                    z16 = z19;
                    z18 = false;
                } else {
                    r15 = r17;
                    z16 = z19;
                    z18 = z17;
                }
                i11 = i12;
                z7 = z11;
                cVar3 = cVar3;
                r13 = r16;
                z10 = z18;
            }
            this.f1274p0 = arrayList24;
            if (r13 != 0) {
                r22[0] = i21;
                r22[1] = i20;
            }
            C(cVar6.f17750l);
        }
        cVar = cVar4;
        i7 = iMax7;
        z5 = false;
        if (R(64)) {
            z6 = true;
        } else {
            z6 = true;
        }
        cVar6.getClass();
        cVar6.f17747g = false;
        if (this.C0 == 0) {
            c8 = 1;
        } else {
            c8 = 1;
        }
        ArrayList arrayList25 = this.f1274p0;
        if (r22[0] != 2) {
            z7 = true;
        } else {
            z7 = true;
        }
        this.f1283y0 = 0;
        this.f1284z0 = 0;
        while (i10 < size2) {
            constraintWidget2 = (ConstraintWidget) this.f1274p0.get(i10);
            if (constraintWidget2 instanceof ConstraintWidgetContainer) {
                ((ConstraintWidgetContainer) constraintWidget2).P();
            }
        }
        zR = R(64);
        r13 = z5;
        i11 = 0;
        z10 = true;
        while (z10) {
            i12 = i11 + 1;
            cVar6.t();
            this.f1283y0 = 0;
            this.f1284z0 = 0;
            g(cVar6);
            while (i17 < size2) {
                ((ConstraintWidget) this.f1274p0.get(i17)).g(cVar6);
            }
            N(cVar6);
            weakReference = this.F0;
            if (weakReference != null) {
                z11 = z7;
                weakReference2 = this.H0;
                if (weakReference2 != null) {
                    cVar6.f(cVar6.k(this.K), cVar6.k((r0.c) this.H0.get()), 0, 5);
                    this.H0 = null;
                }
                weakReference3 = this.G0;
                if (weakReference3 != null) {
                    cVar2 = cVar;
                    cVar = cVar2;
                    cVar6.f(cVar6.k((r0.c) this.G0.get()), cVar6.k(cVar2), 0, 5);
                    this.G0 = null;
                }
                weakReference4 = this.I0;
                if (weakReference4 == null) {
                }
                cVar6.p();
                z12 = true;
            } else {
                z11 = z7;
                weakReference2 = this.H0;
                if (weakReference2 != null) {
                    cVar6.f(cVar6.k(this.K), cVar6.k((r0.c) this.H0.get()), 0, 5);
                    this.H0 = null;
                }
                weakReference3 = this.G0;
                if (weakReference3 != null) {
                    cVar2 = cVar;
                    cVar = cVar2;
                    cVar6.f(cVar6.k((r0.c) this.G0.get()), cVar6.k(cVar2), 0, 5);
                    this.G0 = null;
                }
                weakReference4 = this.I0;
                if (weakReference4 == null) {
                }
                cVar6.p();
                z12 = true;
            }
            zArr = h.f19186a;
            if (z12) {
                zArr[2] = false;
                zR2 = R(64);
                L(cVar6, zR2);
                size = this.f1274p0.size();
                i16 = 0;
                z20 = false;
                while (i16 < size) {
                    constraintWidget = (ConstraintWidget) this.f1274p0.get(i16);
                    constraintWidget.L(cVar6, zR2);
                    boolean[] zArr7 = zArr;
                    boolean z36 = zR2;
                    if (constraintWidget.f1250h == -1) {
                        z20 = true;
                    } else {
                        z20 = true;
                    }
                    i16++;
                    zArr = zArr7;
                    zR2 = z36;
                    z20 = z20;
                }
                zArr2 = zArr;
                z13 = z20;
            } else {
                zArr2 = zArr;
                L(cVar6, zR);
                while (i13 < size2) {
                    ((ConstraintWidget) this.f1274p0.get(i13)).L(cVar6, zR);
                }
                z13 = false;
            }
            if (z11) {
                iMax3 = 0;
                iMax4 = 0;
                while (i15 < size2) {
                    ConstraintWidget constraintWidget18 = (ConstraintWidget) this.f1274p0.get(i15);
                    iMax3 = Math.max(iMax3, constraintWidget18.n() + constraintWidget18.X);
                    iMax4 = Math.max(iMax4, constraintWidget18.k() + constraintWidget18.Y);
                }
                iMax5 = Math.max(this.a0, iMax3);
                iMax6 = Math.max(this.f1239b0, iMax4);
                r13 = r13;
                z13 = z13;
                if (i21 == 2) {
                    r13 = r13;
                    z13 = z13;
                    J(iMax5);
                    r22[0] = 2;
                    r13 = 1;
                    z13 = true;
                }
                if (i20 == 2) {
                    G(iMax6);
                    r22[1] = 2;
                    r13 = 1;
                    z13 = true;
                }
            }
            iMax = Math.max(this.a0, n());
            if (iMax > n()) {
                J(iMax);
                r5 = 1;
                r22[0] = 1;
                z14 = true;
                r18 = 1;
            } else {
                r5 = 1;
                r18 = r13;
                z14 = z13;
            }
            iMax2 = Math.max(this.f1239b0, k());
            if (iMax2 > k()) {
                G(iMax2);
                r22[r5] = r5;
                r19 = r5;
                z15 = r19 == true ? 1 : 0;
            } else {
                r14 = r18;
            }
            if (r14 == 0) {
                z15 = z14;
                if (r22[0] == 2) {
                    r17 = r14;
                    z19 = z15;
                    if (n() > i7) {
                        this.D0 = r5;
                        r22[0] = r5;
                        J(i7);
                        ?? r114 = r5;
                        z19 = r114 == true ? 1 : 0;
                        r17 = r114;
                    }
                }
                r14 = r19;
                r17 = r14;
                r17 = r14;
                z19 = z15;
                z19 = z15;
                r15 = r17;
                r15 = r17;
                z16 = z19;
                z16 = z19;
                if (r22[r5] != 2) {
                }
                if (i12 > i14) {
                    r15 = r17;
                    z16 = z19;
                    z18 = false;
                } else {
                    r15 = r17;
                    z16 = z19;
                    z18 = z17;
                }
                i11 = i12;
                z7 = z11;
                cVar3 = cVar3;
                r13 = r16;
                z10 = z18;
            } else {
                z15 = z14;
                r14 = r19;
                r15 = r14;
                z16 = z15;
            }
            r15 = r17;
            z16 = z19;
            r16 = r15;
            i14 = 8;
            z17 = z16;
            if (i12 > i14) {
                r15 = r17;
                z16 = z19;
                z18 = false;
            } else {
                r15 = r17;
                z16 = z19;
                z18 = z17;
            }
            i11 = i12;
            z7 = z11;
            cVar3 = cVar3;
            r13 = r16;
            z10 = z18;
        }
        this.f1274p0 = arrayList25;
        if (r13 != 0) {
            r22[0] = i21;
            r22[1] = i20;
        }
        C(cVar6.f17750l);
    }

    public final boolean R(int i7) {
        return (this.C0 & i7) == i7;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void z() {
        this.f1280v0.t();
        this.f1281w0 = 0;
        this.f1282x0 = 0;
        this.f1274p0.clear();
        super.z();
    }
}
