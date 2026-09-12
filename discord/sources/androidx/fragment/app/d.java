package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2112e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2113i;

    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        this.f2111d = i7;
        this.f2112e = obj;
        this.f2113i = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2111d) {
            case 0:
                s this$0 = (s) this.f2112e;
                x1 operation = (x1) this.f2113i;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(operation, "$operation");
                this$0.a(operation);
                break;
            default:
                p this$1 = (p) this.f2112e;
                ViewGroup container = (ViewGroup) this.f2113i;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(container, "$container");
                Iterator it = this$1.f2214c.iterator();
                while (it.hasNext()) {
                    x1 x1Var = ((q) it.next()).f2178a;
                    View view = x1Var.f2274c.getView();
                    if (view != null) {
                        x1Var.f2272a.a(view, container);
                    }
                }
                break;
        }
    }
}
