package app.rive.core;

import a3.e;
import app.rive.RiveLog;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lapp/rive/core/CloseOnce;", "Lapp/rive/core/CheckableAutoCloseable;", "label", "", "onClose", "Lkotlin/Function0;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "_closed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "closed", "", "getClosed", "()Z", "close", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCloseOnce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloseOnce.kt\napp/rive/core/CloseOnce\n+ 2 RiveLog.kt\napp/rive/RiveLog\n*L\n1#1,37:1\n65#2:38\n53#2:39\n*S KotlinDebug\n*F\n+ 1 CloseOnce.kt\napp/rive/core/CloseOnce\n*L\n26#1:38\n33#1:39\n*E\n"})
public final class CloseOnce implements CheckableAutoCloseable {
    public static final int $stable = 8;

    @NotNull
    private final AtomicBoolean _closed;

    @NotNull
    private final String label;

    @NotNull
    private final Function0<Unit> onClose;

    public CloseOnce(@NotNull String label, @NotNull Function0<Unit> onClose) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.label = label;
        this.onClose = onClose;
        this._closed = new AtomicBoolean(false);
    }

    @Override // app.rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        if (this._closed.getAndSet(true)) {
            RiveLog.INSTANCE.getLogger().w("CloseOnce", new Function0<String>() { // from class: app.rive.core.CloseOnce.close.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return g.e("Attempted to close already closed resource (", CloseOnce.this.label, "). While safe, this may represent a mistake in ownership. The resource should only be closed once.");
                }
            });
        } else {
            RiveLog.INSTANCE.getLogger().v("CloseOnce", new Function0<String>() { // from class: app.rive.core.CloseOnce.close.2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return e.l("Closing resource: ", CloseOnce.this.label);
                }
            });
            this.onClose.invoke();
        }
    }

    @Override // app.rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this._closed.get();
    }
}
