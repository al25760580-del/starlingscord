package com.discord.user_search_worker;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.g;
import or.s1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@f
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002%&B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J2\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\nHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011¨\u0006'"}, d2 = {"Lcom/discord/user_search_worker/UserSearchQuerySetFilters;", "", "guild", "", "friends", "", "strict", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getGuild", "()Ljava/lang/String;", "getFriends", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStrict", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/discord/user_search_worker/UserSearchQuerySetFilters;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$user_search_worker_release", "$serializer", "Companion", "user_search_worker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UserSearchQuerySetFilters {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean friends;
    private final String guild;
    private final Boolean strict;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/user_search_worker/UserSearchQuerySetFilters$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/user_search_worker/UserSearchQuerySetFilters;", "user_search_worker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return UserSearchQuerySetFilters$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UserSearchQuerySetFilters() {
        this((String) null, (Boolean) null, (Boolean) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UserSearchQuerySetFilters copy$default(UserSearchQuerySetFilters userSearchQuerySetFilters, String str, Boolean bool, Boolean bool2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = userSearchQuerySetFilters.guild;
        }
        if ((i7 & 2) != 0) {
            bool = userSearchQuerySetFilters.friends;
        }
        if ((i7 & 4) != 0) {
            bool2 = userSearchQuerySetFilters.strict;
        }
        return userSearchQuerySetFilters.copy(str, bool, bool2);
    }

    public static final /* synthetic */ void write$Self$user_search_worker_release(UserSearchQuerySetFilters self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.u(serialDesc, 0) || self.guild != null) {
            output.r(serialDesc, 0, s1.f17602a, self.guild);
        }
        if (output.u(serialDesc, 1) || self.friends != null) {
            output.r(serialDesc, 1, g.f17537a, self.friends);
        }
        if (!output.u(serialDesc, 2) && self.strict == null) {
            return;
        }
        output.r(serialDesc, 2, g.f17537a, self.strict);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGuild() {
        return this.guild;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getFriends() {
        return this.friends;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getStrict() {
        return this.strict;
    }

    @NotNull
    public final UserSearchQuerySetFilters copy(String guild, Boolean friends, Boolean strict) {
        return new UserSearchQuerySetFilters(guild, friends, strict);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSearchQuerySetFilters)) {
            return false;
        }
        UserSearchQuerySetFilters userSearchQuerySetFilters = (UserSearchQuerySetFilters) other;
        return Intrinsics.areEqual(this.guild, userSearchQuerySetFilters.guild) && Intrinsics.areEqual(this.friends, userSearchQuerySetFilters.friends) && Intrinsics.areEqual(this.strict, userSearchQuerySetFilters.strict);
    }

    public final Boolean getFriends() {
        return this.friends;
    }

    public final String getGuild() {
        return this.guild;
    }

    public final Boolean getStrict() {
        return this.strict;
    }

    public int hashCode() {
        String str = this.guild;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.friends;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.strict;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UserSearchQuerySetFilters(guild=" + this.guild + ", friends=" + this.friends + ", strict=" + this.strict + ")";
    }

    public /* synthetic */ UserSearchQuerySetFilters(int i7, String str, Boolean bool, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i7 & 1) == 0) {
            this.guild = null;
        } else {
            this.guild = str;
        }
        if ((i7 & 2) == 0) {
            this.friends = null;
        } else {
            this.friends = bool;
        }
        if ((i7 & 4) == 0) {
            this.strict = null;
        } else {
            this.strict = bool2;
        }
    }

    public UserSearchQuerySetFilters(String str, Boolean bool, Boolean bool2) {
        this.guild = str;
        this.friends = bool;
        this.strict = bool2;
    }

    public /* synthetic */ UserSearchQuerySetFilters(String str, Boolean bool, Boolean bool2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : bool, (i7 & 4) != 0 ? null : bool2);
    }
}
