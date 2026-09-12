package com.swmansion.rnscreens;

import android.os.Build;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.g1;
import androidx.core.view.p1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends g1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm.i f7177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0 f7178e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(mm.i iVar, e0 e0Var) {
        super(0);
        this.f7177d = iVar;
        this.f7178e = e0Var;
    }

    @Override // androidx.core.view.g1
    public final void onEnd(p1 animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f7178e.a().onSheetYTranslationChanged$react_native_screens_release();
    }

    @Override // androidx.core.view.g1
    public final WindowInsetsCompat onProgress(WindowInsetsCompat insets, List runningAnimations) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(runningAnimations, "runningAnimations");
        if (Build.VERSION.SDK_INT >= 30) {
            Intrinsics.checkNotNullParameter(insets, "insets");
            int i7 = insets.f1605a.f(8).f1559d;
            mm.i iVar = this.f7177d;
            iVar.f15911x = i7;
            if (!iVar.f15909v) {
                iVar.h(0.0f);
            }
        }
        return insets;
    }
}
