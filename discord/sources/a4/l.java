package a4;

import ar.b0;
import ar.b1;
import e4.o;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import v3.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f142a;

    static {
        String strF = q.f("WorkConstraintsTracker");
        Intrinsics.checkNotNullExpressionValue(strF, "tagWithPrefix(\"WorkConstraintsTracker\")");
        f142a = strF;
    }

    public static final b1 a(i iVar, o spec, CoroutineDispatcher dispatcher, e listener) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(spec, "spec");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(listener, "listener");
        b1 b1Var = new b1();
        dispatcher.getClass();
        b0.t(b0.b(kotlin.coroutines.e.c(dispatcher, b1Var)), null, new k(iVar, spec, listener, null, 0), 3);
        return b1Var;
    }
}
