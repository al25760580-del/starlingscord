package qr;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.modules.SerializersModule;
import or.i0;
import or.y0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends y0 implements pr.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Json f18992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.appcompat.widget.v f18994f;

    public a(Json json, String str) {
        this.f18992d = json;
        this.f18993e = str;
        this.f18994f = json.f14761a;
    }

    public final String A(String currentTag) {
        Intrinsics.checkNotNullParameter(currentTag, "currentTag");
        return w() + '.' + currentTag;
    }

    public final void B(JsonPrimitive jsonPrimitive, String str, String str2) {
        throw p.d(-1, y().toString(), "Failed to parse literal '" + jsonPrimitive + "' as " + (kotlin.text.x.o(str, "i", false) ? "an " : "a ").concat(str) + " value at element: " + A(str2));
    }

    @Override // pr.g
    public final JsonElement a() {
        return y();
    }

    @Override // pr.g
    public final Json b() {
        return this.f18992d;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public CompositeDecoder beginStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        JsonElement jsonElementY = y();
        ls.d dVarC = descriptor.c();
        boolean zAreEqual = Intrinsics.areEqual(dVarC, mr.j.f16078c);
        Json json = this.f18992d;
        if (zAreEqual || (dVarC instanceof mr.d)) {
            String strD = descriptor.d();
            if (jsonElementY instanceof kotlinx.serialization.json.a) {
                return new t(json, (kotlinx.serialization.json.a) jsonElementY);
            }
            throw p.d(-1, jsonElementY.toString(), "Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.a.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementY.getClass()).getSimpleName() + " as the serialized body of " + strD + " at element: " + w());
        }
        if (!Intrinsics.areEqual(dVarC, mr.j.f16079d)) {
            String strD2 = descriptor.d();
            if (jsonElementY instanceof JsonObject) {
                return new s(json, (JsonObject) jsonElementY, this.f18993e, 8);
            }
            throw p.d(-1, jsonElementY.toString(), "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementY.getClass()).getSimpleName() + " as the serialized body of " + strD2 + " at element: " + w());
        }
        SerialDescriptor serialDescriptorG = p.g(descriptor.j(0), json.f14762b);
        ls.d dVarC2 = serialDescriptorG.c();
        if (!(dVarC2 instanceof mr.f) && !Intrinsics.areEqual(dVarC2, mr.i.f16076b)) {
            throw p.c(serialDescriptorG);
        }
        String strD3 = descriptor.d();
        if (jsonElementY instanceof JsonObject) {
            return new u(json, (JsonObject) jsonElementY);
        }
        throw p.d(-1, jsonElementY.toString(), "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementY.getClass()).getSimpleName() + " as the serialized body of " + strD3 + " at element: " + w());
    }

    @Override // or.y0
    public final String d(String parentName, String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    @Override // or.y0, kotlinx.serialization.encoding.Decoder
    public final Decoder decodeInline(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (CollectionsKt.S((ArrayList) this.f17636c) != null) {
            return super.decodeInline(descriptor);
        }
        return new r(this.f18992d, z(), this.f18993e).decodeInline(descriptor);
    }

    @Override // or.y0, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return !(y() instanceof JsonNull);
    }

    @Override // or.y0, kotlinx.serialization.encoding.Decoder
    public final Object decodeSerializableValue(DeserializationStrategy deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (!(deserializer instanceof or.b)) {
            return deserializer.deserialize(this);
        }
        Json json = this.f18992d;
        androidx.appcompat.widget.v vVar = json.f14761a;
        or.b bVar = (or.b) deserializer;
        String strI = p.i(bVar.getDescriptor(), json);
        JsonElement jsonElementY = y();
        String strD = bVar.getDescriptor().d();
        if (jsonElementY instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) jsonElementY;
            JsonElement jsonElement = (JsonElement) jsonObject.get(strI);
            try {
                DeserializationStrategy deserializationStrategyY = m3.m.y((or.b) deserializer, this, jsonElement != null ? pr.h.f(pr.h.k(jsonElement)) : null);
                Intrinsics.checkNotNull(deserializationStrategyY, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                return p.q(json, strI, jsonObject, deserializationStrategyY);
            } catch (kr.g e10) {
                String message = e10.getMessage();
                Intrinsics.checkNotNull(message);
                throw p.d(-1, jsonObject.toString(), message);
            }
        }
        throw p.d(-1, jsonElementY.toString(), "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementY.getClass()).getSimpleName() + " as the serialized body of " + strD + " at element: " + w());
    }

    @Override // or.y0
    public final boolean e(Object obj) {
        Boolean bool;
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementX = x(tag);
        if (!(jsonElementX instanceof JsonPrimitive)) {
            throw p.d(-1, jsonElementX.toString(), "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementX.getClass()).getSimpleName() + " as the serialized body of boolean at element: " + A(tag));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementX;
        try {
            i0 i0Var = pr.h.f18526a;
            Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
            String strA = jsonPrimitive.a();
            String[] strArr = c0.f19000a;
            Intrinsics.checkNotNullParameter(strA, "<this>");
            if (kotlin.text.x.i(strA, "true", true)) {
                bool = Boolean.TRUE;
            } else {
                bool = kotlin.text.x.i(strA, "false", true) ? Boolean.FALSE : null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            B(jsonPrimitive, "boolean", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            B(jsonPrimitive, "boolean", tag);
            throw null;
        }
    }

    @Override // or.y0, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // or.y0
    public final byte f(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementX = x(tag);
        if (!(jsonElementX instanceof JsonPrimitive)) {
            throw p.d(-1, jsonElementX.toString(), "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementX.getClass()).getSimpleName() + " as the serialized body of byte at element: " + A(tag));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementX;
        try {
            int iG = pr.h.g(jsonPrimitive);
            Byte bValueOf = (-128 > iG || iG > 127) ? null : Byte.valueOf((byte) iG);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            B(jsonPrimitive, "byte", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            B(jsonPrimitive, "byte", tag);
            throw null;
        }
    }

    @Override // or.y0
    public final char g(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementX = x(tag);
        if (jsonElementX instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementX;
            try {
                return kotlin.text.b0.A(jsonPrimitive.a());
            } catch (IllegalArgumentException unused) {
                B(jsonPrimitive, "char", tag);
                throw null;
            }
        }
        throw p.d(-1, jsonElementX.toString(), "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementX.getClass()).getSimpleName() + " as the serialized body of char at element: " + A(tag));
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public final SerializersModule getSerializersModule() {
        return this.f18992d.f14762b;
    }

    @Override // or.y0
    public final double h(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementX = x(tag);
        if (!(jsonElementX instanceof JsonPrimitive)) {
            throw p.d(-1, jsonElementX.toString(), "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementX.getClass()).getSimpleName() + " as the serialized body of double at element: " + A(tag));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementX;
        try {
            i0 i0Var = pr.h.f18526a;
            Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
            double d6 = Double.parseDouble(jsonPrimitive.a());
            androidx.appcompat.widget.v vVar = this.f18992d.f14761a;
            if (Double.isInfinite(d6) || Double.isNaN(d6)) {
                throw p.a(Double.valueOf(d6), tag, y().toString());
            }
            return d6;
        } catch (IllegalArgumentException unused) {
            B(jsonPrimitive, "double", tag);
            throw null;
        }
    }

    @Override // or.y0
    public final int i(Object obj, SerialDescriptor enumDescriptor) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        JsonElement jsonElementX = x(tag);
        String strD = enumDescriptor.d();
        if (jsonElementX instanceof JsonPrimitive) {
            return p.m(enumDescriptor, this.f18992d, ((JsonPrimitive) jsonElementX).a(), "");
        }
        throw p.d(-1, jsonElementX.toString(), "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementX.getClass()).getSimpleName() + " as the serialized body of " + strD + " at element: " + A(tag));
    }

    @Override // or.y0
    public final float j(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementX = x(tag);
        if (!(jsonElementX instanceof JsonPrimitive)) {
            throw p.d(-1, jsonElementX.toString(), "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementX.getClass()).getSimpleName() + " as the serialized body of float at element: " + A(tag));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementX;
        try {
            i0 i0Var = pr.h.f18526a;
            Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
            float f2 = Float.parseFloat(jsonPrimitive.a());
            androidx.appcompat.widget.v vVar = this.f18992d.f14761a;
            if (Float.isInfinite(f2) || Float.isNaN(f2)) {
                throw p.a(Float.valueOf(f2), tag, y().toString());
            }
            return f2;
        } catch (IllegalArgumentException unused) {
            B(jsonPrimitive, "float", tag);
            throw null;
        }
    }

    @Override // or.y0
    public final Decoder k(Object obj, SerialDescriptor inlineDescriptor) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        if (!a0.a(inlineDescriptor)) {
            Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
            ((ArrayList) this.f17636c).add(tag);
            return this;
        }
        JsonElement jsonElementX = x(tag);
        String strD = inlineDescriptor.d();
        if (jsonElementX instanceof JsonPrimitive) {
            String strA = ((JsonPrimitive) jsonElementX).a();
            Json json = this.f18992d;
            return new l(p.f(json, strA), json);
        }
        throw p.d(-1, jsonElementX.toString(), "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementX.getClass()).getSimpleName() + " as the serialized body of " + strD + " at element: " + A(tag));
    }

    @Override // or.y0
    public final int l(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementX = x(tag);
        if (jsonElementX instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementX;
            try {
                return pr.h.g(jsonPrimitive);
            } catch (IllegalArgumentException unused) {
                B(jsonPrimitive, "int", tag);
                throw null;
            }
        }
        throw p.d(-1, jsonElementX.toString(), "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementX.getClass()).getSimpleName() + " as the serialized body of int at element: " + A(tag));
    }

    @Override // or.y0
    public final long m(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementX = x(tag);
        if (jsonElementX instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementX;
            try {
                return pr.h.l(jsonPrimitive);
            } catch (IllegalArgumentException unused) {
                B(jsonPrimitive, "long", tag);
                throw null;
            }
        }
        throw p.d(-1, jsonElementX.toString(), "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementX.getClass()).getSimpleName() + " as the serialized body of long at element: " + A(tag));
    }

    @Override // or.y0
    public final boolean n(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        return x(tag) != JsonNull.INSTANCE;
    }

    @Override // or.y0
    public final short o(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementX = x(tag);
        if (!(jsonElementX instanceof JsonPrimitive)) {
            throw p.d(-1, jsonElementX.toString(), "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementX.getClass()).getSimpleName() + " as the serialized body of short at element: " + A(tag));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementX;
        try {
            int iG = pr.h.g(jsonPrimitive);
            Short shValueOf = (-32768 > iG || iG > 32767) ? null : Short.valueOf((short) iG);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            B(jsonPrimitive, "short", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            B(jsonPrimitive, "short", tag);
            throw null;
        }
    }

    @Override // or.y0
    public final String p(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementX = x(tag);
        if (!(jsonElementX instanceof JsonPrimitive)) {
            throw p.d(-1, jsonElementX.toString(), "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementX.getClass()).getSimpleName() + " as the serialized body of string at element: " + A(tag));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementX;
        if (!(jsonPrimitive instanceof pr.l)) {
            StringBuilder sbN = com.discord.chat.presentation.list.a.n("Expected string value for a non-null key '", tag, "', got null literal instead at element: ");
            sbN.append(A(tag));
            throw p.d(-1, y().toString(), sbN.toString());
        }
        pr.l lVar = (pr.l) jsonPrimitive;
        if (lVar.f18530d) {
            return lVar.f18531e;
        }
        androidx.appcompat.widget.v vVar = this.f18992d.f14761a;
        StringBuilder sbN2 = com.discord.chat.presentation.list.a.n("String literal for key '", tag, "' should be quoted at element: ");
        sbN2.append(A(tag));
        sbN2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw p.d(-1, y().toString(), sbN2.toString());
    }

    public abstract JsonElement x(String str);

    public final JsonElement y() {
        JsonElement jsonElementX;
        String str = (String) CollectionsKt.S((ArrayList) this.f17636c);
        return (str == null || (jsonElementX = x(str)) == null) ? z() : jsonElementX;
    }

    public abstract JsonElement z();
}
