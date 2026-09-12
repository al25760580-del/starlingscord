package v3;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f21408c;

    public h(int i7, Notification notification, int i10) {
        this.f21406a = i7;
        this.f21408c = notification;
        this.f21407b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f21406a == hVar.f21406a && this.f21407b == hVar.f21407b) {
            return this.f21408c.equals(hVar.f21408c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21408c.hashCode() + (((this.f21406a * 31) + this.f21407b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f21406a + ", mForegroundServiceType=" + this.f21407b + ", mNotification=" + this.f21408c + '}';
    }
}
