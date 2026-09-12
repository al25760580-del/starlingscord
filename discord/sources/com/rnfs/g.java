package com.rnfs;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RNFSManager f7092b;

    public /* synthetic */ g(RNFSManager rNFSManager, int i7) {
        this.f7092b = rNFSManager;
        this.f7091a = i7;
    }

    public void a(int i7, long j, HashMap map) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (Map.Entry entry : map.entrySet()) {
            writableMapCreateMap.putString((String) entry.getKey(), (String) entry.getValue());
        }
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("jobId", this.f7091a);
        writableMapCreateMap2.putInt("statusCode", i7);
        writableMapCreateMap2.putDouble("contentLength", j);
        writableMapCreateMap2.putMap("headers", writableMapCreateMap);
        RNFSManager rNFSManager = this.f7092b;
        rNFSManager.sendEvent(rNFSManager.getReactApplicationContext(), "DownloadBegin", writableMapCreateMap2);
    }
}
