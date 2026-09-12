package o4;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m extends k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PointF f17143i;
    public final float[] j;
    public final float[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PathMeasure f17144l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l f17145m;

    public m(ArrayList arrayList) {
        super(arrayList);
        this.f17143i = new PointF();
        this.j = new float[2];
        this.k = new float[2];
        this.f17144l = new PathMeasure();
    }

    @Override // o4.e
    public final Object f(y4.a aVar, float f2) {
        float f7;
        l lVar = (l) aVar;
        Path path = lVar.f17141q;
        e4.c cVar = this.f17124e;
        if (cVar == null || aVar.f23200h == null) {
            f7 = f2;
        } else {
            f7 = f2;
            PointF pointF = (PointF) cVar.K(lVar.f23199g, lVar.f23200h.floatValue(), (PointF) lVar.f23194b, (PointF) lVar.f23195c, d(), f7, this.f17123d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) aVar.f23194b;
        }
        l lVar2 = this.f17145m;
        PathMeasure pathMeasure = this.f17144l;
        if (lVar2 != lVar) {
            pathMeasure.setPath(path, false);
            this.f17145m = lVar;
        }
        float length = pathMeasure.getLength();
        float f10 = f7 * length;
        float[] fArr = this.j;
        float[] fArr2 = this.k;
        pathMeasure.getPosTan(f10, fArr, fArr2);
        float f11 = fArr[0];
        float f12 = fArr[1];
        PointF pointF2 = this.f17143i;
        pointF2.set(f11, f12);
        if (f10 < 0.0f) {
            pointF2.offset(fArr2[0] * f10, fArr2[1] * f10);
            return pointF2;
        }
        if (f10 > length) {
            float f13 = f10 - length;
            pointF2.offset(fArr2[0] * f13, fArr2[1] * f13);
        }
        return pointF2;
    }
}
