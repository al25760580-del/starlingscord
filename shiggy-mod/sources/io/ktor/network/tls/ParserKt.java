package io.ktor.network.tls;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import io.ktor.http.LinkHeader;
import io.ktor.network.tls.extensions.NamedCurve;
import io.ktor.network.tls.extensions.TLSExtension;
import io.ktor.network.tls.extensions.TLSExtensionType;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import io.ktor.utils.io.core.ByteReadPacketKt;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.math.BigInteger;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Buffer;
import kotlinx.io.Source;
import kotlinx.io.SourcesKt;

/* JADX INFO: compiled from: Parser.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0014\u0010\u0018\u001a\u00020\u0017*\u00020\u0000H\u0082@¢\u0006\u0004\b\u0018\u0010\u0003\u001a\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001a\u001a\u00020\u0012*\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0014\u0010\u001c\u001a\u00020\u0012*\u00020\u0000H\u0080@¢\u0006\u0004\b\u001c\u0010\u0003\"\u0014\u0010\u001d\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/network/tls/TLSRecord;", "readTLSRecord", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/io/Source;", "Lio/ktor/network/tls/TLSHandshake;", "readTLSHandshake", "(Lkotlinx/io/Source;)Lio/ktor/network/tls/TLSHandshake;", "Lio/ktor/network/tls/TLSServerHello;", "readTLSServerHello", "(Lkotlinx/io/Source;)Lio/ktor/network/tls/TLSServerHello;", "Lio/ktor/network/tls/extensions/NamedCurve;", "readCurveParams", "(Lkotlinx/io/Source;)Lio/ktor/network/tls/extensions/NamedCurve;", "", "Ljava/security/cert/Certificate;", "readTLSCertificate", "(Lkotlinx/io/Source;)Ljava/util/List;", "", "fieldSize", "Ljava/security/spec/ECPoint;", "readECPoint", "(Lkotlinx/io/Source;I)Ljava/security/spec/ECPoint;", "Lio/ktor/network/tls/TLSVersion;", "readTLSVersion", "(Lkotlinx/io/Source;)Lio/ktor/network/tls/TLSVersion;", "readTripleByteLength", "(Lkotlinx/io/Source;)I", "readShortCompatible", "MAX_TLS_FRAME_SIZE", "I", "ktor-network-tls"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ParserKt {
    private static final int MAX_TLS_FRAME_SIZE = 18432;

    /* JADX INFO: compiled from: Parser.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ServerKeyExchangeType.values().length];
            try {
                iArr[ServerKeyExchangeType.NamedCurve.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ServerKeyExchangeType.ExplicitPrime.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ServerKeyExchangeType.ExplicitChar.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.ktor.network.tls.ParserKt$readShortCompatible$1, reason: invalid class name */
    /* JADX INFO: compiled from: Parser.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.network.tls.ParserKt", f = "Parser.kt", i = {0, 1, 1}, l = {148, 149}, m = "readShortCompatible", n = {"$this$readShortCompatible", "$this$readShortCompatible", "first"}, s = {"L$0", "L$0", "I$0"}, v = 1)
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ParserKt.readShortCompatible(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.network.tls.ParserKt$readTLSRecord$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Parser.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.network.tls.ParserKt", f = "Parser.kt", i = {0, 1, 1, 2, 2, 2, 3, 3, 3, 3}, l = {19, 20, 22, 25}, m = "readTLSRecord", n = {"$this$readTLSRecord", "$this$readTLSRecord", LinkHeader.Parameters.Type, "$this$readTLSRecord", LinkHeader.Parameters.Type, "version", "$this$readTLSRecord", LinkHeader.Parameters.Type, "version", "length"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0"}, v = 1)
    static final class C01211 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C01211(Continuation<? super C01211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ParserKt.readTLSRecord(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.network.tls.ParserKt$readTLSVersion$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Parser.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.network.tls.ParserKt", f = "Parser.kt", i = {0}, l = {139}, m = "readTLSVersion", n = {"$this$readTLSVersion"}, s = {"L$0"}, v = 1)
    static final class C01221 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C01221(Continuation<? super C01221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ParserKt.readTLSVersion(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00da  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object readTLSRecord(ByteReadChannel byteReadChannel, Continuation<? super TLSRecord> continuation) throws Throwable {
        C01211 c01211;
        ByteReadChannel byteReadChannel2;
        TLSRecordType.Companion companion;
        TLSRecordType tLSRecordTypeByCode;
        TLSVersion tLSVersion;
        Object shortCompatible;
        TLSRecordType tLSRecordType;
        TLSVersion tLSVersion2;
        ByteReadChannel byteReadChannel3;
        int iIntValue;
        TLSRecordType tLSRecordType2;
        if (continuation instanceof C01211) {
            c01211 = (C01211) continuation;
            if ((c01211.label & Integer.MIN_VALUE) != 0) {
                c01211.label -= Integer.MIN_VALUE;
            } else {
                c01211 = new C01211(continuation);
            }
        } else {
            c01211 = new C01211(continuation);
        }
        Object tLSVersion3 = c01211.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c01211.label;
        if (i == 0) {
            ResultKt.throwOnFailure(tLSVersion3);
            TLSRecordType.Companion companion2 = TLSRecordType.INSTANCE;
            c01211.L$0 = byteReadChannel;
            c01211.L$1 = companion2;
            c01211.label = 1;
            Object obj = ByteReadChannelOperationsKt.readByte(byteReadChannel, c01211);
            if (obj != coroutine_suspended) {
                byteReadChannel2 = byteReadChannel;
                companion = companion2;
                tLSVersion3 = obj;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            companion = (TLSRecordType.Companion) c01211.L$1;
            byteReadChannel2 = (ByteReadChannel) c01211.L$0;
            ResultKt.throwOnFailure(tLSVersion3);
        } else {
            if (i == 2) {
                tLSRecordTypeByCode = (TLSRecordType) c01211.L$1;
                byteReadChannel2 = (ByteReadChannel) c01211.L$0;
                ResultKt.throwOnFailure(tLSVersion3);
                tLSVersion = (TLSVersion) tLSVersion3;
                c01211.L$0 = byteReadChannel2;
                c01211.L$1 = tLSRecordTypeByCode;
                c01211.L$2 = tLSVersion;
                c01211.label = 3;
                shortCompatible = readShortCompatible(byteReadChannel2, c01211);
                if (shortCompatible != coroutine_suspended) {
                    ByteReadChannel byteReadChannel4 = byteReadChannel2;
                    tLSRecordType = tLSRecordTypeByCode;
                    tLSVersion2 = tLSVersion;
                    tLSVersion3 = shortCompatible;
                    byteReadChannel3 = byteReadChannel4;
                    iIntValue = ((Number) tLSVersion3).intValue() & 65535;
                    if (iIntValue > MAX_TLS_FRAME_SIZE) {
                        throw new TLSException("Illegal TLS frame size: " + iIntValue, null, 2, null);
                    }
                    c01211.L$0 = SpillingKt.nullOutSpilledVariable(byteReadChannel3);
                    c01211.L$1 = tLSRecordType;
                    c01211.L$2 = tLSVersion2;
                    c01211.I$0 = iIntValue;
                    c01211.label = 4;
                    tLSVersion3 = ByteReadChannelOperationsKt.readPacket(byteReadChannel3, iIntValue, c01211);
                    if (tLSVersion3 != coroutine_suspended) {
                        tLSRecordType2 = tLSRecordType;
                    }
                }
                return coroutine_suspended;
            }
            if (i == 3) {
                tLSVersion2 = (TLSVersion) c01211.L$2;
                tLSRecordType = (TLSRecordType) c01211.L$1;
                byteReadChannel3 = (ByteReadChannel) c01211.L$0;
                ResultKt.throwOnFailure(tLSVersion3);
                iIntValue = ((Number) tLSVersion3).intValue() & 65535;
                if (iIntValue > MAX_TLS_FRAME_SIZE) {
                    throw new TLSException("Illegal TLS frame size: " + iIntValue, null, 2, null);
                }
                c01211.L$0 = SpillingKt.nullOutSpilledVariable(byteReadChannel3);
                c01211.L$1 = tLSRecordType;
                c01211.L$2 = tLSVersion2;
                c01211.I$0 = iIntValue;
                c01211.label = 4;
                tLSVersion3 = ByteReadChannelOperationsKt.readPacket(byteReadChannel3, iIntValue, c01211);
                if (tLSVersion3 != coroutine_suspended) {
                    tLSRecordType2 = tLSRecordType;
                }
                return coroutine_suspended;
            }
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = c01211.I$0;
            tLSVersion2 = (TLSVersion) c01211.L$2;
            tLSRecordType2 = (TLSRecordType) c01211.L$1;
            ResultKt.throwOnFailure(tLSVersion3);
        }
        return new TLSRecord(tLSRecordType2, tLSVersion2, (Source) tLSVersion3);
        tLSRecordTypeByCode = companion.byCode(((Number) tLSVersion3).byteValue() & UByte.MAX_VALUE);
        c01211.L$0 = byteReadChannel2;
        c01211.L$1 = tLSRecordTypeByCode;
        c01211.label = 2;
        tLSVersion3 = readTLSVersion(byteReadChannel2, c01211);
        if (tLSVersion3 != coroutine_suspended) {
            tLSVersion = (TLSVersion) tLSVersion3;
            c01211.L$0 = byteReadChannel2;
            c01211.L$1 = tLSRecordTypeByCode;
            c01211.L$2 = tLSVersion;
            c01211.label = 3;
            shortCompatible = readShortCompatible(byteReadChannel2, c01211);
            if (shortCompatible != coroutine_suspended) {
                ByteReadChannel byteReadChannel5 = byteReadChannel2;
                tLSRecordType = tLSRecordTypeByCode;
                tLSVersion2 = tLSVersion;
                tLSVersion3 = shortCompatible;
                byteReadChannel3 = byteReadChannel5;
                iIntValue = ((Number) tLSVersion3).intValue() & 65535;
                if (iIntValue > MAX_TLS_FRAME_SIZE) {
                    throw new TLSException("Illegal TLS frame size: " + iIntValue, null, 2, null);
                }
                c01211.L$0 = SpillingKt.nullOutSpilledVariable(byteReadChannel3);
                c01211.L$1 = tLSRecordType;
                c01211.L$2 = tLSVersion2;
                c01211.I$0 = iIntValue;
                c01211.label = 4;
                tLSVersion3 = ByteReadChannelOperationsKt.readPacket(byteReadChannel3, iIntValue, c01211);
                if (tLSVersion3 != coroutine_suspended) {
                    tLSRecordType2 = tLSRecordType;
                    return new TLSRecord(tLSRecordType2, tLSVersion2, (Source) tLSVersion3);
                }
            }
        }
        return coroutine_suspended;
    }

    public static final TLSHandshake readTLSHandshake(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        TLSHandshake tLSHandshake = new TLSHandshake();
        int i = source.readInt();
        tLSHandshake.setType(TLSHandshakeType.INSTANCE.byCode(i >>> 24));
        int i2 = i & ViewCompat.MEASURED_SIZE_MASK;
        Buffer buffer = new Buffer();
        BytePacketBuilderKt.writeFully$default(buffer, SourcesKt.readByteArray(source, i2), 0, 0, 6, null);
        tLSHandshake.setPacket(buffer);
        return tLSHandshake;
    }

    public static final TLSServerHello readTLSServerHello(Source source) throws TLSException, EOFException {
        Intrinsics.checkNotNullParameter(source, "<this>");
        TLSVersion tLSVersion = readTLSVersion(source);
        byte[] bArr = new byte[32];
        ByteReadPacketKt.readFully$default(source, bArr, 0, 0, 6, null);
        int i = source.readByte() & UByte.MAX_VALUE;
        if (i > 32) {
            throw new TLSException("sessionId length limit of 32 bytes exceeded: " + i + " specified", null, 2, null);
        }
        byte[] bArr2 = new byte[32];
        ByteReadPacketKt.readFully(source, bArr2, 0, i);
        short s = source.readShort();
        short s2 = (short) (source.readByte() & 255);
        if (s2 != 0) {
            throw new TLSException("Unsupported TLS compression method " + ((int) s2) + " (only null 0 compression method is supported)", null, 2, null);
        }
        if (((int) ByteReadPacketKt.getRemaining(source)) == 0) {
            return new TLSServerHello(tLSVersion, bArr, bArr2, s, s2, null, 32, null);
        }
        int i2 = source.readShort() & UShort.MAX_VALUE;
        if (((int) ByteReadPacketKt.getRemaining(source)) != i2) {
            throw new TLSException("Invalid extensions size: requested " + i2 + ", available " + ByteReadPacketKt.getRemaining(source), null, 2, null);
        }
        ArrayList arrayList = new ArrayList();
        while (ByteReadPacketKt.getRemaining(source) > 0) {
            int i3 = source.readShort() & UShort.MAX_VALUE;
            int i4 = source.readShort() & UShort.MAX_VALUE;
            TLSExtensionType tLSExtensionTypeByCode = TLSExtensionType.INSTANCE.byCode(i3);
            Buffer buffer = new Buffer();
            BytePacketBuilderKt.writeFully$default(buffer, SourcesKt.readByteArray(source, i4), 0, 0, 6, null);
            Unit unit = Unit.INSTANCE;
            arrayList.add(new TLSExtension(tLSExtensionTypeByCode, i4, buffer));
        }
        return new TLSServerHello(tLSVersion, bArr, bArr2, s, s2, arrayList);
    }

    public static final NamedCurve readCurveParams(Source source) throws TLSException {
        Intrinsics.checkNotNullParameter(source, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[ServerKeyExchangeType.INSTANCE.byCode(source.readByte() & UByte.MAX_VALUE).ordinal()];
        if (i != 1) {
            if (i == 2) {
                throw new IllegalStateException("ExplicitPrime server key exchange type is not yet supported".toString());
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("ExplicitChar server key exchange type is not yet supported".toString());
        }
        NamedCurve namedCurveFromCode = NamedCurve.INSTANCE.fromCode(source.readShort());
        if (namedCurveFromCode != null) {
            return namedCurveFromCode;
        }
        throw new TLSException("Unknown EC id", null, 2, null);
    }

    public static final List<Certificate> readTLSCertificate(Source source) throws TLSException, CertificateException, EOFException {
        Intrinsics.checkNotNullParameter(source, "<this>");
        int tripleByteLength = readTripleByteLength(source);
        ArrayList arrayList = new ArrayList();
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        Intrinsics.checkNotNull(certificateFactory);
        int i = 0;
        while (i < tripleByteLength) {
            int tripleByteLength2 = readTripleByteLength(source);
            if (tripleByteLength2 > tripleByteLength - i) {
                throw new TLSException("Certificate length is too big", null, 2, null);
            }
            if (tripleByteLength2 > ByteReadPacketKt.getRemaining(source)) {
                throw new TLSException("Certificate length is too big", null, 2, null);
            }
            byte[] bArr = new byte[tripleByteLength2];
            Source source2 = source;
            ByteReadPacketKt.readFully$default(source2, bArr, 0, 0, 6, null);
            i += tripleByteLength2 + 3;
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArr)));
            source = source2;
        }
        return arrayList;
    }

    public static final ECPoint readECPoint(Source source, int i) throws TLSException {
        Intrinsics.checkNotNullParameter(source, "<this>");
        int i2 = source.readByte() & UByte.MAX_VALUE;
        if (source.readByte() != 4) {
            throw new TLSException("Point should be uncompressed", null, 2, null);
        }
        int i3 = (i2 - 1) / 2;
        if (((i + 7) >>> 3) != i3) {
            throw new TLSException("Invalid point component length", null, 2, null);
        }
        return new ECPoint(new BigInteger(1, SourcesKt.readByteArray(source, i3)), new BigInteger(1, SourcesKt.readByteArray(source, i3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object readTLSVersion(ByteReadChannel byteReadChannel, Continuation<? super TLSVersion> continuation) throws Throwable {
        C01221 c01221;
        TLSVersion.Companion companion;
        if (continuation instanceof C01221) {
            c01221 = (C01221) continuation;
            if ((c01221.label & Integer.MIN_VALUE) != 0) {
                c01221.label -= Integer.MIN_VALUE;
            } else {
                c01221 = new C01221(continuation);
            }
        } else {
            c01221 = new C01221(continuation);
        }
        Object obj = c01221.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c01221.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TLSVersion.Companion companion2 = TLSVersion.INSTANCE;
            c01221.L$0 = SpillingKt.nullOutSpilledVariable(byteReadChannel);
            c01221.L$1 = companion2;
            c01221.label = 1;
            Object shortCompatible = readShortCompatible(byteReadChannel, c01221);
            if (shortCompatible == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = shortCompatible;
            companion = companion2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            companion = (TLSVersion.Companion) c01221.L$1;
            ResultKt.throwOnFailure(obj);
        }
        return companion.byCode(((Number) obj).intValue() & 65535);
    }

    private static final TLSVersion readTLSVersion(Source source) {
        return TLSVersion.INSTANCE.byCode(source.readShort() & UShort.MAX_VALUE);
    }

    public static final int readTripleByteLength(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return (source.readShort() & UShort.MAX_VALUE) | ((source.readByte() & UByte.MAX_VALUE) << 16);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object readShortCompatible(ByteReadChannel byteReadChannel, Continuation<? super Integer> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        int i;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            anonymousClass1.L$0 = byteReadChannel;
            anonymousClass1.label = 1;
            obj = ByteReadChannelOperationsKt.readByte(byteReadChannel, anonymousClass1);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            byteReadChannel = (ByteReadChannel) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = anonymousClass1.I$0;
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxInt((i << 8) + (((Number) obj).byteValue() & UByte.MAX_VALUE));
        int iByteValue = ((Number) obj).byteValue() & UByte.MAX_VALUE;
        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(byteReadChannel);
        anonymousClass1.I$0 = iByteValue;
        anonymousClass1.label = 2;
        Object obj2 = ByteReadChannelOperationsKt.readByte(byteReadChannel, anonymousClass1);
        if (obj2 != coroutine_suspended) {
            obj = obj2;
            i = iByteValue;
            return Boxing.boxInt((i << 8) + (((Number) obj).byteValue() & UByte.MAX_VALUE));
        }
        return coroutine_suspended;
    }
}
