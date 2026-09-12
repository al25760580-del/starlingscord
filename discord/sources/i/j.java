package i;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.os.LocaleListCompat;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f11224e;

    public /* synthetic */ j(Context context, int i7) {
        this.f11223d = i7;
        this.f11224e = context;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008b  */
    @Override // java.lang.Runnable
    public final void run() {
        LocaleListCompat localeListCompat;
        Object systemService;
        Context contextE;
        int i7 = this.f11223d;
        Context context = this.f11224e;
        switch (i7) {
            case 0:
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 33) {
                    f4.l lVar = AppCompatDelegate.f732d;
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i10 >= 33) {
                            s.f fVar = AppCompatDelegate.f738y;
                            fVar.getClass();
                            s.a aVar = new s.a(fVar);
                            while (true) {
                                if (aVar.hasNext()) {
                                    AppCompatDelegate appCompatDelegate = (AppCompatDelegate) ((WeakReference) aVar.next()).get();
                                    if (appCompatDelegate != null && (contextE = appCompatDelegate.e()) != null) {
                                        systemService = contextE.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            if (systemService != null) {
                                localeListCompat = new LocaleListCompat(new f1.d(l.a(systemService)));
                            } else {
                                localeListCompat = LocaleListCompat.f1569b;
                            }
                        } else {
                            localeListCompat = AppCompatDelegate.f734i;
                            if (localeListCompat == null) {
                                localeListCompat = LocaleListCompat.f1569b;
                            }
                        }
                        if (localeListCompat.f1570a.f8789a.isEmpty()) {
                            String strF = x0.f.f(context);
                            Object systemService2 = context.getSystemService("locale");
                            if (systemService2 != null) {
                                l.b(systemService2, k.a(strF));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                AppCompatDelegate.f737x = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new j(context, 2));
                break;
            default:
                y2.c.t(context, new com.discord.misc.utilities.threading.a(1), y2.c.f23143a, false);
                break;
        }
    }
}
