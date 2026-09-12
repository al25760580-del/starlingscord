package hg;

import a3.h;
import af.w;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.datastore.preferences.protobuf.d1;
import ff.f;
import ff.g;
import hf.c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f10729n = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f10730o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f10731p = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f10733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScheduledFuture f10735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f10737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public dg.a f10739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ff.b f10740i;
    public final String j;
    public final HashMap k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f10741l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f10742m;

    public a(Context context, String str) {
        boolean zBooleanValue;
        String packageName = context.getPackageName();
        this.f10732a = new Object();
        this.f10734c = 0;
        this.f10737f = new HashSet();
        this.f10738g = true;
        this.f10740i = ff.b.f9150a;
        this.k = new HashMap();
        this.f10741l = new AtomicInteger(0);
        w.e(str, "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f10739h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.j = str;
        } else {
            this.j = str.length() != 0 ? "*gcore*:".concat(str) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new d1(sb2.toString());
        }
        this.f10733b = powerManager.newWakeLock(1, str);
        Method method = g.f9160a;
        synchronized (g.class) {
            Boolean bool = g.f9162c;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = y0.b.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                g.f9162c = Boolean.valueOf(zBooleanValue);
            }
        }
        if (zBooleanValue) {
            int i7 = f.f9159a;
            packageName = packageName == null || packageName.trim().isEmpty() ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfo = c.a(context).f10726a.getPackageManager().getApplicationInfo(packageName, 0);
                    if (applicationInfo == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i10 = applicationInfo.uid;
                        workSource = new WorkSource();
                        Method method2 = g.f9161b;
                        if (method2 != null) {
                            try {
                                method2.invoke(workSource, Integer.valueOf(i10), packageName);
                            } catch (Exception e10) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                            }
                        } else {
                            Method method3 = g.f9160a;
                            if (method3 != null) {
                                try {
                                    method3.invoke(workSource, Integer.valueOf(i10));
                                } catch (Exception e11) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.f10733b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e12) {
                    Log.wtf("WakeLock", e12.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f10730o;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f10731p) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f10730o;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f10730o = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f10742m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public final void a(long j) {
        this.f10741l.incrementAndGet();
        long j5 = f10729n;
        long j7 = LongCompanionObject.MAX_VALUE;
        long jMax = Math.max(Math.min(LongCompanionObject.MAX_VALUE, j5), 1L);
        if (j > 0) {
            jMax = Math.min(j, jMax);
        }
        synchronized (this.f10732a) {
            try {
                if (!b()) {
                    this.f10739h = dg.a.f7626d;
                    this.f10733b.acquire();
                    this.f10740i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f10734c++;
                if (this.f10738g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.k.get(null);
                if (bVar == null) {
                    bVar = new b();
                    this.k.put(null, bVar);
                }
                bVar.f10743a++;
                this.f10740i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (LongCompanionObject.MAX_VALUE - jElapsedRealtime > jMax) {
                    j7 = jElapsedRealtime + jMax;
                }
                if (j7 > this.f10736e) {
                    this.f10736e = j7;
                    ScheduledFuture scheduledFuture = this.f10735d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f10735d = this.f10742m.schedule(new h(18, this), jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z5;
        synchronized (this.f10732a) {
            z5 = this.f10734c > 0;
        }
        return z5;
    }

    public final void c() {
        if (this.f10741l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f10732a) {
            try {
                if (this.f10738g) {
                    TextUtils.isEmpty(null);
                }
                if (this.k.containsKey(null)) {
                    b bVar = (b) this.k.get(null);
                    if (bVar != null) {
                        int i7 = bVar.f10743a - 1;
                        bVar.f10743a = i7;
                        if (i7 == 0) {
                            this.k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f10737f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void e() {
        synchronized (this.f10732a) {
            try {
                if (b()) {
                    if (this.f10738g) {
                        int i7 = this.f10734c - 1;
                        this.f10734c = i7;
                        if (i7 > 0) {
                            return;
                        }
                    } else {
                        this.f10734c = 0;
                    }
                    d();
                    Iterator it = this.k.values().iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).f10743a = 0;
                    }
                    this.k.clear();
                    ScheduledFuture scheduledFuture = this.f10735d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f10735d = null;
                        this.f10736e = 0L;
                    }
                    if (this.f10733b.isHeld()) {
                        try {
                            try {
                                this.f10733b.release();
                                if (this.f10739h != null) {
                                    this.f10739h = null;
                                }
                            } catch (RuntimeException e10) {
                                if (!e10.getClass().equals(RuntimeException.class)) {
                                    throw e10;
                                }
                                Log.e("WakeLock", String.valueOf(this.j).concat(" failed to release!"), e10);
                                if (this.f10739h != null) {
                                    this.f10739h = null;
                                }
                            }
                        } catch (Throwable th2) {
                            if (this.f10739h != null) {
                                this.f10739h = null;
                            }
                            throw th2;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
