package com.facebook.react.views.view;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return WindowUtilKt.setStatusBarTranslucency$lambda$0(view, windowInsets);
    }
}
