package com.swmansion.rnscreens;

import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.f1;
import androidx.core.view.g1;
import androidx.core.view.p1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends g1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ScreenFooter f7233d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ScreenFooter screenFooter) {
        super(0);
        this.f7233d = screenFooter;
    }

    @Override // androidx.core.view.g1
    public final void onEnd(p1 animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f7233d.f7151i = false;
    }

    @Override // androidx.core.view.g1
    public final WindowInsetsCompat onProgress(WindowInsetsCompat insets, List runningAnimations) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(runningAnimations, "runningAnimations");
        int i7 = insets.f1605a.f(8).f1559d - insets.f1605a.f(2).f1559d;
        ScreenFooter screenFooter = this.f7233d;
        screenFooter.f7153w = i7;
        screenFooter.e(screenFooter.f7150e, screenFooter.getReactHeight(), ScreenFooter.d(screenFooter, screenFooter.f7152v), screenFooter.f7153w);
        return insets;
    }

    @Override // androidx.core.view.g1
    public final f1 onStart(p1 animation, f1 bounds) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.f7233d.f7151i = true;
        Intrinsics.checkNotNullExpressionValue(bounds, "onStart(...)");
        return bounds;
    }
}
