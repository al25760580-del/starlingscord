package com.discord.react.utilities;

import android.view.View;
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.StateWrapper;
import io.sentry.android.core.p;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u0014\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fJ\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000fR\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00030\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/discord/react/utilities/ReactSelfMeasurer;", "", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "viewRef", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "value", "Lcom/facebook/react/uimanager/StateWrapper;", "stateWrapper", "setStateWrapper", "(Lcom/facebook/react/uimanager/StateWrapper;)V", "lastPushedHeightPx", "", "applyState", "", "measureAndLayoutRunnable", "Ljava/lang/Runnable;", "onRequestLayout", "measureHeightSpec", "heightMeasureSpec", "publishHeight", "measuredHeightPx", "react_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactSelfMeasurer {
    private int lastPushedHeightPx;

    @NotNull
    private final Runnable measureAndLayoutRunnable;
    private StateWrapper stateWrapper;

    @NotNull
    private final WeakReference<View> viewRef;

    public ReactSelfMeasurer(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.viewRef = new WeakReference<>(view);
        this.lastPushedHeightPx = -1;
        this.measureAndLayoutRunnable = new p(24, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void measureAndLayoutRunnable$lambda$0(ReactSelfMeasurer reactSelfMeasurer) {
        View view = reactSelfMeasurer.viewRef.get();
        if (view != null) {
            ViewMeasureExtensionsKt.measureAndLayout(view);
        }
    }

    private final void setStateWrapper(StateWrapper stateWrapper) {
        this.stateWrapper = stateWrapper;
        if (stateWrapper == null) {
            this.lastPushedHeightPx = -1;
        }
    }

    public final void applyState(StateWrapper stateWrapper) {
        View view;
        boolean z5 = this.stateWrapper == null && stateWrapper != null;
        setStateWrapper(stateWrapper);
        if (!z5 || (view = this.viewRef.get()) == null) {
            return;
        }
        view.requestLayout();
    }

    public final int measureHeightSpec(int heightMeasureSpec) {
        return this.stateWrapper == null ? heightMeasureSpec : View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    public final void onRequestLayout() {
        View view;
        if (this.stateWrapper == null || (view = this.viewRef.get()) == null) {
            return;
        }
        view.post(this.measureAndLayoutRunnable);
    }

    public final void publishHeight(int measuredHeightPx) {
        StateWrapper stateWrapper = this.stateWrapper;
        if (stateWrapper == null || measuredHeightPx == this.lastPushedHeightPx) {
            return;
        }
        this.lastPushedHeightPx = measuredHeightPx;
        stateWrapper.updateState(NativeMapExtensionsKt.nativeMapOf(new Pair("height", Float.valueOf(PixelUtil.toDIPFromPixel(measuredHeightPx)))));
    }
}
