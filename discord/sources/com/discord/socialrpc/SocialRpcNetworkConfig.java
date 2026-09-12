package com.discord.socialrpc;

import a3.e;
import com.discord.cache.Cache;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kr.f;
import ls.d;
import or.h0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;
import rn.q;
import rn.r;
import sn.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0018\u0019B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/discord/socialrpc/SocialRpcNetworkConfig;", "", "apiBaseUrl", "", "token", "headers", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getApiBaseUrl", "()Ljava/lang/String;", "getToken", "getHeaders", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Blob", "Companion", "social_rpc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SocialRpcNetworkConfig {

    @NotNull
    public static final String CONFIG_KEY = "socialRpcNetworkRequest";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Json json = d.e(new b(1));

    @NotNull
    private final String apiBaseUrl;

    @NotNull
    private final Map<String, String> headers;

    @NotNull
    private final String token;

    @f
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\tHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J%\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, d2 = {"Lcom/discord/socialrpc/SocialRpcNetworkConfig$Blob;", "", "apiBaseUrl", "", "headers", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getApiBaseUrl", "()Ljava/lang/String;", "getHeaders", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$social_rpc_release", "$serializer", "Companion", "social_rpc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Blob {
        private final String apiBaseUrl;

        @NotNull
        private final Map<String, String> headers;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final Lazy[] $childSerializers = {null, l.a(m.f19486e, new c(1))};

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/socialrpc/SocialRpcNetworkConfig$Blob$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/socialrpc/SocialRpcNetworkConfig$Blob;", "social_rpc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return SocialRpcNetworkConfig$Blob$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Blob() {
            this((String) null, (Map) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            s1 s1Var = s1.f17602a;
            return new h0(s1Var, com.facebook.imagepipeline.nativecode.b.p(s1Var), 1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Blob copy$default(Blob blob, String str, Map map, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = blob.apiBaseUrl;
            }
            if ((i7 & 2) != 0) {
                map = blob.headers;
            }
            return blob.copy(str, map);
        }

        public static final /* synthetic */ void write$Self$social_rpc_release(Blob self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Lazy[] lazyArr = $childSerializers;
            if (output.u(serialDesc, 0) || self.apiBaseUrl != null) {
                output.r(serialDesc, 0, s1.f17602a, self.apiBaseUrl);
            }
            if (!output.u(serialDesc, 1) && Intrinsics.areEqual(self.headers, w0.d())) {
                return;
            }
            output.g(serialDesc, 1, (KSerializer) lazyArr[1].getValue(), self.headers);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getApiBaseUrl() {
            return this.apiBaseUrl;
        }

        @NotNull
        public final Map<String, String> component2() {
            return this.headers;
        }

        @NotNull
        public final Blob copy(String apiBaseUrl, @NotNull Map<String, String> headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            return new Blob(apiBaseUrl, headers);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Blob)) {
                return false;
            }
            Blob blob = (Blob) other;
            return Intrinsics.areEqual(this.apiBaseUrl, blob.apiBaseUrl) && Intrinsics.areEqual(this.headers, blob.headers);
        }

        public final String getApiBaseUrl() {
            return this.apiBaseUrl;
        }

        @NotNull
        public final Map<String, String> getHeaders() {
            return this.headers;
        }

        public int hashCode() {
            String str = this.apiBaseUrl;
            return this.headers.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "Blob(apiBaseUrl=" + this.apiBaseUrl + ", headers=" + this.headers + ")";
        }

        public /* synthetic */ Blob(int i7, String str, Map map, SerializationConstructorMarker serializationConstructorMarker) {
            this.apiBaseUrl = (i7 & 1) == 0 ? null : str;
            if ((i7 & 2) == 0) {
                this.headers = w0.d();
            } else {
                this.headers = map;
            }
        }

        public Blob(String str, @NotNull Map<String, String> headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.apiBaseUrl = str;
            this.headers = headers;
        }

        public /* synthetic */ Blob(String str, Map map, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? w0.d() : map);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/discord/socialrpc/SocialRpcNetworkConfig$Companion;", "", "<init>", "()V", "CONFIG_KEY", "", "json", "Lkotlinx/serialization/json/Json;", "get", "Lcom/discord/socialrpc/SocialRpcNetworkConfig;", "social_rpc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSocialRpcNetworkConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocialRpcNetworkConfig.kt\ncom/discord/socialrpc/SocialRpcNetworkConfig$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,50:1\n1#2:51\n147#3:52\n216#4,2:53\n*S KotlinDebug\n*F\n+ 1 SocialRpcNetworkConfig.kt\ncom/discord/socialrpc/SocialRpcNetworkConfig$Companion\n*L\n31#1:52\n35#1:53,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SocialRpcNetworkConfig get() {
            String item;
            Object objO;
            String apiBaseUrl;
            Cache.Companion companion = Cache.INSTANCE;
            String token$default = Cache.getToken$default(companion.get(), false, 1, null);
            if (token$default != null && (item = companion.get().getItem(SocialRpcNetworkConfig.CONFIG_KEY)) != null) {
                try {
                    q qVar = Result.f14614e;
                    Json json = SocialRpcNetworkConfig.json;
                    json.getClass();
                    objO = (Blob) json.b(Blob.INSTANCE.serializer(), item);
                } catch (Throwable th2) {
                    q qVar2 = Result.f14614e;
                    objO = ib.a.o(th2);
                }
                if (objO instanceof r) {
                    objO = null;
                }
                Blob blob = (Blob) objO;
                if (blob != null && (apiBaseUrl = blob.getApiBaseUrl()) != null) {
                    if (apiBaseUrl.length() <= 0) {
                        apiBaseUrl = null;
                    }
                    if (apiBaseUrl != null) {
                        i builder = new i();
                        for (Map.Entry<String, String> entry : blob.getHeaders().entrySet()) {
                            String key = entry.getKey();
                            String value = entry.getValue();
                            if (value != null && value.length() > 0) {
                                builder.put(key, value);
                            }
                        }
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        return new SocialRpcNetworkConfig(apiBaseUrl, token$default, builder.b());
                    }
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    public SocialRpcNetworkConfig(@NotNull String apiBaseUrl, @NotNull String token, @NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(apiBaseUrl, "apiBaseUrl");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.apiBaseUrl = apiBaseUrl;
        this.token = token;
        this.headers = headers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SocialRpcNetworkConfig copy$default(SocialRpcNetworkConfig socialRpcNetworkConfig, String str, String str2, Map map, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = socialRpcNetworkConfig.apiBaseUrl;
        }
        if ((i7 & 2) != 0) {
            str2 = socialRpcNetworkConfig.token;
        }
        if ((i7 & 4) != 0) {
            map = socialRpcNetworkConfig.headers;
        }
        return socialRpcNetworkConfig.copy(str, str2, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.f14765b = true;
        Json.f14764a = false;
        return Unit.f14616a;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApiBaseUrl() {
        return this.apiBaseUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.headers;
    }

    @NotNull
    public final SocialRpcNetworkConfig copy(@NotNull String apiBaseUrl, @NotNull String token, @NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(apiBaseUrl, "apiBaseUrl");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(headers, "headers");
        return new SocialRpcNetworkConfig(apiBaseUrl, token, headers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialRpcNetworkConfig)) {
            return false;
        }
        SocialRpcNetworkConfig socialRpcNetworkConfig = (SocialRpcNetworkConfig) other;
        return Intrinsics.areEqual(this.apiBaseUrl, socialRpcNetworkConfig.apiBaseUrl) && Intrinsics.areEqual(this.token, socialRpcNetworkConfig.token) && Intrinsics.areEqual(this.headers, socialRpcNetworkConfig.headers);
    }

    @NotNull
    public final String getApiBaseUrl() {
        return this.apiBaseUrl;
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.headers.hashCode() + e.d(this.apiBaseUrl.hashCode() * 31, 31, this.token);
    }

    @NotNull
    public String toString() {
        String str = this.apiBaseUrl;
        String str2 = this.token;
        Map<String, String> map = this.headers;
        StringBuilder sbU = e.u("SocialRpcNetworkConfig(apiBaseUrl=", str, ", token=", str2, ", headers=");
        sbU.append(map);
        sbU.append(")");
        return sbU.toString();
    }
}
