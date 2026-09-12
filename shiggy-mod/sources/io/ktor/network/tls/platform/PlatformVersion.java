package io.ktor.network.tls.platform;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: PlatformVersion.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lio/ktor/network/tls/platform/PlatformVersion;", "", "", "major", "", "minor", "<init>", "(Ljava/lang/String;I)V", "Ljava/lang/String;", "getMajor", "()Ljava/lang/String;", "I", "getMinor", "()I", "Companion", "ktor-network-tls"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class PlatformVersion {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final PlatformVersion MINIMAL_SUPPORTED = new PlatformVersion("1.6.0", 0);
    private final String major;
    private final int minor;

    public PlatformVersion(String major, int i) {
        Intrinsics.checkNotNullParameter(major, "major");
        this.major = major;
        this.minor = i;
    }

    public final String getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    /* JADX INFO: compiled from: PlatformVersion.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/network/tls/platform/PlatformVersion$Companion;", "", "<init>", "()V", "", "rawVersion", "Lio/ktor/network/tls/platform/PlatformVersion;", "invoke", "(Ljava/lang/String;)Lio/ktor/network/tls/platform/PlatformVersion;", "MINIMAL_SUPPORTED", "Lio/ktor/network/tls/platform/PlatformVersion;", "ktor-network-tls"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PlatformVersion invoke(String rawVersion) {
            Intrinsics.checkNotNullParameter(rawVersion, "rawVersion");
            try {
                List listSplit$default = StringsKt.split$default((CharSequence) rawVersion, new char[]{'-', '_'}, false, 0, 6, (Object) null);
                if (listSplit$default.size() == 2) {
                    return new PlatformVersion((String) listSplit$default.get(0), Integer.parseInt((String) listSplit$default.get(1)));
                }
                return new PlatformVersion(rawVersion, -1);
            } catch (Throwable unused) {
                return PlatformVersion.MINIMAL_SUPPORTED;
            }
        }
    }
}
