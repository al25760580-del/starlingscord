package ep;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements xp.f {
    @Override // xp.f
    public final int a() {
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    /* JADX WARN: Code duplicated, block: B:16:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b2 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xp.f
    public final int b(vo.b superDescriptor, vo.b subDescriptor, vo.f fVar) {
        boolean z5;
        vo.u uVar;
        Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
        Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
        if ((superDescriptor instanceof vo.d) && (subDescriptor instanceof vo.u) && !so.i.A(subDescriptor)) {
            int i7 = e.f8531l;
            vo.u uVar2 = (vo.u) subDescriptor;
            yo.l lVar = (yo.l) uVar2;
            up.e name = lVar.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (e.b(name)) {
                vo.d dVarQ = ls.d.q((vo.d) superDescriptor);
                z5 = superDescriptor instanceof vo.u;
                if (z5) {
                    uVar = (vo.u) superDescriptor;
                } else {
                    uVar = null;
                }
                if (uVar == null) {
                    if (fVar instanceof gp.c) {
                        if (io.sentry.config.a.n(superDescriptor, subDescriptor)) {
                            return 3;
                        }
                    } else if (io.sentry.config.a.n(superDescriptor, subDescriptor)) {
                        return 3;
                    }
                } else if (fVar instanceof gp.c) {
                    if (io.sentry.config.a.n(superDescriptor, subDescriptor)) {
                        return 3;
                    }
                } else if (io.sentry.config.a.n(superDescriptor, subDescriptor)) {
                    return 3;
                }
            } else {
                ArrayList arrayList = j0.f8559a;
                up.e name2 = lVar.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                Intrinsics.checkNotNullParameter(name2, "<this>");
                if (j0.j.contains(name2)) {
                    vo.d dVarQ2 = ls.d.q((vo.d) superDescriptor);
                    z5 = superDescriptor instanceof vo.u;
                    if (z5) {
                        uVar = (vo.u) superDescriptor;
                    } else {
                        uVar = null;
                    }
                    if ((uVar == null && uVar2.f0() == uVar.f0()) || (dVarQ2 != null && uVar2.f0())) {
                        if ((fVar instanceof gp.c) || uVar2.Q() != null || dVarQ2 == null || ls.d.r(fVar, dVarQ2)) {
                            if (io.sentry.config.a.n(superDescriptor, subDescriptor)) {
                                return 3;
                            }
                        } else if ((dVarQ2 instanceof vo.u) && z5 && e.a((vo.u) dVarQ2) != null) {
                            String strF = com.facebook.imagepipeline.nativecode.b.f(uVar2, 2);
                            vo.u uVarA = ((vo.u) superDescriptor).a();
                            Intrinsics.checkNotNullExpressionValue(uVarA, "getOriginal(...)");
                            if (Intrinsics.areEqual(strF, com.facebook.imagepipeline.nativecode.b.f(uVarA, 2))) {
                                if (io.sentry.config.a.n(superDescriptor, subDescriptor)) {
                                    return 3;
                                }
                            }
                        }
                    }
                } else if (io.sentry.config.a.n(superDescriptor, subDescriptor)) {
                    return 3;
                }
            }
        } else if (io.sentry.config.a.n(superDescriptor, subDescriptor)) {
            return 3;
        }
        return 2;
    }
}
