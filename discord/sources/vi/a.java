package vi;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f21672b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f21671a = str;
        this.f21672b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f21671a.equals(aVar.f21671a) && this.f21672b.equals(aVar.f21672b);
    }

    public final int hashCode() {
        return ((this.f21671a.hashCode() ^ 1000003) * 1000003) ^ this.f21672b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f21671a + ", usedDates=" + this.f21672b + "}";
    }
}
