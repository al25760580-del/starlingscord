package x0;

import android.app.Notification;
import android.app.RemoteInput;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static Bundle a(Notification.Action action) {
        return action.getExtras();
    }

    public static RemoteInput[] b(Notification.Action action) {
        return action.getRemoteInputs();
    }
}
