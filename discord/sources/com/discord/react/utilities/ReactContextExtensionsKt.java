package com.discord.react.utilities;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¢\u0006\u0002\u0010\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0004¨\u0006\u0005"}, d2 = {"jsiId", "", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)Ljava/lang/Long;", "Lcom/facebook/react/bridge/JavaScriptContextHolder;", "react_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ReactContextExtensionsKt {
    public static final Long jsiId(@NotNull ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "<this>");
        JavaScriptContextHolder javaScriptContextHolder = reactContext.getJavaScriptContextHolder();
        if (javaScriptContextHolder != null) {
            return Long.valueOf(jsiId(javaScriptContextHolder));
        }
        return null;
    }

    public static final long jsiId(@NotNull JavaScriptContextHolder javaScriptContextHolder) {
        Intrinsics.checkNotNullParameter(javaScriptContextHolder, "<this>");
        long context = javaScriptContextHolder.getContext();
        if (context != 0) {
            return context;
        }
        throw new IllegalStateException("JSI Runtime is not available.");
    }
}
