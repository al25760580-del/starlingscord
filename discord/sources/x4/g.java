package x4;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import s4.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PointF f22635a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f2, float f7, float f10) {
        return Math.max(f7, Math.min(f10, f2));
    }

    public static int c(float f2, float f7) {
        int i7 = (int) f2;
        int i10 = (int) f7;
        int i11 = i7 / i10;
        int i12 = i7 % i10;
        if (!((i7 ^ i10) >= 0) && i12 != 0) {
            i11--;
        }
        return i7 - (i10 * i11);
    }

    public static void d(k kVar, Path path) {
        Path path2;
        path.reset();
        PointF pointF = kVar.f19765b;
        ArrayList arrayList = kVar.f19764a;
        path.moveTo(pointF.x, pointF.y);
        float f2 = pointF.x;
        float f7 = pointF.y;
        PointF pointF2 = f22635a;
        pointF2.set(f2, f7);
        int i7 = 0;
        while (i7 < arrayList.size()) {
            q4.a aVar = (q4.a) arrayList.get(i7);
            PointF pointF3 = aVar.f18598a;
            PointF pointF4 = aVar.f18599b;
            PointF pointF5 = aVar.f18600c;
            if (pointF3.equals(pointF2) && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i7++;
            path = path2;
        }
        Path path3 = path;
        if (kVar.f19766c) {
            path3.close();
        }
    }

    public static float e(float f2, float f7, float f10) {
        return kk.b.c(f7, f2, f10, f2);
    }

    public static void f(q4.e eVar, int i7, ArrayList arrayList, q4.e eVar2, n4.k kVar) {
        if (eVar.a(i7, kVar.getName())) {
            String name = kVar.getName();
            q4.e eVar3 = new q4.e(eVar2);
            eVar3.f18622a.add(name);
            q4.e eVar4 = new q4.e(eVar3);
            eVar4.f18623b = kVar;
            arrayList.add(eVar4);
        }
    }
}
