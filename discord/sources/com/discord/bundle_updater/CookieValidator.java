package com.discord.bundle_updater;

import io.sentry.hints.j;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.v0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kr.g;
import okhttp3.Cookie;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import pr.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0018\u0010\b\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/discord/bundle_updater/CookieValidator;", "", "<init>", "()V", "parseBuildOverrideCookie", "Lcom/discord/bundle_updater/BuildOverrideCookieContents;", "buildOverrideCookie", "Lokhttp3/Cookie;", "validateBuildOverrideCookie", "", "version", "", "bundle_updater_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCookieValidator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookieValidator.kt\ncom/discord/bundle_updater/CookieValidator\n+ 2 Json.kt\nkotlinx/serialization/json/JsonKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n309#2:107\n309#2:119\n490#3,7:108\n465#3:115\n415#3:116\n1252#4,2:117\n1255#4:120\n1761#4,3:121\n*S KotlinDebug\n*F\n+ 1 CookieValidator.kt\ncom/discord/bundle_updater/CookieValidator\n*L\n84#1:107\n87#1:119\n86#1:108,7\n87#1:115\n87#1:116\n87#1:117,2\n87#1:120\n96#1:121,3\n*E\n"})
public final class CookieValidator {

    @NotNull
    public static final CookieValidator INSTANCE = new CookieValidator();

    private CookieValidator() {
    }

    public final BuildOverrideCookieContents parseBuildOverrideCookie(Cookie buildOverrideCookie) {
        String str;
        if (buildOverrideCookie == null || (str = (String) CollectionsKt.M(1, StringsKt__StringsKt.split$default(buildOverrideCookie.f17304b, new String[]{"."}, false, 0, 6, null))) == null) {
            return null;
        }
        String strDecode = URLDecoder.decode(str, "UTF-8");
        ByteString byteString = ByteString.f17414v;
        Intrinsics.checkNotNull(strDecode);
        ByteString byteStringW = j.w(strDecode);
        if (byteStringW == null) {
            return null;
        }
        String strK = byteStringW.k();
        try {
            pr.b bVar = Json.f14760d;
            JsonElement jsonElementD = bVar.d(strK);
            JsonElement jsonElement = (JsonElement) h.j(jsonElementD).get("$meta");
            if (jsonElement == null) {
                return null;
            }
            BuildOverrideCookieMeta buildOverrideCookieMeta = (BuildOverrideCookieMeta) bVar.a(BuildOverrideCookieMeta.INSTANCE.serializer(), jsonElement);
            JsonObject jsonObjectJ = h.j(jsonElementD);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : jsonObjectJ.f14766d.entrySet()) {
                if (!Intrinsics.areEqual((String) entry.getKey(), "$meta")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(v0.a(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Object key = entry2.getKey();
                JsonElement jsonElement2 = (JsonElement) entry2.getValue();
                pr.b bVar2 = Json.f14760d;
                bVar2.getClass();
                linkedHashMap2.put(key, (BuildOverrideCookieBuild) bVar2.a(BuildOverrideCookieBuild.INSTANCE.serializer(), jsonElement2));
            }
            return new BuildOverrideCookieContents(buildOverrideCookieMeta, linkedHashMap2);
        } catch (g unused) {
            return null;
        }
    }

    public final boolean validateBuildOverrideCookie(Cookie buildOverrideCookie, @NotNull String version) {
        List<String> allowedVersions;
        Intrinsics.checkNotNullParameter(version, "version");
        BuildOverrideCookieContents buildOverrideCookie2 = parseBuildOverrideCookie(buildOverrideCookie);
        if (buildOverrideCookie2 == null || (allowedVersions = buildOverrideCookie2.getMeta().getAllowedVersions()) == null || allowedVersions.isEmpty()) {
            return false;
        }
        Iterator<T> it = allowedVersions.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual((String) it.next(), version)) {
                return true;
            }
        }
        return false;
    }
}
