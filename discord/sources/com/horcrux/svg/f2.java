package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class f2 extends a0 {
    public String E;
    public int F;
    public c2 G;
    public ArrayList H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public ArrayList L;
    public double M;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public r0 f6709x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public r0 f6710y;

    public f2(ReactContext reactContext) {
        super(reactContext);
        this.f6709x = null;
        this.f6710y = null;
        this.E = null;
        this.F = 1;
        this.M = Double.NaN;
    }

    @Override // com.horcrux.svg.VirtualView
    public void clearCache() {
        this.M = Double.NaN;
        super.clearCache();
    }

    @Override // com.horcrux.svg.a0, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f2) {
        i(canvas);
        clip(canvas, paint);
        j(canvas, paint);
        h();
        c(canvas, paint, f2);
        g();
    }

    @Override // com.horcrux.svg.a0
    public final Path e(Canvas canvas, Paint paint) {
        return getPath(canvas, paint);
    }

    @Override // com.horcrux.svg.a0, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = this.mPath;
        if (path != null) {
            return path;
        }
        i(canvas);
        return j(canvas, paint);
    }

    @Override // com.horcrux.svg.a0
    public void h() {
        boolean z5 = ((this instanceof b2) || (this instanceof a2)) ? false : true;
        z zVarF = f();
        ReadableMap readableMap = this.f6663d;
        ArrayList arrayList = this.H;
        ArrayList arrayList2 = this.I;
        ArrayList arrayList3 = this.K;
        ArrayList arrayList4 = this.L;
        ArrayList arrayList5 = this.J;
        if (z5) {
            zVarF.F = 0;
            zVarF.E = 0;
            zVarF.D = 0;
            zVarF.C = 0;
            zVarF.B = 0;
            zVarF.K = -1;
            zVarF.J = -1;
            zVarF.I = -1;
            zVarF.H = -1;
            zVarF.G = -1;
            zVarF.f6848v = 0.0d;
            zVarF.f6847u = 0.0d;
            zVarF.f6846t = 0.0d;
            zVarF.f6845s = 0.0d;
        }
        zVarF.f(this, readableMap);
        if (arrayList != null && arrayList.size() != 0) {
            zVarF.B++;
            zVarF.G = -1;
            zVarF.f6835g.add(-1);
            r0[] r0VarArrA = z.a(arrayList);
            zVarF.f6849w = r0VarArrA;
            zVarF.f6830b.add(r0VarArrA);
        }
        if (arrayList2 != null && arrayList2.size() != 0) {
            zVarF.C++;
            zVarF.H = -1;
            zVarF.f6836h.add(-1);
            r0[] r0VarArrA2 = z.a(arrayList2);
            zVarF.f6850x = r0VarArrA2;
            zVarF.f6831c.add(r0VarArrA2);
        }
        if (arrayList3 != null && arrayList3.size() != 0) {
            zVarF.D++;
            zVarF.I = -1;
            zVarF.f6837i.add(-1);
            r0[] r0VarArrA3 = z.a(arrayList3);
            zVarF.f6851y = r0VarArrA3;
            zVarF.f6832d.add(r0VarArrA3);
        }
        if (arrayList4 != null && arrayList4.size() != 0) {
            zVarF.E++;
            zVarF.J = -1;
            zVarF.j.add(-1);
            r0[] r0VarArrA4 = z.a(arrayList4);
            zVarF.f6852z = r0VarArrA4;
            zVarF.f6833e.add(r0VarArrA4);
        }
        if (arrayList5 != null && arrayList5.size() != 0) {
            zVarF.F++;
            zVarF.K = -1;
            zVarF.k.add(-1);
            int size = arrayList5.size();
            double[] dArr = new double[size];
            for (int i7 = 0; i7 < size; i7++) {
                dArr[i7] = ((r0) arrayList5.get(i7)).f6786a;
            }
            zVarF.A = dArr;
            zVarF.f6834f.add(dArr);
        }
        zVarF.e();
    }

    @Override // com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        if (this.mPath == null) {
            return;
        }
        super.invalidate();
        ViewParent parent = getParent();
        f2 f2Var = this;
        while (parent instanceof f2) {
            f2Var = (f2) parent;
            parent = f2Var.getParent();
        }
        f2Var.clearChildCache();
    }

    public final Path j(Canvas canvas, Paint paint) {
        Path path = this.mPath;
        if (path != null) {
            return path;
        }
        h();
        this.mPath = super.getPath(canvas, paint);
        g();
        return this.mPath;
    }

    public double k(Paint paint) {
        if (!Double.isNaN(this.M)) {
            return this.M;
        }
        double dK = 0.0d;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof f2) {
                dK = ((f2) childAt).k(paint) + dK;
            }
        }
        this.M = dK;
        return dK;
    }

    public void l(String str) {
        this.G = c2.a(str);
        invalidate();
    }
}
