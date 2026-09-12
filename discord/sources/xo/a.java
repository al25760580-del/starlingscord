package xo;

import java.util.Collection;
import jq.u;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import vo.f;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements b, d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22990b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f22991c = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f22992d = new a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22993a;

    public /* synthetic */ a(int i7) {
        this.f22993a = i7;
    }

    @Override // xo.b
    public Collection a(up.e name, f classDescriptor) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        return n0.f14659d;
    }

    @Override // xo.b
    public Collection b(f classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        return n0.f14659d;
    }

    @Override // xo.b
    public Collection c(f classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        return n0.f14659d;
    }

    @Override // xo.b
    public Collection d(f classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        return n0.f14659d;
    }

    @Override // xo.d
    public boolean e(f classDescriptor, u functionDescriptor) {
        switch (this.f22993a) {
            case 1:
                Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
                Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
                return true;
            default:
                Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
                Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
                return !functionDescriptor.getAnnotations().P(e.f22994a);
        }
    }
}
