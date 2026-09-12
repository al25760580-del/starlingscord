package sq;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f20549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20550b;

    public v(String str, Function1 function1) {
        this.f20549a = function1;
        this.f20550b = "must return ".concat(str);
    }

    @Override // sq.e
    public final boolean a(gp.e functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        return Intrinsics.areEqual(functionDescriptor.E, this.f20549a.invoke(bq.e.e(functionDescriptor)));
    }

    @Override // sq.e
    public final String b(gp.e eVar) {
        return zs.a.C(this, eVar);
    }

    @Override // sq.e
    public final String getDescription() {
        return this.f20550b;
    }
}
