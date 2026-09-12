package v3;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f21391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21392b;

    public d(boolean z5, Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f21391a = uri;
        this.f21392b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f21391a, dVar.f21391a) && this.f21392b == dVar.f21392b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21392b) + (this.f21391a.hashCode() * 31);
    }
}
