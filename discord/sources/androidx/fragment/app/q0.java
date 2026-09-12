package androidx.fragment.app;

import android.util.Log;
import androidx.activity.result.ActivityResultCallback;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements ActivityResultCallback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f2239e;

    public /* synthetic */ q0(FragmentManager fragmentManager, int i7) {
        this.f2238d = i7;
        this.f2239e = fragmentManager;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void d(Object obj) {
        switch (this.f2238d) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    iArr[i7] = ((Boolean) arrayList.get(i7)).booleanValue() ? 0 : -1;
                }
                FragmentManager fragmentManager = this.f2239e;
                x0 x0Var = (x0) fragmentManager.F.pollFirst();
                if (x0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = x0Var.f2270d;
                    int i10 = x0Var.f2271e;
                    Fragment fragmentC = fragmentManager.f2043c.c(str);
                    if (fragmentC == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    } else {
                        fragmentC.onRequestPermissionsResult(i10, strArr, iArr);
                    }
                }
                break;
            case 1:
                f.a aVar = (f.a) obj;
                FragmentManager fragmentManager2 = this.f2239e;
                x0 x0Var2 = (x0) fragmentManager2.F.pollLast();
                if (x0Var2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    String str2 = x0Var2.f2270d;
                    int i11 = x0Var2.f2271e;
                    Fragment fragmentC2 = fragmentManager2.f2043c.c(str2);
                    if (fragmentC2 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    } else {
                        fragmentC2.onActivityResult(i11, aVar.f8759d, aVar.f8760e);
                    }
                }
                break;
            default:
                f.a aVar2 = (f.a) obj;
                FragmentManager fragmentManager3 = this.f2239e;
                x0 x0Var3 = (x0) fragmentManager3.F.pollFirst();
                if (x0Var3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str3 = x0Var3.f2270d;
                    int i12 = x0Var3.f2271e;
                    Fragment fragmentC3 = fragmentManager3.f2043c.c(str3);
                    if (fragmentC3 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    } else {
                        fragmentC3.onActivityResult(i12, aVar2.f8759d, aVar2.f8760e);
                    }
                }
                break;
        }
    }
}
