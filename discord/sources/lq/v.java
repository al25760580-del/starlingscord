package lq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vo.r0[] f15254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0[] f15255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15256d;

    public v(vo.r0[] parameters, t0[] arguments, boolean z5) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.f15254b = parameters;
        this.f15255c = arguments;
        this.f15256d = z5;
        int length = parameters.length;
        int length2 = arguments.length;
    }

    @Override // lq.w0
    public final boolean b() {
        return this.f15256d;
    }

    @Override // lq.w0
    public final t0 e(z key) {
        Intrinsics.checkNotNullParameter(key, "key");
        vo.i iVarG = key.r0().g();
        vo.r0 r0Var = iVarG instanceof vo.r0 ? (vo.r0) iVarG : null;
        if (r0Var != null) {
            int index = r0Var.getIndex();
            vo.r0[] r0VarArr = this.f15254b;
            if (index < r0VarArr.length && Intrinsics.areEqual(r0VarArr[index].n(), r0Var.n())) {
                return this.f15255c[index];
            }
        }
        return null;
    }

    @Override // lq.w0
    public final boolean f() {
        return this.f15255c.length == 0;
    }
}
