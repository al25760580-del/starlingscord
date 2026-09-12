package r0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s0.j;
import s0.p;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConstraintWidget f19146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f19148f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p0.e f19151i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f19143a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19149g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19150h = Integer.MIN_VALUE;

    public c(ConstraintWidget constraintWidget, int i7) {
        this.f19146d = constraintWidget;
        this.f19147e = i7;
    }

    public final void a(c cVar, int i7) {
        b(cVar, i7, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i7, int i10, boolean z5) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z5 && !i(cVar)) {
            return false;
        }
        this.f19148f = cVar;
        if (cVar.f19143a == null) {
            cVar.f19143a = new HashSet();
        }
        HashSet hashSet = this.f19148f.f19143a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f19149g = i7;
        this.f19150h = i10;
        return true;
    }

    public final void c(int i7, ArrayList arrayList, p pVar) {
        HashSet hashSet = this.f19143a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                j.b(((c) it.next()).f19146d, i7, arrayList, pVar);
            }
        }
    }

    public final int d() {
        if (this.f19145c) {
            return this.f19144b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.f19146d.f1247f0 == 8) {
            return 0;
        }
        int i7 = this.f19150h;
        return (i7 == Integer.MIN_VALUE || (cVar = this.f19148f) == null || cVar.f19146d.f1247f0 != 8) ? this.f19149g : i7;
    }

    public final c f() {
        int i7 = this.f19147e;
        int iB = f0.e.b(i7);
        ConstraintWidget constraintWidget = this.f19146d;
        switch (iB) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return constraintWidget.J;
            case 2:
                return constraintWidget.K;
            case 3:
                return constraintWidget.H;
            case 4:
                return constraintWidget.I;
            default:
                throw new AssertionError(kk.b.w(i7));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f19143a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f19148f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x0063 A[RETURN] */
    public final boolean i(c cVar) {
        if (cVar != null) {
            ConstraintWidget constraintWidget = cVar.f19146d;
            int i7 = cVar.f19147e;
            int i10 = this.f19147e;
            if (i7 != i10) {
                switch (f0.e.b(i10)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z5 = i7 == 2 || i7 == 4;
                        if (!(constraintWidget instanceof f)) {
                            return z5;
                        }
                        if (z5 || i7 == 8) {
                            return true;
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z6 = i7 == 3 || i7 == 5;
                        if (!(constraintWidget instanceof f)) {
                            return z6;
                        }
                        if (z6 || i7 == 9) {
                            return true;
                        }
                        break;
                    case 5:
                        if (i7 != 2 && i7 != 4) {
                            return true;
                        }
                        break;
                    case 6:
                        if (i7 != 6 && i7 != 8 && i7 != 9) {
                            return true;
                        }
                        break;
                    default:
                        throw new AssertionError(kk.b.w(i10));
                }
            } else if (i10 != 6 || (constraintWidget.D && this.f19146d.D)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f19148f;
        if (cVar != null && (hashSet = cVar.f19143a) != null) {
            hashSet.remove(this);
            if (this.f19148f.f19143a.size() == 0) {
                this.f19148f.f19143a = null;
            }
        }
        this.f19143a = null;
        this.f19148f = null;
        this.f19149g = 0;
        this.f19150h = Integer.MIN_VALUE;
        this.f19145c = false;
        this.f19144b = 0;
    }

    public final void k() {
        p0.e eVar = this.f19151i;
        if (eVar == null) {
            this.f19151i = new p0.e(1);
        } else {
            eVar.c();
        }
    }

    public final void l(int i7) {
        this.f19144b = i7;
        this.f19145c = true;
    }

    public final String toString() {
        return this.f19146d.f1249g0 + ":" + kk.b.w(this.f19147e);
    }
}
