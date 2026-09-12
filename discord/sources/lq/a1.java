package lq;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 extends p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15174e;

    public a1(String str) {
        this.f15174e = str;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    public static /* synthetic */ void F0(int i7) {
        String str = (i7 == 1 || i7 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 1 || i7 == 4) ? 2 : 3];
        if (i7 == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        } else if (i7 == 2) {
            objArr[0] = "delegate";
        } else if (i7 == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i7 != 4) {
            objArr[0] = "newAttributes";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        }
        if (i7 == 1) {
            objArr[1] = "toString";
        } else if (i7 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        } else {
            objArr[1] = "refine";
        }
        if (i7 != 1) {
            if (i7 == 2) {
                objArr[2] = "replaceDelegate";
            } else if (i7 == 3) {
                objArr[2] = "refine";
            } else if (i7 != 4) {
                objArr[2] = "replaceAttributes";
            }
        }
        String str2 = String.format(str, objArr);
        if (i7 != 1 && i7 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // lq.d0
    /* JADX INFO: renamed from: A0 */
    public final d0 x0(boolean z5) {
        throw new IllegalStateException(this.f15174e);
    }

    @Override // lq.d0
    /* JADX INFO: renamed from: B0 */
    public final d0 z0(l0 l0Var) {
        if (l0Var != null) {
            throw new IllegalStateException(this.f15174e);
        }
        F0(0);
        throw null;
    }

    @Override // lq.p
    public final d0 C0() {
        throw new IllegalStateException(this.f15174e);
    }

    @Override // lq.p
    /* JADX INFO: renamed from: D0 */
    public final d0 y0(mq.f fVar) {
        if (fVar != null) {
            return this;
        }
        F0(3);
        throw null;
    }

    @Override // lq.p
    public final p E0(d0 d0Var) {
        if (d0Var != null) {
            throw new IllegalStateException(this.f15174e);
        }
        F0(2);
        throw null;
    }

    @Override // lq.d0
    public final String toString() {
        String str = this.f15174e;
        if (str != null) {
            return str;
        }
        F0(1);
        throw null;
    }

    @Override // lq.p, lq.z
    /* JADX INFO: renamed from: v0 */
    public final z y0(mq.f fVar) {
        if (fVar != null) {
            return this;
        }
        F0(3);
        throw null;
    }

    @Override // lq.d0, lq.d1
    public final /* bridge */ /* synthetic */ d1 x0(boolean z5) {
        x0(z5);
        throw null;
    }

    @Override // lq.p, lq.d1
    public final d1 y0(mq.f fVar) {
        if (fVar != null) {
            return this;
        }
        F0(3);
        throw null;
    }

    @Override // lq.d0, lq.d1
    public final /* bridge */ /* synthetic */ d1 z0(l0 l0Var) {
        z0(l0Var);
        throw null;
    }
}
