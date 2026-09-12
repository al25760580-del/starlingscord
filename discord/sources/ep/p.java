package ep;

import kotlin.jvm.internal.Intrinsics;
import or.y0;
import vo.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f8580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8581b;

    public p(y0 delegate, int i7) {
        this.f8581b = i7;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f8580a = delegate;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0231 A[ADDED_TO_REGION, LOOP:1: B:120:0x0231->B:132:0x0262, LOOP_START, PHI: r8
      0x0231: PHI (r8v7 'from' vo.l) = (r8v0 'from' vo.l), (r8v8 'from' vo.l) binds: [B:118:0x022e, B:132:0x0262] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x0233  */
    /* JADX WARN: Code duplicated, block: B:123:0x0236  */
    /* JADX WARN: Code duplicated, block: B:132:0x0262 A[LOOP:1: B:120:0x0231->B:132:0x0262, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:158:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x023a A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [vo.l] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, vo.l, vo.o] */
    /* JADX WARN: Type inference failed for: r7v21, types: [vo.l] */
    /* JADX WARN: Type inference failed for: r7v22, types: [vo.l] */
    /* JADX WARN: Type inference failed for: r7v24, types: [vo.l] */
    public final boolean a(fq.e eVar, vo.o what, vo.l from) {
        vo.l lVarI;
        vo.f fVar;
        switch (this.f8581b) {
            case 0:
                if (from != null) {
                    return q.c(what, from);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1", "isVisible"));
            case 1:
                if (from != null) {
                    return q.b(eVar, what, from);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2", "isVisible"));
            case 2:
                if (from != null) {
                    return q.b(eVar, what, from);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3", "isVisible"));
            case 3:
                if (from == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1", "isVisible"));
                }
                if (xp.e.s(what) && xp.e.f(from) != o0.f21821e) {
                    return vo.p.d(what, from);
                }
                if (what instanceof vo.k) {
                    ((vo.k) what).g();
                }
                while (what != 0) {
                    what = what.g();
                    if (((what instanceof vo.f) && !xp.e.l(what)) || (what instanceof vo.e0)) {
                        if (what != 0) {
                            while (from != null) {
                                if (what != from) {
                                    if (from instanceof vo.e0) {
                                        from = from.g();
                                    } else if ((what instanceof vo.e0) || !((yo.b0) ((vo.e0) what)).f23420x.equals(((yo.b0) ((vo.e0) from)).f23420x) || !xp.e.d(from).equals(xp.e.d(what))) {
                                    }
                                }
                                return true;
                            }
                        }
                        return false;
                    }
                }
                if (what != 0) {
                    while (from != null) {
                        if (what != from) {
                            if (from instanceof vo.e0) {
                                from = from.g();
                            } else if (what instanceof vo.e0) {
                            }
                        }
                        return true;
                    }
                }
                return false;
            case 4:
                if (from == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2", "isVisible"));
                }
                if (vo.p.f21824a.a(eVar, what, from)) {
                    if (eVar == vo.p.f21833l) {
                        return true;
                    }
                    if (eVar != vo.p.k && (lVarI = xp.e.i(what, vo.f.class, true)) != null && (eVar instanceof fq.d)) {
                        return ((fq.d) eVar).f9362d.a().equals(lVarI.a());
                    }
                }
                return false;
            case 5:
                if (from == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3", "isVisible"));
                }
                vo.f fVar2 = (vo.f) xp.e.i(what, vo.f.class, true);
                vo.f fVar3 = (vo.f) xp.e.i(from, vo.f.class, false);
                if (fVar3 != null) {
                    if (fVar2 != null && xp.e.l(fVar2) && (fVar = (vo.f) xp.e.i(fVar2, vo.f.class, true)) != null && xp.e.r(fVar3.j(), fVar.a())) {
                        return true;
                    }
                    ?? T = what instanceof vo.d ? xp.e.t((vo.d) what) : what;
                    vo.f fVar4 = (vo.f) xp.e.i(T, vo.f.class, true);
                    if (fVar4 != null) {
                        if (xp.e.r(fVar3.j(), fVar4.a()) && eVar != vo.p.f21834m) {
                            if (!(T instanceof vo.d) || (T instanceof vo.k) || eVar == vo.p.f21833l) {
                                return true;
                            }
                            if (eVar != vo.p.k && eVar != null) {
                                lq.z type = eVar.getType();
                                if (xp.e.r(type, fVar3)) {
                                    return true;
                                }
                                Intrinsics.checkNotNullParameter(type, "<this>");
                                type.w0();
                            }
                        }
                        return a(eVar, what, fVar3.g());
                    }
                }
                return false;
            case 6:
                if (from == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4", "isVisible"));
                }
                if (!xp.e.d(from).M(xp.e.d(what))) {
                    return false;
                }
                vo.p.f21835n.getClass();
                Intrinsics.checkNotNullParameter(what, "what");
                Intrinsics.checkNotNullParameter(from, "from");
                return true;
            case 7:
                if (from != null) {
                    return true;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5", "isVisible"));
            case 8:
                if (from == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6", "isVisible"));
                }
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            case 9:
                if (from == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7", "isVisible"));
                }
                throw new IllegalStateException("Visibility is unknown yet");
            case 10:
                if (from != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8", "isVisible"));
            default:
                if (from != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9", "isVisible"));
        }
    }

    public final String toString() {
        return this.f8580a.s();
    }
}
