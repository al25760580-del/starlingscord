package a4;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f125d;

    public d(boolean z5, boolean z6, boolean z7, boolean z10) {
        this.f122a = z5;
        this.f123b = z6;
        this.f124c = z7;
        this.f125d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f122a == dVar.f122a && this.f123b == dVar.f123b && this.f124c == dVar.f124c && this.f125d == dVar.f125d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final int hashCode() {
        boolean z5 = this.f122a;
        ?? r5 = z5;
        if (z5) {
            r5 = 1;
        }
        int i7 = r5 * 31;
        boolean z6 = this.f123b;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i10 = (i7 + r6) * 31;
        boolean z7 = this.f124c;
        ?? r7 = z7;
        if (z7) {
            r7 = 1;
        }
        int i11 = (i10 + r7) * 31;
        boolean z10 = this.f125d;
        return i11 + (z10 ? 1 : z10);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.f122a + ", isValidated=" + this.f123b + ", isMetered=" + this.f124c + ", isNotRoaming=" + this.f125d + ')';
    }
}
