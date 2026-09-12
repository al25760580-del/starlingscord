package com.appsflyer.internal;

import co.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.e0;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nJsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonUtils.kt\ncom/appsflyer/internal/util/JsonUtilsKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n759#2,2:44\n775#2,4:46\n1549#3:50\n1620#3,3:51\n*S KotlinDebug\n*F\n+ 1 JsonUtils.kt\ncom/appsflyer/internal/util/JsonUtilsKt\n*L\n14#1:44,2\n14#1:46,4\n26#1:50\n26#1:51,3\n*E\n"})
public final class AFj1cSDK {
    private static final List<Object> AFAdRevenueData(JSONArray jSONArray) throws JSONException {
        IntRange intRangeI = lo.j.i(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(e0.l(intRangeI, 10));
        Iterator it = intRangeI.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((s0) it).nextInt());
            Intrinsics.checkNotNullExpressionValue(obj, "");
            arrayList.add(AFAdRevenueData(obj));
        }
        return arrayList;
    }

    @NotNull
    public static final Map<String, Object> getRevenue(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "");
        Intrinsics.checkNotNullParameter(itKeys, "<this>");
        q qVar = new q(5, itKeys);
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        xq.a aVar = new xq.a(qVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : aVar) {
            Object obj2 = jSONObject.get((String) obj);
            Intrinsics.checkNotNullExpressionValue(obj2, "");
            linkedHashMap.put(obj, AFAdRevenueData(obj2));
        }
        return linkedHashMap;
    }

    private static final Object AFAdRevenueData(Object obj) {
        if (obj instanceof JSONArray) {
            return AFAdRevenueData((JSONArray) obj);
        }
        if (obj instanceof JSONObject) {
            return getRevenue((JSONObject) obj);
        }
        if (Intrinsics.areEqual(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }
}
