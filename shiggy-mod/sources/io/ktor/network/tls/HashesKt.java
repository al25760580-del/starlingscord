package io.ktor.network.tls;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Hashes.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a1\u0010\f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ljavax/crypto/SecretKey;", "secret", "", "label", "seed", "", "requiredLength", "PRF", "(Ljavax/crypto/SecretKey;[B[BI)[B", "Ljavax/crypto/Mac;", "mac", "secretKey", "P_hash", "([BLjavax/crypto/Mac;Ljavax/crypto/SecretKey;I)[B", "ktor-network-tls"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class HashesKt {
    public static /* synthetic */ byte[] PRF$default(SecretKey secretKey, byte[] bArr, byte[] bArr2, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 12;
        }
        return PRF(secretKey, bArr, bArr2, i);
    }

    public static final byte[] PRF(SecretKey secret, byte[] label, byte[] seed, int i) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(secret, "secret");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(seed, "seed");
        byte[] bArrPlus = ArraysKt.plus(label, seed);
        Mac mac = Mac.getInstance(secret.getAlgorithm());
        Intrinsics.checkNotNullExpressionValue(mac, "getInstance(...)");
        return P_hash(bArrPlus, mac, secret, i);
    }

    static /* synthetic */ byte[] P_hash$default(byte[] bArr, Mac mac, SecretKey secretKey, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 12;
        }
        return P_hash(bArr, mac, secretKey, i);
    }

    private static final byte[] P_hash(byte[] bArr, Mac mac, SecretKey secretKey, int i) throws InvalidKeyException {
        if (i < 12) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        byte[] bArrPlus = new byte[0];
        byte[] bArrDoFinal = bArr;
        while (bArrPlus.length < i) {
            mac.reset();
            SecretKey secretKey2 = secretKey;
            mac.init(secretKey2);
            mac.update(bArrDoFinal);
            bArrDoFinal = mac.doFinal();
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
            mac.reset();
            mac.init(secretKey2);
            mac.update(bArrDoFinal);
            mac.update(bArr);
            byte[] bArrDoFinal2 = mac.doFinal();
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal2, "doFinal(...)");
            bArrPlus = ArraysKt.plus(bArrPlus, bArrDoFinal2);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArrPlus, i);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }
}
