package com.facebook.react.devsupport;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5173e;

    public /* synthetic */ f(int i7, Object obj) {
        this.f5172d = i7;
        this.f5173e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5172d) {
            case 0:
                ((DefaultDevLoadingViewImplementation) this.f5173e).hideInternal();
                break;
            case 1:
                ((DoubleTapReloadRecognizer) this.f5173e).doRefresh = false;
                break;
            case 2:
                PausedInDebuggerOverlayDialogManager.hidePausedInDebuggerOverlay$lambda$4((PausedInDebuggerOverlayDialogManager) this.f5173e);
                break;
            default:
                ((RedBoxDialogSurfaceDelegate) this.f5173e).show();
                break;
        }
    }
}
