package com.reactnativecommunity.webview;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f7033e;

    public static int b(WebView webView) {
        if (!((ReactContext) webView.getContext()).isBridgeless()) {
            Integer num = (Integer) l.f7060b.get(Integer.valueOf(webView.getId()));
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }
        View view = (View) webView.getParent();
        if (view != null) {
            return view.getId();
        }
        o8.a.j("RNCWebViewContainer", new Throwable(), "WebView parent is null (bridgeless mode)", new Object[0]);
        return -1;
    }

    public final void a(j jVar) {
        this.f7033e = jVar;
        if (jVar.getParent() != null) {
            throw new IllegalArgumentException(com.discord.chat.presentation.list.a.k(new StringBuilder("WebView with key: "), jVar.f7049v, " parent is non null. Cannot re-attach webview."));
        }
        addView(jVar, new FrameLayout.LayoutParams(-1, -1));
    }

    public j getWebView() {
        return this.f7033e;
    }
}
