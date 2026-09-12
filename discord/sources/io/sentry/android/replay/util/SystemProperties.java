package io.sentry.android.replay.util;

import android.os.Build;
import com.facebook.imagepipeline.nativecode.b;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lio/sentry/android/replay/util/SystemProperties;", "", "()V", "get", "", "key", "Lio/sentry/android/replay/util/SystemProperties$Property;", "defaultValue", "Property", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SystemProperties {
    public static final int $stable = 0;

    @NotNull
    public static final SystemProperties INSTANCE = new SystemProperties();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lio/sentry/android/replay/util/SystemProperties$Property;", "", "(Ljava/lang/String;I)V", "SOC_MODEL", "SOC_MANUFACTURER", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum Property {
        SOC_MODEL,
        SOC_MANUFACTURER;

        private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Property.values().length];
            try {
                iArr[Property.SOC_MODEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Property.SOC_MANUFACTURER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SystemProperties() {
    }

    public static /* synthetic */ String get$default(SystemProperties systemProperties, Property property, String str, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str = "";
        }
        return systemProperties.get(property, str);
    }

    @NotNull
    public final String get(@NotNull Property key, @NotNull String defaultValue) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (Build.VERSION.SDK_INT < 31) {
            return defaultValue;
        }
        int i7 = WhenMappings.$EnumSwitchMapping$0[key.ordinal()];
        if (i7 == 1) {
            str = Build.SOC_MODEL;
        } else {
            if (i7 != 2) {
                throw new n();
            }
            str = Build.SOC_MANUFACTURER;
        }
        Intrinsics.checkNotNull(str);
        return str;
    }
}
