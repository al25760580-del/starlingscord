package ji;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import mi.i;
import mi.q;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements xi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13885c;

    public /* synthetic */ b(int i7, Object obj, Object obj2) {
        this.f13883a = i7;
        this.f13884b = obj;
        this.f13885c = obj2;
    }

    @Override // xi.a
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f13883a) {
            case 0:
                f fVar = (f) this.f13884b;
                Context context = (Context) this.f13885c;
                String strC = fVar.c();
                cj.a aVar = new cj.a();
                Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:" + strC, 0);
                boolean z5 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z5 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z5 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                aVar.f3727a = z5;
                return aVar;
            case 1:
                mi.f fVar2 = (mi.f) this.f13884b;
                mi.b bVar = (mi.b) this.f13885c;
                mi.e eVar = bVar.f15804f;
                zl.e eVar2 = new zl.e();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<i> set = bVar.f15801c;
                Set set2 = bVar.f15805g;
                for (i iVar : set) {
                    int i7 = iVar.f15822c;
                    int i10 = iVar.f15821b;
                    boolean z6 = i7 == 0;
                    q qVar = iVar.f15820a;
                    if (z6) {
                        if (i10 == 2) {
                            hashSet4.add(qVar);
                        } else {
                            hashSet.add(qVar);
                        }
                    } else if (i7 == 2) {
                        hashSet3.add(qVar);
                    } else if (i10 == 2) {
                        hashSet5.add(qVar);
                    } else {
                        hashSet2.add(qVar);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(q.a(ui.a.class));
                }
                eVar2.f24044d = Collections.unmodifiableSet(hashSet);
                eVar2.f24045e = Collections.unmodifiableSet(hashSet2);
                Collections.unmodifiableSet(hashSet3);
                eVar2.f24046i = Collections.unmodifiableSet(hashSet4);
                eVar2.f24047v = Collections.unmodifiableSet(hashSet5);
                eVar2.f24048w = fVar2;
                return eVar.a(eVar2);
            default:
                return new vi.g((Context) this.f13885c, (String) this.f13884b);
        }
    }

    public /* synthetic */ b(Context context, String str) {
        this.f13883a = 2;
        this.f13885c = context;
        this.f13884b = str;
    }
}
