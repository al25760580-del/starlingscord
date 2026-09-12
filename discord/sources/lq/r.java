package lq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f15245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f15246c;

    public r(w0 w0Var, w0 w0Var2) {
        this.f15245b = w0Var;
        this.f15246c = w0Var2;
    }

    @Override // lq.w0
    public final boolean a() {
        return this.f15245b.a() || this.f15246c.a();
    }

    @Override // lq.w0
    public final boolean b() {
        return this.f15245b.b() || this.f15246c.b();
    }

    @Override // lq.w0
    public final wo.h d(wo.h annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return this.f15246c.d(this.f15245b.d(annotations));
    }

    @Override // lq.w0
    public final t0 e(z key) {
        Intrinsics.checkNotNullParameter(key, "key");
        t0 t0VarE = this.f15245b.e(key);
        return t0VarE == null ? this.f15246c.e(key) : t0VarE;
    }

    @Override // lq.w0
    public final z g(z topLevelType, e1 position) {
        Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
        Intrinsics.checkNotNullParameter(position, "position");
        return this.f15246c.g(this.f15245b.g(topLevelType, position), position);
    }
}
