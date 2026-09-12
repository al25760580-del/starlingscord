package com.facebook.react.uimanager.style;

import a3.e;
import android.content.Context;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018JR\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, d2 = {"Lcom/facebook/react/uimanager/style/BoxShadow;", "", "offsetX", "", "offsetY", ViewProps.COLOR, "", "blurRadius", "spreadDistance", "inset", "", "<init>", "(FFLjava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;)V", "getOffsetX", "()F", "getOffsetY", "getColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBlurRadius", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getSpreadDistance", "getInset", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(FFLjava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;)Lcom/facebook/react/uimanager/style/BoxShadow;", "equals", "other", "hashCode", "toString", "", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BoxShadow {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final Float blurRadius;
    private final Integer color;
    private final Boolean inset;
    private final float offsetX;
    private final float offsetY;
    private final Float spreadDistance;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/facebook/react/uimanager/style/BoxShadow$Companion;", "", "<init>", "()V", "parse", "Lcom/facebook/react/uimanager/style/BoxShadow;", ViewProps.BOX_SHADOW, "Lcom/facebook/react/bridge/ReadableMap;", "context", "Landroid/content/Context;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
                    iArr[ReadableType.Map.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BoxShadow parse(ReadableMap boxShadow, @NotNull Context context) {
            Integer num;
            Integer numValueOf;
            Intrinsics.checkNotNullParameter(context, "context");
            if (boxShadow == null || !boxShadow.hasKey("offsetX") || !boxShadow.hasKey("offsetY")) {
                return null;
            }
            float f2 = (float) boxShadow.getDouble("offsetX");
            float f7 = (float) boxShadow.getDouble("offsetY");
            if (boxShadow.hasKey(ViewProps.COLOR)) {
                ReadableType type = boxShadow.getType(ViewProps.COLOR);
                int i7 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                if (i7 == 1) {
                    numValueOf = Integer.valueOf(boxShadow.getInt(ViewProps.COLOR));
                } else {
                    if (i7 != 2) {
                        throw new JSApplicationCausedNativeException("Unsupported color type " + type);
                    }
                    numValueOf = ColorPropConverter.getColor(boxShadow.getMap(ViewProps.COLOR), context);
                }
                num = numValueOf;
            } else {
                num = null;
            }
            return new BoxShadow(f2, f7, num, boxShadow.hasKey("blurRadius") ? Float.valueOf((float) boxShadow.getDouble("blurRadius")) : null, boxShadow.hasKey("spreadDistance") ? Float.valueOf((float) boxShadow.getDouble("spreadDistance")) : null, boxShadow.hasKey("inset") ? Boolean.valueOf(boxShadow.getBoolean("inset")) : null);
        }

        private Companion() {
        }
    }

    public BoxShadow(float f2, float f7, Integer num, Float f10, Float f11, Boolean bool) {
        this.offsetX = f2;
        this.offsetY = f7;
        this.color = num;
        this.blurRadius = f10;
        this.spreadDistance = f11;
        this.inset = bool;
    }

    public static /* synthetic */ BoxShadow copy$default(BoxShadow boxShadow, float f2, float f7, Integer num, Float f10, Float f11, Boolean bool, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            f2 = boxShadow.offsetX;
        }
        if ((i7 & 2) != 0) {
            f7 = boxShadow.offsetY;
        }
        if ((i7 & 4) != 0) {
            num = boxShadow.color;
        }
        if ((i7 & 8) != 0) {
            f10 = boxShadow.blurRadius;
        }
        if ((i7 & 16) != 0) {
            f11 = boxShadow.spreadDistance;
        }
        if ((i7 & 32) != 0) {
            bool = boxShadow.inset;
        }
        Float f12 = f11;
        Boolean bool2 = bool;
        return boxShadow.copy(f2, f7, num, f10, f12, bool2);
    }

    public static final BoxShadow parse(ReadableMap readableMap, @NotNull Context context) {
        return INSTANCE.parse(readableMap, context);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getOffsetX() {
        return this.offsetX;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getOffsetY() {
        return this.offsetY;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float getBlurRadius() {
        return this.blurRadius;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Float getSpreadDistance() {
        return this.spreadDistance;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getInset() {
        return this.inset;
    }

    @NotNull
    public final BoxShadow copy(float offsetX, float offsetY, Integer color, Float blurRadius, Float spreadDistance, Boolean inset) {
        return new BoxShadow(offsetX, offsetY, color, blurRadius, spreadDistance, inset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoxShadow)) {
            return false;
        }
        BoxShadow boxShadow = (BoxShadow) other;
        return Float.compare(this.offsetX, boxShadow.offsetX) == 0 && Float.compare(this.offsetY, boxShadow.offsetY) == 0 && Intrinsics.areEqual(this.color, boxShadow.color) && Intrinsics.areEqual((Object) this.blurRadius, (Object) boxShadow.blurRadius) && Intrinsics.areEqual((Object) this.spreadDistance, (Object) boxShadow.spreadDistance) && Intrinsics.areEqual(this.inset, boxShadow.inset);
    }

    public final Float getBlurRadius() {
        return this.blurRadius;
    }

    public final Integer getColor() {
        return this.color;
    }

    public final Boolean getInset() {
        return this.inset;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final Float getSpreadDistance() {
        return this.spreadDistance;
    }

    public int hashCode() {
        int iA = e.a(Float.hashCode(this.offsetX) * 31, 31, this.offsetY);
        Integer num = this.color;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        Float f2 = this.blurRadius;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f7 = this.spreadDistance;
        int iHashCode3 = (iHashCode2 + (f7 == null ? 0 : f7.hashCode())) * 31;
        Boolean bool = this.inset;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BoxShadow(offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", color=" + this.color + ", blurRadius=" + this.blurRadius + ", spreadDistance=" + this.spreadDistance + ", inset=" + this.inset + ")";
    }

    public /* synthetic */ BoxShadow(float f2, float f7, Integer num, Float f10, Float f11, Boolean bool, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f7, (i7 & 4) != 0 ? null : num, (i7 & 8) != 0 ? null : f10, (i7 & 16) != 0 ? null : f11, (i7 & 32) != 0 ? null : bool);
    }
}
