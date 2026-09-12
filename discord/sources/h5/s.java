package h5;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10380d;

    public s(int i7, int i10, int i11, int i12) {
        this.f10377a = i7;
        this.f10378b = i10;
        this.f10379c = i11;
        this.f10380d = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f10377a == sVar.f10377a && this.f10378b == sVar.f10378b && this.f10379c == sVar.f10379c && this.f10380d == sVar.f10380d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f10377a * 31) + this.f10378b) * 31) + this.f10379c) * 31) + this.f10380d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[(");
        sb2.append(this.f10377a);
        sb2.append("; ");
        sb2.append(this.f10378b);
        sb2.append(") - (");
        sb2.append(this.f10379c);
        sb2.append("; ");
        return kk.b.l(sb2, this.f10380d, ")]");
    }
}
