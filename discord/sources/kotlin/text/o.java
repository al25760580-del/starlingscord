package kotlin.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o extends FunctionReferenceImpl implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f14738d = new o();

    public o() {
        super(1, MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MatchResult p3 = (MatchResult) obj;
        Intrinsics.checkNotNullParameter(p3, "p0");
        return p3.next();
    }
}
