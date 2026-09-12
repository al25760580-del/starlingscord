package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.touch.JSResponderHandler;
import com.facebook.react.touch.ReactInterceptingViewGroup;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.annotations.ReactPropertyHolder;
import com.facebook.yoga.YogaMeasureMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: loaded from: classes3.dex */
@ReactPropertyHolder
public abstract class ViewManager<T extends View, C extends ReactShadowNode> extends BaseJavaModule {
    private static final String TAG = "ViewManager";
    private ViewManagerDelegate<T> mDelegate;
    private Map<Integer, Stack<T>> mRecyclableViews;

    public ViewManager() {
        super(null);
        this.mDelegate = null;
        this.mRecyclableViews = null;
    }

    private ViewManagerDelegate<T> getOrCreateViewManagerDelegate() {
        ViewManagerDelegate<T> viewManagerDelegate = this.mDelegate;
        if (viewManagerDelegate != null) {
            return viewManagerDelegate;
        }
        ViewManagerDelegate<T> delegate = getDelegate();
        this.mDelegate = delegate;
        return delegate;
    }

    private Stack<T> getRecyclableViewStack(int i7, boolean z5) {
        Map<Integer, Stack<T>> map = this.mRecyclableViews;
        if (map == null) {
            return null;
        }
        if (z5 && !map.containsKey(Integer.valueOf(i7))) {
            this.mRecyclableViews.put(Integer.valueOf(i7), new Stack<>());
        }
        return this.mRecyclableViews.get(Integer.valueOf(i7));
    }

    public void addEventEmitters(@NonNull ThemedReactContext themedReactContext, @NonNull T t5) {
    }

    public C createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    @NonNull
    public T createView(int i7, @NonNull ThemedReactContext themedReactContext, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper, JSResponderHandler jSResponderHandler) {
        T t5 = (T) createViewInstance(i7, themedReactContext, reactStylesDiffMap, stateWrapper);
        if (t5 instanceof ReactInterceptingViewGroup) {
            ((ReactInterceptingViewGroup) t5).setOnInterceptTouchEventListener(jSResponderHandler);
        }
        return t5;
    }

    @NonNull
    public T createViewInstance(int i7, @NonNull ThemedReactContext themedReactContext, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper) {
        T t5;
        Object objUpdateState;
        Stack<T> recyclableViewStack = getRecyclableViewStack(themedReactContext.getSurfaceId(), true);
        if (recyclableViewStack == null || recyclableViewStack.empty()) {
            t5 = (T) createViewInstance(themedReactContext);
        } else {
            T tPop = recyclableViewStack.pop();
            if (ReactNativeFeatureFlags.enableViewRecycling() && tPop.getParent() != null) {
                ((ViewGroup) tPop.getParent()).removeView(tPop);
            }
            t5 = (T) recycleView(themedReactContext, tPop);
        }
        t5.setId(i7);
        addEventEmitters(themedReactContext, t5);
        if (reactStylesDiffMap != null) {
            updateProperties(t5, reactStylesDiffMap);
        }
        if (stateWrapper != null && (objUpdateState = updateState(t5, reactStylesDiffMap, stateWrapper)) != null) {
            updateExtraData(t5, objUpdateState);
        }
        return t5;
    }

    @NonNull
    public abstract T createViewInstance(@NonNull ThemedReactContext themedReactContext);

    @UnstableReactNativeAPI
    public boolean experimental_isPrefetchingEnabled() {
        return ReactNativeFeatureFlags.enableImagePrefetchingAndroid();
    }

    @UnstableReactNativeAPI
    public void experimental_prefetchResources(int i7, ThemedReactContext themedReactContext, MapBuffer mapBuffer) {
    }

    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    public ViewManagerDelegate<T> getDelegate() {
        if (this instanceof ViewManagerWithGeneratedInterface) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("ViewManager using codegen must override getDelegate method (name: " + getName() + ")."));
        }
        return new ViewManagerPropertyUpdater.GenericViewManagerDelegate(this);
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedViewConstants() {
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public abstract String getName();

    public Map<String, String> getNativeProps() {
        return (ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE && ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture()) ? ViewManagerPropertyUpdater.getNativeProps(getClass(), null) : ViewManagerPropertyUpdater.getNativeProps(getClass(), getShadowNodeClass());
    }

    public abstract Class<? extends C> getShadowNodeClass();

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f2, YogaMeasureMode yogaMeasureMode, float f7, YogaMeasureMode yogaMeasureMode2, float[] fArr) {
        return 0L;
    }

    public void onAfterUpdateTransaction(@NonNull T t5) {
    }

    public void onDropViewInstance(@NonNull T t5) {
        View viewPrepareToRecycleView;
        Context context = t5.getContext();
        if (context == null) {
            o8.a.g(TAG, "onDropViewInstance: view [" + t5.getId() + "] has a null context");
            return;
        }
        if (!(context instanceof ThemedReactContext)) {
            o8.a.g(TAG, "onDropViewInstance: view [" + t5.getId() + "] has a context that is not a ThemedReactContext: " + context);
            return;
        }
        ThemedReactContext themedReactContext = (ThemedReactContext) context;
        Stack<T> recyclableViewStack = getRecyclableViewStack(themedReactContext.getSurfaceId(), false);
        if (recyclableViewStack == null || (viewPrepareToRecycleView = prepareToRecycleView(themedReactContext, t5)) == null) {
            return;
        }
        recyclableViewStack.push(viewPrepareToRecycleView);
    }

    public void onSurfaceStopped(int i7) {
        Map<Integer, Stack<T>> map = this.mRecyclableViews;
        if (map != null) {
            map.remove(Integer.valueOf(i7));
        }
    }

    public abstract T prepareToRecycleView(@NonNull ThemedReactContext themedReactContext, @NonNull T t5);

    @Deprecated
    public void receiveCommand(@NonNull T t5, int i7, ReadableArray readableArray) {
    }

    public T recycleView(@NonNull ThemedReactContext themedReactContext, @NonNull T t5) {
        return t5;
    }

    public void setPadding(T t5, int i7, int i10, int i11, int i12) {
    }

    public void setupViewRecycling() {
        if (ReactNativeFeatureFlags.enableViewRecycling()) {
            this.mRecyclableViews = new HashMap();
        }
    }

    public void trimMemory() {
        if (this.mRecyclableViews != null) {
            this.mRecyclableViews = new HashMap();
        }
    }

    public abstract void updateExtraData(@NonNull T t5, Object obj);

    public void updateProperties(@NonNull T t5, ReactStylesDiffMap reactStylesDiffMap) {
        ViewManagerDelegate<T> orCreateViewManagerDelegate = getOrCreateViewManagerDelegate();
        Iterator<Map.Entry<String, Object>> entryIterator = reactStylesDiffMap.getBackingMap().getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            orCreateViewManagerDelegate.kotlinCompat$setProperty(t5, next.getKey(), next.getValue());
        }
        onAfterUpdateTransaction(t5);
    }

    public Object updateState(@NonNull T t5, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper) {
        return null;
    }

    @NonNull
    public C createShadowNodeInstance(@NonNull ReactApplicationContext reactApplicationContext) {
        return (C) createShadowNodeInstance();
    }

    public void receiveCommand(@NonNull T t5, String str, ReadableArray readableArray) {
        getOrCreateViewManagerDelegate().kotlinCompat$receiveCommand(t5, str, readableArray);
    }

    public ViewManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mDelegate = null;
        this.mRecyclableViews = null;
    }
}
