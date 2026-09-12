package com.google.android.material.datepicker;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements androidx.core.view.t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f6362e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6363i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f6364v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f6365w;

    public n(View view, int i7, int i10, int i11, int i12) {
        this.f6361d = i7;
        this.f6362e = view;
        this.f6363i = i10;
        this.f6364v = i11;
        this.f6365w = i12;
    }

    @Override // androidx.core.view.t
    public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insetsF = windowInsetsCompat.f1605a.f(519);
        View view2 = this.f6362e;
        int i7 = this.f6361d;
        if (i7 >= 0) {
            view2.getLayoutParams().height = i7 + insetsF.f1557b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.f6363i + insetsF.f1556a, this.f6364v + insetsF.f1557b, this.f6365w + insetsF.f1558c, view2.getPaddingBottom());
        return windowInsetsCompat;
    }
}
