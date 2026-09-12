package po;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends com.facebook.imagepipeline.nativecode.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f18105f;

    public l(Field field) {
        Intrinsics.checkNotNullParameter(field, "field");
        this.f18105f = field;
    }

    @Override // com.facebook.imagepipeline.nativecode.b
    public final String e() {
        StringBuilder sb2 = new StringBuilder();
        Field field = this.f18105f;
        String name = field.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb2.append(ep.z.a(name));
        sb2.append("()");
        Class<?> type = field.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        sb2.append(bp.c.b(type));
        return sb2.toString();
    }
}
