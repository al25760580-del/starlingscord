package ip;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up.e f13384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bp.o f13385b;

    public s(up.e name, bp.o oVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f13384a = name;
        this.f13385b = oVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return Intrinsics.areEqual(this.f13384a, ((s) obj).f13384a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13384a.hashCode();
    }
}
