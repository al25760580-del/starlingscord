package gn;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends ReactViewGroup implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function3 f10138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f10139e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f10140i;

    public final void c() {
        a aVarC;
        Function3 function3 = this.f10138d;
        if (function3 == null || (aVarC = z0.d.c(this)) == null) {
            return;
        }
        View rootView = getRootView();
        Intrinsics.checkNotNull(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        c cVarB = z0.d.b(this, (ViewGroup) rootView);
        if (cVarB == null) {
            return;
        }
        if (Intrinsics.areEqual(this.f10139e, aVarC) && Intrinsics.areEqual(this.f10140i, cVarB)) {
            return;
        }
        function3.invoke(this, aVarC, cVarB);
        this.f10139e = aVarC;
        this.f10140i = cVarB;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this);
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        c();
        return true;
    }

    public final void setOnInsetsChangeHandler(Function3 function3) {
        this.f10138d = function3;
        c();
    }
}
