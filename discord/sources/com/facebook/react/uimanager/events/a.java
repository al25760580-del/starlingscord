package com.facebook.react.uimanager.events;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5340e;

    public /* synthetic */ a(int i7, Object obj) {
        this.f5339d = i7;
        this.f5340e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5339d) {
            case 0:
                ((FabricEventDispatcher.ScheduleDispatchFrameCallback) this.f5340e).maybeDispatchBatchedEvents();
                break;
            default:
                ((FabricEventDispatcher) this.f5340e).cancelDispatchOfBatchedEvents();
                break;
        }
    }
}
