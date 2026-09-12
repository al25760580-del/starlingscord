package kotlinx.serialization.json;

import androidx.appcompat.widget.v;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.modules.SerializersModule;
import ph.c;
import pr.b;
import pr.i;
import pr.l;
import qr.b0;
import qr.d0;
import qr.f;
import qr.p;
import qr.r;
import qr.s;
import qr.t;
import qr.y;
import rn.n;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Json {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f14760d = new b(new v(false, true, "    ", "type", true, pr.a.f18519e), rr.b.f19552a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f14761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SerializersModule f14762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f14763c = new c(1);

    public Json(v vVar, SerializersModule serializersModule) {
        this.f14761a = vVar;
        this.f14762b = serializersModule;
    }

    public final Object a(DeserializationStrategy deserializer, JsonElement element) {
        Decoder rVar;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(this, "json");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        String str = null;
        if (element instanceof JsonObject) {
            rVar = new s(this, (JsonObject) element, str, 12);
        } else if (element instanceof a) {
            rVar = new t(this, (a) element);
        } else {
            if (!(element instanceof l) && !Intrinsics.areEqual(element, JsonNull.INSTANCE)) {
                throw new n();
            }
            rVar = new r(this, (JsonPrimitive) element, null);
        }
        return rVar.decodeSerializableValue(deserializer);
    }

    public final Object b(DeserializationStrategy deserializer, String string) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(string, "string");
        b0 b0VarF = p.f(this, string);
        Object objDecodeSerializableValue = new y(this, d0.OBJ, b0VarF, deserializer.getDescriptor(), null).decodeSerializableValue(deserializer);
        b0VarF.o();
        return objDecodeSerializableValue;
    }

    public final String c(KSerializer serializer, Object obj) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        a5.b0 b0Var = new a5.b0(17, (short) 0);
        b0Var.f174i = f.f19012c.b(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        try {
            p.k(this, b0Var, serializer, obj);
            return b0Var.toString();
        } finally {
            f fVar = f.f19012c;
            char[] array = (char[]) b0Var.f174i;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(array, "array");
            fVar.a(array);
        }
    }

    public final JsonElement d(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return (JsonElement) b(i.f18527a, string);
    }
}
