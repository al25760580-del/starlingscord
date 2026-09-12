package zl;

import android.app.Activity;
import android.view.Window;
import androidx.core.view.WindowInsetsControllerCompat;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.statusbar.StatusBarModule;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReactApplicationContext f24039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f24040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WindowInsetsControllerCompat f24041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f24042d;

    public c(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "mReactContext");
        this.f24039a = reactContext;
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        e eVar = new e();
        try {
            StatusBarModule.Companion companion = StatusBarModule.INSTANCE;
            eVar.f24044d = StatusBarModule.class.getConstructor(ReactApplicationContext.class).newInstance(reactContext);
            Class cls = Boolean.TYPE;
            StatusBarModule.class.getMethod("setHidden", cls);
            eVar.f24045e = StatusBarModule.class.getMethod("setColor", Double.TYPE, cls);
            eVar.f24046i = StatusBarModule.class.getMethod("setTranslucent", cls);
            eVar.f24047v = StatusBarModule.class.getMethod("setStyle", String.class);
            eVar.f24048w = StatusBarModule.class.getMethod("getConstants", null);
        } catch (Exception unused) {
            int i7 = f.f24049a;
            Intrinsics.checkNotNullParameter("Failed to initialize StatusBarModule via reflection", "message");
        }
        this.f24040b = eVar;
        this.f24042d = new WeakReference(null);
    }

    public final WindowInsetsControllerCompat a() {
        Activity currentActivity = this.f24039a.getCurrentActivity();
        if (this.f24041c == null || !Intrinsics.areEqual(currentActivity, this.f24042d.get())) {
            if (currentActivity == null) {
                int i7 = d.f24043a;
                Intrinsics.checkNotNullParameter("StatusBarManagerCompatModule: can not get `WindowInsetsControllerCompat` because current activity is null.", "message");
                return this.f24041c;
            }
            Window window = currentActivity.getWindow();
            this.f24042d = new WeakReference(currentActivity);
            this.f24041c = new WindowInsetsControllerCompat(window, window.getDecorView());
        }
        return this.f24041c;
    }
}
