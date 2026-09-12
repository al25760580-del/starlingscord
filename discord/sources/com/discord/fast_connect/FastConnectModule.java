package com.discord.fast_connect;

import com.discord.app_database.AppDatabase;
import com.discord.app_database.DatabaseVersions;
import com.discord.cache.Cache;
import com.discord.codegen.NativeFastConnectModuleSpec;
import com.discord.logging.Log;
import com.discord.tti_manager.TTIMetrics;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.facebook.react.uimanager.ViewProps;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.WebSocket;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0018\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001b0\u001aH\u0014J\u001c\u0010\u001c\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u000fH\u0016J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u000fH\u0016J,\u0010\"\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u00132\u0006\u0010#\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020$2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00132\b\u0010'\u001a\u0004\u0018\u00010\u0013H\u0002J\u0018\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u001a\u0010*\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\bH\u0002R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/discord/fast_connect/FastConnectModule;", "Lcom/discord/codegen/NativeFastConnectModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "sockets", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lokhttp3/WebSocket;", "webSocketModule", "Lcom/facebook/react/modules/websocket/WebSocketModule;", "getWebSocketModule", "()Lcom/facebook/react/modules/websocket/WebSocketModule;", "identified", "", "socketId", "Ljava/lang/Integer;", "identifyUserId", "", "identifyPayload", "requiredDatabaseVersion", "initialize", "", "invalidate", "getTypedExportedConstants", "", "", "setClientState", "userId", "clientState", "setUseChannelObfuscation", ViewProps.ENABLED, "setUseAltGateway", "prepareIdentify", "payload", "", "setCacheValue", "key", "value", "handleWebSocketOpen", "webSocket", "sendIdentify", "fast_connect_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFastConnectModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastConnectModule.kt\ncom/discord/fast_connect/FastConnectModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
public final class FastConnectModule extends NativeFastConnectModuleSpec {
    private boolean identified;

    @NotNull
    private String identifyPayload;
    private String identifyUserId;
    private String requiredDatabaseVersion;
    private Integer socketId;

    @NotNull
    private final ConcurrentHashMap<Integer, WebSocket> sockets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastConnectModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.sockets = new ConcurrentHashMap<>();
        this.identifyPayload = "";
    }

    private final WebSocketModule getWebSocketModule() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            return (WebSocketModule) reactApplicationContextIfActiveOrWarn.getNativeModule(WebSocketModule.class);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleWebSocketOpen(WebSocket webSocket, int socketId) {
        TTIMetrics.record$default(TTIMetrics.INSTANCE, "Native WebSocket opened", 0L, null, false, 14, null);
        if (sendIdentify(webSocket, socketId)) {
            return;
        }
        this.sockets.put(Integer.valueOf(socketId), webSocket);
    }

    private final boolean sendIdentify(WebSocket webSocket, int socketId) {
        Integer num;
        if (webSocket == null || (num = this.socketId) == null || socketId != num.intValue() || this.identified) {
            return false;
        }
        String str = this.identifyUserId;
        DatabaseVersions guildVersions = AppDatabase.INSTANCE.getGuildVersions(str, this.requiredDatabaseVersion);
        String strWithGuildVersions = str != null ? IdentifyPayload.INSTANCE.withGuildVersions(this.identifyPayload, guildVersions) : this.identifyPayload;
        if (!Intrinsics.areEqual(this.identifyPayload, strWithGuildVersions)) {
            Log.i$default(Log.INSTANCE, "FastConnectManagerModule", guildVersions.getGuildVersions().length + " guild_versions added to identify payload", (Throwable) null, 4, (Object) null);
        }
        TTIMetrics.record$default(TTIMetrics.INSTANCE, "Native WebSocket sent identify", 0L, null, false, 14, null);
        webSocket.b(strWithGuildVersions);
        this.identified = true;
        return true;
    }

    private final void setCacheValue(String key, String value) {
        Cache cache = Cache.INSTANCE.get();
        if (value == null) {
            cache.removeItem(key);
        } else {
            cache.setItem(key, value);
        }
    }

    @Override // com.discord.codegen.NativeFastConnectModuleSpec
    @NotNull
    public Map<String, ? extends Object> getTypedExportedConstants() {
        String strP;
        Cache.Companion companion = Cache.INSTANCE;
        Pair pair = new Pair("clientState", companion.get().getItem("_clientStateKey"));
        Pair pair2 = new Pair("userId", companion.get().getItem("_userIdKey"));
        Pair pair3 = new Pair("token", Cache.getToken$default(companion.get(), false, 1, null));
        Pair pair4 = new Pair("useChannelObfuscation", Boolean.valueOf(companion.get().getUseChannelObfuscation()));
        Pair pair5 = new Pair("useAltGateway", Boolean.valueOf(companion.get().getUseAltGateway()));
        String item = companion.get().getItem("analytics_installation");
        if (item == null || (strP = StringsKt.P(item)) == null || strP.length() == 0) {
            strP = null;
        }
        return w0.h(pair, pair2, pair3, pair4, pair5, new Pair("analyticsInstallation", strP));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        WebSocketModule webSocketModule = getWebSocketModule();
        if (webSocketModule != null) {
            webSocketModule.setMOnOpenHandler(new WebSocketModule.OnOpenHandler() { // from class: com.discord.fast_connect.FastConnectModule.initialize.1
                @Override // com.facebook.react.modules.websocket.WebSocketModule.OnOpenHandler
                public void onOpen(WebSocket webSocket, int socketId) {
                    Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                    FastConnectModule.this.handleWebSocketOpen(webSocket, socketId);
                }
            });
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        WebSocketModule webSocketModule = getWebSocketModule();
        if (webSocketModule != null) {
            webSocketModule.setMOnOpenHandler(null);
        }
    }

    @Override // com.discord.codegen.NativeFastConnectModuleSpec
    public void prepareIdentify(String userId, @NotNull String payload, double socketId, String requiredDatabaseVersion) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        int i7 = (int) socketId;
        this.socketId = Integer.valueOf(i7);
        this.identifyUserId = userId;
        this.identifyPayload = payload;
        this.requiredDatabaseVersion = requiredDatabaseVersion;
        sendIdentify(this.sockets.get(Integer.valueOf(i7)), i7);
    }

    @Override // com.discord.codegen.NativeFastConnectModuleSpec
    public void setClientState(String userId, String clientState) {
        setCacheValue("_userIdKey", userId);
        setCacheValue("_clientStateKey", clientState);
    }

    @Override // com.discord.codegen.NativeFastConnectModuleSpec
    public void setUseAltGateway(boolean enabled) {
        Cache.INSTANCE.get().setUseAltGateway(enabled);
    }

    @Override // com.discord.codegen.NativeFastConnectModuleSpec
    public void setUseChannelObfuscation(boolean enabled) {
        Cache.INSTANCE.get().setUseChannelObfuscation(enabled);
    }
}
