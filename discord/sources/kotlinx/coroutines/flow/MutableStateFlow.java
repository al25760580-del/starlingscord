package kotlinx.coroutines.flow;

import dr.b0;

/* JADX INFO: loaded from: classes3.dex */
public interface MutableStateFlow extends b0, MutableSharedFlow {
    boolean b(Object obj, Object obj2);

    Object getValue();

    void setValue(Object obj);
}
