package com.facebook.react.modules.statusbar;

import android.app.Activity;
import android.view.View;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f5264e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f5265i;

    public /* synthetic */ a(Activity activity, String str, int i7) {
        this.f5263d = i7;
        this.f5264e = activity;
        this.f5265i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5263d) {
            case 0:
                StatusBarModule.setStyle$lambda$5(this.f5264e, this.f5265i);
                break;
            default:
                Activity activity = this.f5264e;
                View decorView = activity.getWindow().getDecorView();
                Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
                new WindowInsetsControllerCompat(activity.getWindow(), decorView).c(Intrinsics.areEqual(this.f5265i, "dark"));
                break;
        }
    }
}
