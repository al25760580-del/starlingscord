package x8;

import com.facebook.common.internal.Supplier;
import java.util.ArrayList;
import n8.i;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22659a;

    public f(ArrayList arrayList) {
        i.b("List of suppliers is empty!", !arrayList.isEmpty());
        this.f22659a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return i.f(this.f22659a, ((f) obj).f22659a);
        }
        return false;
    }

    @Override // com.facebook.common.internal.Supplier
    public final Object get() {
        return new e(this);
    }

    public final int hashCode() {
        return this.f22659a.hashCode();
    }

    public final String toString() {
        n8.f fVarJ = i.j(this);
        fVarJ.H(this.f22659a, "list");
        return fVarJ.toString();
    }
}
