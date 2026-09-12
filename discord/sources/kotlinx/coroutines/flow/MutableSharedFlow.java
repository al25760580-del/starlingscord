package kotlinx.coroutines.flow;

import dr.v;
import er.a0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public interface MutableSharedFlow extends v, FlowCollector {
    boolean d(Object obj);

    @Override // kotlinx.coroutines.flow.FlowCollector
    Object emit(Object obj, Continuation continuation);

    a0 f();
}
