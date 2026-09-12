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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002*+B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nBE\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J%\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0001¢\u0006\u0002\b)R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006,"}, d2 = {"Lcom/discord/media/engine/video/events/PingTimeoutCallbackEvent;", "Lcom/discord/reactevents/ReactEvent;", "connectionId", "", "server", "", "port", "seq", "timeout", "<init>", "(ILjava/lang/String;III)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getConnectionId", "()I", "getServer", "()Ljava/lang/String;", "getPort", "getSeq", "getTimeout", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$media_engine_release", "$serializer", "Companion", "media_engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PingTimeoutCallbackEvent implements ReactEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int connectionId;
    private final int port;
    private final int seq;

    @NotNull
    private final String server;
    private final int timeout;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/media/engine/video/events/PingTimeoutCallbackEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/media/engine/video/events/PingTimeoutCallbackEvent;", "media_engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return PingTimeoutCallbackEvent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PingTimeoutCallbackEvent(int i7, int i10, String str, int i11, int i12, int i13, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i7 & 31)) {
            e1.l(i7, 31, PingTimeoutCallbackEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.connectionId = i10;
        this.server = str;
        this.port = i11;
        this.seq = i12;
        this.timeout = i13;
    }

    public static /* synthetic */ PingTimeoutCallbackEvent copy$default(PingTimeoutCallbackEvent pingTimeoutCallbackEvent, int i7, String str, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i7 = pingTimeoutCallbackEvent.connectionId;
        }
        if ((i13 & 2) != 0) {
            str = pingTimeoutCallbackEvent.server;
        }
        if ((i13 & 4) != 0) {
            i10 = pingTimeoutCallbackEvent.port;
        }
        if ((i13 & 8) != 0) {
            i11 = pingTimeoutCallbackEvent.seq;
        }
        if ((i13 & 16) != 0) {
            i12 = pingTimeoutCallbackEvent.timeout;
        }
        int i14 = i12;
        int i15 = i10;
        return pingTimeoutCallbackEvent.copy(i7, str, i15, i11, i14);
    }

    public static final /* synthetic */ void write$Self$media_engine_release(PingTimeoutCallbackEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.l(0, self.connectionId, serialDesc);
        output.q(serialDesc, 1, self.server);
        output.l(2, self.port, serialDesc);
        output.l(3, self.seq, serialDesc);
        output.l(4, self.timeout, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getConnectionId() {
        return this.connectionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getServer() {
        return this.server;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPort() {
        return this.port;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSeq() {
        return this.seq;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTimeout() {
        return this.timeout;
    }

    @NotNull
    public final PingTimeoutCallbackEvent copy(int connectionId, @NotNull String server, int port, int seq, int timeout) {
        Intrinsics.checkNotNullParameter(server, "server");
        return new PingTimeoutCallbackEvent(connectionId, server, port, seq, timeout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PingTimeoutCallbackEvent)) {
            return false;
        }
        PingTimeoutCallbackEvent pingTimeoutCallbackEvent = (PingTimeoutCallbackEvent) other;
        return this.connectionId == pingTimeoutCallbackEvent.connectionId && Intrinsics.areEqual(this.server, pingTimeoutCallbackEvent.server) && this.port == pingTimeoutCallbackEvent.port && this.seq == pingTimeoutCallbackEvent.seq && this.timeout == pingTimeoutCallbackEvent.timeout;
    }

    public final int getConnectionId() {
        return this.connectionId;
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

    public final int getTimeout() {
        return this.timeout;
    }

    public int hashCode() {
        return Integer.hashCode(this.timeout) + a.u(this.seq, a.u(this.port, e.d(Integer.hashCode(this.connectionId) * 31, 31, this.server), 31), 31);
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
        String str = this.server;
        int i10 = this.port;
        int i11 = this.seq;
        int i12 = this.timeout;
        StringBuilder sbO = a.o("PingTimeoutCallbackEvent(connectionId=", ", server=", str, i7, ", port=");
        e.z(sbO, i10, ", seq=", i11, ", timeout=");
        return b.l(sbO, i12, ")");
    }

    public PingTimeoutCallbackEvent(int i7, @NotNull String server, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(server, "server");
        this.connectionId = i7;
        this.server = server;
        this.port = i10;
        this.seq = i11;
        this.timeout = i12;
    }
}
