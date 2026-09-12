package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import mo.g;
import mo.h;
import mo.q;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements h {
    public MutablePropertyReference1() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KCallable computeReflected() {
        return Reflection.mutableProperty1(this);
    }

    public abstract /* synthetic */ Object get(Object obj);

    @Override // kotlin.reflect.KProperty1
    public Object getDelegate(Object obj) {
        return ((h) getReflected()).getDelegate(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    public abstract /* synthetic */ void set(Object obj, Object obj2);

    public MutablePropertyReference1(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.jvm.internal.PropertyReference, kotlin.reflect.KProperty
    public q getGetter() {
        return ((h) getReflected()).getGetter();
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, mo.k
    public g getSetter() {
        return ((h) getReflected()).getSetter();
    }

    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, i7);
    }
}
