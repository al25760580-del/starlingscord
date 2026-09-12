package io.ktor.network.tls;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TLSHandshakeType.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lio/ktor/network/tls/ServerKeyExchangeType;", "", "", "code", "<init>", "(Ljava/lang/String;II)V", "I", "getCode", "()I", "Companion", "ExplicitPrime", "ExplicitChar", "NamedCurve", "ktor-network-tls"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum ServerKeyExchangeType {
    ExplicitPrime(1),
    ExplicitChar(2),
    NamedCurve(3);

    private static final ServerKeyExchangeType[] byCode;
    private final int code;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<ServerKeyExchangeType> getEntries() {
        return $ENTRIES;
    }

    ServerKeyExchangeType(int i) {
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }

    static {
        ServerKeyExchangeType next;
        ServerKeyExchangeType[] serverKeyExchangeTypeArr = new ServerKeyExchangeType[256];
        for (int i = 0; i < 256; i++) {
            Iterator<ServerKeyExchangeType> it = getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.code != i);
            serverKeyExchangeTypeArr[i] = next;
        }
        byCode = serverKeyExchangeTypeArr;
    }

    /* JADX INFO: compiled from: TLSHandshakeType.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/network/tls/ServerKeyExchangeType$Companion;", "", "<init>", "()V", "", "code", "Lio/ktor/network/tls/ServerKeyExchangeType;", "byCode", "(I)Lio/ktor/network/tls/ServerKeyExchangeType;", "", "[Lio/ktor/network/tls/ServerKeyExchangeType;", "ktor-network-tls"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ServerKeyExchangeType byCode(int code) {
            ServerKeyExchangeType serverKeyExchangeType = (code < 0 || code >= 256) ? null : ServerKeyExchangeType.byCode[code];
            if (serverKeyExchangeType != null) {
                return serverKeyExchangeType;
            }
            throw new IllegalArgumentException("Invalid TLS ServerKeyExchange type code: " + code);
        }
    }
}
