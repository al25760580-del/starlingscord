package ep;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final up.c f8606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final up.b f8607b;

    static {
        up.c cVar = new up.c("kotlin.jvm.JvmField");
        f8606a = cVar;
        yk.a.G(cVar);
        yk.a.G(new up.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f8607b = yk.a.n("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String a(String propertyName) {
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        if (c(propertyName)) {
            return propertyName;
        }
        return "get" + m3.m.i(propertyName);
    }

    public static final String b(String propertyName) {
        String strI;
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        StringBuilder sb2 = new StringBuilder("set");
        if (c(propertyName)) {
            strI = propertyName.substring(2);
            Intrinsics.checkNotNullExpressionValue(strI, "substring(...)");
        } else {
            strI = m3.m.i(propertyName);
        }
        sb2.append(strI);
        return sb2.toString();
    }

    public static final boolean c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (kotlin.text.x.o(name, "is", false) && name.length() != 2) {
            char cCharAt = name.charAt(2);
            if (Intrinsics.compare(97, (int) cCharAt) > 0 || Intrinsics.compare((int) cCharAt, 122) > 0) {
                return true;
            }
        }
        return false;
    }
}
