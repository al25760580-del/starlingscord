package h8;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f10388a;

    public a(File file) {
        this.f10388a = file;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        return Intrinsics.areEqual(this.f10388a, ((a) obj).f10388a);
    }

    public final int hashCode() {
        return this.f10388a.hashCode();
    }
}
