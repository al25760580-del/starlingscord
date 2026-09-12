package com.discord.sticker.react;

import com.discord.image.animated_image.apng.APNGImageView;
import com.discord.sticker.StickerView;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.viewmanagers.APNGStickerViewManagerDelegate;
import com.facebook.react.viewmanagers.APNGStickerViewManagerInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = StickerViewManagerAPNG.NAME)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0014B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u001a\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0016R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/sticker/react/StickerViewManagerAPNG;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/sticker/StickerView;", "Lcom/facebook/react/viewmanagers/APNGStickerViewManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/viewmanagers/APNGStickerViewManagerDelegate;", "kotlin.jvm.PlatformType", "getDelegate", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "onDropViewInstance", "", "view", "setUrl", "value", "Companion", "sticker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StickerViewManagerAPNG extends SimpleViewManager<StickerView> implements APNGStickerViewManagerInterface<StickerView> {

    @NotNull
    public static final String NAME = "APNGStickerView";

    @NotNull
    private final APNGStickerViewManagerDelegate<StickerView, StickerViewManagerAPNG> delegate = new APNGStickerViewManagerDelegate<>(this);

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
        APNGImageView.inflateApngView$default(stickerView, false, 1, null);
        return stickerView;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public APNGStickerViewManagerDelegate<StickerView, StickerViewManagerAPNG> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NotNull StickerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onDropViewInstance(view);
        view.recycle();
    }

    @Override // com.facebook.react.viewmanagers.APNGStickerViewManagerInterface
    public void setUrl(@NotNull StickerView view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value != null) {
            view.asApng(value, null, null, true, null);
        }
    }
}
