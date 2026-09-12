package androidx.lifecycle;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {
    public static final Object a(Lifecycle lifecycle, Lifecycle.State state, Function2 function2, Continuation continuation) {
        if (state == Lifecycle.State.f2296e) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        if (lifecycle.b() == Lifecycle.State.f2295d) {
            return Unit.f14616a;
        }
        Object objI = ar.b0.i(new i0(lifecycle, state, function2, null), continuation);
        return objI == wn.a.f22354d ? objI : Unit.f14616a;
    }
}
