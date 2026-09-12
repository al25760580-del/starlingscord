package i;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.p3;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, androidx.appcompat.app.a aVar) {
        Objects.requireNonNull(aVar);
        p3 p3Var = new p3(2, aVar);
        hm.a.i(obj).registerOnBackInvokedCallback(1000000, p3Var);
        return p3Var;
    }

    public static void c(Object obj, Object obj2) {
        hm.a.i(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
