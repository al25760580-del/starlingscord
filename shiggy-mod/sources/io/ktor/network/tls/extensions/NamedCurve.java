package io.ktor.network.tls.extensions;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: NamedCurves.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b$\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u0006("}, d2 = {"Lio/ktor/network/tls/extensions/NamedCurve;", "", "", "code", "", "fieldSize", "<init>", "(Ljava/lang/String;ISI)V", "S", "getCode", "()S", "I", "getFieldSize", "()I", "Companion", "sect163k1", "sect163r1", "sect163r2", "sect193r1", "sect193r2", "sect233k1", "sect233r1", "sect239k1", "sect283k1", "sect283r1", "sect409k1", "sect409r1", "sect571k1", "sect571r1", "secp160k1", "secp160r1", "secp160r2", "secp192k1", "secp192r1", "secp224k1", "secp224r1", "secp256k1", "secp256r1", "secp384r1", "secp521r1", "ktor-network-tls"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum NamedCurve {
    sect163k1(1, 163),
    sect163r1(2, 163),
    sect163r2(3, 163),
    sect193r1(4, 193),
    sect193r2(5, 193),
    sect233k1(6, 233),
    sect233r1(7, 233),
    sect239k1(8, 239),
    sect283k1(9, 283),
    sect283r1(10, 283),
    sect409k1(11, 409),
    sect409r1(12, 409),
    sect571k1(13, 571),
    sect571r1(14, 571),
    secp160k1(15, 160),
    secp160r1(16, 160),
    secp160r2(17, 160),
    secp192k1(18, 192),
    secp192r1(19, 192),
    secp224k1(20, 224),
    secp224r1(21, 224),
    secp256k1(22, 256),
    secp256r1(23, 256),
    secp384r1(24, 384),
    secp521r1(25, 521);

    private final short code;
    private final int fieldSize;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<NamedCurve> getEntries() {
        return $ENTRIES;
    }

    NamedCurve(short s, int i) {
        this.code = s;
        this.fieldSize = i;
    }

    public final short getCode() {
        return this.code;
    }

    public final int getFieldSize() {
        return this.fieldSize;
    }

    /* JADX INFO: compiled from: NamedCurves.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/network/tls/extensions/NamedCurve$Companion;", "", "<init>", "()V", "", "code", "Lio/ktor/network/tls/extensions/NamedCurve;", "fromCode", "(S)Lio/ktor/network/tls/extensions/NamedCurve;", "ktor-network-tls"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NamedCurve fromCode(short code) {
            NamedCurve next;
            Iterator<NamedCurve> it = NamedCurve.getEntries().iterator();
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
