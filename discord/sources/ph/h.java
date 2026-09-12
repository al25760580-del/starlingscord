package ph;

import android.app.Activity;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f18044a;

    public h(Activity activity) {
        this.f18044a = activity;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            return this.f18044a.equals(((h) obj).f18044a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18044a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return s0.g.e("AgeSignalsAccessRequest{activity=", this.f18044a.toString(), "}");
    }
}
