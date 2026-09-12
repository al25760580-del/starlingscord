package com.discord.bundle_updater;

import android.view.ViewGroup;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BundleUpdaterManager f4020e;

    public /* synthetic */ c(BundleUpdaterManager bundleUpdaterManager, int i7) {
        this.f4019d = i7;
        this.f4020e = bundleUpdaterManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4019d) {
            case 0:
                return BundleUpdaterManager.removeSpinnerView$lambda$7(this.f4020e, (ViewGroup) obj);
            case 1:
                return BundleUpdaterManager.addListener$lambda$1(this.f4020e, ((Boolean) obj).booleanValue());
            case 2:
                return BundleUpdaterManager.addListener$lambda$2(this.f4020e, (List) obj);
            default:
                return BundleUpdaterManager.showSpinnerView$lambda$5(this.f4020e, (ViewGroup) obj);
        }
    }
}
