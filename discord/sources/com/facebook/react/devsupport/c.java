package com.facebook.react.devsupport;

import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5165e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5166i;

    public /* synthetic */ c(int i7, Object obj, Object obj2) {
        this.f5164d = i7;
        this.f5166i = obj;
        this.f5165e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5164d) {
            case 0:
                CxxInspectorPackagerConnection$DelegateImpl$connectWebSocket$webSocket$1.onFailure$lambda$0((Throwable) this.f5166i, (CxxInspectorPackagerConnection.WebSocketDelegate) this.f5165e);
                break;
            case 1:
                ((CxxInspectorPackagerConnection.WebSocketDelegate) this.f5165e).didReceiveMessage((String) this.f5166i);
                break;
            case 2:
                DevSupportManagerBase.reportBundleLoadingFailure$lambda$33((Exception) this.f5166i, (DevSupportManagerBase) this.f5165e);
                break;
            default:
                DevSupportManagerBase.isPackagerRunning$lambda$32((DevSupportManagerBase) this.f5166i, (PackagerStatusCallback) this.f5165e);
                break;
        }
    }

    public /* synthetic */ c(CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate, String str) {
        this.f5164d = 1;
        this.f5165e = webSocketDelegate;
        this.f5166i = str;
    }
}
