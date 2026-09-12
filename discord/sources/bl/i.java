package bl;

import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Typeface f3322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3323b;

    public i(String settings, Typeface baseTypeface) {
        Intrinsics.checkNotNullParameter(baseTypeface, "baseTypeface");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f3322a = baseTypeface;
        this.f3323b = settings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f3322a, iVar.f3322a) && Intrinsics.areEqual(this.f3323b, iVar.f3323b);
    }

    public final int hashCode() {
        return this.f3323b.hashCode() + (this.f3322a.hashCode() * 31);
    }

    public final String toString() {
        return "VariationCacheKey(baseTypeface=" + this.f3322a + ", settings=" + this.f3323b + ")";
    }
}
