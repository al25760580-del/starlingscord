package bn;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends a {
    @Override // com.swmansion.rnscreens.stack.views.ChildrenDrawingOrderStrategy
    public final void a(List drawingOperations) {
        Intrinsics.checkNotNullParameter(drawingOperations, "drawingOperations");
        if (this.f3326a) {
            Intrinsics.checkNotNullParameter(drawingOperations, "<this>");
            Collections.reverse(drawingOperations);
        }
    }
}
