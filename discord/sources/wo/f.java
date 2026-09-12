package wo;

import java.util.Iterator;
import kotlin.collections.m0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements h {
    @Override // wo.h
    public final boolean P(up.c cVar) {
        return android.support.v4.media.session.b.o(this, cVar);
    }

    @Override // wo.h
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        n0.f14659d.getClass();
        return m0.f14658d;
    }

    public final String toString() {
        return "EMPTY";
    }

    @Override // wo.h
    public final b z(up.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return null;
    }
}
