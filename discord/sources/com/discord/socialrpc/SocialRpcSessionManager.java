package com.discord.socialrpc;

import a3.e;
import ar.b0;
import ar.k0;
import ar.q1;
import co.s;
import com.appsflyer.AppsFlyerProperties;
import com.discord.notifications.renderer.NotificationRenderer;
import com.discord.socialsdk.rpc.IDiscordRpcCallback;
import com.facebook.react.devsupport.StackTraceHelper;
import cr.n;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import kr.f;
import ls.l;
import or.s1;
import org.jetbrains.annotations.NotNull;
import pr.q;
import rn.r;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003FGHB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020#J\u0016\u0010$\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nJ\u000e\u0010'\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\nJ\u001e\u0010(\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u001bH\u0082@¢\u0006\u0002\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020\nH\u0002J,\u0010.\u001a\u00020%2\u0006\u0010)\u001a\u00020\u001b2\f\u0010/\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00102\u001a\u00020\bH\u0082@¢\u0006\u0002\u00103J\u001e\u00104\u001a\u00020%2\u0006\u0010)\u001a\u00020\u001b2\f\u00105\u001a\b\u0012\u0004\u0012\u00020100H\u0002J&\u00106\u001a\u00020%2\u0006\u0010)\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\n2\f\u00105\u001a\b\u0012\u0004\u0012\u00020100H\u0002J \u00107\u001a\u00020%2\u0006\u0010)\u001a\u00020\u001b2\u0006\u00108\u001a\u00020,2\u0006\u00109\u001a\u00020\u0018H\u0002J\u0018\u0010:\u001a\u00020%2\u0006\u0010)\u001a\u00020\u001b2\u0006\u00108\u001a\u00020,H\u0002J\u0018\u0010;\u001a\u00020%2\u0006\u0010)\u001a\u00020\u001b2\u0006\u0010<\u001a\u00020\u0018H\u0002J\u001a\u0010=\u001a\u0004\u0018\u0001012\u0006\u0010)\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\nH\u0002J$\u0010>\u001a\u00020%2\u0006\u0010)\u001a\u00020\u001b2\b\u0010?\u001a\u0004\u0018\u00010\n2\b\u0010@\u001a\u0004\u0018\u00010\u0018H\u0002J\"\u0010A\u001a\u00020%2\u0006\u0010)\u001a\u00020\u001b2\b\u0010?\u001a\u0004\u0018\u00010\n2\u0006\u0010B\u001a\u00020\nH\u0002J\u0018\u0010C\u001a\u00020%2\u0006\u0010)\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\nH\u0002J \u0010D\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u001b2\u0006\u0010B\u001a\u00020\nH\u0002J\u0010\u0010E\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001b0\u001aj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001b`\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/discord/socialrpc/SocialRpcSessionManager;", "", "<init>", "()V", "MAX_CONNECTIONS", "", "MAX_QUEUED_FRAMES", "MIN_UPDATE_INTERVAL_MS", "", "CMD_SET_ACTIVITY", "", "CMD_DISPATCH", "EVT_READY", "EVT_ERROR", "RPC_VERSION", "RPC_ERROR_UNKNOWN", "CLOSE_NORMAL", "scope", "Lkotlinx/coroutines/CoroutineScope;", "http", "Lcom/discord/socialrpc/SocialRpcHttp;", "json", "Lkotlinx/serialization/json/Json;", "PLACEHOLDER_USER", "Lkotlinx/serialization/json/JsonObject;", "connections", "Ljava/util/HashMap;", "Lcom/discord/socialrpc/SocialRpcSessionManager$Connection;", "Lkotlin/collections/HashMap;", "onConnect", "", "connectionId", "applicationId", "version", "callback", "Lcom/discord/socialsdk/rpc/IDiscordRpcCallback;", "onFrame", "", "frame", "onDisconnect", "runConnection", "connection", "(Ljava/lang/String;Lcom/discord/socialrpc/SocialRpcSessionManager$Connection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "configFor", "Lcom/discord/socialrpc/SocialRpcNetworkConfig;", "authToken", "awaitUpdateWindow", "pending", "", "Lcom/discord/socialrpc/SocialRpcSessionManager$Update;", "deadline", "(Lcom/discord/socialrpc/SocialRpcSessionManager$Connection;Ljava/util/List;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "drain", "into", "addParsed", "applyUpdate", "config", "activity", "applyClear", "sendReady", "user", "parseSetActivity", "ackActivity", "nonce", "data", "errorActivity", "message", "sendFrame", "closeAndCleanup", "cleanup", "SetActivityFrame", "Update", "Connection", "social_rpc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSocialRpcSessionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocialRpcSessionManager.kt\ncom/discord/socialrpc/SocialRpcSessionManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n+ 5 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,316:1\n1#2:317\n543#3,6:318\n543#3,6:324\n1761#3,3:330\n29#4,3:333\n29#4,3:337\n29#4,3:340\n29#4,3:343\n147#5:336\n*S KotlinDebug\n*F\n+ 1 SocialRpcSessionManager.kt\ncom/discord/socialrpc/SocialRpcSessionManager\n*L\n140#1:318,6\n144#1:324,6\n190#1:330,3\n234#1:333,3\n280#1:337,3\n290#1:340,3\n47#1:343,3\n248#1:336\n*E\n"})
public final class SocialRpcSessionManager {
    private static final int CLOSE_NORMAL = 1000;

