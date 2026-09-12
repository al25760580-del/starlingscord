package mo;

import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public interface s extends KProperty, Function2 {
    Object getDelegate(Object obj, Object obj2);

    @Override // kotlin.reflect.KProperty
    r getGetter();
}
