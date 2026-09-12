package jm;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13944b;

    public e(int i7, List handlerTags) {
        Intrinsics.checkNotNullParameter(handlerTags, "handlerTags");
        this.f13943a = handlerTags;
        this.f13944b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f13943a, eVar.f13943a) && this.f13944b == eVar.f13944b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13944b) + (this.f13943a.hashCode() * 31);
    }

    public final String toString() {
        return "VirtualChildren(handlerTags=" + this.f13943a + ", viewTag=" + this.f13944b + ")";
    }
}
