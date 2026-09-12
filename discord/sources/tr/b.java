package tr;

import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import net.time4j.android.spi.AndroidResourceLoader;
import net.time4j.b1;
import net.time4j.e1;
import net.time4j.x0;
import vr.c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f20881a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f20882b = new AtomicBoolean(false);

    public static void a(ReactApplicationContext reactApplicationContext) {
        long jNanoTime = System.nanoTime();
        if (!f20881a.getAndSet(true)) {
            System.setProperty("net.time4j.base.ResourceLoader", "net.time4j.android.spi.AndroidResourceLoader");
            AndroidResourceLoader androidResourceLoader = (AndroidResourceLoader) c.f21955b;
            if (reactApplicationContext == null) {
                androidResourceLoader.getClass();
                throw new NullPointerException("Missing Android-context.");
            }
            androidResourceLoader.f16595d = reactApplicationContext;
            androidResourceLoader.f16596e = Collections.singletonList(new ur.a(androidResourceLoader));
        }
        Context applicationContext = reactApplicationContext.getApplicationContext();
        if (applicationContext != null && !f20882b.getAndSet(true)) {
            System.setProperty("net.time4j.allow.system.tz.override", "true");
            applicationContext.registerReceiver(new a(), new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
        }
        Log.i("TIME4A", "Starting Time4A (v4.8-2021a published on " + new e1(x0.z(2021, 3, 27, true), b1.J).f16629d + ")");
        Log.i("TIME4A", "Main-Thread consumed in ms: " + ((System.nanoTime() - jNanoTime) / 1000000));
    }
}
