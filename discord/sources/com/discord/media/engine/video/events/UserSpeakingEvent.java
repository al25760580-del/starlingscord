package com.discord.media.engine.video.events;

import a3.e;
import com.discord.chat.presentation.list.a;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002()B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000eJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J%\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006*"}, d2 = {"Lcom/discord/media/engine/video/events/UserSpeakingEvent;", "Lcom/discord/reactevents/ReactEvent;", "connectionId", "", "userId", "", "isSpeaking", "voiceDb", "", "<init>", "(ILjava/lang/String;IF)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;IFLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getConnectionId", "()I", "getUserId", "()Ljava/lang/String;", "getVoiceDb", "()F", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$media_engine_release", "$serializer", "Companion", "media_engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UserSpeakingEvent implements ReactEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int connectionId;
    private final int isSpeaking;

    @NotNull
    private final String userId;
    private final float voiceDb;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/media/engine/video/events/UserSpeakingEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/media/engine/video/events/UserSpeakingEvent;", "media_engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return UserSpeakingEvent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ UserSpeakingEvent(int i7, int i10, String str, int i11, float f2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i7 & 15)) {
            e1.l(i7, 15, UserSpeakingEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.connectionId = i10;
        this.userId = str;
        this.isSpeaking = i11;
        this.voiceDb = f2;
    }

    public static /* synthetic */ UserSpeakingEvent copy$default(UserSpeakingEvent userSpeakingEvent, int i7, String str, int i10, float f2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = userSpeakingEvent.connectionId;
        }
        if ((i11 & 2) != 0) {
            str = userSpeakingEvent.userId;
        }
        if ((i11 & 4) != 0) {
            i10 = userSpeakingEvent.isSpeaking;
        }
        if ((i11 & 8) != 0) {
            f2 = userSpeakingEvent.voiceDb;
        }
        return userSpeakingEvent.copy(i7, str, i10, f2);
    }

    public static final /* synthetic */ void write$Self$media_engine_release(UserSpeakingEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.l(0, self.connectionId, serialDesc);
        output.q(serialDesc, 1, self.userId);
        output.l(2, self.isSpeaking, serialDesc);
        output.j(serialDesc, 3, self.voiceDb);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getConnectionId() {
        return this.connectionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIsSpeaking() {
        return this.isSpeaking;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getVoiceDb() {
        return this.voiceDb;
    }

    @NotNull
    public final UserSpeakingEvent copy(int connectionId, @NotNull String userId, int isSpeaking, float voiceDb) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new UserSpeakingEvent(connectionId, userId, isSpeaking, voiceDb);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSpeakingEvent)) {
            return false;
        }
        UserSpeakingEvent userSpeakingEvent = (UserSpeakingEvent) other;
        return this.connectionId == userSpeakingEvent.connectionId && Intrinsics.areEqual(this.userId, userSpeakingEvent.userId) && this.isSpeaking == userSpeakingEvent.isSpeaking && Float.compare(this.voiceDb, userSpeakingEvent.voiceDb) == 0;
    }

    public final int getConnectionId() {
        return this.connectionId;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final float getVoiceDb() {
        return this.voiceDb;
    }

    public int hashCode() {
        return Float.hashCode(this.voiceDb) + a.u(this.isSpeaking, e.d(Integer.hashCode(this.connectionId) * 31, 31, this.userId), 31);
    }

    public final int isSpeaking() {
        return this.isSpeaking;
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
        String str = this.userId;
        int i10 = this.isSpeaking;
        float f2 = this.voiceDb;
        StringBuilder sbO = a.o("UserSpeakingEvent(connectionId=", ", userId=", str, i7, ", isSpeaking=");
        sbO.append(i10);
        sbO.append(", voiceDb=");
        sbO.append(f2);
        sbO.append(")");
        return sbO.toString();
    }

    public UserSpeakingEvent(int i7, @NotNull String userId, int i10, float f2) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.connectionId = i7;
        this.userId = userId;
        this.isSpeaking = i10;
        this.voiceDb = f2;
    }
}
