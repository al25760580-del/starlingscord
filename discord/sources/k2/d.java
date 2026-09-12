package k2;

import a5.l0;
import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a5.a f14229a;

    public d(a5.a aVar) {
        this.f14229a = aVar;
    }

    @Override // a.a
    public final void s(Throwable th2) {
        ((i) this.f14229a.f143a).d(th2);
    }

    @Override // a.a
    public final void t(com.google.firebase.messaging.r rVar) {
        a5.a aVar = this.f14229a;
        aVar.f145c = rVar;
        com.google.firebase.messaging.r rVar2 = (com.google.firebase.messaging.r) aVar.f145c;
        i iVar = (i) aVar.f143a;
        aVar.f144b = new e4.m(rVar2, iVar.f14239g, iVar.f14241i, Build.VERSION.SDK_INT >= 34 ? m.a() : l0.x());
        i iVar2 = (i) aVar.f143a;
        iVar2.getClass();
        ArrayList arrayList = new ArrayList();
        iVar2.f14233a.writeLock().lock();
        try {
            iVar2.f14235c = 1;
            arrayList.addAll(iVar2.f14234b);
            iVar2.f14234b.clear();
            iVar2.f14233a.writeLock().unlock();
            iVar2.f14236d.post(new com.google.android.material.datepicker.g(arrayList, iVar2.f14235c, (Throwable) null));
        } catch (Throwable th2) {
            iVar2.f14233a.writeLock().unlock();
            throw th2;
        }
    }
}
