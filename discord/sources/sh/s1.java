package sh;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.discord.js_watchdog.SharedPreferencesKey;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class s1 implements AssetPackManager {
    public static final a5.o k = new a5.o("AssetPackManager", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f20177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f20178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f20179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final th.b f20180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v0 f20181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p0 f20182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g1 f20183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final th.f f20185i;
    public final th.f j;

    public s1(s sVar, th.f fVar, p pVar, r rVar, th.b bVar, v0 v0Var, p0 p0Var, th.f fVar2, g1 g1Var) {
        new Handler(Looper.getMainLooper());
        this.f20177a = sVar;
        this.f20185i = fVar;
        this.f20178b = pVar;
        this.f20179c = rVar;
        this.f20180d = bVar;
        this.f20181e = v0Var;
        this.f20182f = p0Var;
        this.j = fVar2;
        this.f20183g = g1Var;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final synchronized void a(AssetPackStateUpdateListener assetPackStateUpdateListener) {
        boolean z5;
        r rVar = this.f20179c;
        synchronized (rVar) {
            r.f20158c.d("registerListener", new Object[0]);
            if (assetPackStateUpdateListener == null) {
                throw new NullPointerException("Registered Asset Pack listener should not be null.");
            }
            rVar.f20159a.add(assetPackStateUpdateListener);
        }
        p pVar = this.f20178b;
        synchronized (pVar) {
            z5 = pVar.f20782e != null;
        }
        synchronized (pVar) {
            pVar.f20778a.d("registerListener", new Object[0]);
            pVar.f20781d.add(assetPackStateUpdateListener);
            pVar.a();
        }
        if (z5) {
            return;
        }
        ((Executor) this.j.a()).execute(new r1(this, 0));
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final Task b(List list) {
        HashMap mapO = this.f20177a.o();
        ArrayList arrayList = new ArrayList(list);
        if (!arrayList.isEmpty()) {
            return ((v1) this.f20185i.a()).a(arrayList, mapO);
        }
        Bundle bundle = new Bundle();
        bundle.putInt(SharedPreferencesKey.SESSION_ID, 0);
        bundle.putInt("error_code", 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            bundle.putInt(sa.a.a("status", str), 4);
            bundle.putInt(sa.a.a("error_code", str), 0);
            bundle.putLong(sa.a.a("total_bytes_to_download", str), 0L);
            bundle.putLong(sa.a.a("bytes_downloaded", str), 0L);
        }
        bundle.putStringArrayList("pack_names", new ArrayList<>(list));
        bundle.putLong("total_bytes_to_download", 0L);
        bundle.putLong("bytes_downloaded", 0L);
        return a5.l0.v(x.a(bundle, this.f20182f, this.f20183g));
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final x c(List list) {
        v0 v0Var = this.f20181e;
        v0Var.getClass();
        Map map = (Map) v0Var.b(new e4.r(20, v0Var, list));
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Integer num = (Integer) map.get(str);
            map2.put(str, AssetPackState.a(str, num == null ? 0 : num.intValue(), 0, 0L, 0L, 0.0d, 0, "", ""));
        }
        ((v1) this.f20185i.a()).e(list);
        return new x(0L, map2);
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final v d(String str) {
        PackageInfo packageInfo;
        HashSet hashSet;
        if (!this.f20184h) {
            ((Executor) this.j.a()).execute(new r1(this, 1));
            this.f20184h = true;
        }
        s sVar = this.f20177a;
        sVar.getClass();
        try {
            if (sVar.m(str) != null) {
                try {
                    return sVar.i(str);
                } catch (IOException unused) {
                    return null;
                }
            }
        } catch (IOException unused2) {
        }
        th.b bVar = this.f20180d;
        bVar.getClass();
        a5.o oVar = th.b.f20766c;
        try {
            packageInfo = bVar.f20767a.getPackageManager().getPackageInfo(bVar.f20768b, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        } catch (PackageManager.NameNotFoundException unused3) {
            oVar.b("App is not found in PackageManager", new Object[0]);
            packageInfo = null;
        }
        if (packageInfo == null || packageInfo.applicationInfo == null) {
            hashSet = new HashSet();
        } else {
            hashSet = new HashSet();
            Bundle bundle = packageInfo.applicationInfo.metaData;
            HashSet<String> hashSet2 = new HashSet();
            if (bundle != null) {
                String string = bundle.getString("com.android.dynamic.apk.fused.modules");
                if (string == null || string.isEmpty()) {
                    oVar.a("App has no fused modules.", new Object[0]);
                } else {
                    Collections.addAll(hashSet2, string.split(",", -1));
                    hashSet2.remove("");
                    hashSet2.remove("base");
                }
            }
            String[] strArr = packageInfo.splitNames;
            if (strArr != null) {
                oVar.a("Adding splits from package manager: %s", Arrays.toString(strArr));
                Collections.addAll(hashSet2, strArr);
            } else {
                oVar.a("No splits are found or app cannot be found in package manager.", new Object[0]);
            }
            if (th.a.f20765a.get() != null) {
                throw new ClassCastException();
            }
            for (String str2 : hashSet2) {
                if (!str2.startsWith("config.") && !str2.contains(".config.")) {
                    hashSet.add(str2);
                }
            }
        }
        if (hashSet.contains(str)) {
            return v.f20203d;
        }
        return null;
    }

    public final void e(boolean z5) {
        c4.d dVar;
        p pVar = this.f20178b;
        synchronized (pVar) {
            dVar = pVar.f20782e;
        }
        boolean z6 = dVar != null;
        synchronized (pVar) {
            pVar.f20783f = z5;
            pVar.a();
        }
        if (!z5 || z6) {
            return;
        }
        ((Executor) this.j.a()).execute(new r1(this, 0));
    }
}
