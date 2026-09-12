package zq;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import mf.f;
import pa.s;
import rn.d0;
import rn.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Comparable, Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final s f24078i = new s();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f24079v = new a(0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f24080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f24081e;

    public a(long j, long j5) {
        this.f24080d = j;
        this.f24081e = j5;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a other = (a) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        long j = other.f24080d;
        long j5 = this.f24080d;
        if (j5 != j) {
            d0 d0Var = e0.f19470e;
            return Long.compare(j5 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        d0 d0Var2 = e0.f19470e;
        return Long.compare(this.f24081e ^ Long.MIN_VALUE, other.f24081e ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f24080d == aVar.f24080d && this.f24081e == aVar.f24081e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f24080d ^ this.f24081e);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        f.s(this.f24080d, bArr, 0, 0, 4);
        bArr[8] = 45;
        f.s(this.f24080d, bArr, 9, 4, 6);
        bArr[13] = 45;
        f.s(this.f24080d, bArr, 14, 6, 8);
        bArr[18] = 45;
        f.s(this.f24081e, bArr, 19, 0, 2);
        bArr[23] = 45;
        f.s(this.f24081e, bArr, 24, 2, 8);
        return x.g(bArr);
    }
}
