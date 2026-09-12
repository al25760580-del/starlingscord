package o4;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y4.a f17118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f17119e = -1.0f;

    public d(List list) {
        this.f17118d = (y4.a) list.get(0);
    }

    @Override // o4.b
    public final boolean d(float f2) {
        if (this.f17119e == f2) {
            return true;
        }
        this.f17119e = f2;
        return false;
    }

    @Override // o4.b
    public final y4.a f() {
        return this.f17118d;
    }

    @Override // o4.b
    public final boolean isEmpty() {
        return false;
    }

    @Override // o4.b
    public final boolean j(float f2) {
        return !this.f17118d.c();
    }

    @Override // o4.b
    public final float n() {
        return this.f17118d.a();
    }

    @Override // o4.b
    public final float p() {
        return this.f17118d.b();
    }
}
