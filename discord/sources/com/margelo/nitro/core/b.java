package com.margelo.nitro.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.collections.w0;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static AnyValue a(Object obj) {
        if (obj == null) {
            return new AnyValue();
        }
        if (obj instanceof Double) {
            return new AnyValue(((Number) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return new AnyValue(((Number) obj).floatValue());
        }
        if (obj instanceof Integer) {
            return new AnyValue(((Number) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return new AnyValue(((Boolean) obj).booleanValue());
        }
        if (obj instanceof Long) {
            return new AnyValue(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            return new AnyValue((String) obj);
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            ArrayList arrayList = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                AnyValue.Companion.getClass();
                arrayList.add(a(obj2));
            }
            return new AnyValue((AnyValue[]) arrayList.toArray(new AnyValue[0]));
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList2 = new ArrayList(e0.l(iterable, 10));
            for (Object obj3 : iterable) {
                AnyValue.Companion.getClass();
                arrayList2.add(a(obj3));
            }
            return new AnyValue((AnyValue[]) arrayList2.toArray(new AnyValue[0]));
        }
        if (!(obj instanceof Map)) {
            if ((obj instanceof AnyValue) || (obj instanceof AnyMap)) {
                throw new Error("Cannot box AnyValue (" + obj + ") twice!");
            }
            throw new Error("Value \"" + obj + "\" cannot be represented as AnyValue!");
        }
        Map map = (Map) obj;
        ArrayList arrayList3 = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            String strValueOf = String.valueOf(key);
            AnyValue.Companion.getClass();
            arrayList3.add(new Pair(strValueOf, a(value)));
        }
        return new AnyValue((Map<String, AnyValue>) w0.l(arrayList3));
    }
}
