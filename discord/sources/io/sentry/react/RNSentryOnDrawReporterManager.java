package io.sentry.react;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.e1;
import io.sentry.android.core.internal.util.h;
import io.sentry.android.core.k0;
import io.sentry.android.core.m0;
import io.sentry.android.core.p;
import io.sentry.k4;
import io.sentry.react.utils.RNSentryActivityUtils;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class RNSentryOnDrawReporterManager extends SimpleViewManager<RNSentryOnDrawReporterView> {
    public static final String REACT_CLASS = "RNSentryOnDrawReporter";
    public static final String TTFD_PREFIX = "ttfd-";
    public static final String TTID_PREFIX = "ttid-";

    @NotNull
    private final ReactApplicationContext mCallerContext;

    public RNSentryOnDrawReporterManager(ReactApplicationContext reactApplicationContext) {
        this.mCallerContext = reactApplicationContext;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(defaultBoolean = false, name = "fullDisplay")
    public void setFullDisplay(RNSentryOnDrawReporterView rNSentryOnDrawReporterView, boolean z5) {
        rNSentryOnDrawReporterView.setFullDisplay(z5);
    }

    @ReactProp(defaultBoolean = false, name = "initialDisplay")
    public void setInitialDisplay(RNSentryOnDrawReporterView rNSentryOnDrawReporterView, boolean z5) {
        rNSentryOnDrawReporterView.setInitialDisplay(z5);
    }

    @ReactProp(name = "parentSpanId")
    public void setParentSpanId(RNSentryOnDrawReporterView rNSentryOnDrawReporterView, String str) {
        rNSentryOnDrawReporterView.setParentSpanId(str);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public RNSentryOnDrawReporterView createViewInstance(@NotNull ThemedReactContext themedReactContext) {
        return new RNSentryOnDrawReporterView(this.mCallerContext, new k0(new m0(1)));
    }

    public static class RNSentryOnDrawReporterView extends View {
        private static final ILogger logger = new m0("RNSentryOnDrawReporterView");
        private final k0 buildInfo;

        @NotNull
        private final k4 dateProvider;
        private boolean isFullDisplay;
        private boolean isInitialDisplay;
        private String parentSpanId;
        private final ReactApplicationContext reactContext;
        private boolean spanIdUsed;

        public RNSentryOnDrawReporterView(@NotNull Context context) {
            super(context);
            this.dateProvider = new e1();
            this.isInitialDisplay = false;
            this.isFullDisplay = false;
            this.spanIdUsed = false;
            this.parentSpanId = null;
            this.reactContext = null;
            this.buildInfo = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$processPropsChanged$0() {
            Double dValueOf = Double.valueOf(this.dateProvider.now().d() / 1.0E9d);
            if (this.parentSpanId == null) {
                logger.q(SentryLevel.ERROR, "[TimeToDisplay] parentSpanId removed before frame was rendered.", new Object[0]);
                return;
            }
            if (this.isInitialDisplay) {
                RNSentryTimeToDisplay.putTimeToDisplayFor(RNSentryOnDrawReporterManager.TTID_PREFIX + this.parentSpanId, dValueOf);
            } else {
                if (!this.isFullDisplay) {
                    logger.q(SentryLevel.DEBUG, "[TimeToDisplay] display type removed before frame was rendered.", new Object[0]);
                    return;
                }
                RNSentryTimeToDisplay.putTimeToDisplayFor(RNSentryOnDrawReporterManager.TTFD_PREFIX + this.parentSpanId, dValueOf);
            }
        }

        private void processPropsChanged() {
            if (this.parentSpanId == null) {
                return;
            }
            if (this.spanIdUsed) {
                logger.q(SentryLevel.DEBUG, "[TimeToDisplay] Already recorded time to display for spanId: " + this.parentSpanId, new Object[0]);
                return;
            }
            if (this.isInitialDisplay) {
                logger.q(SentryLevel.DEBUG, "[TimeToDisplay] Register initial display event emitter.", new Object[0]);
            } else {
                if (!this.isFullDisplay) {
                    logger.q(SentryLevel.DEBUG, "[TimeToDisplay] Not ready, missing displayType prop.", new Object[0]);
                    return;
                }
                logger.q(SentryLevel.DEBUG, "[TimeToDisplay] Register full display event emitter.", new Object[0]);
            }
            if (this.buildInfo == null) {
                logger.q(SentryLevel.ERROR, "[TimeToDisplay] Won't emit next frame drawn event, buildInfo is null.", new Object[0]);
                return;
            }
            ReactApplicationContext reactApplicationContext = this.reactContext;
            if (reactApplicationContext == null) {
                logger.q(SentryLevel.ERROR, "[TimeToDisplay] Won't emit next frame drawn event, reactContext is null.", new Object[0]);
                return;
            }
            ILogger iLogger = logger;
            Activity currentActivity = RNSentryActivityUtils.getCurrentActivity(reactApplicationContext, iLogger);
            if (currentActivity == null) {
                iLogger.q(SentryLevel.ERROR, "[TimeToDisplay] Won't emit next frame drawn event, activity is null.", new Object[0]);
            } else {
                this.spanIdUsed = true;
                registerForNextDraw(currentActivity, new p(11, this), this.buildInfo);
            }
        }

        public void registerForNextDraw(@NotNull Activity activity, @NotNull Runnable runnable, @NotNull k0 k0Var) {
            h.a(activity, runnable, k0Var);
        }

        public void setFullDisplay(boolean z5) {
            if (z5 != this.isFullDisplay) {
                this.isFullDisplay = z5;
                processPropsChanged();
            }
        }

        public void setInitialDisplay(boolean z5) {
            if (z5 != this.isInitialDisplay) {
                this.isInitialDisplay = z5;
                processPropsChanged();
            }
        }

        public void setParentSpanId(String str) {
            if (Objects.equals(str, this.parentSpanId)) {
                return;
            }
            this.parentSpanId = str;
            this.spanIdUsed = false;
            processPropsChanged();
        }

        public RNSentryOnDrawReporterView(@NotNull ReactApplicationContext reactApplicationContext, @NotNull k0 k0Var) {
            super(reactApplicationContext);
            this.dateProvider = new e1();
            this.isInitialDisplay = false;
            this.isFullDisplay = false;
            this.spanIdUsed = false;
            this.parentSpanId = null;
            this.reactContext = reactApplicationContext;
            this.buildInfo = k0Var;
        }

        public RNSentryOnDrawReporterView(@NotNull Context context, @NotNull ReactApplicationContext reactApplicationContext, @NotNull k0 k0Var) {
            super(context);
            this.dateProvider = new e1();
            this.isInitialDisplay = false;
            this.isFullDisplay = false;
            this.spanIdUsed = false;
            this.parentSpanId = null;
            this.reactContext = reactApplicationContext;
            this.buildInfo = k0Var;
        }
    }
}
