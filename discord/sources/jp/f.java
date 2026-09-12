package jp;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lq.d0;
import vo.p;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14006d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vo.f f14007e;

    public f(vo.f fVar, g gVar, d0 d0Var, a aVar) {
        this.f14007e = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z5;
        switch (this.f14006d) {
            case 0:
                mq.f kotlinTypeRefiner = (mq.f) obj;
                Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
                up.b classId = bq.e.f(this.f14007e);
                if (classId == null) {
                    return null;
                }
                kotlinTypeRefiner.getClass();
                Intrinsics.checkNotNullParameter(classId, "classId");
                return null;
            default:
                vo.d dVar = (vo.d) obj;
                if (p.e(dVar.getVisibility())) {
                    z5 = false;
                } else {
                    vo.f fVar = this.f14007e;
                    if (fVar == null) {
                        p.a(3);
                        throw null;
                    }
                    if (p.c(p.f21833l, dVar, fVar) == null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                }
                return Boolean.valueOf(z5);
        }
    }

    public f(vo.f fVar) {
        this.f14007e = fVar;
    }
}
