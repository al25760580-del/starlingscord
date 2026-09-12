package x0;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.NotificationCompat$Builder;
import androidx.core.app.NotificationCompat$MessagingStyle;

/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NotificationCompat$Builder f22571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f22572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f22573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22574d = false;

    /* JADX WARN: Code duplicated, block: B:47:0x0094  */
    /* JADX WARN: Code duplicated, block: B:97:0x0179  */
    public static v0 d(Notification notification) {
        v0 notificationCompat$MessagingStyle;
        Bundle bundle = notification.extras;
        if (bundle != null) {
            String string = bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE");
            if (string != null) {
                switch (string) {
                    case "androidx.core.app.NotificationCompat$ProgressStyle":
                        notificationCompat$MessagingStyle = new u0();
                        break;
                    case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                        notificationCompat$MessagingStyle = new k0();
                        break;
                    case "androidx.core.app.NotificationCompat$BigPictureStyle":
                        notificationCompat$MessagingStyle = new x();
                        break;
                    case "androidx.core.app.NotificationCompat$CallStyle":
                        notificationCompat$MessagingStyle = new i0();
                        break;
                    case "androidx.core.app.NotificationCompat$InboxStyle":
                        notificationCompat$MessagingStyle = new y(1);
                        break;
                    case "androidx.core.app.NotificationCompat$BigTextStyle":
                        notificationCompat$MessagingStyle = new y(0);
                        break;
                    case "androidx.core.app.NotificationCompat$MessagingStyle":
                        notificationCompat$MessagingStyle = new NotificationCompat$MessagingStyle();
                        break;
                    default:
                        notificationCompat$MessagingStyle = null;
                        break;
                }
            } else {
                notificationCompat$MessagingStyle = null;
            }
            if (notificationCompat$MessagingStyle == null) {
                if (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) {
                    notificationCompat$MessagingStyle = new NotificationCompat$MessagingStyle();
                } else if (bundle.containsKey("android.picture") || bundle.containsKey("android.pictureIcon")) {
                    notificationCompat$MessagingStyle = new x();
                } else if (bundle.containsKey("android.bigText")) {
                    notificationCompat$MessagingStyle = new y(0);
                } else if (bundle.containsKey("android.textLines")) {
                    notificationCompat$MessagingStyle = new y(1);
                } else if (bundle.containsKey("android.callType")) {
                    notificationCompat$MessagingStyle = new i0();
                } else if (bundle.containsKey("android.progressSegments") || bundle.containsKey("android.progressPoints")) {
                    notificationCompat$MessagingStyle = new u0();
                } else {
                    String string2 = bundle.getString("android.template");
                    if (string2 == null) {
                        notificationCompat$MessagingStyle = null;
                    } else if (string2.equals(Notification.BigPictureStyle.class.getName())) {
                        notificationCompat$MessagingStyle = new x();
                    } else if (string2.equals(Notification.BigTextStyle.class.getName())) {
                        notificationCompat$MessagingStyle = new y(0);
                    } else if (string2.equals(Notification.InboxStyle.class.getName())) {
                        notificationCompat$MessagingStyle = new y(1);
                    } else if (Build.VERSION.SDK_INT >= 36 && string2.equals(Notification.ProgressStyle.class.getName())) {
                        notificationCompat$MessagingStyle = new u0();
                    } else if (string2.equals(Notification.MessagingStyle.class.getName())) {
                        notificationCompat$MessagingStyle = new NotificationCompat$MessagingStyle();
                    } else if (string2.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                        notificationCompat$MessagingStyle = new k0();
                    } else {
                        notificationCompat$MessagingStyle = null;
                    }
                }
            }
            if (notificationCompat$MessagingStyle != null) {
                try {
                    notificationCompat$MessagingStyle.f(bundle);
                    return notificationCompat$MessagingStyle;
                } catch (ClassCastException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    public void a(Bundle bundle) {
        if (this.f22574d) {
            bundle.putCharSequence("android.summaryText", this.f22573c);
        }
        CharSequence charSequence = this.f22572b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", e());
    }

    public abstract void b(hp.e eVar);

    public void c(Bundle bundle) {
        bundle.remove("android.summaryText");
        bundle.remove("android.title.big");
        bundle.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
    }

    public abstract String e();

    public void f(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.f22573c = bundle.getCharSequence("android.summaryText");
            this.f22574d = true;
        }
        this.f22572b = bundle.getCharSequence("android.title.big");
    }
}
