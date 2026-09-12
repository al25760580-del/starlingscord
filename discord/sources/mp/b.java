package mp;

import java.util.Map;
import lq.z;
import vo.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements wo.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f15966a = new b();

    @Override // wo.b
    public final up.c a() {
        vo.f fVarD = bq.e.d(this);
        if (fVarD != null) {
            if (nq.l.f(fVarD)) {
                fVarD = null;
            }
            if (fVarD != null) {
                return bq.e.c(fVarD);
            }
        }
        return null;
    }

    @Override // wo.b
    public final Map b() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // wo.b
    public final n0 d() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // wo.b
    public final z getType() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
