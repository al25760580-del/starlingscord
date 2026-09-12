package pr;

import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import rn.u;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f18529a;

    public j(Function0 function0) {
        this.f18529a = rn.l.b(function0);
    }

    public final SerialDescriptor a() {
        return (SerialDescriptor) this.f18529a.getValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final ls.d c() {
        return a().c();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return a().d();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean e() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return a().f(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g() {
        return a().g();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return n0.f14659d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h(int i7) {
        return a().h(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i7) {
        return a().i(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i7) {
        return a().j(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i7) {
        return a().k(i7);
    }
}
