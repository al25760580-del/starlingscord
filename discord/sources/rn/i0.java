package rn;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final h0 f19474e = new h0(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short f19475d;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.compare(this.f19475d & 65535, ((i0) obj).f19475d & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i0) {
            return this.f19475d == ((i0) obj).f19475d;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f19475d);
    }

    public final String toString() {
        return String.valueOf(this.f19475d & 65535);
    }
}
