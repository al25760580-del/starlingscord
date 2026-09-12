package io.sentry.react.replay;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.w0;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.c4;
import io.sentry.j3;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class RNSentryReplayFragmentLifecycleTracer extends w0 {
    private ViewTreeObserver.OnGlobalLayoutListener currentListener;
    private WeakReference<View> currentViewRef;

    @NotNull
    private final ILogger logger;
    private ReplayIntegration replayIntegration;
    private int lastWidth = -1;
    private int lastHeight = -1;

    public RNSentryReplayFragmentLifecycleTracer(@NotNull ILogger iLogger) {
        this.logger = iLogger;
    }

    private void attachLayoutChangeListener(View view) {
        final WeakReference weakReference = new WeakReference(view);
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.sentry.react.replay.RNSentryReplayFragmentLifecycleTracer.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                View view2 = (View) weakReference.get();
                if (view2 != null) {
                    RNSentryReplayFragmentLifecycleTracer.this.checkAndNotifyWindowSizeChange(view2);
                }
            }
        };
        this.currentViewRef = new WeakReference<>(view);
        this.currentListener = onGlobalLayoutListener;
        view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkAndNotifyWindowSizeChange(View view) {
        try {
            DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
            int i7 = displayMetrics.widthPixels;
            int i10 = displayMetrics.heightPixels;
            if (this.lastWidth == i7 && this.lastHeight == i10) {
                return;
            }
            this.lastWidth = i7;
            this.lastHeight = i10;
            notifyReplayIntegrationOfSizeChange(i7, i10);
        } catch (Exception e10) {
            this.logger.g(SentryLevel.DEBUG, "Failed to check window size", e10);
        }
    }

    private void detachLayoutChangeListener() {
        WeakReference<View> weakReference = this.currentViewRef;
        View view = weakReference != null ? weakReference.get() : null;
        if (view != null && this.currentListener != null) {
            try {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this.currentListener);
                }
            } catch (Exception e10) {
                this.logger.g(SentryLevel.DEBUG, "Failed to remove layout change listener", e10);
            }
        }
        this.currentViewRef = null;
        this.currentListener = null;
    }

    private ReplayIntegration getReplayIntegration() {
        try {
            j3 replayController = c4.f().l().getReplayController();
            if (replayController instanceof ReplayIntegration) {
                return (ReplayIntegration) replayController;
            }
            this.logger.q(SentryLevel.DEBUG, "Error getting replay integration", new Object[0]);
            return null;
        } catch (Exception e10) {
            this.logger.g(SentryLevel.DEBUG, "Error getting replay integration", e10);
            return null;
        }
    }

    private void notifyReplayIntegrationOfSizeChange(int i7, int i10) {
        if (this.replayIntegration == null) {
            this.replayIntegration = getReplayIntegration();
        }
        ReplayIntegration replayIntegration = this.replayIntegration;
        if (replayIntegration == null) {
            return;
        }
        try {
            replayIntegration.onWindowSizeChanged(i7, i10);
        } catch (Exception e10) {
            this.logger.g(SentryLevel.DEBUG, "Failed to notify replay integration of size change", e10);
        }
    }

    @Override // androidx.fragment.app.w0
    public void onFragmentViewCreated(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment, @NotNull View view, Bundle bundle) {
        detachLayoutChangeListener();
        attachLayoutChangeListener(view);
    }

    @Override // androidx.fragment.app.w0
    public void onFragmentViewDestroyed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        detachLayoutChangeListener();
    }
}
