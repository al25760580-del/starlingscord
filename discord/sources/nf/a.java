package nf;

import af.w;
import android.app.Activity;
import android.os.Looper;
import kh.f;
import xe.d;
import ye.b;
import ye.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f16803a = new d("is_user_verifying_platform_authenticator_available_for_credential", 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f16804b = new d("is_user_verifying_platform_authenticator_available", 1);

    public static pf.a a(Activity activity) {
        f fVar = new f(21);
        Looper mainLooper = activity.getMainLooper();
        w.h(mainLooper, "Looper must not be null.");
        return new pf.a(activity, activity, pf.a.k, b.D, new h(fVar, mainLooper));
    }
}
