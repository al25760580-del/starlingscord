package c3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3435e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f3436i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f3437v;

    public c(int i7, int i10, String from, String to2) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to2, "to");
        this.f3434d = i7;
        this.f3435e = i10;
        this.f3436i = from;
        this.f3437v = to2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c other = (c) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        int i7 = this.f3434d - other.f3434d;
        return i7 == 0 ? this.f3435e - other.f3435e : i7;
    }
}
