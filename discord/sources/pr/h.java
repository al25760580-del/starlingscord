package pr;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.x;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import or.e1;
import or.i0;
import or.s1;
import qr.b0;
import qr.c0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f18526a;

    static {
        com.facebook.imagepipeline.nativecode.b.z(StringCompanionObject.INSTANCE);
        f18526a = e1.a("kotlinx.serialization.json.JsonUnquotedLiteral", s1.f17602a);
    }

    public static final JsonPrimitive a(Boolean bool) {
        return new l(bool, false);
    }

    public static final JsonPrimitive b(Number number) {
        return new l(number, false);
    }

    public static final JsonPrimitive c(String str) {
        return str == null ? JsonNull.INSTANCE : new l(str, true);
    }

    public static final void d(String str, JsonElement jsonElement) {
        throw new IllegalArgumentException("Element " + Reflection.getOrCreateKotlinClass(jsonElement.getClass()) + " is not a " + str);
    }

    public static final boolean e(JsonPrimitive jsonPrimitive) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        String strA = jsonPrimitive.a();
        String[] strArr = c0.f19000a;
        Intrinsics.checkNotNullParameter(strA, "<this>");
        if (x.i(strA, "true", true)) {
            bool = Boolean.TRUE;
        } else {
            bool = x.i(strA, "false", true) ? Boolean.FALSE : null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException(jsonPrimitive + " does not represent a Boolean");
    }

    public static final String f(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        if (jsonPrimitive instanceof JsonNull) {
            return null;
        }
        return jsonPrimitive.a();
    }

    public static final int g(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            long jI = new b0(jsonPrimitive.a()).i();
            if (-2147483648L <= jI && jI <= 2147483647L) {
                return (int) jI;
            }
            throw new NumberFormatException(jsonPrimitive.a() + " is not an Int");
        } catch (qr.m e10) {
            throw new NumberFormatException(e10.getMessage());
        }
    }

    public static final Integer h(JsonPrimitive jsonPrimitive) {
        Long lValueOf;
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            lValueOf = Long.valueOf(new b0(jsonPrimitive.a()).i());
        } catch (qr.m unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                return Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    public static final kotlinx.serialization.json.a i(JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        kotlinx.serialization.json.a aVar = jsonElement instanceof kotlinx.serialization.json.a ? (kotlinx.serialization.json.a) jsonElement : null;
        if (aVar != null) {
            return aVar;
        }
        d("JsonArray", jsonElement);
        throw null;
    }

    public static final JsonObject j(JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        d("JsonObject", jsonElement);
        throw null;
    }

    public static final JsonPrimitive k(JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        d("JsonPrimitive", jsonElement);
        throw null;
    }

    public static final long l(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            return new b0(jsonPrimitive.a()).i();
        } catch (qr.m e10) {
            throw new NumberFormatException(e10.getMessage());
        }
    }

    public static final Long m(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            return Long.valueOf(new b0(jsonPrimitive.a()).i());
        } catch (qr.m unused) {
            return null;
        }
    }
}
