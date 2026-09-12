package kotlinx.serialization.json;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class JsonObjectBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f14767a = new LinkedHashMap();

    public final JsonObject a() {
        return new JsonObject(this.f14767a);
    }

    public final JsonElement b(String key, JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        return (JsonElement) this.f14767a.put(key, element);
    }
}
