package vo;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up.e f21845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pq.e f21846b;

    public v(up.e underlyingPropertyName, pq.e underlyingType) {
        Intrinsics.checkNotNullParameter(underlyingPropertyName, "underlyingPropertyName");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        this.f21845a = underlyingPropertyName;
        this.f21846b = underlyingType;
    }

    @Override // vo.s0
    public final boolean a(up.e name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return Intrinsics.areEqual(this.f21845a, name);
    }

    public final String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f21845a + ", underlyingType=" + this.f21846b + ')';
    }
}
