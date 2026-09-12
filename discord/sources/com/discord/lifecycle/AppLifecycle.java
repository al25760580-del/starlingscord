package com.discord.lifecycle;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\nR\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/discord/lifecycle/AppLifecycle;", "", "<init>", "()V", "value", "", "isForegrounded", "()Z", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/discord/lifecycle/AppLifecycle$Listener;", "appLifecycleObserver", "com/discord/lifecycle/AppLifecycle$appLifecycleObserver$1", "Lcom/discord/lifecycle/AppLifecycle$appLifecycleObserver$1;", "init", "", "addListener", "listener", "removeListener", "Listener", "lifecycle_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppLifecycle {
    private static boolean isForegrounded;

    @NotNull
    public static final AppLifecycle INSTANCE = new AppLifecycle();

    @NotNull
    private static final CopyOnWriteArraySet<Listener> listeners = new CopyOnWriteArraySet<>();

    @NotNull
    private static final AppLifecycle$appLifecycleObserver$1 appLifecycleObserver = new DefaultLifecycleObserver() { // from class: com.discord.lifecycle.AppLifecycle$appLifecycleObserver$1
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            super.onStart(owner);
            AppLifecycle.isForegrounded = true;
            Iterator it = AppLifecycle.listeners.iterator();
            while (it.hasNext()) {
                ((AppLifecycle.Listener) it.next()).onForegrounded();
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            super.onStop(owner);
            AppLifecycle.isForegrounded = false;
            Iterator it = AppLifecycle.listeners.iterator();
            while (it.hasNext()) {
                ((AppLifecycle.Listener) it.next()).onBackgrounded();
            }
        }
    };

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"Lcom/discord/lifecycle/AppLifecycle$Listener;", "", "onForegrounded", "", "onBackgrounded", "lifecycle_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Listener {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class DefaultImpls {
            public static void onBackgrounded(@NotNull Listener listener) {
            }

            public static void onForegrounded(@NotNull Listener listener) {
            }
        }

        void onBackgrounded();

        void onForegrounded();
    }

    private AppLifecycle() {
    }

    public final void addListener(@NotNull Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listeners.add(listener);
    }

    public final void init() {
        ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.F;
        ProcessLifecycleOwner.F.f2323x.a(appLifecycleObserver);
    }

    public final boolean isForegrounded() {
        return isForegrounded;
    }

    public final void removeListener(@NotNull Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listeners.remove(listener);
    }
}
