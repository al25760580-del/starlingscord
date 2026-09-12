package com.discord.view;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.scroll.FpsListener;
import com.facebook.react.views.scroll.ReactScrollView;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(canOverrideExistingModule = true, name = "RCTScrollView")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/discord/view/ReactScrollViewManagerOverride;", "Lcom/facebook/react/views/scroll/ReactScrollViewManager;", "fpsListener", "Lcom/facebook/react/views/scroll/FpsListener;", "<init>", "(Lcom/facebook/react/views/scroll/FpsListener;)V", "createViewInstance", "Lcom/facebook/react/views/scroll/ReactScrollView;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "app_googleRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactScrollViewManagerOverride extends ReactScrollViewManager {
    private FpsListener fpsListener;

    /* JADX WARN: Multi-variable type inference failed */
    public ReactScrollViewManagerOverride() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ReactScrollViewManagerOverride(FpsListener fpsListener, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : fpsListener);
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public ReactScrollView createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ReactScrollViewOverride(context, this.fpsListener);
    }

    public ReactScrollViewManagerOverride(FpsListener fpsListener) {
        super(fpsListener);
        this.fpsListener = fpsListener;
    }
}
