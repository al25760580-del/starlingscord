package com.facebook.react.uimanager.style;

import b1.c;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010\t\u001a\u00020\nJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0002¢\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/uimanager/style/ColorStopUtils;", "", "<init>", "()V", "getFixedColorStops", "", "Lcom/facebook/react/uimanager/style/ProcessedColorStop;", "colorStops", "Lcom/facebook/react/uimanager/style/ColorStop;", "gradientLineLength", "", "processColorTransitionHints", "originalStops", "", "([Lcom/facebook/react/uimanager/style/ProcessedColorStop;)Ljava/util/List;", "resolveColorStopPosition", ViewProps.POSITION, "Lcom/facebook/react/uimanager/LengthPercentage;", "(Lcom/facebook/react/uimanager/LengthPercentage;F)Ljava/lang/Float;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nColorStop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorStop.kt\ncom/facebook/react/uimanager/style/ColorStopUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,247:1\n1#2:248\n*E\n"})
public final class ColorStopUtils {

    @NotNull
    public static final ColorStopUtils INSTANCE = new ColorStopUtils();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LengthPercentageType.values().length];
            try {
                iArr[LengthPercentageType.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LengthPercentageType.PERCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ColorStopUtils() {
    }

    /* JADX WARN: Code duplicated, block: B:18:0x007e A[PHI: r6
      0x007e: PHI (r6v2 int) = (r6v1 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v5 int) binds: [B:5:0x0013, B:8:0x0018, B:11:0x003d, B:12:0x003f, B:13:0x0041, B:24:0x0099, B:21:0x0089, B:17:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    private final List<ProcessedColorStop> processColorTransitionHints(ProcessedColorStop[] originalStops) {
        int i7;
        int i10;
        ProcessedColorStop[] processedColorStopArr = originalStops;
        ArrayList arrayListI = y.I(processedColorStopArr);
        int i11 = 1;
        int length = processedColorStopArr.length - 1;
        int i12 = 1;
        int i13 = 0;
        while (i12 < length) {
            if (processedColorStopArr[i12].getColor() == null && (i10 = i12 + i13) >= i11) {
                int i14 = i10 - 1;
                Float position = ((ProcessedColorStop) arrayListI.get(i14)).getPosition();
                int i15 = i10 + 1;
                Float position2 = ((ProcessedColorStop) arrayListI.get(i15)).getPosition();
                Float position3 = ((ProcessedColorStop) arrayListI.get(i10)).getPosition();
                if (position == null || position2 == null || position3 == null) {
                    i7 = length;
                } else {
                    float fFloatValue = position3.floatValue() - position.floatValue();
                    float fFloatValue2 = position2.floatValue() - position3.floatValue();
                    float fFloatValue3 = position2.floatValue() - position.floatValue();
                    Integer color = ((ProcessedColorStop) arrayListI.get(i14)).getColor();
                    Integer color2 = ((ProcessedColorStop) arrayListI.get(i15)).getColor();
                    if (FloatUtil.floatsEqual(fFloatValue, fFloatValue2)) {
                        arrayListI.remove(i10);
                        i13--;
                    } else if (FloatUtil.floatsEqual(fFloatValue, 0.0f)) {
                        ((ProcessedColorStop) arrayListI.get(i10)).setColor(color2);
                    } else if (FloatUtil.floatsEqual(fFloatValue2, 0.0f)) {
                        ((ProcessedColorStop) arrayListI.get(i10)).setColor(color);
                    } else {
                        ArrayList arrayList = new ArrayList(9);
                        if (fFloatValue > fFloatValue2) {
                            int i16 = 0;
                            while (i16 < 7) {
                                arrayList.add(new ProcessedColorStop(null, Float.valueOf((((i16 + 7.0f) / 13.0f) * fFloatValue) + position.floatValue())));
                                i16++;
                                length = length;
                            }
                            i7 = length;
                            arrayList.add(new ProcessedColorStop(null, Float.valueOf((0.33333334f * fFloatValue2) + position3.floatValue())));
                            arrayList.add(new ProcessedColorStop(null, Float.valueOf((fFloatValue2 * 0.6666667f) + position3.floatValue())));
                        } else {
                            i7 = length;
                            arrayList.add(new ProcessedColorStop(null, Float.valueOf((0.33333334f * fFloatValue) + position.floatValue())));
                            arrayList.add(new ProcessedColorStop(null, Float.valueOf((0.6666667f * fFloatValue) + position.floatValue())));
                            for (int i17 = 0; i17 < 7; i17++) {
                                arrayList.add(new ProcessedColorStop(null, Float.valueOf(((i17 / 13.0f) * fFloatValue2) + position3.floatValue())));
                            }
                        }
                        double dLog = Math.log(0.5d) / ((double) ((float) Math.log(fFloatValue / fFloatValue3)));
                        Iterator it = arrayList.iterator();
                        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                        while (it.hasNext()) {
                            Object next = it.next();
                            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                            ProcessedColorStop processedColorStop = (ProcessedColorStop) next;
                            if (processedColorStop.getPosition() != null) {
                                float fPow = (float) Math.pow((processedColorStop.getPosition().floatValue() - position.floatValue()) / fFloatValue3, dLog);
                                if (Math.abs(fPow) <= Float.MAX_VALUE && !Float.isNaN(fPow) && color != null) {
                                    int iIntValue = color.intValue();
                                    if (color2 != null) {
                                        processedColorStop.setColor(Integer.valueOf(c.b(iIntValue, color2.intValue(), fPow)));
                                    }
                                }
                            }
                        }
                        arrayListI.remove(i10);
                        arrayListI.addAll(i10, arrayList);
                        i13 += 8;
                    }
                    i7 = length;
                }
            } else {
                i7 = length;
            }
            i12++;
            processedColorStopArr = originalStops;
            length = i7;
            i11 = 1;
        }
        return arrayListI;
    }

    private final Float resolveColorStopPosition(LengthPercentage position, float gradientLineLength) {
        if (position == null) {
            return null;
        }
        int i7 = WhenMappings.$EnumSwitchMapping$0[position.getType().ordinal()];
        if (i7 == 1) {
            return Float.valueOf(PixelUtil.toPixelFromDIP(position.resolve(0.0f)) / gradientLineLength);
        }
        if (i7 == 2) {
            return Float.valueOf(position.resolve(1.0f));
        }
        throw new n();
    }

    @NotNull
    public final List<ProcessedColorStop> getFixedColorStops(@NotNull List<ColorStop> colorStops, float gradientLineLength) {
        Intrinsics.checkNotNullParameter(colorStops, "colorStops");
        int size = colorStops.size();
        ProcessedColorStop[] processedColorStopArr = new ProcessedColorStop[size];
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            processedColorStopArr[i10] = new ProcessedColorStop(null, null, 3, null);
        }
        Float fResolveColorStopPosition = resolveColorStopPosition(colorStops.get(0).getPosition(), gradientLineLength);
        float fFloatValue = fResolveColorStopPosition != null ? fResolveColorStopPosition.floatValue() : 0.0f;
        int size2 = colorStops.size();
        int i11 = 0;
        boolean z5 = false;
        while (i11 < size2) {
            ColorStop colorStop = colorStops.get(i11);
            Float fResolveColorStopPosition2 = resolveColorStopPosition(colorStop.getPosition(), gradientLineLength);
            if (fResolveColorStopPosition2 == null) {
                fResolveColorStopPosition2 = i11 == 0 ? Float.valueOf(0.0f) : i11 == colorStops.size() - 1 ? Float.valueOf(1.0f) : null;
            }
            if (fResolveColorStopPosition2 != null) {
                fFloatValue = Math.max(fResolveColorStopPosition2.floatValue(), fFloatValue);
                processedColorStopArr[i11] = new ProcessedColorStop(colorStop.getColor(), Float.valueOf(fFloatValue));
            } else {
                z5 = true;
            }
            i11++;
        }
        if (z5) {
            for (int i12 = 1; i12 < size; i12++) {
                Float position = processedColorStopArr[i12].getPosition();
                Float position2 = processedColorStopArr[i7].getPosition();
                int i13 = i12 - i7;
                int i14 = i13 - 1;
                if (position != null && position2 != null && i14 > 0) {
                    float fFloatValue2 = (position.floatValue() - position2.floatValue()) / i13;
                    if (1 <= i14) {
                        int i15 = 1;
                        while (true) {
                            int i16 = i7 + i15;
                            processedColorStopArr[i16] = new ProcessedColorStop(colorStops.get(i16).getColor(), Float.valueOf((i15 * fFloatValue2) + position2.floatValue()));
                            if (i15 == i14) {
                                break;
                            }
                            i15++;
                        }
                    }
                    i7 = i12;
                }
            }
        }
        return processColorTransitionHints(processedColorStopArr);
    }
}
