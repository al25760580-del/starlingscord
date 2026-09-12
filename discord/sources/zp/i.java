package zp;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lq.d0;
import mo.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final up.b f24067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final up.e f24068c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(up.b enumClassId, up.e enumEntryName) {
        super(new Pair(enumClassId, enumEntryName));
        Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
        Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
        this.f24067b = enumClassId;
        this.f24068c = enumEntryName;
    }

    @Override // zp.g
    public final lq.z a(vo.z module) {
        d0 d0VarJ;
        Intrinsics.checkNotNullParameter(module, "module");
        up.b bVar = this.f24067b;
        vo.f fVarO = c0.o(module, bVar);
        if (fVarO != null) {
            int i7 = xp.e.f22999a;
            if (!xp.e.n(fVarO, vo.g.f21810i)) {
                fVarO = null;
            }
            if (fVarO != null && (d0VarJ = fVarO.j()) != null) {
                return d0VarJ;
            }
        }
        return nq.l.c(nq.k.ERROR_ENUM_TYPE, bVar.toString(), this.f24068c.f21269d);
    }

    @Override // zp.g
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f24067b.f());
        sb2.append('.');
        sb2.append(this.f24068c);
        return sb2.toString();
    }
}
