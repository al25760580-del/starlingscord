package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import po.s;

/* JADX INFO: loaded from: classes3.dex */
public class PropertyReference0Impl extends PropertyReference0 {
    public PropertyReference0Impl(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((ClassBasedDeclarationContainer) kDeclarationContainer).getJClass(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference0
    public Object get() {
        return ((s) getGetter()).call(new Object[0]);
    }

    public PropertyReference0Impl(Class cls, String str, String str2, int i7) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i7);
    }

    public PropertyReference0Impl(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, i7);
    }
}
