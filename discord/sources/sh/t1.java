package sh;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class t1 implements th.g, ma.a {
    public final Object E;
    public final Object F;
    public final Object G;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f20194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f20195e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f20196i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f20197v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f20198w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f20199x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f20200y;

    public t1(th.f fVar, po.d dVar, th.f fVar2, th.f fVar3, th.f fVar4, th.f fVar5, th.f fVar6, th.f fVar7, th.f fVar8, th.f fVar9) {
        this.f20194d = fVar;
        this.G = dVar;
        this.f20195e = fVar2;
        this.f20196i = fVar3;
        this.f20197v = fVar4;
        this.f20198w = fVar5;
        this.f20199x = fVar6;
        this.f20200y = fVar7;
        this.E = fVar8;
        this.F = fVar9;
    }

    @Override // th.g
    public Object a() {
        Object objA = ((th.f) this.f20194d).a();
        th.f fVar = new th.f(new pf.b(8, (po.d) this.G));
        Object objA2 = ((th.f) this.f20195e).a();
        Object objA3 = ((th.f) this.f20196i).a();
        th.b bVar = (th.b) ((th.f) this.f20197v).a();
        Object objA4 = ((th.f) this.f20198w).a();
        Object objA5 = ((th.f) this.f20199x).a();
        s sVar = (s) objA;
        p pVar = (p) objA2;
        r rVar = (r) objA3;
        v0 v0Var = (v0) objA4;
        p0 p0Var = (p0) objA5;
        return new s1(sVar, fVar, pVar, rVar, bVar, v0Var, p0Var, new th.f(new pf.b(8, (th.f) this.E)), (g1) ((th.f) this.F).a());
    }

    @Override // ma.a
    public Drawable b(na.c cVar) {
        aa.b bVar;
        com.google.firebase.messaging.r rVar;
        m9.b bVar2;
        o9.c cVar2;
        r9.a aVar;
        o9.a fVar;
        o9.d dVar = null;
        if (!(cVar instanceof na.b)) {
            return null;
        }
        na.b bVar3 = (na.b) cVar;
        synchronized (bVar3) {
            com.google.firebase.messaging.r rVar2 = bVar3.f16525v;
            bVar = rVar2 == null ? null : (aa.b) rVar2.f6611e;
        }
        synchronized (bVar3) {
            rVar = bVar3.f16525v;
        }
        rVar.getClass();
        Bitmap.Config configL = bVar != null ? bVar.l() : null;
        PlatformBitmapFactory platformBitmapFactory = (PlatformBitmapFactory) this.f20198w;
        j8.c cVar3 = (j8.c) this.f20200y;
        aa.b bVar4 = (aa.b) rVar.f6611e;
        ca.a aVarE = ((ca.b) this.f20194d).e(rVar, new Rect(0, 0, bVar4.getWidth(), bVar4.getHeight()));
        pf.b bVar5 = new pf.b(aVarE);
        Integer num = 2;
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            bVar2 = new n9.b(new com.google.firebase.messaging.r(new n9.a(rVar.hashCode(), false), (ga.e) this.f20199x), true);
        } else if (iIntValue == 2) {
            bVar2 = new n9.b(new com.google.firebase.messaging.r(new n9.a(rVar.hashCode(), false), (ga.e) this.f20199x), false);
        } else if (iIntValue != 3) {
            bVar2 = new q8.c();
        } else {
            a5.b0 b0Var = new a5.b0(12, (short) 0);
            b0Var.f173e = -1;
            bVar2 = b0Var;
        }
        r9.a aVar2 = new r9.a(bVar2, aVarE, ((Boolean) cVar3.f13678b).booleanValue());
        Integer num2 = 3;
        int iIntValue2 = num2.intValue();
        if (iIntValue2 > 0) {
            dVar = new o9.d(iIntValue2, 0);
            if (configL == null) {
                configL = Bitmap.Config.ARGB_8888;
            }
            cVar2 = new o9.c(platformBitmapFactory, aVar2, configL, (ExecutorService) this.f20196i);
        } else {
            cVar2 = null;
        }
        if (((Boolean) cVar3.f13678b).booleanValue()) {
            aVar = aVar2;
            fVar = new o9.f((String) rVar.f6610d, bVar5, aVar, new q9.e(platformBitmapFactory, ((Integer) ((j8.c) this.F).f13678b).intValue(), ((Integer) ((j8.c) this.G).f13678b).intValue()), ((Boolean) ((j8.c) this.E).f13678b).booleanValue());
        } else {
            aVar = aVar2;
            fVar = dVar;
        }
        m9.a aVar3 = new m9.a((PlatformBitmapFactory) this.f20198w, bVar2, bVar5, aVar, ((Boolean) cVar3.f13678b).booleanValue(), fVar, cVar2);
        return new s9.b(new l9.a(aVar3, aVar3, (u8.a) this.f20197v, (ScheduledExecutorService) this.f20195e));
    }

    @Override // ma.a
    public boolean n(na.c cVar) {
        return cVar instanceof na.b;
    }

    public t1(ca.b bVar, l8.e eVar, l8.d dVar, RealtimeSinceBootClock realtimeSinceBootClock, PlatformBitmapFactory platformBitmapFactory, ga.e eVar2, t9.a aVar, t9.a aVar2, j8.c cVar, j8.c cVar2, j8.c cVar3, j8.c cVar4) {
        this.f20194d = bVar;
        this.f20195e = eVar;
        this.f20196i = dVar;
        this.f20197v = realtimeSinceBootClock;
        this.f20198w = platformBitmapFactory;
        this.f20199x = eVar2;
        this.f20200y = cVar;
        this.F = cVar3;
        this.E = cVar2;
        this.G = cVar4;
    }
}
