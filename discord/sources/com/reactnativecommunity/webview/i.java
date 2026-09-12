package com.reactnativecommunity.webview;

import a5.t;
import android.webkit.JavascriptInterface;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f7045a;

    @JavascriptInterface
    public void postMessage(String str) {
        j jVar = this.f7045a;
        ReactContext reactContext = (ReactContext) jVar.getContext();
        if (jVar.f7049v != null && jVar.f7050w != null) {
            reactContext.runOnUiQueueThread(new cb.a(jVar, jVar, str, reactContext));
        } else {
            if (jVar.f7050w != null) {
                jVar.post(new t(jVar, jVar, str, 4, false));
                return;
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("data", str);
            j.a(jVar, new nl.a(writableMapCreateMap, c.b(jVar), 5));
        }
    }
}
