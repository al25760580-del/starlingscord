package sq;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lq.b1;
import lq.d0;
import lq.d1;
import lq.i0;
import lq.l0;
import mo.c0;
import vo.r0;
import vo.z;
import yo.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f20515b = new k(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f20516c = new k(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20517a;

    public /* synthetic */ k(int i7) {
        this.f20517a = i7;
    }

    @Override // sq.e
    public final boolean a(gp.e functionDescriptor) {
        d0 d0VarS;
        switch (this.f20517a) {
            case 0:
                Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
                q0 q0Var = (q0) functionDescriptor.L().get(1);
                so.m mVar = so.n.f20358d;
                Intrinsics.checkNotNull(q0Var);
                z module = bq.e.j(q0Var);
                mVar.getClass();
                Intrinsics.checkNotNullParameter(module, "module");
                vo.f fVarO = c0.o(module, so.o.R);
                if (fVarO == null) {
                    d0VarS = null;
                } else {
                    l0.f15225e.getClass();
                    l0 l0Var = l0.f15226i;
                    List parameters = fVarO.n().getParameters();
                    Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                    Object objZ = CollectionsKt.Z(parameters);
                    Intrinsics.checkNotNullExpressionValue(objZ, "single(...)");
                    d0VarS = lq.c.s(l0Var, fVarO, kotlin.collections.c0.c(new i0((r0) objZ)));
                }
                if (d0VarS == null) {
                    return false;
                }
                lq.z type = q0Var.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                Intrinsics.checkNotNullParameter(type, "<this>");
                if (type == null) {
                    b1.a(2);
                    throw null;
                }
                d1 d1VarG = b1.g(type, false);
                Intrinsics.checkNotNullExpressionValue(d1VarG, "makeNotNullable(...)");
                return c9.a.A(d0VarS, d1VarG);
            default:
                Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
                List<q0> listL = functionDescriptor.L();
                Intrinsics.checkNotNullExpressionValue(listL, "getValueParameters(...)");
                if (listL == null || !listL.isEmpty()) {
                    for (q0 q0Var2 : listL) {
                        Intrinsics.checkNotNull(q0Var2);
                        if (bq.e.a(q0Var2) || q0Var2.H != null) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // sq.e
    public final String b(gp.e eVar) {
        switch (this.f20517a) {
            case 0:
                break;
        }
        return zs.a.C(this, eVar);
    }

    @Override // sq.e
    public final String getDescription() {
        switch (this.f20517a) {
            case 0:
                return "second parameter must be of type KProperty<*> or its supertype";
            default:
                return "should not have varargs or parameters with default values";
        }
    }
}
