package po;

import kotlin.reflect.KFunction;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i1 extends s implements KFunction {
    @Override // po.s
    public final g0 c() {
        return j().f18115y;
    }

    @Override // po.s
    public final qo.g d() {
        return null;
    }

    @Override // po.s
    public final boolean h() {
        return j().h();
    }

    public abstract vo.k0 i();

    @Override // kotlin.reflect.KFunction
    public final boolean isExternal() {
        return ((yo.f0) i()).f23432y;
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isInfix() {
        i().getClass();
        return false;
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isInline() {
        return ((yo.f0) i()).G;
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isOperator() {
        i().getClass();
        return false;
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isSuspend() {
        i().getClass();
        return false;
    }

    public abstract n1 j();
}
