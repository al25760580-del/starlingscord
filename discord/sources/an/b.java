package an;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.swmansion.rnscreens.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Animation {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f662d;

    public b(y mFragment) {
        Intrinsics.checkNotNullParameter(mFragment, "mFragment");
        this.f662d = mFragment;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(final float f2, Transformation t5) {
        Intrinsics.checkNotNullParameter(t5, "t");
        super.applyTransformation(f2, t5);
        View view = this.f662d.getView();
        if (view != null) {
            view.post(new Runnable() { // from class: an.a
                @Override // java.lang.Runnable
                public final void run() {
                    y yVar = this.f660d.f662d;
                    yVar.v(f2, !yVar.isResumed());
                }
            });
        }
    }
}
