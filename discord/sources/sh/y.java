package sh;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f20241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20242e;

    public y(long j, long j5, String str, int i7, int i10) {
        this.f20238a = i7;
        this.f20239b = str;
        this.f20240c = j;
        this.f20241d = j5;
        this.f20242e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            String str2 = yVar.f20239b;
            if (this.f20238a == yVar.f20238a && ((str = this.f20239b) != null ? str.equals(str2) : str2 == null) && this.f20240c == yVar.f20240c && this.f20241d == yVar.f20241d && this.f20242e == yVar.f20242e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f20239b;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.f20241d;
        long j5 = j ^ (j >>> 32);
        long j7 = this.f20240c;
        return ((((((iHashCode ^ ((this.f20238a ^ 1000003) * 1000003)) * 1000003) ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ ((int) j5)) * 1000003) ^ this.f20242e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SliceCheckpoint{fileExtractionStatus=");
        sb2.append(this.f20238a);
        sb2.append(", filePath=");
        sb2.append(this.f20239b);
        sb2.append(", fileOffset=");
        sb2.append(this.f20240c);
        sb2.append(", remainingBytes=");
        sb2.append(this.f20241d);
        sb2.append(", previousChunk=");
        return kk.b.l(sb2, this.f20242e, "}");
    }
}
