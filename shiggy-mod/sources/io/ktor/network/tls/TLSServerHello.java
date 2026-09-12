package io.ktor.network.tls;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.network.tls.extensions.HashAndSign;
import io.ktor.network.tls.extensions.SignatureAlgorithmKt;
import io.ktor.network.tls.extensions.TLSExtension;
import io.ktor.network.tls.extensions.TLSExtensionType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TLSHandshakeType.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\n8\u0006¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001b¨\u0006$"}, d2 = {"Lio/ktor/network/tls/TLSServerHello;", "", "Lio/ktor/network/tls/TLSVersion;", "version", "", "serverSeed", "sessionId", "", "suite", "compressionMethod", "", "Lio/ktor/network/tls/extensions/TLSExtension;", "extensions", "<init>", "(Lio/ktor/network/tls/TLSVersion;[B[BSSLjava/util/List;)V", "Lio/ktor/network/tls/TLSVersion;", "getVersion", "()Lio/ktor/network/tls/TLSVersion;", "[B", "getServerSeed", "()[B", "getSessionId", "S", "getCompressionMethod", "()S", "Ljava/util/List;", "getExtensions", "()Ljava/util/List;", "Lio/ktor/network/tls/CipherSuite;", "cipherSuite", "Lio/ktor/network/tls/CipherSuite;", "getCipherSuite", "()Lio/ktor/network/tls/CipherSuite;", "Lio/ktor/network/tls/extensions/HashAndSign;", "hashAndSignAlgorithms", "getHashAndSignAlgorithms", "ktor-network-tls"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class TLSServerHello {
    private final CipherSuite cipherSuite;
    private final short compressionMethod;
    private final List<TLSExtension> extensions;
    private final List<HashAndSign> hashAndSignAlgorithms;
    private final byte[] serverSeed;
    private final byte[] sessionId;
    private final TLSVersion version;

    /* JADX INFO: compiled from: TLSHandshakeType.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TLSExtensionType.values().length];
            try {
                iArr[TLSExtensionType.SIGNATURE_ALGORITHMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TLSServerHello(TLSVersion version, byte[] serverSeed, byte[] sessionId, short s, short s2, List<TLSExtension> extensions) {
        Object next;
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(serverSeed, "serverSeed");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        this.version = version;
        this.serverSeed = serverSeed;
        this.sessionId = sessionId;
        this.compressionMethod = s2;
        this.extensions = extensions;
        Iterator<T> it = CIOCipherSuites.INSTANCE.getSupportedSuites().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((CipherSuite) next).getCode() != s);
        CipherSuite cipherSuite = (CipherSuite) next;
        if (cipherSuite == null) {
            throw new IllegalStateException(("Server cipher suite is not supported: " + ((int) s)).toString());
        }
        this.cipherSuite = cipherSuite;
        ArrayList arrayList = new ArrayList();
        for (TLSExtension tLSExtension : this.extensions) {
            if (WhenMappings.$EnumSwitchMapping$0[tLSExtension.getType().ordinal()] == 1) {
                CollectionsKt.addAll(arrayList, SignatureAlgorithmKt.parseSignatureAlgorithms(tLSExtension.getPacket()));
            }
        }
        this.hashAndSignAlgorithms = arrayList;
    }

    public final TLSVersion getVersion() {
        return this.version;
    }

    public final byte[] getServerSeed() {
        return this.serverSeed;
    }

    public final byte[] getSessionId() {
        return this.sessionId;
    }

    public final short getCompressionMethod() {
        return this.compressionMethod;
    }

    public /* synthetic */ TLSServerHello(TLSVersion tLSVersion, byte[] bArr, byte[] bArr2, short s, short s2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tLSVersion, bArr, bArr2, s, s2, (i & 32) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<TLSExtension> getExtensions() {
        return this.extensions;
    }

    public final CipherSuite getCipherSuite() {
        return this.cipherSuite;
    }

    public final List<HashAndSign> getHashAndSignAlgorithms() {
        return this.hashAndSignAlgorithms;
    }
}
