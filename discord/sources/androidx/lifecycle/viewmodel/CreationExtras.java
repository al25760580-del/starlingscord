package androidx.lifecycle.viewmodel;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class CreationExtras {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2403a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof CreationExtras) {
            return Intrinsics.areEqual(this.f2403a, ((CreationExtras) obj).f2403a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2403a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f2403a + ')';
    }
}
