package y0;

import a1.i;
import a1.j;
import a1.n;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.LocusId;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.app.NotificationManagerCompat;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f23126a = null;

    public static int a(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new NotificationManagerCompat(context).f1518b.areNotificationsEnabled() ? 0 : -1;
    }

    public static LocusId b(String str) {
        return new LocusId(str);
    }

    public static ColorStateList c(Context context, int i7) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        i iVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        j jVar = new j(resources, theme);
        synchronized (n.f44c) {
            try {
                SparseArray sparseArray = (SparseArray) n.f43b.get(jVar);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (iVar = (i) sparseArray.get(i7)) == null) {
                    colorStateList = null;
                } else {
                    if (iVar.f32b.equals(resources.getConfiguration())) {
                        if (theme != null || iVar.f33c != 0) {
                            if (theme == null || iVar.f33c != theme.hashCode()) {
                            }
                        }
                        colorStateList = iVar.f31a;
                    }
                    sparseArray.remove(i7);
                    colorStateList = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = n.f42a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i7, typedValue, true);
        int i10 = typedValue.type;
        if (i10 < 28 || i10 > 31) {
            try {
                colorStateListA = a1.c.a(resources, resources.getXml(i7), theme);
            } catch (Exception e10) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i7, theme);
        }
        synchronized (n.f44c) {
            try {
                WeakHashMap weakHashMap = n.f43b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(jVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(jVar, sparseArray2);
                }
                sparseArray2.append(i7, new i(colorStateListA, jVar.f34a.getConfiguration(), theme));
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return colorStateListA;
    }

    public static String d(LocusId locusId) {
        return locusId.getId();
    }

    public static String e(Context context) {
        String str = context.getApplicationContext().getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (d.a(context, str) == 0) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            str = context.getOpPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            if (d.a(context, str) == 0) {
                return str;
            }
        }
        throw new RuntimeException(s0.g.e("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static Intent f(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, int i7) {
        int i10 = i7 & 2;
        if (i10 == 0 && (i7 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i10 != 0 && (i7 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            return a.b(context, broadcastReceiver, intentFilter, str, i7);
        }
        if (i11 >= 26) {
            return a.a(context, broadcastReceiver, intentFilter, str, i7);
        }
        return ((i7 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, null) : context.registerReceiver(broadcastReceiver, intentFilter, e(context), null);
    }
}
