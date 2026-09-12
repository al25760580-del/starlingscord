package com.discord.notifications.client;

import android.content.Context;
import ar.b0;
import ar.k0;
import com.discord.cache.Cache;
import com.discord.logging.Log;
import com.discord.media.engine.MediaEngine;
import com.discord.notifications.api.KvMessageEntry;
import com.discord.notifications.api.NotificationData;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageId;
import com.discord.primitives.UserId;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import hr.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.collections.w0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.x;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import pr.b;
import wn.a;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/notifications/client/ChannelMessageFetchManager;", "", "cache", "Lcom/discord/notifications/client/NotificationCache;", "<init>", "(Lcom/discord/notifications/client/NotificationCache;)V", "getCache", "()Lcom/discord/notifications/client/NotificationCache;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "pendingFetches", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lkotlinx/coroutines/Job;", "maybeFetchChannelMessages", "", "context", "Landroid/content/Context;", "notificationData", "Lcom/discord/notifications/api/NotificationData;", "Companion", "notification_client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChannelMessageFetchManager {

    @NotNull
    private static final OkHttpClient sharedHttpClient = new OkHttpClient();

    @NotNull
    private final NotificationCache cache;

    @NotNull
    private final ConcurrentHashMap<String, Job> pendingFetches;

    @NotNull
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: com.discord.notifications.client.ChannelMessageFetchManager$maybeFetchChannelMessages$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.notifications.client.ChannelMessageFetchManager$maybeFetchChannelMessages$1", f = "ChannelMessageFetchManager.kt", l = {MediaEngine.MAX_SUPPORTED_PROTOCOL_VERSION}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nChannelMessageFetchManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelMessageFetchManager.kt\ncom/discord/notifications/client/ChannelMessageFetchManager$maybeFetchChannelMessages$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n*L\n1#1,172:1\n1563#2:173\n1634#2,3:174\n1563#2:177\n1634#2,3:178\n113#3:181\n*S KotlinDebug\n*F\n+ 1 ChannelMessageFetchManager.kt\ncom/discord/notifications/client/ChannelMessageFetchManager$maybeFetchChannelMessages$1\n*L\n130#1:173\n130#1:174,3\n137#1:177\n137#1:178,3\n158#1:181\n*E\n"})
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $cacheUserId;
        final /* synthetic */ long $channelId;
        final /* synthetic */ Context $context;
        final /* synthetic */ long $debounceMs;
        final /* synthetic */ NotificationData $notificationData;
        final /* synthetic */ Request $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, Request request, long j5, NotificationData notificationData, String str, Context context, Continuation continuation) {
            super(2, continuation);
            this.$debounceMs = j;
            this.$request = request;
            this.$channelId = j5;
            this.$notificationData = notificationData;
            this.$cacheUserId = str;
            this.$context = context;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$debounceMs, this.$request, this.$channelId, this.$notificationData, this.$cacheUserId, this.$context, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.collections.n0] */
        /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            String strString;
            String strA;
            JsonElement jsonElement;
            ?? arrayList;
            a aVar = a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                long j = this.$debounceMs;
                if (j > 0) {
                    this.label = 1;
                    if (b0.j(j, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            try {
                Response responseE = ChannelMessageFetchManager.sharedHttpClient.a(this.$request).e();
                long j5 = this.$channelId;
                NotificationData notificationData = this.$notificationData;
                String str = this.$cacheUserId;
                Context context = this.$context;
                try {
                    if (!responseE.g()) {
                        Unit unit = Unit.f14616a;
                        responseE.close();
                        return unit;
                    }
                    ResponseBody responseBody = responseE.f17385y;
                    if (responseBody != null && (strString = responseBody.string()) != null) {
                        Iterator it = pr.h.i(Json.f14760d.d(strString)).f14768d.iterator();
                        while (it.hasNext()) {
                            JsonObject jsonObjectJ = pr.h.j((JsonElement) it.next());
                            Object obj2 = jsonObjectJ.get(StackTraceHelper.ID_KEY);
                            JsonPrimitive jsonPrimitive = obj2 instanceof JsonPrimitive ? (JsonPrimitive) obj2 : null;
                            if (jsonPrimitive != null && (strA = jsonPrimitive.a()) != null && (jsonElement = (JsonElement) jsonObjectJ.get("author")) != null) {
                                JsonObject jsonObjectJ2 = pr.h.j(jsonElement);
                                JsonElement jsonElement2 = (JsonElement) jsonObjectJ.get("mentions");
                                if (jsonElement2 != null) {
                                    kotlinx.serialization.json.a aVarI = pr.h.i(jsonElement2);
                                    arrayList = new ArrayList(e0.l(aVarI, 10));
                                    Iterator it2 = aVarI.f14768d.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add(pr.h.j((JsonElement) it2.next()));
                                    }
                                } else {
                                    arrayList = n0.f14659d;
                                }
                                n0 n0Var = n0.f14659d;
                                ArrayList arrayListV = CollectionsKt.V(c0.c(jsonObjectJ2), arrayList);
                                ArrayList arrayList2 = new ArrayList(e0.l(arrayListV, 10));
                                Iterator it3 = arrayListV.iterator();
                                while (it3.hasNext()) {
                                    LinkedHashMap linkedHashMapN = w0.n((JsonObject) it3.next());
                                    linkedHashMapN.put("incomplete", pr.h.a(Boolean.TRUE));
                                    arrayList2.add(new JsonObject(linkedHashMapN));
                                }
                                KvMessageEntry kvMessageEntry = new KvMessageEntry(n0Var, arrayList2, jsonObjectJ, MessageId.m1157constructorimpl(strA), j5, null);
                                GuildId guildIdM1091getGuildIdqOKuAAo = notificationData.m1091getGuildIdqOKuAAo();
                                String strM1150toStringimpl = guildIdM1091getGuildIdqOKuAAo != null ? GuildId.m1150toStringimpl(guildIdM1091getGuildIdqOKuAAo.m1152unboximpl()) : null;
                                KvMessageCache kvMessageCache = KvMessageCache.INSTANCE;
                                String strM1137toStringimpl = ChannelId.m1137toStringimpl(j5);
                                b bVar = Json.f14760d;
                                bVar.getClass();
                                kvMessageCache.putMessage(context, "@account." + str, strM1150toStringimpl, strM1137toStringimpl, strA, bVar.c(KvMessageEntry.INSTANCE.serializer(), kvMessageEntry));
                            }
                        }
                        Unit unit2 = Unit.f14616a;
                        responseE.close();
                        return Unit.f14616a;
                    }
                    Unit unit3 = Unit.f14616a;
                    responseE.close();
                    return unit3;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ls.d.k(responseE, th2);
                        throw th3;
                    }
                }
            } catch (Exception e10) {
                Log.INSTANCE.e("ChannelMessageFetchManager", "Failed to fetch channel messages", e10);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    public ChannelMessageFetchManager(@NotNull NotificationCache cache) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.cache = cache;
        e eVar = k0.f2938a;
        this.scope = b0.b(hr.d.f11103i);
        this.pendingFetches = new ConcurrentHashMap<>();
    }

    @NotNull
    public final NotificationCache getCache() {
        return this.cache;
    }

    public final void maybeFetchChannelMessages(@NotNull Context context, @NotNull NotificationData notificationData) {
        String token$default;
        String item;
        UserId userIdM1094getReceivingUserIdwUX8bhU;
        String strF;
        ChannelId channelIdM1090getChannelIdqMVnFVQ;
        Long lM;
        String strF2;
        String strF3;
        Long lM2;
        String strF4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notificationData, "notificationData");
        Cache.Companion companion = Cache.INSTANCE;
        String item2 = companion.get().getItem("notificationNetworkRequest");
        if (item2 == null || (token$default = Cache.getToken$default(companion.get(), false, 1, null)) == null || (item = companion.get().getItem("_userIdKey")) == null || (userIdM1094getReceivingUserIdwUX8bhU = notificationData.m1094getReceivingUserIdwUX8bhU()) == null || !Intrinsics.areEqual(item, UserId.m1215toStringimpl(userIdM1094getReceivingUserIdwUX8bhU.m1217unboximpl()))) {
            return;
        }
        try {
            JsonObject jsonObjectJ = pr.h.j(Json.f14760d.d(item2));
            Object obj = jsonObjectJ.get(ViewProps.ENABLED);
            JsonPrimitive jsonPrimitive = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
            if (jsonPrimitive != null) {
                Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
                String strA = jsonPrimitive.a();
                String[] strArr = qr.c0.f19000a;
                Intrinsics.checkNotNullParameter(strA, "<this>");
                Boolean bool = x.i(strA, "true", true) ? Boolean.TRUE : x.i(strA, "false", true) ? Boolean.FALSE : null;
                if (bool == null || !bool.booleanValue()) {
                    return;
                }
                Object obj2 = jsonObjectJ.get("userId");
                JsonPrimitive jsonPrimitive2 = obj2 instanceof JsonPrimitive ? (JsonPrimitive) obj2 : null;
                if (jsonPrimitive2 == null || (strF = pr.h.f(jsonPrimitive2)) == null || !Intrinsics.areEqual(strF, item) || (channelIdM1090getChannelIdqMVnFVQ = notificationData.m1090getChannelIdqMVnFVQ()) == null) {
                    return;
                }
                long jM1139unboximpl = channelIdM1090getChannelIdqMVnFVQ.m1139unboximpl();
                Object obj3 = jsonObjectJ.get("cooldownMs");
                JsonPrimitive jsonPrimitive3 = obj3 instanceof JsonPrimitive ? (JsonPrimitive) obj3 : null;
                if (jsonPrimitive3 == null || (lM = pr.h.m(jsonPrimitive3)) == null) {
                    return;
                }
                long jLongValue = lM.longValue();
                long jLongValue2 = 0;
                if (jLongValue > 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long jM1104getChannelMessagesFetchRanmJqaSGE = this.cache.m1104getChannelMessagesFetchRanmJqaSGE(context, jM1139unboximpl);
                    if (jCurrentTimeMillis < jM1104getChannelMessagesFetchRanmJqaSGE) {
                        this.cache.m1105setChannelMessagesFetchRanmJqaSGE(context, jM1139unboximpl);
                        return;
                    } else if (jCurrentTimeMillis < jM1104getChannelMessagesFetchRanmJqaSGE + jLongValue) {
                        return;
                    } else {
                        this.cache.m1105setChannelMessagesFetchRanmJqaSGE(context, jM1139unboximpl);
                    }
                }
                Object obj4 = jsonObjectJ.get("apiBaseUrl");
                JsonPrimitive jsonPrimitive4 = obj4 instanceof JsonPrimitive ? (JsonPrimitive) obj4 : null;
                if (jsonPrimitive4 == null || (strF2 = pr.h.f(jsonPrimitive4)) == null) {
                    return;
                }
                Object obj5 = jsonObjectJ.get("urlQueryParams");
                JsonPrimitive jsonPrimitive5 = obj5 instanceof JsonPrimitive ? (JsonPrimitive) obj5 : null;
                if (jsonPrimitive5 == null || (strF3 = pr.h.f(jsonPrimitive5)) == null) {
                    return;
                }
                Request.Builder builder = new Request.Builder();
                builder.i(strF2 + "/channels/" + ChannelId.m1137toStringimpl(jM1139unboximpl) + "/messages" + strF3);
                builder.f("GET", null);
                builder.a("Authorization", token$default);
                Object obj6 = jsonObjectJ.get("headers");
                JsonObject jsonObject = obj6 instanceof JsonObject ? (JsonObject) obj6 : null;
                if (jsonObject == null) {
                    return;
                }
                for (Map.Entry entry : jsonObject.f14766d.entrySet()) {
                    String str = (String) entry.getKey();
                    JsonElement jsonElement = (JsonElement) entry.getValue();
                    JsonPrimitive jsonPrimitive6 = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
                    if (jsonPrimitive6 != null && (strF4 = pr.h.f(jsonPrimitive6)) != null) {
                        builder.a(str, strF4);
                    }
                }
                Object obj7 = jsonObjectJ.get("debounceMs");
                JsonPrimitive jsonPrimitive7 = obj7 instanceof JsonPrimitive ? (JsonPrimitive) obj7 : null;
                if (jsonPrimitive7 != null && (lM2 = pr.h.m(jsonPrimitive7)) != null) {
                    jLongValue2 = lM2.longValue();
                }
                long j = jLongValue2;
                String strM1137toStringimpl = ChannelId.m1137toStringimpl(jM1139unboximpl);
                Request requestB = builder.b();
                Job jobRemove = this.pendingFetches.remove(strM1137toStringimpl);
                if (jobRemove != null) {
                    jobRemove.f(null);
                }
                this.pendingFetches.put(strM1137toStringimpl, b0.t(this.scope, null, new AnonymousClass1(j, requestB, jM1139unboximpl, notificationData, item, context, null), 3));
            }
        } catch (Exception unused) {
        }
    }
}
