package jp;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f14011d = new h();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return "(raw) " + it;
    }
}
