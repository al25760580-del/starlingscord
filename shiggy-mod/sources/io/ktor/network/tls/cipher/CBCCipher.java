package io.ktor.network.tls.cipher;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.network.tls.CipherSuite;
import io.ktor.network.tls.KeysKt;
import io.ktor.network.tls.TLSException;
import io.ktor.network.tls.TLSRecord;
import io.ktor.util.CryptoKt;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.io.Buffer;
import kotlinx.io.Sink;
import kotlinx.io.Source;
import kotlinx.io.SourcesKt;

/* JADX INFO: compiled from: CBCCipher.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001fR\u0014\u0010'\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\"R\u0014\u0010(\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010%R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+¨\u0006-"}, d2 = {"Lio/ktor/network/tls/cipher/CBCCipher;", "Lio/ktor/network/tls/cipher/TLSCipher;", "Lio/ktor/network/tls/CipherSuite;", "suite", "", "keyMaterial", "<init>", "(Lio/ktor/network/tls/CipherSuite;[B)V", "Lio/ktor/network/tls/TLSRecord;", "record", "encrypt", "(Lio/ktor/network/tls/TLSRecord;)Lio/ktor/network/tls/TLSRecord;", "decrypt", "content", "prepareMac", "(Lio/ktor/network/tls/TLSRecord;[B)[B", "Lkotlinx/io/Sink;", "", "writePadding", "(Lkotlinx/io/Sink;)V", "", "paddingStart", "validatePadding", "([BI)V", "macOffset", "validateMac", "(Lio/ktor/network/tls/TLSRecord;[BI)V", "Lio/ktor/network/tls/CipherSuite;", "[B", "Ljavax/crypto/Cipher;", "sendCipher", "Ljavax/crypto/Cipher;", "Ljavax/crypto/spec/SecretKeySpec;", "sendKey", "Ljavax/crypto/spec/SecretKeySpec;", "Ljavax/crypto/Mac;", "sendMac", "Ljavax/crypto/Mac;", "receiveCipher", "receiveKey", "receiveMac", "", "inputCounter", "J", "outputCounter", "ktor-network-tls"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class CBCCipher implements TLSCipher {
    private long inputCounter;
    private final byte[] keyMaterial;
    private long outputCounter;
    private final Cipher receiveCipher;
    private final SecretKeySpec receiveKey;
    private final Mac receiveMac;
    private final Cipher sendCipher;
    private final SecretKeySpec sendKey;
    private final Mac sendMac;
    private final CipherSuite suite;

    public CBCCipher(CipherSuite suite, byte[] keyMaterial) throws NoSuchPaddingException, NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(suite, "suite");
        Intrinsics.checkNotNullParameter(keyMaterial, "keyMaterial");
        this.suite = suite;
        this.keyMaterial = keyMaterial;
        Cipher cipher = Cipher.getInstance(suite.getJdkCipherName());
        Intrinsics.checkNotNull(cipher);
        this.sendCipher = cipher;
        this.sendKey = KeysKt.clientKey(keyMaterial, suite);
        Mac mac = Mac.getInstance(suite.getMacName());
        Intrinsics.checkNotNull(mac);
        this.sendMac = mac;
        Cipher cipher2 = Cipher.getInstance(suite.getJdkCipherName());
        Intrinsics.checkNotNull(cipher2);
        this.receiveCipher = cipher2;
        this.receiveKey = KeysKt.serverKey(keyMaterial, suite);
        Mac mac2 = Mac.getInstance(suite.getMacName());
        Intrinsics.checkNotNull(mac2);
        this.receiveMac = mac2;
    }

    @Override // io.ktor.network.tls.cipher.TLSCipher
    public TLSRecord encrypt(TLSRecord record) throws InvalidKeyException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(record, "record");
        this.sendCipher.init(1, this.sendKey, new IvParameterSpec(CryptoKt.generateNonce(this.suite.getFixedIvLength())));
        byte[] byteArray = SourcesKt.readByteArray(record.getPacket());
        byte[] bArrPrepareMac = prepareMac(record, byteArray);
        Buffer buffer = new Buffer();
        Buffer buffer2 = buffer;
        BytePacketBuilderKt.writeFully$default(buffer2, byteArray, 0, 0, 6, null);
        BytePacketBuilderKt.writeFully$default(buffer2, bArrPrepareMac, 0, 0, 6, null);
        writePadding(buffer2);
        return new TLSRecord(record.getType(), null, CipherUtilsKt.cipherLoop(buffer, this.sendCipher, new Function1() { // from class: io.ktor.network.tls.cipher.CBCCipher$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CBCCipher.encrypt$lambda$1(this.f$0, (Sink) obj);
            }
        }), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit encrypt$lambda$1(CBCCipher cBCCipher, Sink cipherLoop) {
        Intrinsics.checkNotNullParameter(cipherLoop, "$this$cipherLoop");
        byte[] iv = cBCCipher.sendCipher.getIV();
        Intrinsics.checkNotNullExpressionValue(iv, "getIV(...)");
        BytePacketBuilderKt.writeFully$default(cipherLoop, iv, 0, 0, 6, null);
        return Unit.INSTANCE;
    }

    @Override // io.ktor.network.tls.cipher.TLSCipher
    public TLSRecord decrypt(TLSRecord record) throws TLSException, InvalidKeyException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(record, "record");
        Source packet = record.getPacket();
        this.receiveCipher.init(2, this.receiveKey, new IvParameterSpec(SourcesKt.readByteArray(packet, this.suite.getFixedIvLength())));
        byte[] byteArray = SourcesKt.readByteArray(CipherUtilsKt.cipherLoop$default(packet, this.receiveCipher, null, 2, null));
        int length = (byteArray.length - (byteArray[byteArray.length - 1] & UByte.MAX_VALUE)) - 1;
        int macStrengthInBytes = length - this.suite.getMacStrengthInBytes();
        validatePadding(byteArray, length);
        validateMac(record, byteArray, macStrengthInBytes);
        Buffer buffer = new Buffer();
        BytePacketBuilderKt.writeFully(buffer, byteArray, 0, macStrengthInBytes);
        return new TLSRecord(record.getType(), record.getVersion(), buffer);
    }

    private final byte[] prepareMac(TLSRecord record, byte[] content) throws InvalidKeyException {
        this.sendMac.reset();
        this.sendMac.init(KeysKt.clientMacKey(this.keyMaterial, this.suite));
        byte[] bArr = new byte[13];
        CipherKt.set(bArr, 0, this.outputCounter);
        bArr[8] = (byte) record.getType().getCode();
        bArr[9] = 3;
        bArr[10] = 3;
        CipherKt.set(bArr, 11, (short) content.length);
        this.outputCounter++;
        this.sendMac.update(bArr);
        byte[] bArrDoFinal = this.sendMac.doFinal(content);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }

    private final void writePadding(Sink sink) {
        byte blockSize = (byte) (this.sendCipher.getBlockSize() - ((BytePacketBuilderKt.getSize(sink) + 1) % this.sendCipher.getBlockSize()));
        int i = blockSize + 1;
        for (int i2 = 0; i2 < i; i2++) {
            sink.writeByte(blockSize);
        }
    }

    private final void validatePadding(byte[] content, int paddingStart) throws TLSException {
        int i = content[content.length - 1] & UByte.MAX_VALUE;
        int length = content.length;
        while (paddingStart < length) {
            int i2 = content[paddingStart] & UByte.MAX_VALUE;
            if (i != i2) {
                throw new TLSException("Padding invalid: expected " + i + ", actual " + i2, null, 2, null);
            }
            paddingStart++;
        }
    }

    private final void validateMac(TLSRecord record, byte[] content, int macOffset) throws TLSException, InvalidKeyException {
        this.receiveMac.reset();
        this.receiveMac.init(KeysKt.serverMacKey(this.keyMaterial, this.suite));
        byte[] bArr = new byte[13];
        CipherKt.set(bArr, 0, this.inputCounter);
        bArr[8] = (byte) record.getType().getCode();
        bArr[9] = 3;
        bArr[10] = 3;
        CipherKt.set(bArr, 11, (short) macOffset);
        this.inputCounter++;
        this.receiveMac.update(bArr);
        this.receiveMac.update(content, 0, macOffset);
        byte[] bArrDoFinal = this.receiveMac.doFinal();
        Intrinsics.checkNotNull(bArrDoFinal);
        if (!MessageDigest.isEqual(bArrDoFinal, ArraysKt.sliceArray(content, RangesKt.until(macOffset, this.suite.getMacStrengthInBytes() + macOffset)))) {
            throw new TLSException("Failed to verify MAC content", null, 2, null);
        }
    }
}
