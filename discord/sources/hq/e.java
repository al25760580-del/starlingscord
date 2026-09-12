package hq;

import kotlin.jvm.internal.Intrinsics;
import vo.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp.f f11009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pp.k f11010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rp.a f11011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n0 f11012d;

    public e(rp.f nameResolver, pp.k classProto, rp.a metadataVersion, n0 sourceElement) {
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(classProto, "classProto");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(sourceElement, "sourceElement");
        this.f11009a = nameResolver;
        this.f11010b = classProto;
        this.f11011c = metadataVersion;
        this.f11012d = sourceElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f11009a, eVar.f11009a) && Intrinsics.areEqual(this.f11010b, eVar.f11010b) && Intrinsics.areEqual(this.f11011c, eVar.f11011c) && Intrinsics.areEqual(this.f11012d, eVar.f11012d);
    }

    public final int hashCode() {
        return this.f11012d.hashCode() + ((this.f11011c.hashCode() + ((this.f11010b.hashCode() + (this.f11009a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.f11009a + ", classProto=" + this.f11010b + ", metadataVersion=" + this.f11011c + ", sourceElement=" + this.f11012d + ')';
    }
}
