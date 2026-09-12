package il;

import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Promise f11859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AtomicInteger f11862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WritableNativeArray f11863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11864f;

    public final synchronized boolean a() {
        if (this.f11864f) {
            Log.w("image-crop-picker", "Skipping result, already sent...");
            return false;
        }
        if (this.f11859a != null) {
            return true;
        }
        Log.w("image-crop-picker", "Trying to notify success but promise is not set");
        return false;
    }

    public final synchronized void b(String str, Exception exc) {
        if (a()) {
            Log.e("image-crop-picker", "Promise rejected. " + exc.getMessage());
            this.f11859a.reject(str, exc);
            this.f11864f = true;
        }
    }

    public final synchronized void c(String str, String str2) {
        if (a()) {
            Log.e("image-crop-picker", "Promise rejected. " + str2);
            this.f11859a.reject(str, str2);
            this.f11864f = true;
        }
    }

    public final synchronized void d(WritableNativeMap writableNativeMap) {
        try {
            if (a()) {
                if (this.f11861c) {
                    this.f11863e.pushMap(writableNativeMap);
                    if (this.f11862d.addAndGet(1) == this.f11860b) {
                        this.f11859a.resolve(this.f11863e);
                        this.f11864f = true;
                    }
                } else {
                    this.f11859a.resolve(writableNativeMap);
                    this.f11864f = true;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void e(int i7) {
        this.f11860b = i7;
        this.f11862d = new AtomicInteger(0);
    }

    public final synchronized void f(Promise promise, boolean z5) {
        this.f11859a = promise;
        this.f11861c = z5;
        this.f11864f = false;
        this.f11860b = 0;
        this.f11862d = new AtomicInteger(0);
        if (z5) {
            this.f11863e = new WritableNativeArray();
        }
    }
}
