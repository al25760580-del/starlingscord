package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f2625e;

    public k(r rVar, ArrayList arrayList) {
        this.f2625e = rVar;
        this.f2624d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f2624d;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            r rVar = this.f2625e;
            if (!zHasNext) {
                arrayList.clear();
                rVar.mAdditionsList.remove(arrayList);
                return;
            }
            rVar.animateAddImpl((RecyclerView.ViewHolder) it.next());
        }
    }
}
