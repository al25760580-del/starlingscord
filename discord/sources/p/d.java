package p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f17717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17718e = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f f17719i;

    public d(f fVar) {
        this.f17719i = fVar;
    }

    @Override // p.e
    public final void a(c cVar) {
        c cVar2 = this.f17717d;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f17716v;
            this.f17717d = cVar3;
            this.f17718e = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f17718e) {
            return this.f17719i.f17720d != null;
        }
        c cVar = this.f17717d;
        return (cVar == null || cVar.f17715i == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f17718e) {
            this.f17718e = false;
            this.f17717d = this.f17719i.f17720d;
        } else {
            c cVar = this.f17717d;
            this.f17717d = cVar != null ? cVar.f17715i : null;
        }
        return this.f17717d;
    }
}
