package or;

import java.lang.ref.SoftReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends ClassValue {
    @Override // java.lang.ClassValue
    public final Object computeValue(Class type) {
        Intrinsics.checkNotNullParameter(type, "type");
        w0 w0Var = new w0();
        w0Var.f17623a = new SoftReference(null);
        return w0Var;
    }
}
