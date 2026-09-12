package com.facebook.react.devsupport;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.react.R;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.modules.debug.FpsDebugFrameCallback;
import com.facebook.react.uimanager.ViewProps;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0002\u0018\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\rH\u0014J0\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00060\u000bR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/devsupport/FpsView;", "Landroid/widget/FrameLayout;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "textView", "Landroid/widget/TextView;", "frameCallback", "Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;", "fpsMonitorRunnable", "Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;", "onAttachedToWindow", "", "onDetachedFromWindow", "setCurrentFPS", "currentFPS", "", "currentJSFPS", "droppedUIFrames", "", "total4PlusFrameStutters", "runningOnFabric", "", "FPSMonitorRunnable", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FpsView extends FrameLayout {
    private static final int UPDATE_INTERVAL_MS = 500;

    @NotNull
    private final FPSMonitorRunnable fpsMonitorRunnable;

    @NotNull
    private final FpsDebugFrameCallback frameCallback;

    @NotNull
    private final TextView textView;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/react/devsupport/FpsView$FPSMonitorRunnable;", "Ljava/lang/Runnable;", "<init>", "(Lcom/facebook/react/devsupport/FpsView;)V", "shouldStop", "", "totalFramesDropped", "", "total4PlusFrameStutters", "run", "", ViewProps.START, "stop", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class FPSMonitorRunnable implements Runnable {
        private boolean shouldStop;
        private int total4PlusFrameStutters;
        private int totalFramesDropped;

        public FPSMonitorRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.shouldStop) {
                return;
            }
            this.totalFramesDropped = (FpsView.this.frameCallback.getExpectedNumFrames() - FpsView.this.frameCallback.getNumFrames()) + this.totalFramesDropped;
            this.total4PlusFrameStutters = FpsView.this.frameCallback.getFourPlusFrameStutters() + this.total4PlusFrameStutters;
            FpsView fpsView = FpsView.this;
            fpsView.setCurrentFPS(fpsView.frameCallback.getFps(), FpsView.this.frameCallback.getJsFPS(), this.totalFramesDropped, this.total4PlusFrameStutters, FpsView.this.frameCallback.getIsRunningOnFabric());
            FpsView.this.frameCallback.reset();
            FpsView.this.postDelayed(this, 500L);
        }

        public final void start() {
            this.shouldStop = false;
            FpsView.this.post(this);
        }

        public final void stop() {
            this.shouldStop = true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FpsView(@NotNull ReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        View.inflate(reactContext, R.layout.fps_view, this);
        View viewFindViewById = findViewById(R.id.fps_text);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        this.textView = (TextView) viewFindViewById;
        FpsDebugFrameCallback fpsDebugFrameCallback = new FpsDebugFrameCallback(reactContext);
        this.frameCallback = fpsDebugFrameCallback;
        this.fpsMonitorRunnable = new FPSMonitorRunnable();
        setCurrentFPS(0.0d, 0.0d, 0, 0, fpsDebugFrameCallback.getIsRunningOnFabric());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentFPS(double currentFPS, double currentJSFPS, int droppedUIFrames, int total4PlusFrameStutters, boolean runningOnFabric) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        String strQ = a3.e.q(new Object[]{Double.valueOf(currentFPS), Integer.valueOf(droppedUIFrames), Integer.valueOf(total4PlusFrameStutters)}, 3, locale, "UI: %.1f fps\n%d dropped so far\n%d stutters (4+) so far", "format(...)");
        if (!runningOnFabric) {
            strQ = strQ.concat(a3.e.q(new Object[]{Double.valueOf(currentJSFPS)}, 1, locale, "\nJS: %.1f fps", "format(...)"));
        }
        this.textView.setText(strQ);
        o8.a.b(ReactConstants.TAG, strQ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.frameCallback.reset();
        FpsDebugFrameCallback.start$default(this.frameCallback, 0.0d, 1, null);
        this.fpsMonitorRunnable.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.frameCallback.stop();
        this.fpsMonitorRunnable.stop();
    }
}
