package io.ktor.network.tls;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TLSAlert.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b!\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006#"}, d2 = {"Lio/ktor/network/tls/TLSAlertType;", "", "", "code", "<init>", "(Ljava/lang/String;II)V", "I", "getCode", "()I", "Companion", "DecryptionFailed_RESERVED", "CloseNotify", "UnexpectedMessage", "BadRecordMac", "RecordOverflow", "DecompressionFailure", "HandshakeFailure", "NoCertificate_RESERVED", "BadCertificate", "UnsupportedCertificate", "CertificateRevoked", "CertificateExpired", "CertificateUnknown", "IllegalParameter", "UnknownCa", "AccessDenied", "DecodeError", "DecryptError", "ExportRestriction_RESERVED", "ProtocolVersion", "InsufficientSecurity", "InternalError", "UserCanceled", "NoRenegotiation", "UnsupportedExtension", "ktor-network-tls"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum TLSAlertType {
    DecryptionFailed_RESERVED(21),
    CloseNotify(0),
    UnexpectedMessage(10),
    BadRecordMac(20),
    RecordOverflow(22),
    DecompressionFailure(30),
    HandshakeFailure(40),
    NoCertificate_RESERVED(41),
    BadCertificate(42),
    UnsupportedCertificate(43),
    CertificateRevoked(44),
    CertificateExpired(45),
    CertificateUnknown(46),
    IllegalParameter(47),
    UnknownCa(48),
    AccessDenied(49),
    DecodeError(50),
    DecryptError(51),
    ExportRestriction_RESERVED(60),
    ProtocolVersion(70),
    InsufficientSecurity(71),
    InternalError(80),
    UserCanceled(90),
    NoRenegotiation(100),
    UnsupportedExtension(110);

    private static final TLSAlertType[] byCode;
    private final int code;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<TLSAlertType> getEntries() {
        return $ENTRIES;
    }

    TLSAlertType(int i) {
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }

    static {
        TLSAlertType next;
        TLSAlertType[] tLSAlertTypeArr = new TLSAlertType[256];
        for (int i = 0; i < 256; i++) {
            Iterator<TLSAlertType> it = getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.code != i);
            tLSAlertTypeArr[i] = next;
        }
        byCode = tLSAlertTypeArr;
    }

    /* JADX INFO: compiled from: TLSAlert.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/network/tls/TLSAlertType$Companion;", "", "<init>", "()V", "", "code", "Lio/ktor/network/tls/TLSAlertType;", "byCode", "(I)Lio/ktor/network/tls/TLSAlertType;", "", "[Lio/ktor/network/tls/TLSAlertType;", "ktor-network-tls"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TLSAlertType byCode(int code) {
            TLSAlertType tLSAlertType = (code < 0 || code >= 256) ? null : TLSAlertType.byCode[code];
            if (tLSAlertType != null) {
                return tLSAlertType;
            }
            throw new IllegalArgumentException("Invalid TLS record type code: " + code);
        }
    }
}
