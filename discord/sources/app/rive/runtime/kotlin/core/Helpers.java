package app.rive.runtime.kotlin.core;

import android.graphics.PointF;
import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u000eJ9\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0082 ¨\u0006\u0013"}, d2 = {"Lapp/rive/runtime/kotlin/core/Helpers;", "", "()V", "convertToArtboardSpace", "Landroid/graphics/PointF;", "touchBounds", "Landroid/graphics/RectF;", "touchLocation", "fit", "Lapp/rive/runtime/kotlin/core/Fit;", "alignment", "Lapp/rive/runtime/kotlin/core/Alignment;", "artboardBounds", "scaleFactor", "", "cppConvertToArtboardSpace", "touchSpaceBounds", "touchSpaceLocation", "artboardSpaceBounds", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Helpers {
    public static final int $stable = 0;

    @NotNull
    public static final Helpers INSTANCE = new Helpers();

    private Helpers() {
    }

    public static /* synthetic */ PointF convertToArtboardSpace$default(Helpers helpers, RectF rectF, PointF pointF, Fit fit, Alignment alignment, RectF rectF2, float f2, int i7, Object obj) {
        if ((i7 & 32) != 0) {
            f2 = 1.0f;
        }
        return helpers.convertToArtboardSpace(rectF, pointF, fit, alignment, rectF2, f2);
    }

    private final native PointF cppConvertToArtboardSpace(RectF touchSpaceBounds, PointF touchSpaceLocation, Fit fit, Alignment alignment, RectF artboardSpaceBounds, float scaleFactor);

    @NotNull
    public final PointF convertToArtboardSpace(@NotNull RectF touchBounds, @NotNull PointF touchLocation, @NotNull Fit fit, @NotNull Alignment alignment, @NotNull RectF artboardBounds, float scaleFactor) {
        Intrinsics.checkNotNullParameter(touchBounds, "touchBounds");
        Intrinsics.checkNotNullParameter(touchLocation, "touchLocation");
        Intrinsics.checkNotNullParameter(fit, "fit");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(artboardBounds, "artboardBounds");
        return cppConvertToArtboardSpace(touchBounds, touchLocation, fit, alignment, artboardBounds, scaleFactor);
    }
}
