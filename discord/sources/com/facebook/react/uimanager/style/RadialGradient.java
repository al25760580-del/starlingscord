package com.facebook.react.uimanager.style;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Shader;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 &2\u00020\u0001:\u0004&'()B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J<\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J,\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0018H\u0002J<\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J4\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006*"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient;", "Lcom/facebook/react/uimanager/style/Gradient;", "shape", "Lcom/facebook/react/uimanager/style/RadialGradient$Shape;", "size", "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;", ViewProps.POSITION, "Lcom/facebook/react/uimanager/style/RadialGradient$Position;", "colorStops", "", "Lcom/facebook/react/uimanager/style/ColorStop;", "<init>", "(Lcom/facebook/react/uimanager/style/RadialGradient$Shape;Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;Lcom/facebook/react/uimanager/style/RadialGradient$Position;Ljava/util/List;)V", "getShape", "()Lcom/facebook/react/uimanager/style/RadialGradient$Shape;", "getSize", "()Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;", "getPosition", "()Lcom/facebook/react/uimanager/style/RadialGradient$Position;", "getColorStops", "()Ljava/util/List;", "getShader", "Landroid/graphics/Shader;", "width", "", "height", "radiusToSide", "Lkotlin/Pair;", "centerX", "centerY", "sizeKeyword", "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;", "calculateEllipseRadius", "offsetX", "offsetY", ViewProps.ASPECT_RATIO, "radiusToCorner", "calculateRadius", "Companion", "Shape", "GradientSize", "Position", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRadialGradient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadialGradient.kt\ncom/facebook/react/uimanager/style/RadialGradient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,425:1\n1878#2,3:426\n*S KotlinDebug\n*F\n+ 1 RadialGradient.kt\ncom/facebook/react/uimanager/style/RadialGradient\n*L\n244#1:426,3\n*E\n"})
public final class RadialGradient implements Gradient {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<ColorStop> colorStops;

    @NotNull
    private final Position position;

    @NotNull
    private final Shape shape;

