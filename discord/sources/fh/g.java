package fh;

import android.animation.TimeInterpolator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import m3.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9189a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Class cls, String str, int i7) {
        super(cls, str);
        this.f9189a = i7;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f9189a) {
            case 0:
                return Float.valueOf(((h) obj).f9199h);
            case 1:
                return Float.valueOf(((h) obj).f9200i);
            case 2:
                return Float.valueOf(((j) obj).f9212h);
            case 3:
                return Float.valueOf(((j) obj).f9213i);
            case 4:
                return Float.valueOf(((o) obj).b());
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return null;
            case 8:
                return null;
            case 9:
                return null;
            case 10:
                return Float.valueOf(d0.f15392a.p((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f9189a) {
            case 0:
                h hVar = (h) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                hVar.f9199h = fFloatValue;
                int i7 = (int) (fFloatValue * 5400.0f);
                q2.a aVar = hVar.f9196e;
                ArrayList arrayList = (ArrayList) hVar.f9257b;
                p pVar = (p) arrayList.get(0);
                float f2 = hVar.f9199h * 1520.0f;
                pVar.f9241a = (-20.0f) + f2;
                pVar.f9242b = f2;
                for (int i10 = 0; i10 < 4; i10++) {
                    pVar.f9242b = (aVar.getInterpolation(s.g(i7, h.k[i10], 667)) * 250.0f) + pVar.f9242b;
                    pVar.f9241a = (aVar.getInterpolation(s.g(i7, h.f9190l[i10], 667)) * 250.0f) + pVar.f9241a;
                }
                float f7 = pVar.f9241a;
                float f10 = pVar.f9242b;
                pVar.f9241a = (((f10 - f7) * hVar.f9200i) + f7) / 360.0f;
                pVar.f9242b = f10 / 360.0f;
                for (int i11 = 0; i11 < 4; i11++) {
                    float fG = s.g(i7, h.f9191m[i11], 333);
                    if (fG > 0.0f && fG < 1.0f) {
                        int i12 = i11 + hVar.f9198g;
                        int[] iArr = hVar.f9197f.f9218e;
                        int length = i12 % iArr.length;
                        int length2 = (length + 1) % iArr.length;
                        ((p) arrayList.get(0)).f9243c = lg.b.a(aVar.getInterpolation(fG), Integer.valueOf(iArr[length]), Integer.valueOf(iArr[length2])).intValue();
                        ((t) hVar.f9256a).invalidateSelf();
                    }
                    break;
                }
                ((t) hVar.f9256a).invalidateSelf();
                break;
            case 1:
                ((h) obj).f9200i = ((Float) obj2).floatValue();
                break;
            case 2:
                j jVar = (j) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                jVar.f9212h = fFloatValue2;
                int i13 = (int) (fFloatValue2 * 6000.0f);
                TimeInterpolator timeInterpolator = jVar.f9209e;
                ArrayList arrayList2 = (ArrayList) jVar.f9257b;
                p pVar2 = (p) arrayList2.get(0);
                float f11 = jVar.f9212h * 1080.0f;
                int[] iArr2 = j.f9203l;
                float interpolation = 0.0f;
                for (int i14 : iArr2) {
                    interpolation += timeInterpolator.getInterpolation(s.g(i13, i14, 500)) * 90.0f;
                }
                pVar2.f9246f = f11 + interpolation;
                float interpolation2 = timeInterpolator.getInterpolation(s.g(i13, 0, 3000)) - timeInterpolator.getInterpolation(s.g(i13, 3000, 3000));
                pVar2.f9241a = 0.0f;
                float[] fArr = j.f9204m;
                float fG0 = e4.f.g0(fArr[0], fArr[1], interpolation2);
                pVar2.f9242b = fG0;
                float f12 = jVar.f9213i;
                if (f12 > 0.0f) {
                    pVar2.f9242b = (1.0f - f12) * fG0;
                }
                for (int i15 = 0; i15 < iArr2.length; i15++) {
                    float fG2 = s.g(i13, iArr2[i15], 100);
                    if (fG2 >= 0.0f && fG2 <= 1.0f) {
                        int i16 = i15 + jVar.f9211g;
                        int[] iArr3 = jVar.f9210f.f9218e;
                        int length3 = i16 % iArr3.length;
                        int length4 = (length3 + 1) % iArr3.length;
                        ((p) arrayList2.get(0)).f9243c = lg.b.a(timeInterpolator.getInterpolation(fG2), Integer.valueOf(iArr3[length3]), Integer.valueOf(iArr3[length4])).intValue();
                        ((t) jVar.f9256a).invalidateSelf();
                    }
                    break;
                }
                ((t) jVar.f9256a).invalidateSelf();
                break;
            case 3:
                ((j) obj).f9213i = ((Float) obj2).floatValue();
                break;
            case 4:
                o oVar = (o) obj;
                float fFloatValue3 = ((Float) obj2).floatValue();
                if (oVar.F != fFloatValue3) {
                    oVar.F = fFloatValue3;
                    oVar.invalidateSelf();
                }
                break;
            case 5:
                m3.d dVar = (m3.d) obj;
                PointF pointF = (PointF) obj2;
                dVar.getClass();
                dVar.f15385a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                dVar.f15386b = iRound;
                int i17 = dVar.f15390f + 1;
                dVar.f15390f = i17;
                if (i17 == dVar.f15391g) {
                    d0.a(dVar.f15389e, dVar.f15385a, iRound, dVar.f15387c, dVar.f15388d);
                    dVar.f15390f = 0;
                    dVar.f15391g = 0;
                }
                break;
            case 6:
                m3.d dVar2 = (m3.d) obj;
                PointF pointF2 = (PointF) obj2;
                dVar2.getClass();
                dVar2.f15387c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                dVar2.f15388d = iRound2;
                int i18 = dVar2.f15391g + 1;
                dVar2.f15391g = i18;
                if (dVar2.f15390f == i18) {
                    d0.a(dVar2.f15389e, dVar2.f15385a, dVar2.f15386b, dVar2.f15387c, iRound2);
                    dVar2.f15390f = 0;
                    dVar2.f15391g = 0;
                }
                break;
            case 7:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                d0.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 8:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                d0.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 9:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                d0.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 10:
                d0.f15392a.G((View) obj, ((Float) obj2).floatValue());
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
