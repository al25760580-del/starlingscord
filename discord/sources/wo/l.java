package wo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import lq.w;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f22387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f22388e;

    public l(h delegate, w fqNameFilter) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(fqNameFilter, "fqNameFilter");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(fqNameFilter, "fqNameFilter");
        this.f22387d = delegate;
        this.f22388e = fqNameFilter;
    }

    @Override // wo.h
    public final boolean P(up.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (((Boolean) this.f22388e.invoke(fqName)).booleanValue()) {
            return this.f22387d.P(fqName);
        }
        return false;
    }

    @Override // wo.h
    public final boolean isEmpty() {
        h hVar = this.f22387d;
        if ((hVar instanceof Collection) && ((Collection) hVar).isEmpty()) {
            return false;
        }
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            up.c cVarA = ((b) it.next()).a();
            if (cVarA != null && ((Boolean) this.f22388e.invoke(cVarA)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f22387d) {
            up.c cVarA = ((b) obj).a();
            if (cVarA != null && ((Boolean) this.f22388e.invoke(cVarA)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    @Override // wo.h
    public final b z(up.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (((Boolean) this.f22388e.invoke(fqName)).booleanValue()) {
            return this.f22387d.z(fqName);
        }
        return null;
    }
}
