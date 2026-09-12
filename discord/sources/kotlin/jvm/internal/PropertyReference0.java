package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import mo.o;
import mo.p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PropertyReference0 extends PropertyReference implements p {
    public PropertyReference0() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KCallable computeReflected() {
        return Reflection.property0(this);
    }

    public abstract /* synthetic */ Object get();

    @Override // mo.p
    public Object getDelegate() {
        return ((p) getReflected()).getDelegate();
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    public PropertyReference0(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.internal.PropertyReference, kotlin.reflect.KProperty
    public o getGetter() {
        return ((p) getReflected()).getGetter();
    }

    public PropertyReference0(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, i7);
    }
}
