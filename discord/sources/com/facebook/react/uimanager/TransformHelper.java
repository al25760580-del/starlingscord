package com.facebook.react.uimanager;

import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.ReactNativeJNISoLoader;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b0;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0007J:\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J2\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0007J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\bH\u0002J$\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0002J3\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u001dH\u0083 R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/facebook/react/uimanager/TransformHelper;", "", "<init>", "()V", "helperMatrix", "Ljava/lang/ThreadLocal;", "", "convertToRadians", "", "transformMap", "Lcom/facebook/react/bridge/ReadableMap;", "key", "", "processTransform", "", "transforms", "Lcom/facebook/react/bridge/ReadableArray;", "result", "viewWidth", "", "viewHeight", ViewProps.TRANSFORM_ORIGIN, "allowPercentageResolution", "", "parseTranslateValue", "stringValue", "dimension", "getTranslateForTransformOrigin", "nativeProcessTransform", "Lcom/facebook/react/bridge/NativeArray;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransformHelper {

    @NotNull
    public static final TransformHelper INSTANCE = new TransformHelper();

    @NotNull
    private static final ThreadLocal<double[]> helperMatrix;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        ReactNativeJNISoLoader.staticInit();
        helperMatrix = new ThreadLocal<double[]>() { // from class: com.facebook.react.uimanager.TransformHelper$helperMatrix$1
            @Override // java.lang.ThreadLocal
            public double[] initialValue() {
                return new double[16];
            }
        };
    }

    private TransformHelper() {
    }

    private final double convertToRadians(ReadableMap transformMap, String key) {
        double d6;
        boolean z5 = true;
        if (transformMap.getType(key) == ReadableType.String) {
            String string = transformMap.getString(key);
            Intrinsics.checkNotNull(string);
            if (x.h(string, "rad", false)) {
                string = b0.y(3, string);
            } else if (x.h(string, "deg", false)) {
                string = b0.y(3, string);
                z5 = false;
            }
            d6 = Double.parseDouble(string);
        } else {
            d6 = transformMap.getDouble(key);
        }
        return z5 ? d6 : MatrixMathHelper.degreesToRadians(d6);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    private final double[] getTranslateForTransformOrigin(float viewWidth, float viewHeight, ReadableArray transformOrigin) {
        if (transformOrigin == null) {
            return null;
        }
        if (viewHeight == 0.0f && viewWidth == 0.0f) {
            return null;
        }
        double d6 = ((double) viewWidth) / 2.0d;
        double d7 = ((double) viewHeight) / 2.0d;
        double[] dArr = new double[3];
        boolean z5 = false;
        dArr[0] = d6;
        int i7 = 1;
        dArr[1] = d7;
        dArr[2] = 0.0d;
        int i10 = 0;
        for (int iMin = Math.min(transformOrigin.size(), 3); i10 < iMin; iMin = iMin) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[transformOrigin.getType(i10).ordinal()];
            if (i11 == i7) {
                dArr[i10] = transformOrigin.getDouble(i10);
            } else if (i11 == 2) {
                String string = transformOrigin.getString(i10);
                Intrinsics.checkNotNull(string);
                if (x.h(string, "%", z5)) {
                    dArr[i10] = (((double) (i10 == 0 ? viewWidth : viewHeight)) * Double.parseDouble(b0.y(i7, string))) / 100.0d;
                }
            }
            i10++;
            z5 = z5;
            i7 = i7;
        }
        boolean z6 = z5;
        int i12 = i7;
        double d8 = (-d6) + dArr[z6 ? 1 : 0];
        double d9 = (-d7) + dArr[i12];
        double d10 = dArr[2];
        double[] dArr2 = new double[3];
        dArr2[z6 ? 1 : 0] = d8;
        dArr2[i12] = d9;
        dArr2[2] = d10;
        return dArr2;
    }

    private static final native void nativeProcessTransform(NativeArray transforms, double[] result, float viewWidth, float viewHeight, NativeArray transformOrigin);

    private final double parseTranslateValue(String stringValue, double dimension) {
        try {
            return x.h(stringValue, "%", false) ? (Double.parseDouble(b0.y(1, stringValue)) * dimension) / 100.0d : Double.parseDouble(stringValue);
        } catch (NumberFormatException unused) {
            o8.a.v(ReactConstants.TAG, "Invalid translate value: " + stringValue);
            return 0.0d;
        }
    }

    @d
    public static final void processTransform(@NotNull ReadableArray transforms, @NotNull double[] result) {
        Intrinsics.checkNotNullParameter(transforms, "transforms");
        Intrinsics.checkNotNullParameter(result, "result");
        processTransform(transforms, result, 0.0f, 0.0f, null);
    }

    @d
    public static final void processTransform(@NotNull ReadableArray transforms, @NotNull double[] result, float viewWidth, float viewHeight, ReadableArray transformOrigin, boolean allowPercentageResolution) {
        Intrinsics.checkNotNullParameter(transforms, "transforms");
        Intrinsics.checkNotNullParameter(result, "result");
        processTransform(transforms, result, viewWidth, viewHeight, transformOrigin);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x024c A[PHI: r5 r9 r14 r17
      0x024c: PHI (r5v39 int) = (r5v7 int), (r5v8 int), (r5v16 int), (r5v40 int) binds: [B:103:0x024a, B:94:0x021a, B:61:0x0155, B:26:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r9v10 char) = (r9v2 char), (r9v3 char), (r9v5 char), (r9v11 char) binds: [B:103:0x024a, B:94:0x021a, B:61:0x0155, B:26:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r14v22 int) = (r14v2 int), (r14v3 int), (r14v11 int), (r14v23 int) binds: [B:103:0x024a, B:94:0x021a, B:61:0x0155, B:26:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r17v19 int) = (r17v0 int), (r17v1 int), (r17v9 int), (r17v20 int) binds: [B:103:0x024a, B:94:0x021a, B:61:0x0155, B:26:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01dc, code lost:
    
        if (r11.equals("rotate") == false) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void processTransform(@org.jetbrains.annotations.NotNull com.facebook.react.bridge.ReadableArray r20, @org.jetbrains.annotations.NotNull double[] r21, float r22, float r23, com.facebook.react.bridge.ReadableArray r24) {
        /*
            Method dump skipped, instruction units count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.TransformHelper.processTransform(com.facebook.react.bridge.ReadableArray, double[], float, float, com.facebook.react.bridge.ReadableArray):void");
    }
}
