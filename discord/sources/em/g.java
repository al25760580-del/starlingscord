package em;

import android.content.Context;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f8459a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f8460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile String f8461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Context f8462d;

    public static String a(Throwable th2) {
        String simpleName = Reflection.getOrCreateKotlinClass(th2.getClass()).getSimpleName();
        if (simpleName == null) {
            simpleName = "Unknown";
        }
        String message = th2.getMessage();
        if (message == null) {
            message = th2.toString();
        }
        return kk.b.k(simpleName, ": ", message);
    }
}
