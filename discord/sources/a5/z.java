package a5;

import androidx.collection.SimpleArrayMap;
import androidx.core.util.Consumer;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryProductDetailsResult;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f280b;

    public /* synthetic */ z(int i7, Object obj) {
        this.f279a = i7;
        this.f280b = obj;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.f279a) {
            case 0:
                QueryProductDetailsResult queryProductDetailsResult = new QueryProductDetailsResult(new ArrayList(), new ArrayList());
                ((k) this.f280b).a((BillingResult) obj, queryProductDetailsResult);
                return;
            case 1:
                i1.e eVar = (i1.e) obj;
                if (eVar == null) {
                    eVar = new i1.e(-3);
                }
                ((e4.e) this.f280b).M(eVar);
                return;
            default:
                i1.e eVar2 = (i1.e) obj;
                synchronized (i1.f.f11370c) {
                    try {
                        SimpleArrayMap simpleArrayMap = i1.f.f11371d;
                        ArrayList arrayList = (ArrayList) simpleArrayMap.get((String) this.f280b);
                        if (arrayList == null) {
                            return;
                        }
                        simpleArrayMap.remove((String) this.f280b);
                        for (int i7 = 0; i7 < arrayList.size(); i7++) {
                            ((Consumer) arrayList.get(i7)).accept(eVar2);
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
        }
    }
}
