package androidx.core.app;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import yk.a;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationCompat$Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f1474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f1475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RemoteInput[] f1476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f1480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f1482i;
    public final PendingIntent j;
    public final boolean k;

    public NotificationCompat$Action(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, RemoteInput[] remoteInputArr2, boolean z5, int i7, boolean z6, boolean z7, boolean z10) {
        this.f1478e = true;
        this.f1475b = iconCompat;
        if (iconCompat != null) {
            int i10 = iconCompat.f1560a;
            if ((i10 == -1 ? a.v(iconCompat.f1561b) : i10) == 2) {
                this.f1481h = iconCompat.f();
            }
        }
        this.f1482i = NotificationCompat$Builder.e(charSequence);
        this.j = pendingIntent;
        this.f1474a = bundle == null ? new Bundle() : bundle;
        this.f1476c = remoteInputArr;
        this.f1477d = z5;
        this.f1479f = i7;
        this.f1478e = z6;
        this.f1480g = z7;
        this.k = z10;
    }

    public final IconCompat a() {
        int i7;
        if (this.f1475b == null && (i7 = this.f1481h) != 0) {
            this.f1475b = IconCompat.d(null, "", i7);
        }
        return this.f1475b;
    }
}
