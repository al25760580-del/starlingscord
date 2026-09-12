package androidx.fragment.app;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x1 f2194e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f2195i;

    public /* synthetic */ m(x1 x1Var, p pVar, int i7) {
        this.f2193d = i7;
        this.f2194e = x1Var;
        this.f2195i = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2193d) {
            case 0:
                x1 operation = this.f2194e;
                Intrinsics.checkNotNullParameter(operation, "$operation");
                p this$0 = this.f2195i;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (FragmentManager.M(2)) {
                    Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
                }
                operation.c(this$0);
                break;
            default:
                x1 operation2 = this.f2194e;
                Intrinsics.checkNotNullParameter(operation2, "$operation");
                p this$1 = this.f2195i;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (FragmentManager.M(2)) {
                    Log.v("FragmentManager", "Transition for operation " + operation2 + " has completed");
                }
                operation2.c(this$1);
                break;
        }
    }
}
