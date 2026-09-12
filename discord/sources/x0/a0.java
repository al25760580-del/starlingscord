package x0;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {
    public static b0 a(Notification.BubbleMetadata bubbleMetadata) {
        jn.b bVar;
        if (bubbleMetadata == null) {
            return null;
        }
        if (bubbleMetadata.getShortcutId() != null) {
            String shortcutId = bubbleMetadata.getShortcutId();
            bVar = new jn.b();
            if (TextUtils.isEmpty(shortcutId)) {
                throw new NullPointerException("Bubble requires a non-null shortcut id");
            }
            bVar.f13980d = shortcutId;
        } else {
            PendingIntent intent = bubbleMetadata.getIntent();
            Icon icon = bubbleMetadata.getIcon();
            PorterDuff.Mode mode = IconCompat.k;
            IconCompat iconCompatI = yk.a.i(icon);
            bVar = new jn.b();
            if (intent == null) {
                throw new NullPointerException("Bubble requires non-null pending intent");
            }
            bVar.f13981e = intent;
            bVar.f13982f = iconCompatI;
        }
        bVar.a(1, bubbleMetadata.getAutoExpandBubble());
        bVar.f13983g = bubbleMetadata.getDeleteIntent();
        bVar.a(2, bubbleMetadata.isNotificationSuppressed());
        if (bubbleMetadata.getDesiredHeight() != 0) {
            bVar.f13977a = Math.max(bubbleMetadata.getDesiredHeight(), 0);
            bVar.f13978b = 0;
        }
        if (bubbleMetadata.getDesiredHeightResId() != 0) {
            bVar.f13978b = bubbleMetadata.getDesiredHeightResId();
            bVar.f13977a = 0;
        }
        IconCompat iconCompat = (IconCompat) bVar.f13982f;
        PendingIntent pendingIntent = (PendingIntent) bVar.f13981e;
        String str = bVar.f13980d;
        if (str == null && pendingIntent == null) {
            throw new NullPointerException("Must supply pending intent or shortcut to bubble");
        }
        if (str == null && iconCompat == null) {
            throw new NullPointerException("Must supply an icon or shortcut for the bubble");
        }
        PendingIntent pendingIntent2 = (PendingIntent) bVar.f13983g;
        int i7 = bVar.f13977a;
        int i10 = bVar.f13978b;
        int i11 = bVar.f13979c;
        b0 b0Var = new b0();
        b0Var.f22502a = pendingIntent;
        b0Var.f22504c = iconCompat;
        b0Var.f22505d = i7;
        b0Var.f22506e = i10;
        b0Var.f22503b = pendingIntent2;
        b0Var.f22508g = str;
        b0Var.f22507f = i11;
        return b0Var;
    }

    public static Notification.BubbleMetadata b(b0 b0Var) {
        if (b0Var == null) {
            return null;
        }
        String str = b0Var.f22508g;
        Notification.BubbleMetadata.Builder builder = str != null ? new Notification.BubbleMetadata.Builder(str) : new Notification.BubbleMetadata.Builder(b0Var.f22502a, b0Var.f22504c.i(null));
        builder.setDeleteIntent(b0Var.f22503b).setAutoExpandBubble((b0Var.f22507f & 1) != 0).setSuppressNotification((b0Var.f22507f & 2) != 0);
        int i7 = b0Var.f22505d;
        if (i7 != 0) {
            builder.setDesiredHeight(i7);
        }
        int i10 = b0Var.f22506e;
        if (i10 != 0) {
            builder.setDesiredHeightResId(i10);
        }
        return builder.build();
    }
}
