package qr;

import a5.i0;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.modules.SerializersModule;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f19027a = new q();

    public static final m a(Number value, String key, String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(output, "output");
        return e(-1, "Unexpected special floating-point value " + value + " with key " + key + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) o(-1, output)));
    }

    public static final o b(Number value, String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(output, "output");
        return new o("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) o(-1, output)));
    }

    public static final o c(SerialDescriptor keyDescriptor) {
        Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
        return new o("Value of type '" + keyDescriptor.d() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.c() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final m d(int i7, CharSequence input, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(input, "input");
        return e(i7, message + "\nJSON input: " + ((Object) o(i7, input)));
    }

    public static final m e(int i7, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (i7 >= 0) {
            message = "Unexpected JSON token at offset " + i7 + ": " + message;
        }
        Intrinsics.checkNotNullParameter(message, "message");
        return new m(message);
    }

    public static final b0 f(Json json, String source) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(source, "source");
        androidx.appcompat.widget.v vVar = json.f14761a;
        return new b0(source);
    }

    public static final SerialDescriptor g(SerialDescriptor descriptor, SerializersModule module) {
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        if (!Intrinsics.areEqual(descriptor.c(), mr.h.f16075b)) {
            return descriptor.isInline() ? g(descriptor.j(0), module) : descriptor;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        KClass kClassV = io.sentry.config.a.v(descriptor);
        if (kClassV == null) {
            return descriptor;
        }
        SerializersModule.c(module, kClassV);
        return descriptor;
    }

    public static final byte h(char c8) {
        if (c8 < '~') {
            return h.f19015b[c8];
        }
        return (byte) 0;
    }

    public static final String i(SerialDescriptor serialDescriptor, Json json) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof pr.e) {
                return ((pr.e) annotation).discriminator();
            }
        }
        return (String) json.f14761a.f1135b;
    }

    public static final Object j(Json json, DeserializationStrategy deserializer, pc.r reader) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(reader, "reader");
        char[] buffer = g.f19013c.b(16384);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        x xVar = new x(reader, buffer);
        try {
            Object objDecodeSerializableValue = new y(json, d0.OBJ, xVar, deserializer.getDescriptor(), null).decodeSerializableValue(deserializer);
            xVar.o();
            return objDecodeSerializableValue;
        } finally {
            xVar.I();
        }
    }

    public static final void k(Json json, a5.b0 sb2, KSerializer serializer, Object obj) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(sb2, "writer");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        d0 mode = d0.OBJ;
        z[] modeReuseCache = new z[d0.E.a()];
        Intrinsics.checkNotNullParameter(sb2, "output");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(modeReuseCache, "modeReuseCache");
        Intrinsics.checkNotNullParameter(sb2, "sb");
        Intrinsics.checkNotNullParameter(json, "json");
        new z(new i0(sb2), json, mode, modeReuseCache).y(serializer, obj);
    }

    public static final int l(SerialDescriptor descriptor, Json json, String name) {
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        androidx.appcompat.widget.v vVar = json.f14761a;
        p(descriptor, json);
        int iF = descriptor.f(name);
        if (iF != -3 || !json.f14761a.f1139f) {
            return iF;
        }
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(json, "<this>");
        ph.c cVar = json.f14763c;
        m7.a defaultValue = new m7.a(4, descriptor, json);
        cVar.getClass();
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        q key = f19027a;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Object value = cVar.m(descriptor, key);
        if (value == null) {
            value = defaultValue.invoke();
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) cVar.f18031d;
            Object concurrentHashMap2 = concurrentHashMap.get(descriptor);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(descriptor, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(key, value);
        }
        Integer num = (Integer) ((Map) value).get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int m(SerialDescriptor serialDescriptor, Json json, String name, String suffix) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int iL = l(serialDescriptor, json, name);
        if (iL != -3) {
            return iL;
        }
        throw new kr.g(serialDescriptor.d() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static final void n(pc.f fVar, String entity) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(entity, "entity");
        fVar.p(fVar.f17882b - 1, "Trailing comma before the end of JSON ".concat(entity), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence o(int i7, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i7 != -1) {
                int i10 = i7 - 30;
                int i11 = i7 + 30;
                String str = i10 <= 0 ? "" : ".....";
                String str2 = i11 >= charSequence.length() ? "" : ".....";
                StringBuilder sbN = kk.b.n(str);
                if (i10 < 0) {
                    i10 = 0;
                }
                int length = charSequence.length();
                if (i11 > length) {
                    i11 = length;
                }
                sbN.append(charSequence.subSequence(i10, i11).toString());
                sbN.append(str2);
                return sbN.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void p(SerialDescriptor serialDescriptor, Json json) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.areEqual(serialDescriptor.c(), mr.j.f16077b)) {
            androidx.appcompat.widget.v vVar = json.f14761a;
        }
    }

    public static final Object q(Json json, String discriminator, JsonObject element, DeserializationStrategy deserializer) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return new s(json, element, discriminator, deserializer.getDescriptor()).decodeSerializableValue(deserializer);
    }

    public static final d0 r(SerialDescriptor desc, Json json) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(desc, "desc");
        ls.d dVarC = desc.c();
        if (dVarC instanceof mr.d) {
            return d0.POLY_OBJ;
        }
        if (Intrinsics.areEqual(dVarC, mr.j.f16078c)) {
            return d0.LIST;
        }
        if (!Intrinsics.areEqual(dVarC, mr.j.f16079d)) {
            return d0.OBJ;
        }
        SerialDescriptor serialDescriptorG = g(desc.j(0), json.f14762b);
        ls.d dVarC2 = serialDescriptorG.c();
        if ((dVarC2 instanceof mr.f) || Intrinsics.areEqual(dVarC2, mr.i.f16076b)) {
            return d0.MAP;
        }
        throw c(serialDescriptorG);
    }

    public static final void s(pc.f fVar, Number result) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        pc.f.q(fVar, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String t(byte b10) {
        if (b10 == 1) {
            return "quotation mark '\"'";
        }
        if (b10 == 2) {
            return "string escape sequence '\\'";
        }
        if (b10 == 4) {
            return "comma ','";
        }
        if (b10 == 5) {
            return "colon ':'";
        }
        if (b10 == 6) {
            return "start of the object '{'";
        }
        if (b10 == 7) {
            return "end of the object '}'";
        }
        if (b10 == 8) {
            return "start of the array '['";
        }
        if (b10 == 9) {
            return "end of the array ']'";
        }
        if (b10 == 10) {
            return "end of the input";
        }
        return b10 == 127 ? "invalid token" : "valid token";
    }
}
