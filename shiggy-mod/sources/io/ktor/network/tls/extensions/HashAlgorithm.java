package io.ktor.network.tls.extensions;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.network.tls.TLSException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: SignatureAlgorithm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000ej\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lio/ktor/network/tls/extensions/HashAlgorithm;", "", "", "code", "", "openSSLName", "macName", "<init>", "(Ljava/lang/String;IBLjava/lang/String;Ljava/lang/String;)V", "B", "getCode", "()B", "Ljava/lang/String;", "getOpenSSLName", "()Ljava/lang/String;", "getMacName", "Companion", "NONE", "MD5", "SHA1", "SHA224", "SHA256", "SHA384", "SHA512", "INTRINSIC", "ktor-network-tls"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum HashAlgorithm {
    NONE((byte) 0, "", ""),
    MD5((byte) 1, "MD5", "HmacMD5"),
    SHA1((byte) 2, "SHA-1", "HmacSHA1"),
    SHA224((byte) 3, "SHA-224", "HmacSHA224"),
    SHA256((byte) 4, "SHA-256", "HmacSHA256"),
    SHA384((byte) 5, "SHA-384", "HmacSHA384"),
    SHA512((byte) 6, "SHA-512", "HmacSHA512"),
    INTRINSIC((byte) 8, "INTRINSIC", "Intrinsic");

    private final byte code;
    private final String macName;
    private final String openSSLName;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<HashAlgorithm> getEntries() {
        return $ENTRIES;
    }

    HashAlgorithm(byte b, String str, String str2) {
        this.code = b;
        this.openSSLName = str;
        this.macName = str2;
    }

    public final byte getCode() {
        return this.code;
    }

    public final String getMacName() {
        return this.macName;
    }

    public final String getOpenSSLName() {
        return this.openSSLName;
    }

    /* JADX INFO: compiled from: SignatureAlgorithm.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/network/tls/extensions/HashAlgorithm$Companion;", "", "<init>", "()V", "", "code", "Lio/ktor/network/tls/extensions/HashAlgorithm;", "byCode", "(B)Lio/ktor/network/tls/extensions/HashAlgorithm;", "ktor-network-tls"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final HashAlgorithm byCode(byte code) throws TLSException {
            Throwable th;
            HashAlgorithm next;
            Object[] objArr;
            Iterator<HashAlgorithm> it = HashAlgorithm.getEntries().iterator();
            do {
                th = null;
                objArr = 0;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.getCode() != code);
            HashAlgorithm hashAlgorithm = next;
            if (hashAlgorithm != null) {
                return hashAlgorithm;
            }
            throw new TLSException("Unknown hash algorithm: " + ((int) code), th, 2, objArr == true ? 1 : 0);
        }
    }
}
