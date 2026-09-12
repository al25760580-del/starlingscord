package im;

import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends f {
    public final boolean R = true;

    @Override // im.f
    public final boolean t() {
        return this.R;
    }

    @Override // im.f
    public final void y(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (this.f11896h == 0) {
            d();
        }
    }
}
