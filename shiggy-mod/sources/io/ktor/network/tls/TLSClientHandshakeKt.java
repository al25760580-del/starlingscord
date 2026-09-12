package io.ktor.network.tls;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.network.tls.extensions.HashAndSign;
import io.ktor.network.tls.extensions.NamedCurve;
import io.ktor.network.tls.extensions.SignatureAlgorithmKt;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import javax.security.auth.x500.X500Principal;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Source;
import kotlinx.io.SourcesKt;

/* JADX INFO: compiled from: TLSClientHandshake.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ljava/security/SecureRandom;", "", "generateClientSeed", "(Ljava/security/SecureRandom;)[B", "Lio/ktor/network/tls/extensions/NamedCurve;", "curve", "Ljava/security/spec/ECPoint;", "serverPoint", "Lio/ktor/network/tls/EncryptionInfo;", "generateECKeys", "(Lio/ktor/network/tls/extensions/NamedCurve;Ljava/security/spec/ECPoint;)Lio/ktor/network/tls/EncryptionInfo;", "Lkotlinx/io/Source;", "packet", "Lio/ktor/network/tls/CertificateInfo;", "readClientCertificateRequest", "(Lkotlinx/io/Source;)Lio/ktor/network/tls/CertificateInfo;", "ktor-network-tls"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class TLSClientHandshakeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] generateClientSeed(SecureRandom secureRandom) {
        byte[] bArr = new byte[32];
        secureRandom.nextBytes(bArr);
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        bArr[0] = (byte) (jCurrentTimeMillis >> 24);
        bArr[1] = (byte) (jCurrentTimeMillis >> 16);
        bArr[2] = (byte) (jCurrentTimeMillis >> 8);
        bArr[3] = (byte) jCurrentTimeMillis;
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EncryptionInfo generateECKeys(NamedCurve namedCurve, ECPoint eCPoint) throws InvalidKeySpecException, NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        Intrinsics.checkNotNull(keyPairGenerator);
        keyPairGenerator.initialize(new ECGenParameterSpec(namedCurve.name()));
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        Intrinsics.checkNotNull(keyPairGenerateKeyPair);
        PublicKey publicKey = keyPairGenerateKeyPair.getPublic();
        Intrinsics.checkNotNull(publicKey, "null cannot be cast to non-null type java.security.interfaces.ECPublicKey");
        KeyFactory keyFactory = KeyFactory.getInstance("EC");
        Intrinsics.checkNotNull(keyFactory);
        ECParameterSpec params = ((ECPublicKey) publicKey).getParams();
        Intrinsics.checkNotNull(params);
        PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(new ECPublicKeySpec(eCPoint, params));
        Intrinsics.checkNotNull(publicKeyGeneratePublic);
        PublicKey publicKey2 = keyPairGenerateKeyPair.getPublic();
        Intrinsics.checkNotNullExpressionValue(publicKey2, "getPublic(...)");
        PrivateKey privateKey = keyPairGenerateKeyPair.getPrivate();
        Intrinsics.checkNotNullExpressionValue(privateKey, "getPrivate(...)");
        return new EncryptionInfo(publicKeyGeneratePublic, publicKey2, privateKey);
    }

    public static final CertificateInfo readClientCertificateRequest(Source packet) {
        Intrinsics.checkNotNullParameter(packet, "packet");
        byte[] byteArray = SourcesKt.readByteArray(packet, packet.readByte() & UByte.MAX_VALUE);
        int i = packet.readShort() & UShort.MAX_VALUE;
        ArrayList arrayList = new ArrayList();
        int i2 = i / 2;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = arrayList;
            HashAndSign hashAndSignByCode = SignatureAlgorithmKt.byCode(HashAndSign.INSTANCE, packet.readByte(), packet.readByte());
            if (hashAndSignByCode != null) {
                arrayList2.add(hashAndSignByCode);
            }
        }
        int i4 = packet.readShort() & UShort.MAX_VALUE;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i5 = 0;
        while (i5 < i4) {
            int i6 = packet.readShort() & UShort.MAX_VALUE;
            i5 += i6 + 2;
            linkedHashSet.add(new X500Principal(SourcesKt.readByteArray(packet, i6)));
        }
        CertificateInfo certificateInfo = new CertificateInfo(byteArray, (HashAndSign[]) arrayList.toArray(new HashAndSign[0]), linkedHashSet);
        if (packet.exhausted()) {
            return certificateInfo;
        }
        throw new IllegalStateException("Check failed.");
    }
}
