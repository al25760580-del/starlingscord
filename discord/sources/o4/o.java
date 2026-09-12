package o4;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class o extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PointF f17149i;
    public final PointF j;
    public final i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f17150l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e4.c f17151m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e4.c f17152n;

    public o(i iVar, i iVar2) {
        super(Collections.EMPTY_LIST);
        this.f17149i = new PointF();
        this.j = new PointF();
        this.k = iVar;
        this.f17150l = iVar2;
        i(this.f17123d);
    }

    @Override // o4.e
    public final Object e() {
        return k();
    }

    @Override // o4.e
    public final /* bridge */ /* synthetic */ Object f(y4.a aVar, float f2) {
        return k();
    }

    @Override // o4.e
    public final void i(float f2) {
        i iVar = this.k;
        iVar.i(f2);
        i iVar2 = this.f17150l;
        iVar2.i(f2);
        this.f17149i.set(((Float) iVar.e()).floatValue(), ((Float) iVar2.e()).floatValue());
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f17120a;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i7)).a();
            i7++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    public final PointF k() {
        Float f2;
        Float f7 = null;
        if (this.f17151m != null) {
            i iVar = this.k;
            y4.a aVarF = iVar.f17122c.f();
            if (aVarF != null) {
                Float f10 = aVarF.f23200h;
                e4.c cVar = this.f17151m;
                float f11 = aVarF.f23199g;
                f2 = (Float) cVar.K(f11, f10 == null ? f11 : f10.floatValue(), (Float) aVarF.f23194b, (Float) aVarF.f23195c, iVar.c(), iVar.d(), iVar.f17123d);
            } else {
                f2 = null;
            }
        } else {
            f2 = null;
        }
        if (this.f17152n != null) {
            i iVar2 = this.f17150l;
            y4.a aVarF2 = iVar2.f17122c.f();
            if (aVarF2 != null) {
                Float f12 = aVarF2.f23200h;
                e4.c cVar2 = this.f17152n;
                float f13 = aVarF2.f23199g;
                f7 = (Float) cVar2.K(f13, f12 == null ? f13 : f12.floatValue(), (Float) aVarF2.f23194b, (Float) aVarF2.f23195c, iVar2.c(), iVar2.d(), iVar2.f17123d);
            }
        }
        PointF pointF = this.f17149i;
        PointF pointF2 = this.j;
        if (f2 == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(f2.floatValue(), 0.0f);
        }
        if (f7 == null) {
            pointF2.set(pointF2.x, pointF.y);
            return pointF2;
        }
        pointF2.set(pointF2.x, f7.floatValue());
        return pointF2;
    }
}
