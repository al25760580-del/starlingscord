package androidx.core.view;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaFormat;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Objects;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class e1 {
    public static void a(Window window) {
        Objects.requireNonNull(window);
        window.getDecorView();
        k(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            int i10 = i7 >= 30 ? 3 : 1;
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes.layoutInDisplayCutoutMode != i10) {
                attributes.layoutInDisplayCutoutMode = i10;
                window.setAttributes(attributes);
            }
        }
        if (i7 >= 29) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(false);
        }
    }

    public static ColorStateList b(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !(drawable instanceof ColorStateListDrawable)) {
            return null;
        }
        return ((ColorStateListDrawable) drawable).getColorStateList();
    }

    public static Number c(MediaFormat format, String key) {
        Object objO;
        Object objO2;
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!format.containsKey(key)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return format.getNumber(key);
        }
        try {
            rn.q qVar = Result.f14614e;
            objO = Integer.valueOf(format.getInteger(key));
        } catch (Throwable th2) {
            rn.q qVar2 = Result.f14614e;
            objO = ib.a.o(th2);
        }
        if (Result.a(objO) != null) {
            try {
                objO2 = Float.valueOf(format.getFloat(key));
            } catch (Throwable th3) {
                rn.q qVar3 = Result.f14614e;
                objO2 = ib.a.o(th3);
            }
            objO = objO2;
        }
        return (Number) (objO instanceof rn.r ? null : objO);
    }

    public static float d(View view) {
        return view.getTransitionAlpha();
    }

    public static void e(Context context) {
        boolean z5;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (yk.a.r(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            z5 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (Build.VERSION.SDK_INT < 29) {
            a5.l0.v(null);
            return;
        }
        ig.g gVar = new ig.g();
        try {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                SharedPreferences.Editor editorEdit = yk.a.r(context).edit();
                editorEdit.putBoolean("proxy_notification_initialized", true);
                editorEdit.apply();
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (z5) {
                    notificationManager.setNotificationDelegate("com.google.android.gms");
                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate(null);
                }
            } else {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
            }
        } finally {
            gVar.d(null);
        }
    }

    public static boolean f() {
        return Trace.isEnabled();
    }

    public static boolean g(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
            if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if (!Log.isLoggable("FirebaseMessaging", 3)) {
                    return true;
                }
                Log.d("FirebaseMessaging", "GMS core is set for proxying");
                return true;
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
        }
        return false;
    }

    public static Object h(b1.a aVar) {
        switch (b1.b.f3023a[aVar.ordinal()]) {
            case 1:
                return BlendMode.CLEAR;
            case 2:
                return BlendMode.SRC;
            case 3:
                return BlendMode.DST;
            case 4:
                return BlendMode.SRC_OVER;
            case 5:
                return BlendMode.DST_OVER;
            case 6:
                return BlendMode.SRC_IN;
            case 7:
                return BlendMode.DST_IN;
            case 8:
                return BlendMode.SRC_OUT;
            case 9:
                return BlendMode.DST_OUT;
            case 10:
                return BlendMode.SRC_ATOP;
            case 11:
                return BlendMode.DST_ATOP;
            case 12:
                return BlendMode.XOR;
            case 13:
                return BlendMode.PLUS;
            case 14:
                return BlendMode.MODULATE;
            case 15:
                return BlendMode.SCREEN;
            case 16:
                return BlendMode.OVERLAY;
            case 17:
                return BlendMode.DARKEN;
            case 18:
                return BlendMode.LIGHTEN;
            case 19:
                return BlendMode.COLOR_DODGE;
            case 20:
                return BlendMode.COLOR_BURN;
            case 21:
                return BlendMode.HARD_LIGHT;
            case 22:
                return BlendMode.SOFT_LIGHT;
            case 23:
                return BlendMode.DIFFERENCE;
            case 24:
                return BlendMode.EXCLUSION;
            case 25:
                return BlendMode.MULTIPLY;
            case 26:
                return BlendMode.HUE;
            case 27:
                return BlendMode.SATURATION;
            case 28:
                return BlendMode.COLOR;
            case 29:
                return BlendMode.LUMINOSITY;
            default:
                return null;
        }
    }

    public static Insets i(int i7, int i10, int i11, int i12) {
        return Insets.of(i7, i10, i11, i12);
    }

    public static void j(m4.a aVar, Object obj) {
        aVar.setBlendMode((BlendMode) obj);
    }

    public static void k(Window window, boolean z5) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            z0.d.o(window, z5);
        } else {
            if (i7 >= 30) {
                z0.d.n(window, z5);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z5 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static void l(View view, int i7, int i10, int i11, int i12) {
        view.setLeftTopRightBottom(i7, i10, i11, i12);
    }

    public static void m(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    public static void n(int i7, View view) {
        view.setTransitionVisibility(i7);
    }

    public static void o(ViewGroup viewGroup, boolean z5) {
        viewGroup.suppressLayout(z5);
    }

    public static void p(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public static void q(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
