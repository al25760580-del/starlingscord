package com.reactnativecommunity.webview;

import android.content.ComponentCallbacks2;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends WebChromeClient implements LifecycleEventListener {
    public static final FrameLayout.LayoutParams K = new FrameLayout.LayoutParams(-1, -1, 17);
    public String E;
    public boolean F = false;
    public final ArrayList G = new ArrayList();
    public h H = null;
    public boolean I = false;
    public final app.rive.runtime.kotlin.core.a J = new app.rive.runtime.kotlin.core.a(21, this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReactContext f7037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WebView f7038e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f7039i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f7040v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PermissionRequest f7041w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f7042x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public GeolocationPermissions.Callback f7043y;

    public g(ReactContext reactContext, WebView webView) {
        this.f7037d = reactContext;
        this.f7038e = webView;
    }

    public final synchronized void a(List list) {
        if (this.F) {
            this.G.addAll(list);
            return;
        }
        ComponentCallbacks2 currentActivity = this.f7037d.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (!(currentActivity instanceof PermissionAwareActivity)) {
            throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        }
        this.F = true;
        ((PermissionAwareActivity) currentActivity).requestPermissions((String[]) list.toArray(new String[0]), 3, this.J);
        this.G.clear();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (ReactBuildConfig.DEBUG) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z5, boolean z6, Message message) {
        ((WebView.WebViewTransport) message.obj).setWebView(new WebView(webView.getContext()));
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (y0.b.a(this.f7037d, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            callback.invoke(str, true, false);
            return;
        }
        this.f7043y = callback;
        this.E = str;
        a(Collections.singletonList("android.permission.ACCESS_FINE_LOCATION"));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        View view = this.f7039i;
        if (view == null || view.getSystemUiVisibility() == 7942) {
            return;
        }
        this.f7039i.setSystemUiVisibility(7942);
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        this.f7042x = new ArrayList();
        ArrayList arrayList = new ArrayList();
        String[] resources = permissionRequest.getResources();
        int length = resources.length;
        int i7 = 0;
        while (true) {
            String str = null;
            if (i7 >= length) {
                break;
            }
            String str2 = resources[i7];
            if (str2.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                str = "android.permission.RECORD_AUDIO";
            } else if (str2.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                str = "android.permission.CAMERA";
            } else if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                if (this.I) {
                    this.f7042x.add(str2);
                } else {
                    str = "android.webkit.resource.PROTECTED_MEDIA_ID";
                }
            }
            if (str != null) {
                if (y0.b.a(this.f7037d, str) == 0) {
                    this.f7042x.add(str2);
                } else {
                    arrayList.add(str);
                }
            }
            i7++;
        }
        if (arrayList.isEmpty()) {
            permissionRequest.grant((String[]) this.f7042x.toArray(new String[0]));
            this.f7042x = null;
        } else {
            this.f7041w = permissionRequest;
            a(arrayList);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i7) {
        super.onProgressChanged(webView, i7);
        String url = webView.getUrl();
        if (this.H.f7044a) {
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("target", c.b(webView));
        writableMapCreateMap.putString(AlertFragment.ARG_TITLE, webView.getTitle());
        writableMapCreateMap.putString("url", url);
        writableMapCreateMap.putBoolean("canGoBack", webView.canGoBack());
        writableMapCreateMap.putBoolean("canGoForward", webView.canGoForward());
        writableMapCreateMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, i7 / 100.0f);
        j.a(webView, new nl.a(writableMapCreateMap, c.b(webView), 3));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return RNCWebViewManager.getModule(this.f7037d).startPhotoPickerIntent(valueCallback, fileChooserParams.getAcceptTypes(), fileChooserParams.getMode() == 1);
    }
}
