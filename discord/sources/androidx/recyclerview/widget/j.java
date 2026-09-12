package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2619e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2620i;

    public /* synthetic */ j(int i7, Object obj, Object obj2) {
        this.f2618d = i7;
        this.f2620i = obj;
        this.f2619e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2618d) {
            case 0:
                r rVar = (r) this.f2620i;
                ArrayList arrayList = (ArrayList) this.f2619e;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    rVar.animateChangeImpl((DefaultItemAnimator$ChangeInfo) it.next());
                }
                arrayList.clear();
                rVar.mChangesList.remove(arrayList);
                break;
            default:
                androidx.fragment.app.s1 s1Var = (androidx.fragment.app.s1) this.f2620i;
                AsyncListDiffer asyncListDiffer = (AsyncListDiffer) s1Var.f2250x;
                if (asyncListDiffer.f2444g == s1Var.f2246e) {
                    List list = s1Var.f2248v;
                    u uVar = (u) this.f2619e;
                    Runnable runnable = (Runnable) s1Var.f2249w;
                    List list2 = asyncListDiffer.f2443f;
                    asyncListDiffer.f2442e = list;
                    asyncListDiffer.f2443f = Collections.unmodifiableList(list);
                    uVar.a(asyncListDiffer.f2438a);
                    asyncListDiffer.a(list2, runnable);
                }
                break;
        }
    }
}
