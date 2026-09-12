package com.rnfs;

import com.facebook.react.bridge.Promise;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Promise f7088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RNFSManager f7090d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(RNFSManager rNFSManager, Promise promise, String str) {
        super(rNFSManager);
        this.f7090d = rNFSManager;
        this.f7088b = promise;
        this.f7089c = str;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Exception exc = (Exception) obj;
        Promise promise = this.f7088b;
        if (exc == null) {
            promise.resolve(null);
        } else {
            exc.printStackTrace();
            this.f7090d.reject(promise, this.f7089c, exc);
        }
    }
}
