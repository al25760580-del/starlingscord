package o4;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j extends k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17140i;
    public final Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i7, List list) {
        super(list);
        this.f17140i = i7;
        switch (i7) {
            case 1:
                super(list);
                this.j = new PointF();
                break;
            case 2:
                super(list);
                this.j = new y4.b();
                break;
            default:
                int iMax = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    s4.c cVar = (s4.c) ((y4.a) list.get(i10)).f23194b;
                    if (cVar != null) {
                        iMax = Math.max(iMax, cVar.f19722b.length);
                    }
                }
                this.j = new s4.c(new float[iMax], new int[iMax]);
                break;
        }
    }

    @Override // o4.e
    public final Object f(y4.a aVar, float f2) {
        Object obj;
        float f7;
        switch (this.f17140i) {
            case 0:
                s4.c cVar = (s4.c) this.j;
                s4.c cVar2 = (s4.c) aVar.f23194b;
                s4.c cVar3 = (s4.c) aVar.f23195c;
                int[] iArr = cVar.f19722b;
                float[] fArr = cVar.f19721a;
                boolean zEquals = cVar2.equals(cVar3);
                int[] iArr2 = cVar2.f19722b;
                if (zEquals || f2 <= 0.0f) {
                    cVar.a(cVar2);
                } else if (f2 >= 1.0f) {
                    cVar.a(cVar3);
                } else {
                    int length = iArr2.length;
                    int[] iArr3 = cVar3.f19722b;
                    if (length != iArr3.length) {
                        StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb2.append(iArr2.length);
                        sb2.append(" vs ");
                        throw new IllegalArgumentException(kk.b.l(sb2, iArr3.length, ")"));
                    }
                    for (int i7 = 0; i7 < iArr2.length; i7++) {
                        fArr[i7] = x4.g.e(cVar2.f19721a[i7], cVar3.f19721a[i7], f2);
                        iArr[i7] = gn.h.v(iArr2[i7], iArr3[i7], f2);
                    }
                    for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
                        fArr[length2] = fArr[iArr2.length - 1];
                        iArr[length2] = iArr[iArr2.length - 1];
                    }
                }
                return cVar;
            case 1:
                return k(aVar, f2, f2, f2);
            default:
                y4.b bVar = (y4.b) this.j;
                Object obj2 = aVar.f23194b;
                if (obj2 == null || (obj = aVar.f23195c) == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                y4.b bVar2 = (y4.b) obj2;
                y4.b bVar3 = (y4.b) obj;
                e4.c cVar4 = this.f17124e;
                if (cVar4 != null) {
                    f7 = f2;
                    y4.b bVar4 = (y4.b) cVar4.K(aVar.f23199g, aVar.f23200h.floatValue(), bVar2, bVar3, f7, d(), this.f17123d);
                    if (bVar4 != null) {
                        return bVar4;
                    }
                } else {
                    f7 = f2;
                }
                float fE = x4.g.e(bVar2.f23207a, bVar3.f23207a, f7);
                float fE2 = x4.g.e(bVar2.f23208b, bVar3.f23208b, f7);
                bVar.f23207a = fE;
                bVar.f23208b = fE2;
                return bVar;
        }
    }

    @Override // o4.e
    public /* bridge */ /* synthetic */ Object g(y4.a aVar, float f2, float f7, float f10) {
        switch (this.f17140i) {
            case 1:
                return k(aVar, f2, f7, f10);
            default:
                return super.g(aVar, f2, f7, f10);
        }
    }

    public PointF k(y4.a aVar, float f2, float f7, float f10) {
        Object obj;
        PointF pointF;
        PointF pointF2 = (PointF) this.j;
        Object obj2 = aVar.f23194b;
        if (obj2 == null || (obj = aVar.f23195c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = (PointF) obj2;
        PointF pointF4 = (PointF) obj;
        e4.c cVar = this.f17124e;
        if (cVar != null && (pointF = (PointF) cVar.K(aVar.f23199g, aVar.f23200h.floatValue(), pointF3, pointF4, f2, d(), this.f17123d)) != null) {
            return pointF;
        }
        float f11 = pointF3.x;
        float fC = kk.b.c(pointF4.x, f11, f7, f11);
        float f12 = pointF3.y;
        pointF2.set(fC, kk.b.c(pointF4.y, f12, f10, f12));
        return pointF2;
    }
}
