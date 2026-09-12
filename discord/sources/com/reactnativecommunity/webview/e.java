package com.reactnativecommunity.webview;

import android.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends g {
    public final /* synthetic */ Activity L;
    public final /* synthetic */ int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ReactContext reactContext, WebView webView, Activity activity, int i7) {
        super(reactContext, webView);
        this.L = activity;
        this.M = i7;
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        if (this.f7039i == null) {
            return;
        }
        ReactContext reactContext = this.f7037d;
        ViewGroup viewGroup = (ViewGroup) reactContext.getCurrentActivity().findViewById(R.id.content);
        View rootView = viewGroup.getRootView();
        WebView webView = this.f7038e;
        if (rootView != webView.getRootView()) {
            webView.getRootView().setVisibility(0);
        } else {
            webView.setVisibility(0);
        }
        Activity activity = this.L;
        activity.getWindow().clearFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
        viewGroup.removeView(this.f7039i);
        this.f7040v.onCustomViewHidden();
        this.f7039i = null;
        this.f7040v = null;
        activity.setRequestedOrientation(this.M);
        reactContext.removeLifecycleEventListener(this);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (this.f7039i != null) {
            customViewCallback.onCustomViewHidden();
            return;
        }
        this.f7039i = view;
        this.f7040v = customViewCallback;
        Activity activity = this.L;
        activity.setRequestedOrientation(-1);
        this.f7039i.setSystemUiVisibility(7942);
        activity.getWindow().setFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
        this.f7039i.setBackgroundColor(-16777216);
        ReactContext reactContext = this.f7037d;
        ViewGroup viewGroup = (ViewGroup) reactContext.getCurrentActivity().findViewById(R.id.content);
        viewGroup.addView(this.f7039i, g.K);
        View rootView = viewGroup.getRootView();
        WebView webView = this.f7038e;
        if (rootView != webView.getRootView()) {
            webView.getRootView().setVisibility(8);
        } else {
            webView.setVisibility(8);
        }
        reactContext.addLifecycleEventListener(this);
    }
}
