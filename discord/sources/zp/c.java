package zp;

import kotlin.jvm.internal.Intrinsics;
import lq.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24063b = 1;

    public /* synthetic */ c(Object obj) {
        super(obj);
    }

    @Override // zp.g
    public final lq.z a(vo.z module) {
        switch (this.f24063b) {
            case 0:
                Intrinsics.checkNotNullParameter(module, "module");
                so.i iVarF = module.f();
                iVarF.getClass();
                d0 d0VarT = iVarF.t(so.k.BOOLEAN);
                Intrinsics.checkNotNullExpressionValue(d0VarT, "getBooleanType(...)");
                return d0VarT;
            case 1:
                Intrinsics.checkNotNullParameter(module, "module");
                so.i iVarF2 = module.f();
                iVarF2.getClass();
                d0 d0VarT2 = iVarF2.t(so.k.DOUBLE);
                Intrinsics.checkNotNullExpressionValue(d0VarT2, "getDoubleType(...)");
                return d0VarT2;
            default:
                Intrinsics.checkNotNullParameter(module, "module");
                so.i iVarF3 = module.f();
                iVarF3.getClass();
                d0 d0VarT3 = iVarF3.t(so.k.FLOAT);
                Intrinsics.checkNotNullExpressionValue(d0VarT3, "getFloatType(...)");
                return d0VarT3;
        }
    }

    @Override // zp.g
    public String toString() {
        switch (this.f24063b) {
            case 1:
                return ((Number) this.f24066a).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) this.f24066a).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    public c(double d6) {
        super(Double.valueOf(d6));
    }

    public c(float f2) {
        super(Float.valueOf(f2));
    }
}
