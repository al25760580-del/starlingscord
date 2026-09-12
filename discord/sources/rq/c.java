package rq;

import kotlin.jvm.internal.Intrinsics;
import lq.e1;
import lq.i0;
import lq.q0;
import lq.r0;
import lq.t0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends r0 {
    @Override // lq.r0
    public final t0 h(q0 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        yp.b bVar = key instanceof yp.b ? (yp.b) key : null;
        if (bVar == null) {
            return null;
        }
        if (bVar.a().c()) {
            return new i0(bVar.a().b(), e1.OUT_VARIANCE);
        }
        return bVar.a();
    }
}
