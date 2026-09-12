package or;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SerialDescriptor f17540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SerialDescriptor f17541c;

    public g0(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.f17539a = str;
        this.f17540b = serialDescriptor;
        this.f17541c = serialDescriptor2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final ls.d c() {
        return mr.j.f16079d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return this.f17539a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.areEqual(this.f17539a, g0Var.f17539a) && Intrinsics.areEqual(this.f17540b, g0Var.f17540b) && Intrinsics.areEqual(this.f17541c, g0Var.f17541c);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer intOrNull = StringsKt.toIntOrNull(name);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(kk.b.j(name, " is not a valid map index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g() {
        return 2;
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
        return this.f17541c.hashCode() + ((this.f17540b.hashCode() + (this.f17539a.hashCode() * 31)) * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i7) {
        if (i7 >= 0) {
            return kotlin.collections.n0.f14659d;
        }
        throw new IllegalArgumentException(com.discord.chat.presentation.list.a.k(a3.e.s(i7, "Illegal index ", ", "), this.f17539a, " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException(com.discord.chat.presentation.list.a.k(a3.e.s(i7, "Illegal index ", ", "), this.f17539a, " expects only non-negative indices").toString());
        }
        int i10 = i7 % 2;
        if (i10 == 0) {
            return this.f17540b;
        }
        if (i10 == 1) {
            return this.f17541c;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i7) {
        if (i7 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(com.discord.chat.presentation.list.a.k(a3.e.s(i7, "Illegal index ", ", "), this.f17539a, " expects only non-negative indices").toString());
    }

    public final String toString() {
        return this.f17539a + '(' + this.f17540b + ", " + this.f17541c + ')';
    }
}
