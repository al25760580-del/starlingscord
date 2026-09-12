package hq;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import pp.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements l, n, m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f11037c = new k(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f11038d = new k(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f11039e = new k(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f11040f = new k(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f11041g = new k(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k f11042h = new k(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11043b;

    public /* synthetic */ k(int i7) {
        this.f11043b = i7;
    }

    public static vo.y e(pp.c0 c0Var) {
        int i7 = c0Var == null ? -1 : w.f11076a[c0Var.ordinal()];
        if (i7 == 1) {
            return vo.y.f21852e;
        }
        if (i7 == 2) {
            return vo.y.f21854v;
        }
        if (i7 != 3) {
            return i7 != 4 ? vo.y.f21852e : vo.y.f21853i;
        }
        return vo.y.f21855w;
    }

    @Override // hq.m
    public void b(vo.d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1", "reportCannotInferVisibility"));
        }
    }

    @Override // hq.n
    public lq.z c(s0 proto, String flexibleId, lq.d0 lowerBound, lq.d0 upperBound) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(flexibleId, "flexibleId");
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        throw new IllegalArgumentException("This method should not be used.");
    }

    @Override // hq.l
    public Boolean d() {
        switch (this.f11043b) {
            case 1:
                return null;
            default:
                return Boolean.TRUE;
        }
    }

    @Override // hq.m
    public void a(vo.f fVar, ArrayList arrayList) {
    }
}
