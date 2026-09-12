package com.discord.media.engine.video.events;

import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J%\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006#"}, d2 = {"Lcom/discord/media/engine/video/events/SecureFramesStateUpdateCallbackEvent;", "Lcom/discord/reactevents/ReactEvent;", "connectionId", "", "stateUpdateJSON", "", "<init>", "(ILjava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getConnectionId", "()I", "getStateUpdateJSON", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$media_engine_release", "$serializer", "Companion", "media_engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SecureFramesStateUpdateCallbackEvent implements ReactEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int connectionId;

    @NotNull
    private final String stateUpdateJSON;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/media/engine/video/events/SecureFramesStateUpdateCallbackEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/media/engine/video/events/SecureFramesStateUpdateCallbackEvent;", "media_engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return SecureFramesStateUpdateCallbackEvent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SecureFramesStateUpdateCallbackEvent(int i7, int i10, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i7 & 3)) {
            e1.l(i7, 3, SecureFramesStateUpdateCallbackEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.connectionId = i10;
        this.stateUpdateJSON = str;
    }

    public static /* synthetic */ SecureFramesStateUpdateCallbackEvent copy$default(SecureFramesStateUpdateCallbackEvent secureFramesStateUpdateCallbackEvent, int i7, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = secureFramesStateUpdateCallbackEvent.connectionId;
        }
        if ((i10 & 2) != 0) {
            str = secureFramesStateUpdateCallbackEvent.stateUpdateJSON;
        }
        return secureFramesStateUpdateCallbackEvent.copy(i7, str);
    }

    public static final /* synthetic */ void write$Self$media_engine_release(SecureFramesStateUpdateCallbackEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.l(0, self.connectionId, serialDesc);
        output.q(serialDesc, 1, self.stateUpdateJSON);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getConnectionId() {
        return this.connectionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStateUpdateJSON() {
        return this.stateUpdateJSON;
    }

    @NotNull
    public final SecureFramesStateUpdateCallbackEvent copy(int connectionId, @NotNull String stateUpdateJSON) {
        Intrinsics.checkNotNullParameter(stateUpdateJSON, "stateUpdateJSON");
        return new SecureFramesStateUpdateCallbackEvent(connectionId, stateUpdateJSON);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecureFramesStateUpdateCallbackEvent)) {
            return false;
        }
        SecureFramesStateUpdateCallbackEvent secureFramesStateUpdateCallbackEvent = (SecureFramesStateUpdateCallbackEvent) other;
        return this.connectionId == secureFramesStateUpdateCallbackEvent.connectionId && Intrinsics.areEqual(this.stateUpdateJSON, secureFramesStateUpdateCallbackEvent.stateUpdateJSON);
    }

    public final int getConnectionId() {
        return this.connectionId;
    }

    @NotNull
    public final String getStateUpdateJSON() {
        return this.stateUpdateJSON;
    }

    public int hashCode() {
        return this.stateUpdateJSON.hashCode() + (Integer.hashCode(this.connectionId) * 31);
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableMap getData() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    @NotNull
    public String toString() {
        return "SecureFramesStateUpdateCallbackEvent(connectionId=" + this.connectionId + ", stateUpdateJSON=" + this.stateUpdateJSON + ")";
    }

    public SecureFramesStateUpdateCallbackEvent(int i7, @NotNull String stateUpdateJSON) {
        Intrinsics.checkNotNullParameter(stateUpdateJSON, "stateUpdateJSON");
        this.connectionId = i7;
        this.stateUpdateJSON = stateUpdateJSON;
    }
}
