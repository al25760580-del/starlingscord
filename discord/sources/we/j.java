package we;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ig.g f22213b = new ig.g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f22215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22216e;

    public j(int i7, int i10, Bundle bundle, int i11) {
        this.f22216e = i11;
        this.f22212a = i7;
        this.f22214c = i10;
        this.f22215d = bundle;
    }

    public final boolean a() {
        switch (this.f22216e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(ag.b bVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + bVar.toString());
        }
        this.f22213b.a(bVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f22213b.b(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f22214c + " id=" + this.f22212a + " oneWay=" + a() + "}";
    }
}
