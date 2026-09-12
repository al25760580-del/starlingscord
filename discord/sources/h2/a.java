package h2;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Lambda implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f10287d = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(entry, "entry");
        return "  " + ((c) entry.getKey()).f10290a + " = " + entry.getValue();
    }
}
