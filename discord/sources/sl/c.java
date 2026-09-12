package sl;

import am.g;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.p1;
import com.discord.R;
import com.facebook.react.bridge.ReactContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f20279a = new int[2];

    public static final void a(g gVar, Rect rect) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(rect, "rect");
        if (!gVar.isAttachedToWindow()) {
            Intrinsics.checkNotNullParameter("Can not copy bounds as view is not attached to window", "message");
            return;
        }
        rect.set(0, 0, gVar.getWidth(), gVar.getHeight());
        int[] iArr = f20279a;
        gVar.getLocationInWindow(iArr);
        rect.offset(iArr[0], iArr[1]);
    }

    public static final ViewGroup b(ReactContext reactContext) {
        Window window;
        View decorView;
        View rootView;
        Intrinsics.checkNotNullParameter(reactContext, "<this>");
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null || (rootView = decorView.getRootView()) == null) {
            return null;
        }
        return (ViewGroup) rootView.findViewById(R.id.action_bar_root);
    }

    public static final double c(float f2) {
        return f2 / Resources.getSystem().getDisplayMetrics().density;
    }

    public static final int d(ReactContext reactContext) {
        Window window;
        WindowManager.LayoutParams attributes;
        Intrinsics.checkNotNullParameter(reactContext, "<this>");
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            return 0;
        }
        return attributes.softInputMode;
    }

    public static final boolean e(p1 p1Var) {
        Intrinsics.checkNotNullParameter(p1Var, "<this>");
        return (p1Var.f1715a.c() & 8) != 0;
    }
}
