package po;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f18071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18072b;

    public b2(ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        this.f18071a = new WeakReference(classLoader);
        this.f18072b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b2) && this.f18071a.get() == ((b2) obj).f18071a.get();
    }

    public final int hashCode() {
        return this.f18072b;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.f18071a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
