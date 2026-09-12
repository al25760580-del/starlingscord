package wo;

import ep.x;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import lq.z;
import vo.n0;
import vo.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final so.i f22382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final up.c f22383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f22384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f22385d;

    public j(so.i builtIns, up.c fqName, Map allValueArguments) {
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(allValueArguments, "allValueArguments");
        this.f22382a = builtIns;
        this.f22383b = fqName;
        this.f22384c = allValueArguments;
        this.f22385d = rn.l.a(rn.m.f19486e, new x(23, this));
    }

    @Override // wo.b
    public final up.c a() {
        return this.f22383b;
    }

    @Override // wo.b
    public final Map b() {
        return this.f22384c;
    }

    @Override // wo.b
    public final n0 d() {
        o0 NO_SOURCE = n0.C;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // wo.b
    public final z getType() {
        Object value = this.f22385d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (z) value;
    }
}
