package w3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f22042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f22043b;

    static {
        String strF = v3.q.f("WrkDbPathHelper");
        Intrinsics.checkNotNullExpressionValue(strF, "tagWithPrefix(\"WrkDbPathHelper\")");
        f22042a = strF;
        f22043b = new String[]{"-journal", "-shm", "-wal"};
    }
}
