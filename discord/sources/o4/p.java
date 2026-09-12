package o4;

import android.graphics.PointF;
import kh.v;
import l4.g0;

/* JADX INFO: loaded from: classes.dex */
public final class p extends e4.c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ v f17153v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e4.c f17154w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q4.b f17155x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(v vVar, e4.c cVar, q4.b bVar) {
        super(24);
        this.f17153v = vVar;
        this.f17154w = cVar;
        this.f17155x = bVar;
    }

    @Override // e4.c
    public final Object J(v vVar) {
        float f2 = vVar.f14529a;
        float f7 = vVar.f14530b;
        String str = ((q4.b) vVar.f14534f).f18601a;
        String str2 = ((q4.b) vVar.f14535g).f18601a;
        float f10 = vVar.f14531c;
        float f11 = vVar.f14532d;
        float f12 = vVar.f14533e;
        v vVar2 = this.f17153v;
        vVar2.f14529a = f2;
        vVar2.f14530b = f7;
        vVar2.f14534f = str;
        vVar2.f14535g = str2;
        vVar2.f14531c = f10;
        vVar2.f14532d = f11;
        vVar2.f14533e = f12;
        String str3 = (String) ((g0) this.f17154w.f7967i);
        q4.b bVar = (q4.b) (vVar.f14532d == 1.0f ? vVar.f14535g : vVar.f14534f);
        String str4 = bVar.f18602b;
        float f13 = bVar.f18603c;
        int i7 = bVar.f18604d;
        int i10 = bVar.f18605e;
        float f14 = bVar.f18606f;
        float f15 = bVar.f18607g;
        int i11 = bVar.f18608h;
        int i12 = bVar.f18609i;
        float f16 = bVar.j;
        boolean z5 = bVar.k;
        PointF pointF = bVar.f18610l;
        PointF pointF2 = bVar.f18611m;
        q4.b bVar2 = this.f17155x;
        bVar2.f18601a = str3;
        bVar2.f18602b = str4;
        bVar2.f18603c = f13;
        bVar2.f18604d = i7;
        bVar2.f18605e = i10;
        bVar2.f18606f = f14;
        bVar2.f18607g = f15;
        bVar2.f18608h = i11;
        bVar2.f18609i = i12;
        bVar2.j = f16;
        bVar2.k = z5;
        bVar2.f18610l = pointF;
        bVar2.f18611m = pointF2;
        return bVar2;
    }
}
