package com.reactnativecommunity.webview;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.dialog.AlertFragment;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ReadableArray f7054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f7055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f7056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f7057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile q3.d f7058f;

    public final WritableMap a(WebView webView, String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("target", c.b(webView));
        writableMapCreateMap.putString("url", str);
        writableMapCreateMap.putBoolean("loading", (this.f7053a || webView.getProgress() == 100) ? false : true);
        writableMapCreateMap.putString(AlertFragment.ARG_TITLE, webView.getTitle());
        writableMapCreateMap.putBoolean("canGoBack", webView.canGoBack());
        writableMapCreateMap.putBoolean("canGoForward", webView.canGoForward());
        return writableMapCreateMap;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        String str2;
        super.onPageFinished(webView, str);
        if (this.f7053a) {
            return;
        }
        j jVar = (j) webView;
        if (jVar.getSettings().getJavaScriptEnabled() && (str2 = jVar.f7046d) != null && !TextUtils.isEmpty(str2)) {
            jVar.evaluateJavascript("(function() {\n" + jVar.f7046d + ";\n})();", null);
        }
        nl.a aVar = new nl.a(a(webView, str), c.b(webView), 2);
        jVar.getClass();
        j.a(webView, aVar);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String str2;
        super.onPageStarted(webView, str, bitmap);
        this.f7053a = false;
        j jVar = (j) webView;
        if (jVar.getSettings().getJavaScriptEnabled() && (str2 = jVar.f7047e) != null && !TextUtils.isEmpty(str2)) {
            jVar.evaluateJavascript("(function() {\n" + jVar.f7047e + ";\n})();", null);
        }
        j.a(webView, new nl.a(a(webView, str), c.b(webView), 4));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i7, String str, String str2) {
        String str3 = this.f7056d;
        if (str3 != null && str2.equals(str3) && i7 == -1 && str.equals("net::ERR_FAILED")) {
            this.f7056d = null;
            return;
        }
        super.onReceivedError(webView, i7, str, str2);
        this.f7053a = true;
        nl.a aVar = new nl.a(a(webView, str2), c.b(webView), 2);
        ((j) webView).getClass();
        j.a(webView, aVar);
        WritableMap writableMapA = a(webView, str2);
        writableMapA.putDouble("code", i7);
        writableMapA.putString("description", str);
        j.a(webView, new nl.a(writableMapA, c.b(webView), 1));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        a aVar = this.f7057e;
        if (aVar != null) {
            httpAuthHandler.proceed(aVar.f7028a, aVar.f7029b);
        } else {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.isForMainFrame()) {
            WritableMap writableMapA = a(webView, webResourceRequest.getUrl().toString());
            writableMapA.putInt("statusCode", webResourceResponse.getStatusCode());
            writableMapA.putString("description", webResourceResponse.getReasonPhrase());
            j.a(webView, new nl.a(writableMapA, c.b(webView), 0));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        String url = webView.getUrl();
        String url2 = sslError.getUrl();
        sslErrorHandler.cancel();
        if (!url.equalsIgnoreCase(url2)) {
            Log.w("RNCWebViewManager", "Resource blocked from loading due to SSL error. Blocked URL: " + url2);
            return;
        }
        int primaryError = sslError.getPrimaryError();
        if (primaryError == 0) {
            str = "The certificate is not yet valid";
        } else if (primaryError == 1) {
            str = "The certificate has expired";
        } else if (primaryError == 2) {
            str = "Hostname mismatch";
        } else if (primaryError == 3) {
            str = "The certificate authority is not trusted";
        } else if (primaryError != 4) {
            str = primaryError != 5 ? "Unknown SSL Error" : "A generic error occurred";
        } else {
            str = "The date of the certificate is invalid";
        }
        onReceivedError(webView, primaryError, "SSL error: ".concat(str), url2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        super.onRenderProcessGone(webView, renderProcessGoneDetail);
        if (renderProcessGoneDetail.didCrash()) {
            Log.e("RNCWebViewManager", "The WebView rendering process crashed.");
        } else {
            Log.w("RNCWebViewManager", "The WebView rendering process was killed by the system.");
        }
        if (webView == null) {
            return true;
        }
        WritableMap writableMapA = a(webView, webView.getUrl());
        writableMapA.putBoolean("didCrash", renderProcessGoneDetail.didCrash());
        j.a(webView, new nl.a(writableMapA, c.b(webView), 6));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        q3.b bVar;
        String str;
        WebResourceResponse webResourceResponse;
        if (this.f7058f == null) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        q3.d dVar = this.f7058f;
        Uri url = webResourceRequest.getUrl();
        Iterator it = dVar.f18597a.iterator();
        do {
            bVar = null;
            if (!it.hasNext()) {
                return null;
            }
            q3.c cVar = (q3.c) it.next();
            cVar.getClass();
            str = cVar.f18595c;
            if ((!url.getScheme().equals("http") || cVar.f18593a) && ((url.getScheme().equals("http") || url.getScheme().equals("https")) && url.getAuthority().equals(cVar.f18594b) && url.getPath().startsWith(str))) {
                bVar = cVar.f18596d;
            }
        } while (bVar == null);
        String strReplaceFirst = url.getPath().replaceFirst(str, "");
        switch (bVar.f18591a) {
            case 0:
                try {
                    hf.b bVar2 = (hf.b) bVar.f18592b;
                    bVar2.getClass();
                    String strSubstring = (strReplaceFirst.length() <= 1 || strReplaceFirst.charAt(0) != '/') ? strReplaceFirst : strReplaceFirst.substring(1);
                    InputStream inputStreamOpen = bVar2.f10726a.getAssets().open(strSubstring, 2);
                    if (strSubstring.endsWith(".svgz")) {
                        inputStreamOpen = new GZIPInputStream(inputStreamOpen);
                    }
                    String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(strReplaceFirst);
                    if (strGuessContentTypeFromName == null) {
                        strGuessContentTypeFromName = "text/plain";
                    }
                    return new WebResourceResponse(strGuessContentTypeFromName, null, inputStreamOpen);
                } catch (IOException e10) {
                    Log.e("WebViewAssetLoader", "Error opening asset path: " + strReplaceFirst, e10);
                    webResourceResponse = new WebResourceResponse(null, null, null);
                }
                break;
            case 1:
                try {
                    InputStream inputStreamC = ((hf.b) bVar.f18592b).c(strReplaceFirst);
                    String strGuessContentTypeFromName2 = URLConnection.guessContentTypeFromName(strReplaceFirst);
                    if (strGuessContentTypeFromName2 == null) {
                        strGuessContentTypeFromName2 = "text/plain";
                    }
                    return new WebResourceResponse(strGuessContentTypeFromName2, null, inputStreamC);
                } catch (Resources.NotFoundException e11) {
                    Log.e("WebViewAssetLoader", "Resource not found from the path: " + strReplaceFirst, e11);
                    webResourceResponse = new WebResourceResponse(null, null, null);
                    return webResourceResponse;
                } catch (IOException e12) {
                    Log.e("WebViewAssetLoader", "Error opening resource from the path: " + strReplaceFirst, e12);
                    webResourceResponse = new WebResourceResponse(null, null, null);
                    return webResourceResponse;
                }
            default:
                File file = (File) bVar.f18592b;
                try {
                    String strB = hf.b.b(file);
                    String canonicalPath = new File(file, strReplaceFirst).getCanonicalPath();
                    File file2 = canonicalPath.startsWith(strB) ? new File(canonicalPath) : null;
                    if (file2 == null) {
                        Log.e("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", strReplaceFirst, file));
                        return new WebResourceResponse(null, null, null);
                    }
                    InputStream fileInputStream = new FileInputStream(file2);
                    if (file2.getPath().endsWith(".svgz")) {
                        fileInputStream = new GZIPInputStream(fileInputStream);
                    }
                    String strGuessContentTypeFromName3 = URLConnection.guessContentTypeFromName(strReplaceFirst);
                    if (strGuessContentTypeFromName3 == null) {
                        strGuessContentTypeFromName3 = "text/plain";
                    }
                    return new WebResourceResponse(strGuessContentTypeFromName3, null, fileInputStream);
                } catch (IOException e13) {
                    Log.e("WebViewAssetLoader", "Error opening the requested path: " + strReplaceFirst, e13);
                }
                break;
        }
        return webResourceResponse;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        o8.a.v("RNCWebViewManager", "Couldn't use blocking synchronous call for onShouldStartLoadWithRequest due to debugging or missing Catalyst instance, falling back to old event-and-load.");
        this.f7055c.f7044a = true;
        nl.a aVar = new nl.a(a(webView, str), c.b(webView), 7);
        ((j) webView).getClass();
        j.a(webView, aVar);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        return true;
    }
}
