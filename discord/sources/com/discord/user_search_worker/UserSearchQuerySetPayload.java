package com.discord.user_search_worker;

import com.discord.sticker.sticker_types.c;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.d;
import or.e1;
import or.h0;
import or.s1;
import or.w;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes3.dex */
@f
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 82\u00020\u0001:\u000278Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010Bu\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0014J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u0015\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003Jm\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u000eHÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001J%\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0001¢\u0006\u0002\b6R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00069"}, d2 = {"Lcom/discord/user_search_worker/UserSearchQuerySetPayload;", "", "query", "", "filters", "Lcom/discord/user_search_worker/UserSearchQuerySetFilters;", "blacklist", "", "whitelist", "boosters", "", "", "boosterFallback", "limit", "", "<init>", "(Ljava/lang/String;Lcom/discord/user_search_worker/UserSearchQuerySetFilters;Ljava/util/List;Ljava/util/List;Ljava/util/Map;DI)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/user_search_worker/UserSearchQuerySetFilters;Ljava/util/List;Ljava/util/List;Ljava/util/Map;DILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getQuery", "()Ljava/lang/String;", "getFilters", "()Lcom/discord/user_search_worker/UserSearchQuerySetFilters;", "getBlacklist", "()Ljava/util/List;", "getWhitelist", "getBoosters", "()Ljava/util/Map;", "getBoosterFallback", "()D", "getLimit", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$user_search_worker_release", "$serializer", "Companion", "user_search_worker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UserSearchQuerySetPayload {

    @NotNull
    private static final Lazy[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final List<String> blacklist;
    private final double boosterFallback;

    @NotNull
    private final Map<String, Double> boosters;
    private final UserSearchQuerySetFilters filters;
    private final int limit;

    @NotNull
    private final String query;
    private final List<String> whitelist;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/user_search_worker/UserSearchQuerySetPayload$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/user_search_worker/UserSearchQuerySetPayload;", "user_search_worker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return UserSearchQuerySetPayload$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        m mVar = m.f19486e;
        $childSerializers = new Lazy[]{null, null, l.a(mVar, new c(1)), l.a(mVar, new c(2)), l.a(mVar, new c(3)), null, null};
    }

    public /* synthetic */ UserSearchQuerySetPayload(int i7, String str, UserSearchQuerySetFilters userSearchQuerySetFilters, List list, List list2, Map map, double d6, int i10, SerializationConstructorMarker serializationConstructorMarker) {
        if (113 != (i7 & 113)) {
            e1.l(i7, 113, UserSearchQuerySetPayload$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.query = str;
        if ((i7 & 2) == 0) {
            this.filters = null;
        } else {
            this.filters = userSearchQuerySetFilters;
        }
        if ((i7 & 4) == 0) {
            this.blacklist = null;
        } else {
            this.blacklist = list;
        }
        if ((i7 & 8) == 0) {
            this.whitelist = null;
        } else {
            this.whitelist = list2;
        }
        this.boosters = map;
        this.boosterFallback = d6;
        this.limit = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(s1.f17602a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(s1.f17602a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new h0(s1.f17602a, w.f17621a, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserSearchQuerySetPayload copy$default(UserSearchQuerySetPayload userSearchQuerySetPayload, String str, UserSearchQuerySetFilters userSearchQuerySetFilters, List list, List list2, Map map, double d6, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = userSearchQuerySetPayload.query;
        }
        if ((i10 & 2) != 0) {
            userSearchQuerySetFilters = userSearchQuerySetPayload.filters;
        }
        if ((i10 & 4) != 0) {
            list = userSearchQuerySetPayload.blacklist;
        }
        if ((i10 & 8) != 0) {
            list2 = userSearchQuerySetPayload.whitelist;
        }
        if ((i10 & 16) != 0) {
            map = userSearchQuerySetPayload.boosters;
        }
        if ((i10 & 32) != 0) {
            d6 = userSearchQuerySetPayload.boosterFallback;
        }
        if ((i10 & 64) != 0) {
            i7 = userSearchQuerySetPayload.limit;
        }
        int i11 = i7;
        double d7 = d6;
        Map map2 = map;
        List list3 = list;
        return userSearchQuerySetPayload.copy(str, userSearchQuerySetFilters, list3, list2, map2, d7, i11);
    }

    public static final /* synthetic */ void write$Self$user_search_worker_release(UserSearchQuerySetPayload self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = $childSerializers;
        output.q(serialDesc, 0, self.query);
        if (output.u(serialDesc, 1) || self.filters != null) {
            output.r(serialDesc, 1, UserSearchQuerySetFilters$$serializer.INSTANCE, self.filters);
        }
        if (output.u(serialDesc, 2) || self.blacklist != null) {
            output.r(serialDesc, 2, (KSerializer) lazyArr[2].getValue(), self.blacklist);
        }
        if (output.u(serialDesc, 3) || self.whitelist != null) {
            output.r(serialDesc, 3, (KSerializer) lazyArr[3].getValue(), self.whitelist);
        }
        output.g(serialDesc, 4, (KSerializer) lazyArr[4].getValue(), self.boosters);
        output.A(serialDesc, 5, self.boosterFallback);
        output.l(6, self.limit, serialDesc);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UserSearchQuerySetFilters getFilters() {
        return this.filters;
    }

    public final List<String> component3() {
        return this.blacklist;
    }

    public final List<String> component4() {
        return this.whitelist;
    }

    @NotNull
    public final Map<String, Double> component5() {
        return this.boosters;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getBoosterFallback() {
        return this.boosterFallback;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    @NotNull
    public final UserSearchQuerySetPayload copy(@NotNull String query, UserSearchQuerySetFilters filters, List<String> blacklist, List<String> whitelist, @NotNull Map<String, Double> boosters, double boosterFallback, int limit) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(boosters, "boosters");
        return new UserSearchQuerySetPayload(query, filters, blacklist, whitelist, boosters, boosterFallback, limit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSearchQuerySetPayload)) {
            return false;
        }
        UserSearchQuerySetPayload userSearchQuerySetPayload = (UserSearchQuerySetPayload) other;
        return Intrinsics.areEqual(this.query, userSearchQuerySetPayload.query) && Intrinsics.areEqual(this.filters, userSearchQuerySetPayload.filters) && Intrinsics.areEqual(this.blacklist, userSearchQuerySetPayload.blacklist) && Intrinsics.areEqual(this.whitelist, userSearchQuerySetPayload.whitelist) && Intrinsics.areEqual(this.boosters, userSearchQuerySetPayload.boosters) && Double.compare(this.boosterFallback, userSearchQuerySetPayload.boosterFallback) == 0 && this.limit == userSearchQuerySetPayload.limit;
    }

    public final List<String> getBlacklist() {
        return this.blacklist;
    }

    public final double getBoosterFallback() {
        return this.boosterFallback;
    }

    @NotNull
    public final Map<String, Double> getBoosters() {
        return this.boosters;
    }

    public final UserSearchQuerySetFilters getFilters() {
        return this.filters;
    }

    public final int getLimit() {
        return this.limit;
    }

    @NotNull
    public final String getQuery() {
        return this.query;
    }

    public final List<String> getWhitelist() {
        return this.whitelist;
    }

    public int hashCode() {
        int iHashCode = this.query.hashCode() * 31;
        UserSearchQuerySetFilters userSearchQuerySetFilters = this.filters;
        int iHashCode2 = (iHashCode + (userSearchQuerySetFilters == null ? 0 : userSearchQuerySetFilters.hashCode())) * 31;
        List<String> list = this.blacklist;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.whitelist;
        return Integer.hashCode(this.limit) + com.discord.chat.presentation.list.a.d((this.boosters.hashCode() + ((iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31)) * 31, this.boosterFallback, 31);
    }

    @NotNull
    public String toString() {
        return "UserSearchQuerySetPayload(query=" + this.query + ", filters=" + this.filters + ", blacklist=" + this.blacklist + ", whitelist=" + this.whitelist + ", boosters=" + this.boosters + ", boosterFallback=" + this.boosterFallback + ", limit=" + this.limit + ")";
    }

    public UserSearchQuerySetPayload(@NotNull String query, UserSearchQuerySetFilters userSearchQuerySetFilters, List<String> list, List<String> list2, @NotNull Map<String, Double> boosters, double d6, int i7) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(boosters, "boosters");
        this.query = query;
        this.filters = userSearchQuerySetFilters;
        this.blacklist = list;
        this.whitelist = list2;
        this.boosters = boosters;
        this.boosterFallback = d6;
        this.limit = i7;
    }

    public /* synthetic */ UserSearchQuerySetPayload(String str, UserSearchQuerySetFilters userSearchQuerySetFilters, List list, List list2, Map map, double d6, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : userSearchQuerySetFilters, (i10 & 4) != 0 ? null : list, (i10 & 8) != 0 ? null : list2, map, d6, i7);
    }
}
