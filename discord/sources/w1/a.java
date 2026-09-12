package w1;

import kotlin.jvm.internal.Intrinsics;
import n1.h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f21981e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o1.d f21982i;

    public /* synthetic */ a(e eVar, o1.d dVar, int i7) {
        this.f21980d = i7;
        this.f21981e = eVar;
        this.f21982i = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21980d) {
            case 0:
                h hVar = this.f21981e.f21994f;
                if (hVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    hVar = null;
                }
                Object hVar2 = this.f21982i;
                if (hVar2 == null) {
                    hVar2 = new o1.h("No provider data returned");
                }
                hVar.h(hVar2);
                break;
            default:
                h hVar3 = this.f21981e.f21994f;
                if (hVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    hVar3 = null;
                }
                hVar3.h(this.f21982i);
                break;
        }
    }
}
