package io.ktor.network.tls;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.network.util.PoolsKt;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt;
import io.ktor.utils.io.core.ByteReadPacketKt;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Sink;
import kotlinx.io.Source;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0081@\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\"\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%\u0088\u0001\u0004\u0092\u0001\u00020\u0003¨\u0006&"}, d2 = {"Lio/ktor/network/tls/Digest;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lkotlinx/io/Sink;", "state", "constructor-impl", "(Lkotlinx/io/Sink;)Lkotlinx/io/Sink;", "Lkotlinx/io/Source;", "packet", "", "update-impl", "(Lkotlinx/io/Sink;Lkotlinx/io/Source;)V", "update", "", "hashName", "", "doHash-impl", "(Lkotlinx/io/Sink;Ljava/lang/String;)[B", "doHash", "close-impl", "(Lkotlinx/io/Sink;)V", "close", "", "other", "", "equals-impl", "(Lkotlinx/io/Sink;Ljava/lang/Object;)Z", "equals", "", "hashCode-impl", "(Lkotlinx/io/Sink;)I", "hashCode", "toString-impl", "(Lkotlinx/io/Sink;)Ljava/lang/String;", "toString", "Lkotlinx/io/Sink;", "getState", "()Lkotlinx/io/Sink;", "ktor-network-tls"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
public final class Digest implements Closeable {
    private final Sink state;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Digest m380boximpl(Sink sink) {
        return new Digest(sink);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static Sink m382constructorimpl(Sink state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return state;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m384equalsimpl(Sink sink, Object obj) {
        return (obj instanceof Digest) && Intrinsics.areEqual(sink, ((Digest) obj).m389unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m385equalsimpl0(Sink sink, Sink sink2) {
        return Intrinsics.areEqual(sink, sink2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m386hashCodeimpl(Sink sink) {
        return sink.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m387toStringimpl(Sink sink) {
        return "Digest(state=" + sink + ')';
    }

    public boolean equals(Object obj) {
        return m384equalsimpl(this.state, obj);
    }

    public int hashCode() {
        return m386hashCodeimpl(this.state);
    }

    public String toString() {
        return m387toStringimpl(this.state);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Sink m389unboximpl() {
        return this.state;
    }

    private /* synthetic */ Digest(Sink sink) {
        this.state = sink;
    }

    public final Sink getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: update-impl, reason: not valid java name */
    public static final void m388updateimpl(Sink sink, Source packet) {
        Intrinsics.checkNotNullParameter(packet, "packet");
        synchronized (sink) {
            if (packet.exhausted()) {
                return;
            }
            BytePacketBuilderKt.writePacket(sink, ByteReadPacketKt.copy(packet));
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: doHash-impl, reason: not valid java name */
    public static final byte[] m383doHashimpl(Sink sink, final String hashName) {
        byte[] bArr;
        Intrinsics.checkNotNullParameter(hashName, "hashName");
        synchronized (sink) {
            bArr = (byte[]) ByteReadPacketKt.preview(sink, new Function1() { // from class: io.ktor.network.tls.Digest$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Digest.doHash_impl$lambda$0$0(hashName, (Source) obj);
                }
            });
        }
        Intrinsics.checkNotNullExpressionValue(bArr, "synchronized(...)");
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] doHash_impl$lambda$0$0(String str, Source handshakes) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(handshakes, "handshakes");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        Intrinsics.checkNotNull(messageDigest);
        ByteBuffer byteBufferBorrow = PoolsKt.getDefaultByteBufferPool().borrow();
        while (!handshakes.exhausted() && ByteReadPacketExtensions_jvmKt.readAvailable(handshakes, byteBufferBorrow) != -1) {
            try {
                byteBufferBorrow.flip();
                messageDigest.update(byteBufferBorrow);
                byteBufferBorrow.clear();
            } catch (Throwable th) {
                PoolsKt.getDefaultByteBufferPool().recycle(byteBufferBorrow);
                throw th;
            }
        }
        byte[] bArrDigest = messageDigest.digest();
        PoolsKt.getDefaultByteBufferPool().recycle(byteBufferBorrow);
        return bArrDigest;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m381closeimpl(this.state);
    }

    /* JADX INFO: renamed from: close-impl, reason: not valid java name */
    public static void m381closeimpl(Sink sink) {
        sink.close();
    }
}
