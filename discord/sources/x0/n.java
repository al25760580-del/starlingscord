package x0;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import androidx.core.app.NotificationChannelCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f22540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f22541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f22543e;

    public n(String str) {
        this.f22543e = Collections.EMPTY_LIST;
        str.getClass();
        this.f22539a = str;
    }

    public final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NotificationChannel notificationChannel = (NotificationChannel) it.next();
            if (this.f22539a.equals(notificationChannel.getGroup())) {
                arrayList.add(new NotificationChannelCompat(notificationChannel));
            }
        }
        return arrayList;
    }

    public n(NotificationChannelGroup notificationChannelGroup, List list) {
        this(k.q(notificationChannelGroup));
        this.f22540b = k.v(notificationChannelGroup);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            this.f22541c = m.c(notificationChannelGroup);
        }
        if (i7 >= 28) {
            this.f22542d = m.e(notificationChannelGroup);
            a(k.m(notificationChannelGroup));
        } else {
            a(list);
        }
    }
}
