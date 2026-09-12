package org.webrtc;

import android.graphics.Matrix;
import android.graphics.Point;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class RendererCommon {
    private static final float BALANCED_VISIBLE_FRACTION = 0.5625f;

    public interface GlDrawer {
        void drawOes(int i7, float[] fArr, int i10, int i11, int i12, int i13, int i14, int i15);

        void drawRgb(int i7, float[] fArr, int i10, int i11, int i12, int i13, int i14, int i15);

        void drawYuv(int[] iArr, float[] fArr, int i7, int i10, int i11, int i12, int i13, int i14);

        void release();
    }

    public interface RendererEvents {
        void onFirstFrameRendered();

        void onFrameResolutionChanged(int i7, int i10, int i11);
    }

    public enum ScalingType {
        SCALE_ASPECT_FIT,
        SCALE_ASPECT_FILL,
        SCALE_ASPECT_BALANCED
    }

    public static class VideoLayoutMeasure {
        private float visibleFractionMatchOrientation;
        private float visibleFractionMismatchOrientation;

        public VideoLayoutMeasure() {
            ScalingType scalingType = ScalingType.SCALE_ASPECT_BALANCED;
            this.visibleFractionMatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
            this.visibleFractionMismatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
        }

        public Point measure(int i7, int i10, int i11, int i12) {
            int defaultSize = View.getDefaultSize(Integer.MAX_VALUE, i7);
            int defaultSize2 = View.getDefaultSize(Integer.MAX_VALUE, i10);
            if (i11 == 0 || i12 == 0 || defaultSize == 0 || defaultSize2 == 0) {
                return new Point(defaultSize, defaultSize2);
            }
            float f2 = i11 / i12;
            Point displaySize = RendererCommon.getDisplaySize(((f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1)) > 0) == (((float) defaultSize) / ((float) defaultSize2) > 1.0f) ? this.visibleFractionMatchOrientation : this.visibleFractionMismatchOrientation, f2, defaultSize, defaultSize2);
            if (View.MeasureSpec.getMode(i7) == 1073741824) {
                displaySize.x = defaultSize;
            }
            if (View.MeasureSpec.getMode(i10) == 1073741824) {
                displaySize.y = defaultSize2;
            }
            return displaySize;
        }

        public void setScalingType(ScalingType scalingType) {
            setScalingType(scalingType, scalingType);
        }

        public void setVisibleFraction(float f2, float f7) {
            this.visibleFractionMatchOrientation = f2;
            this.visibleFractionMismatchOrientation = f7;
        }

        public void setScalingType(ScalingType scalingType, ScalingType scalingType2) {
            this.visibleFractionMatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
            this.visibleFractionMismatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType2);
        }
    }

    private static void adjustOrigin(float[] fArr) {
        float f2 = fArr[12] - ((fArr[0] + fArr[4]) * 0.5f);
        fArr[12] = f2;
        float f7 = fArr[13] - ((fArr[1] + fArr[5]) * 0.5f);
        fArr[13] = f7;
        fArr[12] = f2 + 0.5f;
        fArr[13] = f7 + 0.5f;
    }

    public static float[] convertMatrixFromAndroidGraphicsMatrix(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[3], 0.0f, fArr[6], fArr[1], fArr[4], 0.0f, fArr[7], 0.0f, 0.0f, 1.0f, 0.0f, fArr[2], fArr[5], 0.0f, fArr[8]};
    }

    public static Matrix convertMatrixToAndroidGraphicsMatrix(float[] fArr) {
        float[] fArr2 = {fArr[0], fArr[4], fArr[12], fArr[1], fArr[5], fArr[13], fArr[3], fArr[7], fArr[15]};
        Matrix matrix = new Matrix();
        matrix.setValues(fArr2);
        return matrix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float convertScalingTypeToVisibleFraction(ScalingType scalingType) {
        int iOrdinal = scalingType.ordinal();
        if (iOrdinal == 0) {
            return 1.0f;
        }
        if (iOrdinal == 1) {
            return 0.0f;
        }
        if (iOrdinal == 2) {
            return BALANCED_VISIBLE_FRACTION;
        }
        throw new IllegalArgumentException();
    }

    public static Point getDisplaySize(ScalingType scalingType, float f2, int i7, int i10) {
        return getDisplaySize(convertScalingTypeToVisibleFraction(scalingType), f2, i7, i10);
    }

    public static float[] getLayoutMatrix(boolean z5, float f2, float f7) {
        float f10;
        float f11;
        if (f7 > f2) {
            f11 = f2 / f7;
            f10 = 1.0f;
        } else {
            f10 = f7 / f2;
            f11 = 1.0f;
        }
        if (z5) {
            f10 *= -1.0f;
        }
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        android.opengl.Matrix.scaleM(fArr, 0, f10, f11, 1.0f);
        adjustOrigin(fArr);
        return fArr;
    }

    public static Point getDisplaySize(float f2, float f7, int i7, int i10) {
        return (f2 == 0.0f || f7 == 0.0f) ? new Point(i7, i10) : new Point(Math.min(i7, Math.round((i10 / f2) * f7)), Math.min(i10, Math.round((i7 / f2) / f7)));
    }
}
