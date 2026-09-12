package kh;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f14529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f14530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f14531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f14532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f14533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f14534f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f14535g = new ArrayList();

    public v() {
        d(0.0f, 270.0f, 0.0f);
    }

    public void a(float f2) {
        float f7 = this.f14532d;
        if (f7 == f2) {
            return;
        }
        float f10 = ((f2 - f7) + 360.0f) % 360.0f;
        if (f10 > 180.0f) {
            return;
        }
        float f11 = this.f14530b;
        float f12 = this.f14531c;
        r rVar = new r(f11, f12, f11, f12);
        rVar.f14522f = this.f14532d;
        rVar.f14523g = f10;
        ((ArrayList) this.f14535g).add(new p(rVar));
        this.f14532d = f2;
    }

    public void b(Matrix matrix, Path path) {
        ArrayList arrayList = (ArrayList) this.f14534f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((t) arrayList.get(i7)).a(matrix, path);
        }
    }

    public void c(float f2, float f7) {
        s sVar = new s();
        sVar.f14524b = f2;
        sVar.f14525c = f7;
        ((ArrayList) this.f14534f).add(sVar);
        q qVar = new q(sVar, this.f14530b, this.f14531c);
        float fB = qVar.b() + 270.0f;
        float fB2 = qVar.b() + 270.0f;
        a(fB);
        ((ArrayList) this.f14535g).add(qVar);
        this.f14532d = fB2;
        this.f14530b = f2;
        this.f14531c = f7;
    }

    public void d(float f2, float f7, float f10) {
        this.f14529a = f2;
        this.f14530b = 0.0f;
        this.f14531c = f2;
        this.f14532d = f7;
        this.f14533e = (f7 + f10) % 360.0f;
        ((ArrayList) this.f14534f).clear();
        ((ArrayList) this.f14535g).clear();
    }
}
