package po;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class u1 implements Function0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v1 f18165i = new v1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function0 f18166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile SoftReference f18167e;

    public u1(Object obj, Function0 function0) {
        if (function0 == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
        }
        this.f18167e = null;
        this.f18166d = function0;
        if (obj != null) {
            this.f18167e = new SoftReference(obj);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        Object obj2 = f18165i;
        SoftReference softReference = this.f18167e;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object objInvoke = this.f18166d.invoke();
        if (objInvoke != null) {
            obj2 = objInvoke;
        }
        this.f18167e = new SoftReference(obj2);
        return objInvoke;
    }
}
