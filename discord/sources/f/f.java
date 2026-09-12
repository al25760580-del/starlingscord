package f;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f extends ActivityResultLauncher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityResultRegistry f8771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ActivityResultContract f8773d;

    public /* synthetic */ f(ActivityResultRegistry activityResultRegistry, String str, ActivityResultContract activityResultContract, int i7) {
        this.f8770a = i7;
        this.f8771b = activityResultRegistry;
        this.f8772c = str;
        this.f8773d = activityResultContract;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public final void a(Object obj, x0.f fVar) {
        switch (this.f8770a) {
            case 0:
                ActivityResultRegistry activityResultRegistry = this.f8771b;
                LinkedHashMap linkedHashMap = activityResultRegistry.f724b;
                ArrayList arrayList = activityResultRegistry.f726d;
                String str = this.f8772c;
                Object obj2 = linkedHashMap.get(str);
                ActivityResultContract activityResultContract = this.f8773d;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + activityResultContract + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    activityResultRegistry.b(iIntValue, activityResultContract, obj, fVar);
                    return;
                } catch (Exception e10) {
                    arrayList.remove(str);
                    throw e10;
                }
            default:
                ActivityResultRegistry activityResultRegistry2 = this.f8771b;
                ArrayList arrayList2 = activityResultRegistry2.f726d;
                LinkedHashMap linkedHashMap2 = activityResultRegistry2.f724b;
                String str2 = this.f8772c;
                Object obj3 = linkedHashMap2.get(str2);
                ActivityResultContract activityResultContract2 = this.f8773d;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + activityResultContract2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str2);
                try {
                    activityResultRegistry2.b(iIntValue2, activityResultContract2, obj, fVar);
                    return;
                } catch (Exception e11) {
                    arrayList2.remove(str2);
                    throw e11;
                }
        }
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public final void b() {
        switch (this.f8770a) {
            case 0:
                this.f8771b.f(this.f8772c);
                break;
            default:
                this.f8771b.f(this.f8772c);
                break;
        }
    }
}
