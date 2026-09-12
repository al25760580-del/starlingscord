package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import mo.e;
import mo.f;
import mo.o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MutablePropertyReference0 extends MutablePropertyReference implements f {
    public MutablePropertyReference0() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KCallable computeReflected() {
        return Reflection.mutableProperty0(this);
    }

    public abstract /* synthetic */ Object get();

    @Override // mo.p
    public Object getDelegate() {
        return ((f) getReflected()).getDelegate();
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    public abstract /* synthetic */ void set(Object obj);

    public MutablePropertyReference0(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.jvm.internal.PropertyReference, kotlin.reflect.KProperty
    public o getGetter() {
        return ((f) getReflected()).getGetter();
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, mo.k
    public e getSetter() {
        return ((f) getReflected()).getSetter();
    }

    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, i7);
    }
}
