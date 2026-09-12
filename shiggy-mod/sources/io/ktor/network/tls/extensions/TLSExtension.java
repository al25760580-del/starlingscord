package io.ktor.network.tls.extensions;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.http.LinkHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Source;

/* JADX INFO: compiled from: TLSExtension.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/ktor/network/tls/extensions/TLSExtension;", "", "Lio/ktor/network/tls/extensions/TLSExtensionType;", LinkHeader.Parameters.Type, "", "length", "Lkotlinx/io/Source;", "packet", "<init>", "(Lio/ktor/network/tls/extensions/TLSExtensionType;ILkotlinx/io/Source;)V", "Lio/ktor/network/tls/extensions/TLSExtensionType;", "getType", "()Lio/ktor/network/tls/extensions/TLSExtensionType;", "I", "getLength", "()I", "Lkotlinx/io/Source;", "getPacket", "()Lkotlinx/io/Source;", "ktor-network-tls"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class TLSExtension {
    private final int length;
    private final Source packet;
    private final TLSExtensionType type;

    public TLSExtension(TLSExtensionType type, int i, Source packet) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(packet, "packet");
        this.type = type;
        this.length = i;
        this.packet = packet;
    }

    public final TLSExtensionType getType() {
        return this.type;
    }

    public final int getLength() {
        return this.length;
    }

    public final Source getPacket() {
        return this.packet;
    }
}
