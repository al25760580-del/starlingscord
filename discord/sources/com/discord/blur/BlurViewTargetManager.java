package com.discord.blur;

import com.discord.react.utilities.InitialPropsViewGroupManager;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.viewmanagers.DCDVisualEffectViewTargetManagerDelegate;
import com.facebook.react.viewmanagers.DCDVisualEffectViewTargetManagerInterface;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = BlurViewTargetManager.NAME)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u001a\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0016R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/discord/blur/BlurViewTargetManager;", "Lcom/discord/react/utilities/InitialPropsViewGroupManager;", "Lcom/facebook/react/views/view/ReactViewGroup;", "Lcom/facebook/react/viewmanagers/DCDVisualEffectViewTargetManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DCDVisualEffectViewTargetManagerDelegate;", "kotlin.jvm.PlatformType", "getDelegate", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "initialProps", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "onDropViewInstance", "", "view", "setNativeId", "nativeId", "Companion", "blur_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BlurViewTargetManager extends InitialPropsViewGroupManager<ReactViewGroup> implements DCDVisualEffectViewTargetManagerInterface<ReactViewGroup> {

    @NotNull
    public static final String NAME = "DCDVisualEffectViewTarget";

    @NotNull
    private static final String PROP_NATIVE_ID = "nativeID";

    @NotNull
    private final DCDVisualEffectViewTargetManagerDelegate<ReactViewGroup, BlurViewTargetManager> delegate = new DCDVisualEffectViewTargetManagerDelegate<>(this);

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @Override // com.discord.react.utilities.InitialPropsViewGroupManager
    @NotNull
    public ReactViewGroup createViewInstance(@NotNull ThemedReactContext reactContext, @NotNull ReactStylesDiffMap initialProps) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(initialProps, "initialProps");
        String string = initialProps.getString("nativeID");
        if (string != null) {
            return BlurViewManager.INSTANCE.isHardwareBlurEnabled$blur_release() ? new BlurViewTargetHardwareAccelerated(reactContext, string) : new BlurViewTarget(reactContext, string);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public DCDVisualEffectViewTargetManagerDelegate<ReactViewGroup, BlurViewTargetManager> getDelegate() {
        return this.delegate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setNativeId(@NotNull ReactViewGroup view, String nativeId) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.setNativeId(view, nativeId);
        if (!(view instanceof BlurViewAPI.Target)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (nativeId == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ((BlurViewAPIBase) view).setBlurTargetNativeId(nativeId);
    }

    @Override // com.discord.react.utilities.InitialPropsViewGroupManager
    public void onDropViewInstance(@NotNull ReactViewGroup view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onDropViewInstance(view);
        if (!(view instanceof BlurViewAPI.Target)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
