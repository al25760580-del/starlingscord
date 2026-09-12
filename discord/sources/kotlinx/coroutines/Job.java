package kotlinx.coroutines;

import ar.c1;
import ar.i1;
import ar.m0;
import ar.n;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public interface Job extends CoroutineContext.Element {
    m0 O(Function1 function1);

    Object a0(xn.c cVar);

    boolean c();

    m0 c0(boolean z5, boolean z6, c1 c1Var);

    void f(CancellationException cancellationException);

    boolean isCompleted();

    Sequence q();

    boolean start();

    CancellationException u();

    n y(i1 i1Var);
}
