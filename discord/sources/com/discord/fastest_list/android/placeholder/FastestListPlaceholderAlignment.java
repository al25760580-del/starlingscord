package com.discord.fastest_list.android.placeholder;

import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderAlignment;", "", "<init>", "()V", "Horizontal", "Vertical", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FastestListPlaceholderAlignment {

    @NotNull
    public static final FastestListPlaceholderAlignment INSTANCE = new FastestListPlaceholderAlignment();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderAlignment$Horizontal;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "CENTER", "Companion", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Horizontal {
        LEFT,
        RIGHT,
        CENTER;

        private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderAlignment$Horizontal$Companion;", "", "<init>", "()V", "parse", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderAlignment$Horizontal;", "value", "", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Horizontal parse(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int iHashCode = value.hashCode();
                if (iHashCode != -1364013995) {
                    if (iHashCode != 3317767) {
                        if (iHashCode == 108511772 && value.equals(ViewProps.RIGHT)) {
                            return Horizontal.RIGHT;
                        }
                    } else if (value.equals(ViewProps.LEFT)) {
                        return Horizontal.LEFT;
                    }
                } else if (value.equals("center")) {
                    return Horizontal.CENTER;
                }
                throw new IllegalStateException("Unknown alignment: ".concat(value).toString());
            }

            private Companion() {
            }
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderAlignment$Vertical;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "CENTER", "Companion", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Vertical {
        TOP,
        BOTTOM,
        CENTER;

        private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderAlignment$Vertical$Companion;", "", "<init>", "()V", "parse", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderAlignment$Vertical;", "value", "", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Vertical parse(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int iHashCode = value.hashCode();
                if (iHashCode != -1383228885) {
                    if (iHashCode != -1364013995) {
                        if (iHashCode == 115029 && value.equals(ViewProps.TOP)) {
                            return Vertical.TOP;
                        }
                    } else if (value.equals("center")) {
                        return Vertical.CENTER;
                    }
                } else if (value.equals(ViewProps.BOTTOM)) {
                    return Vertical.BOTTOM;
                }
                throw new IllegalStateException("Unknown alignment: ".concat(value).toString());
            }

            private Companion() {
            }
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    private FastestListPlaceholderAlignment() {
    }
}
