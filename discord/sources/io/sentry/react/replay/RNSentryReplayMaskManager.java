package io.sentry.react.replay;

import androidx.annotation.NonNull;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.RNSentryReplayMaskManagerDelegate;
import com.facebook.react.viewmanagers.RNSentryReplayMaskManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = RNSentryReplayMaskManagerImpl.REACT_CLASS)
public class RNSentryReplayMaskManager extends ViewGroupManager<RNSentryReplayMask> implements RNSentryReplayMaskManagerInterface<RNSentryReplayMask> {
    private final RNSentryReplayMaskManagerDelegate<RNSentryReplayMask, RNSentryReplayMaskManager> delegate = new RNSentryReplayMaskManagerDelegate<>(this);

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<RNSentryReplayMask> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return RNSentryReplayMaskManagerImpl.REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public RNSentryReplayMask createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        return new RNSentryReplayMask(themedReactContext);
    }
}
