package com.discord.bundle_updater;

import a3.e;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.d;
import or.g;
import or.h0;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000245Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBo\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0012J\u0006\u0010\u001e\u001a\u00020\u001fJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003Jn\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\fHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001J%\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0001¢\u0006\u0002\b3R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00066"}, d2 = {"Lcom/discord/bundle_updater/BuildOverrideCookieMeta;", "", "expiresAt", "", "releaseChannel", "validForUserIds", "", "allowedVersions", "allowLoggedOut", "", "experiments", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/Map;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getExpiresAt", "()Ljava/lang/String;", "getReleaseChannel", "getValidForUserIds", "()Ljava/util/List;", "getAllowedVersions", "getAllowLoggedOut", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getExperiments", "()Ljava/util/Map;", "toNativeMap", "Lcom/facebook/react/bridge/WritableNativeMap;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/Map;)Lcom/discord/bundle_updater/BuildOverrideCookieMeta;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$bundle_updater_release", "$serializer", "Companion", "bundle_updater_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BuildOverrideCookieMeta {

    @NotNull
    private static final Lazy[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean allowLoggedOut;
    private final List<String> allowedVersions;
    private final Map<String, Integer> experiments;
    private final String expiresAt;
    private final String releaseChannel;
    private final List<String> validForUserIds;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/bundle_updater/BuildOverrideCookieMeta$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/bundle_updater/BuildOverrideCookieMeta;", "bundle_updater_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return BuildOverrideCookieMeta$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        m mVar = m.f19486e;
        $childSerializers = new Lazy[]{null, null, l.a(mVar, new a7.a(8)), l.a(mVar, new a7.a(9)), null, l.a(mVar, new a7.a(10))};
    }

    public BuildOverrideCookieMeta() {
        this((String) null, (String) null, (List) null, (List) null, (Boolean) null, (Map) null, 63, (DefaultConstructorMarker) null);
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
        return new h0(s1.f17602a, m0.f17573a, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BuildOverrideCookieMeta copy$default(BuildOverrideCookieMeta buildOverrideCookieMeta, String str, String str2, List list, List list2, Boolean bool, Map map, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = buildOverrideCookieMeta.expiresAt;
        }
        if ((i7 & 2) != 0) {
            str2 = buildOverrideCookieMeta.releaseChannel;
        }
        if ((i7 & 4) != 0) {
            list = buildOverrideCookieMeta.validForUserIds;
        }
        if ((i7 & 8) != 0) {
            list2 = buildOverrideCookieMeta.allowedVersions;
        }
        if ((i7 & 16) != 0) {
            bool = buildOverrideCookieMeta.allowLoggedOut;
        }
        if ((i7 & 32) != 0) {
            map = buildOverrideCookieMeta.experiments;
        }
        Boolean bool2 = bool;
        Map map2 = map;
        return buildOverrideCookieMeta.copy(str, str2, list, list2, bool2, map2);
    }

    public static final /* synthetic */ void write$Self$bundle_updater_release(BuildOverrideCookieMeta self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = $childSerializers;
        if (output.u(serialDesc, 0) || self.expiresAt != null) {
            output.r(serialDesc, 0, s1.f17602a, self.expiresAt);
        }
        if (output.u(serialDesc, 1) || self.releaseChannel != null) {
            output.r(serialDesc, 1, s1.f17602a, self.releaseChannel);
        }
        if (output.u(serialDesc, 2) || self.validForUserIds != null) {
            output.r(serialDesc, 2, (KSerializer) lazyArr[2].getValue(), self.validForUserIds);
        }
        if (output.u(serialDesc, 3) || self.allowedVersions != null) {
            output.r(serialDesc, 3, (KSerializer) lazyArr[3].getValue(), self.allowedVersions);
        }
        if (output.u(serialDesc, 4) || self.allowLoggedOut != null) {
            output.r(serialDesc, 4, g.f17537a, self.allowLoggedOut);
        }
        if (!output.u(serialDesc, 5) && self.experiments == null) {
            return;
        }
        output.r(serialDesc, 5, (KSerializer) lazyArr[5].getValue(), self.experiments);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExpiresAt() {
        return this.expiresAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReleaseChannel() {
        return this.releaseChannel;
    }

    public final List<String> component3() {
        return this.validForUserIds;
    }

    public final List<String> component4() {
        return this.allowedVersions;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getAllowLoggedOut() {
        return this.allowLoggedOut;
    }

    public final Map<String, Integer> component6() {
        return this.experiments;
    }

    @NotNull
    public final BuildOverrideCookieMeta copy(String expiresAt, String releaseChannel, List<String> validForUserIds, List<String> allowedVersions, Boolean allowLoggedOut, Map<String, Integer> experiments) {
        return new BuildOverrideCookieMeta(expiresAt, releaseChannel, validForUserIds, allowedVersions, allowLoggedOut, experiments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuildOverrideCookieMeta)) {
            return false;
        }
        BuildOverrideCookieMeta buildOverrideCookieMeta = (BuildOverrideCookieMeta) other;
        return Intrinsics.areEqual(this.expiresAt, buildOverrideCookieMeta.expiresAt) && Intrinsics.areEqual(this.releaseChannel, buildOverrideCookieMeta.releaseChannel) && Intrinsics.areEqual(this.validForUserIds, buildOverrideCookieMeta.validForUserIds) && Intrinsics.areEqual(this.allowedVersions, buildOverrideCookieMeta.allowedVersions) && Intrinsics.areEqual(this.allowLoggedOut, buildOverrideCookieMeta.allowLoggedOut) && Intrinsics.areEqual(this.experiments, buildOverrideCookieMeta.experiments);
    }

    public final Boolean getAllowLoggedOut() {
        return this.allowLoggedOut;
    }

    public final List<String> getAllowedVersions() {
        return this.allowedVersions;
    }

    public final Map<String, Integer> getExperiments() {
        return this.experiments;
    }

    public final String getExpiresAt() {
        return this.expiresAt;
    }

    public final String getReleaseChannel() {
        return this.releaseChannel;
    }

    public final List<String> getValidForUserIds() {
        return this.validForUserIds;
    }

    public int hashCode() {
        String str = this.expiresAt;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.releaseChannel;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.validForUserIds;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.allowedVersions;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.allowLoggedOut;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, Integer> map = this.experiments;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public final WritableNativeMap toNativeMap() {
        ReadableNativeArray nativeArray$default;
        WritableNativeMap writableNativeMap;
        Pair pair = new Pair("expiresAt", this.expiresAt);
        Pair pair2 = new Pair("releaseChannel", this.releaseChannel);
        List<String> list = this.validForUserIds;
        Pair pair3 = new Pair("validForUserIds", list != null ? NativeArrayExtensionsKt.toNativeArray$default(list, null, 1, null) : null);
        List<String> list2 = this.allowedVersions;
        if (list2 != null) {
            nativeArray$default = NativeArrayExtensionsKt.toNativeArray$default(list2, null, 1, null);
            writableNativeMap = null;
        } else {
            nativeArray$default = null;
            writableNativeMap = null;
        }
        Pair pair4 = new Pair("allowedVersions", nativeArray$default);
        WritableNativeMap writableNativeMap2 = writableNativeMap;
        Pair pair5 = new Pair("allowLoggedOut", this.allowLoggedOut);
        Map<String, Integer> map = this.experiments;
        return NativeMapExtensionsKt.nativeMapOf(pair, pair2, pair3, pair4, pair5, new Pair("experiments", map != null ? NativeMapExtensionsKt.toNativeMap(map) : writableNativeMap2));
    }

    @NotNull
    public String toString() {
        String str = this.expiresAt;
        String str2 = this.releaseChannel;
        List<String> list = this.validForUserIds;
        List<String> list2 = this.allowedVersions;
        Boolean bool = this.allowLoggedOut;
        Map<String, Integer> map = this.experiments;
        StringBuilder sbU = e.u("BuildOverrideCookieMeta(expiresAt=", str, ", releaseChannel=", str2, ", validForUserIds=");
        sbU.append(list);
        sbU.append(", allowedVersions=");
        sbU.append(list2);
        sbU.append(", allowLoggedOut=");
        sbU.append(bool);
        sbU.append(", experiments=");
        sbU.append(map);
        sbU.append(")");
        return sbU.toString();
    }

    public /* synthetic */ BuildOverrideCookieMeta(int i7, String str, String str2, List list, List list2, Boolean bool, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i7 & 1) == 0) {
            this.expiresAt = null;
        } else {
            this.expiresAt = str;
        }
        if ((i7 & 2) == 0) {
            this.releaseChannel = null;
        } else {
            this.releaseChannel = str2;
        }
        if ((i7 & 4) == 0) {
            this.validForUserIds = null;
        } else {
            this.validForUserIds = list;
        }
        if ((i7 & 8) == 0) {
            this.allowedVersions = null;
        } else {
            this.allowedVersions = list2;
        }
        if ((i7 & 16) == 0) {
            this.allowLoggedOut = null;
        } else {
            this.allowLoggedOut = bool;
        }
        if ((i7 & 32) == 0) {
            this.experiments = null;
        } else {
            this.experiments = map;
        }
    }

    public BuildOverrideCookieMeta(String str, String str2, List<String> list, List<String> list2, Boolean bool, Map<String, Integer> map) {
        this.expiresAt = str;
        this.releaseChannel = str2;
        this.validForUserIds = list;
        this.allowedVersions = list2;
        this.allowLoggedOut = bool;
        this.experiments = map;
    }

    public /* synthetic */ BuildOverrideCookieMeta(String str, String str2, List list, List list2, Boolean bool, Map map, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : list, (i7 & 8) != 0 ? null : list2, (i7 & 16) != 0 ? null : bool, (i7 & 32) != 0 ? null : map);
    }
}
