package bq;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import yo.q0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c extends FunctionReferenceImpl implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f3380d = new c(1, q0.class, "declaresDefaultValue", "declaresDefaultValue()Z", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        q0 p3 = (q0) obj;
        Intrinsics.checkNotNullParameter(p3, "p0");
        return Boolean.valueOf(p3.C0());
    }
}
