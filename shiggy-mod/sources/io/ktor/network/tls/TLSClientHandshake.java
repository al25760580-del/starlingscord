package io.ktor.network.tls;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.network.tls.cipher.TLSCipher;
import io.ktor.network.tls.extensions.HashAndSign;
import io.ktor.network.tls.extensions.SignatureAlgorithm;
import io.ktor.network.tls.extensions.SignatureAlgorithmKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import io.ktor.utils.io.core.ByteReadPacketKt;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.ActorKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.io.Buffer;
import kotlinx.io.Sink;
import kotlinx.io.Source;
import kotlinx.io.SourcesKt;

/* JADX INFO: compiled from: TLSClientHandshake.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u001a\u0010\u0013J4\u0010#\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0082@¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u00020%2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b&\u0010'J2\u0010)\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020%2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0082@¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010+\u001a\u00020\u001fH\u0082@¢\u0006\u0004\b-\u0010.J \u00100\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020,H\u0082@¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b2\u0010\u0013J\u0018\u00105\u001a\u00020\u00112\u0006\u00104\u001a\u000203H\u0082@¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b7\u0010\u0013J1\u0010>\u001a\u00020\u00112\u0006\u00109\u001a\u0002082\u0017\u0010=\u001a\u0013\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00110:¢\u0006\u0002\b<H\u0082@¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010JR\u0016\u0010K\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR\u001b\u0010Q\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010N\u001a\u0004\bT\u0010UR#\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0W8\u0006¢\u0006\u0012\n\u0004\bY\u0010Z\u0012\u0004\b]\u0010^\u001a\u0004\b[\u0010\\R\"\u0010`\u001a\u00020_8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR#\u0010g\u001a\b\u0012\u0004\u0012\u00020X0f8\u0006¢\u0006\u0012\n\u0004\bg\u0010h\u0012\u0004\bk\u0010^\u001a\u0004\bi\u0010jR \u0010m\u001a\b\u0012\u0004\u0012\u00020l0W8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bm\u0010Z\u0012\u0004\bn\u0010^¨\u0006o"}, d2 = {"Lio/ktor/network/tls/TLSClientHandshake;", "Lkotlinx/coroutines/CoroutineScope;", "Lio/ktor/utils/io/ByteReadChannel;", "rawInput", "Lio/ktor/utils/io/ByteWriteChannel;", "rawOutput", "Lio/ktor/network/tls/TLSConfig;", "config", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlinx/coroutines/CompletableJob;", "closeTask", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;Lio/ktor/network/tls/TLSConfig;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CompletableJob;)V", "Lkotlinx/coroutines/Job;", "close", "()Lkotlinx/coroutines/Job;", "", "negotiate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/network/tls/TLSServerHello;", "serverHello", "verifyHello", "(Lio/ktor/network/tls/TLSServerHello;)V", "sendClientHello", "receiveServerHello", "handleCertificatesAndKeys", "Lio/ktor/network/tls/SecretExchangeType;", "exchangeType", "Ljava/security/cert/Certificate;", "serverCertificate", "Lio/ktor/network/tls/CertificateInfo;", "certificateInfo", "Lio/ktor/network/tls/EncryptionInfo;", "encryptionInfo", "handleServerDone", "(Lio/ktor/network/tls/SecretExchangeType;Ljava/security/cert/Certificate;Lio/ktor/network/tls/CertificateInfo;Lio/ktor/network/tls/EncryptionInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "generatePreSecret", "(Lio/ktor/network/tls/EncryptionInfo;)[B", "preSecret", "sendClientKeyExchange", "(Lio/ktor/network/tls/SecretExchangeType;Ljava/security/cert/Certificate;[BLio/ktor/network/tls/EncryptionInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "info", "Lio/ktor/network/tls/CertificateAndKey;", "sendClientCertificate", "(Lio/ktor/network/tls/CertificateInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "certificateAndKey", "sendClientCertificateVerify", "(Lio/ktor/network/tls/CertificateInfo;Lio/ktor/network/tls/CertificateAndKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendChangeCipherSpec", "Ljavax/crypto/spec/SecretKeySpec;", "masterKey", "sendClientFinished", "(Ljavax/crypto/spec/SecretKeySpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveServerFinished", "Lio/ktor/network/tls/TLSHandshakeType;", "handshakeType", "Lkotlin/Function1;", "Lkotlinx/io/Sink;", "Lkotlin/ExtensionFunctionType;", "block", "sendHandshakeRecord", "(Lio/ktor/network/tls/TLSHandshakeType;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/network/tls/TLSConfig;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/CompletableJob;", "Lio/ktor/network/tls/Digest;", "digest", "Lkotlinx/io/Sink;", "clientSeed", "[B", "Lio/ktor/network/tls/TLSServerHello;", "masterSecret", "Ljavax/crypto/spec/SecretKeySpec;", "keyMaterial$delegate", "Lkotlin/Lazy;", "getKeyMaterial", "()[B", "keyMaterial", "Lio/ktor/network/tls/cipher/TLSCipher;", "cipher$delegate", "getCipher", "()Lio/ktor/network/tls/cipher/TLSCipher;", "cipher", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lio/ktor/network/tls/TLSRecord;", "input", "Lkotlinx/coroutines/channels/ReceiveChannel;", "getInput", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "getInput$annotations", "()V", "", "useCipher", "Z", "getUseCipher", "()Z", "setUseCipher", "(Z)V", "Lkotlinx/coroutines/channels/SendChannel;", "output", "Lkotlinx/coroutines/channels/SendChannel;", "getOutput", "()Lkotlinx/coroutines/channels/SendChannel;", "getOutput$annotations", "Lio/ktor/network/tls/TLSHandshake;", "handshakes", "getHandshakes$annotations", "ktor-network-tls"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class TLSClientHandshake implements CoroutineScope {

    /* JADX INFO: renamed from: cipher$delegate, reason: from kotlin metadata */
    private final Lazy cipher;
    private final byte[] clientSeed;
    private final CompletableJob closeTask;
    private final TLSConfig config;
    private final CoroutineContext coroutineContext;
    private final Sink digest;
    private final ReceiveChannel<TLSHandshake> handshakes;
    private final ReceiveChannel<TLSRecord> input;

    /* JADX INFO: renamed from: keyMaterial$delegate, reason: from kotlin metadata */
    private final Lazy keyMaterial;
    private volatile SecretKeySpec masterSecret;
    private final SendChannel<TLSRecord> output;
    private volatile TLSServerHello serverHello;
    private boolean useCipher;

    /* JADX INFO: compiled from: TLSClientHandshake.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SecretExchangeType.values().length];
            try {
                iArr[SecretExchangeType.ECDHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SecretExchangeType.RSA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TLSHandshakeType.values().length];
            try {
                iArr2[TLSHandshakeType.Certificate.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TLSHandshakeType.CertificateRequest.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TLSHandshakeType.ServerKeyExchange.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TLSHandshakeType.ServerDone.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: io.ktor.network.tls.TLSClientHandshake$handleCertificatesAndKeys$1, reason: invalid class name */
    /* JADX INFO: compiled from: TLSClientHandshake.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.network.tls.TLSClientHandshake", f = "TLSClientHandshake.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {240, 307}, m = "handleCertificatesAndKeys", n = {"exchangeType", "serverCertificate", "certificateInfo", "encryptionInfo", "exchangeType", "serverCertificate", "certificateInfo", "encryptionInfo", "handshake", "packet"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 1)
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TLSClientHandshake.this.handleCertificatesAndKeys(this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.network.tls.TLSClientHandshake$handleServerDone$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TLSClientHandshake.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.network.tls.TLSClientHandshake", f = "TLSClientHandshake.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4}, l = {327, 331, 345, 347, 348}, m = "handleServerDone", n = {"exchangeType", "serverCertificate", "certificateInfo", "encryptionInfo", "it", "$i$a$-let-TLSClientHandshake$handleServerDone$chain$1", "exchangeType", "serverCertificate", "certificateInfo", "encryptionInfo", "chain", "preSecret", "exchangeType", "serverCertificate", "certificateInfo", "encryptionInfo", "chain", "preSecret", "it", "$i$a$-let-TLSClientHandshake$handleServerDone$2", "exchangeType", "serverCertificate", "certificateInfo", "encryptionInfo", "chain", "preSecret", "exchangeType", "serverCertificate", "certificateInfo", "encryptionInfo", "chain", "preSecret"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 1)
    static final class C01231 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        C01231(Continuation<? super C01231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TLSClientHandshake.this.handleServerDone(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.network.tls.TLSClientHandshake$negotiate$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TLSClientHandshake.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.network.tls.TLSClientHandshake", f = "TLSClientHandshake.kt", i = {0, 0, 1, 1, 2, 2, 3, 3}, l = {177, 178, 181, 182}, m = "negotiate", n = {"it", "$i$a$-use-TLSClientHandshake$negotiate$2", "it", "$i$a$-use-TLSClientHandshake$negotiate$2", "it", "$i$a$-use-TLSClientHandshake$negotiate$2", "it", "$i$a$-use-TLSClientHandshake$negotiate$2"}, s = {"L$1", "I$0", "L$1", "I$0", "L$1", "I$0", "L$1", "I$0"}, v = 1)
    static final class C01241 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C01241(Continuation<? super C01241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TLSClientHandshake.this.negotiate(this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.network.tls.TLSClientHandshake$receiveServerFinished$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TLSClientHandshake.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.network.tls.TLSClientHandshake", f = "TLSClientHandshake.kt", i = {}, l = {460}, m = "receiveServerFinished", n = {}, s = {}, v = 1)
    static final class C01251 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C01251(Continuation<? super C01251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TLSClientHandshake.this.receiveServerFinished(this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.network.tls.TLSClientHandshake$receiveServerHello$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TLSClientHandshake.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.network.tls.TLSClientHandshake", f = "TLSClientHandshake.kt", i = {}, l = {224}, m = "receiveServerHello", n = {}, s = {}, v = 1)
    static final class C01261 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C01261(Continuation<? super C01261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TLSClientHandshake.this.receiveServerHello(this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.network.tls.TLSClientHandshake$sendChangeCipherSpec$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TLSClientHandshake.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.network.tls.TLSClientHandshake", f = "TLSClientHandshake.kt", i = {0}, l = {444}, m = "sendChangeCipherSpec", n = {"packet"}, s = {"L$0"}, v = 1)
    static final class C01271 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C01271(Continuation<? super C01271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TLSClientHandshake.this.sendChangeCipherSpec(this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.network.tls.TLSClientHandshake$sendClientCertificate$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TLSClientHandshake.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.network.tls.TLSClientHandshake", f = "TLSClientHandshake.kt", i = {0, 0}, l = {411}, m = "sendClientCertificate", n = {"info", "chainAndKey"}, s = {"L$0", "L$1"}, v = 1)
    static final class C01281 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C01281(Continuation<? super C01281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TLSClientHandshake.this.sendClientCertificate(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.network.tls.TLSClientHandshake$sendHandshakeRecord$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TLSClientHandshake.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.network.tls.TLSClientHandshake", f = "TLSClientHandshake.kt", i = {0, 0, 0, 0, 0}, l = {494}, m = "sendHandshakeRecord", n = {"handshakeType", "block", "handshakeBody", "recordBody", "element"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 1)
    static final class C01291 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C01291(Continuation<? super C01291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TLSClientHandshake.this.sendHandshakeRecord(null, null, this);
        }
    }

    private static /* synthetic */ void getHandshakes$annotations() {
    }

    public static /* synthetic */ void getInput$annotations() {
    }

    public static /* synthetic */ void getOutput$annotations() {
    }

    public TLSClientHandshake(ByteReadChannel rawInput, final ByteWriteChannel rawOutput, TLSConfig config, CoroutineContext coroutineContext, CompletableJob closeTask) {
        Intrinsics.checkNotNullParameter(rawInput, "rawInput");
        Intrinsics.checkNotNullParameter(rawOutput, "rawOutput");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(closeTask, "closeTask");
        this.config = config;
        this.coroutineContext = coroutineContext;
        this.closeTask = closeTask;
        this.digest = UtilsKt.Digest();
        this.clientSeed = TLSClientHandshakeKt.generateClientSeed(config.getRandom());
        this.keyMaterial = LazyKt.lazy(new Function0() { // from class: io.ktor.network.tls.TLSClientHandshake$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TLSClientHandshake.keyMaterial_delegate$lambda$0(this.f$0);
            }
        });
        this.cipher = LazyKt.lazy(new Function0() { // from class: io.ktor.network.tls.TLSClientHandshake$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TLSClientHandshake.cipher_delegate$lambda$0(this.f$0);
            }
        });
        TLSClientHandshake tLSClientHandshake = this;
        this.input = ProduceKt.produce$default(tLSClientHandshake, new CoroutineName("cio-tls-parser"), 0, new TLSClientHandshake$input$1(rawInput, this, null), 2, null);
        SendChannel<TLSRecord> sendChannelActor$default = ActorKt.actor$default(tLSClientHandshake, new CoroutineName("cio-tls-encoder"), 0, null, null, new TLSClientHandshake$output$1(this, rawOutput, null), 14, null);
        sendChannelActor$default.invokeOnClose(new Function1() { // from class: io.ktor.network.tls.TLSClientHandshake$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TLSClientHandshake.output$lambda$0$0(this.f$0, rawOutput, (Throwable) obj);
            }
        });
        this.output = sendChannelActor$default;
        this.handshakes = ProduceKt.produce$default(tLSClientHandshake, new CoroutineName("cio-tls-handshake"), 0, new TLSClientHandshake$handshakes$1(this, null), 2, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public /* synthetic */ TLSClientHandshake(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, TLSConfig tLSConfig, CoroutineContext coroutineContext, CompletableJob completableJob, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteReadChannel, byteWriteChannel, tLSConfig, coroutineContext, (i & 16) != 0 ? JobKt__JobKt.Job$default((Job) null, 1, (Object) null) : completableJob);
    }

    private final byte[] getKeyMaterial() {
        return (byte[]) this.keyMaterial.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] keyMaterial_delegate$lambda$0(TLSClientHandshake tLSClientHandshake) {
        TLSServerHello tLSServerHello = tLSClientHandshake.serverHello;
        TLSServerHello tLSServerHello2 = null;
        if (tLSServerHello == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serverHello");
            tLSServerHello = null;
        }
        CipherSuite cipherSuite = tLSServerHello.getCipherSuite();
        SecretKeySpec secretKeySpec = tLSClientHandshake.masterSecret;
        if (secretKeySpec == null) {
            Intrinsics.throwUninitializedPropertyAccessException("masterSecret");
            secretKeySpec = null;
        }
        SecretKeySpec secretKeySpec2 = secretKeySpec;
        TLSServerHello tLSServerHello3 = tLSClientHandshake.serverHello;
        if (tLSServerHello3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serverHello");
        } else {
            tLSServerHello2 = tLSServerHello3;
        }
        return KeysKt.keyMaterial(secretKeySpec2, ArraysKt.plus(tLSServerHello2.getServerSeed(), tLSClientHandshake.clientSeed), cipherSuite.getKeyStrengthInBytes(), cipherSuite.getMacStrengthInBytes(), cipherSuite.getFixedIvLength());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TLSCipher getCipher() {
        return (TLSCipher) this.cipher.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TLSCipher cipher_delegate$lambda$0(TLSClientHandshake tLSClientHandshake) {
        TLSCipher.Companion companion = TLSCipher.INSTANCE;
        TLSServerHello tLSServerHello = tLSClientHandshake.serverHello;
        if (tLSServerHello == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serverHello");
            tLSServerHello = null;
        }
        return companion.fromSuite(tLSServerHello.getCipherSuite(), tLSClientHandshake.getKeyMaterial());
    }

    public final ReceiveChannel<TLSRecord> getInput() {
        return this.input;
    }

    public final boolean getUseCipher() {
        return this.useCipher;
    }

    public final void setUseCipher(boolean z) {
        this.useCipher = z;
    }

    public final SendChannel<TLSRecord> getOutput() {
        return this.output;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit output$lambda$0$0(TLSClientHandshake tLSClientHandshake, ByteWriteChannel byteWriteChannel, Throwable th) {
        BuildersKt__Builders_commonKt.launch$default(tLSClientHandshake, new CoroutineName("cio-tls-closer"), null, new TLSClientHandshake$output$2$1$1(tLSClientHandshake, byteWriteChannel, null), 2, null);
        return Unit.INSTANCE;
    }

    public final Job close() {
        ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) this.input, (CancellationException) null, 1, (Object) null);
        SendChannel.DefaultImpls.close$default(this.output, null, 1, null);
        return this.closeTask;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c5 A[Catch: all -> 0x007e, TryCatch #3 {all -> 0x007e, blocks: (B:27:0x006b, B:43:0x00bd, B:45:0x00c5, B:46:0x00cb, B:30:0x0079), top: B:69:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object negotiate(Continuation<? super Unit> continuation) throws Exception {
        C01241 c01241;
        Digest digest;
        Digest digestM380boximpl;
        Sink sink;
        int i;
        Digest digest2;
        TLSClientHandshake tLSClientHandshake;
        TLSServerHello tLSServerHello;
        Sink sink2;
        Digest digest3;
        if (continuation instanceof C01241) {
            c01241 = (C01241) continuation;
            if ((c01241.label & Integer.MIN_VALUE) != 0) {
                c01241.label -= Integer.MIN_VALUE;
            } else {
                c01241 = new C01241(continuation);
            }
        } else {
            c01241 = new C01241(continuation);
        }
        Object obj = c01241.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c01241.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                digestM380boximpl = Digest.m380boximpl(this.digest);
                try {
                    Sink sinkM389unboximpl = digestM380boximpl.m389unboximpl();
                    c01241.L$0 = digestM380boximpl;
                    c01241.L$1 = SpillingKt.nullOutSpilledVariable(sinkM389unboximpl);
                    c01241.I$0 = 0;
                    c01241.label = 1;
                    if (sendClientHello(c01241) != coroutine_suspended) {
                        sink = sinkM389unboximpl;
                        i = 0;
                    }
                    return coroutine_suspended;
                } catch (Throwable th) {
                    digest = digestM380boximpl;
                    th = th;
                    throw th;
                }
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    i = c01241.I$0;
                    tLSClientHandshake = (TLSClientHandshake) c01241.L$2;
                    sink = (Sink) c01241.L$1;
                    digest2 = (Digest) c01241.L$0;
                    ResultKt.throwOnFailure(obj);
                    tLSClientHandshake.serverHello = (TLSServerHello) obj;
                    tLSServerHello = this.serverHello;
                    if (tLSServerHello == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("serverHello");
                        tLSServerHello = null;
                    }
                    verifyHello(tLSServerHello);
                    c01241.L$0 = digest2;
                    c01241.L$1 = SpillingKt.nullOutSpilledVariable(sink);
                    c01241.L$2 = null;
                    c01241.I$0 = i;
                    c01241.label = 3;
                    if (handleCertificatesAndKeys(c01241) != coroutine_suspended) {
                        sink2 = sink;
                        digest3 = digest2;
                        c01241.L$0 = digest3;
                        c01241.L$1 = SpillingKt.nullOutSpilledVariable(sink2);
                        c01241.I$0 = i;
                        c01241.label = 4;
                        if (receiveServerFinished(c01241) != coroutine_suspended) {
                            digest = digest3;
                            Unit unit = Unit.INSTANCE;
                            AutoCloseableKt.closeFinally(digest, null);
                            return Unit.INSTANCE;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = c01241.I$0;
                    digest = (Digest) c01241.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        Unit unit2 = Unit.INSTANCE;
                        AutoCloseableKt.closeFinally(digest, null);
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            AutoCloseableKt.closeFinally(digest, th);
                            throw th3;
                        }
                    }
                }
                i = c01241.I$0;
                sink2 = (Sink) c01241.L$1;
                digest3 = (Digest) c01241.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    c01241.L$0 = digest3;
                    c01241.L$1 = SpillingKt.nullOutSpilledVariable(sink2);
                    c01241.I$0 = i;
                    c01241.label = 4;
                    if (receiveServerFinished(c01241) != coroutine_suspended) {
                        digest = digest3;
                        Unit unit3 = Unit.INSTANCE;
                        AutoCloseableKt.closeFinally(digest, null);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                } catch (Throwable th4) {
                    th = th4;
                    digest = digest3;
                    throw th;
                }
            }
            i = c01241.I$0;
            sink = (Sink) c01241.L$1;
            Digest digest4 = (Digest) c01241.L$0;
            ResultKt.throwOnFailure(obj);
            digestM380boximpl = digest4;
            c01241.L$0 = digestM380boximpl;
            c01241.L$1 = SpillingKt.nullOutSpilledVariable(sink);
            c01241.L$2 = this;
            c01241.I$0 = i;
            c01241.label = 2;
            Object objReceiveServerHello = receiveServerHello(c01241);
            if (objReceiveServerHello != coroutine_suspended) {
                digest2 = digestM380boximpl;
                obj = objReceiveServerHello;
                tLSClientHandshake = this;
                tLSClientHandshake.serverHello = (TLSServerHello) obj;
                tLSServerHello = this.serverHello;
                if (tLSServerHello == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("serverHello");
                    tLSServerHello = null;
                }
                verifyHello(tLSServerHello);
                c01241.L$0 = digest2;
                c01241.L$1 = SpillingKt.nullOutSpilledVariable(sink);
                c01241.L$2 = null;
                c01241.I$0 = i;
                c01241.label = 3;
                if (handleCertificatesAndKeys(c01241) != coroutine_suspended) {
                    sink2 = sink;
                    digest3 = digest2;
                    c01241.L$0 = digest3;
                    c01241.L$1 = SpillingKt.nullOutSpilledVariable(sink2);
                    c01241.I$0 = i;
                    c01241.label = 4;
                    if (receiveServerFinished(c01241) != coroutine_suspended) {
                        digest = digest3;
                        Unit unit4 = Unit.INSTANCE;
                        AutoCloseableKt.closeFinally(digest, null);
                        return Unit.INSTANCE;
                    }
                }
            }
            return coroutine_suspended;
        } catch (Throwable th5) {
            th = th5;
            digest = digest2;
        }
    }

    private final void verifyHello(TLSServerHello serverHello) throws TLSException {
        CipherSuite cipherSuite = serverHello.getCipherSuite();
        if (!this.config.getCipherSuites().contains(cipherSuite)) {
            throw new IllegalStateException(("Unsupported cipher suite " + cipherSuite.getName() + " in SERVER_HELLO").toString());
        }
        List<HashAndSign> supportedSignatureAlgorithms = SignatureAlgorithmKt.getSupportedSignatureAlgorithms();
        ArrayList arrayList = new ArrayList();
        for (Object obj : supportedSignatureAlgorithms) {
            HashAndSign hashAndSign = (HashAndSign) obj;
            if (hashAndSign.getHash() == cipherSuite.getHash() && hashAndSign.getSign() == cipherSuite.getSignatureAlgorithm()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            throw new TLSException("No appropriate hash algorithm for suite: " + cipherSuite, null, 2, null);
        }
        List<HashAndSign> hashAndSignAlgorithms = serverHello.getHashAndSignAlgorithms();
        if (hashAndSignAlgorithms.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = arrayList2;
        if (!(arrayList3 instanceof Collection) || !arrayList3.isEmpty()) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                if (hashAndSignAlgorithms.contains((HashAndSign) it.next())) {
                    return;
                }
            }
        }
        throw new TLSException("No sign algorithms in common. \nServer candidates: " + hashAndSignAlgorithms + " \nClient candidates: " + arrayList2, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendClientHello(Continuation<? super Unit> continuation) throws Throwable {
        Object objSendHandshakeRecord = sendHandshakeRecord(TLSHandshakeType.ClientHello, new Function1() { // from class: io.ktor.network.tls.TLSClientHandshake$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TLSClientHandshake.sendClientHello$lambda$0(this.f$0, (Sink) obj);
            }
        }, continuation);
        return objSendHandshakeRecord == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSendHandshakeRecord : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendClientHello$lambda$0(TLSClientHandshake tLSClientHandshake, Sink sendHandshakeRecord) throws TLSException {
        Intrinsics.checkNotNullParameter(sendHandshakeRecord, "$this$sendHandshakeRecord");
        RenderKt.writeTLSClientHello(sendHandshakeRecord, TLSVersion.TLS12, tLSClientHandshake.config.getCipherSuites(), tLSClientHandshake.clientSeed, new byte[32], tLSClientHandshake.config.getServerName());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object receiveServerHello(Continuation<? super TLSServerHello> continuation) throws Throwable {
        C01261 c01261;
        if (continuation instanceof C01261) {
            c01261 = (C01261) continuation;
            if ((c01261.label & Integer.MIN_VALUE) != 0) {
                c01261.label -= Integer.MIN_VALUE;
            } else {
                c01261 = new C01261(continuation);
            }
        } else {
            c01261 = new C01261(continuation);
        }
        Object objReceive = c01261.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c01261.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objReceive);
            ReceiveChannel<TLSHandshake> receiveChannel = this.handshakes;
            c01261.label = 1;
            objReceive = receiveChannel.receive(c01261);
            if (objReceive == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objReceive);
        }
        TLSHandshake tLSHandshake = (TLSHandshake) objReceive;
        if (tLSHandshake.getType() != TLSHandshakeType.ServerHello) {
            throw new IllegalStateException(("Expected TLS handshake ServerHello but got " + tLSHandshake.getType()).toString());
        }
        return ParserKt.readTLSServerHello(tLSHandshake.getPacket());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:105:0x0289 A[EDGE_INSN: B:105:0x0289->B:89:0x0289 BREAK  A[LOOP:1: B:67:0x0233->B:87:0x0284], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x025f  */
    /* JADX WARN: Code duplicated, block: B:79:0x026b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code duplicated, block: B:83:0x027c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0281 A[LOOP:2: B:75:0x0259->B:86:0x0281, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [T, java.security.cert.X509Certificate] */
    /* JADX WARN: Type inference failed for: r21v0, types: [io.ktor.network.tls.TLSClientHandshake] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r7v12, types: [io.ktor.network.tls.TLSServerHello] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0095 -> B:23:0x0098). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at java.base/java.util.HashMap.putVal(HashMap.java:659)
        	at java.base/java.util.HashMap.put(HashMap.java:607)
        	at java.base/java.util.HashSet.add(HashSet.java:220)
        	at jadx.core.utils.BlockUtils.addPredecessors(BlockUtils.java:703)
        	at jadx.core.utils.BlockUtils.addPredecessors(BlockUtils.java:706)
        */
    public final java.lang.Object handleCertificatesAndKeys(kotlin.coroutines.Continuation<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instruction units count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.tls.TLSClientHandshake.handleCertificatesAndKeys(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x0144  */
    /* JADX WARN: Code duplicated, block: B:37:0x0150  */
    /* JADX WARN: Code duplicated, block: B:40:0x016b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0188  */
    /* JADX WARN: Code duplicated, block: B:50:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:53:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:54:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ba, code lost:
    
        if (sendClientCertificateVerify(r11, r3, r5) == r6) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0229, code lost:
    
        if (sendClientFinished(r12, r5) == r6) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleServerDone(io.ktor.network.tls.SecretExchangeType r23, java.security.cert.Certificate r24, io.ktor.network.tls.CertificateInfo r25, io.ktor.network.tls.EncryptionInfo r26, kotlin.coroutines.Continuation<? super kotlin.Unit> r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.tls.TLSClientHandshake.handleServerDone(io.ktor.network.tls.SecretExchangeType, java.security.cert.Certificate, io.ktor.network.tls.CertificateInfo, io.ktor.network.tls.EncryptionInfo, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final byte[] generatePreSecret(EncryptionInfo encryptionInfo) throws NoSuchAlgorithmException, TLSException, InvalidKeyException {
        TLSServerHello tLSServerHello = this.serverHello;
        if (tLSServerHello == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serverHello");
            tLSServerHello = null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[tLSServerHello.getCipherSuite().getExchangeType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            byte[] bArr = new byte[48];
            this.config.getRandom().nextBytes(bArr);
            bArr[0] = 3;
            bArr[1] = 3;
            return bArr;
        }
        KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
        Intrinsics.checkNotNull(keyAgreement);
        if (encryptionInfo == null) {
            throw new TLSException("ECDHE_ECDSA: Encryption info should be provided", null, 2, null);
        }
        keyAgreement.init(encryptionInfo.getClientPrivate());
        keyAgreement.doPhase(encryptionInfo.getServerPublic(), true);
        byte[] bArrGenerateSecret = keyAgreement.generateSecret();
        Intrinsics.checkNotNull(bArrGenerateSecret);
        return bArrGenerateSecret;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendClientKeyExchange(SecretExchangeType secretExchangeType, Certificate certificate, byte[] bArr, EncryptionInfo encryptionInfo, Continuation<? super Unit> continuation) throws Throwable {
        final Buffer buffer;
        int i = WhenMappings.$EnumSwitchMapping$0[secretExchangeType.ordinal()];
        if (i == 1) {
            Buffer buffer2 = new Buffer();
            Buffer buffer3 = buffer2;
            if (encryptionInfo == null) {
                throw new TLSException("ECDHE: Encryption info should be provided", null, 2, null);
            }
            RenderKt.writePublicKeyUncompressed(buffer3, encryptionInfo.getClientPublic());
            buffer = buffer2;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Buffer buffer4 = new Buffer();
            PublicKey publicKey = certificate.getPublicKey();
            Intrinsics.checkNotNullExpressionValue(publicKey, "getPublicKey(...)");
            RenderKt.writeEncryptedPreMasterSecret(buffer4, bArr, publicKey, this.config.getRandom());
            buffer = buffer4;
        }
        Object objSendHandshakeRecord = sendHandshakeRecord(TLSHandshakeType.ClientKeyExchange, new Function1() { // from class: io.ktor.network.tls.TLSClientHandshake$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TLSClientHandshake.sendClientKeyExchange$lambda$2(buffer, (Sink) obj);
            }
        }, continuation);
        return objSendHandshakeRecord == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSendHandshakeRecord : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendClientKeyExchange$lambda$2(Source source, Sink sendHandshakeRecord) {
        Intrinsics.checkNotNullParameter(sendHandshakeRecord, "$this$sendHandshakeRecord");
        BytePacketBuilderKt.writePacket(sendHandshakeRecord, source);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:53:0x0111  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object sendClientCertificate(CertificateInfo certificateInfo, Continuation<? super CertificateAndKey> continuation) throws Throwable {
        C01281 c01281;
        Object next;
        boolean z;
        boolean zContains;
        boolean z2;
        boolean z3;
        if (continuation instanceof C01281) {
            c01281 = (C01281) continuation;
            if ((c01281.label & Integer.MIN_VALUE) != 0) {
                c01281.label -= Integer.MIN_VALUE;
            } else {
                c01281 = new C01281(continuation);
            }
        } else {
            c01281 = new C01281(continuation);
        }
        Object obj = c01281.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c01281.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CertificateAndKey certificateAndKey = (CertificateAndKey) c01281.L$1;
            ResultKt.throwOnFailure(obj);
            return certificateAndKey;
        }
        ResultKt.throwOnFailure(obj);
        Iterator<T> it = this.config.getCertificates().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            CertificateAndKey certificateAndKey2 = (CertificateAndKey) next;
            X509Certificate x509Certificate = (X509Certificate) ArraysKt.first(certificateAndKey2.getCertificateChain());
            String algorithm = x509Certificate.getPublicKey().getAlgorithm();
            z = false;
            if (Intrinsics.areEqual(algorithm, "RSA")) {
                zContains = ArraysKt.contains(certificateInfo.getTypes(), (byte) 1);
            } else {
                zContains = Intrinsics.areEqual(algorithm, "DSS") ? ArraysKt.contains(certificateInfo.getTypes(), (byte) 2) : false;
            }
            if (zContains) {
                HashAndSign[] hashAndSign = certificateInfo.getHashAndSign();
                int length = hashAndSign.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = true;
                        break;
                    }
                    if (StringsKt.equals(hashAndSign[i2].getName(), x509Certificate.getSigAlgName(), true)) {
                        z2 = false;
                        break;
                    }
                    i2++;
                }
                if (!z2) {
                    if (certificateInfo.getAuthorities().isEmpty()) {
                        z = true;
                    } else {
                        X509Certificate[] certificateChain = certificateAndKey2.getCertificateChain();
                        ArrayList arrayList = new ArrayList(certificateChain.length);
                        for (X509Certificate x509Certificate2 : certificateChain) {
                            arrayList.add(new X500Principal(x509Certificate2.getIssuerX500Principal().getName()));
                        }
                        ArrayList arrayList2 = arrayList;
                        if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                            Iterator it2 = arrayList2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z3 = false;
                                    break;
                                }
                                if (certificateInfo.getAuthorities().contains((X500Principal) it2.next())) {
                                    z3 = true;
                                    break;
                                }
                            }
                        } else {
                            z3 = false;
                            break;
                        }
                        if (z3) {
                            z = true;
                        }
                    }
                }
            }
        } while (!z);
        final CertificateAndKey certificateAndKey3 = (CertificateAndKey) next;
        TLSHandshakeType tLSHandshakeType = TLSHandshakeType.Certificate;
        Function1<? super Sink, Unit> function1 = new Function1() { // from class: io.ktor.network.tls.TLSClientHandshake$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return TLSClientHandshake.sendClientCertificate$lambda$1(certificateAndKey3, (Sink) obj2);
            }
        };
        c01281.L$0 = SpillingKt.nullOutSpilledVariable(certificateInfo);
        c01281.L$1 = certificateAndKey3;
        c01281.label = 1;
        return sendHandshakeRecord(tLSHandshakeType, function1, c01281) == coroutine_suspended ? coroutine_suspended : certificateAndKey3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendClientCertificate$lambda$1(CertificateAndKey certificateAndKey, Sink sendHandshakeRecord) {
        X509Certificate[] certificateChain;
        Intrinsics.checkNotNullParameter(sendHandshakeRecord, "$this$sendHandshakeRecord");
        if (certificateAndKey == null || (certificateChain = certificateAndKey.getCertificateChain()) == null) {
            certificateChain = new X509Certificate[0];
        }
        RenderKt.writeTLSCertificates(sendHandshakeRecord, certificateChain);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendClientCertificateVerify(CertificateInfo certificateInfo, CertificateAndKey certificateAndKey, Continuation<? super Unit> continuation) throws Throwable {
        final HashAndSign hashAndSign;
        X509Certificate x509Certificate = (X509Certificate) ArraysKt.first(certificateAndKey.getCertificateChain());
        HashAndSign[] hashAndSign2 = certificateInfo.getHashAndSign();
        int length = hashAndSign2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                hashAndSign = null;
                break;
            }
            hashAndSign = hashAndSign2[i];
            if (StringsKt.equals(hashAndSign.getName(), x509Certificate.getSigAlgName(), true)) {
                break;
            }
            i++;
        }
        if (hashAndSign == null) {
            return Unit.INSTANCE;
        }
        if (hashAndSign.getSign() == SignatureAlgorithm.DSA) {
            return Unit.INSTANCE;
        }
        final Signature signature = Signature.getInstance(((X509Certificate) ArraysKt.first(certificateAndKey.getCertificateChain())).getSigAlgName());
        Intrinsics.checkNotNull(signature);
        signature.initSign(certificateAndKey.getKey());
        Object objSendHandshakeRecord = sendHandshakeRecord(TLSHandshakeType.CertificateVerify, new Function1() { // from class: io.ktor.network.tls.TLSClientHandshake$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TLSClientHandshake.sendClientCertificateVerify$lambda$1(hashAndSign, this, signature, (Sink) obj);
            }
        }, continuation);
        return objSendHandshakeRecord == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSendHandshakeRecord : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendClientCertificateVerify$lambda$1(HashAndSign hashAndSign, TLSClientHandshake tLSClientHandshake, final Signature signature, Sink sendHandshakeRecord) throws Exception {
        Intrinsics.checkNotNullParameter(sendHandshakeRecord, "$this$sendHandshakeRecord");
        sendHandshakeRecord.writeByte(hashAndSign.getHash().getCode());
        sendHandshakeRecord.writeByte(hashAndSign.getSign().getCode());
        ByteReadPacketKt.preview(tLSClientHandshake.digest, new Function1() { // from class: io.ktor.network.tls.TLSClientHandshake$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TLSClientHandshake.sendClientCertificateVerify$lambda$1$0(signature, (Source) obj);
            }
        });
        byte[] bArrSign = signature.sign();
        Intrinsics.checkNotNull(bArrSign);
        sendHandshakeRecord.writeShort((short) bArrSign.length);
        BytePacketBuilderKt.writeFully$default(sendHandshakeRecord, bArrSign, 0, 0, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendClientCertificateVerify$lambda$1$0(Signature signature, Source it) throws SignatureException {
        Intrinsics.checkNotNullParameter(it, "it");
        signature.update(SourcesKt.readByteArray(it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object sendChangeCipherSpec(Continuation<? super Unit> continuation) throws Throwable {
        C01271 c01271;
        Throwable th;
        Source source;
        if (continuation instanceof C01271) {
            c01271 = (C01271) continuation;
            if ((c01271.label & Integer.MIN_VALUE) != 0) {
                c01271.label -= Integer.MIN_VALUE;
            } else {
                c01271 = new C01271(continuation);
            }
        } else {
            c01271 = new C01271(continuation);
        }
        Object obj = c01271.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c01271.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            source = (Source) c01271.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                source.close();
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        Buffer buffer = new Buffer();
        buffer.writeByte((byte) 1);
        Buffer buffer2 = buffer;
        try {
            SendChannel<TLSRecord> sendChannel = this.output;
            TLSRecord tLSRecord = new TLSRecord(TLSRecordType.ChangeCipherSpec, null, buffer2, 2, null);
            c01271.L$0 = buffer2;
            c01271.label = 1;
            if (sendChannel.send(tLSRecord, c01271) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
            source = buffer2;
            source.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendClientFinished(SecretKeySpec secretKeySpec, Continuation<? super Unit> continuation) throws Throwable {
        Sink sink = this.digest;
        TLSServerHello tLSServerHello = this.serverHello;
        if (tLSServerHello == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serverHello");
            tLSServerHello = null;
        }
        final Source sourceFinished = RenderKt.finished(Digest.m383doHashimpl(sink, tLSServerHello.getCipherSuite().getHash().getOpenSSLName()), secretKeySpec);
        Object objSendHandshakeRecord = sendHandshakeRecord(TLSHandshakeType.Finished, new Function1() { // from class: io.ktor.network.tls.TLSClientHandshake$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TLSClientHandshake.sendClientFinished$lambda$0(sourceFinished, (Sink) obj);
            }
        }, continuation);
        return objSendHandshakeRecord == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSendHandshakeRecord : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendClientFinished$lambda$0(Source source, Sink sendHandshakeRecord) {
        Intrinsics.checkNotNullParameter(sendHandshakeRecord, "$this$sendHandshakeRecord");
        BytePacketBuilderKt.writePacket(sendHandshakeRecord, source);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object receiveServerFinished(Continuation<? super Unit> continuation) throws Throwable {
        C01251 c01251;
        if (continuation instanceof C01251) {
            c01251 = (C01251) continuation;
            if ((c01251.label & Integer.MIN_VALUE) != 0) {
                c01251.label -= Integer.MIN_VALUE;
            } else {
                c01251 = new C01251(continuation);
            }
        } else {
            c01251 = new C01251(continuation);
        }
        Object objReceive = c01251.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c01251.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objReceive);
            ReceiveChannel<TLSHandshake> receiveChannel = this.handshakes;
            c01251.label = 1;
            objReceive = receiveChannel.receive(c01251);
            if (objReceive == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objReceive);
        }
        TLSHandshake tLSHandshake = (TLSHandshake) objReceive;
        if (tLSHandshake.getType() != TLSHandshakeType.Finished) {
            throw new TLSException("Finished handshake expected, received: " + tLSHandshake, null, 2, null);
        }
        byte[] byteArray = SourcesKt.readByteArray(tLSHandshake.getPacket());
        Sink sink = this.digest;
        TLSServerHello tLSServerHello = this.serverHello;
        if (tLSServerHello == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serverHello");
            tLSServerHello = null;
        }
        byte[] bArrM383doHashimpl = Digest.m383doHashimpl(sink, tLSServerHello.getCipherSuite().getHash().getOpenSSLName());
        SecretKeySpec secretKeySpec = this.masterSecret;
        if (secretKeySpec == null) {
            Intrinsics.throwUninitializedPropertyAccessException("masterSecret");
            secretKeySpec = null;
        }
        byte[] bArrServerFinished = RenderKt.serverFinished(bArrM383doHashimpl, secretKeySpec, byteArray.length);
        if (Arrays.equals(byteArray, bArrServerFinished)) {
            return Unit.INSTANCE;
        }
        throw new TLSException(StringsKt.trimMargin$default("Handshake: ServerFinished verification failed:\n                |Expected: " + ArraysKt.joinToString$default(bArrServerFinished, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null) + "\n                |Actual: " + ArraysKt.joinToString$default(byteArray, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null) + "\n                ", null, 1, null), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object sendHandshakeRecord(TLSHandshakeType tLSHandshakeType, Function1<? super Sink, Unit> function1, Continuation<? super Unit> continuation) throws Throwable {
        C01291 c01291;
        Throwable th;
        TLSRecord tLSRecord;
        if (continuation instanceof C01291) {
            c01291 = (C01291) continuation;
            if ((c01291.label & Integer.MIN_VALUE) != 0) {
                c01291.label -= Integer.MIN_VALUE;
            } else {
                c01291 = new C01291(continuation);
            }
        } else {
            c01291 = new C01291(continuation);
        }
        Object obj = c01291.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c01291.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tLSRecord = (TLSRecord) c01291.L$4;
            try {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                tLSRecord.getPacket().close();
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        Buffer buffer = new Buffer();
        function1.invoke(buffer);
        Buffer buffer2 = buffer;
        Buffer buffer3 = new Buffer();
        Buffer buffer4 = buffer3;
        RenderKt.writeTLSHandshakeType(buffer4, tLSHandshakeType, (int) ByteReadPacketKt.getRemaining(buffer2));
        BytePacketBuilderKt.writePacket(buffer4, buffer2);
        Buffer buffer5 = buffer3;
        Digest.m388updateimpl(this.digest, buffer5);
        TLSRecord tLSRecord2 = new TLSRecord(TLSRecordType.Handshake, null, buffer5, 2, null);
        try {
            SendChannel<TLSRecord> sendChannel = this.output;
            c01291.L$0 = SpillingKt.nullOutSpilledVariable(tLSHandshakeType);
            c01291.L$1 = SpillingKt.nullOutSpilledVariable(function1);
            c01291.L$2 = SpillingKt.nullOutSpilledVariable(buffer2);
            c01291.L$3 = SpillingKt.nullOutSpilledVariable(buffer5);
            c01291.L$4 = tLSRecord2;
            c01291.label = 1;
            if (sendChannel.send(tLSRecord2, c01291) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
            tLSRecord = tLSRecord2;
            tLSRecord.getPacket().close();
            throw th;
        }
    }
}
