package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class n extends Lambda implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2200d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f2201e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2202i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2203v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, ViewGroup viewGroup, Object obj) {
        super(0);
        this.f2201e = pVar;
        this.f2203v = viewGroup;
        this.f2202i = obj;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005b  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2200d) {
            case 0:
                this.f2201e.f2217f.e(this.f2203v, this.f2202i);
                break;
            default:
                p pVar = this.f2201e;
                ArrayList arrayList = pVar.f2214c;
                t1 t1Var = pVar.f2217f;
                if (arrayList.isEmpty()) {
                    if (FragmentManager.M(2)) {
                        Log.v("FragmentManager", "Animating to start");
                    }
                    Object obj = pVar.f2226q;
                    Intrinsics.checkNotNull(obj);
                    t1Var.d(obj, new d(1, pVar, this.f2203v));
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!((q) it.next()).f2178a.f2278g) {
                            if (FragmentManager.M(2)) {
                                Log.v("FragmentManager", "Completing animating immediately");
                            }
                            f1.b bVar = new f1.b();
                            t1Var.u(((q) arrayList.get(0)).f2178a.f2274c, this.f2202i, bVar, new x(3, pVar));
                            bVar.a();
                        }
                    }
                    if (FragmentManager.M(2)) {
                        Log.v("FragmentManager", "Animating to start");
                    }
                    Object obj2 = pVar.f2226q;
                    Intrinsics.checkNotNull(obj2);
                    t1Var.d(obj2, new d(1, pVar, this.f2203v));
                }
                break;
        }
        return Unit.f14616a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, Object obj, ViewGroup viewGroup) {
        super(0);
        this.f2201e = pVar;
        this.f2202i = obj;
        this.f2203v = viewGroup;
    }
}
