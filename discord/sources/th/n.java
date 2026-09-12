package th;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a5.o f20778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntentFilter f20779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f20780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f20781d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c4.d f20782e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f20783f = false;

    public n(a5.o oVar, IntentFilter intentFilter, Context context) {
        this.f20778a = oVar;
        this.f20779b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f20780c = applicationContext != null ? applicationContext : context;
    }

    public final void a() {
        c4.d dVar;
        if ((this.f20783f || !this.f20781d.isEmpty()) && this.f20782e == null) {
            c4.d dVar2 = new c4.d(6, this);
            this.f20782e = dVar2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.f20780c.registerReceiver(dVar2, this.f20779b, 2);
            } else {
                this.f20780c.registerReceiver(dVar2, this.f20779b);
            }
        }
        if (this.f20783f || !this.f20781d.isEmpty() || (dVar = this.f20782e) == null) {
            return;
        }
        this.f20780c.unregisterReceiver(dVar);
        this.f20782e = null;
    }

    public abstract void b(Intent intent);
}
