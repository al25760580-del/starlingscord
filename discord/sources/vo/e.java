package vo;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements r0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r0 f21802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f21803e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f21804i;

    public e(r0 originalDescriptor, j declarationDescriptor, int i7) {
        Intrinsics.checkNotNullParameter(originalDescriptor, "originalDescriptor");
        Intrinsics.checkNotNullParameter(declarationDescriptor, "declarationDescriptor");
        this.f21802d = originalDescriptor;
        this.f21803e = declarationDescriptor;
        this.f21804i = i7;
    }

    @Override // vo.r0
    public final kq.o T() {
        kq.o oVarT = this.f21802d.T();
        Intrinsics.checkNotNullExpressionValue(oVarT, "getStorageManager(...)");
        return oVarT;
    }

    @Override // vo.r0
    public final boolean X() {
        return true;
    }

    @Override // vo.m
    public final n0 d() {
        n0 n0VarD = this.f21802d.d();
        Intrinsics.checkNotNullExpressionValue(n0VarD, "getSource(...)");
        return n0VarD;
    }

    @Override // vo.l
    public final l g() {
        return this.f21803e;
    }

    @Override // wo.a
    public final wo.h getAnnotations() {
        return this.f21802d.getAnnotations();
    }

    @Override // vo.r0
    public final int getIndex() {
        return this.f21802d.getIndex() + this.f21804i;
    }

    @Override // vo.l
    public final up.e getName() {
        up.e name = this.f21802d.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // vo.r0
    public final List getUpperBounds() {
        List upperBounds = this.f21802d.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        return upperBounds;
    }

    @Override // vo.r0
    public final lq.e1 getVariance() {
        lq.e1 variance = this.f21802d.getVariance();
        Intrinsics.checkNotNullExpressionValue(variance, "getVariance(...)");
        return variance;
    }

    @Override // vo.l
    public final Object i0(n nVar, Object obj) {
        return this.f21802d.i0(nVar, obj);
    }

    @Override // vo.i
    public final lq.d0 j() {
        lq.d0 d0VarJ = this.f21802d.j();
        Intrinsics.checkNotNullExpressionValue(d0VarJ, "getDefaultType(...)");
        return d0VarJ;
    }

    @Override // vo.i
    public final lq.q0 n() {
        lq.q0 q0VarN = this.f21802d.n();
        Intrinsics.checkNotNullExpressionValue(q0VarN, "getTypeConstructor(...)");
        return q0VarN;
    }

    public final String toString() {
        return this.f21802d + "[inner-copy]";
    }

    @Override // vo.r0
    public final boolean u() {
        return this.f21802d.u();
    }

    @Override // vo.l
    public final r0 a() {
        r0 r0VarA = this.f21802d.a();
        Intrinsics.checkNotNullExpressionValue(r0VarA, "getOriginal(...)");
        return r0VarA;
    }
}
