package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import po.s;

/* JADX INFO: loaded from: classes3.dex */
public class PropertyReference1Impl extends PropertyReference1 {
    public PropertyReference1Impl(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((ClassBasedDeclarationContainer) kDeclarationContainer).getJClass(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1
    public Object get(Object obj) {
        return ((s) getGetter()).call(obj);
    }

    public PropertyReference1Impl(Class cls, String str, String str2, int i7) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i7);
    }

    public PropertyReference1Impl(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, i7);
    }
}
