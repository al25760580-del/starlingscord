package fp;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lq.z;
import so.o;
import yo.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f9341d = new e();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        z type;
        vo.z module = (vo.z) obj;
        Object obj2 = f.f9342a;
        Intrinsics.checkNotNullParameter(module, "module");
        q0 q0VarS = ib.a.s(d.f9338b, module.f().j(o.f20386t));
        return (q0VarS == null || (type = q0VarS.getType()) == null) ? nq.l.c(nq.k.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
    }
}
