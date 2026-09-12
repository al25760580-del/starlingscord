package com.discord.thumbhash;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.viewmanagers.DCDImageWithThumbhashPlaceholderViewManagerDelegate;
import com.facebook.react.viewmanagers.DCDImageWithThumbhashPlaceholderViewManagerInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = ImageWithThumbhashPlaceholderViewManager.NAME)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001aB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u0018\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bH\u0016R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/discord/thumbhash/ImageWithThumbhashPlaceholderViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/thumbhash/ImageWithThumbhashPlaceholderView;", "Lcom/facebook/react/viewmanagers/DCDImageWithThumbhashPlaceholderViewManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DCDImageWithThumbhashPlaceholderViewManagerDelegate;", "kotlin.jvm.PlatformType", "getDelegate", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "setUri", "", "view", "uri", "setPlaceholder", "placeholder", "setPlaceholderVersion", "placeholderVersion", "", "setAlt", "alt", "Companion", "thumbhash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageWithThumbhashPlaceholderViewManager extends SimpleViewManager<ImageWithThumbhashPlaceholderView> implements DCDImageWithThumbhashPlaceholderViewManagerInterface<ImageWithThumbhashPlaceholderView> {

    @NotNull
    public static final String NAME = "DCDImageWithThumbhashPlaceholderView";

    @NotNull
    private final DCDImageWithThumbhashPlaceholderViewManagerDelegate<ImageWithThumbhashPlaceholderView, ImageWithThumbhashPlaceholderViewManager> delegate = new DCDImageWithThumbhashPlaceholderViewManagerDelegate<>(this);

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ImageWithThumbhashPlaceholderView createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new ImageWithThumbhashPlaceholderView(reactContext, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public DCDImageWithThumbhashPlaceholderViewManagerDelegate<ImageWithThumbhashPlaceholderView, ImageWithThumbhashPlaceholderViewManager> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.viewmanagers.DCDImageWithThumbhashPlaceholderViewManagerInterface
    public void setAlt(ImageWithThumbhashPlaceholderView view, String alt) {
        if (view != null) {
            view.setAlt(alt);
        }
    }

    @Override // com.facebook.react.viewmanagers.DCDImageWithThumbhashPlaceholderViewManagerInterface
    public void setPlaceholder(@NotNull ImageWithThumbhashPlaceholderView view, String placeholder) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setPlaceholder(placeholder);
    }

    @Override // com.facebook.react.viewmanagers.DCDImageWithThumbhashPlaceholderViewManagerInterface
    public void setPlaceholderVersion(@NotNull ImageWithThumbhashPlaceholderView view, int placeholderVersion) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setPlaceholderVersion(Integer.valueOf(placeholderVersion));
    }

    @Override // com.facebook.react.viewmanagers.DCDImageWithThumbhashPlaceholderViewManagerInterface
    public void setUri(@NotNull ImageWithThumbhashPlaceholderView view, String uri) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setUri(uri);
    }
}
