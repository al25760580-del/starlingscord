package io.ktor.network.tls.cipher;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.network.tls.CipherSuite;
import io.ktor.network.tls.TLSRecord;
import io.ktor.network.tls.TLSRecordType;
import io.ktor.utils.io.core.ByteReadPacketKt;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Sink;
import kotlinx.io.Source;

/* JADX INFO: compiled from: GCMCipher.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lio/ktor/network/tls/cipher/GCMCipher;", "Lio/ktor/network/tls/cipher/TLSCipher;", "Lio/ktor/network/tls/CipherSuite;", "suite", "", "keyMaterial", "<init>", "(Lio/ktor/network/tls/CipherSuite;[B)V", "Lio/ktor/network/tls/TLSRecord;", "record", "encrypt", "(Lio/ktor/network/tls/TLSRecord;)Lio/ktor/network/tls/TLSRecord;", "decrypt", "Lio/ktor/network/tls/CipherSuite;", "[B", "", "inputCounter", "J", "outputCounter", "ktor-network-tls"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class GCMCipher implements TLSCipher {
    private long inputCounter;
    private final byte[] keyMaterial;
    private long outputCounter;
    private final CipherSuite suite;

    public GCMCipher(CipherSuite suite, byte[] keyMaterial) {
        Intrinsics.checkNotNullParameter(suite, "suite");
        Intrinsics.checkNotNullParameter(keyMaterial, "keyMaterial");
        this.suite = suite;
        this.keyMaterial = keyMaterial;
    }

    @Override // io.ktor.network.tls.cipher.TLSCipher
    public TLSRecord encrypt(TLSRecord record) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(record, "record");
        CipherSuite cipherSuite = this.suite;
        byte[] bArr = this.keyMaterial;
        TLSRecordType type = record.getType();
        int remaining = (int) ByteReadPacketKt.getRemaining(record.getPacket());
        long j = this.outputCounter;
        Cipher cipherGcmEncryptCipher = GCMCipherKt.gcmEncryptCipher(cipherSuite, bArr, type, remaining, j, j);
        final long j2 = this.outputCounter;
        Source sourceCipherLoop = CipherUtilsKt.cipherLoop(record.getPacket(), cipherGcmEncryptCipher, new Function1() { // from class: io.ktor.network.tls.cipher.GCMCipher$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GCMCipher.encrypt$lambda$0(j2, (Sink) obj);
            }
        });
        this.outputCounter++;
        return new TLSRecord(record.getType(), null, sourceCipherLoop, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit encrypt$lambda$0(long j, Sink cipherLoop) {
        Intrinsics.checkNotNullParameter(cipherLoop, "$this$cipherLoop");
        cipherLoop.writeLong(j);
        return Unit.INSTANCE;
    }

    @Override // io.ktor.network.tls.cipher.TLSCipher
    public TLSRecord decrypt(TLSRecord record) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(record, "record");
        Source packet = record.getPacket();
        long remaining = ByteReadPacketKt.getRemaining(packet);
        long j = packet.readLong();
        long j2 = this.inputCounter;
        this.inputCounter = 1 + j2;
        return new TLSRecord(record.getType(), record.getVersion(), CipherUtilsKt.cipherLoop$default(packet, GCMCipherKt.gcmDecryptCipher(this.suite, this.keyMaterial, record.getType(), (int) remaining, j, j2), null, 2, null));
    }
}
