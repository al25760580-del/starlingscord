package yn;

import java.io.Serializable;
import kotlin.collections.d;
import kotlin.collections.h;
import kotlin.collections.y;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements EnumEntries, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Enum[] f23412e;

    public a(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f23412e = entries;
    }

    @Override // kotlin.collections.b
    public final int a() {
        return this.f23412e.length;
    }

    @Override // kotlin.collections.b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return ((Enum) y.v(element.ordinal(), this.f23412e)) == element;
    }

    @Override // kotlin.collections.h, java.util.List
    public final Object get(int i7) {
        d dVar = h.f14644d;
        Enum[] enumArr = this.f23412e;
        int length = enumArr.length;
        dVar.getClass();
        d.b(i7, length);
        return enumArr[i7];
    }

    @Override // kotlin.collections.h, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) y.v(iOrdinal, this.f23412e)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // kotlin.collections.h, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return indexOf(element);
    }
}
