package com.discord.fast_connect;

import com.discord.app_database.DatabaseVersions;
import com.discord.app_database.GuildVersion;
import com.discord.app_database.NonGuildVersion;
import com.discord.logging.Log;
import ib.a;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.d0;
import kotlin.collections.v0;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import or.i0;
import org.jetbrains.annotations.NotNull;
import pr.h;
import rn.q;
import rn.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0002J$\u0010\f\u001a\u00020\r*\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002¨\u0006\u0012"}, d2 = {"Lcom/discord/fast_connect/IdentifyPayload;", "", "<init>", "()V", "withGuildVersions", "", "json", "versions", "Lcom/discord/app_database/DatabaseVersions;", "toJson", "Lkotlinx/serialization/json/JsonPrimitive;", "Lcom/discord/app_database/NonGuildVersion;", "put", "Lkotlinx/serialization/json/JsonObject;", "path", "", "value", "Lkotlinx/serialization/json/JsonElement;", "fast_connect_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIdentifyPayload.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentifyPayload.kt\ncom/discord/fast_connect/IdentifyPayload\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,82:1\n1#2:83\n8569#3,2:84\n9251#3,4:86\n13472#3,2:90\n*S KotlinDebug\n*F\n+ 1 IdentifyPayload.kt\ncom/discord/fast_connect/IdentifyPayload\n*L\n24#1:84,2\n24#1:86,4\n27#1:90,2\n*E\n"})
public final class IdentifyPayload {

    @NotNull
    public static final IdentifyPayload INSTANCE = new IdentifyPayload();

    private IdentifyPayload() {
    }

    private final JsonObject put(JsonObject jsonObject, List<String> list, JsonElement jsonElement) {
        int size = list.size();
        if (size == 0) {
            throw new IllegalArgumentException("path cannot have zero elements");
        }
        if (size != 1) {
            String str = list.get(0);
            JsonElement jsonElement2 = (JsonElement) jsonObject.get(str);
            if (!(jsonElement2 instanceof JsonObject)) {
                return jsonObject;
            }
            LinkedHashMap linkedHashMapN = w0.n(jsonObject);
            linkedHashMapN.put(str, INSTANCE.put((JsonObject) jsonElement2, list.subList(1, list.size()), jsonElement));
            return new JsonObject(linkedHashMapN);
        }
        String str2 = list.get(0);
        LinkedHashMap linkedHashMapN2 = w0.n(jsonObject);
        if (jsonElement == null) {
            i0 i0Var = h.f18526a;
            jsonElement = JsonNull.INSTANCE;
        }
        linkedHashMapN2.put(str2, jsonElement);
        return new JsonObject(linkedHashMapN2);
    }

    private final JsonPrimitive toJson(NonGuildVersion nonGuildVersion) {
        return nonGuildVersion.getVersionString() == null ? h.b(Long.valueOf(nonGuildVersion.getVersion())) : h.c(nonGuildVersion.getVersionString());
    }

    @NotNull
    public final String withGuildVersions(@NotNull String json, @NotNull DatabaseVersions versions) {
        Object objO;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(versions, "versions");
        try {
            q qVar = Result.f14614e;
            objO = Json.f14760d.d(json);
        } catch (Throwable th2) {
            q qVar2 = Result.f14614e;
            objO = a.o(th2);
        }
        if (objO instanceof r) {
            objO = null;
        }
        JsonElement jsonElement = (JsonElement) objO;
        if (!(jsonElement instanceof JsonObject)) {
            Log.w$default(Log.INSTANCE, "IdentifyPayload", "skipping identify mutation: root is not a json object", (Throwable) null, 4, (Object) null);
            return json;
        }
        JsonObject jsonObject = (JsonObject) jsonElement;
        List<String> listG = d0.g("d", "client_state", "guild_versions");
        GuildVersion[] guildVersions = versions.getGuildVersions();
        int iA = v0.a(guildVersions.length);
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (GuildVersion guildVersion : guildVersions) {
            linkedHashMap.put(guildVersion.getId(), h.b(Long.valueOf(guildVersion.getVersion())));
        }
        JsonObject jsonObjectPut = put(jsonObject, listG, new JsonObject(linkedHashMap));
        for (NonGuildVersion nonGuildVersion : versions.getNonGuildVersions()) {
            IdentifyPayload identifyPayload = INSTANCE;
            jsonObjectPut = identifyPayload.put(jsonObjectPut, d0.g("d", "client_state", nonGuildVersion.getId()), identifyPayload.toJson(nonGuildVersion));
        }
        return jsonObjectPut.toString();
    }
}
