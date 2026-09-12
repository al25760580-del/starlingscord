package k0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import mo.c0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements j, Iterable, KMappedMarker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f14211d = new LinkedHashMap();

    public final void a(i key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f14211d.put(key, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return Intrinsics.areEqual(this.f14211d, ((d) obj).f14211d);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + com.discord.chat.presentation.list.a.g(this.f14211d.hashCode() * 31, 31, false);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f14211d.entrySet().iterator();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = "";
        for (Map.Entry entry : this.f14211d.entrySet()) {
            i iVar = (i) entry.getKey();
            Object value = entry.getValue();
            sb2.append(str);
            sb2.append(iVar.f14223a);
            sb2.append(" : ");
            sb2.append(value);
            str = ", ";
        }
        return c0.M(this) + "{ " + ((Object) sb2) + " }";
    }
}
