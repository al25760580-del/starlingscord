package com.facebook.react.uimanager.style;

import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.uimanager.ViewProps;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/Overflow;", "", "<init>", "(Ljava/lang/String;I)V", "VISIBLE", "HIDDEN", "SCROLL", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum Overflow {
    VISIBLE,
    HIDDEN,
    SCROLL;

    private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/Overflow$Companion;", "", "<init>", "()V", "fromString", "Lcom/facebook/react/uimanager/style/Overflow;", ViewProps.OVERFLOW, "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Overflow fromString(@NotNull String overflow) {
            Intrinsics.checkNotNullParameter(overflow, "overflow");
            String lowerCase = overflow.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            int iHashCode = lowerCase.hashCode();
            if (iHashCode == -1217487446) {
                if (lowerCase.equals(ViewProps.HIDDEN)) {
                    return Overflow.HIDDEN;
                }
                return null;
            }
            if (iHashCode == -907680051) {
                if (lowerCase.equals(ViewProps.SCROLL)) {
                    return Overflow.SCROLL;
                }
                return null;
            }
            if (iHashCode == 466743410 && lowerCase.equals(ViewProps.VISIBLE)) {
                return Overflow.VISIBLE;
            }
            return null;
        }

        private Companion() {
        }
    }

    public static final Overflow fromString(@NotNull String str) {
        return INSTANCE.fromString(str);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }
}
