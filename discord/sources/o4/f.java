package o4;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f extends k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17128i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i7, List list) {
        super(list);
        this.f17128i = i7;
    }

    @Override // o4.e
    public final Object f(y4.a aVar, float f2) {
        Object obj;
        switch (this.f17128i) {
            case 0:
                return Integer.valueOf(k(aVar, f2));
            case 1:
                return Integer.valueOf(k(aVar, f2));
            default:
                Object obj2 = aVar.f23194b;
                e4.c cVar = this.f17124e;
                if (cVar == null) {
                    return (f2 != 1.0f || (obj = aVar.f23195c) == null) ? (q4.b) obj2 : (q4.b) obj;
                }
                float f7 = aVar.f23199g;
                Float f10 = aVar.f23200h;
                float fFloatValue = f10 == null ? Float.MAX_VALUE : f10.floatValue();
                q4.b bVar = (q4.b) obj2;
                Object obj3 = aVar.f23195c;
                return (q4.b) cVar.K(f7, fFloatValue, bVar, obj3 == null ? bVar : (q4.b) obj3, f2, c(), this.f17123d);
        }
    }

    public int k(y4.a aVar, float f2) {
        Float f7;
        Integer num;
        int i7;
        float f10;
        switch (this.f17128i) {
            case 0:
                Object obj = aVar.f23194b;
                Object obj2 = aVar.f23194b;
                if (obj == null || aVar.f23195c == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                e4.c cVar = this.f17124e;
                return (cVar == null || (f7 = aVar.f23200h) == null || (num = (Integer) cVar.K(aVar.f23199g, f7.floatValue(), (Integer) obj2, (Integer) aVar.f23195c, f2, d(), this.f17123d)) == null) ? gn.h.v(((Integer) obj2).intValue(), ((Integer) aVar.f23195c).intValue(), x4.g.b(f2, 0.0f, 1.0f)) : num.intValue();
            default:
                Object obj3 = aVar.f23194b;
                Object obj4 = aVar.f23194b;
                if (obj3 == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                Object obj5 = aVar.f23195c;
                if (obj5 == null) {
                    if (aVar.k == 784923401) {
                        aVar.k = ((Integer) obj3).intValue();
                    }
                    i7 = aVar.k;
                } else {
                    if (aVar.f23202l == 784923401) {
                        aVar.f23202l = ((Integer) obj5).intValue();
                    }
                    i7 = aVar.f23202l;
                }
                e4.c cVar2 = this.f17124e;
                if (cVar2 != null) {
                    f10 = f2;
                    Integer num2 = (Integer) cVar2.K(aVar.f23199g, aVar.f23200h.floatValue(), (Integer) obj4, Integer.valueOf(i7), f10, d(), this.f17123d);
                    if (num2 != null) {
                        return num2.intValue();
                    }
                } else {
                    f10 = f2;
                }
                if (aVar.k == 784923401) {
                    aVar.k = ((Integer) obj4).intValue();
                }
                int i10 = aVar.k;
                PointF pointF = x4.g.f22635a;
                return (int) (((i7 - i10) * f10) + i10);
        }
    }
}
