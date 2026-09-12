package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class z {
    public double[] A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public final float M;
    public final float N;
    public final float O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f6830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f6831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f6832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f6833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f6834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f6835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f6836h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f6837i;
    public final ArrayList j;
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f6838l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f6839m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f6840n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f6841o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f6842p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double f6843q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public x f6844r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public double f6845s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public double f6846t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public double f6847u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public double f6848v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public r0[] f6849w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public r0[] f6850x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public r0[] f6851y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public r0[] f6852z;

    public z(float f2, float f7, float f10) {
        ArrayList arrayList = new ArrayList();
        this.f6829a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f6830b = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f6831c = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        this.f6832d = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        this.f6833e = arrayList5;
        ArrayList arrayList6 = new ArrayList();
        this.f6834f = arrayList6;
        ArrayList arrayList7 = new ArrayList();
        this.f6835g = arrayList7;
        ArrayList arrayList8 = new ArrayList();
        this.f6836h = arrayList8;
        ArrayList arrayList9 = new ArrayList();
        this.f6837i = arrayList9;
        ArrayList arrayList10 = new ArrayList();
        this.j = arrayList10;
        ArrayList arrayList11 = new ArrayList();
        this.k = arrayList11;
        this.f6838l = new ArrayList();
        this.f6839m = new ArrayList();
        this.f6840n = new ArrayList();
        this.f6841o = new ArrayList();
        this.f6842p = new ArrayList();
        this.f6843q = 12.0d;
        this.f6844r = x.f6807p;
        r0[] r0VarArr = new r0[0];
        this.f6849w = r0VarArr;
        this.f6850x = new r0[0];
        this.f6851y = new r0[0];
        this.f6852z = new r0[0];
        this.A = new double[]{0.0d};
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.M = f2;
        this.N = f7;
        this.O = f10;
        arrayList2.add(r0VarArr);
        arrayList3.add(this.f6850x);
        arrayList4.add(this.f6851y);
        arrayList5.add(this.f6852z);
        arrayList6.add(this.A);
        arrayList7.add(Integer.valueOf(this.G));
        arrayList8.add(Integer.valueOf(this.H));
        arrayList9.add(Integer.valueOf(this.I));
        arrayList10.add(Integer.valueOf(this.J));
        arrayList11.add(Integer.valueOf(this.K));
        arrayList.add(this.f6844r);
        e();
    }

    public static r0[] a(ArrayList arrayList) {
        int size = arrayList.size();
        r0[] r0VarArr = new r0[size];
        for (int i7 = 0; i7 < size; i7++) {
            r0VarArr[i7] = (r0) arrayList.get(i7);
        }
        return r0VarArr;
    }

    public static void b(int i7, ArrayList arrayList) {
        while (i7 >= 0) {
            arrayList.set(i7, Integer.valueOf(((Integer) arrayList.get(i7)).intValue() + 1));
            i7--;
        }
    }

    public final double c(double d6) {
        b(this.B, this.f6835g);
        int i7 = this.G + 1;
        r0[] r0VarArr = this.f6849w;
        if (i7 < r0VarArr.length) {
            this.f6847u = 0.0d;
            this.G = i7;
            this.f6845s = a.a.g(r0VarArr[i7], this.N, this.M, this.f6843q);
        }
        double d7 = this.f6845s + d6;
        this.f6845s = d7;
        return d7;
    }

    public final double d() {
        b(this.C, this.f6836h);
        int i7 = this.H + 1;
        r0[] r0VarArr = this.f6850x;
        if (i7 < r0VarArr.length) {
            this.f6848v = 0.0d;
            this.H = i7;
            this.f6846t = a.a.g(r0VarArr[i7], this.O, this.M, this.f6843q);
        }
        return this.f6846t;
    }

    public final void e() {
        this.f6838l.add(Integer.valueOf(this.B));
        this.f6839m.add(Integer.valueOf(this.C));
        this.f6840n.add(Integer.valueOf(this.D));
        this.f6841o.add(Integer.valueOf(this.E));
        this.f6842p.add(Integer.valueOf(this.F));
    }

    public final void f(a0 a0Var, ReadableMap readableMap) {
        x xVar;
        if (this.L > 0) {
            xVar = this.f6844r;
        } else {
            a0 parentTextRoot = a0Var.getParentTextRoot();
            while (true) {
                if (parentTextRoot == null) {
                    xVar = x.f6807p;
                    break;
                }
                x xVar2 = parentTextRoot.f6664e.f6844r;
                if (xVar2 != x.f6807p) {
                    xVar = xVar2;
                    break;
                }
                parentTextRoot = parentTextRoot.getParentTextRoot();
            }
        }
        this.L++;
        ArrayList arrayList = this.f6829a;
        if (readableMap == null) {
            arrayList.add(xVar);
            return;
        }
        x xVar3 = new x(readableMap, xVar, this.M);
        this.f6843q = xVar3.f6808a;
        arrayList.add(xVar3);
        this.f6844r = xVar3;
    }
}
