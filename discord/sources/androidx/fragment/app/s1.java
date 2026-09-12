package androidx.fragment.app;

import android.view.View;
import androidx.recyclerview.widget.AsyncListDiffer;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s1 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2245d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2246e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f2247i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ List f2248v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2249w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2250x;

    public s1(int i7, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f2246e = i7;
        this.f2247i = arrayList;
        this.f2248v = arrayList2;
        this.f2249w = arrayList3;
        this.f2250x = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f2245d;
        Object obj = this.f2250x;
        switch (i7) {
            case 0:
                for (int i10 = 0; i10 < this.f2246e; i10++) {
                    View view = (View) ((ArrayList) this.f2247i).get(i10);
                    String str = (String) ((ArrayList) this.f2248v).get(i10);
                    WeakHashMap weakHashMap = androidx.core.view.u0.f1729a;
                    androidx.core.view.l0.n(view, str);
                    androidx.core.view.l0.n((View) ((ArrayList) this.f2249w).get(i10), (String) ((ArrayList) obj).get(i10));
                }
                break;
            default:
                ((AsyncListDiffer) obj).f2440c.execute(new androidx.recyclerview.widget.j(1, this, androidx.recyclerview.widget.c.a(new androidx.recyclerview.widget.e(this), true)));
                break;
        }
    }

    public s1(AsyncListDiffer asyncListDiffer, List list, List list2, int i7, Runnable runnable) {
        this.f2250x = asyncListDiffer;
        this.f2247i = list;
        this.f2248v = list2;
        this.f2246e = i7;
        this.f2249w = runnable;
    }
}
