package io.sentry.react.replay;

import androidx.annotation.NonNull;
import com.facebook.react.uimanager.ThemedReactContext;

/* JADX INFO: loaded from: classes3.dex */
public final class RNSentryReplayUnmaskManagerImpl {
    public static final String REACT_CLASS = "RNSentryReplayUnmask";

    private RNSentryReplayUnmaskManagerImpl() {
    }

    @NonNull
    public RNSentryReplayUnmask createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        return new RNSentryReplayUnmask(themedReactContext);
    }
}
