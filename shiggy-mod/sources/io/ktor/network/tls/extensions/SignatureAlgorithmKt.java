package io.ktor.network.tls.extensions;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.network.tls.OID;
import io.ktor.network.tls.TLSException;
import io.ktor.utils.io.core.ByteReadPacketKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.UShort;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Source;

/* JADX INFO: compiled from: SignatureAlgorithm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a-\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005*\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0011\u001a\u0004\u0018\u00010\u0005*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"", "hashValue", "signValue", "", "oidValue", "Lio/ktor/network/tls/extensions/HashAndSign;", "HashAndSign", "(BBLjava/lang/String;)Lio/ktor/network/tls/extensions/HashAndSign;", "Lkotlinx/io/Source;", "", "parseSignatureAlgorithms", "(Lkotlinx/io/Source;)Ljava/util/List;", "readHashAndSign", "(Lkotlinx/io/Source;)Lio/ktor/network/tls/extensions/HashAndSign;", "Lio/ktor/network/tls/extensions/HashAndSign$Companion;", "hash", "sign", "byCode", "(Lio/ktor/network/tls/extensions/HashAndSign$Companion;BB)Lio/ktor/network/tls/extensions/HashAndSign;", "SupportedSignatureAlgorithms", "Ljava/util/List;", "getSupportedSignatureAlgorithms", "()Ljava/util/List;", "ktor-network-tls"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SignatureAlgorithmKt {
    private static final List<HashAndSign> SupportedSignatureAlgorithms = CollectionsKt.listOf((Object[]) new HashAndSign[]{new HashAndSign(HashAlgorithm.SHA384, SignatureAlgorithm.ECDSA, OID.INSTANCE.getECDSAwithSHA384Encryption()), new HashAndSign(HashAlgorithm.SHA256, SignatureAlgorithm.ECDSA, OID.INSTANCE.getECDSAwithSHA256Encryption()), new HashAndSign(HashAlgorithm.SHA512, SignatureAlgorithm.RSA, OID.INSTANCE.getRSAwithSHA512Encryption()), new HashAndSign(HashAlgorithm.SHA384, SignatureAlgorithm.RSA, OID.INSTANCE.getRSAwithSHA384Encryption()), new HashAndSign(HashAlgorithm.SHA256, SignatureAlgorithm.RSA, OID.INSTANCE.getRSAwithSHA256Encryption()), new HashAndSign(HashAlgorithm.SHA1, SignatureAlgorithm.RSA, OID.INSTANCE.getRSAwithSHA1Encryption())});

    public static /* synthetic */ HashAndSign HashAndSign$default(byte b, byte b2, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        return HashAndSign(b, b2, str);
    }

    public static final HashAndSign HashAndSign(byte b, byte b2, String str) throws TLSException {
        HashAlgorithm hashAlgorithmByCode = HashAlgorithm.INSTANCE.byCode(b);
        SignatureAlgorithm signatureAlgorithmByCode = SignatureAlgorithm.INSTANCE.byCode(b2);
        if (signatureAlgorithmByCode == null) {
            return null;
        }
        return new HashAndSign(hashAlgorithmByCode, signatureAlgorithmByCode, str != null ? new OID(str) : null);
    }

    public static final List<HashAndSign> getSupportedSignatureAlgorithms() {
        return SupportedSignatureAlgorithms;
    }

    public static final List<HashAndSign> parseSignatureAlgorithms(Source source) throws TLSException {
        Intrinsics.checkNotNullParameter(source, "<this>");
        int i = source.readShort() & UShort.MAX_VALUE;
        ArrayList arrayList = new ArrayList();
        while (ByteReadPacketKt.getRemaining(source) > 0) {
            ArrayList arrayList2 = arrayList;
            HashAndSign hashAndSign = readHashAndSign(source);
            if (hashAndSign != null) {
                arrayList2.add(hashAndSign);
            }
        }
        if (((int) ByteReadPacketKt.getRemaining(source)) == i) {
            return arrayList;
        }
        throw new TLSException("Invalid hash and sign packet size: expected " + i + ", actual " + arrayList.size(), null, 2, null);
    }

    public static final HashAndSign readHashAndSign(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return byCode(HashAndSign.INSTANCE, source.readByte(), source.readByte());
    }

    public static final HashAndSign byCode(HashAndSign.Companion companion, byte b, byte b2) {
        Object next;
        Intrinsics.checkNotNullParameter(companion, "<this>");
        if (b2 == SignatureAlgorithm.ANON.getCode()) {
            throw new IllegalStateException("Anonymous signature not allowed.".toString());
        }
        Iterator<T> it = SupportedSignatureAlgorithms.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            HashAndSign hashAndSign = (HashAndSign) next;
            if (hashAndSign.getHash().getCode() == b && hashAndSign.getSign().getCode() == b2) {
                break;
            }
        }
        HashAndSign hashAndSign2 = (HashAndSign) next;
        return hashAndSign2 == null ? HashAndSign$default(b, b2, null, 4, null) : hashAndSign2;
    }
}
