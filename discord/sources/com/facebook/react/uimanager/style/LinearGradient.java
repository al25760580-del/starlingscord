package com.facebook.react.uimanager.style;

import android.content.Context;
import android.graphics.Shader;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.ViewProps;
import com.rnlineargradient.LinearGradientManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.d0;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0013H\u0002J,\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/uimanager/style/LinearGradient;", "Lcom/facebook/react/uimanager/style/Gradient;", "direction", "Lcom/facebook/react/uimanager/style/LinearGradient$Direction;", "colorStops", "", "Lcom/facebook/react/uimanager/style/ColorStop;", "<init>", "(Lcom/facebook/react/uimanager/style/LinearGradient$Direction;Ljava/util/List;)V", "getDirection", "()Lcom/facebook/react/uimanager/style/LinearGradient$Direction;", "getColorStops", "()Ljava/util/List;", "getShader", "Landroid/graphics/Shader;", "width", "", "height", "getAngleForKeyword", "", "keyword", "Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;", "endPointsFromAngle", "Lkotlin/Pair;", "", LinearGradientManager.PROP_ANGLE, "Companion", "Direction", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLinearGradient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinearGradient.kt\ncom/facebook/react/uimanager/style/LinearGradient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,225:1\n1878#2,3:226\n*S KotlinDebug\n*F\n+ 1 LinearGradient.kt\ncom/facebook/react/uimanager/style/LinearGradient\n*L\n145#1:226,3\n*E\n"})
public final class LinearGradient implements Gradient {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<ColorStop> colorStops;

