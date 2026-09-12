package com.reactnativecommunity.webview;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends g {
    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
    }
}
