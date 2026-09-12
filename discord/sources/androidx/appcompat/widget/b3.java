package androidx.appcompat.widget;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Method f906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Method f907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Method f908c;

    public /* synthetic */ b3(Method method, Method method2, Method method3) {
        this.f906a = method;
        this.f907b = method2;
        this.f908c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
