package sh;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements v1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a5.o f20094g = new a5.o("AssetPackServiceImpl", 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Intent f20095h = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f20097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1 f20098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final th.q f20099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final th.q f20100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f20101f = new AtomicBoolean();

    public m(Context context, p0 p0Var, g1 g1Var) {
        this.f20096a = context.getPackageName();
        this.f20097b = p0Var;
        this.f20098c = g1Var;
        boolean zA = th.c.a(context);
        a5.o oVar = f20094g;
        if (zA) {
            Context applicationContext = context.getApplicationContext();
            applicationContext = applicationContext == null ? context : applicationContext;
            Intent intent = f20095h;
            this.f20099d = new th.q(applicationContext, oVar, "AssetPackService", intent);
            Context applicationContext2 = context.getApplicationContext();
            this.f20100e = new th.q(applicationContext2 != null ? applicationContext2 : context, oVar, "AssetPackService-keepAlive", intent);
        }
        oVar.a("AssetPackService initiated.", new Object[0]);
    }

    public static Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 20300);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        bundle.putIntegerArrayList("supported_patch_formats", arrayList2);
        return bundle;
    }

    public static ig.l i() {
        f20094g.b("onError(%d)", -11);
        return a5.l0.u(new ph.a(-11, 1));
    }

    public static /* bridge */ /* synthetic */ Bundle k(HashMap map) {
        Bundle bundleH = h();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        bundleH.putParcelableArrayList("installed_asset_module", arrayList);
        return bundleH;
    }

    public static /* bridge */ /* synthetic */ ArrayList l(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    @Override // sh.v1
    public final ig.l a(ArrayList arrayList, HashMap map) {
        th.q qVar = this.f20099d;
        if (qVar == null) {
            return i();
        }
        f20094g.d("startDownload(%s)", arrayList);
        ig.g gVar = new ig.g();
        qVar.c(new b(this, gVar, arrayList, map, gVar), gVar);
        op.c cVar = new op.c(7, this);
        ig.l lVar = gVar.f11763a;
        lVar.d(cVar);
        return lVar;
    }

    @Override // sh.v1
    public final void b(int i7) {
        th.q qVar = this.f20099d;
        if (qVar == null) {
            throw new l0("The Play Store app is not installed or is an unofficial version.", i7);
        }
        f20094g.d("notifySessionFailed", new Object[0]);
        ig.g gVar = new ig.g();
        qVar.c(new f(this, gVar, i7, gVar), gVar);
    }

    @Override // sh.v1
    public final void c(int i7, String str) {
        j(i7, 10, str);
    }

    @Override // sh.v1
    public final void d(int i7, int i10, String str, String str2) {
        th.q qVar = this.f20099d;
        if (qVar == null) {
            throw new l0("The Play Store app is not installed or is an unofficial version.", i7);
        }
        f20094g.d("notifyChunkTransferred", new Object[0]);
        ig.g gVar = new ig.g();
        qVar.c(new d(this, gVar, i7, str, str2, i10, gVar, 0), gVar);
    }

    @Override // sh.v1
    public final void e(List list) {
        th.q qVar = this.f20099d;
        if (qVar == null) {
            return;
        }
        f20094g.d("cancelDownloads(%s)", list);
        ig.g gVar = new ig.g();
        qVar.c(new c(this, gVar, list, gVar, 0), gVar);
    }

    @Override // sh.v1
    public final ig.l f(int i7, int i10, String str, String str2) {
        th.q qVar = this.f20099d;
        if (qVar == null) {
            return i();
        }
        f20094g.d("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i10), Integer.valueOf(i7));
        ig.g gVar = new ig.g();
        qVar.c(new d(this, gVar, i7, str, str2, i10, gVar, 1), gVar);
        return gVar.f11763a;
    }

    @Override // sh.v1
    public final ig.l g(HashMap map) {
        th.q qVar = this.f20099d;
        if (qVar == null) {
            return i();
        }
        f20094g.d("syncPacks", new Object[0]);
        ig.g gVar = new ig.g();
        qVar.c(new c(this, gVar, map, gVar, 1), gVar);
        return gVar.f11763a;
    }

    public final void j(int i7, int i10, String str) {
        th.q qVar = this.f20099d;
        if (qVar == null) {
            throw new l0("The Play Store app is not installed or is an unofficial version.", i7);
        }
        f20094g.d("notifyModuleCompleted", new Object[0]);
        ig.g gVar = new ig.g();
        qVar.c(new e(this, gVar, i7, str, gVar, i10), gVar);
    }

    @Override // sh.v1
    public final synchronized void f() {
        if (this.f20100e == null) {
            f20094g.e("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        a5.o oVar = f20094g;
        oVar.d("keepAlive", new Object[0]);
        if (!this.f20101f.compareAndSet(false, true)) {
            oVar.d("Service is already kept alive.", new Object[0]);
        } else {
            ig.g gVar = new ig.g();
            this.f20100e.c(new g(this, gVar, gVar), gVar);
        }
    }
}
