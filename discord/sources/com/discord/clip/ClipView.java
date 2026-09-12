package com.discord.clip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fJ6\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fJ\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\fJ\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J(\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001cH\u0014J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$H\u0014J\"\u0010%\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010&\u001a\u00020'H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/discord/clip/ClipView;", "Lcom/facebook/react/views/view/ReactViewGroup;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "cutoutPath", "Landroid/graphics/Path;", "clipPath", "clipPathBackgroundColorPaint", "Landroid/graphics/Paint;", "clipPathRadius", "", "resetCutouts", "", "addCircleCutout", "x", "y", "size", "addRoundedRectCutout", "width", "height", "cornerRadius", "rotationDegrees", "clipToBorderRadius", "borderRadius", "setBackgroundColor", ViewProps.COLOR, "", "onSizeChanged", "w", "h", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "handleClipTo", "invalidate", "", "clip_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClipView extends ReactViewGroup {

    @NotNull
    private final Path clipPath;

    @NotNull
    private final Paint clipPathBackgroundColorPaint;
    private float clipPathRadius;

    @NotNull
    private final Path cutoutPath;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.cutoutPath = new Path();
        this.clipPath = new Path();
        Paint paint = new Paint();
        paint.setColor(0);
        this.clipPathBackgroundColorPaint = paint;
        setWillNotDraw(false);
    }

    private final void handleClipTo(float width, float height, boolean invalidate) {
        if (!this.clipPath.isEmpty()) {
            this.clipPath.rewind();
        }
        float f2 = this.clipPathRadius;
        if (f2 > 0.0f) {
            this.clipPath.addRoundRect(0.0f, 0.0f, width, height, f2, f2, Path.Direction.CCW);
        }
        if (invalidate) {
            invalidate();
        }
    }

    public static /* synthetic */ void handleClipTo$default(ClipView clipView, float f2, float f7, boolean z5, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z5 = false;
        }
        clipView.handleClipTo(f2, f7, z5);
    }

    public final void addCircleCutout(float x5, float y5, float size) {
        float f2 = size / 2;
        this.cutoutPath.addCircle(x5 + f2, y5 + f2, f2, Path.Direction.CCW);
        invalidate();
    }

    public final void addRoundedRectCutout(float x5, float y5, float width, float height, float cornerRadius, float rotationDegrees) {
        if (rotationDegrees == 0.0f) {
            this.cutoutPath.addRoundRect(x5, y5, x5 + width, y5 + height, cornerRadius, cornerRadius, Path.Direction.CCW);
        } else {
            Path path = new Path();
            float f2 = 2;
            float f7 = width / f2;
            float f10 = height / f2;
            path.addRoundRect((-width) / f2, (-height) / f2, f7, f10, cornerRadius, cornerRadius, Path.Direction.CCW);
            Matrix matrix = new Matrix();
            matrix.postRotate(rotationDegrees);
            matrix.postTranslate(x5 + f7, y5 + f10);
            path.transform(matrix);
            this.cutoutPath.addPath(path);
        }
        invalidate();
    }

    public final void clipToBorderRadius(float borderRadius) {
        this.clipPathRadius = borderRadius;
        handleClipTo(getWidth(), getHeight(), true);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!this.clipPath.isEmpty()) {
            ClipPathCompatKt.clipPathCompat(canvas, this.clipPath, Region.Op.INTERSECT);
        }
        if (!this.cutoutPath.isEmpty()) {
            ClipPathCompatKt.clipPathCompat(canvas, this.cutoutPath, Region.Op.DIFFERENCE);
        }
        if (this.clipPathBackgroundColorPaint.getColor() != 0) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.clipPathBackgroundColorPaint);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public void onSizeChanged(int w5, int h6, int oldw, int oldh) {
        super.onSizeChanged(w5, h6, oldw, oldh);
        handleClipTo$default(this, w5, h6, false, 4, null);
    }

    public final void resetCutouts() {
        if (this.cutoutPath.isEmpty()) {
            return;
        }
        this.cutoutPath.rewind();
        invalidate();
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public void setBackgroundColor(int color) {
        this.clipPathBackgroundColorPaint.setColor(color);
    }
}
