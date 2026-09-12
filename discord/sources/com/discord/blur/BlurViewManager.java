package com.discord.blur;

import android.os.Build;
import android.view.ViewGroup;
import com.discord.react.utilities.InitialPropsViewGroupManager;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.viewmanagers.DCDVisualEffectViewManagerDelegate;
import com.facebook.react.viewmanagers.DCDVisualEffectViewManagerInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001 B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J!\u0010\u0016\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u0016J\u001f\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010\u0019J\u001a\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u000bH\u0016R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/discord/blur/BlurViewManager;", "Lcom/discord/react/utilities/InitialPropsViewGroupManager;", "Landroid/view/ViewGroup;", "Lcom/facebook/react/viewmanagers/DCDVisualEffectViewManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DCDVisualEffectViewManagerDelegate;", "kotlin.jvm.PlatformType", "getDelegate", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "initialProps", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "setBlurAmount", "", "blurView", BlurViewManager.PROP_BLUR_AMOUNT, "", "setBlurTintIOSParityCompensationColor", "blurTintIOSParityCompensationColor", "", "(Landroid/view/ViewGroup;Ljava/lang/Integer;)V", "setBlurTargetViewNativeId", BlurViewManager.PROP_BLUR_TARGET_VIEW_NATIVE_ID, "setTintColor", "tintColor", "setBlurEffectName", "blurEffectName", "Companion", "blur_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ReactModule(name = BlurViewManager.NAME)
@SourceDebugExtension({"SMAP\nBlurViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlurViewManager.kt\ncom/discord/blur/BlurViewManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
public final class BlurViewManager extends InitialPropsViewGroupManager<ViewGroup> implements DCDVisualEffectViewManagerInterface<ViewGroup> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String NAME = "DCDVisualEffectView";

    @NotNull
    private static final String PROP_BLUR_AMOUNT = "blurAmount";

    @NotNull
    private static final String PROP_BLUR_TARGET_VIEW_NATIVE_ID = "blurTargetViewNativeId";

    @NotNull
    private final DCDVisualEffectViewManagerDelegate<ViewGroup, BlurViewManager> delegate = new DCDVisualEffectViewManagerDelegate<>(this);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\b\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/discord/blur/BlurViewManager$Companion;", "", "<init>", "()V", "NAME", "", "PROP_BLUR_TARGET_VIEW_NATIVE_ID", "PROP_BLUR_AMOUNT", "isHardwareBlurEnabled", "", "isHardwareBlurEnabled$blur_release", "blur_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isHardwareBlurEnabled$blur_release() {
            return Build.VERSION.SDK_INT >= 31;
        }

        private Companion() {
        }
    }

    @Override // com.discord.react.utilities.InitialPropsViewGroupManager
    @NotNull
    public ViewGroup createViewInstance(@NotNull ThemedReactContext reactContext, @NotNull ReactStylesDiffMap initialProps) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(initialProps, "initialProps");
        String string = initialProps.getString(PROP_BLUR_TARGET_VIEW_NATIVE_ID);
        float f2 = initialProps.getFloat(PROP_BLUR_AMOUNT, -1.0f);
        if (string == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (f2 == -1.0f) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return INSTANCE.isHardwareBlurEnabled$blur_release() ? new BlurViewHardwareAccelerated(reactContext, string, 0, 0, f2, 12, null) : new BlurView(reactContext, string, 0, 0, f2, 12, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.viewmanagers.DCDVisualEffectViewManagerInterface
    public void setBlurEffectName(@NotNull ViewGroup blurView, String blurEffectName) {
        Intrinsics.checkNotNullParameter(blurView, "blurView");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public DCDVisualEffectViewManagerDelegate<ViewGroup, BlurViewManager> getDelegate() {
        return this.delegate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.viewmanagers.DCDVisualEffectViewManagerInterface
    public void setBlurAmount(@NotNull ViewGroup blurView, float blurAmount) {
        Intrinsics.checkNotNullParameter(blurView, "blurView");
        if (!(blurView instanceof BlurViewAPI)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ((BlurViewAPIBase) blurView).setBlurAmount(blurView.getId(), blurAmount);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.viewmanagers.DCDVisualEffectViewManagerInterface
    public void setBlurTargetViewNativeId(@NotNull ViewGroup blurView, String blurTargetViewNativeId) {
        Intrinsics.checkNotNullParameter(blurView, "blurView");
        if (!(blurView instanceof BlurViewAPI)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (blurTargetViewNativeId == null) {
            throw new IllegalArgumentException("blurTargetViewNativeId cannot be changed to undefined/null!");
        }
        ((BlurViewAPIBase) blurView).setBlurTargetNativeId(blurTargetViewNativeId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.viewmanagers.DCDVisualEffectViewManagerInterface
    public void setBlurTintIOSParityCompensationColor(ViewGroup blurView, Integer blurTintIOSParityCompensationColor) {
        if (!(blurView instanceof BlurViewAPI)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ((BlurViewAPI) blurView).setBlurTintIOSParityCompensation(blurTintIOSParityCompensationColor != null ? blurTintIOSParityCompensationColor.intValue() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.viewmanagers.DCDVisualEffectViewManagerInterface
    public void setTintColor(@NotNull ViewGroup blurView, Integer tintColor) {
        Intrinsics.checkNotNullParameter(blurView, "blurView");
        if (!(blurView instanceof BlurViewAPI)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ((BlurViewAPI) blurView).setBlurTint(tintColor != null ? tintColor.intValue() : 0);
    }
}
