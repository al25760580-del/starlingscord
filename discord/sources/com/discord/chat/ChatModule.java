package com.discord.chat;

import android.content.Context;
import ar.b0;
import ar.q1;
import ar.u;
import ar.u0;
import com.discord.chat.bridge.ErrorMessage;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.row.MessageRow;
import com.discord.chat.bridge.row.Row;
import com.discord.chat.bridge.scroll.ChatScrollData;
import com.discord.chat.listmanager.ChatListManager;
import com.discord.chatreplay.logger.ReleaseRowLogger;
import com.discord.chatreplay.logger.RowLogger;
import com.discord.client_info.ClientInfo;
import com.discord.codegen.NativeChatModuleSpec;
import com.discord.crash_reporting.CrashReporting;
import com.discord.logging.PIIKt;
import com.discord.serialization.SerializerUtils;
import com.discord.tti_manager.TTIMetrics;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kk.b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.w0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import ls.d;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import wn.a;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016JJ\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/discord/chat/ChatModule;", "Lcom/discord/codegen/NativeChatModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "invalidate", "", "updateRows", "tagValue", "", "rowsJSON", "", "isLoadingAtTop", "", "scrollDataJSON", "changesetUpdateIdValue", "HACK_iOSForceAnimations", "forceReload", "isAnimated", "clearRows", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChatModule extends NativeChatModuleSpec {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Json json = d.e(new u(22));

    @NotNull
    private static final Map<Integer, ChatListManager> listManagers;

    @NotNull
    private static final CoroutineScope moduleScope;
    private static int previousRowUpdateTag;

    @NotNull
    private static final Map<Integer, RowLogger> rowUpdateLoggers;

    @NotNull
    private final ReactApplicationContext reactContext;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001d¨\u0006!"}, d2 = {"Lcom/discord/chat/ChatModule$Companion;", "", "<init>", "()V", "", "tag", "Lkotlin/Function2;", "Lcom/discord/chat/listmanager/ChatListManager;", "Lkotlin/coroutines/Continuation;", "", "block", "withChatManager", "(ILkotlin/jvm/functions/Function2;)V", "Landroid/content/Context;", "context", "Lcom/discord/chatreplay/logger/RowLogger;", "rowUpdateLoggerFor", "(Landroid/content/Context;I)Lcom/discord/chatreplay/logger/RowLogger;", "cancelCoroutineChildren", "getChatListManager", "(I)Lcom/discord/chat/listmanager/ChatListManager;", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/Json;", "Lkotlinx/coroutines/CoroutineScope;", "moduleScope", "Lkotlinx/coroutines/CoroutineScope;", "", "listManagers", "Ljava/util/Map;", "previousRowUpdateTag", "I", "rowUpdateLoggers", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nChatModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatModule.kt\ncom/discord/chat/ChatModule$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,194:1\n384#2,7:195\n384#2,7:202\n*S KotlinDebug\n*F\n+ 1 ChatModule.kt\ncom/discord/chat/ChatModule$Companion\n*L\n159#1:195,7\n173#1:202,7\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void cancelCoroutineChildren() {
            b0.h(ChatModule.moduleScope.getCoroutineContext(), new CancellationException(b.j(Reflection.getOrCreateKotlinClass(ChatModule.class).getSimpleName(), " invalidate()")));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final RowLogger rowUpdateLoggerFor(Context context, int tag) {
            Map map = ChatModule.rowUpdateLoggers;
            Integer numValueOf = Integer.valueOf(tag);
            Object releaseRowLogger = map.get(numValueOf);
            if (releaseRowLogger == null) {
                releaseRowLogger = new ReleaseRowLogger();
                map.put(numValueOf, releaseRowLogger);
            }
            return (RowLogger) releaseRowLogger;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void withChatManager(int tag, Function2<? super ChatListManager, ? super Continuation, ? extends Object> block) {
            b0.t(ChatModule.moduleScope, null, new ChatModule$Companion$withChatManager$1(block, getChatListManager(tag), null), 3);
        }

        @NotNull
        public final synchronized ChatListManager getChatListManager(int tag) {
            Object chatListManager;
            try {
                Map map = ChatModule.listManagers;
                Integer numValueOf = Integer.valueOf(tag);
                chatListManager = map.get(numValueOf);
                if (chatListManager == null) {
                    chatListManager = new ChatListManager(ChatModule.moduleScope);
                    map.put(numValueOf, chatListManager);
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return (ChatListManager) chatListManager;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.ChatModule$clearRows$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "manager", "Lcom/discord/chat/listmanager/ChatListManager;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.chat.ChatModule$clearRows$1", f = "ChatModule.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<ChatListManager, Continuation, Object> {
        final /* synthetic */ int $changesetUpdateId;
        final /* synthetic */ int $tag;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i7, int i10, Continuation continuation) {
            super(2, continuation);
            this.$tag = i7;
            this.$changesetUpdateId = i10;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = ChatModule.this.new AnonymousClass1(this.$tag, this.$changesetUpdateId, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ChatListManager chatListManager, Continuation continuation) {
            return ((AnonymousClass1) create(chatListManager, continuation)).invokeSuspend(Unit.f14616a);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            ChatListManager chatListManager = (ChatListManager) this.L$0;
            ChatModule.INSTANCE.rowUpdateLoggerFor(ChatModule.this.reactContext, this.$tag).logRowsClear();
            chatListManager.clearRows(this.$changesetUpdateId);
            return Unit.f14616a;
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.ChatModule$updateRows$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "manager", "Lcom/discord/chat/listmanager/ChatListManager;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.chat.ChatModule$updateRows$1", f = "ChatModule.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nChatModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatModule.kt\ncom/discord/chat/ChatModule$updateRows$1\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,194:1\n147#2:195\n147#2:196\n1878#3,2:197\n1869#3,2:199\n1880#3:201\n*S KotlinDebug\n*F\n+ 1 ChatModule.kt\ncom/discord/chat/ChatModule$updateRows$1\n*L\n60#1:195\n62#1:196\n71#1:197,2\n83#1:199,2\n71#1:201\n*E\n"})
    public static final class C01131 extends h implements Function2<ChatListManager, Continuation, Object> {
        final /* synthetic */ int $changesetUpdateId;
        final /* synthetic */ boolean $forceReload;
        final /* synthetic */ String $rowsJSON;
        final /* synthetic */ String $scrollDataJSON;
        final /* synthetic */ int $tag;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01131(int i7, String str, String str2, int i10, boolean z5, Continuation continuation) {
            super(2, continuation);
            this.$tag = i7;
            this.$rowsJSON = str;
            this.$scrollDataJSON = str2;
            this.$changesetUpdateId = i10;
            this.$forceReload = z5;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            C01131 c01131 = ChatModule.this.new C01131(this.$tag, this.$rowsJSON, this.$scrollDataJSON, this.$changesetUpdateId, this.$forceReload, continuation);
            c01131.L$0 = obj;
            return c01131;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ChatListManager chatListManager, Continuation continuation) {
            return ((C01131) create(chatListManager, continuation)).invokeSuspend(Unit.f14616a);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            ChatScrollData chatScrollData;
            a aVar = a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            ChatListManager chatListManager = (ChatListManager) this.L$0;
            ChatModule.INSTANCE.rowUpdateLoggerFor(ChatModule.this.reactContext, this.$tag).logRowsUpdate(this.$rowsJSON);
            try {
                Json json = ChatModule.json;
                String str = this.$rowsJSON;
                json.getClass();
                List<? extends Row> list = (List) json.b(new or.d(Row.INSTANCE.serializer(), 0), str);
                if (this.$scrollDataJSON != null) {
                    Json json2 = ChatModule.json;
                    String str2 = this.$scrollDataJSON;
                    json2.getClass();
                    chatScrollData = (ChatScrollData) json2.b(ChatScrollData.INSTANCE.serializer(), str2);
                } else {
                    chatScrollData = null;
                }
                chatListManager.updateRows(list, chatScrollData, this.$changesetUpdateId, this.$forceReload);
                if (!ClientInfo.INSTANCE.isProdBuild()) {
                    String str3 = this.$rowsJSON;
                    int i7 = 0;
                    for (Object obj2 : list) {
                        int i10 = i7 + 1;
                        if (i7 < 0) {
                            d0.k();
                            throw null;
                        }
                        Row row = (Row) obj2;
                        MessageRow messageRow = row instanceof MessageRow ? (MessageRow) row : null;
                        if ((messageRow != null ? messageRow.getMessage() : null) instanceof ErrorMessage) {
                            JSONObject jSONObject = new JSONArray(str3).getJSONObject(i7);
                            SerializerUtils serializerUtils = SerializerUtils.INSTANCE;
                            String string = jSONObject.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            SerializerUtils.SerializerError serializerErrorFindErroringFields = serializerUtils.findErroringFields(string, Reflection.getOrCreateKotlinClass(Message.class));
                            List<String> pIIFieldNames = PIIKt.getPIIFieldNames(Reflection.getOrCreateKotlinClass(Message.class));
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            if (serializerErrorFindErroringFields instanceof SerializerUtils.SerializerError.Data) {
                                Iterator<T> it = ((SerializerUtils.SerializerError.Data) serializerErrorFindErroringFields).getData().entrySet().iterator();
                                while (it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    if (pIIFieldNames.contains(entry.getKey())) {
                                        linkedHashMap.put(entry.getKey(), "<REDACTED>");
                                    } else {
                                        linkedHashMap.put(entry.getKey(), entry.getValue());
                                    }
                                }
                                CrashReporting crashReporting = CrashReporting.INSTANCE;
                                CrashReporting.addBreadcrumb$default(crashReporting, "Message Deserialization Error", linkedHashMap, null, null, false, 28, null);
                                CrashReporting.captureException$default(crashReporting, new Exception("Could not deserialize message. Bad Fields: " + CollectionsKt.O(((SerializerUtils.SerializerError.Data) serializerErrorFindErroringFields).getData().keySet(), ",", null, null, null, 62)), false, 2, null);
                            }
                        }
                        i7 = i10;
                    }
                }
            } catch (Exception e10) {
                CrashReporting crashReporting2 = CrashReporting.INSTANCE;
                CrashReporting.addBreadcrumb$default(crashReporting2, "Bad row update", w0.g(new Pair("tag", String.valueOf(this.$tag)), new Pair("tagRowSize", String.valueOf(chatListManager.getRowCount())), new Pair("previousTag", String.valueOf(ChatModule.previousRowUpdateTag)), new Pair("previousTagRowSize", String.valueOf(ChatModule.INSTANCE.getChatListManager(ChatModule.previousRowUpdateTag).getRowCount()))), null, null, false, 28, null);
                CrashReporting.captureException$default(crashReporting2, new Exception("Failed to update rows", e10), false, 2, null);
                String str4 = this.$rowsJSON;
                String message = e10.getMessage();
                Intrinsics.checkNotNull(message);
                chatListManager.handleError(str4, message, this.$changesetUpdateId);
            }
            TTIMetrics.record$default(TTIMetrics.INSTANCE, "ChatModule.updateRows() Finish", 0L, null, false, 14, null);
            Companion companion = ChatModule.INSTANCE;
            ChatModule.previousRowUpdateTag = this.$tag;
            return Unit.f14616a;
        }
    }

    static {
        q1 q1Var = new q1();
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        moduleScope = b0.b(e.c(q1Var, new u0(executorServiceNewSingleThreadExecutor)));
        listManagers = new LinkedHashMap();
        previousRowUpdateTag = -1;
        rowUpdateLoggers = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.f14765b = true;
        return Unit.f14616a;
    }

    @Override // com.discord.codegen.NativeChatModuleSpec
    public void clearRows(double tagValue, double changesetUpdateIdValue) {
        int i7 = (int) tagValue;
        INSTANCE.withChatManager(i7, new AnonymousClass1(i7, (int) changesetUpdateIdValue, null));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        INSTANCE.cancelCoroutineChildren();
    }

    @Override // com.discord.codegen.NativeChatModuleSpec
    public void updateRows(double tagValue, @NotNull String rowsJSON, boolean isLoadingAtTop, String scrollDataJSON, double changesetUpdateIdValue, boolean HACK_iOSForceAnimations, boolean forceReload, boolean isAnimated) {
        Intrinsics.checkNotNullParameter(rowsJSON, "rowsJSON");
        int i7 = (int) tagValue;
        TTIMetrics.record$default(TTIMetrics.INSTANCE, "ChatModule.updateRows() Start", 0L, null, false, 14, null);
        INSTANCE.withChatManager(i7, new C01131(i7, rowsJSON, scrollDataJSON, (int) changesetUpdateIdValue, forceReload, null));
    }
}
