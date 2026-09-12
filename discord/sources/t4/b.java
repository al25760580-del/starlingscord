package t4;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.core.view.e1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l4.d0;
import l4.v;
import o4.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements n4.e, o4.a, q4.f {
    public float A;
    public BlurMaskFilter B;
    public m4.a C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f20593a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f20594b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f20595c = new Matrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m4.a f20596d = new m4.a(1, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m4.a f20597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m4.a f20598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m4.a f20599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m4.a f20600h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RectF f20601i;
    public final RectF j;
    public final RectF k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f20602l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RectF f20603m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Matrix f20604n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final v f20605o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f20606p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n8.f f20607q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o4.i f20608r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b f20609s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b f20610t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List f20611u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f20612v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final q f20613w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f20614x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f20615y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public m4.a f20616z;

    public b(v vVar, e eVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f20597e = new m4.a(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f20598f = new m4.a(mode2);
        m4.a aVar = new m4.a(1, 0);
        this.f20599g = aVar;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        m4.a aVar2 = new m4.a();
        aVar2.setXfermode(new PorterDuffXfermode(mode3));
        this.f20600h = aVar2;
        this.f20601i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.f20602l = new RectF();
        this.f20603m = new RectF();
        this.f20604n = new Matrix();
        this.f20612v = new ArrayList();
        this.f20614x = true;
        this.A = 0.0f;
        this.f20605o = vVar;
        this.f20606p = eVar;
        List list = eVar.f20624h;
        if (eVar.f20635u == 3) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        r4.d dVar = eVar.f20625i;
        dVar.getClass();
        q qVar = new q(dVar);
        this.f20613w = qVar;
        qVar.b(this);
        if (list != null && !list.isEmpty()) {
            n8.f fVar = new n8.f(list);
            this.f20607q = fVar;
            Iterator it = ((ArrayList) fVar.f16510e).iterator();
            while (it.hasNext()) {
                ((o4.e) it.next()).a(this);
            }
            for (o4.e eVar2 : (ArrayList) this.f20607q.f16512v) {
                e(eVar2);
                eVar2.a(this);
            }
        }
        e eVar3 = this.f20606p;
        if (eVar3.f20634t.isEmpty()) {
            if (true != this.f20614x) {
                this.f20614x = true;
                this.f20605o.invalidateSelf();
                return;
            }
            return;
        }
        o4.i iVar = new o4.i(eVar3.f20634t);
        this.f20608r = iVar;
        iVar.f17121b = true;
        iVar.a(new o4.a() { // from class: t4.a
            @Override // o4.a
            public final void a() {
                b bVar = this.f20592a;
                boolean z5 = bVar.f20608r.k() == 1.0f;
                if (z5 != bVar.f20614x) {
                    bVar.f20614x = z5;
                    bVar.f20605o.invalidateSelf();
                }
            }
        });
        boolean z5 = ((Float) this.f20608r.e()).floatValue() == 1.0f;
        if (z5 != this.f20614x) {
            this.f20614x = z5;
            this.f20605o.invalidateSelf();
        }
        e(this.f20608r);
    }

    @Override // o4.a
    public final void a() {
        this.f20605o.invalidateSelf();
    }

    @Override // q4.f
    public final void c(q4.e eVar, int i7, ArrayList arrayList, q4.e eVar2) {
        b bVar = this.f20609s;
        e eVar3 = this.f20606p;
        if (bVar != null) {
            String str = bVar.f20606p.f20619c;
            q4.e eVar4 = new q4.e(eVar2);
            eVar4.f18622a.add(str);
            if (eVar.a(i7, this.f20609s.f20606p.f20619c)) {
                b bVar2 = this.f20609s;
                q4.e eVar5 = new q4.e(eVar4);
                eVar5.f18623b = bVar2;
                arrayList.add(eVar5);
            }
            if (eVar.d(i7, eVar3.f20619c)) {
                this.f20609s.q(eVar, eVar.b(i7, this.f20609s.f20606p.f20619c) + i7, arrayList, eVar4);
            }
        }
        String str2 = eVar3.f20619c;
        String str3 = eVar3.f20619c;
        if (eVar.c(i7, str2)) {
            if (!"__container".equals(str3)) {
                q4.e eVar6 = new q4.e(eVar2);
                eVar6.f18622a.add(str3);
                if (eVar.a(i7, str3)) {
                    q4.e eVar7 = new q4.e(eVar6);
                    eVar7.f18623b = this;
                    arrayList.add(eVar7);
                }
                eVar2 = eVar6;
            }
            if (eVar.d(i7, str3)) {
                q(eVar, eVar.b(i7, str3) + i7, arrayList, eVar2);
            }
        }
    }

    @Override // n4.e
    public void d(RectF rectF, Matrix matrix, boolean z5) {
        this.f20601i.set(0.0f, 0.0f, 0.0f, 0.0f);
        i();
        Matrix matrix2 = this.f20604n;
        matrix2.set(matrix);
        if (z5) {
            List list = this.f20611u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((b) this.f20611u.get(size)).f20613w.e());
                }
            } else {
                b bVar = this.f20610t;
                if (bVar != null) {
                    matrix2.preConcat(bVar.f20613w.e());
                }
            }
        }
        matrix2.preConcat(this.f20613w.e());
    }

    public final void e(o4.e eVar) {
        if (eVar == null) {
            return;
        }
        this.f20612v.add(eVar);
    }

    /* JADX WARN: Code duplicated, block: B:196:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:54:0x0108  */
    /* JADX WARN: Code duplicated, block: B:55:0x010c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // n4.e
    public final void f(Canvas canvas, Matrix matrix, int i7) {
        float f2;
        RectF rectF;
        m4.a aVar;
        b1.a aVar2;
        PorterDuff.Mode mode;
        int i10;
        char c8;
        Integer num;
        if (this.f20614x) {
            e eVar = this.f20606p;
            boolean z5 = eVar.f20636v;
            int i11 = eVar.f20639y;
            if (z5) {
                return;
            }
            i();
            Matrix matrix2 = this.f20594b;
            matrix2.reset();
            matrix2.set(matrix);
            int i12 = 1;
            for (int size = this.f20611u.size() - 1; size >= 0; size--) {
                matrix2.preConcat(((b) this.f20611u.get(size)).f20613w.e());
            }
            q qVar = this.f20613w;
            o4.e eVar2 = qVar.j;
            int iIntValue = (int) ((((i7 / 255.0f) * ((eVar2 == null || (num = (Integer) eVar2.e()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
            if (this.f20609s == null && !n() && i11 == 1) {
                matrix2.preConcat(qVar.e());
                k(canvas, matrix2, iIntValue);
                o();
                return;
            }
            RectF rectF2 = this.f20601i;
            d(rectF2, matrix2, false);
            if (this.f20609s != null && eVar.f20635u != 3) {
                RectF rectF3 = this.f20602l;
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.f20609s.d(rectF3, matrix, true);
                if (!rectF2.intersect(rectF3)) {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            matrix2.preConcat(qVar.e());
            RectF rectF4 = this.k;
            rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
            boolean zN = n();
            n8.f fVar = this.f20607q;
            Path path = this.f20593a;
            int i13 = 2;
            if (zN) {
                int size2 = ((List) fVar.f16511i).size();
                int i14 = 0;
                while (true) {
                    if (i14 < size2) {
                        s4.f fVar2 = (s4.f) ((List) fVar.f16511i).get(i14);
                        Path path2 = (Path) ((o4.e) ((ArrayList) fVar.f16510e).get(i14)).e();
                        if (path2 != null) {
                            path.set(path2);
                            path.transform(matrix2);
                            int iB = f0.e.b(fVar2.f19742a);
                            if (iB == 0) {
                                if (fVar2.f19745d) {
                                }
                                rectF = this.f20603m;
                                path.computeBounds(rectF, false);
                                if (i14 == 0) {
                                    rectF4.set(rectF);
                                } else {
                                    rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                                }
                            } else if (iB != i12) {
                                if (iB != i13) {
                                    if (iB == 3) {
                                    }
                                    rectF = this.f20603m;
                                    path.computeBounds(rectF, false);
                                    if (i14 == 0) {
                                        rectF4.set(rectF);
                                    } else {
                                        rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                                    }
                                } else {
                                    if (fVar2.f19745d) {
                                    }
                                    rectF = this.f20603m;
                                    path.computeBounds(rectF, false);
                                    if (i14 == 0) {
                                        rectF4.set(rectF);
                                    } else {
                                        rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                                    }
                                }
                            }
                        }
                        i14++;
                        size2 = size2;
                        i13 = 2;
                        i12 = 1;
                    } else if (!rectF2.intersect(rectF4)) {
                        f2 = 0.0f;
                        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                        break;
                    }
                    f2 = 0.0f;
                    break;
                }
            } else {
                f2 = 0.0f;
            }
            float width = canvas.getWidth();
            float height = canvas.getHeight();
            RectF rectF5 = this.j;
            rectF5.set(f2, f2, width, height);
            Matrix matrix3 = this.f20595c;
            canvas.getMatrix(matrix3);
            if (!matrix3.isIdentity()) {
                matrix3.invert(matrix3);
                matrix3.mapRect(rectF5);
            }
            if (!rectF2.intersect(rectF5)) {
                rectF2.set(f2, f2, f2, f2);
            }
            if (rectF2.width() >= 1.0f && rectF2.height() >= 1.0f) {
                m4.a aVar3 = this.f20596d;
                aVar3.setAlpha(255);
                int iB2 = f0.e.b(i11);
                if (iB2 == 1) {
                    aVar2 = b1.a.MODULATE;
                } else if (iB2 == 2) {
                    aVar2 = b1.a.SCREEN;
                } else if (iB2 == 3) {
                    aVar2 = b1.a.OVERLAY;
                } else if (iB2 == 4) {
                    aVar2 = b1.a.DARKEN;
                } else if (iB2 != 5) {
                    aVar2 = iB2 != 16 ? null : b1.a.PLUS;
                } else {
                    aVar2 = b1.a.LIGHTEN;
                }
                int i15 = b1.d.f3025a;
                int i16 = Build.VERSION.SDK_INT;
                if (i16 >= 29) {
                    e1.j(aVar3, aVar2 != null ? e1.h(aVar2) : null);
                } else if (aVar2 != null) {
                    switch (b1.b.f3023a[aVar2.ordinal()]) {
                        case 1:
                            mode = PorterDuff.Mode.CLEAR;
                            break;
                        case 2:
                            mode = PorterDuff.Mode.SRC;
                            break;
                        case 3:
                            mode = PorterDuff.Mode.DST;
                            break;
                        case 4:
                            mode = PorterDuff.Mode.SRC_OVER;
                            break;
                        case 5:
                            mode = PorterDuff.Mode.DST_OVER;
                            break;
                        case 6:
                            mode = PorterDuff.Mode.SRC_IN;
                            break;
                        case 7:
                            mode = PorterDuff.Mode.DST_IN;
                            break;
                        case 8:
                            mode = PorterDuff.Mode.SRC_OUT;
                            break;
                        case 9:
                            mode = PorterDuff.Mode.DST_OUT;
                            break;
                        case 10:
                            mode = PorterDuff.Mode.SRC_ATOP;
                            break;
                        case 11:
                            mode = PorterDuff.Mode.DST_ATOP;
                            break;
                        case 12:
                            mode = PorterDuff.Mode.XOR;
                            break;
                        case 13:
                            mode = PorterDuff.Mode.ADD;
                            break;
                        case 14:
                            mode = PorterDuff.Mode.MULTIPLY;
                            break;
                        case 15:
                            mode = PorterDuff.Mode.SCREEN;
                            break;
                        case 16:
                            mode = PorterDuff.Mode.OVERLAY;
                            break;
                        case 17:
                            mode = PorterDuff.Mode.DARKEN;
                            break;
                        case 18:
                            mode = PorterDuff.Mode.LIGHTEN;
                            break;
                        default:
                            mode = null;
                            break;
                    }
                    aVar3.setXfermode(mode != null ? new PorterDuffXfermode(mode) : null);
                } else {
                    aVar3.setXfermode(null);
                }
                hs.c cVar = x4.h.f22636a;
                canvas.saveLayer(rectF2, aVar3);
                if (i11 != 2) {
                    j(canvas);
                    i10 = i16;
                } else {
                    if (this.C == null) {
                        m4.a aVar4 = new m4.a();
                        this.C = aVar4;
                        aVar4.setColor(-1);
                    }
                    i10 = i16;
                    canvas.drawRect(rectF2.left - 1.0f, rectF2.top - 1.0f, rectF2.right + 1.0f, rectF2.bottom + 1.0f, this.C);
                }
                k(canvas, matrix2, iIntValue);
                if (n()) {
                    Paint paint = this.f20597e;
                    canvas.saveLayer(rectF2, paint);
                    if (i10 < 28) {
                        j(canvas);
                    }
                    int i17 = 0;
                    while (true) {
                        List list = (List) fVar.f16511i;
                        ArrayList arrayList = (ArrayList) fVar.f16510e;
                        if (i17 < list.size()) {
                            s4.f fVar3 = (s4.f) list.get(i17);
                            o4.e eVar3 = (o4.e) arrayList.get(i17);
                            o4.e eVar4 = (o4.e) ((ArrayList) fVar.f16512v).get(i17);
                            int i18 = i17;
                            int i19 = fVar3.f19742a;
                            boolean z6 = fVar3.f19745d;
                            int iB3 = f0.e.b(i19);
                            Paint paint2 = this.f20598f;
                            if (iB3 != 0) {
                                if (iB3 == 1) {
                                    if (i18 == 0) {
                                        aVar3.setColor(-16777216);
                                        aVar3.setAlpha(255);
                                        canvas.drawRect(rectF2, aVar3);
                                    }
                                    if (z6) {
                                        hs.c cVar2 = x4.h.f22636a;
                                        canvas.saveLayer(rectF2, paint2);
                                        canvas.drawRect(rectF2, aVar3);
                                        paint2.setAlpha((int) (((Integer) eVar4.e()).intValue() * 2.55f));
                                        path.set((Path) eVar3.e());
                                        path.transform(matrix2);
                                        canvas.drawPath(path, paint2);
                                        canvas.restore();
                                    } else {
                                        path.set((Path) eVar3.e());
                                        path.transform(matrix2);
                                        canvas.drawPath(path, paint2);
                                    }
                                } else if (iB3 != 2) {
                                    if (iB3 == 3) {
                                        if (arrayList.isEmpty()) {
                                            c8 = 4;
                                        } else {
                                            int i20 = 0;
                                            while (true) {
                                                if (i20 < list.size()) {
                                                    c8 = 4;
                                                    if (((s4.f) list.get(i20)).f19742a == 4) {
                                                        i20++;
                                                    }
                                                } else {
                                                    c8 = 4;
                                                    aVar3.setAlpha(255);
                                                    canvas.drawRect(rectF2, aVar3);
                                                }
                                            }
                                        }
                                    }
                                } else if (z6) {
                                    hs.c cVar3 = x4.h.f22636a;
                                    canvas.saveLayer(rectF2, paint);
                                    canvas.drawRect(rectF2, aVar3);
                                    paint2.setAlpha((int) (((Integer) eVar4.e()).intValue() * 2.55f));
                                    path.set((Path) eVar3.e());
                                    path.transform(matrix2);
                                    canvas.drawPath(path, paint2);
                                    canvas.restore();
                                } else {
                                    hs.c cVar4 = x4.h.f22636a;
                                    canvas.saveLayer(rectF2, paint);
                                    path.set((Path) eVar3.e());
                                    path.transform(matrix2);
                                    aVar3.setAlpha((int) (((Integer) eVar4.e()).intValue() * 2.55f));
                                    canvas.drawPath(path, aVar3);
                                    canvas.restore();
                                }
                            } else if (z6) {
                                hs.c cVar5 = x4.h.f22636a;
                                canvas.saveLayer(rectF2, aVar3);
                                canvas.drawRect(rectF2, aVar3);
                                path.set((Path) eVar3.e());
                                path.transform(matrix2);
                                aVar3.setAlpha((int) (((Integer) eVar4.e()).intValue() * 2.55f));
                                canvas.drawPath(path, paint2);
                                canvas.restore();
                            } else {
                                path.set((Path) eVar3.e());
                                path.transform(matrix2);
                                aVar3.setAlpha((int) (((Integer) eVar4.e()).intValue() * 2.55f));
                                canvas.drawPath(path, aVar3);
                            }
                            i17 = i18 + 1;
                        } else {
                            canvas.restore();
                        }
                    }
                }
                if (this.f20609s != null) {
                    canvas.saveLayer(rectF2, this.f20599g);
                    j(canvas);
                    this.f20609s.f(canvas, matrix, iIntValue);
                    canvas.restore();
                }
                canvas.restore();
            }
            if (this.f20615y && (aVar = this.f20616z) != null) {
                aVar.setStyle(Paint.Style.STROKE);
                this.f20616z.setColor(-251901);
                this.f20616z.setStrokeWidth(4.0f);
                canvas.drawRect(rectF2, this.f20616z);
                this.f20616z.setStyle(Paint.Style.FILL);
                this.f20616z.setColor(1357638635);
                canvas.drawRect(rectF2, this.f20616z);
            }
            o();
        }
    }

    @Override // q4.f
    public void h(e4.c cVar, Object obj) {
        this.f20613w.c(cVar, obj);
    }

    public final void i() {
        if (this.f20611u != null) {
            return;
        }
        if (this.f20610t == null) {
            this.f20611u = Collections.EMPTY_LIST;
            return;
        }
        this.f20611u = new ArrayList();
        for (b bVar = this.f20610t; bVar != null; bVar = bVar.f20610t) {
            this.f20611u.add(bVar);
        }
    }

    public final void j(Canvas canvas) {
        RectF rectF = this.f20601i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f20600h);
    }

    public abstract void k(Canvas canvas, Matrix matrix, int i7);

    public op.c l() {
        return this.f20606p.f20637w;
    }

    public e9.b m() {
        return this.f20606p.f20638x;
    }

    public final boolean n() {
        n8.f fVar = this.f20607q;
        return (fVar == null || ((ArrayList) fVar.f16510e).isEmpty()) ? false : true;
    }

    public final void o() {
        d0 d0Var = this.f20605o.f14917d.f14863a;
        String str = this.f20606p.f20619c;
        HashMap map = d0Var.f14831c;
        if (d0Var.f14829a) {
            x4.f fVar = (x4.f) map.get(str);
            if (fVar == null) {
                fVar = new x4.f();
                map.put(str, fVar);
            }
            int i7 = fVar.f22634a + 1;
            fVar.f22634a = i7;
            if (i7 == Integer.MAX_VALUE) {
                fVar.f22634a = i7 / 2;
            }
            if (str.equals("__container")) {
                s.f fVar2 = d0Var.f14830b;
                fVar2.getClass();
                s.a aVar = new s.a(fVar2);
                if (aVar.hasNext()) {
                    aVar.next().getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    public final void p(o4.e eVar) {
        this.f20612v.remove(eVar);
    }

    public void r(boolean z5) {
        if (z5 && this.f20616z == null) {
            this.f20616z = new m4.a();
        }
        this.f20615y = z5;
    }

    public void s(float f2) {
        q qVar = this.f20613w;
        o4.e eVar = qVar.j;
        if (eVar != null) {
            eVar.i(f2);
        }
        o4.e eVar2 = qVar.f17166m;
        if (eVar2 != null) {
            eVar2.i(f2);
        }
        o4.e eVar3 = qVar.f17167n;
        if (eVar3 != null) {
            eVar3.i(f2);
        }
        o4.e eVar4 = qVar.f17161f;
        if (eVar4 != null) {
            eVar4.i(f2);
        }
        o4.e eVar5 = qVar.f17162g;
        if (eVar5 != null) {
            eVar5.i(f2);
        }
        o4.e eVar6 = qVar.f17163h;
        if (eVar6 != null) {
            eVar6.i(f2);
        }
        o4.e eVar7 = qVar.f17164i;
        if (eVar7 != null) {
            eVar7.i(f2);
        }
        o4.i iVar = qVar.k;
        if (iVar != null) {
            iVar.i(f2);
        }
        o4.i iVar2 = qVar.f17165l;
        if (iVar2 != null) {
            iVar2.i(f2);
        }
        int i7 = 0;
        n8.f fVar = this.f20607q;
        if (fVar != null) {
            ArrayList arrayList = (ArrayList) fVar.f16510e;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((o4.e) arrayList.get(i10)).i(f2);
            }
        }
        o4.i iVar3 = this.f20608r;
        if (iVar3 != null) {
            iVar3.i(f2);
        }
        b bVar = this.f20609s;
        if (bVar != null) {
            bVar.s(f2);
        }
        while (true) {
            ArrayList arrayList2 = this.f20612v;
            if (i7 >= arrayList2.size()) {
                return;
            }
            ((o4.e) arrayList2.get(i7)).i(f2);
            i7++;
        }
    }

    @Override // n4.c
    public final void b(List list, List list2) {
    }

    public void q(q4.e eVar, int i7, ArrayList arrayList, q4.e eVar2) {
    }
}
