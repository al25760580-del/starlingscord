package uo;

import java.util.List;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lq.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f21226e;

    public /* synthetic */ k(o oVar, int i7) {
        this.f21225d = i7;
        this.f21226e = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f21225d) {
            case 0:
                List annotations = c0.c(wo.e.a(this.f21226e.f21236a.f(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", "", "WARNING"));
                Intrinsics.checkNotNullParameter(annotations, "annotations");
                return annotations.isEmpty() ? wo.g.f22379a : new wo.i(0, annotations);
            default:
                d0 d0VarE = this.f21226e.f21236a.f().e();
                Intrinsics.checkNotNullExpressionValue(d0VarE, "getAnyType(...)");
                return d0VarE;
        }
    }
}
