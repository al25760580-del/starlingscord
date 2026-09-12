package z0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import g.e;
import g.f;
import g.g;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile c f23583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile ArrayList f23584b;

    public static Icon a(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static final gn.c b(View view, ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getParent() == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        try {
            rootView.offsetDescendantRectToMyCoords(view, rect);
            return new gn.c(rect.left, rect.top, view.getWidth(), view.getHeight());
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005a  */
    public static final gn.a c(View view) {
        gn.a aVar;
        Insets insets;
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getHeight() == 0) {
            return null;
        }
        View rootView = view.getRootView();
        Intrinsics.checkNotNull(rootView);
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsets rootWindowInsets = rootView.getRootWindowInsets();
            if (rootWindowInsets == null || (insets = rootWindowInsets.getInsets(WindowInsets.Type.statusBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.navigationBars() | WindowInsets.Type.captionBar() | WindowInsets.Type.ime())) == null) {
                aVar = null;
            } else {
                aVar = new gn.a(insets.top, insets.right, insets.bottom, insets.left);
            }
        } else {
            WindowInsets rootWindowInsets2 = rootView.getRootWindowInsets();
            if (rootWindowInsets2 == null) {
                aVar = null;
            } else {
                aVar = new gn.a(rootWindowInsets2.getSystemWindowInsetTop(), rootWindowInsets2.getSystemWindowInsetRight(), Math.min(rootWindowInsets2.getSystemWindowInsetBottom(), rootWindowInsets2.getStableInsetBottom()), rootWindowInsets2.getSystemWindowInsetLeft());
            }
        }
        if (aVar == null) {
            return null;
        }
        float width = rootView.getWidth();
        float height = rootView.getHeight();
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return new gn.a(Math.max(aVar.f10128a - rect.top, 0.0f), Math.max(Math.min((view.getWidth() + rect.left) - width, 0.0f) + aVar.f10129b, 0.0f), Math.max(Math.min((view.getHeight() + rect.top) - height, 0.0f) + aVar.f10130c, 0.0f), Math.max(aVar.f10131d - rect.left, 0.0f));
    }

    public static List d(Context context) {
        Bundle bundle;
        String string;
        if (f23584b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        if (Class.forName(string, false, d.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context) != null) {
                            throw new ClassCastException();
                        }
                        arrayList.add(null);
                    } catch (Exception unused) {
                        continue;
                    }
                }
            }
            if (f23584b == null) {
                f23584b = arrayList;
            }
        }
        return f23584b;
    }

    public static c e(Context context) {
        if (f23583a == null) {
            try {
                f23583a = (c) Class.forName("f3.f", false, d.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (f23583a == null) {
                f23583a = new b();
            }
        }
        return f23583a;
    }

    public static List f(Context context) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            return ShortcutInfoCompat.a(context, ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(10));
        }
        if (i7 < 25) {
            try {
                return e(context).b();
            } catch (Exception unused) {
                return Collections.EMPTY_LIST;
            }
        }
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(shortcutManager.getDynamicShortcuts());
        return ShortcutInfoCompat.a(context, arrayList);
    }

    public static CharSequence g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static ResolveInfo h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
    }

    public static String i(g input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input instanceof e) {
            return "image/*";
        }
        if (input instanceof f) {
            return "video/*";
        }
        if (input instanceof g.d) {
            return null;
        }
        throw new n();
    }

    public static boolean j() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            return true;
        }
        return i7 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
    }

    public static void k(Context context, ShortcutInfoCompat shortcutInfoCompat) {
        IconCompat iconCompat;
        int i7;
        InputStream inputStreamH;
        Bitmap bitmapDecodeStream;
        IconCompat iconCompatC;
        context.getClass();
        shortcutInfoCompat.getClass();
        int i10 = Build.VERSION.SDK_INT;
        int maxShortcutCountPerActivity = i10 >= 25 ? ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity() : 5;
        if (maxShortcutCountPerActivity == 0) {
            return;
        }
        if (i10 <= 29 && (iconCompat = shortcutInfoCompat.f1550h) != null && (((i7 = iconCompat.f1560a) == 6 || i7 == 4) && (inputStreamH = iconCompat.h(context)) != null && (bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamH)) != null)) {
            if (i7 == 6) {
                iconCompatC = new IconCompat(5);
                iconCompatC.f1561b = bitmapDecodeStream;
            } else {
                iconCompatC = IconCompat.c(bitmapDecodeStream);
            }
            shortcutInfoCompat.f1550h = iconCompatC;
        }
        int i11 = -1;
        if (i10 >= 30) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(shortcutInfoCompat.b());
        } else if (i10 >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager.isRateLimitingActive()) {
                return;
            }
            List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= maxShortcutCountPerActivity) {
                int rank = -1;
                String id2 = null;
                for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                    if (shortcutInfo.getRank() > rank) {
                        id2 = shortcutInfo.getId();
                        rank = shortcutInfo.getRank();
                    }
                }
                shortcutManager.removeDynamicShortcuts(Arrays.asList(id2));
            }
            shortcutManager.addDynamicShortcuts(Arrays.asList(shortcutInfoCompat.b()));
        }
        c cVarE = e(context);
        try {
            List<ShortcutInfoCompat> listB = cVarE.b();
            if (listB.size() >= maxShortcutCountPerActivity) {
                String str = null;
                for (ShortcutInfoCompat shortcutInfoCompat2 : listB) {
                    int i12 = shortcutInfoCompat2.f1553m;
                    if (i12 > i11) {
                        str = shortcutInfoCompat2.f1544b;
                        i11 = i12;
                    }
                }
                cVarE.d(Arrays.asList(str));
            }
            cVarE.a(Arrays.asList(shortcutInfoCompat));
            Iterator it = ((ArrayList) d(context)).iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                Collections.singletonList(shortcutInfoCompat);
                throw null;
            }
        } catch (Exception unused) {
            Iterator it2 = ((ArrayList) d(context)).iterator();
            if (it2.hasNext()) {
                if (it2.next() != null) {
                    throw new ClassCastException();
                }
                Collections.singletonList(shortcutInfoCompat);
                throw null;
            }
        } catch (Throwable th2) {
            Iterator it3 = ((ArrayList) d(context)).iterator();
            if (!it3.hasNext()) {
                m(context, shortcutInfoCompat.f1544b);
                throw th2;
            }
            if (it3.next() != null) {
                throw new ClassCastException();
            }
            Collections.singletonList(shortcutInfoCompat);
            throw null;
        }
        m(context, shortcutInfoCompat.f1544b);
    }

    public static void l(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            vd.a.f(context.getSystemService(vd.a.g())).removeAllDynamicShortcuts();
        }
        e(context).c();
        Iterator it = ((ArrayList) d(context)).iterator();
        if (it.hasNext()) {
            throw s0.g.a(it);
        }
    }

    public static void m(Context context, String str) {
        context.getClass();
        str.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            vd.a.f(context.getSystemService(vd.a.g())).reportShortcutUsed(str);
        }
        Iterator it = ((ArrayList) d(context)).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            Collections.singletonList(str);
            throw null;
        }
    }

    public static void n(Window window, boolean z5) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z5 ? systemUiVisibility & (-257) : systemUiVisibility | IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
        window.setDecorFitsSystemWindows(z5);
    }

    public static void o(Window window, boolean z5) {
        window.setDecorFitsSystemWindows(z5);
    }

    public static void p(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
