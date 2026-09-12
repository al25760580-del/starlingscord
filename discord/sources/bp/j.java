package bp;

import java.lang.reflect.Member;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j extends FunctionReferenceImpl implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f3359d = new j(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Member p3 = (Member) obj;
        Intrinsics.checkNotNullParameter(p3, "p0");
        return Boolean.valueOf(p3.isSynthetic());
    }
}
