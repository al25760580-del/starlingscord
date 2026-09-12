package androidx.appcompat.widget;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f978c;

    static {
        f978c = Build.VERSION.SDK_INT >= 27;
    }
}
