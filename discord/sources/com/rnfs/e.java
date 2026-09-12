package com.rnfs;

import com.facebook.react.bridge.Promise;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f7084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Promise f7085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f7086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RNFSManager f7087e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RNFSManager rNFSManager, File file, Promise promise, String str) {
        super(rNFSManager);
        this.f7087e = rNFSManager;
        this.f7084b = file;
        this.f7085c = promise;
        this.f7086d = str;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Exception exc = (Exception) obj;
        Promise promise = this.f7085c;
        if (exc == null) {
            this.f7084b.delete();
            promise.resolve(Boolean.TRUE);
        } else {
            exc.printStackTrace();
            this.f7087e.reject(promise, this.f7086d, exc);
        }
    }
}
