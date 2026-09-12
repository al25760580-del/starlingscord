package sr;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.SerializersModule;
import n8.f;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f20556b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SerializersModule f20557a = rr.b.f19552a;

    public final LinkedHashMap a(KSerializer serializer, Object obj) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        f fVar = new f(this);
        fVar.y(serializer, obj);
        return (LinkedHashMap) fVar.f16511i;
    }
}
