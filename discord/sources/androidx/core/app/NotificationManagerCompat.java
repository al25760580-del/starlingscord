package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import vd.a;
import x0.b1;
import x0.k;
import x0.l;
import x0.m;
import x0.n;
import x0.y0;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationManagerCompat {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f1513d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static b1 f1516g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NotificationManager f1518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f1512c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static HashSet f1514e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f1515f = new Object();

    public NotificationManagerCompat(Context context) {
        this.f1517a = context;
        this.f1518b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(List list) {
        NotificationChannelGroup notificationChannelGroup;
        if (Build.VERSION.SDK_INT < 26 || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            int i7 = Build.VERSION.SDK_INT;
            if (i7 < 26) {
                nVar.getClass();
                notificationChannelGroup = null;
            } else {
                NotificationChannelGroup notificationChannelGroupE = k.e(nVar.f22540b, nVar.f22539a);
                if (i7 >= 28) {
                    m.f(notificationChannelGroupE, nVar.f22541c);
                }
                notificationChannelGroup = notificationChannelGroupE;
            }
            arrayList.add(notificationChannelGroup);
        }
        k.f(this.f1518b, arrayList);
    }

    public final void b(List list) {
        NotificationChannel notificationChannel;
        String str;
        String str2;
        if (Build.VERSION.SDK_INT < 26 || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NotificationChannelCompat notificationChannelCompat = (NotificationChannelCompat) it.next();
            int i7 = Build.VERSION.SDK_INT;
            if (i7 < 26) {
                notificationChannelCompat.getClass();
                notificationChannel = null;
            } else {
                NotificationChannel notificationChannelD = k.d(notificationChannelCompat.f1463c, notificationChannelCompat.f1462b, notificationChannelCompat.f1461a);
                k.E(notificationChannelD, notificationChannelCompat.f1464d);
                k.F(notificationChannelD, notificationChannelCompat.f1465e);
                k.K(notificationChannelD, notificationChannelCompat.f1466f);
                k.L(notificationChannelD, notificationChannelCompat.f1467g, notificationChannelCompat.f1468h);
                k.j(notificationChannelD, notificationChannelCompat.f1469i);
                k.H(notificationChannelD, notificationChannelCompat.j);
                k.N(notificationChannelD, notificationChannelCompat.f1470l);
                k.k(notificationChannelD, notificationChannelCompat.k);
                if (i7 >= 30 && (str = notificationChannelCompat.f1471m) != null && (str2 = notificationChannelCompat.f1472n) != null) {
                    l.d(notificationChannelD, str, str2);
                }
                notificationChannel = notificationChannelD;
            }
            arrayList.add(notificationChannel);
        }
        k.g(this.f1518b, arrayList);
    }

    public final NotificationChannelCompat c(String str) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            NotificationChannel notificationChannelW = i7 >= 26 ? k.w(this.f1518b, str) : null;
            if (notificationChannelW != null) {
                return new NotificationChannelCompat(notificationChannelW);
            }
        }
        return null;
    }

    public final NotificationChannelGroup d(String str) {
        int i7 = Build.VERSION.SDK_INT;
        NotificationManager notificationManager = this.f1518b;
        if (i7 >= 28) {
            return m.d(notificationManager, str);
        }
        if (i7 < 26) {
            return null;
        }
        Iterator it = (i7 >= 26 ? k.x(notificationManager) : Collections.EMPTY_LIST).iterator();
        while (it.hasNext()) {
            NotificationChannelGroup notificationChannelGroupD = a.d(it.next());
            if (notificationChannelGroupD.getId().equals(str)) {
                return notificationChannelGroupD;
            }
        }
        return null;
    }

    public final List e() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            NotificationManager notificationManager = this.f1518b;
            List listX = i7 >= 26 ? k.x(notificationManager) : Collections.EMPTY_LIST;
            if (!listX.isEmpty()) {
                List listY = (i7 < 28 && i7 >= 26) ? k.y(notificationManager) : Collections.EMPTY_LIST;
                ArrayList arrayList = new ArrayList(listX.size());
                Iterator it = listX.iterator();
                while (it.hasNext()) {
                    NotificationChannelGroup notificationChannelGroupD = a.d(it.next());
                    if (Build.VERSION.SDK_INT >= 28) {
                        arrayList.add(new n(notificationChannelGroupD, Collections.EMPTY_LIST));
                    } else {
                        arrayList.add(new n(notificationChannelGroupD, listY));
                    }
                }
                return arrayList;
            }
        }
        return Collections.EMPTY_LIST;
    }

    public final List f() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            List listY = i7 >= 26 ? k.y(this.f1518b) : Collections.EMPTY_LIST;
            if (!listY.isEmpty()) {
                ArrayList arrayList = new ArrayList(listY.size());
                Iterator it = listY.iterator();
                while (it.hasNext()) {
                    arrayList.add(new NotificationChannelCompat((NotificationChannel) it.next()));
                }
                return arrayList;
            }
        }
        return Collections.EMPTY_LIST;
    }

    public final void g(String str, int i7, Notification notification) {
        NotificationManager notificationManager = this.f1518b;
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(str, i7, notification);
            return;
        }
        y0 y0Var = new y0(this.f1517a.getPackageName(), i7, str, notification);
        synchronized (f1515f) {
            try {
                if (f1516g == null) {
                    f1516g = new b1(this.f1517a.getApplicationContext());
                }
                f1516g.f22510e.obtainMessage(0, y0Var).sendToTarget();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notificationManager.cancel(str, i7);
    }
}
