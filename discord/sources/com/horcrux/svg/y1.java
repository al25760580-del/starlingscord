package com.horcrux.svg;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes3.dex */
public final class y1 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ReadableMap f6826e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Callback f6827i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f6828v;

    public y1(int i7, ReadableMap readableMap, Callback callback, int i10) {
        this.f6825d = i7;
        this.f6826e = readableMap;
        this.f6827i = callback;
        this.f6828v = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f6825d;
        SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(i7);
        if (svgViewByTag == null) {
            SvgViewManager.runWhenViewIsAvailable(i7, new x1(0, this));
            return;
        }
        if (svgViewByTag.notRendered()) {
            svgViewByTag.setToDataUrlTask(new x1(1, this));
            return;
        }
        Callback callback = this.f6827i;
        ReadableMap readableMap = this.f6826e;
        if (readableMap != null) {
            callback.invoke(svgViewByTag.toDataURL(readableMap.getInt("width"), readableMap.getInt("height")));
        } else {
            callback.invoke(svgViewByTag.toDataURL());
        }
    }
}
