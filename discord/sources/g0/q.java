package g0;

import i0.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z.f f9448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f9449b;

    public q(z.f modifier, f0 coordinates) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f9448a = modifier;
        this.f9449b = coordinates;
    }

    public final String toString() {
        return "ModifierInfo(" + this.f9448a + ", " + this.f9449b + ", null)";
    }
}
