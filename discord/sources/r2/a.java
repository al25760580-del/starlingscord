package r2;

import androidx.lifecycle.LifecycleOwner;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import rn.d;
import rn.q;
import rn.r;
import u.y;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f19187a = 0;

    static {
        Object objO;
        try {
            q qVar = Result.f14614e;
            ClassLoader classLoader = LifecycleOwner.class.getClassLoader();
            Intrinsics.checkNotNull(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof y) {
                        objO = (y) objInvoke;
                        break;
                    }
                } else if (!(annotations[i7] instanceof d)) {
                    i7++;
                }
                objO = null;
                break;
            }
        } catch (Throwable th2) {
            q qVar2 = Result.f14614e;
            objO = ib.a.o(th2);
        }
        q qVar3 = Result.f14614e;
        if (((y) (objO instanceof r ? null : objO)) == null) {
            new y(new o5.a(14));
        }
    }
}
