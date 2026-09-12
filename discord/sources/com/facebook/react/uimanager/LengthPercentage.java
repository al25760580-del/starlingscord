package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003J\t\u0010\r\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/uimanager/LengthPercentage;", "", "value", "", "type", "Lcom/facebook/react/uimanager/LengthPercentageType;", "<init>", "(FLcom/facebook/react/uimanager/LengthPercentageType;)V", "()V", "getType", "()Lcom/facebook/react/uimanager/LengthPercentageType;", "resolve", "referenceLength", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LengthPercentage {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final LengthPercentageType type;
    private final float value;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/facebook/react/uimanager/LengthPercentage$Companion;", "", "<init>", "()V", "setFromDynamic", "Lcom/facebook/react/uimanager/LengthPercentage;", "dynamic", "Lcom/facebook/react/bridge/Dynamic;", "allowNegative", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

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

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ LengthPercentage setFromDynamic$default(Companion companion, Dynamic dynamic, boolean z5, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                z5 = false;
            }
            return companion.setFromDynamic(dynamic, z5);
        }

        public final LengthPercentage setFromDynamic(@NotNull Dynamic dynamic, boolean allowNegative) {
            Intrinsics.checkNotNullParameter(dynamic, "dynamic");
            int i7 = WhenMappings.$EnumSwitchMapping$0[dynamic.getType().ordinal()];
            if (i7 == 1) {
                double dAsDouble = dynamic.asDouble();
                if (dAsDouble >= 0.0d || allowNegative) {
                    return new LengthPercentage((float) dAsDouble, LengthPercentageType.POINT);
                }
            } else {
                if (i7 != 2) {
                    o8.a.v(ReactConstants.TAG, "Unsupported type for radius property: " + dynamic.getType());
                    return null;
                }
                String strAsString = dynamic.asString();
                if (strAsString == null || !x.h(strAsString, "%", false)) {
                    o8.a.v(ReactConstants.TAG, "Invalid string value: " + strAsString);
                    return null;
                }
                try {
                    String strSubstring = strAsString.substring(0, strAsString.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    float f2 = Float.parseFloat(strSubstring);
                    if (f2 >= 0.0f || allowNegative) {
                        return new LengthPercentage(f2, LengthPercentageType.PERCENT);
                    }
                } catch (NumberFormatException unused) {
                    o8.a.v(ReactConstants.TAG, "Invalid percentage format: ".concat(strAsString));
                    return null;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    public LengthPercentage(float f2, @NotNull LengthPercentageType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.value = f2;
        this.type = type;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final float getValue() {
        return this.value;
    }

    public static /* synthetic */ LengthPercentage copy$default(LengthPercentage lengthPercentage, float f2, LengthPercentageType lengthPercentageType, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            f2 = lengthPercentage.value;
        }
        if ((i7 & 2) != 0) {
            lengthPercentageType = lengthPercentage.type;
        }
        return lengthPercentage.copy(f2, lengthPercentageType);
    }

    public static final LengthPercentage setFromDynamic(@NotNull Dynamic dynamic, boolean z5) {
        return INSTANCE.setFromDynamic(dynamic, z5);
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LengthPercentageType getType() {
        return this.type;
    }

    @NotNull
    public final LengthPercentage copy(float value, @NotNull LengthPercentageType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new LengthPercentage(value, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LengthPercentage)) {
            return false;
        }
        LengthPercentage lengthPercentage = (LengthPercentage) other;
        return Float.compare(this.value, lengthPercentage.value) == 0 && this.type == lengthPercentage.type;
    }

    @NotNull
    public final LengthPercentageType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + (Float.hashCode(this.value) * 31);
    }

    public final float resolve(float referenceLength) {
        return this.type == LengthPercentageType.PERCENT ? (this.value / 100) * referenceLength : this.value;
    }

    @NotNull
    public String toString() {
        return "LengthPercentage(value=" + this.value + ", type=" + this.type + ")";
    }

    public LengthPercentage() {
        this(0.0f, LengthPercentageType.POINT);
    }
}
