package io.sentry.react.replay;

import androidx.annotation.NonNull;
import com.facebook.react.uimanager.ThemedReactContext;

/* JADX INFO: loaded from: classes3.dex */
public final class RNSentryReplayMaskManagerImpl {
    public static final String REACT_CLASS = "RNSentryReplayMask";

    private RNSentryReplayMaskManagerImpl() {
    }

    @NonNull
    public static RNSentryReplayMask createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        return new RNSentryReplayMask(themedReactContext);
    }
}
