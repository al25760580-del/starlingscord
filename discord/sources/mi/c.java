package mi;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public interface c {
    default Object b(Class cls) {
        return d(q.a(cls));
    }

    default xi.a c(Class cls) {
        return e(q.a(cls));
    }

    default Object d(q qVar) {
        xi.a aVarE = e(qVar);
        if (aVarE == null) {
            return null;
        }
        return aVarE.get();
    }

    xi.a e(q qVar);

    default Set f(q qVar) {
        return (Set) g(qVar).get();
    }

    xi.a g(q qVar);
}
