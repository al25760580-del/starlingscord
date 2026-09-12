package l4;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class g implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f14852b;

    public g(h hVar, int i7) {
        this.f14851a = i7;
        switch (i7) {
            case 1:
                this.f14852b = new WeakReference(hVar);
                break;
            default:
                this.f14852b = new WeakReference(hVar);
                break;
        }
    }

    @Override // l4.y
    public final void onResult(Object obj) {
        switch (this.f14851a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                h hVar = (h) this.f14852b.get();
                if (hVar != null) {
                    int i7 = hVar.f14856v;
                    if (i7 != 0) {
                        hVar.setImageResource(i7);
                    }
                    y yVar = hVar.f14855i;
                    if (yVar == null) {
                        yVar = h.K;
                    }
                    yVar.onResult(th2);
                    break;
                }
                break;
            default:
                i iVar = (i) obj;
                h hVar2 = (h) this.f14852b.get();
                if (hVar2 != null) {
                    hVar2.setComposition(iVar);
                    break;
                }
                break;
        }
    }
}
