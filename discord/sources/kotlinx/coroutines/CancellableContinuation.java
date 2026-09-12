package kotlinx.coroutines;

import a5.h;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes3.dex */
public interface CancellableContinuation extends Continuation {
    boolean c();

    h e(Object obj, Function3 function3);

    void k(Object obj, Function3 function3);

    boolean m(Throwable th2);

    void s(Object obj);
}
