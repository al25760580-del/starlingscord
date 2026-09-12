package com.discord.media.engine.video.events;

import a3.e;
import com.discord.chat.presentation.list.a;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002*+B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nBE\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001J%\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0001¢\u0006\u0002\b)R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006,"}, d2 = {"Lcom/discord/media/engine/video/events/PingCallbackEvent;", "Lcom/discord/reactevents/ReactEvent;", "connectionId", "", "ping", "server", "", "port", "seq", "<init>", "(IILjava/lang/String;II)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIILjava/lang/String;IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getConnectionId", "()I", "getPing", "getServer", "()Ljava/lang/String;", "getPort", "getSeq", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$media_engine_release", "$serializer", "Companion", "media_engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PingCallbackEvent implements ReactEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int connectionId;
    private final int ping;
    private final int port;
    private final int seq;

    @NotNull
    private final String server;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/media/engine/video/events/PingCallbackEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/media/engine/video/events/PingCallbackEvent;", "media_engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return PingCallbackEvent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PingCallbackEvent(int i7, int i10, int i11, String str, int i12, int i13, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i7 & 31)) {
            e1.l(i7, 31, PingCallbackEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.connectionId = i10;
        this.ping = i11;
        this.server = str;
        this.port = i12;
        this.seq = i13;
    }

    public static /* synthetic */ PingCallbackEvent copy$default(PingCallbackEvent pingCallbackEvent, int i7, int i10, String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i7 = pingCallbackEvent.connectionId;
        }
        if ((i13 & 2) != 0) {
            i10 = pingCallbackEvent.ping;
        }
        if ((i13 & 4) != 0) {
            str = pingCallbackEvent.server;
        }
        if ((i13 & 8) != 0) {
            i11 = pingCallbackEvent.port;
        }
        if ((i13 & 16) != 0) {
            i12 = pingCallbackEvent.seq;
        }
        int i14 = i12;
        String str2 = str;
        return pingCallbackEvent.copy(i7, i10, str2, i11, i14);
    }

    public static final /* synthetic */ void write$Self$media_engine_release(PingCallbackEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.l(0, self.connectionId, serialDesc);
        output.l(1, self.ping, serialDesc);
        output.q(serialDesc, 2, self.server);
        output.l(3, self.port, serialDesc);
        output.l(4, self.seq, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getConnectionId() {
        return this.connectionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPing() {
        return this.ping;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getServer() {
        return this.server;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPort() {
        return this.port;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSeq() {
        return this.seq;
    }

    @NotNull
    public final PingCallbackEvent copy(int connectionId, int ping, @NotNull String server, int port, int seq) {
        Intrinsics.checkNotNullParameter(server, "server");
        return new PingCallbackEvent(connectionId, ping, server, port, seq);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PingCallbackEvent)) {
            return false;
        }
        PingCallbackEvent pingCallbackEvent = (PingCallbackEvent) other;
        return this.connectionId == pingCallbackEvent.connectionId && this.ping == pingCallbackEvent.ping && Intrinsics.areEqual(this.server, pingCallbackEvent.server) && this.port == pingCallbackEvent.port && this.seq == pingCallbackEvent.seq;
    }

    public final int getConnectionId() {
        return this.connectionId;
    }

    public final int getPing() {
        return this.ping;
    }

    public final int getPort() {
        return this.port;
    }

    public final int getSeq() {
        return this.seq;
    }

    @NotNull
    public final String getServer() {
        return this.server;
    }

    public int hashCode() {
        return Integer.hashCode(this.seq) + a.u(this.port, e.d(a.u(this.ping, Integer.hashCode(this.connectionId) * 31, 31), 31, this.server), 31);
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableMap getData() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    @NotNull
    public String toString() {
        int i7 = this.connectionId;
        int i10 = this.ping;
        String str = this.server;
        int i11 = this.port;
        int i12 = this.seq;
        StringBuilder sbR = e.r(i7, "PingCallbackEvent(connectionId=", i10, ", ping=", ", server=");
        sbR.append(str);
        sbR.append(", port=");
        sbR.append(i11);
        sbR.append(", seq=");
        return b.l(sbR, i12, ")");
    }

    public PingCallbackEvent(int i7, int i10, @NotNull String server, int i11, int i12) {
        Intrinsics.checkNotNullParameter(server, "server");
        this.connectionId = i7;
        this.ping = i10;
        this.server = server;
        this.port = i11;
        this.seq = i12;
    }
}
