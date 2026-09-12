package hj;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends a0 {
    @Override // hj.a0
    public final void a(long j, Object obj) {
        c cVar = (c) ((s) c1.f10811c.i(j, obj));
        if (cVar.f10806d) {
            cVar.f10806d = false;
        }
    }

    @Override // hj.a0
    public final void b(long j, Object obj, Object obj2) {
        b1 b1Var = c1.f10811c;
        s sVarG = (s) b1Var.i(j, obj);
        s sVar = (s) b1Var.i(j, obj2);
        int size = sVarG.size();
        int size2 = sVar.size();
        if (size > 0 && size2 > 0) {
            if (!((c) sVarG).f10806d) {
                sVarG = sVarG.g(size2 + size);
            }
            sVarG.addAll(sVar);
        }
        if (size > 0) {
            sVar = sVarG;
        }
        c1.o(j, obj, sVar);
    }

    @Override // hj.a0
    public final List c(long j, Object obj) {
        s sVar = (s) c1.f10811c.i(j, obj);
        if (((c) sVar).f10806d) {
            return sVar;
        }
        int size = sVar.size();
        s sVarG = sVar.g(size == 0 ? 10 : size * 2);
        c1.o(j, obj, sVarG);
        return sVarG;
    }
}
