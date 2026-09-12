package e4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7985b;

    public j(String workSpecId, int i7) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f7984a = workSpecId;
        this.f7985b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f7984a, jVar.f7984a) && this.f7985b == jVar.f7985b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7985b) + (this.f7984a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb2.append(this.f7984a);
        sb2.append(", generation=");
        return com.discord.chat.presentation.list.a.j(sb2, this.f7985b, ')');
    }
}
