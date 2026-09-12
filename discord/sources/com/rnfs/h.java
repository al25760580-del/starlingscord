package com.rnfs;

import android.media.MediaScannerConnection;
import android.net.Uri;
import com.facebook.react.bridge.Promise;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements MediaScannerConnection.MediaScannerConnectionClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Promise f7093a;

    public h(Promise promise) {
        this.f7093a = promise;
    }

    @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
    public final void onMediaScannerConnected() {
    }

    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public final void onScanCompleted(String str, Uri uri) {
        this.f7093a.resolve(str);
    }
}
