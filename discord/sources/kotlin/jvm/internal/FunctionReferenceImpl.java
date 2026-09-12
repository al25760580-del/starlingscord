package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* JADX INFO: loaded from: classes3.dex */
public class FunctionReferenceImpl extends FunctionReference {
    public FunctionReferenceImpl(int i7, KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(i7, CallableReference.NO_RECEIVER, ((ClassBasedDeclarationContainer) kDeclarationContainer).getJClass(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    public FunctionReferenceImpl(int i7, Class cls, String str, String str2, int i10) {
        super(i7, CallableReference.NO_RECEIVER, cls, str, str2, i10);
    }

    public FunctionReferenceImpl(int i7, Object obj, Class cls, String str, String str2, int i10) {
        super(i7, obj, cls, str, str2, i10);
    }
}