    @NotNull
    private final Direction direction;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/facebook/react/uimanager/style/LinearGradient$Companion;", "", "<init>", "()V", "parse", "Lcom/facebook/react/uimanager/style/Gradient;", "gradientMap", "Lcom/facebook/react/bridge/ReadableMap;", "context", "Landroid/content/Context;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nLinearGradient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinearGradient.kt\ncom/facebook/react/uimanager/style/LinearGradient$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n1#2:226\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0055  */
        /* JADX WARN: Code duplicated, block: B:22:0x005f  */
        /* JADX WARN: Code duplicated, block: B:24:0x0062  */
        /* JADX WARN: Code duplicated, block: B:27:0x0069  */
        /* JADX WARN: Code duplicated, block: B:29:0x007a  */
        /* JADX WARN: Code duplicated, block: B:32:0x0081  */
        /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:44:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:52:0x00c0 A[SYNTHETIC] */
        public final Gradient parse(@NotNull ReadableMap gradientMap, @NotNull Context context) {
            Direction keyword;
            ArrayList arrayList;
            ReadableArray array;
            int size;
            int i7;
            ReadableMap map;
            Integer color;
            Direction.KeywordType keywordTypeFromString;
            Intrinsics.checkNotNullParameter(gradientMap, "gradientMap");
            Intrinsics.checkNotNullParameter(context, "context");
            ReadableMap readableMap = gradientMap.hasKey("direction") ? gradientMap : null;
            if (readableMap == null) {
                keyword = null;
                if (!gradientMap.hasKey("colorStops")) {
                    gradientMap = null;
                }
                if (gradientMap != null) {
                    array = gradientMap.getArray("colorStops");
                    if (array != null) {
                        arrayList = new ArrayList(array.size());
                        size = array.size();
                        for (i7 = 0; i7 < size; i7++) {
                            map = array.getMap(i7);
                            if (map != null) {
                                if (map.hasKey(ViewProps.COLOR) || map.isNull(ViewProps.COLOR)) {
                                    color = null;
                                } else {
                                    color = map.getType(ViewProps.COLOR) == ReadableType.Map ? ColorPropConverter.getColor(map.getMap(ViewProps.COLOR), context) : Integer.valueOf(map.getInt(ViewProps.COLOR));
                                }
                                arrayList.add(new ColorStop(color, LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, map.getDynamic(ViewProps.POSITION), false, 2, null)));
                            }
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (keyword != null && arrayList != null) {
                    return new LinearGradient(keyword, arrayList);
                }
            } else {
                ReadableMap map2 = readableMap.getMap("direction");
                if (map2 != null) {
                    String string = map2.getString("type");
                    if (Intrinsics.areEqual(string, LinearGradientManager.PROP_ANGLE)) {
                        keyword = new Direction.Angle(map2.getDouble("value"));
                    } else if (!Intrinsics.areEqual(string, "keyword") || (keywordTypeFromString = Direction.KeywordType.INSTANCE.fromString(map2.getString("value"))) == null) {
                        keyword = null;
                    } else {
                        keyword = new Direction.Keyword(keywordTypeFromString);
                    }
                    if (!gradientMap.hasKey("colorStops")) {
                        gradientMap = null;
                    }
                    if (gradientMap != null) {
                        array = gradientMap.getArray("colorStops");
                        if (array != null) {
                            arrayList = new ArrayList(array.size());
                            size = array.size();
                            while (i7 < size) {
                                map = array.getMap(i7);
                                if (map != null) {
                                    if (map.hasKey(ViewProps.COLOR)) {
                                        color = null;
                                    } else {
                                        color = null;
                                    }
                                    arrayList.add(new ColorStop(color, LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, map.getDynamic(ViewProps.POSITION), false, 2, null)));
                                }
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (keyword != null) {
                        return new LinearGradient(keyword, arrayList);
                    }
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/uimanager/style/LinearGradient$Direction;", "", "<init>", "()V", "Angle", "Keyword", "KeywordType", "Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Angle;", "Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keyword;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Direction {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Angle;", "Lcom/facebook/react/uimanager/style/LinearGradient$Direction;", LinearGradientManager.PROP_ANGLE, "", "<init>", "(D)V", "getAngle", "()D", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Angle extends Direction {
            private final double angle;

            public Angle(double d6) {
                super(null);
                this.angle = d6;
            }

            public final double getAngle() {
                return this.angle;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keyword;", "Lcom/facebook/react/uimanager/style/LinearGradient$Direction;", "keyword", "Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;", "<init>", "(Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;)V", "getKeyword", "()Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Keyword extends Direction {

            @NotNull
            private final KeywordType keyword;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Keyword(@NotNull KeywordType keyword) {
                super(null);
                Intrinsics.checkNotNullParameter(keyword, "keyword");
                this.keyword = keyword;
            }

            @NotNull
            public final KeywordType getKeyword() {
                return this.keyword;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "TO_TOP_RIGHT", "TO_BOTTOM_RIGHT", "TO_TOP_LEFT", "TO_BOTTOM_LEFT", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum KeywordType {
            TO_TOP_RIGHT("to top right"),
            TO_BOTTOM_RIGHT("to bottom right"),
            TO_TOP_LEFT("to top left"),
            TO_BOTTOM_LEFT("to bottom left");


            @NotNull
            private final String value;
            private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType$Companion;", "", "<init>", "()V", "fromString", "Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;", "value", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nLinearGradient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinearGradient.kt\ncom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n1#2:226\n*E\n"})
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KeywordType fromString(String value) {
                    for (KeywordType keywordType : KeywordType.values()) {
                        if (Intrinsics.areEqual(keywordType.getValue(), value)) {
                            return keywordType;
                        }
                    }
                    return null;
                }

                private Companion() {
                }
            }

            KeywordType(String str) {
                this.value = str;
            }

            @NotNull
            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            @NotNull
            public final String getValue() {
                return this.value;
            }
        }

        public /* synthetic */ Direction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Direction() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.KeywordType.values().length];
            try {
                iArr[Direction.KeywordType.TO_TOP_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.KeywordType.TO_BOTTOM_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Direction.KeywordType.TO_TOP_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Direction.KeywordType.TO_BOTTOM_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LinearGradient(@NotNull Direction direction, @NotNull List<ColorStop> colorStops) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(colorStops, "colorStops");
        this.direction = direction;
        this.colorStops = colorStops;
    }

    private final Pair<float[], float[]> endPointsFromAngle(double angle, float height, float width) {
        float[] fArr;
        double d6 = 360;
        double d7 = angle % d6;
        if (d7 < 0.0d) {
            d7 += d6;
        }
        if (d7 == 0.0d) {
            return new Pair<>(new float[]{0.0f, height}, new float[]{0.0f, 0.0f});
        }
        if (d7 == 90.0d) {
            return new Pair<>(new float[]{0.0f, 0.0f}, new float[]{width, 0.0f});
        }
        if (d7 == 180.0d) {
            return new Pair<>(new float[]{0.0f, 0.0f}, new float[]{0.0f, height});
        }
        if (d7 == 270.0d) {
            return new Pair<>(new float[]{width, 0.0f}, new float[]{0.0f, 0.0f});
        }
        float fTan = (float) Math.tan(Math.toRadians(((double) 90) - d7));
        float f2 = (-1) / fTan;
        float f7 = 2;
        float f10 = height / f7;
        float f11 = width / f7;
        if (d7 < 90.0d) {
            fArr = new float[]{f11, f10};
        } else if (d7 < 180.0d) {
            fArr = new float[]{f11, -f10};
        } else {
            fArr = d7 < 270.0d ? new float[]{-f11, -f10} : new float[]{-f11, f10};
        }
        float f12 = fArr[1] - (fArr[0] * f2);
        float f13 = f12 / (fTan - f2);
        float f14 = (f2 * f13) + f12;
        return new Pair<>(new float[]{f11 - f13, f10 + f14}, new float[]{f11 + f13, f10 - f14});
    }

    private final double getAngleForKeyword(Direction.KeywordType keyword, double width, double height) {
        double degrees;
        double d6;
        int i7;
        int i10 = WhenMappings.$EnumSwitchMapping$0[keyword.ordinal()];
        if (i10 == 1) {
            return ((double) 90) - Math.toDegrees(Math.atan(width / height));
        }
        if (i10 != 2) {
            if (i10 == 3) {
                degrees = Math.toDegrees(Math.atan(width / height));
                i7 = 270;
            } else {
                if (i10 != 4) {
                    throw new n();
                }
                degrees = Math.toDegrees(Math.atan(height / width));
                i7 = 180;
            }
            d6 = i7;
        } else {
            degrees = Math.toDegrees(Math.atan(width / height));
            d6 = 90;
        }
        return degrees + d6;
    }

    @NotNull
    public final List<ColorStop> getColorStops() {
        return this.colorStops;
    }

    @NotNull
    public final Direction getDirection() {
        return this.direction;
    }

    @Override // com.facebook.react.uimanager.style.Gradient
    @NotNull
    public Shader getShader(float width, float height) {
        LinearGradient linearGradient;
        double angleForKeyword;
        Direction direction = this.direction;
        if (direction instanceof Direction.Angle) {
            angleForKeyword = ((Direction.Angle) direction).getAngle();
            linearGradient = this;
        } else {
            if (!(direction instanceof Direction.Keyword)) {
                throw new n();
            }
            linearGradient = this;
            angleForKeyword = linearGradient.getAngleForKeyword(((Direction.Keyword) direction).getKeyword(), width, height);
        }
        Pair<float[], float[]> pairEndPointsFromAngle = endPointsFromAngle(angleForKeyword, height, width);
        float[] fArr = (float[]) pairEndPointsFromAngle.f14612d;
        float[] fArr2 = (float[]) pairEndPointsFromAngle.f14613e;
        float f2 = fArr2[0] - fArr[0];
        float f7 = fArr2[1] - fArr[1];
        List<ProcessedColorStop> fixedColorStops = ColorStopUtils.INSTANCE.getFixedColorStops(linearGradient.colorStops, (float) Math.sqrt((f7 * f7) + (f2 * f2)));
        int[] iArr = new int[fixedColorStops.size()];
        float[] fArr3 = new float[fixedColorStops.size()];
        int i7 = 0;
        for (Object obj : fixedColorStops) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                d0.k();
                throw null;
            }
            ProcessedColorStop processedColorStop = (ProcessedColorStop) obj;
            Integer color = processedColorStop.getColor();
            if (color != null && processedColorStop.getPosition() != null) {
                iArr[i7] = color.intValue();
                fArr3[i7] = processedColorStop.getPosition().floatValue();
            }
            i7 = i10;
        }
        return new android.graphics.LinearGradient(fArr[0], fArr[1], fArr2[0], fArr2[1], iArr, fArr3, Shader.TileMode.CLAMP);
    }
}
