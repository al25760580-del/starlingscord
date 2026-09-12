package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.Toolbar;
import androidx.core.os.LocaleListCompat;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import f4.l;
import f4.n;
import i.c0;
import i.d0;
import i8.c;
import java.lang.ref.WeakReference;
import s.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppCompatDelegate {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f732d = new l(new n(1));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f733e = -100;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static LocaleListCompat f734i = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static LocaleListCompat f735v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static Boolean f736w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static boolean f737x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final f f738y = new f(0);
    public static final Object E = new Object();
    public static final Object F = new Object();

    public static boolean l(Context context) {
        if (f736w == null) {
            try {
                int i7 = d0.f11197d;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) d0.class), c0.a() | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).metaData;
                if (bundle != null) {
                    f736w = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f736w = Boolean.FALSE;
            }
        }
        return f736w.booleanValue();
    }

    public static void u(AppCompatDelegate appCompatDelegate) {
        synchronized (E) {
            try {
                f fVar = f738y;
                fVar.getClass();
                s.a aVar = new s.a(fVar);
                while (aVar.hasNext()) {
                    AppCompatDelegate appCompatDelegate2 = (AppCompatDelegate) ((WeakReference) aVar.next()).get();
                    if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                        aVar.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void z(int i7) {
        if (i7 != -1 && i7 != 0 && i7 != 1 && i7 != 2 && i7 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
            return;
        }
        if (f733e != i7) {
            f733e = i7;
            synchronized (E) {
                try {
                    f fVar = f738y;
                    fVar.getClass();
                    s.a aVar = new s.a(fVar);
                    while (aVar.hasNext()) {
                        AppCompatDelegate appCompatDelegate = (AppCompatDelegate) ((WeakReference) aVar.next()).get();
                        if (appCompatDelegate != null) {
                            appCompatDelegate.b();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public abstract void A(Toolbar toolbar);

    public void B(int i7) {
    }

    public abstract void C(CharSequence charSequence);

    public abstract ActionMode D(ActionMode.Callback callback);

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean b();

    public Context c(Context context) {
        return context;
    }

    public abstract View d(int i7);

    public Context e() {
        return null;
    }

    public abstract c f();

    public int g() {
        return -100;
    }

    public abstract MenuInflater h();

    public abstract ActionBar i();

    public abstract void j();

    public abstract void k();

    public abstract void m(Configuration configuration);

    public abstract void n();

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract void s();

    public abstract void t();

    public abstract boolean v(int i7);

    public abstract void w(int i7);

    public abstract void x(View view);

    public abstract void y(View view, ViewGroup.LayoutParams layoutParams);
}
