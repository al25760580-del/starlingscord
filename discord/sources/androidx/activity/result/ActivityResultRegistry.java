package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.n;
import androidx.lifecycle.t;
import f.a;
import f.c;
import f.d;
import f.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import x0.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f723a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f724b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f725c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f726d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f727e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f728f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f729g = new Bundle();

    public final boolean a(int i7, int i10, Intent intent) {
        String str = (String) this.f723a.get(Integer.valueOf(i7));
        if (str == null) {
            return false;
        }
        c cVar = (c) this.f727e.get(str);
        if ((cVar != null ? cVar.f8765a : null) != null) {
            ArrayList arrayList = this.f726d;
            if (arrayList.contains(str)) {
                cVar.f8765a.d(cVar.f8766b.c(i10, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f728f.remove(str);
        this.f729g.putParcelable(str, new a(i10, intent));
        return true;
    }

    public abstract void b(int i7, ActivityResultContract activityResultContract, Object obj, f fVar);

    public final f.f c(String key, ActivityResultContract contract, ActivityResultCallback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        e(key);
        this.f727e.put(key, new c(contract, callback));
        LinkedHashMap linkedHashMap = this.f728f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            callback.d(obj);
        }
        Bundle bundle = this.f729g;
        a aVar = (a) yk.a.p(bundle, key, a.class);
        if (aVar != null) {
            bundle.remove(key);
            callback.d(contract.c(aVar.f8759d, aVar.f8760e));
        }
        return new f.f(this, key, contract, 1);
    }

    public final f.f d(final String key, LifecycleOwner lifecycleOwner, final ActivityResultContract contract, final ActivityResultCallback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.b().a(Lifecycle.State.f2298v)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        e(key);
        LinkedHashMap linkedHashMap = this.f725c;
        d dVar = (d) linkedHashMap.get(key);
        if (dVar == null) {
            dVar = new d(lifecycle);
        }
        t observer = new t() { // from class: f.b
            @Override // androidx.lifecycle.t
            public final void c(LifecycleOwner lifecycleOwner2, n event) {
                Intrinsics.checkNotNullParameter(lifecycleOwner2, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                n nVar = n.ON_START;
                ActivityResultRegistry activityResultRegistry = this.f8761d;
                String str = key;
                if (nVar != event) {
                    if (n.ON_STOP == event) {
                        activityResultRegistry.f727e.remove(str);
                        return;
                    } else {
                        if (n.ON_DESTROY == event) {
                            activityResultRegistry.f(str);
                            return;
                        }
                        return;
                    }
                }
                LinkedHashMap linkedHashMap2 = activityResultRegistry.f727e;
                Bundle bundle = activityResultRegistry.f729g;
                LinkedHashMap linkedHashMap3 = activityResultRegistry.f728f;
                ActivityResultContract activityResultContract = contract;
                ActivityResultCallback activityResultCallback = callback;
                linkedHashMap2.put(str, new c(activityResultContract, activityResultCallback));
                if (linkedHashMap3.containsKey(str)) {
                    Object obj = linkedHashMap3.get(str);
                    linkedHashMap3.remove(str);
                    activityResultCallback.d(obj);
                }
                a aVar = (a) yk.a.p(bundle, str, a.class);
                if (aVar != null) {
                    bundle.remove(str);
                    activityResultCallback.d(activityResultContract.c(aVar.f8759d, aVar.f8760e));
                }
            }
        };
        Intrinsics.checkNotNullParameter(observer, "observer");
        dVar.f8767a.a(observer);
        dVar.f8768b.add(observer);
        linkedHashMap.put(key, dVar);
        return new f.f(this, key, contract, 0);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.f724b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : xq.n.d(e.f8769d)) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f723a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void f(String key) {
        Integer num;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f726d.contains(key) && (num = (Integer) this.f724b.remove(key)) != null) {
            this.f723a.remove(num);
        }
        this.f727e.remove(key);
        LinkedHashMap linkedHashMap = this.f728f;
        if (linkedHashMap.containsKey(key)) {
            StringBuilder sbN = com.discord.chat.presentation.list.a.n("Dropping pending result for request ", key, ": ");
            sbN.append(linkedHashMap.get(key));
            Log.w("ActivityResultRegistry", sbN.toString());
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.f729g;
        if (bundle.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((a) yk.a.p(bundle, key, a.class)));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.f725c;
        d dVar = (d) linkedHashMap2.get(key);
        if (dVar != null) {
            ArrayList arrayList = dVar.f8768b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                dVar.f8767a.c((t) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(key);
        }
    }
}
