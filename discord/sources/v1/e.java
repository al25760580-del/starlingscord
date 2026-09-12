package v1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f21355e;

    public /* synthetic */ e(h hVar, int i7) {
        this.f21354d = i7;
        this.f21355e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21354d) {
            case 0:
                n1.h hVar = this.f21355e.f21363f;
                if (hVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    hVar = null;
                }
                hVar.h(new o1.h("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                break;
            default:
                n1.h hVar2 = this.f21355e.f21363f;
                if (hVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    hVar2 = null;
                }
                hVar2.h(new q1.a(new p1.a(26), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
                break;
        }
    }
}
