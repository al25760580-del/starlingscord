package com.discord.react.utilities;

import android.app.Activity;
import android.view.View;
import com.discord.misc.utilities.activity.ActivityExtensionsKt;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.util.ReactFindViewUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"findView", "Landroid/view/View;", "Lcom/facebook/react/bridge/ReactContext;", "nativeId", "", "react_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ReactContextFindViewKt {
    public static final View findView(@NotNull ReactContext reactContext, @NotNull String nativeId) {
        View rootView;
        Intrinsics.checkNotNullParameter(reactContext, "<this>");
        Intrinsics.checkNotNullParameter(nativeId, "nativeId");
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null || (rootView = ActivityExtensionsKt.getRootView(currentActivity)) == null) {
            return null;
        }
        return ReactFindViewUtil.findView(rootView, nativeId);
    }
}
