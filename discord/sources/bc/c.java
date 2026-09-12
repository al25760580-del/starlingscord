package bc;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f3093c;

    public c(long j, long j5, Set set) {
        this.f3091a = j;
        this.f3092b = j5;
        this.f3093c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f3091a == cVar.f3091a && this.f3092b == cVar.f3092b && this.f3093c.equals(cVar.f3093c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f3091a;
        int i7 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j5 = this.f3092b;
        return ((i7 ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ this.f3093c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f3091a + ", maxAllowedDelay=" + this.f3092b + ", flags=" + this.f3093c + "}";
    }
}
