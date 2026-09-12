package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import x0.g;
import x0.k;
import x0.l;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationChannelCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f1462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f1464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f1465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Uri f1467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioAttributes f1468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1469i;
    public int j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long[] f1470l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f1471m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f1472n;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NotificationChannelCompat f1473a;

        public Builder(String str, int i7) {
            this.f1473a = new NotificationChannelCompat(str, i7);
        }
    }

    public NotificationChannelCompat(String str, int i7) {
        this.f1466f = true;
        this.f1467g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.j = 0;
        str.getClass();
        this.f1461a = str;
        this.f1463c = i7;
        this.f1468h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    public NotificationChannelCompat(NotificationChannel notificationChannel) {
        this(k.p(notificationChannel), k.r(notificationChannel));
        this.f1462b = k.u(notificationChannel);
        this.f1464d = k.n(notificationChannel);
        this.f1465e = k.o(notificationChannel);
        this.f1466f = k.b(notificationChannel);
        this.f1467g = k.z(notificationChannel);
        this.f1468h = k.l(notificationChannel);
        this.f1469i = k.O(notificationChannel);
        this.j = k.s(notificationChannel);
        this.k = k.P(notificationChannel);
        this.f1470l = k.A(notificationChannel);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            this.f1471m = l.b(notificationChannel);
            this.f1472n = l.a(notificationChannel);
        }
        k.a(notificationChannel);
        k.t(notificationChannel);
        if (i7 >= 29) {
            g.a(notificationChannel);
        }
        if (i7 >= 30) {
            l.c(notificationChannel);
        }
    }
}
