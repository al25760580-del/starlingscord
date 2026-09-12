package w;

import java.util.Collection;
import java.util.Set;
import kotlin.collections.k;
import kotlin.collections.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends l {
    static {
        e eVar = e.f21968b;
        e eVar2 = e.f21968b;
    }

    @Override // kotlin.collections.l
    public final Set a() {
        return new c(this, 0);
    }

    @Override // kotlin.collections.l
    public final Set b() {
        return new c(this, 1);
    }

    @Override // kotlin.collections.l
    public final int c() {
        return 0;
    }

    @Override // kotlin.collections.l, java.util.Map
    public boolean containsKey(Object obj) {
        e eVar = e.f21968b;
        if (obj == null) {
            return false;
        }
        obj.hashCode();
        return false;
    }

    @Override // kotlin.collections.l
    public final Collection d() {
        return new k(2, this);
    }

    @Override // kotlin.collections.l, java.util.Map
    public Object get(Object obj) {
        e eVar = e.f21968b;
        if (obj == null) {
            return null;
        }
        obj.hashCode();
        return null;
    }
}
