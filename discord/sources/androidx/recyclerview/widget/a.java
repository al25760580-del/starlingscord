package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2556d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            int i7 = this.f2553a;
            if (i7 != aVar.f2553a) {
                return false;
            }
            if (i7 != 8 || Math.abs(this.f2556d - this.f2554b) != 1 || this.f2556d != aVar.f2554b || this.f2554b != aVar.f2556d) {
                if (this.f2556d != aVar.f2556d || this.f2554b != aVar.f2554b) {
                    return false;
                }
                Object obj2 = this.f2555c;
                if (obj2 != null) {
                    if (!obj2.equals(aVar.f2555c)) {
                        return false;
                    }
                } else if (aVar.f2555c != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f2553a * 31) + this.f2554b) * 31) + this.f2556d;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i7 = this.f2553a;
        if (i7 == 1) {
            str = "add";
        } else if (i7 == 2) {
            str = "rm";
        } else if (i7 != 4) {
            str = i7 != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb2.append(str);
        sb2.append(",s:");
        sb2.append(this.f2554b);
        sb2.append("c:");
        sb2.append(this.f2556d);
        sb2.append(",p:");
        sb2.append(this.f2555c);
        sb2.append("]");
        return sb2.toString();
    }
}
