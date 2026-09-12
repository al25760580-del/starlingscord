package v1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f21349e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o1.d f21350i;

    public /* synthetic */ c(h hVar, o1.d dVar, int i7) {
        this.f21348d = i7;
        this.f21349e = hVar;
        this.f21350i = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21348d) {
            case 0:
                n1.h hVar = this.f21349e.f21363f;
                if (hVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    hVar = null;
                }
                hVar.h(this.f21350i);
                break;
            case 1:
                n1.h hVar2 = this.f21349e.f21363f;
                if (hVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    hVar2 = null;
                }
                hVar2.h(this.f21350i);
                break;
            default:
                n1.h hVar3 = this.f21349e.f21363f;
                if (hVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    hVar3 = null;
                }
                hVar3.h(this.f21350i);
                break;
        }
    }
}
