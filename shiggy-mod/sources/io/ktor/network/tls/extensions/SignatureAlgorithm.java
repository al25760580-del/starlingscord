package io.ktor.network.tls.extensions;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: SignatureAlgorithm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lio/ktor/network/tls/extensions/SignatureAlgorithm;", "", "", "code", "<init>", "(Ljava/lang/String;IB)V", "B", "getCode", "()B", "Companion", "ANON", "RSA", "DSA", "ECDSA", "ED25519", "ED448", "ktor-network-tls"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum SignatureAlgorithm {
    ANON((byte) 0),
    RSA((byte) 1),
    DSA((byte) 2),
    ECDSA((byte) 3),
    ED25519((byte) 7),
    ED448((byte) 8);

    private final byte code;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<SignatureAlgorithm> getEntries() {
        return $ENTRIES;
    }

    SignatureAlgorithm(byte b) {
        this.code = b;
    }

    public final byte getCode() {
        return this.code;
    }

    /* JADX INFO: compiled from: SignatureAlgorithm.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/network/tls/extensions/SignatureAlgorithm$Companion;", "", "<init>", "()V", "", "code", "Lio/ktor/network/tls/extensions/SignatureAlgorithm;", "byCode", "(B)Lio/ktor/network/tls/extensions/SignatureAlgorithm;", "ktor-network-tls"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SignatureAlgorithm byCode(byte code) {
            SignatureAlgorithm next;
            Iterator<SignatureAlgorithm> it = SignatureAlgorithm.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (next.getCode() == code) {
                    return next;
                }
            }
            next = null;
            return next;
        }
    }
}
