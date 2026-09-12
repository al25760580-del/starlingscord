package lq;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends d0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q0 f15191e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f15192i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f15193v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final eq.o f15194w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Function1 f15195x;

    public e0(q0 constructor, List arguments, boolean z5, eq.o memberScope, Function1 refinedTypeFactory) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        Intrinsics.checkNotNullParameter(refinedTypeFactory, "refinedTypeFactory");
        this.f15191e = constructor;
        this.f15192i = arguments;
        this.f15193v = z5;
        this.f15194w = memberScope;
        this.f15195x = refinedTypeFactory;
        if (!(memberScope instanceof nq.g) || (memberScope instanceof nq.m)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + memberScope + '\n' + constructor);
    }

    @Override // lq.d0
    /* JADX INFO: renamed from: A0 */
    public final d0 x0(boolean z5) {
        if (z5 == this.f15193v) {
            return this;
        }
        if (z5) {
            Intrinsics.checkNotNullParameter(this, "delegate");
            return new c0(this, 1);
        }
        Intrinsics.checkNotNullParameter(this, "delegate");
        return new c0(this, 0);
    }

    @Override // lq.d0
    /* JADX INFO: renamed from: B0 */
    public final d0 z0(l0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return newAttributes.isEmpty() ? this : new f0(this, newAttributes);
    }

    @Override // lq.z
    public final eq.o J() {
        return this.f15194w;
    }

    @Override // lq.z
    public final List l0() {
        return this.f15192i;
    }

    @Override // lq.z
    public final l0 q0() {
        l0.f15225e.getClass();
        return l0.f15226i;
    }

    @Override // lq.z
    public final q0 r0() {
        return this.f15191e;
    }

    @Override // lq.z
    public final boolean t0() {
        return this.f15193v;
    }

    @Override // lq.z
    /* JADX INFO: renamed from: v0 */
    public final z y0(mq.f kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        d0 d0Var = (d0) this.f15195x.invoke(kotlinTypeRefiner);
        return d0Var == null ? this : d0Var;
    }

    @Override // lq.d1
    public final d1 y0(mq.f kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        d0 d0Var = (d0) this.f15195x.invoke(kotlinTypeRefiner);
        return d0Var == null ? this : d0Var;
    }
}
