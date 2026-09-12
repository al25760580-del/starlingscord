package zr;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Locale f24091b;

    public f(String str, Locale locale) {
        this.f24090a = str;
        this.f24091b = locale;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f24090a.equals(fVar.f24090a) && this.f24091b.equals(fVar.f24091b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f24090a.hashCode() << 3) ^ this.f24091b.hashCode();
    }

    public final String toString() {
        return this.f24090a + "/" + this.f24091b;
    }
}
