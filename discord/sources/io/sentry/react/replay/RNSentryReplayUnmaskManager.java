package io.sentry.react.replay;

import androidx.annotation.NonNull;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.RNSentryReplayUnmaskManagerDelegate;
import com.facebook.react.viewmanagers.RNSentryReplayUnmaskManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = RNSentryReplayUnmaskManagerImpl.REACT_CLASS)
public class RNSentryReplayUnmaskManager extends ViewGroupManager<RNSentryReplayUnmask> implements RNSentryReplayUnmaskManagerInterface<RNSentryReplayUnmask> {
    private final RNSentryReplayUnmaskManagerDelegate<RNSentryReplayUnmask, RNSentryReplayUnmaskManager> delegate = new RNSentryReplayUnmaskManagerDelegate<>(this);

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<RNSentryReplayUnmask> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return RNSentryReplayUnmaskManagerImpl.REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public RNSentryReplayUnmask createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        return new RNSentryReplayUnmask(themedReactContext);
    }
}
