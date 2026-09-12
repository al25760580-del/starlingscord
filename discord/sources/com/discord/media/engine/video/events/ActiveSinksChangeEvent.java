package com.discord.media.engine.video.events;

import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.appstate.AppStateModule;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\tHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J%\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, d2 = {"Lcom/discord/media/engine/video/events/ActiveSinksChangeEvent;", "Lcom/discord/reactevents/ReactEvent;", "streamId", "", AppStateModule.APP_STATE_ACTIVE, "", "<init>", "(Ljava/lang/String;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getStreamId", "()Ljava/lang/String;", "getActive", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$media_engine_release", "$serializer", "Companion", "media_engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ActiveSinksChangeEvent implements ReactEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean active;

    @NotNull
    private final String streamId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/media/engine/video/events/ActiveSinksChangeEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/media/engine/video/events/ActiveSinksChangeEvent;", "media_engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ActiveSinksChangeEvent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ActiveSinksChangeEvent(int i7, String str, boolean z5, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i7 & 3)) {
            e1.l(i7, 3, ActiveSinksChangeEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.streamId = str;
        this.active = z5;
    }

    public static /* synthetic */ ActiveSinksChangeEvent copy$default(ActiveSinksChangeEvent activeSinksChangeEvent, String str, boolean z5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = activeSinksChangeEvent.streamId;
        }
        if ((i7 & 2) != 0) {
            z5 = activeSinksChangeEvent.active;
        }
        return activeSinksChangeEvent.copy(str, z5);
    }

    public static final /* synthetic */ void write$Self$media_engine_release(ActiveSinksChangeEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.streamId);
        output.p(serialDesc, 1, self.active);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStreamId() {
        return this.streamId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    @NotNull
    public final ActiveSinksChangeEvent copy(@NotNull String streamId, boolean active) {
        Intrinsics.checkNotNullParameter(streamId, "streamId");
        return new ActiveSinksChangeEvent(streamId, active);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActiveSinksChangeEvent)) {
            return false;
        }
        ActiveSinksChangeEvent activeSinksChangeEvent = (ActiveSinksChangeEvent) other;
        return Intrinsics.areEqual(this.streamId, activeSinksChangeEvent.streamId) && this.active == activeSinksChangeEvent.active;
    }

    public final boolean getActive() {
        return this.active;
    }

    @NotNull
    public final String getStreamId() {
        return this.streamId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.active) + (this.streamId.hashCode() * 31);
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableMap getData() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    @NotNull
    public String toString() {
        return "ActiveSinksChangeEvent(streamId=" + this.streamId + ", active=" + this.active + ")";
    }

    public ActiveSinksChangeEvent(@NotNull String streamId, boolean z5) {
        Intrinsics.checkNotNullParameter(streamId, "streamId");
        this.streamId = streamId;
        this.active = z5;
    }
}
