package or;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0 implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f17584a;

    public o0(SerialDescriptor serialDescriptor) {
        this.f17584a = serialDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final ls.d c() {
        return mr.j.f16078c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Intrinsics.areEqual(this.f17584a, o0Var.f17584a) && Intrinsics.areEqual(d(), o0Var.d());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer intOrNull = StringsKt.toIntOrNull(name);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(kk.b.j(name, " is not a valid list index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g() {
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return kotlin.collections.n0.f14659d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h(int i7) {
        return String.valueOf(i7);
    }

    public final int hashCode() {
        return d().hashCode() + (this.f17584a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i7) {
        if (i7 >= 0) {
            return kotlin.collections.n0.f14659d;
        }
        StringBuilder sbS = a3.e.s(i7, "Illegal index ", ", ");
        sbS.append(d());
        sbS.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbS.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i7) {
        if (i7 >= 0) {
            return this.f17584a;
        }
        StringBuilder sbS = a3.e.s(i7, "Illegal index ", ", ");
        sbS.append(d());
        sbS.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbS.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i7) {
        if (i7 >= 0) {
            return false;
        }
        StringBuilder sbS = a3.e.s(i7, "Illegal index ", ", ");
        sbS.append(d());
        sbS.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbS.toString().toString());
    }

    public final String toString() {
        return d() + '(' + this.f17584a + ')';
    }
}
