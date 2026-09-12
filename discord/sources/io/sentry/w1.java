package io.sentry;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w1 implements r4.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f13269d;

    public w1() {
        this.f13269d = new ArrayList();
    }

    public r1 a() {
        ArrayList arrayList = this.f13269d;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (r1) kk.b.e(1, arrayList);
    }

    public boolean b() {
        if (this.f13269d.size() == 1) {
            return true;
        }
        r1 r1VarA = a();
        e();
        if (!(a() instanceof u1)) {
            if (!(a() instanceof s1)) {
                return false;
            }
            s1 s1Var = (s1) a();
            if (r1VarA == null || s1Var == null) {
                return false;
            }
            s1Var.f13143a.add(r1VarA.getValue());
            return false;
        }
        u1 u1Var = (u1) a();
        e();
        t1 t1Var = (t1) a();
        if (u1Var == null || r1VarA == null || t1Var == null) {
            return false;
        }
        t1Var.f13154a.put(u1Var.f13212a, r1VarA.getValue());
        return false;
    }

    public boolean c(q1 q1Var) {
        Object objD = q1Var.d();
        if (a() == null && objD != null) {
            this.f13269d.add(new v1(objD));
            return true;
        }
        if (a() instanceof u1) {
            u1 u1Var = (u1) a();
            e();
            ((t1) a()).f13154a.put(u1Var.f13212a, objD);
            return false;
        }
        if (!(a() instanceof s1)) {
            return false;
        }
        ((s1) a()).f13143a.add(objD);
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void d(final x1 x1Var) {
        boolean zB;
        int[] iArr = p1.f12864a;
        io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) x1Var.f13272e;
        int i7 = iArr[aVar.j0().ordinal()];
        ArrayList arrayList = this.f13269d;
        switch (i7) {
            case 1:
                x1Var.c();
                arrayList.add(new s1());
                zB = false;
                break;
            case 2:
                x1Var.g();
                zB = b();
                break;
            case 3:
                x1Var.f();
                arrayList.add(new t1());
                zB = false;
                break;
            case 4:
                x1Var.i();
                zB = b();
                break;
            case 5:
                arrayList.add(new u1(aVar.T()));
                zB = false;
                break;
            case 6:
                final int i10 = 0;
                zB = c(new q1() { // from class: io.sentry.o1
                    @Override // io.sentry.q1
                    public final Object d() {
                        switch (i10) {
                            case 0:
                                return ((io.sentry.vendor.gson.stream.a) x1Var.f13272e).c0();
                            default:
                                return Boolean.valueOf(((io.sentry.vendor.gson.stream.a) x1Var.f13272e).B());
                        }
                    }
                });
                break;
            case 7:
                zB = c(new bc.i(25, this, x1Var));
                break;
            case 8:
                final int i11 = 1;
                zB = c(new q1() { // from class: io.sentry.o1
                    @Override // io.sentry.q1
                    public final Object d() {
                        switch (i11) {
                            case 0:
                                return ((io.sentry.vendor.gson.stream.a) x1Var.f13272e).c0();
                            default:
                                return Boolean.valueOf(((io.sentry.vendor.gson.stream.a) x1Var.f13272e).B());
                        }
                    }
                });
                break;
            case 9:
                aVar.Y();
                zB = c(new hm.a(9));
                break;
            case 10:
                zB = true;
                break;
            default:
                zB = false;
                break;
        }
        if (zB) {
            return;
        }
        d(x1Var);
    }

    public void e() {
        ArrayList arrayList = this.f13269d;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // r4.e
    public o4.e l0() {
        ArrayList arrayList = this.f13269d;
        return ((y4.a) arrayList.get(0)).c() ? new o4.j(1, arrayList) : new o4.m(arrayList);
    }

    @Override // r4.e
    public List q0() {
        return this.f13269d;
    }

    @Override // r4.e
    public boolean t0() {
        ArrayList arrayList = this.f13269d;
        return arrayList.size() == 1 && ((y4.a) arrayList.get(0)).c();
    }

    public w1(ArrayList arrayList) {
        this.f13269d = arrayList;
    }
}
