package mr;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f16052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KClass f16053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16054c;

    public b(g original, KClass kClass) {
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        this.f16052a = original;
        this.f16053b = kClass;
        this.f16054c = original.f16065a + '<' + kClass.getSimpleName() + '>';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final ls.d c() {
        return this.f16052a.f16066b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return this.f16054c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && Intrinsics.areEqual(this.f16052a, bVar.f16052a) && Intrinsics.areEqual(bVar.f16053b, this.f16053b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f16052a.f(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g() {
        return this.f16052a.f16067c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.f16052a.f16068d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h(int i7) {
        return this.f16052a.f16070f[i7];
    }

    public final int hashCode() {
        return this.f16054c.hashCode() + (this.f16053b.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i7) {
        return this.f16052a.f16072h[i7];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i7) {
        return this.f16052a.f16071g[i7];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i7) {
        return this.f16052a.f16073i[i7];
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f16053b + ", original: " + this.f16052a + ')';
    }
}
