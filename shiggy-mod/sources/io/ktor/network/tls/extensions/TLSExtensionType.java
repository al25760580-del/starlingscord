package io.ktor.network.tls.extensions;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.network.tls.TLSException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TLSExtension.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\n\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lio/ktor/network/tls/extensions/TLSExtensionType;", "", "", "code", "<init>", "(Ljava/lang/String;IS)V", "S", "getCode", "()S", "Companion", "SERVER_NAME", "MAX_FRAGMENT_LENGTH", "CLIENT_CERTIFICATE_URL", "TRUSTED_CA_KEYS", "TRUNCATED_HMAC", "STATUS_REQUEST", "ELLIPTIC_CURVES", "EC_POINT_FORMAT", "SIGNATURE_ALGORITHMS", "ktor-network-tls"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum TLSExtensionType {
    SERVER_NAME(0),
    MAX_FRAGMENT_LENGTH(1),
    CLIENT_CERTIFICATE_URL(2),
    TRUSTED_CA_KEYS(3),
    TRUNCATED_HMAC(4),
    STATUS_REQUEST(5),
    ELLIPTIC_CURVES(10),
    EC_POINT_FORMAT(11),
    SIGNATURE_ALGORITHMS(13);

    private final short code;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<TLSExtensionType> getEntries() {
        return $ENTRIES;
    }

    TLSExtensionType(short s) {
        this.code = s;
    }

    public final short getCode() {
        return this.code;
    }

    /* JADX INFO: compiled from: TLSExtension.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/network/tls/extensions/TLSExtensionType$Companion;", "", "<init>", "()V", "", "code", "Lio/ktor/network/tls/extensions/TLSExtensionType;", "byCode", "(I)Lio/ktor/network/tls/extensions/TLSExtensionType;", "ktor-network-tls"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TLSExtensionType byCode(int code) throws TLSException {
            TLSExtensionType next;
            Iterator<TLSExtensionType> it = TLSExtensionType.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.getCode() != ((short) code));
            TLSExtensionType tLSExtensionType = next;
            if (tLSExtensionType != null) {
                return tLSExtensionType;
            }
            throw new TLSException("Unknown server hello extension type: " + code, null, 2, null);
        }
    }
}
