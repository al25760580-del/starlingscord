package zh;

import a5.d0;
import a5.n;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f23994n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f23996b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f24002h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d0 f24004l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f24005m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f23998d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f23999e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f24000f = new Object();
    public final cg.d j = new cg.d(3, this);
    public final AtomicInteger k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23997c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f24003i = new WeakReference(null);

    public g(Context context, n nVar, Intent intent) {
        this.f23995a = context;
        this.f23996b = nVar;
        this.f24002h = intent;
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f23994n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f23997c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f23997c, 10);
                    handlerThread.start();
                    map.put(this.f23997c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f23997c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void b() {
        synchronized (this.f24000f) {
            try {
                Iterator it = this.f23999e.iterator();
                while (it.hasNext()) {
                    ((ig.g) it.next()).c(new RemoteException(String.valueOf(this.f23997c).concat(" : Binder has died.")));
                }
                this.f23999e.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
