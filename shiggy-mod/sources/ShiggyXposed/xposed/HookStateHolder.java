package ShiggyXposed.xposed;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;

/* JADX INFO: compiled from: Main.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LShiggyXposed/xposed/HookStateHolder;", "", "<init>", "()V", "readyDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "", "getReadyDeferred", "()Lkotlinx/coroutines/CompletableDeferred;", "gotContext", "", "getGotContext", "()Z", "setGotContext", "(Z)V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class HookStateHolder {
    private static volatile boolean gotContext;
    public static final HookStateHolder INSTANCE = new HookStateHolder();
    private static final CompletableDeferred<Unit> readyDeferred = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);

    private HookStateHolder() {
    }

    public final CompletableDeferred<Unit> getReadyDeferred() {
        return readyDeferred;
    }

    public final boolean getGotContext() {
        return gotContext;
    }

    public final void setGotContext(boolean z) {
        gotContext = z;
    }
}
