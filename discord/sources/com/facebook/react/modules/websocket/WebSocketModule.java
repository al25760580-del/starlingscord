package com.facebook.react.modules.websocket;

import a3.e;
import com.facebook.fbreact.specs.NativeWebSocketModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.network.CustomClientBuilder;
import com.facebook.react.modules.network.ForwardingCookieHandler;
import com.facebook.react.modules.network.OkHttpClientProvider;
import com.reactnativecommunity.webview.RNCWebViewManager;
import cs.y;
import io.sentry.hints.j;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.x;
import o8.a;
import okhttp3.CookieJar;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = "WebSocketModule")
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 72\u00020\u0001:\u0003567B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000bJ,\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010\u001a2\u0006\u0010#\u001a\u00020$H\u0016J\"\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010\u00182\u0006\u0010#\u001a\u00020$H\u0016J\u0018\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$H\u0016J\u0018\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$H\u0016J\u0016\u0010*\u001a\u00020\u00152\u0006\u0010,\u001a\u00020-2\u0006\u0010\u001c\u001a\u00020\bJ\u0010\u0010.\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$H\u0016J\u001a\u0010/\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u0018H\u0002J\u0012\u00100\u001a\u0004\u0018\u00010\u00182\u0006\u00101\u001a\u00020\u0018H\u0002J\u0010\u00102\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u00020$H\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u00068"}, d2 = {"Lcom/facebook/react/modules/websocket/WebSocketModule;", "Lcom/facebook/fbreact/specs/NativeWebSocketModuleSpec;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "webSocketConnections", "", "", "Lokhttp3/WebSocket;", "contentHandlers", "Lcom/facebook/react/modules/websocket/WebSocketModule$ContentHandler;", "cookieHandler", "Lcom/facebook/react/modules/network/ForwardingCookieHandler;", "mOnOpenHandler", "Lcom/facebook/react/modules/websocket/WebSocketModule$OnOpenHandler;", "getMOnOpenHandler", "()Lcom/facebook/react/modules/websocket/WebSocketModule$OnOpenHandler;", "setMOnOpenHandler", "(Lcom/facebook/react/modules/websocket/WebSocketModule$OnOpenHandler;)V", "invalidate", "", "sendEvent", "eventName", "", "params", "Lcom/facebook/react/bridge/ReadableMap;", "setContentHandler", StackTraceHelper.ID_KEY, "contentHandler", "connect", "url", "protocols", "Lcom/facebook/react/bridge/ReadableArray;", "options", "socketID", "", "close", "code", "reason", "send", "message", "sendBinary", "base64String", "byteString", "Lokio/ByteString;", "ping", "notifyWebSocketFailed", "getCookie", "uri", "addListener", "removeListeners", "count", "ContentHandler", "OnOpenHandler", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebSocketModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketModule.kt\ncom/facebook/react/modules/websocket/WebSocketModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ReadableMapBuilder.kt\ncom/facebook/react/bridge/ReadableMapBuilderKt\n*L\n1#1,421:1\n1#2:422\n30#3,3:423\n30#3,3:426\n30#3,3:429\n30#3,3:432\n30#3,3:435\n30#3,3:438\n30#3,3:441\n30#3,3:444\n30#3,3:447\n*S KotlinDebug\n*F\n+ 1 WebSocketModule.kt\ncom/facebook/react/modules/websocket/WebSocketModule\n*L\n238#1:423,3\n243#1:426,3\n265#1:429,3\n270#1:432,3\n292#1:435,3\n297#1:438,3\n319#1:441,3\n324#1:444,3\n342#1:447,3\n*E\n"})
public final class WebSocketModule extends NativeWebSocketModuleSpec {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String NAME = "WebSocketModule";
    private static CustomClientBuilder customClientBuilder;

    @NotNull
    private final Map<Integer, ContentHandler> contentHandlers;

    @NotNull
    private final ForwardingCookieHandler cookieHandler;
    private OnOpenHandler mOnOpenHandler;

