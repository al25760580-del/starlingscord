package com.reactnativecommunity.webview;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements DownloadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f7034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThemedReactContext f7035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RNCWebViewManager f7036c;

    public d(RNCWebViewManager rNCWebViewManager, j jVar, ThemedReactContext themedReactContext) {
        this.f7036c = rNCWebViewManager;
        this.f7034a = jVar;
        this.f7035b = themedReactContext;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        this.f7034a.setIgnoreErrFailedForThisURL(str);
        RNCWebViewModule module = RNCWebViewManager.getModule(this.f7035b);
        try {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            String strGuessFileName = URLUtil.guessFileName(str, str3, str4);
            String strL = a3.e.l("Downloading ", strGuessFileName);
            try {
                URL url = new URL(str);
                request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(url.getProtocol() + "://" + url.getHost()));
            } catch (MalformedURLException e10) {
                Log.w("RNCWebViewManager", "Error getting cookie for DownloadManager", e10);
            }
            request.addRequestHeader("User-Agent", str2);
            request.setTitle(strGuessFileName);
            request.setDescription(strL);
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
            module.setDownloadRequest(request);
            RNCWebViewManager rNCWebViewManager = this.f7036c;
            if (module.grantFileDownloaderPermissions(rNCWebViewManager.getDownloadingMessage(), rNCWebViewManager.getLackPermissionToDownloadMessage())) {
                module.downloadFile(rNCWebViewManager.getDownloadingMessage());
            }
        } catch (IllegalArgumentException e11) {
            Log.w("RNCWebViewManager", "Unsupported URI, aborting download", e11);
        }
    }
}
