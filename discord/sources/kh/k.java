package kh;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends com.facebook.imagepipeline.nativecode.b {
    @Override // com.facebook.imagepipeline.nativecode.b
    public final void n(v vVar, float f2, float f7) {
        float f10 = f7 * f2;
        vVar.d(f10, 180.0f, 90.0f);
        float f11 = f10 * 2.0f;
        r rVar = new r(0.0f, 0.0f, f11, f11);
        rVar.f14522f = 180.0f;
        rVar.f14523g = 90.0f;
        ((ArrayList) vVar.f14534f).add(rVar);
        p pVar = new p(rVar);
        vVar.a(180.0f);
        ((ArrayList) vVar.f14535g).add(pVar);
        vVar.f14532d = 270.0f;
        float f12 = (0.0f + f11) * 0.5f;
        float f13 = (f11 - 0.0f) / 2.0f;
        double d6 = 270.0f;
        vVar.f14530b = (((float) Math.cos(Math.toRadians(d6))) * f13) + f12;
        vVar.f14531c = (f13 * ((float) Math.sin(Math.toRadians(d6)))) + f12;
    }
}