    @NotNull
    private final Map<Integer, WebSocket> webSocketConnections;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/modules/websocket/WebSocketModule$Companion;", "", "<init>", "()V", "NAME", "", "customClientBuilder", "Lcom/facebook/react/modules/network/CustomClientBuilder;", "setCustomClientBuilder", "", "ccb", "applyCustomBuilder", "builder", "Lokhttp3/OkHttpClient$Builder;", "getDefaultOrigin", "uri", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void applyCustomBuilder(OkHttpClient.Builder builder) {
            CustomClientBuilder customClientBuilder = WebSocketModule.customClientBuilder;
            if (customClientBuilder != null) {
                customClientBuilder.apply(builder);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:20:0x0035 A[Catch: URISyntaxException -> 0x0092, TryCatch #0 {URISyntaxException -> 0x0092, blocks: (B:2:0x0000, B:4:0x000b, B:14:0x0027, B:20:0x0035, B:28:0x004f, B:31:0x0058, B:33:0x007b, B:17:0x002e, B:21:0x003a, B:25:0x0045), top: B:37:0x0000 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x004d  */
        public final String getDefaultOrigin(String uri) {
            String scheme;
            try {
                URI uri2 = new URI(uri);
                String scheme2 = uri2.getScheme();
                if (scheme2 != null) {
                    int iHashCode = scheme2.hashCode();
                    scheme = "http";
                    if (iHashCode != 3804) {
                        if (iHashCode != 118039) {
                            if (iHashCode != 3213448) {
                                if (iHashCode == 99617003 && scheme2.equals("https")) {
                                    scheme = uri2.getScheme();
                                } else {
                                    scheme = "";
                                }
                            } else if (scheme2.equals("http")) {
                                scheme = uri2.getScheme();
                            } else {
                                scheme = "";
                            }
                        } else if (scheme2.equals("wss")) {
                            scheme = "https";
                        } else {
                            scheme = "";
                        }
                    } else if (!scheme2.equals("ws")) {
                        scheme = "";
                    }
                } else {
                    scheme = "";
                }
                if (uri2.getPort() == -1) {
                    return scheme + "://" + uri2.getHost();
                }
                return scheme + "://" + uri2.getHost() + ":" + uri2.getPort();
            } catch (URISyntaxException unused) {
                throw new IllegalArgumentException(g.e("Unable to set ", uri, " as default origin header"));
            }
        }

        public final void setCustomClientBuilder(CustomClientBuilder ccb) {
            WebSocketModule.customClientBuilder = ccb;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/modules/websocket/WebSocketModule$ContentHandler;", "", "onMessage", "", "text", "", "params", "Lcom/facebook/react/bridge/WritableMap;", "byteString", "Lokio/ByteString;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ContentHandler {
        void onMessage(@NotNull String text, @NotNull WritableMap params);

        void onMessage(@NotNull ByteString byteString, @NotNull WritableMap params);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/modules/websocket/WebSocketModule$OnOpenHandler;", "", "onOpen", "", "webSocket", "Lokhttp3/WebSocket;", "socketId", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnOpenHandler {
        void onOpen(@NotNull WebSocket webSocket, int socketId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketModule(@NotNull ReactApplicationContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.webSocketConnections = new ConcurrentHashMap();
        this.contentHandlers = new ConcurrentHashMap();
        this.cookieHandler = new ForwardingCookieHandler();
    }

    private final String getCookie(String uri) {
        try {
            List<String> list = this.cookieHandler.get(new URI(INSTANCE.getDefaultOrigin(uri)), new HashMap()).get("Cookie");
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            return null;
        } catch (IOException unused) {
            throw new IllegalArgumentException(e.l("Unable to get cookie from ", uri));
        } catch (URISyntaxException unused2) {
            throw new IllegalArgumentException(e.l("Unable to get cookie from ", uri));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyWebSocketFailed(int id2, String message) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put(StackTraceHelper.ID_KEY, id2);
        readableMapBuilder.put("message", message);
        sendEvent("websocketFailed", writableMapCreateMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendEvent(String eventName, ReadableMap params) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        if (reactApplicationContext.hasActiveReactInstance()) {
            reactApplicationContext.emitDeviceEvent(eventName, params);
        }
    }

    public static final void setCustomClientBuilder(CustomClientBuilder customClientBuilder2) {
        INSTANCE.setCustomClientBuilder(customClientBuilder2);
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void addListener(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void close(double code, String reason, double socketID) {
        int i7 = (int) socketID;
        WebSocket webSocket = this.webSocketConnections.get(Integer.valueOf(i7));
        if (webSocket == null) {
            return;
        }
        try {
            webSocket.c((int) code, reason);
            this.webSocketConnections.remove(Integer.valueOf(i7));
            this.contentHandlers.remove(Integer.valueOf(i7));
        } catch (Exception e10) {
            a.h(ReactConstants.TAG, "Could not close WebSocket connection for id " + i7, e10);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void connect(@NotNull String url, ReadableArray protocols, ReadableMap options, double socketID) {
        boolean z5;
        Intrinsics.checkNotNullParameter(url, "url");
        final int i7 = (int) socketID;
        OkHttpClient.Builder builderB = OkHttpClientProvider.getOkHttpClient().b();
        builderB.b(CookieJar.f17312t);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builderB.a(10L, timeUnit);
        builderB.d(10L, timeUnit);
        builderB.c(0L, TimeUnit.MINUTES);
        INSTANCE.applyCustomBuilder(builderB);
        OkHttpClient okHttpClient = new OkHttpClient(builderB);
        Request.Builder builder = new Request.Builder();
        builder.h(Integer.valueOf(i7));
        builder.i(url);
        String cookie = getCookie(url);
        if (cookie != null) {
            builder.a("Cookie", cookie);
        }
        if (options != null && options.hasKey("headers") && options.getType("headers") == ReadableType.Map) {
            ReadableMap map = options.getMap("headers");
            if (map == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
            z5 = false;
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                if (ReadableType.String == map.getType(strNextKey)) {
                    if (x.i(strNextKey, "origin", true)) {
                        z5 = true;
                    }
                    String string = map.getString(strNextKey);
                    if (string == null) {
                        throw new IllegalStateException(g.e("value for name ", strNextKey, " == null").toString());
                    }
                    builder.a(strNextKey, string);
                } else {
                    a.v(ReactConstants.TAG, "Ignoring: requested " + strNextKey + ", value not a string");
                }
            }
        } else {
            z5 = false;
        }
        if (!z5) {
            builder.a("origin", INSTANCE.getDefaultOrigin(url));
        }
        if (protocols != null && protocols.size() > 0) {
            StringBuilder sb2 = new StringBuilder("");
            int size = protocols.size();
            for (int i10 = 0; i10 < size; i10++) {
                String string2 = protocols.getString(i10);
                String string3 = string2 != null ? StringsKt.b0(string2).toString() : null;
                if (!(string3 == null || string3.length() == 0) && !StringsKt.D(string3, ",", false)) {
                    sb2.append(string3);
                    sb2.append(",");
                }
            }
            if (sb2.length() > 0) {
                sb2.replace(sb2.length() - 1, sb2.length(), "");
                String string4 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                builder.a("Sec-WebSocket-Protocol", string4);
            }
        }
        okHttpClient.c(builder.b(), new y() { // from class: com.facebook.react.modules.websocket.WebSocketModule.connect.2
            @Override // cs.y
            public void onClosed(WebSocket webSocket, int code, String reason) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(reason, "reason");
                int i11 = i7;
                WritableMap writableMapCreateMap = Arguments.createMap();
                ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                readableMapBuilder.put(StackTraceHelper.ID_KEY, i11);
                readableMapBuilder.put("code", code);
                readableMapBuilder.put("reason", reason);
                WebSocketModule.this.sendEvent("websocketClosed", writableMapCreateMap);
            }

            @Override // cs.y
            public void onClosing(WebSocket websocket, int code, String reason) {
                Intrinsics.checkNotNullParameter(websocket, "websocket");
                Intrinsics.checkNotNullParameter(reason, "reason");
                websocket.c(code, reason);
            }

            @Override // cs.y
            public void onFailure(WebSocket webSocket, Throwable t5, Response response) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(t5, "t");
                WebSocketModule.this.notifyWebSocketFailed(i7, t5.getMessage());
            }

            @Override // cs.y
            public void onMessage(WebSocket webSocket, String text) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(text, "text");
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt(StackTraceHelper.ID_KEY, i7);
                writableMapCreateMap.putString("type", "text");
                ContentHandler contentHandler = (ContentHandler) WebSocketModule.this.contentHandlers.get(Integer.valueOf(i7));
                if (contentHandler != null) {
                    contentHandler.onMessage(text, writableMapCreateMap);
                } else {
                    writableMapCreateMap.putString("data", text);
                }
                WebSocketModule.this.sendEvent("websocketMessage", writableMapCreateMap);
            }

            @Override // cs.y
            public void onOpen(WebSocket webSocket, Response response) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(response, "response");
                WebSocketModule.this.webSocketConnections.put(Integer.valueOf(i7), webSocket);
                int i11 = i7;
                WritableMap writableMapCreateMap = Arguments.createMap();
                ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                readableMapBuilder.put(StackTraceHelper.ID_KEY, i11);
                readableMapBuilder.put("protocol", response.f("Sec-WebSocket-Protocol", ""));
                WebSocketModule.this.sendEvent("websocketOpen", writableMapCreateMap);
                OnOpenHandler mOnOpenHandler = WebSocketModule.this.getMOnOpenHandler();
                if (mOnOpenHandler != null) {
                    mOnOpenHandler.onOpen(webSocket, i7);
                }
            }

            @Override // cs.y
            public void onMessage(WebSocket webSocket, ByteString bytes) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(bytes, "bytes");
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt(StackTraceHelper.ID_KEY, i7);
                writableMapCreateMap.putString("type", "binary");
                ContentHandler contentHandler = (ContentHandler) WebSocketModule.this.contentHandlers.get(Integer.valueOf(i7));
                if (contentHandler != null) {
                    contentHandler.onMessage(bytes, writableMapCreateMap);
                } else {
                    writableMapCreateMap.putString("data", bytes.a());
                }
                WebSocketModule.this.sendEvent("websocketMessage", writableMapCreateMap);
            }
        });
    }

    public final OnOpenHandler getMOnOpenHandler() {
        return this.mOnOpenHandler;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        Iterator<WebSocket> it = this.webSocketConnections.values().iterator();
        while (it.hasNext()) {
            it.next().c(RNCWebViewManager.COMMAND_CLEAR_CACHE, null);
        }
        this.webSocketConnections.clear();
        this.contentHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void ping(double socketID) {
        int i7 = (int) socketID;
        WebSocket webSocket = this.webSocketConnections.get(Integer.valueOf(i7));
        if (webSocket != null) {
            try {
                webSocket.a(ByteString.f17414v);
                return;
            } catch (Exception e10) {
                notifyWebSocketFailed(i7, e10.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put(StackTraceHelper.ID_KEY, i7);
        readableMapBuilder.put("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
        readableMapBuilder2.put(StackTraceHelper.ID_KEY, i7);
        readableMapBuilder2.put("code", 0);
        readableMapBuilder2.put("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.webSocketConnections.remove(Integer.valueOf(i7));
        this.contentHandlers.remove(Integer.valueOf(i7));
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void removeListeners(double count) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void send(@NotNull String message, double socketID) {
        Intrinsics.checkNotNullParameter(message, "message");
        int i7 = (int) socketID;
        WebSocket webSocket = this.webSocketConnections.get(Integer.valueOf(i7));
        if (webSocket != null) {
            try {
                webSocket.b(message);
                return;
            } catch (Exception e10) {
                notifyWebSocketFailed(i7, e10.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put(StackTraceHelper.ID_KEY, i7);
        readableMapBuilder.put("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
        readableMapBuilder2.put(StackTraceHelper.ID_KEY, i7);
        readableMapBuilder2.put("code", 0);
        readableMapBuilder2.put("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.webSocketConnections.remove(Integer.valueOf(i7));
        this.contentHandlers.remove(Integer.valueOf(i7));
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void sendBinary(@NotNull String base64String, double socketID) {
        Intrinsics.checkNotNullParameter(base64String, "base64String");
        int i7 = (int) socketID;
        WebSocket webSocket = this.webSocketConnections.get(Integer.valueOf(i7));
        if (webSocket != null) {
            try {
                ByteString byteString = ByteString.f17414v;
                Intrinsics.checkNotNullParameter(base64String, "string");
                ByteString byteStringW = j.w(base64String);
                if (byteStringW == null) {
                    throw new IllegalStateException("bytes == null");
                }
                webSocket.a(byteStringW);
                return;
            } catch (Exception e10) {
                notifyWebSocketFailed(i7, e10.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put(StackTraceHelper.ID_KEY, i7);
        readableMapBuilder.put("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
        readableMapBuilder2.put(StackTraceHelper.ID_KEY, i7);
        readableMapBuilder2.put("code", 0);
        readableMapBuilder2.put("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.webSocketConnections.remove(Integer.valueOf(i7));
        this.contentHandlers.remove(Integer.valueOf(i7));
    }

    public final void setContentHandler(int id2, ContentHandler contentHandler) {
        if (contentHandler == null) {
            this.contentHandlers.remove(Integer.valueOf(id2));
        } else {
            this.contentHandlers.put(Integer.valueOf(id2), contentHandler);
        }
    }

    public final void setMOnOpenHandler(OnOpenHandler onOpenHandler) {
        this.mOnOpenHandler = onOpenHandler;
    }

    public final void sendBinary(@NotNull ByteString byteString, int id2) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        WebSocket webSocket = this.webSocketConnections.get(Integer.valueOf(id2));
        if (webSocket == null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
            readableMapBuilder.put(StackTraceHelper.ID_KEY, id2);
            readableMapBuilder.put("message", "client is null");
            sendEvent("websocketFailed", writableMapCreateMap);
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
            readableMapBuilder2.put(StackTraceHelper.ID_KEY, id2);
            readableMapBuilder2.put("code", 0);
            readableMapBuilder2.put("reason", "client is null");
            sendEvent("websocketClosed", writableMapCreateMap2);
            this.webSocketConnections.remove(Integer.valueOf(id2));
            this.contentHandlers.remove(Integer.valueOf(id2));
            return;
        }
        try {
            webSocket.a(byteString);
        } catch (Exception e10) {
            notifyWebSocketFailed(id2, e10.getMessage());
        }
    }
}
