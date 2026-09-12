package yo;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements lq.q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f23424a;

    public d(e eVar) {
        this.f23424a = eVar;
    }

    @Override // lq.q0
    public final so.i f() {
        return bq.e.e(this.f23424a);
    }

    @Override // lq.q0
    public final vo.i g() {
        return this.f23424a;
    }

    @Override // lq.q0
    public final List getParameters() {
        List list = ((jq.v) this.f23424a).O;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("typeConstructorParameters");
        return null;
    }

    @Override // lq.q0
    public final Collection h() {
        Collection collectionH = ((jq.v) this.f23424a).D0().r0().h();
        Intrinsics.checkNotNullExpressionValue(collectionH, "getSupertypes(...)");
        return collectionH;
    }

    @Override // lq.q0
    public final boolean i() {
        return true;
    }

    public final String toString() {
        return "[typealias " + this.f23424a.getName().b() + ']';
    }
}
