package t4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l4.v;
import l4.z;
import o4.r;
import s.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {
    public o4.e D;
    public final ArrayList E;
    public final RectF F;
    public final RectF G;
    public final Paint H;
    public float I;
    public boolean J;

    public c(v vVar, e eVar, List list, l4.i iVar) {
        b bVar;
        b cVar;
        String str;
        super(vVar, eVar);
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Paint();
        this.J = true;
        r4.b bVar2 = eVar.f20633s;
        if (bVar2 != null) {
            o4.i iVarL0 = bVar2.l0();
            this.D = iVarL0;
            e(iVarL0);
            this.D.a(this);
        } else {
            this.D = null;
        }
        k kVar = new k(iVar.j.size());
        int size = list.size() - 1;
        b bVar3 = null;
        while (true) {
            if (size < 0) {
                for (int i7 = 0; i7 < kVar.f(); i7++) {
                    b bVar4 = (b) kVar.b(kVar.d(i7));
                    if (bVar4 != null && (bVar = (b) kVar.b(bVar4.f20606p.f20622f)) != null) {
                        bVar4.f20610t = bVar;
                    }
                }
                return;
            }
            e eVar2 = (e) list.get(size);
            int iB = f0.e.b(eVar2.f20621e);
            if (iB == 0) {
                cVar = new c(vVar, eVar2, (List) iVar.f14865c.get(eVar2.f20623g), iVar);
            } else if (iB == 1) {
                cVar = new d(vVar, eVar2, 1);
            } else if (iB == 2) {
                cVar = new d(vVar, eVar2, 0);
            } else if (iB == 3) {
                cVar = new f(vVar, eVar2);
            } else if (iB == 4) {
                cVar = new g(vVar, eVar2, this, iVar);
            } else if (iB != 5) {
                switch (eVar2.f20621e) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case 4:
                        str = "NULL";
                        break;
                    case 5:
                        str = "SHAPE";
                        break;
                    case 6:
                        str = "TEXT";
                        break;
                    case 7:
                        str = "UNKNOWN";
                        break;
                    default:
                        str = "null";
                        break;
                }
                x4.c.b("Unknown layer type ".concat(str));
                cVar = null;
            } else {
                cVar = new i(vVar, eVar2);
            }
            if (cVar != null) {
                kVar.e(cVar.f20606p.f20620d, cVar);
                if (bVar3 != null) {
                    bVar3.f20609s = cVar;
                    bVar3 = null;
                } else {
                    this.E.add(0, cVar);
                    int iB2 = f0.e.b(eVar2.f20635u);
                    if (iB2 == 1 || iB2 == 2) {
                        bVar3 = cVar;
                    }
                }
            }
            size--;
        }
    }

    @Override // t4.b, n4.e
    public final void d(RectF rectF, Matrix matrix, boolean z5) {
        super.d(rectF, matrix, z5);
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((b) arrayList.get(size)).d(rectF2, this.f20604n, true);
            rectF.union(rectF2);
        }
    }

    @Override // t4.b, q4.f
    public final void h(e4.c cVar, Object obj) {
        super.h(cVar, obj);
        if (obj == z.f14966z) {
            r rVar = new r(cVar, null);
            this.D = rVar;
            rVar.a(this);
            e(this.D);
        }
    }

    @Override // t4.b
    public final void k(Canvas canvas, Matrix matrix, int i7) {
        e eVar = this.f20606p;
        float f2 = eVar.f20629o;
        float f7 = eVar.f20630p;
        RectF rectF = this.G;
        rectF.set(0.0f, 0.0f, f2, f7);
        matrix.mapRect(rectF);
        boolean z5 = this.f20605o.R;
        ArrayList arrayList = this.E;
        boolean z6 = z5 && arrayList.size() > 1 && i7 != 255;
        if (z6) {
            Paint paint = this.H;
            paint.setAlpha(i7);
            hs.c cVar = x4.h.f22636a;
            canvas.saveLayer(rectF, paint);
        } else {
            canvas.save();
        }
        if (z6) {
            i7 = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((this.J || !"__container".equals(eVar.f20619c)) && !rectF.isEmpty()) ? canvas.clipRect(rectF) : true) {
                ((b) arrayList.get(size)).f(canvas, matrix, i7);
            }
        }
        canvas.restore();
    }

    @Override // t4.b
    public final void q(q4.e eVar, int i7, ArrayList arrayList, q4.e eVar2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.E;
            if (i10 >= arrayList2.size()) {
                return;
            }
            ((b) arrayList2.get(i10)).c(eVar, i7, arrayList, eVar2);
            i10++;
        }
    }

    @Override // t4.b
    public final void r(boolean z5) {
        super.r(z5);
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((b) it.next()).r(z5);
        }
    }

    @Override // t4.b
    public final void s(float f2) {
        this.I = f2;
        super.s(f2);
        o4.e eVar = this.D;
        e eVar2 = this.f20606p;
        if (eVar != null) {
            l4.i iVar = this.f20605o.f14917d;
            f2 = ((((Float) eVar.e()).floatValue() * eVar2.f20618b.f14874n) - eVar2.f20618b.f14872l) / ((iVar.f14873m - iVar.f14872l) + 0.01f);
        }
        if (this.D == null) {
            float f7 = eVar2.f20628n;
            l4.i iVar2 = eVar2.f20618b;
            f2 -= f7 / (iVar2.f14873m - iVar2.f14872l);
        }
        if (eVar2.f20627m != 0.0f && !"__container".equals(eVar2.f20619c)) {
            f2 /= eVar2.f20627m;
        }
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((b) arrayList.get(size)).s(f2);
        }
    }
}
