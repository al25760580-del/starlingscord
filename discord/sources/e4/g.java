package e4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7976c;

    public g(String workSpecId, int i7, int i10) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f7974a = workSpecId;
        this.f7975b = i7;
        this.f7976c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f7974a, gVar.f7974a) && this.f7975b == gVar.f7975b && this.f7976c == gVar.f7976c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7976c) + com.discord.chat.presentation.list.a.u(this.f7975b, this.f7974a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SystemIdInfo(workSpecId=");
        sb2.append(this.f7974a);
        sb2.append(", generation=");
        sb2.append(this.f7975b);
        sb2.append(", systemId=");
        return com.discord.chat.presentation.list.a.j(sb2, this.f7976c, ')');
    }
}
