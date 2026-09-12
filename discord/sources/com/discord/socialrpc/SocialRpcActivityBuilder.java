package com.discord.socialrpc;

import com.facebook.react.devsupport.StackTraceHelper;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import pr.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\nJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002J\u000e\u0010\u0015\u001a\u00020\u0016*\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/discord/socialrpc/SocialRpcActivityBuilder;", "", "<init>", "()V", "DEFAULT_ACTIVITY_NAME", "", "PLATFORM_ANDROID", "ACTIVITY_TYPE_PLAYING", "", "build", "Lkotlinx/serialization/json/JsonObject;", "applicationId", "applicationName", "activity", "transformParty", "Lkotlinx/serialization/json/JsonElement;", "party", "transformPartySize", "size", "transformTimestamps", "timestamps", "isNullOrJsonNull", "", "social_rpc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSocialRpcActivityBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocialRpcActivityBuilder.kt\ncom/discord/socialrpc/SocialRpcActivityBuilder\n+ 2 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n29#2,2:98\n31#2:101\n29#2,3:102\n29#2,3:105\n29#2,3:108\n1#3:100\n*S KotlinDebug\n*F\n+ 1 SocialRpcActivityBuilder.kt\ncom/discord/socialrpc/SocialRpcActivityBuilder\n*L\n34#1:98,2\n34#1:101\n57#1:102,3\n73#1:105,3\n82#1:108,3\n*E\n"})
public final class SocialRpcActivityBuilder {
    private static final int ACTIVITY_TYPE_PLAYING = 0;

    @NotNull
    private static final String DEFAULT_ACTIVITY_NAME = "Game";

    @NotNull
    public static final SocialRpcActivityBuilder INSTANCE = new SocialRpcActivityBuilder();

    @NotNull
    private static final String PLATFORM_ANDROID = "android";

    private SocialRpcActivityBuilder() {
    }

    private final boolean isNullOrJsonNull(JsonElement jsonElement) {
        return jsonElement == null || (jsonElement instanceof JsonNull);
    }

    private final JsonElement transformParty(JsonElement party) {
        JsonObject jsonObject = party instanceof JsonObject ? (JsonObject) party : null;
        if (jsonObject == null) {
            return party;
        }
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (Intrinsics.areEqual(key, "privacy")) {
                Unit unit = Unit.f14616a;
            } else if (Intrinsics.areEqual(key, "size")) {
                jsonObjectBuilder.b("size", INSTANCE.transformPartySize(value));
            } else {
                jsonObjectBuilder.b(key, value);
            }
        }
        return jsonObjectBuilder.a();
    }

    private final JsonElement transformPartySize(JsonElement size) {
        kotlinx.serialization.json.a aVar = size instanceof kotlinx.serialization.json.a ? (kotlinx.serialization.json.a) size : null;
        if (aVar != null) {
            List list = aVar.f14768d;
            if (list.size() >= 2) {
                JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                jsonObjectBuilder.b("current", (JsonElement) list.get(0));
                jsonObjectBuilder.b("max", (JsonElement) list.get(1));
                return jsonObjectBuilder.a();
            }
        }
        return size;
    }

    private final JsonElement transformTimestamps(JsonElement timestamps) {
        JsonObject jsonObject = timestamps instanceof JsonObject ? (JsonObject) timestamps : null;
        if (jsonObject == null) {
            return timestamps;
        }
        int length = String.valueOf(System.currentTimeMillis()).length();
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        for (Map.Entry entry : jsonObject.f14766d.entrySet()) {
            String str = (String) entry.getKey();
            JsonElement jsonElement = (JsonElement) entry.getValue();
            JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
            Long lM = jsonPrimitive != null ? h.m(jsonPrimitive) : null;
            if (lM == null || lM.longValue() < 0 || length - lM.toString().length() <= 2) {
                jsonObjectBuilder.b(str, jsonElement);
            } else {
                io.sentry.config.a.P(jsonObjectBuilder, str, Long.valueOf(lM.longValue() * 1000));
            }
        }
        return jsonObjectBuilder.a();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    @NotNull
    public final JsonObject build(@NotNull String applicationId, String applicationName, @NotNull JsonObject activity) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(activity, "activity");
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        for (Map.Entry entry : activity.f14766d.entrySet()) {
            String str = (String) entry.getKey();
            JsonElement jsonElement = (JsonElement) entry.getValue();
            if (Intrinsics.areEqual(str, "party")) {
                jsonObjectBuilder.b("party", INSTANCE.transformParty(jsonElement));
            } else if (Intrinsics.areEqual(str, "timestamps")) {
                jsonObjectBuilder.b("timestamps", INSTANCE.transformTimestamps(jsonElement));
            } else {
                jsonObjectBuilder.b(str, jsonElement);
            }
        }
        io.sentry.config.a.Q(jsonObjectBuilder, "application_id", applicationId);
        io.sentry.config.a.Q(jsonObjectBuilder, "platform", "android");
        Object obj = activity.get(StackTraceHelper.NAME_KEY);
        JsonPrimitive jsonPrimitive = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
        String strF = jsonPrimitive != null ? h.f(jsonPrimitive) : null;
        if (strF == null || strF.length() == 0) {
            if (applicationName == null) {
                applicationName = DEFAULT_ACTIVITY_NAME;
            } else {
                if (applicationName.length() <= 0) {
                    applicationName = null;
                }
                if (applicationName == null) {
                    applicationName = DEFAULT_ACTIVITY_NAME;
                }
            }
            io.sentry.config.a.Q(jsonObjectBuilder, StackTraceHelper.NAME_KEY, applicationName);
        }
        if (INSTANCE.isNullOrJsonNull((JsonElement) activity.get("type"))) {
            io.sentry.config.a.P(jsonObjectBuilder, "type", 0);
        }
        return jsonObjectBuilder.a();
    }
}
