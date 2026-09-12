package zl;

import androidx.core.view.WindowInsetsControllerCompat;
import bh.r;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24033d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f24034e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f24035i;

    public /* synthetic */ a(c cVar, boolean z5) {
        this.f24034e = cVar;
        this.f24035i = z5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24033d) {
            case 0:
                boolean z5 = this.f24035i;
                c cVar = this.f24034e;
                if (!z5) {
                    WindowInsetsControllerCompat windowInsetsControllerCompatA = cVar.a();
                    if (windowInsetsControllerCompatA != null) {
                        windowInsetsControllerCompatA.e(1);
                    }
                } else {
                    WindowInsetsControllerCompat windowInsetsControllerCompatA2 = cVar.a();
                    if (windowInsetsControllerCompatA2 != null) {
                        windowInsetsControllerCompatA2.a(1);
                    }
                }
                break;
            default:
                this.f24034e.getClass();
                WeakReference weakReference = e4.f.f7973a;
                am.e eVar = weakReference != null ? (am.e) weakReference.get() : null;
                if (eVar != null && eVar.f648w) {
                    boolean z6 = eVar.f645e;
                    boolean z7 = this.f24035i;
                    if (z6 != z7) {
                        eVar.f645e = z7;
                        eVar.f();
                        Intrinsics.checkNotNullParameter(eVar, "<this>");
                        if (!eVar.isAttachedToWindow()) {
                            eVar.addOnAttachStateChangeListener(new r(1));
                        } else {
                            eVar.requestApplyInsets();
                        }
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ a(boolean z5, c cVar) {
        this.f24035i = z5;
        this.f24034e = cVar;
    }
}
