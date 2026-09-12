package com.discord.sticker.react;

import com.discord.sticker.StickerView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.NativeLottieNodeManagerDelegate;
import com.facebook.react.viewmanagers.NativeLottieNodeManagerInterface;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = StickerViewManagerLottie.NAME)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001!B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\"\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016JN\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u000bH\u0016R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/discord/sticker/react/StickerViewManagerLottie;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/sticker/StickerView;", "Lcom/facebook/react/viewmanagers/NativeLottieNodeManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/viewmanagers/NativeLottieNodeManagerDelegate;", "kotlin.jvm.PlatformType", "getDelegate", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "onDropViewInstance", "", "view", "receiveCommand", "node", "commandId", "args", "Lcom/facebook/react/bridge/ReadableArray;", StickerViewManagerLottie.SETUP_COMMAND_ID, "asset", "url", "width", "", "height", "renderMode", ReactProgressBarViewManager.PROP_ANIMATING, "", ViewProps.ACCESSIBILITY_LABEL, "Companion", "sticker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StickerViewManagerLottie extends SimpleViewManager<StickerView> implements NativeLottieNodeManagerInterface<StickerView> {

    @NotNull
    public static final String NAME = "NativeLottieNode";

    @NotNull
    private static final String SETUP_COMMAND_ID = "setup";

    @NotNull
    private final NativeLottieNodeManagerDelegate<StickerView, StickerViewManagerLottie> delegate = new NativeLottieNodeManagerDelegate<>(this);

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public StickerView createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        StickerView stickerView = new StickerView(reactContext, null, 0, 6, null);
        stickerView.inflateLottieView();
        return stickerView;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public NativeLottieNodeManagerDelegate<StickerView, StickerViewManagerLottie> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NotNull StickerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onDropViewInstance(view);
        view.recycle();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NotNull StickerView node, @NotNull String commandId, ReadableArray args) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        if (!Intrinsics.areEqual(commandId, SETUP_COMMAND_ID) || args == null) {
            return;
        }
        setup(node, args.getString(0), args.getString(1), args.getInt(2), args.getInt(3), args.getInt(4), args.getBoolean(5), args.getString(6));
    }

    @Override // com.facebook.react.viewmanagers.NativeLottieNodeManagerInterface
    public void setup(@NotNull StickerView view, String asset, String url, int width, int height, int renderMode, boolean animating, String accessibilityLabel) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (asset == null || url == null) {
            return;
        }
        view.asLottie(url, width, height, animating, asset, renderMode, accessibilityLabel);
    }
}
