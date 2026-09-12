package ep;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f8571a = new m();

    public static final f0 a(String str, String str2, String str3, String str4) {
        ArrayList arrayList = j0.f8559a;
        up.e eVarE = up.e.e(str2);
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        return new f0(str, eVarE, str3, str4);
    }
}
