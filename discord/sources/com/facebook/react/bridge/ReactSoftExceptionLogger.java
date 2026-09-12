package com.facebook.react.bridge;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xa.a;

/* JADX INFO: loaded from: classes3.dex */
@a
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0007J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/bridge/ReactSoftExceptionLogger;", "", "<init>", "()V", "listeners", "", "Lcom/facebook/react/bridge/ReactSoftExceptionLogger$ReactSoftExceptionListener;", "addListener", "", "listener", "removeListener", "logSoftExceptionVerbose", "category", "", "cause", "", "logSoftException", "logNoThrowSoftExceptionWithMessage", "message", "CategoryMode", "Categories", "ReactSoftExceptionListener", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactSoftExceptionLogger {

    @NotNull
    public static final ReactSoftExceptionLogger INSTANCE = new ReactSoftExceptionLogger();

    @NotNull
    private static final List<ReactSoftExceptionListener> listeners = new CopyOnWriteArrayList();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/bridge/ReactSoftExceptionLogger$Categories;", "", "<init>", "()V", "RVG_ADD_CHILDREN_FOR_ACCESSIBILITY", "", "RVG_IS_VIEW_CLIPPED", "RVG_ON_VIEW_REMOVED", "CLIPPING_PROHIBITED_VIEW", "SOFT_ASSERTIONS", "SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Categories {

        @NotNull
        public static final String CLIPPING_PROHIBITED_VIEW = "ReactClippingProhibitedView";

        @NotNull
        public static final Categories INSTANCE = new Categories();

        @NotNull
        public static final String RVG_ADD_CHILDREN_FOR_ACCESSIBILITY = "ReactViewGroup.addChildrenForAccessibility";

        @NotNull
        public static final String RVG_IS_VIEW_CLIPPED = "ReactViewGroup.isViewClipped";

        @NotNull
        public static final String RVG_ON_VIEW_REMOVED = "ReactViewGroup.onViewRemoved";

        @NotNull
        public static final String SOFT_ASSERTIONS = "SoftAssertions";

        @NotNull
        public static final String SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE = "SurfaceMountingManager:MissingViewState";

        private Categories() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/facebook/react/bridge/ReactSoftExceptionLogger$CategoryMode;", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public @interface CategoryMode {
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/bridge/ReactSoftExceptionLogger$ReactSoftExceptionListener;", "", "logSoftException", "", "category", "", "cause", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ReactSoftExceptionListener {
        void logSoftException(@NotNull String category, @NotNull Throwable cause);
    }

    private ReactSoftExceptionLogger() {
    }

    public static final void addListener(@NotNull ReactSoftExceptionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<ReactSoftExceptionListener> list = listeners;
        if (list.contains(listener)) {
            return;
        }
        list.add(listener);
    }

    @a
    private static final void logNoThrowSoftExceptionWithMessage(String category, String message) {
        logSoftException(category, new ReactNoCrashSoftException(message));
    }

    public static final void logSoftException(@NotNull String category, @NotNull Throwable cause) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(cause, "cause");
        List<ReactSoftExceptionListener> list = listeners;
        if (list.isEmpty()) {
            o8.a.h(category, "Unhandled SoftException", cause);
            return;
        }
        Iterator<ReactSoftExceptionListener> it = list.iterator();
        while (it.hasNext()) {
            it.next().logSoftException(category, cause);
        }
    }

    public static final void logSoftExceptionVerbose(@NotNull String category, @NotNull Throwable cause) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(cause, "cause");
        logSoftException(category + "|" + cause.getClass().getSimpleName() + ":" + cause.getMessage(), cause);
    }

    public static final void removeListener(@NotNull ReactSoftExceptionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listeners.remove(listener);
    }
}
