package com.discord.share;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import com.discord.tti_manager.TTIManagerModule;
import com.google.android.gms.internal.play_billing.u0;
import hi.o;
import java.lang.reflect.Method;
import x0.d;
import x0.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f4583e;

    public /* synthetic */ a(Activity activity, int i7) {
        this.f4582d = i7;
        this.f4583e = activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ?? r5;
        ?? r6;
        switch (this.f4582d) {
            case 0:
                this.f4583e.finishAffinity();
                return;
            case 1:
                TTIManagerModule.reportFullyDrawn$lambda$4(this.f4583e);
                return;
            default:
                Activity activity = this.f4583e;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = e.f22526g;
                Method method = e.f22525f;
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 28) {
                    activity.recreate();
                    return;
                }
                d dVar = 27;
                if (((i7 != 26 && i7 != 27) || method != null) && (e.f22524e != null || e.f22523d != null)) {
                    try {
                        Object obj2 = e.f22522c.get(activity);
                        if (obj2 != null && (obj = e.f22521b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            dVar = new d(activity);
                            application.registerActivityLifecycleCallbacks(dVar);
                            handler.post(new o(23, dVar, obj2));
                            application = (i7 == 26 || i7 == 27) ? 1 : 0;
                            try {
                                if (application != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r6 = application;
                                        r5 = dVar;
                                        handler.post(new u0(24, (Object) r6, (Object) r5));
                                        throw th;
                                    }
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new u0(24, application, dVar));
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                r6 = application;
                                r5 = dVar;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
        }
    }
}
