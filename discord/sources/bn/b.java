package bn;

import java.util.Collections;
import java.util.List;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3327b;

    public b(int i7) {
        this.f3327b = i7;
    }

    @Override // com.swmansion.rnscreens.stack.views.ChildrenDrawingOrderStrategy
    public final void a(List drawingOperations) {
        Intrinsics.checkNotNullParameter(drawingOperations, "drawingOperations");
        if (this.f3326a) {
            int i7 = this.f3327b;
            for (int iF = d0.f(drawingOperations); i7 < iF; iF--) {
                Collections.swap(drawingOperations, i7, iF);
                i7++;
            }
        }
    }
}
