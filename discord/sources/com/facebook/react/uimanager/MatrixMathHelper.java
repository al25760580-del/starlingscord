package com.facebook.react.uimanager;

import com.swmansion.reanimated.layoutReanimation.Snapshot;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b*\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001;B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0007J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\fH\u0007J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0007J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0007J \u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0007J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0007J\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0005H\u0007J\u0018\u0010\u001f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0007J(\u0010 \u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005H\u0007J\u0018\u0010#\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0007J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005H\u0007J\b\u0010&\u001a\u00020\fH\u0007J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0007J\u0010\u0010)\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\fH\u0007J\u0018\u0010*\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0005H\u0007J\u0018\u0010,\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0005H\u0007J\u0018\u0010.\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0005H\u0007J\u0016\u0010/\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0005J \u00100\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0007J(\u00103\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u0005H\u0007J\u0018\u00105\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0005H\u0007J\u0018\u00107\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0005H\u0007J\u0018\u00108\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0005H\u0007J\u0018\u00109\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0005H\u0007J\u0018\u0010:\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/facebook/react/uimanager/MatrixMathHelper;", "", "<init>", "()V", "EPSILON", "", "isZero", "", "d", "multiplyInto", "", "out", "", "a", "b", "decomposeMatrix", Snapshot.TRANSFORM_MATRIX, "ctx", "Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;", "determinant", "matrix", "inverse", "transpose", "m", "multiplyVectorByMatrix", "v", "result", "v3Length", "v3Normalize", "vector", "norm", "v3Dot", "v3Combine", "aScale", "bScale", "v3Cross", "roundTo3Places", "n", "createIdentityMatrix", "degreesToRadians", "degrees", "resetIdentityMatrix", "applyPerspective", "perspective", "applyScaleX", "factor", "applyScaleY", "applyScaleZ", "applyTranslate2D", "x", "y", "applyTranslate3D", "z", "applySkewX", "radians", "applySkewY", "applyRotateX", "applyRotateY", "applyRotateZ", "MatrixDecompositionContext", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MatrixMathHelper {
    private static final double EPSILON = 1.0E-5d;

    @NotNull
    public static final MatrixMathHelper INSTANCE = new MatrixMathHelper();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bR\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;", "", "<init>", "()V", "perspective", "", "scale", "skew", "translation", "rotationDegrees", "reset", "", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class MatrixDecompositionContext {

        @NotNull
        private static final Companion Companion = new Companion(null);

        @NotNull
        public double[] perspective = new double[4];

        @NotNull
        public double[] scale = new double[3];

        @NotNull
        public double[] skew = new double[3];

        @NotNull
        public double[] translation = new double[3];

        @NotNull
        public double[] rotationDegrees = new double[3];

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0013\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext$Companion;", "", "<init>", "()V", "resetArray", "", "arr", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void resetArray(double[] arr) {
                int length = arr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    arr[i7] = 0.0d;
                }
            }

            private Companion() {
            }
        }

        public final void reset() {
            Companion companion = Companion;
            companion.resetArray(this.perspective);
            companion.resetArray(this.scale);
            companion.resetArray(this.skew);
            companion.resetArray(this.translation);
            companion.resetArray(this.rotationDegrees);
        }
    }

    private MatrixMathHelper() {
    }

    public static final void applyPerspective(@NotNull double[] m5, double perspective) {
        Intrinsics.checkNotNullParameter(m5, "m");
        m5[11] = ((double) (-1)) / perspective;
    }

    public static final void applyRotateX(@NotNull double[] m5, double radians) {
        Intrinsics.checkNotNullParameter(m5, "m");
        m5[5] = Math.cos(radians);
        m5[6] = Math.sin(radians);
        m5[9] = -Math.sin(radians);
        m5[10] = Math.cos(radians);
    }

    public static final void applyRotateY(@NotNull double[] m5, double radians) {
        Intrinsics.checkNotNullParameter(m5, "m");
        m5[0] = Math.cos(radians);
        m5[2] = -Math.sin(radians);
        m5[8] = Math.sin(radians);
        m5[10] = Math.cos(radians);
    }

    public static final void applyRotateZ(@NotNull double[] m5, double radians) {
        Intrinsics.checkNotNullParameter(m5, "m");
        m5[0] = Math.cos(radians);
        m5[1] = Math.sin(radians);
        m5[4] = -Math.sin(radians);
        m5[5] = Math.cos(radians);
    }

    public static final void applyScaleX(@NotNull double[] m5, double factor) {
        Intrinsics.checkNotNullParameter(m5, "m");
        m5[0] = factor;
    }

    public static final void applyScaleY(@NotNull double[] m5, double factor) {
        Intrinsics.checkNotNullParameter(m5, "m");
        m5[5] = factor;
    }

    public static final void applySkewX(@NotNull double[] m5, double radians) {
        Intrinsics.checkNotNullParameter(m5, "m");
        m5[4] = Math.tan(radians);
    }

    public static final void applySkewY(@NotNull double[] m5, double radians) {
        Intrinsics.checkNotNullParameter(m5, "m");
        m5[1] = Math.tan(radians);
    }

    public static final void applyTranslate2D(@NotNull double[] m5, double x5, double y5) {
        Intrinsics.checkNotNullParameter(m5, "m");
        m5[12] = x5;
        m5[13] = y5;
    }

    public static final void applyTranslate3D(@NotNull double[] m5, double x5, double y5, double z5) {
        Intrinsics.checkNotNullParameter(m5, "m");
        m5[12] = x5;
        m5[13] = y5;
        m5[14] = z5;
    }

    @NotNull
    public static final double[] createIdentityMatrix() {
        double[] dArr = new double[16];
        resetIdentityMatrix(dArr);
        return dArr;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d0 A[LOOP:3: B:36:0x00ce->B:37:0x00d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x00df A[LOOP:4: B:39:0x00dd->B:40:0x00df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ea A[LOOP:5: B:42:0x00e8->B:43:0x00ea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x018f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0193 A[LOOP:6: B:47:0x0191->B:48:0x0193, LOOP_END] */
    public static final void decomposeMatrix(@NotNull double[] transformMatrix, @NotNull MatrixDecompositionContext ctx) {
        char c8;
        int i7;
        double[][] dArr;
        int i10;
        int i11;
        double[] dArrV3Normalize;
        int i12;
        Intrinsics.checkNotNullParameter(transformMatrix, "transformMatrix");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        io.sentry.config.a.d(transformMatrix.length == 16);
        double[] dArr2 = ctx.perspective;
        double[] dArr3 = ctx.scale;
        double[] dArr4 = ctx.skew;
        double[] dArr5 = ctx.translation;
        double[] dArr6 = ctx.rotationDegrees;
        if (INSTANCE.isZero(transformMatrix[15])) {
            return;
        }
        double[][] dArr7 = new double[4][];
        for (int i13 = 0; i13 < 4; i13++) {
            dArr7[i13] = new double[4];
        }
        double[] dArr8 = new double[16];
        for (int i14 = 0; i14 < 4; i14++) {
            for (int i15 = 0; i15 < 4; i15++) {
                int i16 = (i14 * 4) + i15;
                double d6 = transformMatrix[i16] / transformMatrix[15];
                dArr7[i14][i15] = d6;
                if (i15 == 3) {
                    d6 = 0.0d;
                }
                dArr8[i16] = d6;
            }
        }
        dArr8[15] = 1.0d;
        MatrixMathHelper matrixMathHelper = INSTANCE;
        if (matrixMathHelper.isZero(determinant(dArr8))) {
            return;
        }
        if (matrixMathHelper.isZero(dArr7[0][3])) {
            c8 = 2;
            if (matrixMathHelper.isZero(dArr7[1][3]) && matrixMathHelper.isZero(dArr7[2][3])) {
                dArr2[2] = 0.0d;
                dArr2[1] = 0.0d;
                dArr2[0] = 0.0d;
                dArr2[3] = 1.0d;
            }
            for (i7 = 0; i7 < 3; i7++) {
                dArr5[i7] = dArr7[3][i7];
            }
            dArr = new double[3][];
            for (i10 = 0; i10 < 3; i10++) {
                dArr[i10] = new double[3];
            }
            for (i11 = 0; i11 < 3; i11++) {
                double[] dArr9 = dArr[i11];
                double[] dArr10 = dArr7[i11];
                dArr9[0] = dArr10[0];
                dArr9[1] = dArr10[1];
                dArr9[c8] = dArr10[c8];
            }
            double dV3Length = v3Length(dArr[0]);
            dArr3[0] = dV3Length;
            double[] dArrV3Normalize2 = v3Normalize(dArr[0], dV3Length);
            dArr[0] = dArrV3Normalize2;
            double dV3Dot = v3Dot(dArrV3Normalize2, dArr[1]);
            dArr4[0] = dV3Dot;
            double[] dArrV3Combine = v3Combine(dArr[1], dArr[0], 1.0d, -dV3Dot);
            dArr[1] = dArrV3Combine;
            double dV3Length2 = v3Length(dArrV3Combine);
            dArr3[1] = dV3Length2;
            dArr[1] = v3Normalize(dArr[1], dV3Length2);
            dArr4[0] = dArr4[0] / dArr3[1];
            double dV3Dot2 = v3Dot(dArr[0], dArr[c8]);
            dArr4[1] = dV3Dot2;
            double[] dArrV3Combine2 = v3Combine(dArr[c8], dArr[0], 1.0d, -dV3Dot2);
            dArr[c8] = dArrV3Combine2;
            double dV3Dot3 = v3Dot(dArr[1], dArrV3Combine2);
            dArr4[c8] = dV3Dot3;
            double[] dArrV3Combine3 = v3Combine(dArr[c8], dArr[1], 1.0d, -dV3Dot3);
            dArr[c8] = dArrV3Combine3;
            double dV3Length3 = v3Length(dArrV3Combine3);
            dArr3[c8] = dV3Length3;
            dArrV3Normalize = v3Normalize(dArr[c8], dV3Length3);
            dArr[c8] = dArrV3Normalize;
            double d7 = dArr4[1];
            double d8 = dArr3[c8];
            dArr4[1] = d7 / d8;
            dArr4[c8] = dArr4[c8] / d8;
            if (v3Dot(dArr[0], v3Cross(dArr[1], dArrV3Normalize)) < 0.0d) {
                for (i12 = 0; i12 < 3; i12++) {
                    dArr3[i12] = dArr3[i12] * (-1.0d);
                    double[] dArr11 = dArr[i12];
                    dArr11[0] = dArr11[0] * (-1.0d);
                    dArr11[1] = dArr11[1] * (-1.0d);
                    dArr11[c8] = dArr11[c8] * (-1.0d);
                }
            }
            double[] dArr12 = dArr[c8];
            dArr6[0] = roundTo3Places((-Math.atan2(dArr12[1], dArr12[c8])) * 57.29577951308232d);
            double[] dArr13 = dArr[c8];
            double d9 = -dArr13[0];
            double d10 = dArr13[1];
            double d11 = dArr13[c8];
            dArr6[1] = roundTo3Places((-Math.atan2(d9, Math.sqrt((d11 * d11) + (d10 * d10)))) * 57.29577951308232d);
            dArr6[c8] = roundTo3Places((-Math.atan2(dArr[1][0], dArr[0][0])) * 57.29577951308232d);
        }
        c8 = 2;
        double d12 = dArr7[0][3];
        double d13 = dArr7[1][3];
        double d14 = dArr7[c8][3];
        double d15 = dArr7[3][3];
        double[] dArr14 = new double[4];
        dArr14[0] = d12;
        dArr14[1] = d13;
        dArr14[c8] = d14;
        dArr14[3] = d15;
        multiplyVectorByMatrix(dArr14, transpose(inverse(dArr8)), dArr2);
        while (i7 < 3) {
            dArr5[i7] = dArr7[3][i7];
        }
        dArr = new double[3][];
        while (i10 < 3) {
            dArr[i10] = new double[3];
        }
        while (i11 < 3) {
            double[] dArr15 = dArr[i11];
            double[] dArr16 = dArr7[i11];
            dArr15[0] = dArr16[0];
            dArr15[1] = dArr16[1];
            dArr15[c8] = dArr16[c8];
        }
        double dV3Length4 = v3Length(dArr[0]);
        dArr3[0] = dV3Length4;
        double[] dArrV3Normalize3 = v3Normalize(dArr[0], dV3Length4);
        dArr[0] = dArrV3Normalize3;
        double dV3Dot4 = v3Dot(dArrV3Normalize3, dArr[1]);
        dArr4[0] = dV3Dot4;
        double[] dArrV3Combine4 = v3Combine(dArr[1], dArr[0], 1.0d, -dV3Dot4);
        dArr[1] = dArrV3Combine4;
        double dV3Length5 = v3Length(dArrV3Combine4);
        dArr3[1] = dV3Length5;
        dArr[1] = v3Normalize(dArr[1], dV3Length5);
        dArr4[0] = dArr4[0] / dArr3[1];
        double dV3Dot5 = v3Dot(dArr[0], dArr[c8]);
        dArr4[1] = dV3Dot5;
        double[] dArrV3Combine5 = v3Combine(dArr[c8], dArr[0], 1.0d, -dV3Dot5);
        dArr[c8] = dArrV3Combine5;
        double dV3Dot6 = v3Dot(dArr[1], dArrV3Combine5);
        dArr4[c8] = dV3Dot6;
        double[] dArrV3Combine6 = v3Combine(dArr[c8], dArr[1], 1.0d, -dV3Dot6);
        dArr[c8] = dArrV3Combine6;
        double dV3Length6 = v3Length(dArrV3Combine6);
        dArr3[c8] = dV3Length6;
        dArrV3Normalize = v3Normalize(dArr[c8], dV3Length6);
        dArr[c8] = dArrV3Normalize;
        double d16 = dArr4[1];
        double d17 = dArr3[c8];
        dArr4[1] = d16 / d17;
        dArr4[c8] = dArr4[c8] / d17;
        if (v3Dot(dArr[0], v3Cross(dArr[1], dArrV3Normalize)) < 0.0d) {
            while (i12 < 3) {
                dArr3[i12] = dArr3[i12] * (-1.0d);
                double[] dArr17 = dArr[i12];
                dArr17[0] = dArr17[0] * (-1.0d);
                dArr17[1] = dArr17[1] * (-1.0d);
                dArr17[c8] = dArr17[c8] * (-1.0d);
            }
        }
        double[] dArr18 = dArr[c8];
        dArr6[0] = roundTo3Places((-Math.atan2(dArr18[1], dArr18[c8])) * 57.29577951308232d);
        double[] dArr19 = dArr[c8];
        double d18 = -dArr19[0];
        double d19 = dArr19[1];
        double d110 = dArr19[c8];
        dArr6[1] = roundTo3Places((-Math.atan2(d18, Math.sqrt((d110 * d110) + (d19 * d19)))) * 57.29577951308232d);
        dArr6[c8] = roundTo3Places((-Math.atan2(dArr[1][0], dArr[0][0])) * 57.29577951308232d);
    }

    public static final double degreesToRadians(double degrees) {
        return (degrees * 3.141592653589793d) / ((double) 180);
    }

    public static final double determinant(@NotNull double[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        double d6 = matrix[0];
        double d7 = matrix[1];
        double d8 = matrix[2];
        double d9 = matrix[3];
        double d10 = matrix[4];
        double d11 = matrix[5];
        double d12 = matrix[6];
        double d13 = matrix[7];
        double d14 = matrix[8];
        double d15 = matrix[9];
        double d16 = matrix[10];
        double d17 = matrix[11];
        double d18 = matrix[12];
        double d19 = matrix[13];
        double d20 = matrix[14];
        double d21 = matrix[15];
        double d22 = d9 * d12;
        double d23 = d8 * d13;
        double d24 = d9 * d11;
        double d25 = d7 * d13;
        double d26 = (d25 * d16 * d18) + ((((d22 * d15) * d18) - ((d23 * d15) * d18)) - ((d24 * d16) * d18));
        double d27 = d8 * d11;
        double d28 = (d27 * d17 * d18) + d26;
        double d29 = d7 * d12;
        double d30 = d9 * d10;
        double d31 = d13 * d6;
        double d32 = d8 * d10;
        double d33 = ((((d30 * d16) * d19) + (((d23 * d14) * d19) + ((d28 - ((d29 * d17) * d18)) - ((d22 * d14) * d19)))) - ((d31 * d16) * d19)) - ((d32 * d17) * d19);
        double d34 = d12 * d6;
        double d35 = d31 * d15 * d20;
        double d36 = d7 * d10;
        double d37 = d6 * d11;
        double d38 = d29 * d14 * d21;
        double d39 = d32 * d15 * d21;
        return (d37 * d16 * d21) + (((d39 + (d38 + (((((d36 * d17) * d20) + (d35 + (((((d24 * d14) * d20) + (((d34 * d17) * d19) + d33)) - ((d25 * d14) * d20)) - ((d30 * d15) * d20)))) - ((d17 * d37) * d20)) - ((d27 * d14) * d21)))) - ((d34 * d15) * d21)) - ((d36 * d16) * d21));
    }

    @NotNull
    public static final double[] inverse(@NotNull double[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        double dDeterminant = determinant(matrix);
        if (INSTANCE.isZero(dDeterminant)) {
            return matrix;
        }
        double d6 = matrix[0];
        double d7 = matrix[1];
        double d8 = matrix[2];
        double d9 = matrix[3];
        double d10 = matrix[4];
        double d11 = matrix[5];
        double d12 = matrix[6];
        double d13 = matrix[7];
        double d14 = matrix[8];
        double d15 = matrix[9];
        double d16 = matrix[10];
        double d17 = matrix[11];
        double d18 = matrix[12];
        double d19 = matrix[13];
        double d20 = matrix[14];
        double d21 = matrix[15];
        double d22 = d12 * d17;
        double d23 = d13 * d16;
        double d24 = d13 * d15;
        double d25 = d11 * d17;
        double d26 = d12 * d15;
        double d27 = d11 * d16;
        double d28 = ((d27 * d21) + ((((d24 * d20) + ((d22 * d19) - (d23 * d19))) - (d25 * d20)) - (d26 * d21))) / dDeterminant;
        double d29 = d9 * d16;
        double d30 = d8 * d17;
        double d31 = d9 * d15;
        double d32 = d7 * d17;
        double d33 = d8 * d15;
        double d34 = (d33 * d21) + (d32 * d20) + (((d29 * d19) - (d30 * d19)) - (d31 * d20));
        double d35 = d7 * d16;
        double d36 = d8 * d13;
        double d37 = d9 * d12;
        double d38 = d9 * d11;
        double d39 = d7 * d13;
        double d40 = d8 * d11;
        double d41 = d7 * d12;
        double d42 = ((d41 * d21) + ((((d38 * d20) + ((d36 * d19) - (d37 * d19))) - (d39 * d20)) - (d40 * d21))) / dDeterminant;
        double d43 = (((d40 * d17) + ((d39 * d16) + (((d37 * d15) - (d36 * d15)) - (d38 * d16)))) - (d41 * d17)) / dDeterminant;
        double d44 = (d23 * d18) - (d22 * d18);
        double d45 = d13 * d14;
        double d46 = d10 * d17;
        double d47 = (d46 * d20) + (d44 - (d45 * d20));
        double d48 = d12 * d14;
        double d49 = (d48 * d21) + d47;
        double d50 = d10 * d16;
        double d51 = (d30 * d18) - (d29 * d18);
        double d52 = d9 * d14;
        double d53 = (d52 * d20) + d51;
        double d54 = d6 * d17;
        double d55 = d8 * d14;
        double d56 = d6 * d16;
        double d57 = ((d56 * d21) + ((d53 - (d54 * d20)) - (d55 * d21))) / dDeterminant;
        double d58 = d9 * d10;
        double d59 = d13 * d6;
        double d60 = d8 * d10;
        double d61 = d12 * d6;
        double d62 = (((d60 * d21) + ((d59 * d20) + (((d37 * d18) - (d36 * d18)) - (d58 * d20)))) - (d61 * d21)) / dDeterminant;
        double d63 = ((d61 * d17) + ((((d58 * d16) + ((d36 * d14) - (d37 * d14))) - (d59 * d16)) - (d60 * d17))) / dDeterminant;
        double d64 = ((d45 * d19) + ((d25 * d18) - (d24 * d18))) - (d46 * d19);
        double d65 = d11 * d14;
        double d66 = d10 * d15;
        double d67 = ((d66 * d21) + (d64 - (d65 * d21))) / dDeterminant;
        double d68 = d7 * d14;
        double d69 = (d68 * d21) + (d54 * d19) + (((d31 * d18) - (d32 * d18)) - (d52 * d19));
        double d70 = d6 * d15;
        double d71 = d7 * d10;
        double d72 = d6 * d11;
        return new double[]{d28, (d34 - (d35 * d21)) / dDeterminant, d42, d43, (d49 - (d50 * d21)) / dDeterminant, d57, d62, d63, d67, (d69 - (d70 * d21)) / dDeterminant, ((d21 * d72) + ((((d58 * d19) + ((d39 * d18) - (d38 * d18))) - (d59 * d19)) - (d71 * d21))) / dDeterminant, (((d71 * d17) + ((d59 * d15) + (((d38 * d14) - (d39 * d14)) - (d58 * d15)))) - (d17 * d72)) / dDeterminant, (((d65 * d20) + ((d50 * d19) + (((d26 * d18) - (d27 * d18)) - (d48 * d19)))) - (d66 * d20)) / dDeterminant, ((d70 * d20) + ((((d55 * d19) + ((d35 * d18) - (d33 * d18))) - (d56 * d19)) - (d68 * d20))) / dDeterminant, (((d71 * d20) + ((d19 * d61) + (((d40 * d18) - (d18 * d41)) - (d60 * d19)))) - (d20 * d72)) / dDeterminant, ((d72 * d16) + ((((d60 * d15) + ((d41 * d14) - (d40 * d14))) - (d61 * d15)) - (d71 * d16))) / dDeterminant};
    }

    private final boolean isZero(double d6) {
        return !Double.isNaN(d6) && Math.abs(d6) < EPSILON;
    }

    public static final void multiplyInto(@NotNull double[] out, @NotNull double[] a10, @NotNull double[] b10) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        double d6 = a10[0];
        double d7 = a10[1];
        double d8 = a10[2];
        double d9 = a10[3];
        double d10 = a10[4];
        double d11 = a10[5];
        double d12 = a10[6];
        double d13 = a10[7];
        double d14 = a10[8];
        double d15 = a10[9];
        double d16 = a10[10];
        double d17 = a10[11];
        double d18 = a10[12];
        double d19 = a10[13];
        double d20 = a10[14];
        double d21 = a10[15];
        double d22 = b10[0];
        double d23 = b10[1];
        double d24 = b10[2];
        double d25 = b10[3];
        out[0] = (d25 * d18) + (d24 * d14) + (d23 * d10) + (d22 * d6);
        out[1] = (d25 * d19) + (d24 * d15) + (d23 * d11) + (d22 * d7);
        out[2] = (d25 * d20) + (d24 * d16) + (d23 * d12) + (d22 * d8);
        double d26 = d24 * d17;
        double d27 = d25 * d21;
        out[3] = d27 + d26 + (d23 * d13) + (d22 * d9);
        double d28 = b10[4];
        double d29 = b10[5];
        double d30 = b10[6];
        double d31 = b10[7];
        out[4] = (d31 * d18) + (d30 * d14) + (d29 * d10) + (d28 * d6);
        out[5] = (d31 * d19) + (d30 * d15) + (d29 * d11) + (d28 * d7);
        out[6] = (d31 * d20) + (d30 * d16) + (d29 * d12) + (d28 * d8);
        double d32 = d30 * d17;
        double d33 = d31 * d21;
        out[7] = d33 + d32 + (d29 * d13) + (d28 * d9);
        double d34 = b10[8];
        double d35 = b10[9];
        double d36 = b10[10];
        double d37 = b10[11];
        out[8] = (d37 * d18) + (d36 * d14) + (d35 * d10) + (d34 * d6);
        out[9] = (d37 * d19) + (d36 * d15) + (d35 * d11) + (d34 * d7);
        out[10] = (d37 * d20) + (d36 * d16) + (d35 * d12) + (d34 * d8);
        double d38 = d36 * d17;
        double d39 = d37 * d21;
        out[11] = d39 + d38 + (d35 * d13) + (d34 * d9);
        double d40 = b10[12];
        double d41 = b10[13];
        double d42 = b10[14];
        double d43 = b10[15];
        double d44 = d14 * d42;
        double d45 = d18 * d43;
        out[12] = d45 + d44 + (d10 * d41) + (d6 * d40);
        double d46 = d15 * d42;
        double d47 = d19 * d43;
        out[13] = d47 + d46 + (d11 * d41) + (d7 * d40);
        double d48 = d16 * d42;
        double d49 = d20 * d43;
        out[14] = d49 + d48 + (d12 * d41) + (d8 * d40);
        double d50 = d42 * d17;
        double d51 = d43 * d21;
        out[15] = d51 + d50 + (d41 * d13) + (d40 * d9);
    }

    public static final void multiplyVectorByMatrix(@NotNull double[] v6, @NotNull double[] m5, @NotNull double[] result) {
        Intrinsics.checkNotNullParameter(v6, "v");
        Intrinsics.checkNotNullParameter(m5, "m");
        Intrinsics.checkNotNullParameter(result, "result");
        double d6 = v6[0];
        double d7 = v6[1];
        double d8 = v6[2];
        double d9 = v6[3];
        result[0] = (m5[12] * d9) + (m5[8] * d8) + (m5[4] * d7) + (m5[0] * d6);
        result[1] = (m5[13] * d9) + (m5[9] * d8) + (m5[5] * d7) + (m5[1] * d6);
        result[2] = (m5[14] * d9) + (m5[10] * d8) + (m5[6] * d7) + (m5[2] * d6);
        result[3] = (d9 * m5[15]) + (d8 * m5[11]) + (d7 * m5[7]) + (d6 * m5[3]);
    }

    public static final void resetIdentityMatrix(@NotNull double[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        matrix[14] = 0.0d;
        matrix[13] = 0.0d;
        matrix[12] = 0.0d;
        matrix[11] = 0.0d;
        matrix[9] = 0.0d;
        matrix[8] = 0.0d;
        matrix[7] = 0.0d;
        matrix[6] = 0.0d;
        matrix[4] = 0.0d;
        matrix[3] = 0.0d;
        matrix[2] = 0.0d;
        matrix[1] = 0.0d;
        matrix[15] = 1.0d;
        matrix[10] = 1.0d;
        matrix[5] = 1.0d;
        matrix[0] = 1.0d;
    }

    public static final double roundTo3Places(double n10) {
        return Math.round(n10 * 1000.0d) * 0.001d;
    }

    @NotNull
    public static final double[] transpose(@NotNull double[] m5) {
        Intrinsics.checkNotNullParameter(m5, "m");
        return new double[]{m5[0], m5[4], m5[8], m5[12], m5[1], m5[5], m5[9], m5[13], m5[2], m5[6], m5[10], m5[14], m5[3], m5[7], m5[11], m5[15]};
    }

    @NotNull
    public static final double[] v3Combine(@NotNull double[] a10, @NotNull double[] b10, double aScale, double bScale) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new double[]{(b10[0] * bScale) + (a10[0] * aScale), (b10[1] * bScale) + (a10[1] * aScale), (bScale * b10[2]) + (aScale * a10[2])};
    }

    @NotNull
    public static final double[] v3Cross(@NotNull double[] a10, @NotNull double[] b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        double d6 = a10[1];
        double d7 = b10[2];
        double d8 = a10[2];
        double d9 = b10[1];
        double d10 = b10[0];
        double d11 = a10[0];
        return new double[]{(d6 * d7) - (d8 * d9), (d8 * d10) - (d7 * d11), (d11 * d9) - (d6 * d10)};
    }

    public static final double v3Dot(@NotNull double[] a10, @NotNull double[] b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return (a10[2] * b10[2]) + (a10[1] * b10[1]) + (a10[0] * b10[0]);
    }

    public static final double v3Length(@NotNull double[] a10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        double d6 = a10[0];
        double d7 = a10[1];
        double d8 = (d7 * d7) + (d6 * d6);
        double d9 = a10[2];
        return Math.sqrt((d9 * d9) + d8);
    }

    @NotNull
    public static final double[] v3Normalize(@NotNull double[] vector, double norm) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        double d6 = 1;
        if (INSTANCE.isZero(norm)) {
            norm = v3Length(vector);
        }
        double d7 = d6 / norm;
        return new double[]{vector[0] * d7, vector[1] * d7, vector[2] * d7};
    }

    public final void applyScaleZ(@NotNull double[] m5, double factor) {
        Intrinsics.checkNotNullParameter(m5, "m");
        m5[10] = factor;
    }
}
