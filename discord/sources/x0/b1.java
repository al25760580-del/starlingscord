package x0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import androidx.core.app.NotificationManagerCompat;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements Handler.Callback, ServiceConnection {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f22509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f22510e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f22511i = new HashMap();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public HashSet f22512v = new HashSet();

    public b1(Context context) {
        this.f22509d = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f22510e = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(a1 a1Var) {
        boolean z5;
        ArrayDeque arrayDeque = a1Var.f22499d;
        ComponentName componentName = a1Var.f22496a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (a1Var.f22497b) {
            z5 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f22509d;
            boolean zBindService = context.bindService(component, this, 33);
            a1Var.f22497b = zBindService;
            if (zBindService) {
                a1Var.f22500e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z5 = a1Var.f22497b;
        }
        if (!z5 || a1Var.f22498c == null) {
            b(a1Var);
            return;
        }
        while (true) {
            y0 y0Var = (y0) arrayDeque.peek();
            if (y0Var == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + y0Var);
                }
                y0Var.a(a1Var.f22498c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e10) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e10);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(a1Var);
    }

    public final void b(a1 a1Var) {
        ComponentName componentName = a1Var.f22496a;
        ArrayDeque arrayDeque = a1Var.f22499d;
        Handler handler = this.f22510e;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i7 = a1Var.f22500e;
        int i10 = i7 + 1;
        a1Var.f22500e = i10;
        if (i10 <= 6) {
            int i11 = (1 << i7) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i11);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + a1Var.f22500e + " retries");
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i7 = message.what;
        c.c cVar = null;
        if (i7 == 0) {
            y0 y0Var = (y0) message.obj;
            Context context = this.f22509d;
            Object obj = NotificationManagerCompat.f1512c;
            String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
            synchronized (NotificationManagerCompat.f1512c) {
                if (string != null) {
                    try {
                        if (!string.equals(NotificationManagerCompat.f1513d)) {
                            String[] strArrSplit = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            NotificationManagerCompat.f1514e = hashSet2;
                            NotificationManagerCompat.f1513d = string;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                hashSet = NotificationManagerCompat.f1514e;
            }
            if (!hashSet.equals(this.f22512v)) {
                this.f22512v = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.f22509d.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet3) {
                    if (!this.f22511i.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f22511i.put(componentName2, new a1(componentName2));
                    }
                }
                Iterator it = this.f22511i.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        a1 a1Var = (a1) entry.getValue();
                        if (a1Var.f22497b) {
                            this.f22509d.unbindService(this);
                            a1Var.f22497b = false;
                        }
                        a1Var.f22498c = null;
                        it.remove();
                    }
                }
            }
            for (a1 a1Var2 : this.f22511i.values()) {
                a1Var2.f22499d.add(y0Var);
                a(a1Var2);
            }
        } else if (i7 == 1) {
            z0 z0Var = (z0) message.obj;
            ComponentName componentName3 = z0Var.f22585a;
            IBinder iBinder = z0Var.f22586b;
            a1 a1Var3 = (a1) this.f22511i.get(componentName3);
            if (a1Var3 != null) {
                int i10 = c.b.f3401f;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(c.c.f3402d);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c.c)) {
                        c.a aVar = new c.a();
                        aVar.f3400f = iBinder;
                        cVar = aVar;
                    } else {
                        cVar = (c.c) iInterfaceQueryLocalInterface;
                    }
                }
                a1Var3.f22498c = cVar;
                a1Var3.f22500e = 0;
                a(a1Var3);
                return true;
            }
        } else if (i7 == 2) {
            a1 a1Var4 = (a1) this.f22511i.get((ComponentName) message.obj);
            if (a1Var4 != null) {
                if (a1Var4.f22497b) {
                    this.f22509d.unbindService(this);
                    a1Var4.f22497b = false;
                }
                a1Var4.f22498c = null;
                return true;
            }
        } else {
            if (i7 != 3) {
                return false;
            }
            a1 a1Var5 = (a1) this.f22511i.get((ComponentName) message.obj);
            if (a1Var5 != null) {
                a(a1Var5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f22510e.obtainMessage(1, new z0(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f22510e.obtainMessage(2, componentName).sendToTarget();
    }
}
