package pr;

import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements SerialDescriptor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f18521b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f18522c = "kotlinx.serialization.json.JsonArray";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ or.c f18523a = (or.c) com.facebook.imagepipeline.nativecode.b.a(i.f18527a).f17520c;

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final ls.d c() {
        this.f18523a.getClass();
        return mr.j.f16078c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return f18522c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean e() {
        this.f18523a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f18523a.f(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g() {
        this.f18523a.getClass();
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        this.f18523a.getClass();
        return n0.f14659d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h(int i7) {
        this.f18523a.getClass();
        return String.valueOf(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i7) {
        return this.f18523a.i(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        this.f18523a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i7) {
        return this.f18523a.j(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i7) {
        this.f18523a.k(i7);
        return false;
    }
}
