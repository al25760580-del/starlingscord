package io.ktor.network.tls;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TLSRecordType.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lio/ktor/network/tls/TLSRecordType;", "", "", "code", "<init>", "(Ljava/lang/String;II)V", "I", "getCode", "()I", "Companion", "ChangeCipherSpec", "Alert", "Handshake", "ApplicationData", "ktor-network-tls"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum TLSRecordType {
    ChangeCipherSpec(20),
    Alert(21),
    Handshake(22),
    ApplicationData(23);

    private static final TLSRecordType[] byCode;
    private final int code;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<TLSRecordType> getEntries() {
        return $ENTRIES;
    }

    TLSRecordType(int i) {
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }

    static {
        TLSRecordType next;
        TLSRecordType[] tLSRecordTypeArr = new TLSRecordType[256];
        for (int i = 0; i < 256; i++) {
            Iterator<TLSRecordType> it = getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.code != i);
            tLSRecordTypeArr[i] = next;
        }
        byCode = tLSRecordTypeArr;
    }

    /* JADX INFO: compiled from: TLSRecordType.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/network/tls/TLSRecordType$Companion;", "", "<init>", "()V", "", "code", "Lio/ktor/network/tls/TLSRecordType;", "byCode", "(I)Lio/ktor/network/tls/TLSRecordType;", "", "[Lio/ktor/network/tls/TLSRecordType;", "ktor-network-tls"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TLSRecordType byCode(int code) {
            TLSRecordType tLSRecordType = (code < 0 || code >= 256) ? null : TLSRecordType.byCode[code];
            if (tLSRecordType != null) {
                return tLSRecordType;
            }
            throw new IllegalArgumentException("Invalid TLS record type code: " + code);
        }
    }
}