    @NotNull
    private final GradientSize size;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient$Companion;", "", "<init>", "()V", "parse", "Lcom/facebook/react/uimanager/style/Gradient;", "gradientMap", "Lcom/facebook/react/bridge/ReadableMap;", "context", "Landroid/content/Context;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRadialGradient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadialGradient.kt\ncom/facebook/react/uimanager/style/RadialGradient$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,425:1\n1#2:426\n*E\n"})
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.String.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReadableType.Map.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0094  */
        public final Gradient parse(@NotNull ReadableMap gradientMap, @NotNull Context context) {
            GradientSize keyword;
            Position position;
            ArrayList arrayList;
            LengthPercentage fromDynamic$default;
            LengthPercentage fromDynamic$default2;
            LengthPercentage fromDynamic$default3;
            LengthPercentage fromDynamic$default4;
            ReadableMap map;
            String string;
            ReadableMap gradientMap2 = gradientMap;
            Intrinsics.checkNotNullParameter(gradientMap2, "gradientMap");
            Intrinsics.checkNotNullParameter(context, "context");
            ReadableMap readableMap = gradientMap2.hasKey("shape") ? gradientMap2 : null;
            Shape shapeFromString = (readableMap == null || (string = readableMap.getString("shape")) == null) ? null : Shape.INSTANCE.fromString(string);
            ReadableMap readableMap2 = gradientMap2.hasKey("size") ? gradientMap2 : null;
            if (readableMap2 != null) {
                int i7 = WhenMappings.$EnumSwitchMapping$0[readableMap2.getType("size").ordinal()];
                if (i7 == 1) {
                    GradientSize.KeywordType keywordTypeFromString = GradientSize.KeywordType.INSTANCE.fromString(readableMap2.getString("size"));
                    if (keywordTypeFromString != null) {
                        keyword = new GradientSize.Keyword(keywordTypeFromString);
                    } else {
                        keyword = null;
                    }
                } else if (i7 == 2 && (map = readableMap2.getMap("size")) != null) {
                    if (!map.hasKey("x") || !map.hasKey("y")) {
                        map = null;
                    }
                    if (map != null) {
                        LengthPercentage.Companion companion = LengthPercentage.INSTANCE;
                        LengthPercentage fromDynamic$default5 = LengthPercentage.Companion.setFromDynamic$default(companion, map.getDynamic("x"), false, 2, null);
                        LengthPercentage fromDynamic$default6 = LengthPercentage.Companion.setFromDynamic$default(companion, map.getDynamic("y"), false, 2, null);
                        if (fromDynamic$default5 == null || fromDynamic$default6 == null) {
                            keyword = null;
                        } else {
                            keyword = new GradientSize.Dimensions(fromDynamic$default5, fromDynamic$default6);
                        }
                    } else {
                        keyword = null;
                    }
                } else {
                    keyword = null;
                }
            } else {
                keyword = null;
            }
            ReadableMap readableMap3 = gradientMap2.hasKey(ViewProps.POSITION) ? gradientMap2 : null;
            if (readableMap3 != null) {
                ReadableMap map2 = readableMap3.getMap(ViewProps.POSITION);
                if (map2 != null) {
                    if (map2.hasKey(ViewProps.TOP)) {
                        fromDynamic$default2 = LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, map2.getDynamic(ViewProps.TOP), false, 2, null);
                        fromDynamic$default = null;
                    } else if (map2.hasKey(ViewProps.BOTTOM)) {
                        fromDynamic$default = LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, map2.getDynamic(ViewProps.BOTTOM), false, 2, null);
                        fromDynamic$default2 = null;
                    }
                    if (map2.hasKey(ViewProps.LEFT)) {
                        fromDynamic$default4 = LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, map2.getDynamic(ViewProps.LEFT), false, 2, null);
                        fromDynamic$default3 = null;
                    } else if (map2.hasKey(ViewProps.RIGHT)) {
                        fromDynamic$default3 = LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, map2.getDynamic(ViewProps.RIGHT), false, 2, null);
                        fromDynamic$default4 = null;
                    }
                    position = new Position(fromDynamic$default2, fromDynamic$default4, fromDynamic$default3, fromDynamic$default);
                }
                return null;
            }
            position = null;
            if (!gradientMap2.hasKey("colorStops")) {
                gradientMap2 = null;
            }
            if (gradientMap2 != null) {
                ReadableArray array = gradientMap2.getArray("colorStops");
                if (array != null) {
                    arrayList = new ArrayList(array.size());
                    int size = array.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ReadableMap map3 = array.getMap(i10);
                        if (map3 != null) {
                            arrayList.add(new ColorStop((!map3.hasKey(ViewProps.COLOR) || map3.isNull(ViewProps.COLOR)) ? null : map3.getType(ViewProps.COLOR) == ReadableType.Map ? ColorPropConverter.getColor(map3.getMap(ViewProps.COLOR), context) : Integer.valueOf(map3.getInt(ViewProps.COLOR)), LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, map3.getDynamic(ViewProps.POSITION), false, 2, null)));
                        }
                    }
                }
                return null;
            }
            arrayList = null;
            if (shapeFromString != null && keyword != null && position != null && arrayList != null) {
                return new RadialGradient(shapeFromString, keyword, position, arrayList);
            }
            return null;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;", "", "<init>", "()V", "Keyword", "Dimensions", "KeywordType", "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Dimensions;", "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Keyword;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class GradientSize {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Dimensions;", "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;", "x", "Lcom/facebook/react/uimanager/LengthPercentage;", "y", "<init>", "(Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;)V", "getX", "()Lcom/facebook/react/uimanager/LengthPercentage;", "getY", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Dimensions extends GradientSize {

            @NotNull
            private final LengthPercentage x;

            @NotNull
            private final LengthPercentage y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Dimensions(@NotNull LengthPercentage x5, @NotNull LengthPercentage y5) {
                super(null);
                Intrinsics.checkNotNullParameter(x5, "x");
                Intrinsics.checkNotNullParameter(y5, "y");
                this.x = x5;
                this.y = y5;
            }

            @NotNull
            public final LengthPercentage getX() {
                return this.x;
            }

            @NotNull
            public final LengthPercentage getY() {
                return this.y;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Keyword;", "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;", "keyword", "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;", "<init>", "(Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;)V", "getKeyword", "()Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Keyword extends GradientSize {

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

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CLOSEST_SIDE", "FARTHEST_SIDE", "CLOSEST_CORNER", "FARTHEST_CORNER", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum KeywordType {
            CLOSEST_SIDE("closest-side"),
            FARTHEST_SIDE("farthest-side"),
            CLOSEST_CORNER("closest-corner"),
            FARTHEST_CORNER("farthest-corner");


            @NotNull
            private final String value;
            private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType$Companion;", "", "<init>", "()V", "fromString", "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;", "value", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nRadialGradient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadialGradient.kt\ncom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,425:1\n1#2:426\n*E\n"})
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

        public /* synthetic */ GradientSize(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private GradientSize() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient$Position;", "", ViewProps.TOP, "Lcom/facebook/react/uimanager/LengthPercentage;", ViewProps.LEFT, ViewProps.RIGHT, ViewProps.BOTTOM, "<init>", "(Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;)V", "getTop", "()Lcom/facebook/react/uimanager/LengthPercentage;", "getLeft", "getRight", "getBottom", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Position {
        private final LengthPercentage bottom;
        private final LengthPercentage left;
        private final LengthPercentage right;
        private final LengthPercentage top;

        public Position() {
            this(null, null, null, null, 15, null);
        }

        public final LengthPercentage getBottom() {
            return this.bottom;
        }

        public final LengthPercentage getLeft() {
            return this.left;
        }

        public final LengthPercentage getRight() {
            return this.right;
        }

        public final LengthPercentage getTop() {
            return this.top;
        }

        public Position(LengthPercentage lengthPercentage, LengthPercentage lengthPercentage2, LengthPercentage lengthPercentage3, LengthPercentage lengthPercentage4) {
            this.top = lengthPercentage;
            this.left = lengthPercentage2;
            this.right = lengthPercentage3;
            this.bottom = lengthPercentage4;
        }

        public /* synthetic */ Position(LengthPercentage lengthPercentage, LengthPercentage lengthPercentage2, LengthPercentage lengthPercentage3, LengthPercentage lengthPercentage4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : lengthPercentage, (i7 & 2) != 0 ? null : lengthPercentage2, (i7 & 4) != 0 ? null : lengthPercentage3, (i7 & 8) != 0 ? null : lengthPercentage4);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient$Shape;", "", "<init>", "(Ljava/lang/String;I)V", "CIRCLE", "ELLIPSE", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Shape {
        CIRCLE,
        ELLIPSE;

        private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/RadialGradient$Shape$Companion;", "", "<init>", "()V", "fromString", "Lcom/facebook/react/uimanager/style/RadialGradient$Shape;", "value", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Shape fromString(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (Intrinsics.areEqual(value, "circle")) {
                    return Shape.CIRCLE;
                }
                if (Intrinsics.areEqual(value, "ellipse")) {
                    return Shape.ELLIPSE;
                }
                return null;
            }

            private Companion() {
            }
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GradientSize.KeywordType.values().length];
            try {
                iArr[GradientSize.KeywordType.CLOSEST_SIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GradientSize.KeywordType.FARTHEST_SIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GradientSize.KeywordType.CLOSEST_CORNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GradientSize.KeywordType.FARTHEST_CORNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RadialGradient(@NotNull Shape shape, @NotNull GradientSize size, @NotNull Position position, @NotNull List<ColorStop> colorStops) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(colorStops, "colorStops");
        this.shape = shape;
        this.size = size;
        this.position = position;
        this.colorStops = colorStops;
    }

    private final Pair<Float, Float> calculateEllipseRadius(float offsetX, float offsetY, float aspectRatio) {
        Float fValueOf = Float.valueOf(0.0f);
        if (aspectRatio == 0.0f || Math.abs(aspectRatio) > Float.MAX_VALUE) {
            return new Pair<>(fValueOf, fValueOf);
        }
        float fSqrt = (float) Math.sqrt((offsetY * offsetY * aspectRatio * aspectRatio) + (offsetX * offsetX));
        return new Pair<>(Float.valueOf(fSqrt), Float.valueOf(fSqrt / aspectRatio));
    }

    private final Pair<Float, Float> calculateRadius(float centerX, float centerY, float width, float height) {
        GradientSize gradientSize = this.size;
        if (gradientSize instanceof GradientSize.Keyword) {
            GradientSize.KeywordType keyword = ((GradientSize.Keyword) gradientSize).getKeyword();
            int i7 = WhenMappings.$EnumSwitchMapping$0[keyword.ordinal()];
            if (i7 == 1 || i7 == 2) {
                return radiusToSide(centerX, centerY, width, height, keyword);
            }
            if (i7 == 3 || i7 == 4) {
                return radiusToCorner(centerX, centerY, width, height, keyword);
            }
            throw new n();
        }
        if (!(gradientSize instanceof GradientSize.Dimensions)) {
            return radiusToCorner(centerX, centerY, width, height, GradientSize.KeywordType.FARTHEST_CORNER);
        }
        LengthPercentageType type = ((GradientSize.Dimensions) gradientSize).getX().getType();
        LengthPercentageType lengthPercentageType = LengthPercentageType.PERCENT;
        float fResolve = type == lengthPercentageType ? ((GradientSize.Dimensions) this.size).getX().resolve(width) : PixelUtil.INSTANCE.dpToPx(((GradientSize.Dimensions) this.size).getX().resolve(width));
        float fResolve2 = ((GradientSize.Dimensions) this.size).getY().getType() == lengthPercentageType ? ((GradientSize.Dimensions) this.size).getY().resolve(height) : PixelUtil.INSTANCE.dpToPx(((GradientSize.Dimensions) this.size).getY().resolve(height));
        if (this.shape != Shape.CIRCLE) {
            return new Pair<>(Float.valueOf(fResolve), Float.valueOf(fResolve2));
        }
        float fMax = Math.max(fResolve, fResolve2);
        return new Pair<>(Float.valueOf(fMax), Float.valueOf(fMax));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x009c  */
    private final Pair<Float, Float> radiusToCorner(float centerX, float centerY, float width, float height, GradientSize.KeywordType sizeKeyword) {
        Float fValueOf = Float.valueOf(0.0f);
        Pair[] pairArr = {new Pair(fValueOf, fValueOf), new Pair(Float.valueOf(width), fValueOf), new Pair(Float.valueOf(width), Float.valueOf(height)), new Pair(fValueOf, Float.valueOf(height))};
        int i7 = 0;
        double d6 = 2;
        float fSqrt = (float) Math.sqrt(((float) Math.pow(centerX - ((Number) pairArr[0].f14612d).floatValue(), d6)) + ((float) Math.pow(centerY - ((Number) pairArr[0].f14613e).floatValue(), d6)));
        boolean z5 = sizeKeyword == GradientSize.KeywordType.CLOSEST_CORNER;
        for (int i10 = 1; i10 < 4; i10++) {
            float fSqrt2 = (float) Math.sqrt(((float) Math.pow(centerX - ((Number) pairArr[i10].f14612d).floatValue(), d6)) + ((float) Math.pow(centerY - ((Number) pairArr[i10].f14613e).floatValue(), d6)));
            if (z5) {
                if (fSqrt2 < fSqrt) {
                    fSqrt = fSqrt2;
                    i7 = i10;
                }
            } else if (fSqrt2 > fSqrt) {
                fSqrt = fSqrt2;
                i7 = i10;
            }
        }
        if (this.shape == Shape.CIRCLE) {
            return new Pair<>(Float.valueOf(fSqrt), Float.valueOf(fSqrt));
        }
        Pair<Float, Float> pairRadiusToSide = radiusToSide(centerX, centerY, width, height, z5 ? GradientSize.KeywordType.CLOSEST_SIDE : GradientSize.KeywordType.FARTHEST_SIDE);
        return calculateEllipseRadius(((Number) pairArr[i7].f14612d).floatValue() - centerX, ((Number) pairArr[i7].f14613e).floatValue() - centerY, ((Number) pairRadiusToSide.f14612d).floatValue() / ((Number) pairRadiusToSide.f14613e).floatValue());
    }

    private final Pair<Float, Float> radiusToSide(float centerX, float centerY, float width, float height, GradientSize.KeywordType sizeKeyword) {
        float fMax;
        float fMax2;
        float f2 = width - centerX;
        float f7 = height - centerY;
        GradientSize.KeywordType keywordType = GradientSize.KeywordType.CLOSEST_SIDE;
        if (sizeKeyword == keywordType) {
            fMax = Math.min(centerX, f2);
            fMax2 = Math.min(centerY, f7);
        } else {
            fMax = Math.max(centerX, f2);
            fMax2 = Math.max(centerY, f7);
        }
        if (this.shape != Shape.CIRCLE) {
            return new Pair<>(Float.valueOf(fMax), Float.valueOf(fMax2));
        }
        float fMin = sizeKeyword == keywordType ? Math.min(fMax, fMax2) : Math.max(fMax, fMax2);
        return new Pair<>(Float.valueOf(fMin), Float.valueOf(fMin));
    }

    @NotNull
    public final List<ColorStop> getColorStops() {
        return this.colorStops;
    }

    @NotNull
    public final Position getPosition() {
        return this.position;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x010d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0115  */
    /* JADX WARN: Code duplicated, block: B:52:0x0135 A[SYNTHETIC] */
    @Override // com.facebook.react.uimanager.style.Gradient
    @NotNull
    public Shader getShader(float width, float height) {
        float fResolve;
        float f2;
        float fFloatValue;
        float fFloatValue2;
        int i7;
        android.graphics.RadialGradient radialGradient;
        int i10;
        Integer color;
        float f7 = width / 2.0f;
        float fResolve2 = height / 2.0f;
        if (this.position.getTop() != null) {
            fResolve2 = this.position.getTop().getType() == LengthPercentageType.PERCENT ? this.position.getTop().resolve(height) : PixelUtil.INSTANCE.dpToPx(this.position.getTop().resolve(height));
        } else if (this.position.getBottom() != null) {
            fResolve2 = height - (this.position.getBottom().getType() == LengthPercentageType.PERCENT ? this.position.getBottom().resolve(height) : PixelUtil.INSTANCE.dpToPx(this.position.getBottom().resolve(height)));
        }
        float f10 = fResolve2;
        if (this.position.getLeft() == null) {
            if (this.position.getRight() != null) {
                fResolve = width - (this.position.getRight().getType() == LengthPercentageType.PERCENT ? this.position.getRight().resolve(width) : PixelUtil.INSTANCE.dpToPx(this.position.getRight().resolve(width)));
            }
            f2 = f7;
            Pair<Float, Float> pairCalculateRadius = calculateRadius(f2, f10, width, height);
            fFloatValue = ((Number) pairCalculateRadius.f14612d).floatValue();
            fFloatValue2 = ((Number) pairCalculateRadius.f14613e).floatValue();
            List<ProcessedColorStop> fixedColorStops = ColorStopUtils.INSTANCE.getFixedColorStops(this.colorStops, Math.max(fFloatValue, fFloatValue2));
            int[] iArr = new int[fixedColorStops.size()];
            float[] fArr = new float[fixedColorStops.size()];
            i7 = 0;
            for (Object obj : fixedColorStops) {
                i10 = i7 + 1;
                if (i7 >= 0) {
                    d0.k();
                    throw null;
                }
                ProcessedColorStop processedColorStop = (ProcessedColorStop) obj;
                color = processedColorStop.getColor();
                if (color == null && processedColorStop.getPosition() != null) {
                    iArr[i7] = color.intValue();
                    fArr[i7] = processedColorStop.getPosition().floatValue();
                }
                i7 = i10;
            }
            radialGradient = new android.graphics.RadialGradient(f2, f10, Math.max(fFloatValue, 1.0E-5f), iArr, fArr, Shader.TileMode.CLAMP);
            if (this.shape == Shape.CIRCLE && !FloatUtil.floatsEqual(fFloatValue, fFloatValue2)) {
                Matrix matrix = new Matrix();
                matrix.setScale(1.0f, fFloatValue2 / fFloatValue, f2, f10);
                radialGradient.setLocalMatrix(matrix);
            }
            return radialGradient;
        }
        fResolve = this.position.getLeft().getType() == LengthPercentageType.PERCENT ? this.position.getLeft().resolve(width) : PixelUtil.INSTANCE.dpToPx(this.position.getLeft().resolve(width));
        f7 = fResolve;
        f2 = f7;
        Pair<Float, Float> pairCalculateRadius2 = calculateRadius(f2, f10, width, height);
        fFloatValue = ((Number) pairCalculateRadius2.f14612d).floatValue();
        fFloatValue2 = ((Number) pairCalculateRadius2.f14613e).floatValue();
        List<ProcessedColorStop> fixedColorStops2 = ColorStopUtils.INSTANCE.getFixedColorStops(this.colorStops, Math.max(fFloatValue, fFloatValue2));
        int[] iArr2 = new int[fixedColorStops2.size()];
        float[] fArr2 = new float[fixedColorStops2.size()];
        i7 = 0;
        while (r0.hasNext()) {
            i10 = i7 + 1;
            if (i7 >= 0) {
                d0.k();
                throw null;
            }
            ProcessedColorStop processedColorStop2 = (ProcessedColorStop) obj;
            color = processedColorStop2.getColor();
            if (color == null) {
            }
            i7 = i10;
        }
        radialGradient = new android.graphics.RadialGradient(f2, f10, Math.max(fFloatValue, 1.0E-5f), iArr2, fArr2, Shader.TileMode.CLAMP);
        if (this.shape == Shape.CIRCLE) {
            return radialGradient;
        }
        Matrix matrix2 = new Matrix();
        matrix2.setScale(1.0f, fFloatValue2 / fFloatValue, f2, f10);
        radialGradient.setLocalMatrix(matrix2);
        return radialGradient;
    }

    @NotNull
    public final Shape getShape() {
        return this.shape;
    }

    @NotNull
    public final GradientSize getSize() {
        return this.size;
    }
}
