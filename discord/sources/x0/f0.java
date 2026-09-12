package x0;

import android.app.Notification;
import android.graphics.drawable.Icon;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {
    public static void b(Notification.Builder builder, Icon icon) {
        builder.setLargeIcon(icon);
    }

    public static Parcelable a(Icon icon) {
        return icon;
    }
}
