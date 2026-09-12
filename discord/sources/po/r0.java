package po;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18138d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u0 f18139e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s0 f18140i;

    public r0(s0 s0Var, u0 u0Var) {
        this.f18140i = s0Var;
        this.f18139e = u0Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0043  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        switch (this.f18138d) {
            case 0:
                u1 u1Var = this.f18140i.f18152c;
                KProperty kProperty = s0.f18151h[0];
                ap.b bVar = (ap.b) u1Var.invoke();
                if (bVar != null) {
                    gs.o oVar = bVar.f2857b;
                    str = (String) oVar.f10252h;
                    if (((op.a) oVar.f10247c) != op.a.MULTIFILE_CLASS_PART) {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (str == null || str.length() <= 0) {
                    return null;
                }
                return this.f18139e.f18163e.getClassLoader().loadClass(kotlin.text.x.m(str, '/', '.'));
            default:
                u1 u1Var2 = this.f18140i.f18153d;
                KProperty kProperty2 = s0.f18151h[1];
                Object objInvoke = u1Var2.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
                return this.f18139e.g((eq.o) objInvoke, e0.f18083d);
        }
    }

    public r0(u0 u0Var, s0 s0Var) {
        this.f18139e = u0Var;
        this.f18140i = s0Var;
    }
}
