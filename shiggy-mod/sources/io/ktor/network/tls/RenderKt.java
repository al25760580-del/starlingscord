package io.ktor.network.tls;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.http.ContentDisposition;
import io.ktor.http.LinkHeader;
import io.ktor.network.tls.extensions.HashAndSign;
import io.ktor.network.tls.extensions.NamedCurve;
import io.ktor.network.tls.extensions.NamedCurvesKt;
import io.ktor.network.tls.extensions.PointFormat;
import io.ktor.network.tls.extensions.PointFormatKt;
import io.ktor.network.tls.extensions.SignatureAlgorithmKt;
import io.ktor.network.tls.extensions.TLSExtensionType;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import io.ktor.utils.io.core.ByteReadPacketKt;
import io.ktor.utils.io.core.StringsKt;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Buffer;
import kotlinx.io.Sink;
import kotlinx.io.Source;

/* JADX INFO: compiled from: Render.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\u000b\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aE\u0010\u0017\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a!\u0010\u001c\u001a\u00020\u0003*\u00020\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a+\u0010\"\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020!H\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b(\u0010)\u001a)\u0010+\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b+\u0010,\u001a\u001b\u0010.\u001a\u00020\u0003*\u00020\u00062\u0006\u0010-\u001a\u00020\u001fH\u0000¢\u0006\u0004\b.\u0010/\u001a#\u00103\u001a\u00020\u0003*\u00020\u00062\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\tH\u0000¢\u0006\u0004\b3\u00104\u001a\u001f\u00107\u001a\u00020'2\u000e\b\u0002\u00106\u001a\b\u0012\u0004\u0012\u0002050\u000fH\u0002¢\u0006\u0004\b7\u00108\u001a\u0017\u0010:\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015H\u0002¢\u0006\u0004\b:\u0010;\u001a\u001f\u0010>\u001a\u00020'2\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u000fH\u0002¢\u0006\u0004\b>\u00108\u001a\u001f\u0010A\u001a\u00020'2\u000e\b\u0002\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u000fH\u0002¢\u0006\u0004\bA\u00108\u001a#\u0010C\u001a\u00020\u0003*\u00020\u00062\u0006\u0010B\u001a\u00020\u00122\u0006\u00102\u001a\u00020\tH\u0002¢\u0006\u0004\bC\u0010D\u001a\u001b\u0010F\u001a\u00020\u0003*\u00020\u00062\u0006\u0010E\u001a\u00020\tH\u0002¢\u0006\u0004\bF\u0010G\"\u0014\u0010H\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u0010I\"\u0014\u0010J\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bJ\u0010I¨\u0006K"}, d2 = {"Lio/ktor/utils/io/ByteWriteChannel;", "Lio/ktor/network/tls/TLSRecord;", "record", "", "writeRecord", "(Lio/ktor/utils/io/ByteWriteChannel;Lio/ktor/network/tls/TLSRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/io/Sink;", "Lio/ktor/network/tls/TLSHandshakeType;", LinkHeader.Parameters.Type, "", "length", "writeTLSHandshakeType", "(Lkotlinx/io/Sink;Lio/ktor/network/tls/TLSHandshakeType;I)V", "Lio/ktor/network/tls/TLSVersion;", "version", "", "Lio/ktor/network/tls/CipherSuite;", "suites", "", "random", "sessionId", "", "serverName", "writeTLSClientHello", "(Lkotlinx/io/Sink;Lio/ktor/network/tls/TLSVersion;Ljava/util/List;[B[BLjava/lang/String;)V", "", "Ljava/security/cert/X509Certificate;", "certificates", "writeTLSCertificates", "(Lkotlinx/io/Sink;[Ljava/security/cert/X509Certificate;)V", "preSecret", "Ljava/security/PublicKey;", "publicKey", "Ljava/security/SecureRandom;", "writeEncryptedPreMasterSecret", "(Lkotlinx/io/Sink;[BLjava/security/PublicKey;Ljava/security/SecureRandom;)V", "digest", "Ljavax/crypto/SecretKey;", "secretKey", "Lkotlinx/io/Source;", "finished", "([BLjavax/crypto/SecretKey;)Lkotlinx/io/Source;", "handshakeHash", "serverFinished", "([BLjavax/crypto/SecretKey;I)[B", "key", "writePublicKeyUncompressed", "(Lkotlinx/io/Sink;Ljava/security/PublicKey;)V", "Ljava/security/spec/ECPoint;", "point", "fieldSize", "writeECPoint", "(Lkotlinx/io/Sink;Ljava/security/spec/ECPoint;I)V", "Lio/ktor/network/tls/extensions/HashAndSign;", "algorithms", "buildSignatureAlgorithmsExtension", "(Ljava/util/List;)Lkotlinx/io/Source;", ContentDisposition.Parameters.Name, "buildServerNameExtension", "(Ljava/lang/String;)Lkotlinx/io/Source;", "Lio/ktor/network/tls/extensions/NamedCurve;", "curves", "buildECCurvesExtension", "Lio/ktor/network/tls/extensions/PointFormat;", "formats", "buildECPointFormatExtension", "src", "writeAligned", "(Lkotlinx/io/Sink;[BI)V", "value", "writeTripleByteLength", "(Lkotlinx/io/Sink;I)V", "MAX_SERVER_NAME_LENGTH", "I", "MAX_CURVES_QUANTITY", "ktor-network-tls"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class RenderKt {
    private static final int MAX_CURVES_QUANTITY = 16382;
    private static final int MAX_SERVER_NAME_LENGTH = 32762;

    /* JADX INFO: renamed from: io.ktor.network.tls.RenderKt$writeRecord$1, reason: invalid class name */
    /* JADX INFO: compiled from: Render.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.network.tls.RenderKt", f = "Render.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5}, l = {18, 19, 20, 21, 22, 23}, m = "writeRecord", n = {"$this$writeRecord", "record", "$this$writeRecord_u24lambda_u240", "$i$a$-with-RenderKt$writeRecord$2", "$this$writeRecord", "record", "$this$writeRecord_u24lambda_u240", "$i$a$-with-RenderKt$writeRecord$2", "$this$writeRecord", "record", "$this$writeRecord_u24lambda_u240", "$i$a$-with-RenderKt$writeRecord$2", "$this$writeRecord", "record", "$this$writeRecord_u24lambda_u240", "$i$a$-with-RenderKt$writeRecord$2", "$this$writeRecord", "record", "$this$writeRecord_u24lambda_u240", "$i$a$-with-RenderKt$writeRecord$2", "$this$writeRecord", "record", "$this$writeRecord_u24lambda_u240", "$i$a$-with-RenderKt$writeRecord$2"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0"}, v = 1)
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RenderKt.writeRecord(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:29:0x0108 A[PHI: r2 r3 r6 r7
      0x0108: PHI (r2v11 io.ktor.network.tls.TLSRecord) = (r2v8 io.ktor.network.tls.TLSRecord), (r2v13 io.ktor.network.tls.TLSRecord) binds: [B:27:0x0105, B:15:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r3v12 io.ktor.utils.io.ByteWriteChannel) = (r3v9 io.ktor.utils.io.ByteWriteChannel), (r3v14 io.ktor.utils.io.ByteWriteChannel) binds: [B:27:0x0105, B:15:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r6v7 int) = (r6v5 int), (r6v8 int) binds: [B:27:0x0105, B:15:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r7v7 io.ktor.network.tls.TLSRecord) = (r7v4 io.ktor.network.tls.TLSRecord), (r7v9 io.ktor.network.tls.TLSRecord) binds: [B:27:0x0105, B:15:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0128 A[PHI: r2 r3 r6 r7
      0x0128: PHI (r2v14 io.ktor.network.tls.TLSRecord) = (r2v11 io.ktor.network.tls.TLSRecord), (r2v16 io.ktor.network.tls.TLSRecord) binds: [B:30:0x0125, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r3v15 io.ktor.utils.io.ByteWriteChannel) = (r3v12 io.ktor.utils.io.ByteWriteChannel), (r3v17 io.ktor.utils.io.ByteWriteChannel) binds: [B:30:0x0125, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r6v9 int) = (r6v7 int), (r6v10 int) binds: [B:30:0x0125, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r7v10 io.ktor.network.tls.TLSRecord) = (r7v7 io.ktor.network.tls.TLSRecord), (r7v12 io.ktor.network.tls.TLSRecord) binds: [B:30:0x0125, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0146 A[PHI: r2 r3 r6 r7
      0x0146: PHI (r2v17 io.ktor.network.tls.TLSRecord) = (r2v14 io.ktor.network.tls.TLSRecord), (r2v19 io.ktor.network.tls.TLSRecord) binds: [B:33:0x0143, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x0146: PHI (r3v18 io.ktor.utils.io.ByteWriteChannel) = (r3v15 io.ktor.utils.io.ByteWriteChannel), (r3v20 io.ktor.utils.io.ByteWriteChannel) binds: [B:33:0x0143, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x0146: PHI (r6v11 int) = (r6v9 int), (r6v14 int) binds: [B:33:0x0143, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x0146: PHI (r7v13 io.ktor.network.tls.TLSRecord) = (r7v10 io.ktor.network.tls.TLSRecord), (r7v16 io.ktor.network.tls.TLSRecord) binds: [B:33:0x0143, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0161, code lost:
    
        if (r3.flush(r0) == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object writeRecord(io.ktor.utils.io.ByteWriteChannel r6, io.ktor.network.tls.TLSRecord r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.tls.RenderKt.writeRecord(io.ktor.utils.io.ByteWriteChannel, io.ktor.network.tls.TLSRecord, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void writeTLSHandshakeType(Sink sink, TLSHandshakeType type, int i) throws TLSException {
        Intrinsics.checkNotNullParameter(sink, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        if (i > 16777215) {
            throw new TLSException("TLS handshake size limit exceeded: " + i, null, 2, null);
        }
        sink.writeInt((type.getCode() << 24) | i);
    }

    public static /* synthetic */ void writeTLSClientHello$default(Sink sink, TLSVersion tLSVersion, List list, byte[] bArr, byte[] bArr2, String str, int i, Object obj) throws TLSException {
        if ((i & 16) != 0) {
            str = null;
        }
        writeTLSClientHello(sink, tLSVersion, list, bArr, bArr2, str);
    }

    public static final void writeTLSClientHello(Sink sink, TLSVersion version, List<CipherSuite> suites, byte[] random, byte[] sessionId, String str) throws TLSException {
        Intrinsics.checkNotNullParameter(sink, "<this>");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(suites, "suites");
        Intrinsics.checkNotNullParameter(random, "random");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        sink.writeShort((short) version.getCode());
        BytePacketBuilderKt.writeFully$default(sink, random, 0, 0, 6, null);
        int length = sessionId.length;
        if (length < 0 || length > 255 || length > sessionId.length) {
            throw new TLSException("Illegal sessionIdLength", null, 2, null);
        }
        sink.writeByte((byte) length);
        int remaining = 0;
        BytePacketBuilderKt.writeFully(sink, sessionId, 0, length);
        sink.writeShort((short) (suites.size() * 2));
        Iterator<CipherSuite> it = suites.iterator();
        while (it.hasNext()) {
            sink.writeShort(it.next().getCode());
        }
        sink.writeByte((byte) 1);
        sink.writeByte((byte) 0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        arrayList2.add(buildSignatureAlgorithmsExtension$default(null, 1, null));
        arrayList2.add(buildECCurvesExtension$default(null, 1, null));
        arrayList2.add(buildECPointFormatExtension$default(null, 1, null));
        if (str != null) {
            arrayList2.add(buildServerNameExtension(str));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            remaining += (int) ByteReadPacketKt.getRemaining((Source) it2.next());
        }
        sink.writeShort((short) remaining);
        Iterator it3 = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it3, "iterator(...)");
        while (it3.hasNext()) {
            Object next = it3.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            BytePacketBuilderKt.writePacket(sink, (Source) next);
        }
    }

    public static final void writeEncryptedPreMasterSecret(Sink sink, byte[] preSecret, PublicKey publicKey, SecureRandom random) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, TLSException, InvalidKeyException {
        Intrinsics.checkNotNullParameter(sink, "<this>");
        Intrinsics.checkNotNullParameter(preSecret, "preSecret");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(random, "random");
        if (preSecret.length != 48) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        Intrinsics.checkNotNull(cipher);
        cipher.init(1, publicKey, random);
        byte[] bArrDoFinal = cipher.doFinal(preSecret);
        if (bArrDoFinal.length > 65535) {
            throw new TLSException("Encrypted premaster secret is too long", null, 2, null);
        }
        sink.writeShort((short) bArrDoFinal.length);
        Intrinsics.checkNotNull(bArrDoFinal);
        BytePacketBuilderKt.writeFully$default(sink, bArrDoFinal, 0, 0, 6, null);
    }

    public static /* synthetic */ byte[] serverFinished$default(byte[] bArr, SecretKey secretKey, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 12;
        }
        return serverFinished(bArr, secretKey, i);
    }

    public static final byte[] serverFinished(byte[] handshakeHash, SecretKey secretKey, int i) {
        Intrinsics.checkNotNullParameter(handshakeHash, "handshakeHash");
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        return HashesKt.PRF(secretKey, KeysKt.getSERVER_FINISHED_LABEL(), handshakeHash, i);
    }

    public static final void writePublicKeyUncompressed(Sink sink, PublicKey key) throws TLSException {
        Intrinsics.checkNotNullParameter(sink, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (key instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey) key;
            int fieldSize = eCPublicKey.getParams().getCurve().getField().getFieldSize();
            ECPoint w = eCPublicKey.getW();
            Intrinsics.checkNotNullExpressionValue(w, "getW(...)");
            writeECPoint(sink, w, fieldSize);
            return;
        }
        throw new TLSException("Unsupported public key type: " + key, null, 2, null);
    }

    static /* synthetic */ Source buildSignatureAlgorithmsExtension$default(List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = SignatureAlgorithmKt.getSupportedSignatureAlgorithms();
        }
        return buildSignatureAlgorithmsExtension(list);
    }

    static /* synthetic */ Source buildECCurvesExtension$default(List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = NamedCurvesKt.getSupportedNamedCurves();
        }
        return buildECCurvesExtension(list);
    }

    static /* synthetic */ Source buildECPointFormatExtension$default(List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = PointFormatKt.getSupportedPointFormats();
        }
        return buildECPointFormatExtension(list);
    }

    private static final void writeTripleByteLength(Sink sink, int i) {
        sink.writeByte((byte) ((i >>> 16) & 255));
        sink.writeShort((short) (i & 65535));
    }

    public static final void writeTLSCertificates(Sink sink, X509Certificate[] certificates) {
        Intrinsics.checkNotNullParameter(sink, "<this>");
        Intrinsics.checkNotNullParameter(certificates, "certificates");
        Buffer buffer = new Buffer();
        Buffer buffer2 = buffer;
        for (X509Certificate x509Certificate : certificates) {
            byte[] encoded = x509Certificate.getEncoded();
            Intrinsics.checkNotNull(encoded);
            writeTripleByteLength(buffer2, encoded.length);
            BytePacketBuilderKt.writeFully$default(buffer2, encoded, 0, 0, 6, null);
        }
        Buffer buffer3 = buffer;
        writeTripleByteLength(sink, (int) ByteReadPacketKt.getRemaining(buffer3));
        BytePacketBuilderKt.writePacket(sink, buffer3);
    }

    public static final Source finished(byte[] digest, SecretKey secretKey) {
        Intrinsics.checkNotNullParameter(digest, "digest");
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        Buffer buffer = new Buffer();
        BytePacketBuilderKt.writeFully$default(buffer, HashesKt.PRF(secretKey, KeysKt.getCLIENT_FINISHED_LABEL(), digest, 12), 0, 0, 6, null);
        return buffer;
    }

    public static final void writeECPoint(Sink sink, ECPoint point, int i) {
        Intrinsics.checkNotNullParameter(sink, "<this>");
        Intrinsics.checkNotNullParameter(point, "point");
        Buffer buffer = new Buffer();
        Buffer buffer2 = buffer;
        buffer2.writeByte((byte) 4);
        byte[] byteArray = point.getAffineX().toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        writeAligned(buffer2, byteArray, i);
        byte[] byteArray2 = point.getAffineY().toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray2, "toByteArray(...)");
        writeAligned(buffer2, byteArray2, i);
        Buffer buffer3 = buffer;
        sink.writeByte((byte) ByteReadPacketKt.getRemaining(buffer3));
        BytePacketBuilderKt.writePacket(sink, buffer3);
    }

    private static final Source buildSignatureAlgorithmsExtension(List<HashAndSign> list) {
        Buffer buffer = new Buffer();
        Buffer buffer2 = buffer;
        buffer2.writeShort(TLSExtensionType.SIGNATURE_ALGORITHMS.getCode());
        int size = list.size() * 2;
        buffer2.writeShort((short) (size + 2));
        buffer2.writeShort((short) size);
        for (HashAndSign hashAndSign : list) {
            buffer2.writeByte(hashAndSign.getHash().getCode());
            buffer2.writeByte(hashAndSign.getSign().getCode());
        }
        return buffer;
    }

    private static final Source buildServerNameExtension(String str) {
        Buffer buffer = new Buffer();
        Buffer buffer2 = buffer;
        if (str.length() >= MAX_SERVER_NAME_LENGTH) {
            throw new IllegalArgumentException("Server name length limit exceeded: at most 32762 characters allowed".toString());
        }
        buffer2.writeShort(TLSExtensionType.SERVER_NAME.getCode());
        buffer2.writeShort((short) (str.length() + 5));
        buffer2.writeShort((short) (str.length() + 3));
        buffer2.writeByte((byte) 0);
        buffer2.writeShort((short) str.length());
        StringsKt.writeText$default(buffer2, str, 0, 0, (Charset) null, 14, (Object) null);
        return buffer;
    }

    private static final Source buildECCurvesExtension(List<? extends NamedCurve> list) {
        Buffer buffer = new Buffer();
        Buffer buffer2 = buffer;
        if (list.size() > MAX_CURVES_QUANTITY) {
            throw new IllegalArgumentException("Too many named curves provided: at most 16382 could be provided".toString());
        }
        buffer2.writeShort(TLSExtensionType.ELLIPTIC_CURVES.getCode());
        int size = list.size() * 2;
        buffer2.writeShort((short) (size + 2));
        buffer2.writeShort((short) size);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            buffer2.writeShort(((NamedCurve) it.next()).getCode());
        }
        return buffer;
    }

    private static final Source buildECPointFormatExtension(List<? extends PointFormat> list) {
        Buffer buffer = new Buffer();
        Buffer buffer2 = buffer;
        buffer2.writeShort(TLSExtensionType.EC_POINT_FORMAT.getCode());
        int size = list.size();
        buffer2.writeShort((short) (size + 1));
        buffer2.writeByte((byte) size);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            buffer2.writeByte(((PointFormat) it.next()).getCode());
        }
        return buffer;
    }

    private static final void writeAligned(Sink sink, byte[] bArr, int i) {
        Sink sink2;
        int i2 = (i + 7) >>> 3;
        int length = bArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            } else if (bArr[i3] != 0) {
                break;
            } else {
                i3++;
            }
        }
        int length2 = i2 - (bArr.length - i3);
        if (length2 > 0) {
            sink2 = sink;
            BytePacketBuilderKt.writeFully$default(sink2, new byte[length2], 0, 0, 6, null);
        } else {
            sink2 = sink;
        }
        BytePacketBuilderKt.writeFully(sink2, bArr, i3, bArr.length - i3);
    }
}
