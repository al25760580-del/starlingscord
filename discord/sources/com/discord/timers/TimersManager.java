package com.discord.timers;

import android.content.Context;
import android.os.Handler;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nJ$\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013J\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nJ\u0006\u0010\u0018\u001a\u00020\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/discord/timers/TimersManager;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "timeoutHandler", "Landroid/os/Handler;", "timeouts", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/lang/Runnable;", "intervals", "setTimeout", "", StackTraceHelper.ID_KEY, "timeout", "", "onTimeout", "Lkotlin/Function0;", "clearTimeout", "setInterval", "onInterval", "clearInterval", "clean", "react_timers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTimersManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimersManager.kt\ncom/discord/timers/TimersManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
public final class TimersManager {

    @NotNull
    private final ConcurrentHashMap<Integer, Runnable> intervals;

    @NotNull
    private final Handler timeoutHandler;

    @NotNull
    private final ConcurrentHashMap<Integer, Runnable> timeouts;

    public TimersManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.timeoutHandler = new Handler(context.getMainLooper());
        this.timeouts = new ConcurrentHashMap<>();
        this.intervals = new ConcurrentHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTimeout$lambda$0(TimersManager timersManager, int i7, Function0 function0) {
        timersManager.timeouts.remove(Integer.valueOf(i7));
        function0.invoke();
    }

    public final void clean() {
        this.timeoutHandler.removeCallbacksAndMessages(null);
        this.timeouts.clear();
        this.intervals.clear();
    }

    public final void clearInterval(int id2) {
        Runnable runnableRemove = this.intervals.remove(Integer.valueOf(id2));
        if (runnableRemove != null) {
            this.timeoutHandler.removeCallbacks(runnableRemove);
        }
    }

    public final void clearTimeout(int id2) {
        Runnable runnableRemove = this.timeouts.remove(Integer.valueOf(id2));
        if (runnableRemove != null) {
            this.timeoutHandler.removeCallbacks(runnableRemove);
        }
    }

    public final void setInterval(int id2, double timeout, @NotNull final Function0<Unit> onInterval) {
        Intrinsics.checkNotNullParameter(onInterval, "onInterval");
        final long j = (long) timeout;
        Runnable runnable = new Runnable() { // from class: com.discord.timers.TimersManager$setInterval$runnable$1
            @Override // java.lang.Runnable
            public void run() {
                onInterval.invoke();
                this.timeoutHandler.postDelayed(this, j);
            }
        };
        this.intervals.put(Integer.valueOf(id2), runnable);
        this.timeoutHandler.postDelayed(runnable, j);
    }

    public final void setTimeout(int id2, double timeout, @NotNull Function0<Unit> onTimeout) {
        Intrinsics.checkNotNullParameter(onTimeout, "onTimeout");
        ab.a aVar = new ab.a(this, id2, onTimeout, 2);
        this.timeouts.put(Integer.valueOf(id2), aVar);
        this.timeoutHandler.postDelayed(aVar, (long) timeout);
    }
}
