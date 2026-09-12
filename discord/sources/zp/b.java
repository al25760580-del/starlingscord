package zp;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class b extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f24062b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List value, Function1 computeType) {
        super(value);
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(computeType, "computeType");
        this.f24062b = computeType;
    }

    @Override // zp.g
    public final lq.z a(vo.z module) {
        vo.i iVarG;
        Intrinsics.checkNotNullParameter(module, "module");
        lq.z zVar = (lq.z) this.f24062b.invoke(module);
        if (!so.i.z(zVar) && (((iVarG = zVar.r0().g()) == null || so.i.s(iVarG) == null) && !so.i.C(zVar, so.o.W.f21262a) && !so.i.C(zVar, so.o.X.f21262a) && !so.i.C(zVar, so.o.Y.f21262a))) {
            so.i.C(zVar, so.o.Z.f21262a);
        }
        return zVar;
    }
}
