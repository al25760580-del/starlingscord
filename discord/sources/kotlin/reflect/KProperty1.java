package kotlin.reflect;

import kotlin.jvm.functions.Function1;
import mo.q;

/* JADX INFO: loaded from: classes3.dex */
public interface KProperty1 extends KProperty, Function1 {
    Object getDelegate(Object obj);

    @Override // kotlin.reflect.KProperty
    q getGetter();
}
