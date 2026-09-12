package fh;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f9256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9257b;

    public s(Context context) {
        this.f9256a = context;
    }

    public static float g(int i7, int i10, int i11) {
        return yk.a.e((i7 - i10) / i11, 0.0f, 1.0f);
    }

    public abstract void c();

    public void d() {
        c4.d dVar = (c4.d) this.f9256a;
        if (dVar != null) {
            try {
                ((androidx.appcompat.app.a) this.f9257b).H.unregisterReceiver(dVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f9256a = null;
        }
    }

    public abstract IntentFilter e();

    public abstract int f();

    public MenuItem h(MenuItem menuItem) {
        if (!(menuItem instanceof d1.a)) {
            return menuItem;
        }
        d1.a aVar = (d1.a) menuItem;
        if (((SimpleArrayMap) this.f9257b) == null) {
            this.f9257b = new SimpleArrayMap(0);
        }
        MenuItem menuItem2 = (MenuItem) ((SimpleArrayMap) this.f9257b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        n.q qVar = new n.q((Context) this.f9256a, aVar);
        ((SimpleArrayMap) this.f9257b).put(aVar, qVar);
        return qVar;
    }

    public abstract void i();

    public abstract void j();

    public abstract String k();

    public abstract void l(c cVar);

    public abstract void m();

    public void n() {
        d();
        IntentFilter intentFilterE = e();
        if (intentFilterE.countActions() == 0) {
            return;
        }
        if (((c4.d) this.f9256a) == null) {
            this.f9256a = new c4.d(2, this);
        }
        ((androidx.appcompat.app.a) this.f9257b).H.registerReceiver((c4.d) this.f9256a, intentFilterE);
    }

    public abstract void o();

    public abstract void p();

    public s() {
        ArrayList arrayList = new ArrayList();
        this.f9257b = arrayList;
        arrayList.add(new p());
    }

    public s(mj.a aVar) {
        this.f9256a = aVar;
        this.f9257b = new n8.f(aVar);
    }

    public s(androidx.appcompat.app.a aVar) {
        this.f9257b = aVar;
    }
}
