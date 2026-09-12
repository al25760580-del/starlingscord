package o4;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s4.k f17146i;
    public final Path j;
    public Path k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Path f17147l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f17148m;

    public n(List list) {
        super(list);
        this.f17146i = new s4.k();
        this.j = new Path();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x016f  */
    @Override // o4.e
    public final Object f(y4.a aVar, float f2) {
        s4.k kVar;
        s4.k kVar2;
        int i7;
        int i10;
        s4.k kVar3;
        s4.k kVar4;
        s4.k kVar5 = (s4.k) aVar.f23194b;
        s4.k kVar6 = (s4.k) aVar.f23195c;
        s4.k kVar7 = kVar6 == null ? kVar5 : kVar6;
        s4.k kVar8 = this.f17146i;
        ArrayList arrayList = kVar8.f19764a;
        if (kVar8.f19765b == null) {
            kVar8.f19765b = new PointF();
        }
        boolean z5 = kVar5.f19766c;
        ArrayList arrayList2 = kVar5.f19764a;
        boolean z6 = true;
        kVar8.f19766c = z5 || kVar7.f19766c;
        int size = arrayList2.size();
        ArrayList arrayList3 = kVar7.f19764a;
        if (size != arrayList3.size()) {
            x4.c.b("Curves must have the same number of control points. Shape 1: " + arrayList2.size() + "\tShape 2: " + arrayList3.size());
        }
        int iMin = Math.min(arrayList2.size(), arrayList3.size());
        if (arrayList.size() < iMin) {
            for (int size2 = arrayList.size(); size2 < iMin; size2++) {
                arrayList.add(new q4.a());
            }
        } else if (arrayList.size() > iMin) {
            for (int size3 = arrayList.size() - 1; size3 >= iMin; size3--) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        PointF pointF = kVar5.f19765b;
        PointF pointF2 = kVar7.f19765b;
        kVar8.a(x4.g.e(pointF.x, pointF2.x, f2), x4.g.e(pointF.y, pointF2.y, f2));
        int size4 = arrayList.size() - 1;
        while (size4 >= 0) {
            q4.a aVar2 = (q4.a) arrayList2.get(size4);
            q4.a aVar3 = (q4.a) arrayList3.get(size4);
            PointF pointF3 = aVar2.f18598a;
            PointF pointF4 = aVar2.f18599b;
            PointF pointF5 = aVar2.f18600c;
            boolean z7 = z6;
            PointF pointF6 = aVar3.f18598a;
            PointF pointF7 = aVar3.f18599b;
            PointF pointF8 = aVar3.f18600c;
            ((q4.a) arrayList.get(size4)).f18598a.set(x4.g.e(pointF3.x, pointF6.x, f2), x4.g.e(pointF3.y, pointF6.y, f2));
            ((q4.a) arrayList.get(size4)).f18599b.set(x4.g.e(pointF4.x, pointF7.x, f2), x4.g.e(pointF4.y, pointF7.y, f2));
            ((q4.a) arrayList.get(size4)).f18600c.set(x4.g.e(pointF5.x, pointF8.x, f2), x4.g.e(pointF5.y, pointF8.y, f2));
            size4--;
            z6 = z7;
            arrayList2 = arrayList2;
            kVar8 = kVar8;
            arrayList3 = arrayList3;
        }
        s4.k kVar9 = kVar8;
        boolean z10 = z6;
        ArrayList arrayList4 = this.f17148m;
        if (arrayList4 != null) {
            int size5 = arrayList4.size() - 1;
            kVar = kVar9;
            while (true) {
                ArrayList arrayList5 = kVar.f19764a;
                if (size5 < 0) {
                    break;
                }
                n4.q qVar = (n4.q) this.f17148m.get(size5);
                qVar.getClass();
                if (arrayList5.size() <= 2) {
                    i7 = size5;
                } else {
                    float fFloatValue = ((Float) qVar.f16473b.e()).floatValue();
                    if (fFloatValue == 0.0f) {
                        i7 = size5;
                    } else {
                        boolean z11 = kVar.f19766c;
                        int size6 = arrayList5.size() - 1;
                        int i11 = 0;
                        while (size6 >= 0) {
                            q4.a aVar4 = (q4.a) arrayList5.get(size6);
                            q4.a aVar5 = (q4.a) arrayList5.get(n4.q.c(size6 - 1, arrayList5.size()));
                            PointF pointF9 = (size6 != 0 || z11) ? aVar5.f18600c : kVar.f19765b;
                            int i12 = size5;
                            i11 = (((size6 != 0 || z11) ? aVar5.f18599b : pointF9).equals(pointF9) && aVar4.f18598a.equals(pointF9) && !((kVar.f19766c || (size6 != 0 && size6 != arrayList5.size() + (-1))) ? false : z10)) ? i11 + 2 : i11 + 1;
                            size6--;
                            size5 = i12;
                        }
                        i7 = size5;
                        s4.k kVar10 = qVar.f16474c;
                        if (kVar10 == null || kVar10.f19764a.size() != i11) {
                            ArrayList arrayList6 = new ArrayList(i11);
                            for (int i13 = 0; i13 < i11; i13++) {
                                arrayList6.add(new q4.a());
                            }
                            i10 = 0;
                            qVar.f16474c = new s4.k(new PointF(0.0f, 0.0f), false, arrayList6);
                        } else {
                            i10 = 0;
                        }
                        s4.k kVar11 = qVar.f16474c;
                        kVar11.f19766c = z11;
                        PointF pointF10 = kVar.f19765b;
                        kVar11.a(pointF10.x, pointF10.y);
                        ArrayList arrayList7 = kVar11.f19764a;
                        boolean z12 = kVar.f19766c;
                        int i14 = i10;
                        int i15 = i14;
                        while (i14 < arrayList5.size()) {
                            q4.a aVar6 = (q4.a) arrayList5.get(i14);
                            q4.a aVar7 = (q4.a) arrayList5.get(n4.q.c(i14 - 1, arrayList5.size()));
                            q4.a aVar8 = (q4.a) arrayList5.get(n4.q.c(i14 - 2, arrayList5.size()));
                            PointF pointF11 = (i14 != 0 || z12) ? aVar7.f18600c : kVar.f19765b;
                            PointF pointF12 = (i14 != 0 || z12) ? aVar7.f18599b : pointF11;
                            float f7 = fFloatValue;
                            PointF pointF13 = aVar6.f18598a;
                            PointF pointF14 = aVar8.f18600c;
                            boolean z13 = z12;
                            PointF pointF15 = aVar6.f18600c;
                            boolean z14 = (kVar.f19766c || !(i14 == 0 || i14 == arrayList5.size() + (-1))) ? false : z10;
                            if (pointF12.equals(pointF11) && pointF13.equals(pointF11) && !z14) {
                                float f10 = pointF11.x;
                                float f11 = f10 - pointF14.x;
                                float f12 = pointF11.y;
                                float f13 = f12 - pointF14.y;
                                float f14 = pointF15.x - f10;
                                float f15 = pointF15.y - f12;
                                double d6 = f11;
                                s4.k kVar12 = kVar11;
                                s4.k kVar13 = kVar;
                                float fHypot = (float) Math.hypot(d6, f13);
                                float fHypot2 = (float) Math.hypot(f14, f15);
                                float fMin = Math.min(f7 / fHypot, 0.5f);
                                float fMin2 = Math.min(f7 / fHypot2, 0.5f);
                                float f16 = pointF11.x;
                                float fC = kk.b.c(pointF14.x, f16, fMin, f16);
                                float f17 = pointF11.y;
                                float fC2 = kk.b.c(pointF14.y, f17, fMin, f17);
                                float fC3 = kk.b.c(pointF15.x, f16, fMin2, f16);
                                float fC4 = kk.b.c(pointF15.y, f17, fMin2, f17);
                                float f18 = fC - ((fC - f16) * 0.5519f);
                                float f19 = fC2 - ((fC2 - f17) * 0.5519f);
                                float f20 = fC3 - ((fC3 - f16) * 0.5519f);
                                float f21 = fC4 - ((fC4 - f17) * 0.5519f);
                                q4.a aVar9 = (q4.a) arrayList7.get(n4.q.c(i15 - 1, arrayList7.size()));
                                q4.a aVar10 = (q4.a) arrayList7.get(i15);
                                kVar4 = kVar13;
                                aVar9.f18599b.set(fC, fC2);
                                aVar9.f18600c.set(fC, fC2);
                                kVar3 = kVar12;
                                if (i14 == 0) {
                                    kVar3.a(fC, fC2);
                                }
                                aVar10.f18598a.set(f18, f19);
                                q4.a aVar11 = (q4.a) arrayList7.get(i15 + 1);
                                aVar10.f18599b.set(f20, f21);
                                aVar10.f18600c.set(fC3, fC4);
                                aVar11.f18598a.set(fC3, fC4);
                                i15 += 2;
                            } else {
                                kVar3 = kVar11;
                                kVar4 = kVar;
                                q4.a aVar12 = (q4.a) arrayList7.get(n4.q.c(i15 - 1, arrayList7.size()));
                                q4.a aVar13 = (q4.a) arrayList7.get(i15);
                                PointF pointF16 = aVar7.f18599b;
                                aVar12.f18599b.set(pointF16.x, pointF16.y);
                                PointF pointF17 = aVar7.f18600c;
                                aVar12.f18600c.set(pointF17.x, pointF17.y);
                                PointF pointF18 = aVar6.f18598a;
                                aVar13.f18598a.set(pointF18.x, pointF18.y);
                                i15++;
                            }
                            i14++;
                            kVar11 = kVar3;
                            kVar5 = kVar5;
                            arrayList5 = arrayList5;
                            fFloatValue = f7;
                            z12 = z13;
                            kVar6 = kVar6;
                            kVar = kVar4;
                        }
                        kVar = kVar11;
                    }
                }
                size5 = i7 - 1;
                kVar5 = kVar5;
                kVar6 = kVar6;
            }
        } else {
            kVar = kVar9;
        }
        s4.k kVar14 = kVar5;
        s4.k kVar15 = kVar6;
        Path path = this.j;
        x4.g.d(kVar, path);
        if (this.f17124e == null) {
            return path;
        }
        if (this.k == null) {
            this.k = new Path();
            this.f17147l = new Path();
        }
        x4.g.d(kVar14, this.k);
        if (kVar15 != null) {
            kVar2 = kVar15;
            x4.g.d(kVar2, this.f17147l);
        } else {
            kVar2 = kVar15;
        }
        e4.c cVar = this.f17124e;
        float f22 = aVar.f23199g;
        float fFloatValue2 = aVar.f23200h.floatValue();
        s4.k kVar16 = kVar2;
        Path path2 = this.k;
        return (Path) cVar.K(f22, fFloatValue2, path2, kVar16 == null ? path2 : this.f17147l, f2, d(), this.f17123d);
    }
}
