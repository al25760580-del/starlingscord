package com.google.android.gms.cloudmessaging;

import a5.g;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import ig.l;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import we.d;
import we.f;
import xf.a;

/* JADX INFO: loaded from: classes3.dex */
public final class Rpc {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f5920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static PendingIntent f5921i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleArrayMap f5922a = new SimpleArrayMap(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f5923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f5924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f5925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Messenger f5926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Messenger f5927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f5928g;

    public Rpc(Context context) {
        this.f5923b = context;
        g gVar = new g();
        gVar.f185e = 0;
        gVar.f186i = context;
        this.f5924c = gVar;
        this.f5926e = new Messenger(new d(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f5925d = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00de  */
    public final l a(Bundle bundle) {
        String string;
        synchronized (Rpc.class) {
            int i7 = f5920h;
            f5920h = i7 + 1;
            string = Integer.toString(i7);
        }
        ig.g gVar = new ig.g();
        synchronized (this.f5922a) {
            this.f5922a.put(string, gVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f5924c.i() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f5923b;
        synchronized (Rpc.class) {
            try {
                if (f5921i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f5921i = PendingIntent.getBroadcast(context, 0, intent2, a.f22947a);
                }
                intent.putExtra("app", f5921i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        intent.putExtra("kid", "|ID|" + string + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f5926e);
        if (this.f5927f != null || this.f5928g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f5927f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.f5928g.f22200d;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                if (this.f5924c.i() == 2) {
                    this.f5923b.sendBroadcast(intent);
                } else {
                    this.f5923b.startService(intent);
                }
            }
        } else if (this.f5924c.i() == 2) {
            this.f5923b.sendBroadcast(intent);
        } else {
            this.f5923b.startService(intent);
        }
        gVar.f11763a.b(we.g.f22202i, new n8.f(this, string, this.f5925d.schedule(new s9.a(2, gVar), 30L, TimeUnit.SECONDS)));
        return gVar.f11763a;
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.f5922a) {
            try {
                ig.g gVar = (ig.g) this.f5922a.remove(str);
                if (gVar != null) {
                    gVar.b(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
