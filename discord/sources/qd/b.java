package qd;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18714d;

    public b(String str, String str2, int i7, int i10) {
        this.f18711a = str;
        this.f18712b = str2;
        this.f18713c = i7;
        this.f18714d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f18713c == bVar.f18713c && this.f18714d == bVar.f18714d && ls.d.n(this.f18711a, bVar.f18711a) && ls.d.n(this.f18712b, bVar.f18712b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18711a, this.f18712b, Integer.valueOf(this.f18713c), Integer.valueOf(this.f18714d)});
    }
}
