package i;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import com.discord.misc.utilities.logThrottle.LogThrottleSingleton;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class v extends fh.s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11262c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.a f11263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f11264e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.appcompat.app.a aVar, e4.m mVar) {
        super(aVar);
        this.f11263d = aVar;
        this.f11264e = mVar;
    }

    @Override // fh.s
    public final IntentFilter e() {
        switch (this.f11262c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // fh.s
    public final int f() {
        Location location;
        boolean z5;
        long j;
        Location lastKnownLocation;
        switch (this.f11262c) {
            case 0:
                return r.a((PowerManager) this.f11264e) ? 2 : 1;
            default:
                e4.m mVar = (e4.m) this.f11264e;
                g0 g0Var = (g0) mVar.f7995v;
                LocationManager locationManager = (LocationManager) mVar.f7994i;
                if (g0Var.f11215b <= System.currentTimeMillis()) {
                    Context context = (Context) mVar.f7993e;
                    Location lastKnownLocation2 = null;
                    if (y0.d.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        } catch (Exception e10) {
                            Log.d("TwilightManager", "Failed to get last known location", e10);
                        }
                        location = lastKnownLocation;
                    } else {
                        location = null;
                    }
                    if (y0.d.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e11) {
                            Log.d("TwilightManager", "Failed to get last known location", e11);
                        }
                    }
                    if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                        location = lastKnownLocation2;
                    }
                    z5 = false;
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (f0.f11209d == null) {
                            f0.f11209d = new f0();
                        }
                        f0 f0Var = f0.f11209d;
                        f0Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        f0Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z5 = f0Var.f11212c == 1;
                        long j5 = f0Var.f11211b;
                        long j7 = f0Var.f11210a;
                        f0Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j10 = f0Var.f11211b;
                        if (j5 == -1 || j7 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j7) {
                                j5 = j10;
                            } else if (jCurrentTimeMillis > j5) {
                                j5 = j7;
                            }
                            j = j5 + LogThrottleSingleton.RATE_LIMIT_ONE_MINUTE;
                        }
                        g0Var.f11214a = z5;
                        g0Var.f11215b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i7 = Calendar.getInstance().get(11);
                        if (i7 < 6 || i7 >= 22) {
                            z5 = true;
                        }
                    }
                    break;
                } else {
                    z5 = g0Var.f11214a;
                }
                return z5 ? 2 : 1;
        }
    }

    @Override // fh.s
    public final void j() throws IllegalAccessException {
        switch (this.f11262c) {
            case 0:
                this.f11263d.E(true, true);
                break;
            default:
                this.f11263d.E(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.appcompat.app.a aVar, Context context) {
        super(aVar);
        this.f11263d = aVar;
        this.f11264e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
