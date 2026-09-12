package sm;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20283a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20284b;

    public c(f onCommitCallback) {
        Intrinsics.checkNotNullParameter(onCommitCallback, "onCommitCallback");
        this.f20284b = onCommitCallback;
    }

    @Override // sm.b
    public final void a(FragmentManager fragmentManager, q8.c executor) {
        switch (this.f20283a) {
            case 0:
                Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
                Intrinsics.checkNotNullParameter(executor, "executor");
                executor.getClass();
                Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
                Intrinsics.checkNotNullParameter(this, "op");
                Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
                aVar.f2078p = true;
                Intrinsics.checkNotNullExpressionValue(aVar, "setReorderingAllowed(...)");
                aVar.g(false, (f) this.f20284b);
                Intrinsics.checkNotNullExpressionValue(aVar, "runOnCommit(...)");
                aVar.l(true, true);
                break;
            default:
                Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
                Intrinsics.checkNotNullParameter(executor, "executor");
                executor.getClass();
                Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
                Intrinsics.checkNotNullParameter(this, "op");
                fragmentManager.x(new a1(fragmentManager, ((tm.i) this.f20284b).f20847d.getScreenKey(), -1), false);
                break;
        }
    }

    public c(tm.i fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f20284b = fragment;
    }
}
