package k0;

import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function f14208b;

    public a(String str, Function function) {
        this.f14207a = str;
        this.f14208b = function;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f14207a, aVar.f14207a) && Intrinsics.areEqual(this.f14208b, aVar.f14208b);
    }

    public final int hashCode() {
        String str = this.f14207a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Function function = this.f14208b;
        return iHashCode + (function != null ? function.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f14207a + ", action=" + this.f14208b + ')';
    }
}
