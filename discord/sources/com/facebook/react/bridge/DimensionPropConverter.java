package com.facebook.react.bridge;

import com.facebook.yoga.YogaUnit;
import com.facebook.yoga.YogaValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/facebook/react/bridge/DimensionPropConverter;", "", "<init>", "()V", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DimensionPropConverter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0007¨\u0006\u0007"}, d2 = {"Lcom/facebook/react/bridge/DimensionPropConverter$Companion;", "", "<init>", "()V", "getDimension", "Lcom/facebook/yoga/YogaValue;", "value", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final YogaValue getDimension(Object value) {
            if (value == null) {
                return null;
            }
            boolean z5 = value instanceof Double;
            YogaUnit yogaUnit = YogaUnit.POINT;
            if (z5) {
                return new YogaValue((float) ((Number) value).doubleValue(), yogaUnit);
            }
            if (!(value instanceof String)) {
                throw new JSApplicationCausedNativeException("DimensionValue: the value must be a number or string.");
            }
            YogaValue yogaValue = YogaValue.f5487c;
            String str = (String) value;
            if (Intrinsics.areEqual("undefined", str)) {
                return YogaValue.f5487c;
            }
            if (Intrinsics.areEqual("auto", str)) {
                return YogaValue.f5488d;
            }
            if (!x.h(str, "%", false)) {
                return new YogaValue(Float.parseFloat(str), yogaUnit);
            }
            String strSubstring = str.substring(0, str.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return new YogaValue(Float.parseFloat(strSubstring), YogaUnit.PERCENT);
        }

        private Companion() {
        }
    }

    public static final YogaValue getDimension(Object obj) {
        return INSTANCE.getDimension(obj);
    }
}
