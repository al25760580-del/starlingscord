package io.ktor.network.tls;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.http.LinkHeader;
import io.ktor.utils.io.core.ByteReadPacketKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Source;

/* JADX INFO: compiled from: Headers.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/ktor/network/tls/TLSRecord;", "", "Lio/ktor/network/tls/TLSRecordType;", LinkHeader.Parameters.Type, "Lio/ktor/network/tls/TLSVersion;", "version", "Lkotlinx/io/Source;", "packet", "<init>", "(Lio/ktor/network/tls/TLSRecordType;Lio/ktor/network/tls/TLSVersion;Lkotlinx/io/Source;)V", "Lio/ktor/network/tls/TLSRecordType;", "getType", "()Lio/ktor/network/tls/TLSRecordType;", "Lio/ktor/network/tls/TLSVersion;", "getVersion", "()Lio/ktor/network/tls/TLSVersion;", "Lkotlinx/io/Source;", "getPacket", "()Lkotlinx/io/Source;", "ktor-network-tls"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class TLSRecord {
    private final Source packet;
    private final TLSRecordType type;
    private final TLSVersion version;

    public TLSRecord() {
        this(null, null, null, 7, null);
    }

    public TLSRecord(TLSRecordType type, TLSVersion version, Source packet) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(packet, "packet");
        this.type = type;
        this.version = version;
        this.packet = packet;
    }

    public /* synthetic */ TLSRecord(TLSRecordType tLSRecordType, TLSVersion tLSVersion, Source source, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TLSRecordType.Handshake : tLSRecordType, (i & 2) != 0 ? TLSVersion.TLS12 : tLSVersion, (i & 4) != 0 ? ByteReadPacketKt.getByteReadPacketEmpty() : source);
    }

    public final TLSRecordType getType() {
        return this.type;
    }

    public final TLSVersion getVersion() {
        return this.version;
    }

    public final Source getPacket() {
        return this.packet;
    }
}
