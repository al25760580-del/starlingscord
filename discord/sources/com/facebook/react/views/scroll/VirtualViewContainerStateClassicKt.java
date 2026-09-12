package com.facebook.react.views.scroll;

import a3.e;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import o8.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"DEBUG_TAG", "", "debugLog", "", "subtag", "block", "Lkotlin/Function0;", "ReactAndroid_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class VirtualViewContainerStateClassicKt {

    @NotNull
    private static final String DEBUG_TAG = "VirtualViewContainerStateClassic";

    private static final void debugLog(String str, Function0<String> function0) {
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            a.b(e.l("VirtualViewContainerStateClassic:", str), (String) function0.invoke());
        }
    }

    public static /* synthetic */ void debugLog$default(String str, Function0 function0, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            function0 = new Function0<String>() { // from class: com.facebook.react.views.scroll.VirtualViewContainerStateClassicKt.debugLog.1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "";
                }
            };
        }
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            a.b(e.l("VirtualViewContainerStateClassic:", str), (String) function0.invoke());
        }
    }
}
