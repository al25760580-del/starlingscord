package a5;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f228c;

    public boolean equals(Object obj) {
        switch (this.f226a) {
            case 1:
                return (obj instanceof k1.a) && this.f227b == null && this.f228c == null;
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.f226a) {
            case 1:
                String str = this.f227b;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.f228c;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f226a) {
            case 1:
                return "Pair{" + ((Object) this.f227b) + " " + ((Object) this.f228c) + "}";
            default:
                return super.toString();
        }
    }
}
