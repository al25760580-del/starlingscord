package o4;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class l extends y4.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Path f17141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y4.a f17142r;

    public l(l4.i iVar, y4.a aVar) {
        super(iVar, (PointF) aVar.f23194b, (PointF) aVar.f23195c, aVar.f23196d, aVar.f23197e, aVar.f23198f, aVar.f23199g, aVar.f23200h);
        this.f17142r = aVar;
        d();
    }

    public final void d() {
        Object obj;
        Object obj2 = this.f23195c;
        Object obj3 = this.f23194b;
        boolean z5 = (obj2 == null || obj3 == null || !((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) ? false : true;
        if (obj3 == null || (obj = this.f23195c) == null || z5) {
            return;
        }
        PointF pointF = (PointF) obj3;
        PointF pointF2 = (PointF) obj;
        y4.a aVar = this.f17142r;
        PointF pointF3 = aVar.f23205o;
        PointF pointF4 = aVar.f23206p;
        hs.c cVar = x4.h.f22636a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f2 = pointF3.x + pointF.x;
            float f7 = pointF.y + pointF3.y;
            float f10 = pointF2.x;
            float f11 = f10 + pointF4.x;
            float f12 = pointF2.y;
            path.cubicTo(f2, f7, f11, f12 + pointF4.y, f10, f12);
        }
        this.f17141q = path;
    }
}
