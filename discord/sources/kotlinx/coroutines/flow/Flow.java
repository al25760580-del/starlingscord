package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public interface Flow {
    Object collect(FlowCollector flowCollector, Continuation continuation);
}
