package qr;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final JsonElement f19029g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Json json, JsonElement value, String str) {
        super(json, str);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f19029g = value;
        ((ArrayList) this.f17636c).add("primitive");
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeElementIndex(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return 0;
    }

    @Override // qr.a
    public final JsonElement x(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (tag == "primitive") {
            return this.f19029g;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // qr.a
    public final JsonElement z() {
        return this.f19029g;
    }
}
