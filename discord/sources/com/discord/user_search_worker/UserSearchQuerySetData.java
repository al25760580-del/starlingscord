package com.discord.user_search_worker;

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

/* JADX INFO: loaded from: classes3.dex */
@f
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\tHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J%\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\b!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, d2 = {"Lcom/discord/user_search_worker/UserSearchQuerySetData;", "Lcom/discord/user_search_worker/UserSearchData;", "uuid", "", "payload", "Lcom/discord/user_search_worker/UserSearchQuerySetPayload;", "<init>", "(Ljava/lang/String;Lcom/discord/user_search_worker/UserSearchQuerySetPayload;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/user_search_worker/UserSearchQuerySetPayload;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUuid", "()Ljava/lang/String;", "getPayload", "()Lcom/discord/user_search_worker/UserSearchQuerySetPayload;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$user_search_worker_release", "$serializer", "Companion", "user_search_worker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UserSearchQuerySetData extends UserSearchData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final UserSearchQuerySetPayload payload;

    @NotNull
    private final String uuid;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/user_search_worker/UserSearchQuerySetData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/user_search_worker/UserSearchQuerySetData;", "user_search_worker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return UserSearchQuerySetData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserSearchQuerySetData(int i7, String str, UserSearchQuerySetPayload userSearchQuerySetPayload, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (3 != (i7 & 3)) {
            e1.l(i7, 3, UserSearchQuerySetData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.uuid = str;
        this.payload = userSearchQuerySetPayload;
    }

    public static /* synthetic */ UserSearchQuerySetData copy$default(UserSearchQuerySetData userSearchQuerySetData, String str, UserSearchQuerySetPayload userSearchQuerySetPayload, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = userSearchQuerySetData.uuid;
        }
        if ((i7 & 2) != 0) {
            userSearchQuerySetPayload = userSearchQuerySetData.payload;
        }
        return userSearchQuerySetData.copy(str, userSearchQuerySetPayload);
    }

    public static final /* synthetic */ void write$Self$user_search_worker_release(UserSearchQuerySetData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.uuid);
        output.g(serialDesc, 1, UserSearchQuerySetPayload$$serializer.INSTANCE, self.payload);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UserSearchQuerySetPayload getPayload() {
        return this.payload;
    }

    @NotNull
    public final UserSearchQuerySetData copy(@NotNull String uuid, @NotNull UserSearchQuerySetPayload payload) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(payload, "payload");
        return new UserSearchQuerySetData(uuid, payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSearchQuerySetData)) {
            return false;
        }
        UserSearchQuerySetData userSearchQuerySetData = (UserSearchQuerySetData) other;
        return Intrinsics.areEqual(this.uuid, userSearchQuerySetData.uuid) && Intrinsics.areEqual(this.payload, userSearchQuerySetData.payload);
    }

    @NotNull
    public final UserSearchQuerySetPayload getPayload() {
        return this.payload;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return this.payload.hashCode() + (this.uuid.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "UserSearchQuerySetData(uuid=" + this.uuid + ", payload=" + this.payload + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSearchQuerySetData(@NotNull String uuid, @NotNull UserSearchQuerySetPayload payload) {
        super(null);
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.uuid = uuid;
        this.payload = payload;
    }
}
