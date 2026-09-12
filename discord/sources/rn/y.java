package rn;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final x f19500e = new x(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte f19501d;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.compare(this.f19501d & 255, ((y) obj).f19501d & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return this.f19501d == ((y) obj).f19501d;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f19501d);
    }

    public final String toString() {
        return String.valueOf(this.f19501d & 255);
    }
}
