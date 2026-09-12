package com.discord.react.utilities;

import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.NativeViewHierarchyOptimizer;
import com.facebook.react.uimanager.UIImplementation;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.UIViewOperationQueue;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a3\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\u000b\u001a0\u0010\u0011\u001a\u00028\u0001\"\n\b\u0000\u0010\r\u0018\u0001*\u00020\f\"\u0006\b\u0001\u0010\u000e\u0018\u0001*\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/bridge/ReactContext;", "", "tag", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "onError", "Landroid/view/View;", "findViewByReactTag", "(Lcom/facebook/react/bridge/ReactContext;ILkotlin/jvm/functions/Function1;)Landroid/view/View;", "(Lcom/facebook/react/bridge/ReactContext;I)Landroid/view/View;", "", "T", "V", "", StackTraceHelper.NAME_KEY, "getPrivateField", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "REACT_UPDATED_ERROR", "Ljava/lang/String;", "react_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFindViewByReactTag.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindViewByReactTag.kt\ncom/discord/react/utilities/FindViewByReactTagKt\n*L\n1#1,86:1\n69#1,4:87\n68#1,16:91\n69#1,4:107\n68#1,16:111\n69#1,4:127\n68#1,16:131\n*S KotlinDebug\n*F\n+ 1 FindViewByReactTag.kt\ncom/discord/react/utilities/FindViewByReactTagKt\n*L\n52#1:87,4\n52#1:91,16\n56#1:107,4\n56#1:111,16\n60#1:127,4\n60#1:131,16\n*E\n"})
public final class FindViewByReactTagKt {

    @NotNull
    private static final String REACT_UPDATED_ERROR = "\n        findViewByReactTag failed likely due to a changed React Native internal implementation\n        from a version bump, please inspect this method and update as needed.\n    ";

    public static final View findViewByReactTag(@NotNull ReactContext reactContext, int i7, @NotNull Function1<? super Exception, Unit> onError) {
        Intrinsics.checkNotNullParameter(reactContext, "<this>");
        Intrinsics.checkNotNullParameter(onError, "onError");
        try {
            return findViewByReactTag(reactContext, i7);
        } catch (IllegalViewOperationException e10) {
            onError.invoke(e10);
            Unit unit = Unit.f14616a;
            return null;
        } catch (Exception e11) {
            throw new IllegalStateException(REACT_UPDATED_ERROR, e11);
        }
    }

    private static final /* synthetic */ <T, V> V getPrivateField(T t5, String str) throws NoSuchFieldException {
        Class<? super Object> superclass = t5.getClass().getSuperclass();
        Intrinsics.reifiedOperationMarker(4, "T");
        Field declaredField = (superclass == Object.class ? t5.getClass().getSuperclass() : t5.getClass()).getDeclaredField(str);
        declaredField.setAccessible(true);
        V v6 = (V) declaredField.get(t5);
        Intrinsics.reifiedOperationMarker(3, "V");
        if (v6 != null) {
            return v6;
        }
        Intrinsics.reifiedOperationMarker(4, "V");
        throw new IllegalStateException(("Field " + v6 + " not instance of " + Object.class + ".").toString());
    }

    private static final View findViewByReactTag(ReactContext reactContext, int i7) throws IllegalAccessException, NoSuchFieldException {
        Class<?> superclass;
        Class<?> superclass2;
        UIManagerModule uIManagerModule = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            UIImplementation uIImplementation = uIManagerModule.getUIImplementation();
            if (uIImplementation != null) {
                if (uIImplementation.getClass().getSuperclass() == UIImplementation.class) {
                    superclass = uIImplementation.getClass().getSuperclass();
                } else {
                    superclass = uIImplementation.getClass();
                }
                Field declaredField = superclass.getDeclaredField("mNativeViewHierarchyOptimizer");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(uIImplementation);
                Class<? super NativeViewHierarchyOptimizer> cls = NativeViewHierarchyOptimizer.class;
                if (obj instanceof NativeViewHierarchyOptimizer) {
                    NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer = (NativeViewHierarchyOptimizer) obj;
                    Field declaredField2 = (cls.getSuperclass() == cls ? cls.getSuperclass() : NativeViewHierarchyOptimizer.class).getDeclaredField("mUIViewOperationQueue");
                    declaredField2.setAccessible(true);
                    Object obj2 = declaredField2.get(nativeViewHierarchyOptimizer);
                    if (obj2 instanceof UIViewOperationQueue) {
                        UIViewOperationQueue uIViewOperationQueue = (UIViewOperationQueue) obj2;
                        if (uIViewOperationQueue.getClass().getSuperclass() == UIViewOperationQueue.class) {
                            superclass2 = uIViewOperationQueue.getClass().getSuperclass();
                        } else {
                            superclass2 = uIViewOperationQueue.getClass();
                        }
                        Field declaredField3 = superclass2.getDeclaredField("mNativeViewHierarchyManager");
                        declaredField3.setAccessible(true);
                        Object obj3 = declaredField3.get(uIViewOperationQueue);
                        if (obj3 instanceof NativeViewHierarchyManager) {
                            return ((NativeViewHierarchyManager) obj3).resolveView(i7);
                        }
                        throw new IllegalStateException(("Field " + obj3 + " not instance of " + NativeViewHierarchyManager.class + ".").toString());
                    }
                    throw new IllegalStateException(("Field " + obj2 + " not instance of " + UIViewOperationQueue.class + ".").toString());
                }
                throw new IllegalStateException(("Field " + obj + " not instance of " + cls + ".").toString());
            }
            throw new IllegalStateException("Unable to resolve UIImplementation");
        }
        throw new IllegalStateException("Unable to resolve UIManagerModule");
    }
}
