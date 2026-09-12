package u3;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f20926a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f20927b;

    static {
        String simpleName = b.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        f20927b = simpleName;
    }

    public static b a() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            return d.f20937b;
        }
        if (i7 >= 29) {
            return c.f20931e;
        }
        return i7 >= 28 ? c.f20930d : c.f20929c;
    }
}
