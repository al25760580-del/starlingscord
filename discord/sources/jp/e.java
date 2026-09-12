package jp;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lq.b1;
import lq.e1;
import lq.i0;
import lq.t0;
import lq.z;
import rn.n;
import vo.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public static t0 a(r0 parameter, a typeAttr, io.sentry.internal.debugmeta.c typeParameterUpperBoundEraser, z erasedUpperBound) {
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
        Intrinsics.checkNotNullParameter(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        Intrinsics.checkNotNullParameter(erasedUpperBound, "erasedUpperBound");
        if (typeAttr == null) {
            Intrinsics.checkNotNullParameter(parameter, "parameter");
            Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
            Intrinsics.checkNotNullParameter(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
            Intrinsics.checkNotNullParameter(erasedUpperBound, "erasedUpperBound");
            return new i0(erasedUpperBound, e1.OUT_VARIANCE);
        }
        if (!typeAttr.f13992c) {
            typeAttr = typeAttr.b(b.f13996d);
        }
        int iOrdinal = typeAttr.f13991b.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                return new i0(erasedUpperBound, e1.INVARIANT);
            }
            throw new n();
        }
        if (!parameter.getVariance().f15201e) {
            return new i0(bq.e.e(parameter).o(), e1.INVARIANT);
        }
        List parameters = erasedUpperBound.r0().getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        if (!parameters.isEmpty()) {
            return new i0(erasedUpperBound, e1.OUT_VARIANCE);
        }
        t0 t0VarK = b1.k(parameter, typeAttr);
        Intrinsics.checkNotNull(t0VarK);
        return t0VarK;
    }
}
