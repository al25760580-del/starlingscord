package cb;

import a1.d;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.g0;
import androidx.core.view.u0;
import androidx.work.impl.WorkDatabase;
import com.appsflyer.internal.AFc1bSDK;
import com.appsflyer.internal.AFj1rSDK;
import com.discord.R;
import com.discord.browser_manager.BrowserManagerModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.DevSupportManagerBase;
import com.facebook.react.modules.camera.ImageStoreManager;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.material.datepicker.h;
import com.reactnativecommunity.webview.j;
import com.swmansion.reanimated.layoutReanimation.ReanimatedNativeHierarchyManager;
import com.yalantis.ucrop.UCropActivity;
import il.e;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.k0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import md.s;
import v3.b;
import w3.g;
import w3.i;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3560e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3561i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3562v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3563w;

    public /* synthetic */ a(int i7, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f3559d = i7;
        this.f3560e = obj;
        this.f3561i = obj2;
        this.f3562v = obj3;
        this.f3563w = obj4;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, md.w] */
    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f3559d;
        Object obj = this.f3563w;
        Object obj2 = this.f3562v;
        ?? r5 = this.f3561i;
        Object obj3 = this.f3560e;
        switch (i7) {
            case 0:
                ImageStoreManager.getBase64ForTag$lambda$0((ImageStoreManager) obj3, (String) r5, (Callback) obj2, (Callback) obj);
                return;
            case 1:
                ((AFj1rSDK) obj3).getRevenue((Context) r5, (Runnable) obj2, (AFc1bSDK) obj);
                return;
            case 2:
                BrowserManagerModule.openTrackedCustomTab$lambda$4((Activity) obj3, (String) r5, (Promise) obj2, (BrowserManagerModule) obj);
                return;
            case 3:
                DevSupportManagerBase.fetchSplitBundleAndCreateBundleLoader$lambda$31((DevSupportManagerBase) obj3, (String) r5, (File) obj2, (DevSupportManagerBase.CallbackWithBundleLoader) obj);
                return;
            case 4:
                j jVar = (j) obj3;
                WebView webView = (WebView) obj2;
                WritableMap writableMapA = jVar.f7050w.a(webView, webView.getUrl());
                writableMapA.putString("webViewKey", jVar.f7049v);
                writableMapA.putString("data", (String) r5);
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) ((ReactContext) obj).getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeWebViewOnMessageWithWebViewKey", writableMapA);
                return;
            case 5:
                ReanimatedNativeHierarchyManager.lambda$manageChildren$0((ArrayList) obj3, (View) r5, (ViewGroupManager) obj2, (ViewGroup) obj);
                return;
            case 6:
                UCropActivity uCropActivity = (UCropActivity) obj3;
                String str = (String) r5;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                try {
                    Toolbar toolbar = (Toolbar) uCropActivity.findViewById(R.id.toolbar);
                    if (toolbar != null && str != null) {
                        toolbar.setNavigationContentDescription(str);
                    }
                    TextView textView = (TextView) uCropActivity.findViewById(R.id.toolbar_title);
                    if (textView != null) {
                        WeakHashMap weakHashMap = u0.f1729a;
                        textView.setImportantForAccessibility(1);
                        new g0(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).f(textView, Boolean.TRUE);
                    }
                    e.r(uCropActivity, R.id.state_aspect_ratio, R.id.text_view_crop);
                    e.r(uCropActivity, R.id.state_rotate, R.id.text_view_rotate);
                    e.r(uCropActivity, R.id.state_scale, R.id.text_view_scale);
                    View viewFindViewById = uCropActivity.findViewById(R.id.wrapper_rotate_by_angle);
                    int i10 = 3;
                    if (viewFindViewById != null) {
                        if (str2 != null) {
                            viewFindViewById.setContentDescription(str2);
                        }
                        u0.p(viewFindViewById, new h(i10));
                    }
                    View viewFindViewById2 = uCropActivity.findViewById(R.id.wrapper_reset_rotate);
                    if (viewFindViewById2 != null) {
                        if (str3 != null) {
                            viewFindViewById2.setContentDescription(str3);
                        }
                        u0.p(viewFindViewById2, new h(i10));
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    Log.e("ImageCropPicker", "Error applying accessibility attributes", e10);
                    return;
                }
            case 7:
                Window window = (Window) obj3;
                Window.Callback callback = (Window.Callback) r5;
                Runnable runnable = (Runnable) obj2;
                k0 k0Var = (k0) obj;
                View viewPeekDecorView = window.peekDecorView();
                if (viewPeekDecorView != null) {
                    window.setCallback(callback);
                    io.sentry.android.core.internal.util.h.b(viewPeekDecorView, runnable, k0Var);
                    return;
                }
                return;
            case 8:
                ILogger iLogger = (ILogger) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                try {
                    ((View) obj3).draw((Canvas) r5);
                    break;
                } catch (Throwable th2) {
                    try {
                        iLogger.g(SentryLevel.ERROR, "Taking screenshot failed (view.draw).", th2);
                    } finally {
                        countDownLatch.countDown();
                    }
                    break;
                }
                return;
            case 9:
                r5.x(((d) obj3).f17e, (s) obj2, (MediaLoadData) obj);
                return;
            default:
                List list = (List) obj3;
                e4.j jVar2 = (e4.j) r5;
                b bVar = (b) obj2;
                WorkDatabase workDatabase = (WorkDatabase) obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((g) it.next()).c(jVar2.f7984a);
                }
                i.b(bVar, workDatabase, list);
                return;
        }
    }

    public /* synthetic */ a(j jVar, WebView webView, String str, ReactContext reactContext) {
        this.f3559d = 4;
        this.f3560e = jVar;
        this.f3562v = webView;
        this.f3561i = str;
        this.f3563w = reactContext;
    }

    public /* synthetic */ a(il.b bVar, UCropActivity uCropActivity, String str, String str2, String str3) {
        this.f3559d = 6;
        this.f3560e = uCropActivity;
        this.f3561i = str;
        this.f3562v = str2;
        this.f3563w = str3;
    }
}
