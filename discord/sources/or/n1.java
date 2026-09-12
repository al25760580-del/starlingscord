package or;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class n1 implements SerialDescriptor, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f17580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f17582c;

    public n1(SerialDescriptor original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.f17580a = original;
        this.f17581b = original.d() + '?';
        this.f17582c = e1.b(original);
    }

    @Override // or.l
    public final Set a() {
        return this.f17582c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final ls.d c() {
        return this.f17580a.c();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return this.f17581b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n1) {
            return Intrinsics.areEqual(this.f17580a, ((n1) obj).f17580a);
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f17580a.f(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g() {
        return this.f17580a.g();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.f17580a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h(int i7) {
        return this.f17580a.h(i7);
    }

    public final int hashCode() {
        return this.f17580a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i7) {
        return this.f17580a.i(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.f17580a.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i7) {
        return this.f17580a.j(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i7) {
        return this.f17580a.k(i7);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f17580a);
        sb2.append('?');
        return sb2.toString();
    }
}
