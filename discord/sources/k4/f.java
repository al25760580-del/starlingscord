package k4;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f14286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l4.h f14287e;

    public f(l4.h hVar, boolean z5) {
        this.f14286d = z5;
        this.f14287e = hVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v6) {
        Intrinsics.checkNotNullParameter(v6, "v");
        l4.h hVar = (l4.h) v6;
        boolean z5 = this.f14286d;
        l4.h hVar2 = this.f14287e;
        if (z5) {
            hVar2.playAnimation();
        } else {
            hVar2.H.add(l4.f.f14845x);
            hVar2.f14857w.n();
        }
        hVar.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v6) {
        Intrinsics.checkNotNullParameter(v6, "v");
        ((l4.h) v6).removeOnAttachStateChangeListener(this);
    }
}
