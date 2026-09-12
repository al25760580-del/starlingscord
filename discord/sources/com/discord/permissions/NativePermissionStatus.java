package com.discord.permissions;

import com.facebook.react.bridge.ReadableNativeMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/discord/permissions/NativePermissionStatus;", "", "<init>", "(Ljava/lang/String;I)V", "AUTHORIZED", "DENIED", "RESTRICTED", "LIMITED", "UNDETERMINED", "Companion", "permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum NativePermissionStatus {
    AUTHORIZED,
    DENIED,
    RESTRICTED,
    LIMITED,
    UNDETERMINED;


    @NotNull
    private static final String ANDROID_PERMISSION_DENIED = "denied";

    @NotNull
    private static final String ANDROID_PERMISSION_GRANTED = "granted";

    @NotNull
    private static final String ANDROID_PERMISSION_NEVER_ASK_AGAIN = "never_ask_again";
    private static final /* synthetic */ EnumEntries $ENTRIES = com.facebook.imagepipeline.nativecode.b.l(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/discord/permissions/NativePermissionStatus$Companion;", "", "<init>", "()V", "ANDROID_PERMISSION_GRANTED", "", "ANDROID_PERMISSION_DENIED", "ANDROID_PERMISSION_NEVER_ASK_AGAIN", "fromAndroidPermissionStatus", "value", "fromAndroidAuthorizationStatus", "permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String fromAndroidAuthorizationStatus(Object value) {
            if (Intrinsics.areEqual(value, Boolean.TRUE)) {
                String lowerCase = "AUTHORIZED".toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                return lowerCase;
            }
            if (Intrinsics.areEqual(value, Boolean.FALSE)) {
                String lowerCase2 = "DENIED".toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                return lowerCase2;
            }
            throw new IllegalStateException(("Unknown authorization result: " + value).toString());
        }

        @NotNull
        public final String fromAndroidPermissionStatus(Object value) {
            String string;
            if (value instanceof String) {
                string = (String) value;
            } else {
                if (!(value instanceof ReadableNativeMap)) {
                    throw new IllegalStateException(("Unknown authorization result: " + value).toString());
                }
                string = ((ReadableNativeMap) value).toString();
            }
            if (StringsKt.D(string, NativePermissionStatus.ANDROID_PERMISSION_GRANTED, false)) {
                String lowerCase = "AUTHORIZED".toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                return lowerCase;
            }
            if (StringsKt.D(string, NativePermissionStatus.ANDROID_PERMISSION_DENIED, false)) {
                String lowerCase2 = "DENIED".toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                return lowerCase2;
            }
            if (StringsKt.D(string, NativePermissionStatus.ANDROID_PERMISSION_NEVER_ASK_AGAIN, false)) {
                String lowerCase3 = "DENIED".toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                return lowerCase3;
            }
            throw new IllegalStateException(("Unknown authorization result: " + value).toString());
        }

        private Companion() {
        }
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }
}
