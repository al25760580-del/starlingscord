package qi;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f18900b;

    public c(String str, Map map) {
        this.f18899a = str;
        this.f18900b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f18899a.equals(cVar.f18899a) && this.f18900b.equals(cVar.f18900b);
    }

    public final int hashCode() {
        return this.f18900b.hashCode() + (this.f18899a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f18899a + ", properties=" + this.f18900b.values() + "}";
    }
}
