package com.discord.react.utilities;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u0000 \u001f*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H&¢\u0006\u0002\u0010\u0011J\u0015\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u000fH\u0004¢\u0006\u0002\u0010\u0012J1\u0010\r\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0004¢\u0006\u0002\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u001c*\u00028\u00002\u0006\u0010\u001d\u001a\u00020\fH\u0004¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/discord/react/utilities/InitialPropsViewGroupManager;", "T", "Landroid/view/ViewGroup;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "<init>", "()V", "delegatedInitialProps", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "consumedInitialProps", "", "", "", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "initialProps", "(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/facebook/react/uimanager/ReactStylesDiffMap;)Landroid/view/ViewGroup;", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/ViewGroup;", "reactTag", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "(ILcom/facebook/react/uimanager/ThemedReactContext;Lcom/facebook/react/uimanager/ReactStylesDiffMap;Lcom/facebook/react/uimanager/StateWrapper;)Landroid/view/ViewGroup;", "onDropViewInstance", "", "view", "(Landroid/view/ViewGroup;)V", "isInitialProp", "", "propName", "(Landroid/view/ViewGroup;Ljava/lang/String;)Z", "Companion", "react_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInitialPropsViewGroupManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitialPropsViewGroupManager.kt\ncom/discord/react/utilities/InitialPropsViewGroupManager\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,55:1\n384#2,7:56\n*S KotlinDebug\n*F\n+ 1 InitialPropsViewGroupManager.kt\ncom/discord/react/utilities/InitialPropsViewGroupManager\n*L\n41#1:56,7\n*E\n"})
public abstract class InitialPropsViewGroupManager<T extends ViewGroup> extends ViewGroupManager<T> {

    @NotNull
    private static final ReactStylesDiffMap defaultInitialProps = new ReactStylesDiffMap(NativeMapExtensionsKt.nativeMapOf(new Pair[0]));

    @NotNull
    private final Map<Integer, Set<String>> consumedInitialProps;

    @NotNull
    private ReactStylesDiffMap delegatedInitialProps;

    public InitialPropsViewGroupManager() {
        super(null, 1, null);
        this.delegatedInitialProps = defaultInitialProps;
        this.consumedInitialProps = new HashMap();
    }

    @NotNull
    public abstract T createViewInstance(@NotNull ThemedReactContext reactContext, @NotNull ReactStylesDiffMap initialProps);

    public final boolean isInitialProp(@NotNull T t5, @NotNull String propName) {
        Intrinsics.checkNotNullParameter(t5, "<this>");
        Intrinsics.checkNotNullParameter(propName, "propName");
        Map<Integer, Set<String>> map = this.consumedInitialProps;
        Integer numValueOf = Integer.valueOf(t5.getId());
        Set<String> linkedHashSet = map.get(numValueOf);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            map.put(numValueOf, linkedHashSet);
        }
        Set<String> set = linkedHashSet;
        if (set.contains(propName)) {
            return false;
        }
        set.add(propName);
        return true;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NotNull T view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onDropViewInstance(view);
        this.consumedInitialProps.remove(Integer.valueOf(view.getId()));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public final T createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return (T) createViewInstance(reactContext, this.delegatedInitialProps);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public final T createViewInstance(int reactTag, @NotNull ThemedReactContext reactContext, ReactStylesDiffMap initialProps, StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.delegatedInitialProps = initialProps == null ? this.delegatedInitialProps : initialProps;
        View viewCreateViewInstance = super.createViewInstance(reactTag, reactContext, initialProps, stateWrapper);
        Intrinsics.checkNotNullExpressionValue(viewCreateViewInstance, "createViewInstance(...)");
        return (T) viewCreateViewInstance;
    }
}
