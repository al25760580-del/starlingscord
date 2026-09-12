package pr;

import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.descriptors.SerialDescriptor;
import or.g0;
import or.s1;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements SerialDescriptor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f18536b = new p();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f18537c = "kotlinx.serialization.json.JsonObject";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f18538a;

    public p() {
        com.facebook.imagepipeline.nativecode.b.z(StringCompanionObject.INSTANCE);
        this.f18538a = com.facebook.imagepipeline.nativecode.b.b(s1.f17602a, i.f18527a).f17557d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final ls.d c() {
        this.f18538a.getClass();
        return mr.j.f16079d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return f18537c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean e() {
        this.f18538a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f18538a.f(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g() {
        this.f18538a.getClass();
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        this.f18538a.getClass();
        return n0.f14659d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h(int i7) {
        this.f18538a.getClass();
        return String.valueOf(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i7) {
        return this.f18538a.i(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        this.f18538a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i7) {
        return this.f18538a.j(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i7) {
        this.f18538a.k(i7);
        return false;
    }
}
