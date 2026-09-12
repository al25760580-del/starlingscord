package i1;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f11351c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(this.f11349a, aVar.f11349a) && Objects.equals(this.f11350b, aVar.f11350b) && Objects.equals(this.f11351c, aVar.f11351c);
    }

    public final int hashCode() {
        return Objects.hash(this.f11349a, this.f11350b, this.f11351c);
    }
}
