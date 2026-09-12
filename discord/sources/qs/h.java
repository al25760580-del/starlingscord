package qs;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f19104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f19106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19108f;

    public h(boolean z5, Integer num, boolean z6, Integer num2, boolean z7, boolean z10) {
        this.f19103a = z5;
        this.f19104b = num;
        this.f19105c = z6;
        this.f19106d = num2;
        this.f19107e = z7;
        this.f19108f = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f19103a == hVar.f19103a && Intrinsics.areEqual(this.f19104b, hVar.f19104b) && this.f19105c == hVar.f19105c && Intrinsics.areEqual(this.f19106d, hVar.f19106d) && this.f19107e == hVar.f19107e && this.f19108f == hVar.f19108f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final int hashCode() {
        boolean z5 = this.f19103a;
        ?? r5 = z5;
        if (z5) {
            r5 = 1;
        }
        int i7 = r5 * 31;
        Integer num = this.f19104b;
        int iHashCode = (i7 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z6 = this.f19105c;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i10 = (iHashCode + r6) * 31;
        Integer num2 = this.f19106d;
        int iHashCode2 = (i10 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z7 = this.f19107e;
        ?? r7 = z7;
        if (z7) {
            r7 = 1;
        }
        int i11 = (iHashCode2 + r7) * 31;
        boolean z10 = this.f19108f;
        return i11 + (z10 ? 1 : z10);
    }

    public final String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f19103a + ", clientMaxWindowBits=" + this.f19104b + ", clientNoContextTakeover=" + this.f19105c + ", serverMaxWindowBits=" + this.f19106d + ", serverNoContextTakeover=" + this.f19107e + ", unknownValues=" + this.f19108f + ')';
    }
}
