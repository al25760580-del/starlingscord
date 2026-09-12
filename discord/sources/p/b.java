package p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f17710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f17711e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17712i;

    public b(c cVar, c cVar2, int i7) {
        this.f17712i = i7;
        this.f17710d = cVar2;
        this.f17711e = cVar;
    }

    @Override // p.e
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.f17710d == cVar && cVar == this.f17711e) {
            this.f17711e = null;
            this.f17710d = null;
        }
        c cVar3 = this.f17710d;
        if (cVar3 == cVar) {
            switch (this.f17712i) {
                case 0:
                    cVar2 = cVar3.f17716v;
                    break;
                default:
                    cVar2 = cVar3.f17715i;
                    break;
            }
            this.f17710d = cVar2;
        }
        c cVar4 = this.f17711e;
        if (cVar4 == cVar) {
            c cVar5 = this.f17710d;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.f17711e = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.f17712i) {
            case 0:
                return cVar.f17715i;
            default:
                return cVar.f17716v;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17711e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f17711e;
        c cVar2 = this.f17710d;
        this.f17711e = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
