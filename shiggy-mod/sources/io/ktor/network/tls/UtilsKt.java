package io.ktor.network.tls;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.http.auth.AuthScheme;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import io.ktor.utils.io.core.ByteReadPacketKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Buffer;
import kotlinx.io.Sink;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001c\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lio/ktor/network/tls/Digest;", AuthScheme.Digest, "()Lkotlinx/io/Sink;", "Lio/ktor/network/tls/TLSHandshake;", "record", "", "plusAssign-Hh8V18w", "(Lkotlinx/io/Sink;Lio/ktor/network/tls/TLSHandshake;)V", "plusAssign", "ktor-network-tls"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class UtilsKt {
    public static final Sink Digest() {
        return Digest.m382constructorimpl(BytePacketBuilderKt.BytePacketBuilder());
    }

    /* JADX INFO: renamed from: plusAssign-Hh8V18w, reason: not valid java name */
    public static final void m396plusAssignHh8V18w(Sink sink, TLSHandshake record) throws TLSException {
        Intrinsics.checkNotNullParameter(sink, "$v$c$io-ktor-network-tls-Digest$-$this$plusAssign$0");
        Intrinsics.checkNotNullParameter(record, "record");
        if (record.getType() == TLSHandshakeType.HelloRequest) {
            throw new IllegalStateException("Check failed.");
        }
        Buffer buffer = new Buffer();
        Buffer buffer2 = buffer;
        RenderKt.writeTLSHandshakeType(buffer2, record.getType(), (int) ByteReadPacketKt.getRemaining(record.getPacket()));
        if (ByteReadPacketKt.getRemaining(record.getPacket()) > 0) {
            BytePacketBuilderKt.writePacket(buffer2, ByteReadPacketKt.copy(record.getPacket()));
        }
        Digest.m388updateimpl(sink, buffer);
    }
}
