package com.facebook.react.views.safeareaview;

import am.b;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.l0;
import androidx.core.view.u0;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewProps;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0014J0\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0014J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/facebook/react/views/safeareaview/ReactSafeAreaView;", "Landroid/view/ViewGroup;", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "getReactContext", "()Lcom/facebook/react/uimanager/ThemedReactContext;", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "getStateWrapper$ReactAndroid_release", "()Lcom/facebook/react/uimanager/StateWrapper;", "setStateWrapper$ReactAndroid_release", "(Lcom/facebook/react/uimanager/StateWrapper;)V", "onAttachedToWindow", "", "onLayout", "p0", "", "p1", "", "p2", "p3", "p4", "updateState", "insets", "Landroidx/core/graphics/Insets;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactSafeAreaView extends ViewGroup {

    @NotNull
    private final ThemedReactContext reactContext;
    private StateWrapper stateWrapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactSafeAreaView(@NotNull ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat onAttachedToWindow$lambda$0(ReactSafeAreaView reactSafeAreaView, View view, WindowInsetsCompat windowInsets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        Insets insetsF = windowInsets.f1605a.f(647);
        Intrinsics.checkNotNullExpressionValue(insetsF, "getInsets(...)");
        reactSafeAreaView.updateState(insetsF);
        return WindowInsetsCompat.f1604b;
    }

    private final void updateState(final Insets insets) {
        StateWrapper stateWrapper = this.stateWrapper;
        if (stateWrapper == null) {
            if (ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
                return;
            }
            ThemedReactContext themedReactContext = this.reactContext;
            themedReactContext.runOnNativeModulesQueueThread(new GuardedRunnable(themedReactContext) { // from class: com.facebook.react.views.safeareaview.ReactSafeAreaView.updateState.2
                @Override // com.facebook.react.bridge.GuardedRunnable
                public void runGuarded() {
                    UIManagerModule uIManagerModule = (UIManagerModule) ReactSafeAreaView.this.getReactContext().getReactApplicationContext().getNativeModule(UIManagerModule.class);
                    if (uIManagerModule != null) {
                        int id2 = ReactSafeAreaView.this.getId();
                        Insets insets2 = insets;
                        uIManagerModule.updateInsetsPadding(id2, insets2.f1557b, insets2.f1556a, insets2.f1559d, insets2.f1558c);
                    }
                }
            });
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        PixelUtil pixelUtil = PixelUtil.INSTANCE;
        writableNativeMap.putDouble(ViewProps.LEFT, pixelUtil.pxToDp(insets.f1556a));
        writableNativeMap.putDouble(ViewProps.TOP, pixelUtil.pxToDp(insets.f1557b));
        writableNativeMap.putDouble(ViewProps.BOTTOM, pixelUtil.pxToDp(insets.f1559d));
        writableNativeMap.putDouble(ViewProps.RIGHT, pixelUtil.pxToDp(insets.f1558c));
        stateWrapper.updateState(writableNativeMap);
    }

    @NotNull
    public final ThemedReactContext getReactContext() {
        return this.reactContext;
    }

    /* JADX INFO: renamed from: getStateWrapper$ReactAndroid_release, reason: from getter */
    public final StateWrapper getStateWrapper() {
        return this.stateWrapper;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = new b(1, this);
        WeakHashMap weakHashMap = u0.f1729a;
        l0.m(this, bVar);
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean p3, int p5, int p6, int p10, int p11) {
    }

    public final void setStateWrapper$ReactAndroid_release(StateWrapper stateWrapper) {
        this.stateWrapper = stateWrapper;
    }
}
