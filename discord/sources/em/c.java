package em;

import app.rive.runtime.kotlin.core.ViewModelInstance;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends android.support.v4.media.session.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewModelInstance f8457a;

    public c(ViewModelInstance instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.f8457a = instance;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.areEqual(this.f8457a, ((c) obj).f8457a);
    }

    public final int hashCode() {
        return this.f8457a.hashCode();
    }

    public final String toString() {
        return "Instance(instance=" + this.f8457a + ")";
    }
}
