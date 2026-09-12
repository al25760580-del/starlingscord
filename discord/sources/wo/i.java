package wo;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.m0;
import kotlin.collections.n0;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import vo.f0;
import xq.r;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f22381e;

    public i(int i7, List delegates) {
        this.f22380d = i7;
        switch (i7) {
            case 1:
                Intrinsics.checkNotNullParameter(delegates, "delegates");
                this.f22381e = delegates;
                break;
            default:
                Intrinsics.checkNotNullParameter(delegates, "annotations");
                this.f22381e = delegates;
                break;
        }
    }

    @Override // wo.h
    public final boolean P(up.c fqName) {
        switch (this.f22380d) {
            case 0:
                return android.support.v4.media.session.b.o(this, fqName);
            case 1:
                Intrinsics.checkNotNullParameter(fqName, "fqName");
                Iterator it = ((Iterable) CollectionsKt.C((List) this.f22381e).f3779b).iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).P(fqName)) {
                        return true;
                    }
                }
                return false;
            default:
                return android.support.v4.media.session.b.o(this, fqName);
        }
    }

    @Override // wo.h
    public final boolean isEmpty() {
        switch (this.f22380d) {
            case 0:
                return ((List) this.f22381e).isEmpty();
            case 1:
                List list = (List) this.f22381e;
                if (list != null && list.isEmpty()) {
                    return true;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((h) it.next()).isEmpty()) {
                        return false;
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f22380d) {
            case 0:
                return ((List) this.f22381e).iterator();
            case 1:
                return new xq.d(r.k(CollectionsKt.C((List) this.f22381e), k.f22386d));
            default:
                n0.f14659d.getClass();
                return m0.f14658d;
        }
    }

    public String toString() {
        switch (this.f22380d) {
            case 0:
                return ((List) this.f22381e).toString();
            default:
                return super.toString();
        }
    }

    @Override // wo.h
    public final b z(up.c fqName) {
        switch (this.f22380d) {
            case 0:
                return android.support.v4.media.session.b.h(this, fqName);
            case 1:
                Intrinsics.checkNotNullParameter(fqName, "fqName");
                return (b) r.j(r.o(CollectionsKt.C((List) this.f22381e), new f0(fqName, 1)));
            default:
                Intrinsics.checkNotNullParameter(fqName, "fqName");
                if (Intrinsics.areEqual(fqName, (up.c) this.f22381e)) {
                    return mp.b.f15966a;
                }
                return null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(h[] delegates) {
        this(1, y.H(delegates));
        this.f22380d = 1;
        Intrinsics.checkNotNullParameter(delegates, "delegates");
    }

    public i(up.c fqNameToMatch) {
        this.f22380d = 2;
        Intrinsics.checkNotNullParameter(fqNameToMatch, "fqNameToMatch");
        this.f22381e = fqNameToMatch;
    }
}
