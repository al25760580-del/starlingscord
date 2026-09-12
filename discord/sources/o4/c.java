package o4;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f17114d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public y4.a f17116i = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f17117v = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y4.a f17115e = a(0.0f);

    public c(List list) {
        this.f17114d = list;
    }

    public final y4.a a(float f2) {
        List list = this.f17114d;
        y4.a aVar = (y4.a) kk.b.f(1, list);
        if (f2 >= aVar.b()) {
            return aVar;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            y4.a aVar2 = (y4.a) list.get(size);
            if (this.f17115e != aVar2 && f2 >= aVar2.b() && f2 < aVar2.a()) {
                return aVar2;
            }
        }
        return (y4.a) list.get(0);
    }

    @Override // o4.b
    public final boolean d(float f2) {
        y4.a aVar = this.f17116i;
        y4.a aVar2 = this.f17115e;
        if (aVar == aVar2 && this.f17117v == f2) {
            return true;
        }
        this.f17116i = aVar2;
        this.f17117v = f2;
        return false;
    }

    @Override // o4.b
    public final y4.a f() {
        return this.f17115e;
    }

    @Override // o4.b
    public final boolean isEmpty() {
        return false;
    }

    @Override // o4.b
    public final boolean j(float f2) {
        y4.a aVar = this.f17115e;
        if (f2 >= aVar.b() && f2 < aVar.a()) {
            return !this.f17115e.c();
        }
        this.f17115e = a(f2);
        return true;
    }

    @Override // o4.b
    public final float n() {
        return ((y4.a) kk.b.f(1, this.f17114d)).a();
    }

    @Override // o4.b
    public final float p() {
        return ((y4.a) this.f17114d.get(0)).b();
    }
}
