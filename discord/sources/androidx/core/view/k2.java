package androidx.core.view;

import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import io.sentry.h4;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k2 implements WindowInsetsAnimationControlListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fj.c f1691a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tl.a f1692b;

    public k2(tl.a aVar) {
        this.f1692b = aVar;
    }

    public final void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f1692b.f20829a.x();
    }

    public final void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
        fj.c controller = this.f1691a;
        tl.a aVar = this.f1692b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        aVar.f20829a.x();
    }

    public final void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i7) {
        fj.c controller = new fj.c(windowInsetsAnimationController);
        this.f1691a = controller;
        tl.a aVar = this.f1692b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        h4 h4Var = aVar.f20829a;
        h4Var.f12712c = null;
        h4Var.f12711b = controller;
        Function1 function1 = (Function1) h4Var.f12713d;
        if (function1 != null) {
            function1.invoke(controller);
        }
        h4Var.f12713d = null;
    }
}
