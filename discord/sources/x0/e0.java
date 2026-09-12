package x0;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {
    public static Notification.Builder a(Notification.Builder builder, String str) {
        return builder.addPerson(str);
    }

    public static Notification.Builder b(Notification.Builder builder, String str) {
        return builder.setCategory(str);
    }
}
