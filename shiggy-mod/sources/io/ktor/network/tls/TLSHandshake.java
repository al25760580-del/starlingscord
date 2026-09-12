package io.ktor.network.tls;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.http.LinkHeader;
import io.ktor.utils.io.core.ByteReadPacketKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Source;

/* JADX INFO: compiled from: Headers.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/ktor/network/tls/TLSHandshake;", "", "<init>", "()V", "Lio/ktor/network/tls/TLSHandshakeType;", LinkHeader.Parameters.Type, "Lio/ktor/network/tls/TLSHandshakeType;", "getType", "()Lio/ktor/network/tls/TLSHandshakeType;", "setType", "(Lio/ktor/network/tls/TLSHandshakeType;)V", "Lkotlinx/io/Source;", "packet", "Lkotlinx/io/Source;", "getPacket", "()Lkotlinx/io/Source;", "setPacket", "(Lkotlinx/io/Source;)V", "ktor-network-tls"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class TLSHandshake {
    private TLSHandshakeType type = TLSHandshakeType.HelloRequest;
    private Source packet = ByteReadPacketKt.getByteReadPacketEmpty();

    public final TLSHandshakeType getType() {
        return this.type;
    }

    public final void setType(TLSHandshakeType tLSHandshakeType) {
        Intrinsics.checkNotNullParameter(tLSHandshakeType, "<set-?>");
        this.type = tLSHandshakeType;
    }

    public final Source getPacket() {
        return this.packet;
    }

    public final void setPacket(Source source) {
        Intrinsics.checkNotNullParameter(source, "<set-?>");
        this.packet = source;
    }
}
