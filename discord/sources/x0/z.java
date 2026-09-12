package x0;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static b0 a(Notification.BubbleMetadata bubbleMetadata) {
        int desiredHeightResId;
        if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
            return null;
        }
        PendingIntent intent = bubbleMetadata.getIntent();
        Icon icon = bubbleMetadata.getIcon();
        PorterDuff.Mode mode = IconCompat.k;
        IconCompat iconCompatI = yk.a.i(icon);
        if (intent == null) {
            throw new NullPointerException("Bubble requires non-null pending intent");
        }
        boolean autoExpandBubble = bubbleMetadata.getAutoExpandBubble();
        PendingIntent deleteIntent = bubbleMetadata.getDeleteIntent();
        int i7 = bubbleMetadata.isNotificationSuppressed() ? (autoExpandBubble ? 1 : 0) | 2 : (autoExpandBubble ? 1 : 0) & (-3);
        int i10 = 0;
        int iMax = bubbleMetadata.getDesiredHeight() != 0 ? Math.max(bubbleMetadata.getDesiredHeight(), 0) : 0;
        if (bubbleMetadata.getDesiredHeightResId() != 0) {
            desiredHeightResId = bubbleMetadata.getDesiredHeightResId();
        } else {
            desiredHeightResId = 0;
            i10 = iMax;
        }
        b0 b0Var = new b0();
        b0Var.f22502a = intent;
        b0Var.f22504c = iconCompatI;
        b0Var.f22505d = i10;
        b0Var.f22506e = desiredHeightResId;
        b0Var.f22503b = deleteIntent;
        b0Var.f22508g = null;
        b0Var.f22507f = i7;
        return b0Var;
    }

    public static Notification.BubbleMetadata b(b0 b0Var) {
        PendingIntent pendingIntent;
        if (b0Var == null || (pendingIntent = b0Var.f22502a) == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(b0Var.f22504c.i(null)).setIntent(pendingIntent).setDeleteIntent(b0Var.f22503b).setAutoExpandBubble((b0Var.f22507f & 1) != 0).setSuppressNotification((b0Var.f22507f & 2) != 0);
        int i7 = b0Var.f22505d;
        if (i7 != 0) {
            suppressNotification.setDesiredHeight(i7);
        }
        int i10 = b0Var.f22506e;
        if (i10 != 0) {
            suppressNotification.setDesiredHeightResId(i10);
        }
        return suppressNotification.build();
    }
}
