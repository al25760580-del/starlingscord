package oe;

import af.w;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.ads.identifier.AdvertisingIdClient$Info;
import h5.m;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import tf.c;
import tf.d;
import xe.f;
import xe.g;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xe.a f17241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f17242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f17244d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f17245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f17246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f17247g;

    public a(Context context) {
        w.g(context);
        Context applicationContext = context.getApplicationContext();
        this.f17246f = applicationContext != null ? applicationContext : context;
        this.f17243c = false;
        this.f17247g = -1L;
    }

    public static AdvertisingIdClient$Info a(Context context) {
        a aVar = new a(context);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aVar.c();
            AdvertisingIdClient$Info advertisingIdClient$InfoE = aVar.e();
            d(advertisingIdClient$InfoE, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            aVar.b();
            return advertisingIdClient$InfoE;
        } catch (Throwable th2) {
            try {
                d(null, -1L, th2);
                throw th2;
            } catch (Throwable th3) {
                aVar.b();
                throw th3;
            }
        }
    }

    public static void d(AdvertisingIdClient$Info advertisingIdClient$Info, long j, Throwable th2) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (advertisingIdClient$Info != null) {
                map.put("limit_ad_tracking", true != advertisingIdClient$Info.f5891b ? "0" : "1");
                String str = advertisingIdClient$Info.f5890a;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th2 != null) {
                map.put("error", th2.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new m(2, map).start();
        }
    }

    public final void b() {
        w.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f17246f == null || this.f17241a == null) {
                    return;
                }
                try {
                    if (this.f17243c) {
                        ef.a.a().b(this.f17246f, this.f17241a);
                    }
                } catch (Throwable th2) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th2);
                }
                this.f17243c = false;
                this.f17242b = null;
                this.f17241a = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void c() {
        w.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f17243c) {
                    b();
                }
                Context context = this.f17246f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iB = f.f22924b.b(context, 12451000);
                    if (iB != 0 && iB != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    xe.a aVar = new xe.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!ef.a.a().c(context, context.getClass().getName(), intent, aVar, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.f17241a = aVar;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            IBinder iBinderA = aVar.a();
                            int i7 = c.f20740f;
                            IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f17242b = iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new tf.b(iBinderA);
                            this.f17243c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th2) {
                            throw new IOException(th2);
                        }
                    } catch (Throwable th3) {
                        throw new IOException(th3);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new g();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final AdvertisingIdClient$Info e() {
        AdvertisingIdClient$Info advertisingIdClient$Info;
        w.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f17243c) {
                    synchronized (this.f17244d) {
                        b bVar = this.f17245e;
                        if (bVar == null || !bVar.f17251v) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        c();
                        if (!this.f17243c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e10) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                    }
                }
                w.g(this.f17241a);
                w.g(this.f17242b);
                try {
                    tf.b bVar2 = (tf.b) this.f17242b;
                    bVar2.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z5 = true;
                    Parcel parcelJ = bVar2.j(1, parcelObtain);
                    String string = parcelJ.readString();
                    parcelJ.recycle();
                    tf.b bVar3 = (tf.b) this.f17242b;
                    bVar3.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i7 = tf.a.f20738a;
                    parcelObtain2.writeInt(1);
                    Parcel parcelJ2 = bVar3.j(2, parcelObtain2);
                    if (parcelJ2.readInt() == 0) {
                        z5 = false;
                    }
                    parcelJ2.recycle();
                    advertisingIdClient$Info = new AdvertisingIdClient$Info(string, z5);
                } catch (RemoteException e11) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f17244d) {
            b bVar4 = this.f17245e;
            if (bVar4 != null) {
                bVar4.f17250i.countDown();
                try {
                    this.f17245e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.f17247g;
            if (j > 0) {
                this.f17245e = new b(this, j);
            }
        }
        return advertisingIdClient$Info;
    }

    public final void finalize() throws Throwable {
        b();
        super.finalize();
    }
}
