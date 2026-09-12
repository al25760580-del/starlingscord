package l1;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c f14814b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f14815a;

    public c(int i7) {
        switch (i7) {
            case 3:
                this.f14815a = null;
                break;
            default:
                this.f14815a = new Object();
                new Handler(Looper.getMainLooper(), new mh.e(0, this));
                break;
        }
    }
}
