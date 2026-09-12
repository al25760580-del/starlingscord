package en;

import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSExceptionHandler;
import com.swmansion.worklets.AndroidUIScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends GuardedRunnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AndroidUIScheduler f8480d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AndroidUIScheduler androidUIScheduler, JSExceptionHandler jSExceptionHandler) {
        super(jSExceptionHandler);
        this.f8480d = androidUIScheduler;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    public final void runGuarded() {
        this.f8480d.f7269c.run();
    }
}
