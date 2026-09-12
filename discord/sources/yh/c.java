package yh;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PendingIntent f23339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f23340e;

    public c(PendingIntent pendingIntent, boolean z5) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f23339d = pendingIntent;
        this.f23340e = z5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            c cVar = (c) ((b) obj);
            if (this.f23339d.equals(cVar.f23339d) && this.f23340e == cVar.f23340e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f23339d.hashCode() ^ 1000003) * 1000003) ^ (true != this.f23340e ? 1237 : 1231);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f23339d.toString() + ", isNoOp=" + this.f23340e + "}";
    }
}
