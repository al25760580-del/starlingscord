package com.discord.view;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.swmansion.rnscreens.ScreenStack;
import com.swmansion.rnscreens.ScreenStackViewManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(canOverrideExistingModule = true, name = ScreenStackViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, d2 = {"Lcom/discord/view/ScreenStackViewManagerOverride;", "Lcom/swmansion/rnscreens/ScreenStackViewManager;", "<init>", "()V", "createViewInstance", "Lcom/swmansion/rnscreens/ScreenStack;", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "app_googleRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScreenStackViewManagerOverride extends ScreenStackViewManager {
    @Override // com.swmansion.rnscreens.ScreenStackViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public ScreenStack createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new ScreenStackOverride(reactContext);
    }
}
