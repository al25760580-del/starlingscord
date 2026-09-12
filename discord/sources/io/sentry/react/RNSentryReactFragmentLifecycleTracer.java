package io.sentry.react;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.w0;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.EventDispatcherListener;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.internal.util.h;
import io.sentry.android.core.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class RNSentryReactFragmentLifecycleTracer extends w0 {

    @NotNull
    private final k0 buildInfoProvider;

    @NotNull
    private final Runnable emitNewFrameEvent;

    @NotNull
    private final ILogger logger;

    public RNSentryReactFragmentLifecycleTracer(@NotNull k0 k0Var, @NotNull Runnable runnable, @NotNull ILogger iLogger) {
        this.buildInfoProvider = k0Var;
        this.emitNewFrameEvent = runnable;
        this.logger = iLogger;
    }

    private static EventDispatcher getEventDispatcherForReactTag(@NonNull View view, int i7) {
        return UIManagerHelper.getEventDispatcherForReactTag(UIManagerHelper.getReactContext(view), i7);
    }

    @Override // androidx.fragment.app.w0
    public void onFragmentViewCreated(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment, @NotNull final View view, Bundle bundle) {
        if (!"com.swmansion.rnscreens.e0".equals(fragment.getClass().getCanonicalName())) {
            this.logger.q(SentryLevel.DEBUG, "Fragment is not a ScreenStackFragment, won't listen for the first draw.", new Object[0]);
            return;
        }
        if (!(view instanceof ViewGroup)) {
            this.logger.q(SentryLevel.WARNING, "Fragment view is not a ViewGroup, won't listen for the first draw.", new Object[0]);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getChildCount() == 0) {
            this.logger.q(SentryLevel.WARNING, "Fragment view has no children, won't listen for the first draw.", new Object[0]);
            return;
        }
        View childAt = viewGroup.getChildAt(0);
        if (childAt == null || !(childAt.getContext() instanceof ReactContext)) {
            this.logger.q(SentryLevel.WARNING, "Fragment view has no ReactContext, won't listen for the first draw.", new Object[0]);
            return;
        }
        int id2 = childAt.getId();
        if (id2 == -1) {
            this.logger.q(SentryLevel.WARNING, "Screen has no id, won't listen for the first draw.", new Object[0]);
            return;
        }
        final EventDispatcher eventDispatcherForReactTag = getEventDispatcherForReactTag(childAt, id2);
        if (eventDispatcherForReactTag == null) {
            this.logger.q(SentryLevel.WARNING, "Screen has no event dispatcher, won't listen for the first draw.", new Object[0]);
        } else {
            final Runnable runnable = this.emitNewFrameEvent;
            eventDispatcherForReactTag.addListener(new EventDispatcherListener() { // from class: io.sentry.react.RNSentryReactFragmentLifecycleTracer.1
                @Override // com.facebook.react.uimanager.events.EventDispatcherListener
                public void onEventDispatch(Event event) {
                    if ("k4.k".equals(event.getClass().getCanonicalName())) {
                        eventDispatcherForReactTag.removeListener(this);
                        h.b(view, runnable, RNSentryReactFragmentLifecycleTracer.this.buildInfoProvider);
                    }
                }
            });
        }
    }
}
