package il;

import android.app.Activity;
import android.net.Uri;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Callable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Uri f11842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f11843e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f11844i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e f11845v;

    public d(e eVar, Uri uri, Activity activity, String str) {
        this.f11845v = eVar;
        this.f11842d = uri;
        this.f11843e = activity;
        this.f11844i = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        e eVar = this.f11845v;
        Uri uriA = this.f11842d;
        try {
            boolean zEqualsIgnoreCase = "content".equalsIgnoreCase(uriA.getScheme());
            Activity activity = this.f11843e;
            if (zEqualsIgnoreCase) {
                uriA = e.a(eVar, activity, uriA);
            }
            String str = this.f11844i;
            if (str != null) {
                eVar.t(activity, uriA, str);
                return null;
            }
            eVar.getClass();
            eVar.t(activity, uriA, eVar.k(uriA.toString()));
            return null;
        } catch (Exception e10) {
            eVar.f11849c0.c("E_NO_IMAGE_DATA_FOUND", "Failed to resolve content URI: " + e10.getMessage());
            return null;
        }
    }
}
