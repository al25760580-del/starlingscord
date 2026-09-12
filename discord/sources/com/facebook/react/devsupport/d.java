package com.facebook.react.devsupport;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CxxInspectorPackagerConnection.WebSocketDelegate f5168e;

    public /* synthetic */ d(CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate, int i7) {
        this.f5167d = i7;
        this.f5168e = webSocketDelegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5167d) {
            case 0:
                CxxInspectorPackagerConnection$DelegateImpl$connectWebSocket$webSocket$1.onClosed$lambda$3(this.f5168e);
                break;
            default:
                this.f5168e.didOpen();
                break;
        }
    }
}
