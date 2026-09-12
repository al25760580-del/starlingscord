package po;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wp.h f18192a = wp.f.f22422a;

    public static void a(StringBuilder sb2, vo.d dVar) {
        yo.t tVarG = a2.g(dVar);
        yo.t tVarV = dVar.V();
        if (tVarG != null) {
            lq.z type = tVarG.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb2.append(d(type));
            sb2.append(".");
        }
        boolean z5 = (tVarG == null || tVarV == null) ? false : true;
        if (z5) {
            sb2.append("(");
        }
        if (tVarV != null) {
            lq.z type2 = tVarV.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            sb2.append(d(type2));
            sb2.append(".");
        }
        if (z5) {
            sb2.append(")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String b(vo.u descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        a(sb2, descriptor);
        up.e name = ((yo.l) descriptor).getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb2.append(f18192a.O(name, true));
        List listL = descriptor.L();
        Intrinsics.checkNotNullExpressionValue(listL, "getValueParameters(...)");
        CollectionsKt.N(listL, sb2, ", ", "(", ")", b.H, 48);
        sb2.append(": ");
        lq.z returnType = descriptor.getReturnType();
        Intrinsics.checkNotNull(returnType);
        sb2.append(d(returnType));
        return sb2.toString();
    }

    public static String c(vo.l0 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(descriptor.U() ? "var " : "val ");
        a(sb2, descriptor);
        up.e name = descriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb2.append(f18192a.O(name, true));
        sb2.append(": ");
        lq.z type = descriptor.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        sb2.append(d(type));
        return sb2.toString();
    }

    public static String d(lq.z type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return f18192a.X(type);
    }
}
