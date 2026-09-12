package kotlinx.serialization.modules;

import cg.b;
import java.util.List;
import kotlin.collections.n0;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SerializersModule {
    public static KSerializer c(SerializersModule serializersModule, KClass kClass) {
        serializersModule.b(kClass, n0.f14659d);
        return null;
    }

    public abstract void a(b bVar);

    public abstract void b(KClass kClass, List list);

    public abstract boolean d();

    public abstract DeserializationStrategy e(String str, KClass kClass);

    public abstract KSerializer f(KClass kClass, Object obj);
}