    @NotNull
    private static final String CMD_DISPATCH = "DISPATCH";

    @NotNull
    private static final String CMD_SET_ACTIVITY = "SET_ACTIVITY";

    @NotNull
    private static final String EVT_ERROR = "ERROR";

    @NotNull
    private static final String EVT_READY = "READY";

    @NotNull
    public static final SocialRpcSessionManager INSTANCE = new SocialRpcSessionManager();
    private static final int MAX_CONNECTIONS = 10;
    private static final int MAX_QUEUED_FRAMES = 32;
    private static final long MIN_UPDATE_INTERVAL_MS = 5000;

    @NotNull
    private static final JsonObject PLACEHOLDER_USER;
    private static final int RPC_ERROR_UNKNOWN = 1000;
    private static final int RPC_VERSION = 1;

    @NotNull
    private static final HashMap<String, Connection> connections;

    @NotNull
    private static final SocialRpcHttp http;

    @NotNull
    private static final Json json;

    @NotNull
    private static final CoroutineScope scope;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/discord/socialrpc/SocialRpcSessionManager$Connection;", "", "applicationId", "", "version", "", "callback", "Lcom/discord/socialsdk/rpc/IDiscordRpcCallback;", "<init>", "(JLjava/lang/String;Lcom/discord/socialsdk/rpc/IDiscordRpcCallback;)V", "getApplicationId", "()J", "getVersion", "()Ljava/lang/String;", "getCallback", "()Lcom/discord/socialsdk/rpc/IDiscordRpcCallback;", AppsFlyerProperties.CHANNEL, "Lkotlinx/coroutines/channels/Channel;", "getChannel", "()Lkotlinx/coroutines/channels/Channel;", "token", "getToken", "setToken", "(Ljava/lang/String;)V", "social_rpc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Connection {
        private final long applicationId;

        @NotNull
        private final IDiscordRpcCallback callback;

        @NotNull
        private final Channel channel;
        private String token;

        @NotNull
        private final String version;

        public Connection(long j, @NotNull String version, @NotNull IDiscordRpcCallback callback) {
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.applicationId = j;
            this.version = version;
            this.callback = callback;
            this.channel = l.a(32, 4, cr.a.f7343e);
        }

        public final long getApplicationId() {
            return this.applicationId;
        }

        @NotNull
        public final IDiscordRpcCallback getCallback() {
            return this.callback;
        }

        @NotNull
        public final Channel getChannel() {
            return this.channel;
        }

        public final String getToken() {
            return this.token;
        }

        @NotNull
        public final String getVersion() {
            return this.version;
        }

        public final void setToken(String str) {
            this.token = str;
        }
    }

