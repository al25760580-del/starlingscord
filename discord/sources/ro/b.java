package ro;

import ep.a0;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;
import up.c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f19504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final up.b f19505b;

    static {
        List<c> listG = d0.g(a0.f8488a, a0.f8495h, a0.f8496i, a0.f8490c, a0.f8491d, a0.f8493f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (c topLevelFqName : listG) {
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            linkedHashSet.add(new up.b(topLevelFqName.b(), topLevelFqName.f21262a.f()));
        }
        f19504a = linkedHashSet;
        c topLevelFqName2 = a0.f8494g;
        Intrinsics.checkNotNullExpressionValue(topLevelFqName2, "REPEATABLE_ANNOTATION");
        Intrinsics.checkNotNullParameter(topLevelFqName2, "topLevelFqName");
        f19505b = new up.b(topLevelFqName2.b(), topLevelFqName2.f21262a.f());
    }
}
