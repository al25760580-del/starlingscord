package up;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f21271a = new Regex("[^\\p{L}\\p{Digit}]");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f21272b = "$context_receiver";

    public static final e a(int i7) {
        e eVarE = e.e(f21272b + '_' + i7);
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        return eVarE;
    }
}
