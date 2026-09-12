package com.imagepicker;

import android.text.TextUtils;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f6859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f6860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f6865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6866i;
    public final Boolean j;
    public final Boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f6867l;

    public b(ReadableMap readableMap) {
        this.f6861d = 1;
        Boolean bool = Boolean.FALSE;
        this.j = bool;
        this.k = bool;
        this.f6867l = readableMap.getString("mediaType");
        this.f6858a = readableMap.getInt("selectionLimit");
        this.f6859b = Boolean.valueOf(readableMap.getBoolean("includeBase64"));
        this.f6860c = Boolean.valueOf(readableMap.getBoolean("includeExtra"));
        String string = readableMap.getString("videoQuality");
        if (!TextUtils.isEmpty(string) && !string.toLowerCase().equals("high")) {
            this.f6861d = 0;
        }
        if (readableMap.getString("cameraType").equals("front")) {
            this.j = Boolean.TRUE;
        }
        if (readableMap.hasKey("forceGetContent") && readableMap.getBoolean("forceGetContent")) {
            this.k = Boolean.TRUE;
        }
        this.f6862e = (int) (readableMap.getDouble("quality") * 100.0d);
        this.f6864g = readableMap.getInt(ViewProps.MAX_HEIGHT);
        this.f6863f = readableMap.getInt(ViewProps.MAX_WIDTH);
        this.f6865h = Boolean.valueOf(readableMap.getBoolean("saveToPhotos"));
        this.f6866i = readableMap.getInt("durationLimit");
    }
}
