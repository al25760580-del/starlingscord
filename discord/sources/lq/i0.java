package lq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15214a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15216c;

    public i0(z zVar, e1 e1Var) {
        if (e1Var == null) {
            e(0);
            throw null;
        }
        if (zVar == null) {
            e(1);
            throw null;
        }
        this.f15215b = e1Var;
        this.f15216c = zVar;
    }

    public static /* synthetic */ void e(int i7) {
        String str = (i7 == 4 || i7 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 4 || i7 == 5) ? 2 : 3];
        switch (i7) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i7 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i7 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i7 == 3) {
            objArr[2] = "replaceType";
        } else if (i7 != 4 && i7 != 5) {
            if (i7 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i7 != 4 && i7 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // lq.t0
    public final e1 a() {
        switch (this.f15214a) {
            case 0:
                return e1.OUT_VARIANCE;
            default:
                e1 e1Var = (e1) this.f15215b;
                if (e1Var != null) {
                    return e1Var;
                }
                e(4);
                throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // lq.t0
    public final z b() {
        switch (this.f15214a) {
            case 0:
                return (z) this.f15216c.getValue();
            default:
                z zVar = (z) this.f15216c;
                if (zVar != null) {
                    return zVar;
                }
                e(5);
                throw null;
        }
    }

    @Override // lq.t0
    public final boolean c() {
        switch (this.f15214a) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // lq.t0
    public final t0 d(mq.f kotlinTypeRefiner) {
        switch (this.f15214a) {
            case 0:
                Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
                return this;
            default:
                if (kotlinTypeRefiner == null) {
                    e(6);
                    throw null;
                }
                e1 e1Var = (e1) this.f15215b;
                z type = (z) this.f15216c;
                kotlinTypeRefiner.getClass();
                Intrinsics.checkNotNullParameter(type, "type");
                return new i0(type, e1Var);
        }
    }

    public i0(vo.r0 typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        this.f15215b = typeParameter;
        this.f15216c = rn.l.a(rn.m.f19486e, new ep.x(12, this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i0(z zVar) {
        this(zVar, e1.INVARIANT);
        if (zVar != null) {
        } else {
            e(2);
            throw null;
        }
    }
}
