package com.discord.react.utilities;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.UIImplementation;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.yoga.YogaDirection;
import i5.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010#\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u0002\u001a\u0014\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u000f0\u000f*\u00020\fH\u0002\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u000fH\u0002\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"viewLayoutQueued", "", "", "viewOperationQueueMethod", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "getViewOperationQueueMethod", "()Ljava/lang/reflect/Method;", "viewOperationQueueMethod$delegate", "Lkotlin/Lazy;", "queueManualLayout", "", "Lcom/facebook/react/bridge/ReactContext;", "viewId", "getUIImplementation", "Lcom/facebook/react/uimanager/UIImplementation;", "getUIViewOperationQueue", "Lcom/facebook/react/uimanager/UIViewOperationQueue;", "react_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactViewExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactViewExtensions.kt\ncom/discord/react/utilities/ReactViewExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
public final class ReactViewExtensionsKt {

    @NotNull
    private static final Set<Integer> viewLayoutQueued;

    @NotNull
    private static final Lazy viewOperationQueueMethod$delegate;

    static {
        Set<Integer> setSynchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        Intrinsics.checkNotNullExpressionValue(setSynchronizedSet, "synchronizedSet(...)");
        viewLayoutQueued = setSynchronizedSet;
        viewOperationQueueMethod$delegate = l.b(new a(23));
    }

    private static final UIImplementation getUIImplementation(ReactContext reactContext) {
        NativeModule nativeModule = reactContext.getNativeModule((Class<NativeModule>) UIManagerModule.class);
        Intrinsics.checkNotNull(nativeModule);
        return ((UIManagerModule) nativeModule).getUIImplementation();
    }

    private static final UIViewOperationQueue getUIViewOperationQueue(UIImplementation uIImplementation) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = getViewOperationQueueMethod().invoke(uIImplementation, null);
        if (objInvoke instanceof UIViewOperationQueue) {
            return (UIViewOperationQueue) objInvoke;
        }
        return null;
    }

    private static final Method getViewOperationQueueMethod() {
        return (Method) viewOperationQueueMethod$delegate.getValue();
    }

    public static final void queueManualLayout(@NotNull ReactContext reactContext, int i7) {
        Intrinsics.checkNotNullParameter(reactContext, "<this>");
        if (viewLayoutQueued.contains(Integer.valueOf(i7))) {
            return;
        }
        reactContext.runOnNativeModulesQueueThread(new a1.l(i7, 7, reactContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queueManualLayout$lambda$3(ReactContext reactContext, int i7) throws IllegalAccessException, InvocationTargetException {
        UIImplementation uIImplementation = getUIImplementation(reactContext);
        ReactShadowNode reactShadowNodeResolveShadowNode = uIImplementation.resolveShadowNode(i7);
        if (reactShadowNodeResolveShadowNode != null) {
            Intrinsics.checkNotNull(uIImplementation);
            UIViewOperationQueue uIViewOperationQueue = getUIViewOperationQueue(uIImplementation);
            if (uIViewOperationQueue != null) {
                ReactShadowNode parent = reactShadowNodeResolveShadowNode.getParent();
                Intrinsics.checkNotNull(parent);
                uIViewOperationQueue.enqueueUpdateLayout(parent.getReactTag(), reactShadowNodeResolveShadowNode.getReactTag(), reactShadowNodeResolveShadowNode.getScreenX(), reactShadowNodeResolveShadowNode.getScreenY(), reactShadowNodeResolveShadowNode.getScreenWidth(), reactShadowNodeResolveShadowNode.getScreenHeight(), YogaDirection.INHERIT);
            }
        }
        viewLayoutQueued.remove(Integer.valueOf(i7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method viewOperationQueueMethod_delegate$lambda$1() throws NoSuchMethodException {
        int i7 = UIImplementation.f5334a;
        Method declaredMethod = UIImplementation.class.getDeclaredMethod("com.discord.react.utilities.getUIViewOperationQueue", null);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
