package com.discord.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty1;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import kr.g;
import mf.f;
import pr.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"parseProperty", "", "property", "Lkotlin/reflect/KProperty1;", "jsonProperty", "Lkotlinx/serialization/json/JsonElement;", "serialization_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SerializerUtilsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseProperty(KProperty1 kProperty1, JsonElement jsonElement) {
        try {
            KClass kClassV = f.v(kProperty1.getReturnType());
            if (Intrinsics.areEqual(kClassV, Reflection.getOrCreateKotlinClass(String.class))) {
                h.k(jsonElement);
                return true;
            }
            if (Intrinsics.areEqual(kClassV, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                h.g(h.k(jsonElement));
                return true;
            }
            if (Intrinsics.areEqual(kClassV, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                JsonPrimitive jsonPrimitiveK = h.k(jsonElement);
                Intrinsics.checkNotNullParameter(jsonPrimitiveK, "<this>");
                Double.parseDouble(jsonPrimitiveK.a());
                return true;
            }
            if (Intrinsics.areEqual(kClassV, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                h.e(h.k(jsonElement));
                return true;
            }
            if (Intrinsics.areEqual(kClassV, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                h.l(h.k(jsonElement));
                return true;
            }
            if (Intrinsics.areEqual(kClassV, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                JsonPrimitive jsonPrimitiveK2 = h.k(jsonElement);
                Intrinsics.checkNotNullParameter(jsonPrimitiveK2, "<this>");
                Float.parseFloat(jsonPrimitiveK2.a());
            }
            return true;
        } catch (g | IllegalArgumentException unused) {
            return false;
        }
    }
}
