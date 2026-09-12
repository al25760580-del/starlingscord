package je;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.rnfs.RNFSManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static u f13845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static HandlerThread f13846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Handler f13847g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f13849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f13850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f13851d;

    public u(int i7, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f13848a = i7;
        this.f13851d = str;
        this.f13849b = arrayList;
        this.f13850c = arrayList2;
    }

    public static void a(u uVar, int i7) {
        synchronized (uVar.f13851d) {
            try {
                if (uVar.f13848a == i7) {
                    return;
                }
                uVar.f13848a = i7;
                for (WeakReference weakReference : (CopyOnWriteArrayList) uVar.f13850c) {
                    he.r rVar = (he.r) weakReference.get();
                    if (rVar != null) {
                        rVar.a(i7);
                    } else {
                        ((CopyOnWriteArrayList) uVar.f13850c).remove(weakReference);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(SparseIntArray sparseIntArray, long j) {
        if (sparseIntArray != null) {
            int i7 = (int) ((500000 + j) / 1000000);
            if (j >= 0) {
                sparseIntArray.put(i7, sparseIntArray.get(i7) + 1);
            }
        }
    }

    public static synchronized u c(Context context) {
        try {
            if (f13845e == null) {
                f13845e = new u(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f13845e;
    }

    public int d() {
        int i7;
        synchronized (this.f13851d) {
            i7 = this.f13848a;
        }
        return i7;
    }

    public void e(com.rnfs.b bVar) {
        Promise promise = (Promise) this.f13849b;
        if (((Exception) bVar.f7079c) != null) {
            ((RNFSManager) this.f13851d).reject(promise, ((ReadableMap) this.f13850c).getString("toFile"), (Exception) bVar.f7079c);
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("jobId", this.f13848a);
        writableMapCreateMap.putInt("statusCode", bVar.f7077a);
        writableMapCreateMap.putDouble("bytesWritten", bVar.f7078b);
        promise.resolve(writableMapCreateMap);
    }

    public u(Context context) {
        this.f13849b = new Handler(Looper.getMainLooper());
        this.f13850c = new CopyOnWriteArrayList();
        this.f13851d = new Object();
        this.f13848a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new c4.d(4, this), intentFilter);
    }
}
