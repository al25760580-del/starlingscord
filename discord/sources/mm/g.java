package mm;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.e0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f15901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Screen f15902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoordinatorLayout f15903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f15904d;

    public g(e0 fragment, Screen screen, bn.e coordinatorLayout, d dimmingDelegate) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(dimmingDelegate, "dimmingDelegate");
        this.f15901a = fragment;
        this.f15902b = screen;
        this.f15903c = coordinatorLayout;
        this.f15904d = dimmingDelegate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f15901a, gVar.f15901a) && Intrinsics.areEqual(this.f15902b, gVar.f15902b) && Intrinsics.areEqual(this.f15903c, gVar.f15903c) && Intrinsics.areEqual(this.f15904d, gVar.f15904d);
    }

    public final int hashCode() {
        return this.f15904d.hashCode() + ((this.f15903c.hashCode() + ((this.f15902b.hashCode() + (this.f15901a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SheetAnimationContext(fragment=" + this.f15901a + ", screen=" + this.f15902b + ", coordinatorLayout=" + this.f15903c + ", dimmingDelegate=" + this.f15904d + ")";
    }
}
