package bp;

import java.lang.reflect.Type;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 implements lp.d {
    @Override // lp.b
    public d a(up.c fqName) {
        Object next;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(c.a(gn.h.B(gn.h.z(((d) next).f3344a))).a(), fqName)) {
                return (d) next;
            }
        }
        next = null;
        return (d) next;
    }

    public abstract Type b();

    public final boolean equals(Object obj) {
        return (obj instanceof b0) && Intrinsics.areEqual(b(), ((b0) obj).b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
