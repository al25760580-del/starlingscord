package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public interface FlowCollector {
    Object emit(Object obj, Continuation continuation);
}
