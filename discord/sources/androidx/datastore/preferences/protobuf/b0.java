package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends c0 {
    @Override // androidx.datastore.preferences.protobuf.c0
    public final void a(long j, Object obj) {
        ((b) ((t) n1.f1911d.i(j, obj))).f1821d = false;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final void b(long j, Object obj, Object obj2) {
        m1 m1Var = n1.f1911d;
        t tVarG = (t) m1Var.i(j, obj);
        t tVar = (t) m1Var.i(j, obj2);
        int size = tVarG.size();
        int size2 = tVar.size();
        if (size > 0 && size2 > 0) {
            if (!((b) tVarG).f1821d) {
                tVarG = tVarG.g(size2 + size);
            }
            tVarG.addAll(tVar);
        }
        if (size > 0) {
            tVar = tVarG;
        }
        n1.o(j, obj, tVar);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final List c(long j, Object obj) {
        t tVar = (t) n1.f1911d.i(j, obj);
        if (((b) tVar).f1821d) {
            return tVar;
        }
        int size = tVar.size();
        t tVarG = tVar.g(size == 0 ? 10 : size * 2);
        n1.o(j, obj, tVarG);
        return tVarG;
    }
}
