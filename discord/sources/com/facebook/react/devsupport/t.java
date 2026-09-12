package com.facebook.react.devsupport;

import android.graphics.Bitmap;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.yalantis.ucrop.UCropActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t implements androidx.core.view.t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5216d;

    public /* synthetic */ t(int i7) {
        this.f5216d = i7;
    }

    @Override // androidx.core.view.t
    public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
        switch (this.f5216d) {
            case 0:
                return RedBoxDialogSurfaceDelegate.AnonymousClass2.onCreate$lambda$0(647, view, windowInsetsCompat);
            default:
                Bitmap.CompressFormat compressFormat = UCropActivity.f7277b0;
                Insets insetsF = windowInsetsCompat.f1605a.f(519);
                view.setPaddingRelative(insetsF.f1556a, insetsF.f1557b, insetsF.f1558c, 0);
                return windowInsetsCompat;
        }
    }
}
