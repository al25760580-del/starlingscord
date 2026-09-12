package androidx.recyclerview.widget;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f2617e;

    public i(r rVar, ArrayList arrayList) {
        this.f2617e = rVar;
        this.f2616d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<q> arrayList = this.f2616d;
        for (q qVar : arrayList) {
            this.f2617e.animateMoveImpl(qVar.f2670a, qVar.f2671b, qVar.f2672c, qVar.f2673d, qVar.f2674e);
        }
        arrayList.clear();
        this.f2617e.mMovesList.remove(arrayList);
    }
}