    @f
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0003$%&B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\nHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006'"}, d2 = {"Lcom/discord/socialrpc/SocialRpcSessionManager$SetActivityFrame;", "", "cmd", "", "nonce", "args", "Lcom/discord/socialrpc/SocialRpcSessionManager$SetActivityFrame$Args;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/socialrpc/SocialRpcSessionManager$SetActivityFrame$Args;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/discord/socialrpc/SocialRpcSessionManager$SetActivityFrame$Args;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCmd", "()Ljava/lang/String;", "getNonce", "getArgs", "()Lcom/discord/socialrpc/SocialRpcSessionManager$SetActivityFrame$Args;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$social_rpc_release", "Args", "$serializer", "Companion", "social_rpc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SetActivityFrame {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final Args args;
        private final String cmd;
        private final String nonce;

        @f
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J%\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\b\u001cR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/discord/socialrpc/SocialRpcSessionManager$SetActivityFrame$Args;", "", "activity", "Lkotlinx/serialization/json/JsonObject;", "<init>", "(Lkotlinx/serialization/json/JsonObject;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getActivity", "()Lkotlinx/serialization/json/JsonObject;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$social_rpc_release", "$serializer", "Companion", "social_rpc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Args {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);
            private final JsonObject activity;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/socialrpc/SocialRpcSessionManager$SetActivityFrame$Args$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/socialrpc/SocialRpcSessionManager$SetActivityFrame$Args;", "social_rpc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return SocialRpcSessionManager$SetActivityFrame$Args$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Args() {
                this((JsonObject) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public static /* synthetic */ Args copy$default(Args args, JsonObject jsonObject, int i7, Object obj) {
                if ((i7 & 1) != 0) {
                    jsonObject = args.activity;
                }
                return args.copy(jsonObject);
            }

            public static final /* synthetic */ void write$Self$social_rpc_release(Args self, CompositeEncoder output, SerialDescriptor serialDesc) {
                if (!output.u(serialDesc, 0) && self.activity == null) {
                    return;
                }
                output.r(serialDesc, 0, q.f18539a, self.activity);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final JsonObject getActivity() {
                return this.activity;
            }

            @NotNull
            public final Args copy(JsonObject activity) {
                return new Args(activity);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Args) && Intrinsics.areEqual(this.activity, ((Args) other).activity);
            }

            public final JsonObject getActivity() {
                return this.activity;
            }

            public int hashCode() {
                JsonObject jsonObject = this.activity;
                if (jsonObject == null) {
                    return 0;
                }
                return jsonObject.f14766d.hashCode();
            }

            @NotNull
            public String toString() {
                return "Args(activity=" + this.activity + ")";
            }

            public /* synthetic */ Args(int i7, JsonObject jsonObject, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i7 & 1) == 0) {
                    this.activity = null;
                } else {
                    this.activity = jsonObject;
                }
            }

            public Args(JsonObject jsonObject) {
                this.activity = jsonObject;
            }

            public /* synthetic */ Args(JsonObject jsonObject, int i7, DefaultConstructorMarker defaultConstructorMarker) {
                this((i7 & 1) != 0 ? null : jsonObject);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/socialrpc/SocialRpcSessionManager$SetActivityFrame$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/socialrpc/SocialRpcSessionManager$SetActivityFrame;", "social_rpc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return SocialRpcSessionManager$SetActivityFrame$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public SetActivityFrame() {
            this((String) null, (String) null, (Args) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ SetActivityFrame copy$default(SetActivityFrame setActivityFrame, String str, String str2, Args args, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = setActivityFrame.cmd;
            }
            if ((i7 & 2) != 0) {
                str2 = setActivityFrame.nonce;
            }
            if ((i7 & 4) != 0) {
                args = setActivityFrame.args;
            }
            return setActivityFrame.copy(str, str2, args);
        }

        public static final /* synthetic */ void write$Self$social_rpc_release(SetActivityFrame self, CompositeEncoder output, SerialDescriptor serialDesc) {
            if (output.u(serialDesc, 0) || self.cmd != null) {
                output.r(serialDesc, 0, s1.f17602a, self.cmd);
            }
            if (output.u(serialDesc, 1) || self.nonce != null) {
                output.r(serialDesc, 1, s1.f17602a, self.nonce);
            }
            if (!output.u(serialDesc, 2) && self.args == null) {
                return;
            }
            output.r(serialDesc, 2, SocialRpcSessionManager$SetActivityFrame$Args$$serializer.INSTANCE, self.args);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCmd() {
            return this.cmd;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getNonce() {
            return this.nonce;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Args getArgs() {
            return this.args;
        }

        @NotNull
        public final SetActivityFrame copy(String cmd, String nonce, Args args) {
            return new SetActivityFrame(cmd, nonce, args);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetActivityFrame)) {
                return false;
            }
            SetActivityFrame setActivityFrame = (SetActivityFrame) other;
            return Intrinsics.areEqual(this.cmd, setActivityFrame.cmd) && Intrinsics.areEqual(this.nonce, setActivityFrame.nonce) && Intrinsics.areEqual(this.args, setActivityFrame.args);
        }

        public final Args getArgs() {
            return this.args;
        }

        public final String getCmd() {
            return this.cmd;
        }

        public final String getNonce() {
            return this.nonce;
        }

        public int hashCode() {
            String str = this.cmd;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.nonce;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Args args = this.args;
            return iHashCode2 + (args != null ? args.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.cmd;
            String str2 = this.nonce;
            Args args = this.args;
            StringBuilder sbU = e.u("SetActivityFrame(cmd=", str, ", nonce=", str2, ", args=");
            sbU.append(args);
            sbU.append(")");
            return sbU.toString();
        }

        public /* synthetic */ SetActivityFrame(int i7, String str, String str2, Args args, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i7 & 1) == 0) {
                this.cmd = null;
            } else {
                this.cmd = str;
            }
            if ((i7 & 2) == 0) {
                this.nonce = null;
            } else {
                this.nonce = str2;
            }
            if ((i7 & 4) == 0) {
                this.args = null;
            } else {
                this.args = args;
            }
        }

        public SetActivityFrame(String str, String str2, Args args) {
            this.cmd = str;
            this.nonce = str2;
            this.args = args;
        }

        public /* synthetic */ SetActivityFrame(String str, String str2, Args args, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : args);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/socialrpc/SocialRpcSessionManager$Update;", "", "Set", "Clear", "Lcom/discord/socialrpc/SocialRpcSessionManager$Update$Clear;", "Lcom/discord/socialrpc/SocialRpcSessionManager$Update$Set;", "social_rpc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Update {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/discord/socialrpc/SocialRpcSessionManager$Update$Clear;", "Lcom/discord/socialrpc/SocialRpcSessionManager$Update;", "<init>", "()V", "social_rpc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Clear implements Update {

            @NotNull
            public static final Clear INSTANCE = new Clear();

            private Clear() {
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/discord/socialrpc/SocialRpcSessionManager$Update$Set;", "Lcom/discord/socialrpc/SocialRpcSessionManager$Update;", "activity", "Lkotlinx/serialization/json/JsonObject;", "<init>", "(Lkotlinx/serialization/json/JsonObject;)V", "getActivity", "()Lkotlinx/serialization/json/JsonObject;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "social_rpc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Set implements Update {

            @NotNull
            private final JsonObject activity;

            public Set(@NotNull JsonObject activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.activity = activity;
            }

            public static /* synthetic */ Set copy$default(Set set, JsonObject jsonObject, int i7, Object obj) {
                if ((i7 & 1) != 0) {
                    jsonObject = set.activity;
                }
                return set.copy(jsonObject);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final JsonObject getActivity() {
                return this.activity;
            }

            @NotNull
            public final Set copy(@NotNull JsonObject activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                return new Set(activity);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Set) && Intrinsics.areEqual(this.activity, ((Set) other).activity);
            }

            @NotNull
            public final JsonObject getActivity() {
                return this.activity;
            }

            public int hashCode() {
                return this.activity.f14766d.hashCode();
            }

            @NotNull
            public String toString() {
                return "Set(activity=" + this.activity + ")";
            }
        }
    }

    /* JADX INFO: renamed from: com.discord.socialrpc.SocialRpcSessionManager$awaitUpdateWindow$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.socialrpc.SocialRpcSessionManager", f = "SocialRpcSessionManager.kt", l = {184}, m = "awaitUpdateWindow")
    public static final class AnonymousClass1 extends xn.c {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SocialRpcSessionManager.this.awaitUpdateWindow(null, null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.discord.socialrpc.SocialRpcSessionManager$onConnect$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.socialrpc.SocialRpcSessionManager$onConnect$1", f = "SocialRpcSessionManager.kt", l = {105}, m = "invokeSuspend")
    public static final class C02241 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Connection $connection;
        final /* synthetic */ String $connectionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02241(String str, Connection connection, Continuation continuation) {
            super(2, continuation);
            this.$connectionId = str;
            this.$connection = connection;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new C02241(this.$connectionId, this.$connection, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                SocialRpcSessionManager socialRpcSessionManager = SocialRpcSessionManager.INSTANCE;
                String str = this.$connectionId;
                Connection connection = this.$connection;
                this.label = 1;
                if (socialRpcSessionManager.runConnection(str, connection, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C02241) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.socialrpc.SocialRpcSessionManager$runConnection$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.socialrpc.SocialRpcSessionManager", f = "SocialRpcSessionManager.kt", l = {136, 143}, m = "runConnection")
    public static final class C02251 extends xn.c {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C02251(Continuation continuation) {
            super(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SocialRpcSessionManager.this.runConnection(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        q1 q1Var = new q1();
        hr.e eVar = k0.f2938a;
        scope = b0.b(kotlin.coroutines.e.c(q1Var, hr.d.f11103i));
        http = new SocialRpcHttp(null, 1, null == true ? 1 : 0);
        json = ls.d.e(new b(2));
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        io.sentry.config.a.Q(jsonObjectBuilder, StackTraceHelper.ID_KEY, "0");
        io.sentry.config.a.Q(jsonObjectBuilder, NotificationRenderer.USERNAME, "Discord User");
        io.sentry.config.a.Q(jsonObjectBuilder, "discriminator", "0");
        Boolean bool = Boolean.FALSE;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "<this>");
        Intrinsics.checkNotNullParameter("bot", "key");
        jsonObjectBuilder.b("bot", pr.h.a(bool));
        io.sentry.config.a.P(jsonObjectBuilder, "flags", 0);
        io.sentry.config.a.P(jsonObjectBuilder, "premium_type", 0);
        PLACEHOLDER_USER = jsonObjectBuilder.a();
        connections = new HashMap<>();
    }

    private SocialRpcSessionManager() {
    }

    private final void ackActivity(Connection connection, String nonce, JsonObject data) {
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        io.sentry.config.a.Q(jsonObjectBuilder, "cmd", CMD_SET_ACTIVITY);
        JsonElement jsonElement = data;
        if (data == null) {
            jsonElement = JsonNull.INSTANCE;
        }
        jsonObjectBuilder.b("data", jsonElement);
        jsonObjectBuilder.b("evt", JsonNull.INSTANCE);
        io.sentry.config.a.Q(jsonObjectBuilder, "nonce", nonce);
        sendFrame(connection, jsonObjectBuilder.a().toString());
    }

    private final void addParsed(Connection connection, String frame, List<Update> into) {
        Update setActivity = parseSetActivity(connection, frame);
        if (setActivity != null) {
            into.add(setActivity);
        }
    }

    private final void applyClear(Connection connection, SocialRpcNetworkConfig config) {
        String token = connection.getToken();
        if (token == null) {
            return;
        }
        try {
            rn.q qVar = Result.f14614e;
            http.deleteSession(config, token);
            Unit unit = Unit.f14616a;
        } catch (Throwable th2) {
            rn.q qVar2 = Result.f14614e;
            ib.a.o(th2);
        }
        connection.setToken(null);
    }

    private final void applyUpdate(Connection connection, SocialRpcNetworkConfig config, JsonObject activity) {
        Object objO;
        Object objO2;
        try {
            rn.q qVar = Result.f14614e;
            objO = http.updateSession(config, connection.getToken(), activity);
        } catch (Throwable th2) {
            rn.q qVar2 = Result.f14614e;
            objO = ib.a.o(th2);
        }
        Throwable thA = Result.a(objO);
        if (thA != null) {
            try {
                String token = connection.getToken();
                if (token == null || token.length() == 0) {
                    throw thA;
                }
                objO2 = http.updateSession(config, null, activity);
                objO = objO2;
            } catch (Throwable th3) {
                rn.q qVar3 = Result.f14614e;
                objO2 = ib.a.o(th3);
            }
        }
        if (Result.a(objO) == null) {
            connection.setToken((String) objO);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:38:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:? A[LOOP:0: B:30:0x007d->B:40:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0060 -> B:20:0x0063). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object awaitUpdateWindow(com.discord.socialrpc.SocialRpcSessionManager.Connection r9, java.util.List<com.discord.socialrpc.SocialRpcSessionManager.Update> r10, long r11, kotlin.coroutines.Continuation r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof com.discord.socialrpc.SocialRpcSessionManager.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r13
            com.discord.socialrpc.SocialRpcSessionManager$awaitUpdateWindow$1 r0 = (com.discord.socialrpc.SocialRpcSessionManager.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.discord.socialrpc.SocialRpcSessionManager$awaitUpdateWindow$1 r0 = new com.discord.socialrpc.SocialRpcSessionManager$awaitUpdateWindow$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            wn.a r1 = wn.a.f22354d
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            long r9 = r0.J$0
            java.lang.Object r11 = r0.L$1
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r0.L$0
            com.discord.socialrpc.SocialRpcSessionManager$Connection r12 = (com.discord.socialrpc.SocialRpcSessionManager.Connection) r12
            ib.a.L(r13)
            r6 = r9
            r10 = r11
            r9 = r12
            r11 = r6
            goto L63
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            ib.a.L(r13)
        L40:
            long r4 = java.lang.System.currentTimeMillis()
            int r13 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r13 >= 0) goto L90
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r11 - r4
            com.discord.socialrpc.SocialRpcSessionManager$awaitUpdateWindow$next$1 r13 = new com.discord.socialrpc.SocialRpcSessionManager$awaitUpdateWindow$next$1
            r2 = 0
            r13.<init>(r9, r2)
            r0.L$0 = r9
            r0.L$1 = r10
            r0.J$0 = r11
            r0.label = r3
            java.lang.Object r13 = ar.x1.c(r4, r13, r0)
            if (r13 != r1) goto L63
            return r1
        L63:
            java.lang.String r13 = (java.lang.String) r13
            if (r13 != 0) goto L6a
            kotlin.Unit r9 = kotlin.Unit.f14616a
            return r9
        L6a:
            r8.addParsed(r9, r13, r10)
            r8.drain(r9, r10)
            if (r10 == 0) goto L79
            boolean r13 = r10.isEmpty()
            if (r13 == 0) goto L79
            goto L40
        L79:
            java.util.Iterator r13 = r10.iterator()
        L7d:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r13.next()
            com.discord.socialrpc.SocialRpcSessionManager$Update r2 = (com.discord.socialrpc.SocialRpcSessionManager.Update) r2
            boolean r2 = r2 instanceof com.discord.socialrpc.SocialRpcSessionManager.Update.Clear
            if (r2 == 0) goto L7d
            kotlin.Unit r9 = kotlin.Unit.f14616a
            return r9
        L90:
            kotlin.Unit r9 = kotlin.Unit.f14616a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.socialrpc.SocialRpcSessionManager.awaitUpdateWindow(com.discord.socialrpc.SocialRpcSessionManager$Connection, java.util.List, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final synchronized void cleanup(String connectionId) {
        Channel channel;
        Connection connectionRemove = connections.remove(connectionId);
        if (connectionRemove != null && (channel = connectionRemove.getChannel()) != null) {
            channel.b(null);
        }
    }

    private final void closeAndCleanup(String connectionId, Connection connection, String message) {
        try {
            rn.q qVar = Result.f14614e;
            connection.getCallback().onClose(1000, message);
            Unit unit = Unit.f14616a;
        } catch (Throwable th2) {
            rn.q qVar2 = Result.f14614e;
            ib.a.o(th2);
        }
        cleanup(connectionId);
    }

    private final SocialRpcNetworkConfig configFor(String authToken) {
        SocialRpcNetworkConfig socialRpcNetworkConfig = SocialRpcNetworkConfig.INSTANCE.get();
        if (socialRpcNetworkConfig == null || !Intrinsics.areEqual(socialRpcNetworkConfig.getToken(), authToken)) {
            return null;
        }
        return socialRpcNetworkConfig;
    }

    private final void drain(Connection connection, List<Update> into) {
        while (true) {
            String str = (String) n.a(connection.getChannel().j());
            if (str == null) {
                return;
            } else {
                addParsed(connection, str, into);
            }
        }
    }

    private final void errorActivity(Connection connection, String nonce, String message) {
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        io.sentry.config.a.Q(jsonObjectBuilder, "cmd", CMD_SET_ACTIVITY);
        io.sentry.config.a.R(jsonObjectBuilder, "data", new com.discord.chat.bridge.spoiler.a(message, 7));
        io.sentry.config.a.Q(jsonObjectBuilder, "evt", EVT_ERROR);
        io.sentry.config.a.Q(jsonObjectBuilder, "nonce", nonce);
        sendFrame(connection, jsonObjectBuilder.a().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit errorActivity$lambda$22$lambda$21(String str, JsonObjectBuilder putJsonObject) {
        Intrinsics.checkNotNullParameter(putJsonObject, "$this$putJsonObject");
        io.sentry.config.a.P(putJsonObject, "code", 1000);
        io.sentry.config.a.Q(putJsonObject, "message", str);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.f14765b = true;
        Json.f14764a = false;
        return Unit.f14616a;
    }

    private final Update parseSetActivity(Connection connection, String frame) {
        Object objO;
        Object objO2;
        try {
            rn.q qVar = Result.f14614e;
            Json json2 = json;
            json2.getClass();
            objO = (SetActivityFrame) json2.b(SetActivityFrame.INSTANCE.serializer(), frame);
        } catch (Throwable th2) {
            rn.q qVar2 = Result.f14614e;
            objO = ib.a.o(th2);
        }
        if (objO instanceof r) {
            objO = null;
        }
        SetActivityFrame setActivityFrame = (SetActivityFrame) objO;
        if (setActivityFrame == null || !Intrinsics.areEqual(setActivityFrame.getCmd(), CMD_SET_ACTIVITY)) {
            return null;
        }
        String nonce = setActivityFrame.getNonce();
        if (nonce == null || nonce.length() <= 0) {
            nonce = null;
        }
        SetActivityFrame.Args args = setActivityFrame.getArgs();
        JsonObject activity = args != null ? args.getActivity() : null;
        if (activity == null) {
            ackActivity(connection, nonce, null);
            return Update.Clear.INSTANCE;
        }
        try {
            objO2 = SocialRpcActivityBuilder.INSTANCE.build(String.valueOf(connection.getApplicationId()), null, activity);
        } catch (Throwable th3) {
            rn.q qVar3 = Result.f14614e;
            objO2 = ib.a.o(th3);
        }
        if (objO2 instanceof r) {
            objO2 = null;
        }
        JsonObject jsonObject = (JsonObject) objO2;
        if (jsonObject == null) {
            errorActivity(connection, nonce, "invalid activity");
            return null;
        }
        ackActivity(connection, nonce, jsonObject);
        return new Update.Set(jsonObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:47:0x0115  */
    /* JADX WARN: Code duplicated, block: B:62:0x014d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0155  */
    /* JADX WARN: Code duplicated, block: B:69:0x015d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0163  */
    /* JADX WARN: Code duplicated, block: B:73:0x016b  */
    /* JADX WARN: Code duplicated, block: B:74:0x016d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0177  */
    /* JADX WARN: Code duplicated, block: B:77:0x017b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0183  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6 A[EDGE_INSN: B:85:0x00f6->B:42:0x00f6 BREAK  A[LOOP:1: B:34:0x00df->B:87:?], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0115 -> B:48:0x011d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x014d -> B:63:0x0151). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object runConnection(java.lang.String r19, com.discord.socialrpc.SocialRpcSessionManager.Connection r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.socialrpc.SocialRpcSessionManager.runConnection(java.lang.String, com.discord.socialrpc.SocialRpcSessionManager$Connection, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void sendFrame(Connection connection, String frame) {
        try {
            rn.q qVar = Result.f14614e;
            connection.getCallback().onFrame(frame);
            Unit unit = Unit.f14616a;
        } catch (Throwable th2) {
            rn.q qVar2 = Result.f14614e;
            ib.a.o(th2);
        }
    }

    private final void sendReady(Connection connection, JsonObject user) {
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        io.sentry.config.a.Q(jsonObjectBuilder, "cmd", CMD_DISPATCH);
        io.sentry.config.a.Q(jsonObjectBuilder, "evt", EVT_READY);
        jsonObjectBuilder.b("nonce", JsonNull.INSTANCE);
        io.sentry.config.a.R(jsonObjectBuilder, "data", new s(21, user));
        sendFrame(connection, jsonObjectBuilder.a().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendReady$lambda$16$lambda$15(JsonObject jsonObject, JsonObjectBuilder putJsonObject) {
        Intrinsics.checkNotNullParameter(putJsonObject, "$this$putJsonObject");
        io.sentry.config.a.P(putJsonObject, "v", 1);
        io.sentry.config.a.R(putJsonObject, "config", new b(3));
        putJsonObject.b("user", jsonObject);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendReady$lambda$16$lambda$15$lambda$14(JsonObjectBuilder putJsonObject) {
        Intrinsics.checkNotNullParameter(putJsonObject, "$this$putJsonObject");
        return Unit.f14616a;
    }

    public final synchronized boolean onConnect(@NotNull String connectionId, long applicationId, @NotNull String version, @NotNull IDiscordRpcCallback callback) {
        Intrinsics.checkNotNullParameter(connectionId, "connectionId");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(callback, "callback");
        HashMap<String, Connection> map = connections;
        if (map.size() >= 10) {
            return false;
        }
        Connection connection = new Connection(applicationId, version, callback);
        map.put(connectionId, connection);
        b0.t(scope, null, new C02241(connectionId, connection, null), 3);
        return true;
    }

    public final void onDisconnect(@NotNull String connectionId) {
        Connection connection;
        Intrinsics.checkNotNullParameter(connectionId, "connectionId");
        synchronized (this) {
            connection = connections.get(connectionId);
        }
        if (connection == null) {
            return;
        }
        connection.getChannel().b(null);
    }

    public final void onFrame(@NotNull String connectionId, @NotNull String frame) {
        Connection connection;
        Intrinsics.checkNotNullParameter(connectionId, "connectionId");
        Intrinsics.checkNotNullParameter(frame, "frame");
        synchronized (this) {
            connection = connections.get(connectionId);
        }
        if (connection == null) {
            return;
        }
        connection.getChannel().o(frame);
    }
}
